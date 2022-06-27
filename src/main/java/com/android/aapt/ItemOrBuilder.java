package com.android.aapt;

import com.google.protobuf.*;

public interface ItemOrBuilder extends MessageOrBuilder {
        boolean hasRef();

        com.android.aapt.Reference getRef();

        com.android.aapt.ReferenceOrBuilder getRefOrBuilder();

        boolean hasStr();

        PBString getStr();

        com.android.aapt.StringOrBuilder getStrOrBuilder();

        boolean hasRawStr();

        com.android.aapt.RawString getRawStr();

        com.android.aapt.RawStringOrBuilder getRawStrOrBuilder();

        boolean hasStyledStr();

        com.android.aapt.StyledString getStyledStr();

        com.android.aapt.StyledStringOrBuilder getStyledStrOrBuilder();

        boolean hasFile();

        com.android.aapt.FileReference getFile();

        com.android.aapt.FileReferenceOrBuilder getFileOrBuilder();

        boolean hasId();

        com.android.aapt.Id getId();

        com.android.aapt.IdOrBuilder getIdOrBuilder();

        boolean hasPrim();

        com.android.aapt.Primitive getPrim();

        com.android.aapt.PrimitiveOrBuilder getPrimOrBuilder();

        com.android.aapt.Item.ValueCase getValueCase();
    }