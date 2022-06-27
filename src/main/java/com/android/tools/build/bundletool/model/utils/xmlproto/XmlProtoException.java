
package com.android.tools.build.bundletool.model.utils.xmlproto;


/** Exception thrown when an error occurs on reading or writing the XML Proto format. */
public class XmlProtoException extends RuntimeException {

  XmlProtoException(String message, Object... args) {
    super(String.format(message, args));
  }
}
