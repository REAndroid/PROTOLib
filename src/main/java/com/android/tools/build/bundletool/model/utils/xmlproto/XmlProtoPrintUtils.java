
package com.android.tools.build.bundletool.model.utils.xmlproto;

import static java.util.Comparator.reverseOrder;
import static java.util.stream.Collectors.joining;

import com.android.aapt.CompoundValue;
import com.android.aapt.Item;
import com.android.aapt.Primitive;
import com.android.aapt.Reference;
import com.android.aapt.Reference.Type;
import com.android.aapt.StyledString;
import com.android.aapt.Value;

import java.util.*;
import java.util.stream.Stream;

/** Utility class to print debug values from the proto XML. */
public final class XmlProtoPrintUtils {

  public static String getValueAsString(Value value) {
    switch (value.getValueCase()) {
      case ITEM:
        return getItemValueAsQuotedString(value.getItem());
      case COMPOUND_VALUE:
        return getCompoundValueAsString(value.getCompoundValue());
      default:
        // Not supported.
        return "";
    }
  }

  public static String getCompoundValueAsString(CompoundValue compoundValue) {
    switch (compoundValue.getValueCase()) {
      case ATTR:
        return compoundValue.getAttr().getSymbolList().stream()
            .map(symbol -> symbol.getName().getName() + "=" + symbol.getValue())
            .collect(joining(", ", "{", "}"));
      case ARRAY:
        return compoundValue.getArray().getElementList().stream()
            .map(element -> getItemValueAsQuotedString(element.getItem()))
            .collect(joining(", ", "[", "]"));
      case PLURAL:
        return compoundValue.getPlural().getEntryList().stream()
            .map(entry -> entry.getArity() + "=" + getItemValueAsQuotedString(entry.getItem()))
            .collect(joining(", ", "{", "}"));
      case STYLE:
        return compoundValue.getStyle().getEntryList().stream()
            .map(entry -> getItemValueAsQuotedString(entry.getItem()))
            .collect(joining(", ", "[", "]"));
      case STYLEABLE:
        return compoundValue.getStyleable().getEntryList().stream()
            .map(entry -> getRefAsString(entry.getAttr()))
            .collect(joining(", ", "[", "]"));
      default:
        // Not supported
        return "";
    }
  }

  
  static String getRefAsString(Reference ref) {
    // Return the name of the resource if available, else the ID.
    if (!ref.getName().isEmpty()) {
      return (ref.getType().equals(Type.REFERENCE) ? "@" : "?") + ref.getName();
    }
    return String.format("0x%08x", ref.getId());
  }

  /** Returns the type of an {@link Item} as a string regardless of its type. */
  public static String getValueTypeAsString(Value value) {
    switch (value.getValueCase()) {
      case ITEM:
        Item item = value.getItem();
        switch (item.getValueCase()) {
          case PRIM:
            return item.getPrim().getOneofValueCase().toString().replace("_VALUE", "");
          default:
            return item.getValueCase().toString();
        }
      case COMPOUND_VALUE:
        return value.getCompoundValue().getValueCase().toString();
      default:
        // Not supported.
        return "";
    }
  }

  /**
   * Returns the value of an {@link Item} as a string regardless of its type.
   *
   * <p>When not a string, the conversion is done on a best-effort basis, and may change in the
   * future.
   */
  public static String getItemValueAsString(Item item) {
    switch (item.getValueCase()) {
      case PRIM:
        return getPrimitiveValueAsString(item.getPrim());
      case FILE:
        return item.getFile().getPath();
      case ID:
        return "<ID>";
      case RAW_STR:
        return item.getRawStr().getValue();
      case REF:
        return getRefAsString(item.getRef());
      case STR:
        return item.getStr().getValue();
      case STYLED_STR:
        return processStyledString(item.getStyledStr());
      default:
        // Not supported.
        return "";
    }
  }

  /**
   * Same as {@link #getItemValueAsString(Item)} but escapes the strings and puts them in quotes.
   */
  public static String getItemValueAsQuotedString(Item item) {
    switch (item.getValueCase()) {
      case STR:
      case STYLED_STR:
      case RAW_STR:
        return "\"" + escapeString(getItemValueAsString(item)) + "\"";
      default:
        return getItemValueAsString(item);
    }
  }

