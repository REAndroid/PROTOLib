
package com.android.tools.build.bundletool.model.utils.xmlproto;


import com.android.aapt.*;

/** Wrapper around the {@link XmlAttribute.Builder} proto, providing a fluent API. */
public final class XmlProtoAttributeBuilder
    extends XmlProtoAttributeOrBuilder<XmlAttribute.Builder> {

  private final XmlAttribute.Builder attribute;

  XmlProtoAttributeBuilder(XmlAttribute.Builder attribute) {
    this.attribute = XmlProtoUtil.checkNotNull(attribute);
  }

  /** Creates a new {@link XmlProtoAttributeBuilder} without value. */
  public static XmlProtoAttributeBuilder create(String namespaceUri, String name) {
    return new XmlProtoAttributeBuilder(
        XmlAttribute.newBuilder().setName(name).setNamespaceUri(namespaceUri));
  }

  /** Same as {@link #create(String, String)} without namespace. */
  public static XmlProtoAttributeBuilder create(String name) {
    return create(XmlProtoUtil.NO_NAMESPACE_URI, name);
  }

  public static XmlProtoAttributeBuilder createAndroidAttribute(String name, int attributeResId) {
    return new XmlProtoAttributeBuilder(
        XmlAttribute.newBuilder()
            .setName(name)
            .setNamespaceUri(XmlProtoUtil.ANDROID_NAMESPACE_URI)
            .setResourceId(attributeResId));
  }

  @Override
  public XmlAttribute.Builder getProto() {
    return attribute;
  }

  public XmlProtoAttribute build() {
    return new XmlProtoAttribute(attribute.build());
  }

  public XmlProtoAttributeBuilder setValueAsBoolean(boolean value) {
    attribute.clearValue();
    attribute.setCompiledItem(
        Item.newBuilder().setPrim(Primitive.newBuilder().setBooleanValue(value)));
    return this;
  }

  public XmlProtoAttributeBuilder setValueAsRefId(int refId) {
    attribute.clearValue();
    attribute.setCompiledItem(Item.newBuilder().setRef(Reference.newBuilder().setId(refId)));
    return this;
  }

  public XmlProtoAttributeBuilder setValueAsRefId(int refId, String name) {
    attribute.clearValue();
    attribute.setCompiledItem(
        Item.newBuilder().setRef(Reference.newBuilder().setId(refId).setName(name)));
    return this;
  }

  public XmlProtoAttributeBuilder setValueAsDecimalInteger(int value) {
    attribute.setValue(String.valueOf(value));
    attribute.setCompiledItem(
        Item.newBuilder().setPrim(Primitive.newBuilder().setIntDecimalValue(value)));
    return this;
  }

  public XmlProtoAttributeBuilder setValueAsHexInteger(int value) {
    attribute.setValue(String.format("0x%08x", value));
    attribute.setCompiledItem(
        Item.newBuilder().setPrim(Primitive.newBuilder().setIntHexadecimalValue(value)));
    return this;
  }

  public XmlProtoAttributeBuilder setValueAsString(String value) {
    attribute.setValue(value);
    attribute.setCompiledItem(
        Item.newBuilder().setStr(PBString.newBuilder().setValue(value)));
    return this;
  }

  public XmlProtoAttributeBuilder setResourceId(int resourceId) {
    attribute.setResourceId(resourceId);
    return this;
  }
}
