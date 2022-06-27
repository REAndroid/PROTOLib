
package com.android.tools.build.bundletool.model.utils.xmlproto;

import com.android.aapt.XmlElementOrBuilder;
import com.android.aapt.XmlNode.NodeCase;
import com.android.aapt.XmlNodeOrBuilder;

/**
 * Internal interface ensuring that {@link XmlProtoNode} and {@link XmlProtoNodeBuilder} have the
 * same getters.
 */
abstract class XmlProtoNodeOrBuilder<
    ElementProtoT extends XmlElementOrBuilder,
    ElementWrapperT extends
        XmlProtoElementOrBuilder<NodeProtoT, ?, ElementProtoT, ElementWrapperT, ?, ?>,
    NodeProtoT extends XmlNodeOrBuilder> {

  protected abstract NodeProtoT getProto();

  protected abstract ElementProtoT getProtoElement();

  protected abstract ElementWrapperT newElement(ElementProtoT element);

  public final boolean isElement() {
    return getProto().getNodeCase().equals(NodeCase.ELEMENT);
  }

  public final boolean isText() {
    return getProto().getNodeCase().equals(NodeCase.TEXT);
  }

  public final ElementWrapperT getElement() {
    if (!isElement()) {
      throw new XmlProtoException(
          "Expected node of type 'element' but found: %s", getProto().getNodeCase());
    }
    return newElement(getProtoElement());
  }

  public final String getText() {
    if (!isText()) {
      throw new XmlProtoException(
          "Expected node of type 'text' but found: %s", getProto().getNodeCase());
    }
    return getProto().getText();
  }

  @Override
  public String toString() {
    return getProto().toString();
  }
}
