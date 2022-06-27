package com.android.aapt;

import com.android.aapt.ConfigurationOuterClass.Configuration;
import com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder;
import com.google.protobuf.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public interface XmlElementOrBuilder extends MessageOrBuilder {
        List<com.android.aapt.XmlNamespace> getNamespaceDeclarationList();

        com.android.aapt.XmlNamespace getNamespaceDeclaration(int var1);

        int getNamespaceDeclarationCount();

        List<? extends com.android.aapt.XmlNamespaceOrBuilder> getNamespaceDeclarationOrBuilderList();

        com.android.aapt.XmlNamespaceOrBuilder getNamespaceDeclarationOrBuilder(int var1);

        java.lang.String getNamespaceUri();

        ByteString getNamespaceUriBytes();

        java.lang.String getName();

        ByteString getNameBytes();

        List<com.android.aapt.XmlAttribute> getAttributeList();

        com.android.aapt.XmlAttribute getAttribute(int var1);

        int getAttributeCount();

        List<? extends com.android.aapt.XmlAttributeOrBuilder> getAttributeOrBuilderList();

        com.android.aapt.XmlAttributeOrBuilder getAttributeOrBuilder(int var1);

        List<com.android.aapt.XmlNode> getChildList();

        com.android.aapt.XmlNode getChild(int var1);

        int getChildCount();

        List<? extends com.android.aapt.XmlNodeOrBuilder> getChildOrBuilderList();

        com.android.aapt.XmlNodeOrBuilder getChildOrBuilder(int var1);
    }