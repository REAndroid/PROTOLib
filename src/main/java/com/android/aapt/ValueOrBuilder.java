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

public interface ValueOrBuilder extends MessageOrBuilder {
        boolean hasSource();

        com.android.aapt.Source getSource();

        com.android.aapt.SourceOrBuilder getSourceOrBuilder();

        java.lang.String getComment();

        ByteString getCommentBytes();

        boolean getWeak();

        boolean hasItem();

        com.android.aapt.Item getItem();

        com.android.aapt.ItemOrBuilder getItemOrBuilder();

        boolean hasCompoundValue();

        com.android.aapt.CompoundValue getCompoundValue();

        com.android.aapt.CompoundValueOrBuilder getCompoundValueOrBuilder();

        com.android.aapt.Value.ValueCase getValueCase();
    }