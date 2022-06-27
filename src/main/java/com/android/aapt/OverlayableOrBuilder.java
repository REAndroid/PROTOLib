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

public interface OverlayableOrBuilder extends MessageOrBuilder {
        java.lang.String getName();

        ByteString getNameBytes();

        boolean hasSource();

        com.android.aapt.Source getSource();

        com.android.aapt.SourceOrBuilder getSourceOrBuilder();

        java.lang.String getActor();

        ByteString getActorBytes();
    }