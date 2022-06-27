
package com.android.tools.build.bundletool.model.utils.xmlproto;


import com.android.aapt.XmlElement;
import com.android.aapt.XmlNode;


/** Wrapper around the {@link XmlNode} proto, providing a fluent API. */

public final class XmlProtoNode
    extends XmlProtoNodeOrBuilder<XmlElement, XmlProtoElement, XmlNode> {

  private final XmlNode node;

  public XmlProtoNode(XmlNode node) {
    this.node = checkNotNull(node);
  }

  public static XmlProtoNode createElementNode(XmlProtoElement element) {
    return new XmlProtoNode(XmlNode.newBuilder().setElement(element.getProto()).build());
  }

  public static XmlProtoNode createTextNode(String text) {
    return new XmlProtoNode(XmlNode.newBuilder().setText(text).build());
  }

  public XmlProtoNodeBuilder toBuilder() {
    return new XmlProtoNodeBuilder(node.toBuilder());
  }

  @Override
  public XmlNode getProto() {
    return node;
  }

  @Override
  protected XmlElement getProtoElement() {
    return node.getElement();
  }

  @Override
  protected XmlProtoElement newElement(XmlElement element) {
    return new XmlProtoElement(element);
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof XmlProtoNode)) {
      return false;
    }
    return node.equals(((XmlProtoNode) o).getProto());
  }

  @Override
  public int hashCode() {
    return node.hashCode();
  }

  public static <T> T checkNotNull(T reference) {
    if (reference == null) {
      throw new NullPointerException();
    } else {
      return reference;
    }
  }
}
