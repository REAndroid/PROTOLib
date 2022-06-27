package com.android.aapt;

import com.google.protobuf.*;

public interface CompoundValueOrBuilder extends MessageOrBuilder {
        boolean hasAttr();

        com.android.aapt.Attribute getAttr();

        com.android.aapt.AttributeOrBuilder getAttrOrBuilder();

        boolean hasStyle();

        com.android.aapt.Style getStyle();

        com.android.aapt.StyleOrBuilder getStyleOrBuilder();

        boolean hasStyleable();

        com.android.aapt.Styleable getStyleable();

        com.android.aapt.StyleableOrBuilder getStyleableOrBuilder();

        boolean hasArray();

        PBArray getArray();

        com.android.aapt.ArrayOrBuilder getArrayOrBuilder();

        boolean hasPlural();

        com.android.aapt.Plural getPlural();

        com.android.aapt.PluralOrBuilder getPluralOrBuilder();

        boolean hasMacro();

        com.android.aapt.MacroBody getMacro();

        com.android.aapt.MacroBodyOrBuilder getMacroOrBuilder();

        com.android.aapt.CompoundValue.ValueCase getValueCase();
    }