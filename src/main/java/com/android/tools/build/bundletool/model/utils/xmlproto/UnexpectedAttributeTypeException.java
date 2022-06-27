
package com.android.tools.build.bundletool.model.utils.xmlproto;

import com.android.aapt.XmlAttributeOrBuilder;

/** Exception thrown when an XML attribute is of an unexpected type. */
public class UnexpectedAttributeTypeException extends XmlProtoException {
  private final XmlAttributeOrBuilder attribute;
  private final String expectedType;

  UnexpectedAttributeTypeException(XmlAttributeOrBuilder attribute, String expectedType) {
    super(
        "Attribute '%s' expected to have type '%s' but found:\n %s",
        attribute.getName(), expectedType, attribute);
    this.attribute = attribute;
    this.expectedType = expectedType;
  }

  public XmlAttributeOrBuilder getAttribute() {
    return attribute;
  }

  public String getExpectedType() {
    return expectedType;
  }
}
