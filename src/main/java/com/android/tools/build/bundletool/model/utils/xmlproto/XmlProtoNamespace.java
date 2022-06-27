
package com.android.tools.build.bundletool.model.utils.xmlproto;

import com.android.aapt.XmlNamespace;


/** Wrapper around the {@link XmlNamespace} proto, providing a fluent API. */

public final class XmlProtoNamespace {

  private final XmlNamespace namespace;

  public XmlProtoNamespace(XmlNamespace namespace) {
    this.namespace = namespace;
  }

  public XmlNamespace getProto() {
    return namespace;
  }

  public static XmlProtoNamespace create(String prefix, String uri) {
    return new XmlProtoNamespace(XmlNamespace.newBuilder().setPrefix(prefix).setUri(uri).build());
  }

  public String getPrefix() {
    return namespace.getPrefix();
  }

  public String getUri() {
    return namespace.getUri();
  }

  @Override
  public int hashCode() {
    return namespace.hashCode();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof XmlProtoNamespace)) {
      return false;
    }
    return namespace.equals(((XmlProtoNamespace) o).getProto());
  }
}