  /**
   * Returns the value of an {@link Primitive} as a string regardless of its type.
   *
   * <p>When not a string, the conversion is done on a best-effort basis, and may change in the
   * future.
   */
  public static String getPrimitiveValueAsString(Primitive primitive) {
    switch (primitive.getOneofValueCase()) {
      case NULL_VALUE:
      case EMPTY_VALUE:
        return "";
      case FLOAT_VALUE:
        return Float.toString(primitive.getFloatValue());
      case DIMENSION_VALUE:
        return String.valueOf(primitive.getDimensionValue());
      case FRACTION_VALUE:
        return String.valueOf(primitive.getFractionValue());
      case INT_DECIMAL_VALUE:
        return Integer.toString(primitive.getIntDecimalValue());
      case INT_HEXADECIMAL_VALUE:
        return String.format("0x%08x", primitive.getIntHexadecimalValue());
      case BOOLEAN_VALUE:
        return Boolean.toString(primitive.getBooleanValue());
      case COLOR_ARGB8_VALUE:
        return String.format("#%08x", primitive.getColorArgb8Value());
      case COLOR_RGB8_VALUE:
        // We clear the transparency bits since they're not displayed for an RGB value.
        return String.format("#%06x", primitive.getColorRgb8Value() & 0x00FFFFFF);
      case COLOR_ARGB4_VALUE:
        return String.format("#%08x", primitive.getColorArgb4Value());
      case COLOR_RGB4_VALUE:
        // We clear the transparency bits since they're not displayed for an RGB value.
        return String.format("#%06x", primitive.getColorRgb4Value() & 0x00FFFFFF);
      case FRACTION_VALUE_DEPRECATED:
      case DIMENSION_VALUE_DEPRECATED:
      case ONEOFVALUE_NOT_SET:
    }
    return "";
  }

  
  static String processStyledString(StyledString styledString) {
    StringBuilder string = new StringBuilder(styledString.getValue());
    styledString.getSpanList().stream()
        .flatMap(
            span ->
                Stream.of(
                    // "+ 1" because the last char is included.
                    new Tag(
                        span.getTag(), Tag.Type.OPEN, span.getFirstChar(), span.getLastChar() + 1),
                    // "+ 1" because the last char is included.
                    new Tag(
                        span.getTag(),
                        Tag.Type.CLOSE,
                        span.getLastChar() + 1,
                        span.getFirstChar())))
        // So we can edit the string in place, we need to start from the end.
        .sorted(reverseOrder())
        .forEach(tag -> string.insert(tag.position, tag.toString()));
    return string.toString();
  }

  private static class Tag implements Comparable<Tag> {
    private static final List<String>  ATTRIBUTES_SPLITTER =loadSeparators();

    private final String tag;
    private final Type type;
    private final int position;
    private final int matchingTagPosition;

    Tag(String tag, Type type, int position, int matchingTagPosition) {
      this.tag = tag;
      this.type = type;
      this.position = position;
      this.matchingTagPosition = matchingTagPosition;
    }
    private static List<String> loadSeparators(){
      List<String> results=new ArrayList<>();
      results.add("=");
      return results;
    }

    @Override
    public int compareTo(Tag o) {
      return 0;
    }

    @Override
    public String toString() {
      // "tag" can either be just the tag or have the form "tag;attr1=value1;attr2=value2;[...]".
      int separatorIdx = tag.indexOf(';');
      String actualTag = separatorIdx == -1 ? tag : tag.substring(0, separatorIdx);

      switch (type) {
        case OPEN:
          if (separatorIdx != -1) {
            StringJoiner attributes = new StringJoiner(" ");
            return String.format("<%s %s>", actualTag, attributes);
          }
          return String.format("<%s>", actualTag);
        case CLOSE:
          return String.format("</%s>", actualTag);
      }
      throw new IllegalStateException();
    }

    private enum Type {
      OPEN,
      CLOSE
    }
  }

  private static String escapeString(String s) {
    return s.replace("\\", "\\\\") // Do this one first since the ones below add more backslashes!
        .replace("\"", "\\\"")
        .replace("\n", "\\n")
        .replace("\r", "\\r")
        // Line tabulation
        .replace("\u000B", "\\u000B")
        // Form feed
        .replace("\u000C", "\\u000C")
        // Next line
        .replace("\u0085", "\\u0085")
        // Line separator
        .replace("\u2028", "\\u2028")
        // Paragraph separator
        .replace("\u2029", "\\u2029");
  }

  private XmlProtoPrintUtils() {}


}
