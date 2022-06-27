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

public interface MacroBodyOrBuilder extends MessageOrBuilder {
        java.lang.String getRawString();

        ByteString getRawStringBytes();

        boolean hasStyleString();

        com.android.aapt.StyleString getStyleString();

        com.android.aapt.StyleStringOrBuilder getStyleStringOrBuilder();

        List<com.android.aapt.UntranslatableSection> getUntranslatableSectionsList();

        com.android.aapt.UntranslatableSection getUntranslatableSections(int var1);

        int getUntranslatableSectionsCount();

        List<? extends com.android.aapt.UntranslatableSectionOrBuilder> getUntranslatableSectionsOrBuilderList();

        com.android.aapt.UntranslatableSectionOrBuilder getUntranslatableSectionsOrBuilder(int var1);

        List<com.android.aapt.NamespaceAlias> getNamespaceStackList();

        com.android.aapt.NamespaceAlias getNamespaceStack(int var1);

        int getNamespaceStackCount();

        List<? extends com.android.aapt.NamespaceAliasOrBuilder> getNamespaceStackOrBuilderList();

        com.android.aapt.NamespaceAliasOrBuilder getNamespaceStackOrBuilder(int var1);

        boolean hasSource();

        com.android.aapt.SourcePosition getSource();

        com.android.aapt.SourcePositionOrBuilder getSourceOrBuilder();
    }