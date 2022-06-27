package com.android.aapt;

import com.google.protobuf.*;

import java.util.List;

public interface ResourceTableOrBuilder extends MessageOrBuilder {
        boolean hasSourcePool();

        com.android.aapt.StringPool getSourcePool();

        com.android.aapt.StringPoolOrBuilder getSourcePoolOrBuilder();

        List<PBPackage> getPackageList();

        PBPackage getPackage(int var1);

        int getPackageCount();

        List<? extends com.android.aapt.PackageOrBuilder> getPackageOrBuilderList();

        com.android.aapt.PackageOrBuilder getPackageOrBuilder(int var1);

        List<com.android.aapt.Overlayable> getOverlayableList();

        com.android.aapt.Overlayable getOverlayable(int var1);

        int getOverlayableCount();

        List<? extends com.android.aapt.OverlayableOrBuilder> getOverlayableOrBuilderList();

        com.android.aapt.OverlayableOrBuilder getOverlayableOrBuilder(int var1);

        List<com.android.aapt.ToolFingerprint> getToolFingerprintList();

        com.android.aapt.ToolFingerprint getToolFingerprint(int var1);

        int getToolFingerprintCount();

        List<? extends com.android.aapt.ToolFingerprintOrBuilder> getToolFingerprintOrBuilderList();

        com.android.aapt.ToolFingerprintOrBuilder getToolFingerprintOrBuilder(int var1);
    }