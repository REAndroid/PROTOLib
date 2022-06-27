
package com.android.tools.build.bundletool.model.utils.xmlproto;


import com.android.aapt.XmlElement;
import com.android.aapt.XmlNode;

/** Wrapper around the {@link XmlNode.Builder} proto, providing a fluent API. */
public final class XmlProtoNodeBuilder
    extends XmlProtoNodeOrBuilder<XmlElement.Builder, XmlProtoElementBuilder, XmlNode.Builder> {

  private final XmlNode.Builder node;

  public XmlProtoNodeBuilder(XmlNode.Builder node) {
    this.node = XmlProtoUtil.checkNotNull(node);
  }

  public static XmlProtoNodeBuilder createElementNode(XmlProtoElementBuilder element) {
    return new XmlProtoNodeBuilder(XmlNode.newBuilder().setElement(element.getProto()));
  }

  public static XmlProtoNodeBuilder createTextNode(String text) {
    return new XmlProtoNodeBuilder(XmlNode.newBuilder().setText(text));
  }

  @Override
  public XmlNode.Builder getProto() {
    return node;
  }

  public XmlProtoNode build() {
    return new XmlProtoNode(node.build());
  }

  @Override
  protected XmlElement.Builder getProtoElement() {
    return node.getElementBuilder();
  }

  @Override
  protected XmlProtoElementBuilder newElement(XmlElement.Builder element) {
    return new XmlProtoElementBuilder(element);
  }

  public XmlProtoNodeBuilder setElement(XmlProtoElementBuilder newElement) {
    node.setElement(newElement.getProto());
    return this;
  }

  public XmlProtoNodeBuilder setText(String newText) {
    node.setText(newText);
    return this;
  }
}
