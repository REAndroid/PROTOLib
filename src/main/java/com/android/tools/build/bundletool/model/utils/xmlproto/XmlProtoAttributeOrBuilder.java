
package com.android.tools.build.bundletool.model.utils.xmlproto;

import com.android.aapt.Item.ValueCase;
import com.android.aapt.Primitive;
import com.android.aapt.Primitive.OneofValueCase;
import com.android.aapt.XmlAttributeOrBuilder;

/** Common methods between {@link XmlProtoAttribute} and {@link XmlProtoAttributeBuilder}. */
abstract class XmlProtoAttributeOrBuilder<AttributeProtoT extends XmlAttributeOrBuilder> {

  abstract AttributeProtoT getProto();

  public final String getName() {
    return getProto().getName();
  }

  public final String getNamespaceUri() {
    return getProto().getNamespaceUri();
  }

  public final int getResourceId() {
    return getProto().getResourceId();
  }

  public final String getValueAsString() {
    if (getProto().getCompiledItem().getValueCase().equals(ValueCase.STR)) {
      return getProto().getCompiledItem().getStr().getValue();
    }

    // aapt2 sometimes doesn't put the value in the compiled item, so we also read this.
    return getProto().getValue();
  }

  public final boolean getValueAsBoolean() {
    Primitive primitive = getProto().getCompiledItem().getPrim();
    if (!primitive.getOneofValueCase().equals(OneofValueCase.BOOLEAN_VALUE)) {
      throw new UnexpectedAttributeTypeException(getProto(), /* expectedType= */ "boolean");
    }
    return primitive.getBooleanValue();
  }

  public final int getValueAsRefId() {
    if (!hasRefIdValue()) {
      throw new UnexpectedAttributeTypeException(getProto(), /* expectedType= */ "reference");
    }
    return getProto().getCompiledItem().getRef().getId();
  }

  public final int getValueAsDecimalInteger() {
    Primitive primitive = getProto().getCompiledItem().getPrim();
    if (!primitive.getOneofValueCase().equals(OneofValueCase.INT_DECIMAL_VALUE)) {
      throw new UnexpectedAttributeTypeException(getProto(), /* expectedType= */ "decimal int");
    }
    return primitive.getIntDecimalValue();
  }

  public final int getValueAsHexInteger() {
    Primitive primitive = getProto().getCompiledItem().getPrim();
    if (!primitive.getOneofValueCase().equals(OneofValueCase.INT_HEXADECIMAL_VALUE)) {
      throw new UnexpectedAttributeTypeException(getProto(), /* expectedType= */ "hexadecimal int");
    }
    return primitive.getIntHexadecimalValue();
  }

  /** Returns integer value either from decimal or hexadecimal integer. */
  public final int getValueAsInteger() {
    Primitive primitive = getProto().getCompiledItem().getPrim();
    switch (primitive.getOneofValueCase()) {
      case INT_DECIMAL_VALUE:
        return primitive.getIntDecimalValue();
      case INT_HEXADECIMAL_VALUE:
        return primitive.getIntHexadecimalValue();
      default:
        throw new UnexpectedAttributeTypeException(
            getProto(), /* expectedType= */ "decimal|hexadecimal int");
    }
  }

  /**
   * Returns the value of the attribute as a string regardless of its type.
   *
   * <p>When not a string, the conversion is done on a best-effort basis, and may change in the
   * future.
   */
  public final String getDebugString() {
    if (!getProto().hasCompiledItem()) {
      return getProto().getValue();
    }

    return XmlProtoPrintUtils.getItemValueAsString(getProto().getCompiledItem());
  }

  public final boolean hasStringValue() {
    return getProto().getCompiledItem().getValueCase().equals(ValueCase.STR)
        || !getProto().getValue().isEmpty();
  }

  public final boolean hasRefIdValue() {
    return getProto().getCompiledItem().getValueCase().equals(ValueCase.REF);
  }

  @Override
  public String toString() {
    return getProto().toString();
  }
}
