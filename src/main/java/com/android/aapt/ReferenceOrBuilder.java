package com.android.aapt;

import com.google.protobuf.*;

public interface ReferenceOrBuilder extends MessageOrBuilder {
        int getTypeValue();

        com.android.aapt.Reference.Type getType();

        int getId();

        java.lang.String getName();

        ByteString getNameBytes();

        boolean getPrivate();

        boolean hasIsDynamic();

        PBBoolean getIsDynamic();

        com.android.aapt.BooleanOrBuilder getIsDynamicOrBuilder();

        int getTypeFlags();

        boolean getAllowRaw();
    }