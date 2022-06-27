
package com.android.tools.build.bundletool.model.utils.xmlproto;


import com.android.aapt.XmlAttribute;
import com.android.aapt.XmlElement;
import com.android.aapt.XmlNamespace;
import com.android.aapt.XmlNode;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;

public final class XmlProtoElementBuilder
    extends XmlProtoElementOrBuilder<
        XmlNode.Builder,
        XmlProtoNodeBuilder,
        XmlElement.Builder,
        XmlProtoElementBuilder,
        XmlAttribute.Builder,
        XmlProtoAttributeBuilder> {

  private final XmlElement.Builder element;

  public static XmlProtoElementBuilder create(String namespaceUri, String name) {
    return new XmlProtoElementBuilder(
        XmlElement.newBuilder().setNamespaceUri(namespaceUri).setName(name));
  }

  public static XmlProtoElementBuilder create(String name) {
    return create(XmlProtoUtil.NO_NAMESPACE_URI, name);
  }

  public XmlProtoElementBuilder(XmlElement.Builder element) {
    this.element = XmlProtoUtil.checkNotNull(element);
  }

  public XmlProtoElement build() {
    return new XmlProtoElement(element.build());
  }

  @Override
  public XmlElement.Builder getProto() {
    return element;
  }

  @Override
  protected List<XmlAttribute.Builder> getProtoAttributesList() {
    return element.getAttributeBuilderList();
  }

  @Override
  protected List<XmlNode.Builder> getProtoChildrenList() {
    return element.getChildBuilderList();
  }

  @Override
  protected XmlProtoNodeBuilder newNode(XmlNode.Builder node) {
    return new XmlProtoNodeBuilder(node);
  }

  @Override
  protected XmlProtoAttributeBuilder newAttribute(XmlAttribute.Builder attribute) {
    return new XmlProtoAttributeBuilder(attribute);
  }

  public XmlProtoElementBuilder addAttribute(XmlProtoAttributeBuilder newAttribute) {
    element.addAttribute(newAttribute.getProto());
    return this;
  }

  /**
   * Returns the attribute with the given name and empty namespace URI, or create it if not found.
   */
  public XmlProtoAttributeBuilder getOrCreateAttribute(String name) {
    return getOrCreateAttribute(XmlProtoUtil.NO_NAMESPACE_URI, name);
  }

  /** Returns the attribute with the given name and namespace URI, or create it if not found. */
  public XmlProtoAttributeBuilder getOrCreateAttribute(String namespaceUri, String name) {
    return getOrCreateAttributeInternal(
        /* attributePredicate= */ attr ->
            attr.getName().equals(name) && attr.getNamespaceUri().equals(namespaceUri),
        /* attributeFactory= */ () ->
            XmlAttribute.newBuilder().setName(name).setNamespaceUri(namespaceUri));
  }

  /**
   * Returns the Android attribute with the given name and resource ID, or create it if not found.
   */
  public XmlProtoAttributeBuilder getOrCreateAndroidAttribute(String name, int resourceId) {
    return getOrCreateAttributeInternal(
        /* attributePredicate= */ attr ->
            attr.getName().equals(name)
                && attr.getNamespaceUri().equals(XmlProtoUtil.ANDROID_NAMESPACE_URI)
                && attr.getResourceId() == resourceId,
        /* attributeFactory= */ () ->
            XmlAttribute.newBuilder()
                .setName(name)
                .setNamespaceUri(XmlProtoUtil.ANDROID_NAMESPACE_URI)
                .setResourceId(resourceId));
  }

  private XmlProtoAttributeBuilder getOrCreateAttributeInternal(
      Predicate<XmlProtoAttributeOrBuilder<?>> attributePredicate,
      Supplier<XmlAttribute.Builder> attributeFactory) {
    return getAttributes()
        .filter(attributePredicate)
        .findFirst()
        .orElseGet(
            () -> {
              element.addAttribute(attributeFactory.get());
              return new XmlProtoAttributeBuilder(
                  element.getAttributeBuilder(element.getAttributeCount() - 1));
            });
  }

  public XmlProtoElementBuilder removeSourceDataRecursive() {
    removeSourceDataRecursiveInternal(getProto());
    return this;
  }

  private static void removeSourceDataRecursiveInternal(XmlElement.Builder builder) {
    builder.getAttributeBuilderList().forEach(XmlAttribute.Builder::clearSource);
    builder.getNamespaceDeclarationBuilderList().forEach(XmlNamespace.Builder::clearSource);
    builder
        .getChildBuilderList()
        .forEach(
            child -> {
              child.clearSource();
              if (child.hasElement()) {
                removeSourceDataRecursiveInternal(child.getElementBuilder());
              }
            });
  }

  public XmlProtoElementBuilder removeAttribute(String namespaceUri, String name) {
    return removeAttributeInternal(
        attribute ->
            attribute.getName().equals(name) && attribute.getNamespaceUri().equals(namespaceUri));
  }

  public XmlProtoElementBuilder removeAndroidAttribute(int resourceId) {
    return removeAttributeInternal(
        attribute ->
            attribute.getResourceId() == resourceId
                && attribute.getNamespaceUri().equals(XmlProtoUtil.ANDROID_NAMESPACE_URI));
  }

  private XmlProtoElementBuilder removeAttributeInternal(
      Predicate<XmlAttribute> attributePredicate) {
    for (int i = 0; i < element.getAttributeCount(); i++) {
      if (attributePredicate.test(element.getAttribute(i))) {
        element.removeAttribute(i);
        break;
      }
    }
    return this;
  }

  /** Same as {@link #getOrCreateChildElement(String, String)} with an empty namespace. */
  public XmlProtoElementBuilder getOrCreateChildElement(String name) {
    return getOrCreateChildElement(XmlProtoUtil.NO_NAMESPACE_URI, name);
  }

  /**
   * Finds the child element with the given name and namespace URI, or creates it if not found.
   *
   * @return the created element.
   */
  public XmlProtoElementBuilder getOrCreateChildElement(String namespaceUri, String name) {
    return getOptionalChildElement(namespaceUri, name)
        .orElseGet(
            () -> {
              element.addChild(
                  XmlNode.newBuilder()
                      .setElement(
                          XmlElement.newBuilder().setName(name).setNamespaceUri(namespaceUri)));
              return new XmlProtoElementBuilder(
                  element.getChildBuilder(element.getChildCount() - 1).getElementBuilder());
            });
  }

  /**
   * Adds a new child element to the this element.
   *
   * @return this element.
   */
  public XmlProtoElementBuilder addChildElement(XmlProtoElementBuilder newElement) {
    element.addChild(XmlNode.newBuilder().setElement(newElement.getProto()));
    return this;
  }

  /**
   * Adds a new child text to this element.
   *
   * @return this element.
   */
  public XmlProtoElementBuilder addChildText(String text) {
    element.addChild(XmlNode.newBuilder().setText(text));
    return this;
  }

  public XmlProtoElementBuilder addNamespaceDeclaration(String prefix, String uri) {
    element.addNamespaceDeclaration(XmlNamespace.newBuilder().setPrefix(prefix).setUri(uri));
    return this;
  }

  /** Removes XML elements among the direct children that satisfies the given predicate. */
  public XmlProtoElementBuilder removeChildrenElementsIf(Predicate<XmlProtoNodeBuilder> filter) {
    Stream<XmlProtoNodeBuilder> children = getChildren();
    children=children.filter(filter.negate());
    Stream<XmlNode> xmlNodeStream = children.map(new Function<XmlProtoNodeBuilder, XmlNode>() {
      @Override
      public XmlNode apply(XmlProtoNodeBuilder builder) {
        return builder.build().getProto();
      }
    });
    List<XmlNode> keptChildren = new ArrayList<>();
    Object[] allItem = xmlNodeStream.toArray();
    for(Object obj:allItem){
      keptChildren.add((XmlNode) obj);
    }
    if (getProtoChildrenList().size() != keptChildren.size()) {
      element.clearChild().addAllChild(keptChildren);
    }
    return this;
  }

  public XmlProtoElementBuilder modifyChildElements(Function<XmlProtoNodeBuilder, XmlProtoNodeBuilder> mapper) {

    Stream<XmlProtoNodeBuilder> children =getChildren();
    children=children.map(mapper);
    Stream<XmlNode> xmlNodeStream = children.map(new Function<XmlProtoNodeBuilder, XmlNode>() {
      @Override
      public XmlNode apply(XmlProtoNodeBuilder builder) {
        return builder.build().getProto();
      }
    });
    List<XmlNode> modifiedElements=streamToList(xmlNodeStream);
    element.clearChild().addAllChild(modifiedElements);
    return this;
  }
  private static <T> List<T> streamToList(Stream<T> inputs){
    List<T> results=new ArrayList<>();
    Object[] allItem = inputs.toArray();
    for(Object obj:allItem){
      results.add((T) obj);
    }
    return results;
  }
}
