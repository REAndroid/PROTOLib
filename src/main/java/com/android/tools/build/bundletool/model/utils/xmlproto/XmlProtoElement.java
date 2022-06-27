
package com.android.tools.build.bundletool.model.utils.xmlproto;

import com.android.aapt.XmlAttribute;
import com.android.aapt.XmlElement;
import com.android.aapt.XmlNode;

import java.util.List;

/** Wrapper around the {@link XmlElement} proto, providing a fluent API. */

public final class XmlProtoElement
    extends XmlProtoElementOrBuilder<
        XmlNode, XmlProtoNode, XmlElement, XmlProtoElement, XmlAttribute, XmlProtoAttribute> {

  private final XmlElement element;

  public static XmlProtoElement create(String namespaceUri, String name) {
    return new XmlProtoElement(
        XmlElement.newBuilder().setNamespaceUri(namespaceUri).setName(name).build());
  }

  public static XmlProtoElement create(String name) {
    return create(XmlProtoUtil.NO_NAMESPACE_URI, name);
  }

  public XmlProtoElement(XmlElement element) {
    this.element = XmlProtoUtil.checkNotNull(element);
  }

  public XmlProtoElementBuilder toBuilder() {
    return new XmlProtoElementBuilder(element.toBuilder());
  }

  @Override
  public XmlElement getProto() {
    return element;
  }

  @Override
  protected List<XmlAttribute> getProtoAttributesList() {
    return element.getAttributeList();
  }

  @Override
  protected List<XmlNode> getProtoChildrenList() {
    return element.getChildList();
  }

  @Override
  protected XmlProtoNode newNode(XmlNode node) {
    return new XmlProtoNode(node);
  }

  @Override
  protected XmlProtoAttribute newAttribute(XmlAttribute attribute) {
    return new XmlProtoAttribute(attribute);
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof XmlProtoElement)) {
      return false;
    }
    return element.equals(((XmlProtoElement) o).getProto());
  }

  @Override
  public int hashCode() {
    return element.hashCode();
  }


}
