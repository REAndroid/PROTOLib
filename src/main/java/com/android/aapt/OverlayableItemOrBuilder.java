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

public interface OverlayableItemOrBuilder extends MessageOrBuilder {
        boolean hasSource();

        com.android.aapt.Source getSource();

        com.android.aapt.SourceOrBuilder getSourceOrBuilder();

        java.lang.String getComment();

        ByteString getCommentBytes();

        List<com.android.aapt.OverlayableItem.Policy> getPolicyList();

        int getPolicyCount();

        com.android.aapt.OverlayableItem.Policy getPolicy(int var1);

        List<Integer> getPolicyValueList();

        int getPolicyValue(int var1);

        int getOverlayableIdx();
    }