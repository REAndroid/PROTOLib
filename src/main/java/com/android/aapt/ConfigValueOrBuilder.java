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

public interface ConfigValueOrBuilder extends MessageOrBuilder {
        boolean hasConfig();

        Configuration getConfig();

        ConfigurationOrBuilder getConfigOrBuilder();

        boolean hasValue();

        com.android.aapt.Value getValue();

        com.android.aapt.ValueOrBuilder getValueOrBuilder();
    }