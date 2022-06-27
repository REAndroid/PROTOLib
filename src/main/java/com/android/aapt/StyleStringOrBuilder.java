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

public interface StyleStringOrBuilder extends MessageOrBuilder {
        java.lang.String getStr();

        ByteString getStrBytes();

        List<com.android.aapt.StyleString.Span> getSpansList();

        com.android.aapt.StyleString.Span getSpans(int var1);

        int getSpansCount();

        List<? extends com.android.aapt.StyleString.SpanOrBuilder> getSpansOrBuilderList();

        com.android.aapt.StyleString.SpanOrBuilder getSpansOrBuilder(int var1);
    }