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

public interface EntryOrBuilder extends MessageOrBuilder {
        boolean hasEntryId();

        com.android.aapt.EntryId getEntryId();

        com.android.aapt.EntryIdOrBuilder getEntryIdOrBuilder();

        java.lang.String getName();

        ByteString getNameBytes();

        boolean hasVisibility();

        com.android.aapt.Visibility getVisibility();

        com.android.aapt.VisibilityOrBuilder getVisibilityOrBuilder();

        boolean hasAllowNew();

        com.android.aapt.AllowNew getAllowNew();

        com.android.aapt.AllowNewOrBuilder getAllowNewOrBuilder();

        boolean hasOverlayableItem();

        com.android.aapt.OverlayableItem getOverlayableItem();

        com.android.aapt.OverlayableItemOrBuilder getOverlayableItemOrBuilder();

        List<com.android.aapt.ConfigValue> getConfigValueList();

        com.android.aapt.ConfigValue getConfigValue(int var1);

        int getConfigValueCount();

        List<? extends com.android.aapt.ConfigValueOrBuilder> getConfigValueOrBuilderList();

        com.android.aapt.ConfigValueOrBuilder getConfigValueOrBuilder(int var1);

        boolean hasStagedId();

        com.android.aapt.StagedId getStagedId();

        com.android.aapt.StagedIdOrBuilder getStagedIdOrBuilder();
    }