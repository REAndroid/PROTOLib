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

public interface XmlNodeOrBuilder extends MessageOrBuilder {
        boolean hasElement();

        com.android.aapt.XmlElement getElement();

        com.android.aapt.XmlElementOrBuilder getElementOrBuilder();

        java.lang.String getText();

        ByteString getTextBytes();

        boolean hasSource();

        com.android.aapt.SourcePosition getSource();

        com.android.aapt.SourcePositionOrBuilder getSourceOrBuilder();

        com.android.aapt.XmlNode.NodeCase getNodeCase();
    }