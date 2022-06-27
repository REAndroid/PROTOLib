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

public interface XmlAttributeOrBuilder extends MessageOrBuilder {
        java.lang.String getNamespaceUri();

        ByteString getNamespaceUriBytes();

        java.lang.String getName();

        ByteString getNameBytes();

        java.lang.String getValue();

        ByteString getValueBytes();

        boolean hasSource();

        com.android.aapt.SourcePosition getSource();

        com.android.aapt.SourcePositionOrBuilder getSourceOrBuilder();

        int getResourceId();

        boolean hasCompiledItem();

        com.android.aapt.Item getCompiledItem();

        com.android.aapt.ItemOrBuilder getCompiledItemOrBuilder();
    }