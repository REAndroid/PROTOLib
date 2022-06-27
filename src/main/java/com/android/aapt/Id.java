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

public class Id extends GeneratedMessageV3 implements com.android.aapt.IdOrBuilder {
        private static final long serialVersionUID = 0L;
        private byte memoizedIsInitialized;
        private static final com.android.aapt.Id DEFAULT_INSTANCE = new com.android.aapt.Id();
        private static final Parser<com.android.aapt.Id> PARSER = new AbstractParser<com.android.aapt.Id>() {
            public com.android.aapt.Id parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new com.android.aapt.Id(input, extensionRegistry);
            }
        };

        private Id(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private Id() {
            this.memoizedIsInitialized = -1;
        }

        @Override
        public Object newInstance(UnusedPrivateParameter unused) {
            return new com.android.aapt.Id();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Id(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            } else {
                com.google.protobuf.UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

                try {
                    boolean done = false;

                    while(!done) {
                        int tag = input.readTag();
                        switch(tag) {
                            case 0:
                                done = true;
                                break;
                            default:
                                if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                        }
                    }
                } catch (InvalidProtocolBufferException var10) {
                    throw var10.setUnfinishedMessage(this);
                } catch (IOException var11) {
                    throw (new InvalidProtocolBufferException(var11)).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    this.makeExtensionsImmutable();
                }

            }
        }

        public static Descriptors.Descriptor getDescriptor() {
            return Resources.internal_static_aapt_pb_Id_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_Id_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.Id.class, com.android.aapt.Id.Builder.class);
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            } else if (isInitialized == 0) {
                return false;
            } else {
                this.memoizedIsInitialized = 1;
                return true;
            }
        }

        @Override
        public void writeTo(CodedOutputStream output) throws IOException {
            this.unknownFields.writeTo(output);
        }

        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            } else {
                size = 0;
                size = size + this.unknownFields.getSerializedSize();
                this.memoizedSize = size;
                return size;
            }
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            } else if (!(obj instanceof com.android.aapt.Id)) {
                return super.equals(obj);
            } else {
                com.android.aapt.Id other = (com.android.aapt.Id)obj;
                return this.unknownFields.equals(other.unknownFields);
            }
        }

        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            } else {
                int hash = 41;
                hash = 19 * hash + getDescriptor().hashCode();
                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static com.android.aapt.Id parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Id)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Id parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Id)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Id parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Id)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Id parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Id)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Id parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Id)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Id parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Id)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Id parseFrom(InputStream input) throws IOException {
            return (com.android.aapt.Id)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.Id parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Id)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.Id parseDelimitedFrom(InputStream input) throws IOException {
            return (com.android.aapt.Id)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static com.android.aapt.Id parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Id)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.Id parseFrom(CodedInputStream input) throws IOException {
            return (com.android.aapt.Id)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.Id parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Id)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public com.android.aapt.Id.Builder newBuilderForType() {
            return newBuilder();
        }

        public static com.android.aapt.Id.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static com.android.aapt.Id.Builder newBuilder(com.android.aapt.Id prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public com.android.aapt.Id.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new com.android.aapt.Id.Builder() : (new com.android.aapt.Id.Builder()).mergeFrom(this);
        }

        public com.android.aapt.Id.Builder newBuilderForType(BuilderParent parent) {
            com.android.aapt.Id.Builder builder = new com.android.aapt.Id.Builder(parent);
            return builder;
        }

        public static com.android.aapt.Id getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<com.android.aapt.Id> parser() {
            return PARSER;
        }

        public Parser<com.android.aapt.Id> getParserForType() {
            return PARSER;
        }

        public com.android.aapt.Id getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.Id.Builder> implements com.android.aapt.IdOrBuilder {
            public static Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_Id_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_Id_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.Id.class, com.android.aapt.Id.Builder.class);
            }

            private Builder() {
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.android.aapt.Id.alwaysUseFieldBuilders) {
                }

            }

            public com.android.aapt.Id.Builder clear() {
                super.clear();
                return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Resources.internal_static_aapt_pb_Id_descriptor;
            }

            public com.android.aapt.Id getDefaultInstanceForType() {
                return com.android.aapt.Id.getDefaultInstance();
            }

            public com.android.aapt.Id build() {
                com.android.aapt.Id result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public com.android.aapt.Id buildPartial() {
                com.android.aapt.Id result = new com.android.aapt.Id(this);
                this.onBuilt();
                return result;
            }

            public com.android.aapt.Id.Builder clone() {
                return (com.android.aapt.Id.Builder)super.clone();
            }

            public com.android.aapt.Id.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.Id.Builder)super.setField(field, value);
            }

            public com.android.aapt.Id.Builder clearField(Descriptors.FieldDescriptor field) {
                return (com.android.aapt.Id.Builder)super.clearField(field);
            }

            public com.android.aapt.Id.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (com.android.aapt.Id.Builder)super.clearOneof(oneof);
            }

            public com.android.aapt.Id.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (com.android.aapt.Id.Builder)super.setRepeatedField(field, index, value);
            }

            public com.android.aapt.Id.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.Id.Builder)super.addRepeatedField(field, value);
            }

            public com.android.aapt.Id.Builder mergeFrom(Message other) {
                if (other instanceof com.android.aapt.Id) {
                    return this.mergeFrom((com.android.aapt.Id)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public com.android.aapt.Id.Builder mergeFrom(com.android.aapt.Id other) {
                if (other == com.android.aapt.Id.getDefaultInstance()) {
                    return this;
                } else {
                    this.mergeUnknownFields(other.unknownFields);
                    this.onChanged();
                    return this;
                }
            }

            public final boolean isInitialized() {
                return true;
            }

            public com.android.aapt.Id.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                com.android.aapt.Id parsedMessage = null;

                try {
                    parsedMessage = (com.android.aapt.Id)com.android.aapt.Id.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (com.android.aapt.Id)var8.getUnfinishedMessage();
                    throw var8.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }

                }

                return this;
            }

            public final com.android.aapt.Id.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.Id.Builder)super.setUnknownFields(unknownFields);
            }

            public final com.android.aapt.Id.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.Id.Builder)super.mergeUnknownFields(unknownFields);
            }
        }
    }