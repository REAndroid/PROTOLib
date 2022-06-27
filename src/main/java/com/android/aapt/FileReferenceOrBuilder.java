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

public interface FileReferenceOrBuilder extends MessageOrBuilder {
        java.lang.String getPath();

        ByteString getPathBytes();

        int getTypeValue();

        com.android.aapt.FileReference.Type getType();
    }