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

public interface StyleOrBuilder extends MessageOrBuilder {
        boolean hasParent();

        com.android.aapt.Reference getParent();

        com.android.aapt.ReferenceOrBuilder getParentOrBuilder();

        boolean hasParentSource();

        com.android.aapt.Source getParentSource();

        com.android.aapt.SourceOrBuilder getParentSourceOrBuilder();

        List<com.android.aapt.Style.Entry> getEntryList();

        com.android.aapt.Style.Entry getEntry(int var1);

        int getEntryCount();

        List<? extends com.android.aapt.Style.EntryOrBuilder> getEntryOrBuilderList();

        com.android.aapt.Style.EntryOrBuilder getEntryOrBuilder(int var1);
    }