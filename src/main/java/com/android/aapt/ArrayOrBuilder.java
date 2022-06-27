package com.android.aapt;

import com.google.protobuf.*;

import java.util.List;

public interface ArrayOrBuilder extends MessageOrBuilder {
        List<PBArray.Element> getElementList();

        PBArray.Element getElement(int var1);

        int getElementCount();

        List<? extends PBArray.ElementOrBuilder> getElementOrBuilderList();

        PBArray.ElementOrBuilder getElementOrBuilder(int var1);
    }