package com.android.tools.build.bundletool.model.utils.xmlproto;

public class XmlProtoUtil {


    public static <T> T checkNotNull(T reference) {
        if (reference == null) {
            throw new NullPointerException();
        } else {
            return reference;
        }
    }
    public static final String NO_NAMESPACE_URI = "";
    public static final String ANDROID_NAMESPACE_URI = "http://schemas.android.com/apk/res/android";
}
