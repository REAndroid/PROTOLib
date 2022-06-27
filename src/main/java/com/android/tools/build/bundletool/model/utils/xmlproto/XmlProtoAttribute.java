
package com.android.tools.build.bundletool.model.utils.xmlproto;


import com.android.aapt.XmlAttribute;


/** Wrapper around the {@link XmlAttribute} proto, providing a fluent API. */

public final class XmlProtoAttribute extends XmlProtoAttributeOrBuilder<XmlAttribute> {

  private final XmlAttribute attribute;

  XmlProtoAttribute(XmlAttribute attribute) {
    this.attribute = XmlProtoUtil.checkNotNull(attribute);
  }

  /** Creates a new {@link XmlProtoAttribute} without value. */
  public static XmlProtoAttribute create(String namespaceUri, String name) {
    return new XmlProtoAttribute(
        XmlAttribute.newBuilder().setName(name).setNamespaceUri(namespaceUri).build());
  }

  /** Same as {@link #create(String, String)} without namespace. */
  public static XmlProtoAttribute create(String name) {
    return create(XmlProtoUtil.NO_NAMESPACE_URI, name);
  }

  public static XmlProtoAttribute createAndroidAttribute(String name, int attributeResId) {
    return new XmlProtoAttribute(
        XmlAttribute.newBuilder()
            .setName(name)
            .setNamespaceUri(XmlProtoUtil.ANDROID_NAMESPACE_URI)
            .setResourceId(attributeResId)
            .build());
  }

  @Override
  public XmlAttribute getProto() {
    return attribute;
  }

  public XmlProtoAttributeBuilder toBuilder() {
    return new XmlProtoAttributeBuilder(attribute.toBuilder());
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof XmlProtoAttribute)) {
      return false;
    }
    return attribute.equals(((XmlProtoAttribute) o).getProto());
  }

  @Override
  public int hashCode() {
    return attribute.hashCode();
  }
}
