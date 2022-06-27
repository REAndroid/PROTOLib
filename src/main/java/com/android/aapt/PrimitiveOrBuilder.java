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

public interface PrimitiveOrBuilder extends MessageOrBuilder {
        boolean hasNullValue();

        com.android.aapt.Primitive.NullType getNullValue();

        com.android.aapt.Primitive.NullTypeOrBuilder getNullValueOrBuilder();

        boolean hasEmptyValue();

        com.android.aapt.Primitive.EmptyType getEmptyValue();

        com.android.aapt.Primitive.EmptyTypeOrBuilder getEmptyValueOrBuilder();

        float getFloatValue();

        int getDimensionValue();

        int getFractionValue();

        int getIntDecimalValue();

        int getIntHexadecimalValue();

        boolean getBooleanValue();

        int getColorArgb8Value();

        int getColorRgb8Value();

        int getColorArgb4Value();

        int getColorRgb4Value();

        /** @deprecated */
        @Deprecated
        float getDimensionValueDeprecated();

        /** @deprecated */
        @Deprecated
        float getFractionValueDeprecated();

        com.android.aapt.Primitive.OneofValueCase getOneofValueCase();
    }