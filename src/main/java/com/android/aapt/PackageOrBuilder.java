package com.android.aapt;

import com.google.protobuf.*;

import java.util.List;

public interface PackageOrBuilder extends MessageOrBuilder {
        boolean hasPackageId();

        com.android.aapt.PackageId getPackageId();

        com.android.aapt.PackageIdOrBuilder getPackageIdOrBuilder();

        java.lang.String getPackageName();

        ByteString getPackageNameBytes();

        List<PBType> getTypeList();

        PBType getType(int var1);

        int getTypeCount();

        List<? extends com.android.aapt.TypeOrBuilder> getTypeOrBuilderList();

        com.android.aapt.TypeOrBuilder getTypeOrBuilder(int var1);
    }