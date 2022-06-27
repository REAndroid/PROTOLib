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

public interface PluralOrBuilder extends MessageOrBuilder {
        List<com.android.aapt.Plural.Entry> getEntryList();

        com.android.aapt.Plural.Entry getEntry(int var1);

        int getEntryCount();

        List<? extends com.android.aapt.Plural.EntryOrBuilder> getEntryOrBuilderList();

        com.android.aapt.Plural.EntryOrBuilder getEntryOrBuilder(int var1);
    }