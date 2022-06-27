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

public interface TypeOrBuilder extends MessageOrBuilder {
        boolean hasTypeId();

        com.android.aapt.TypeId getTypeId();

        com.android.aapt.TypeIdOrBuilder getTypeIdOrBuilder();

        java.lang.String getName();

        ByteString getNameBytes();

        List<com.android.aapt.Entry> getEntryList();

        com.android.aapt.Entry getEntry(int var1);

        int getEntryCount();

        List<? extends com.android.aapt.EntryOrBuilder> getEntryOrBuilderList();

        com.android.aapt.EntryOrBuilder getEntryOrBuilder(int var1);
    }