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

public interface AttributeOrBuilder extends MessageOrBuilder {
        int getFormatFlags();

        int getMinInt();

        int getMaxInt();

        List<com.android.aapt.Attribute.Symbol> getSymbolList();

        com.android.aapt.Attribute.Symbol getSymbol(int var1);

        int getSymbolCount();

        List<? extends com.android.aapt.Attribute.SymbolOrBuilder> getSymbolOrBuilderList();

        com.android.aapt.Attribute.SymbolOrBuilder getSymbolOrBuilder(int var1);
    }