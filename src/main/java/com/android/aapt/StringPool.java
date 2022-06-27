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

public class StringPool extends GeneratedMessageV3 implements com.android.aapt.StringPoolOrBuilder {
        private static final long serialVersionUID = 0L;
        public static final int DATA_FIELD_NUMBER = 1;
        private ByteString data_;
        private byte memoizedIsInitialized;
        private static final com.android.aapt.StringPool DEFAULT_INSTANCE = new com.android.aapt.StringPool();
        private static final Parser<com.android.aapt.StringPool> PARSER = new AbstractParser<com.android.aapt.StringPool>() {
            public com.android.aapt.StringPool parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new com.android.aapt.StringPool(input, extensionRegistry);
            }
        };

        private StringPool(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private StringPool() {
            this.memoizedIsInitialized = -1;
            this.data_ = ByteString.EMPTY;
        }

        @Override
        public Object newInstance(UnusedPrivateParameter unused) {
            return new com.android.aapt.StringPool();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private StringPool(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            case 10:
                                this.data_ = input.readBytes();
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
            return Resources.internal_static_aapt_pb_StringPool_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_StringPool_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.StringPool.class, com.android.aapt.StringPool.Builder.class);
        }

        public ByteString getData() {
            return this.data_;
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
            if (!this.data_.isEmpty()) {
                output.writeBytes(1, this.data_);
            }

            this.unknownFields.writeTo(output);
        }

        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            } else {
                size = 0;
                if (!this.data_.isEmpty()) {
                    size += CodedOutputStream.computeBytesSize(1, this.data_);
                }

                size += this.unknownFields.getSerializedSize();
                this.memoizedSize = size;
                return size;
            }
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            } else if (!(obj instanceof com.android.aapt.StringPool)) {
                return super.equals(obj);
            } else {
                com.android.aapt.StringPool other = (com.android.aapt.StringPool)obj;
                if (!this.getData().equals(other.getData())) {
                    return false;
                } else {
                    return this.unknownFields.equals(other.unknownFields);
                }
            }
        }

        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            } else {
                int hash = 41;
                hash = 19 * hash + getDescriptor().hashCode();
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getData().hashCode();
                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static com.android.aapt.StringPool parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (com.android.aapt.StringPool)PARSER.parseFrom(data);
        }

        public static com.android.aapt.StringPool parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.StringPool)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.StringPool parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (com.android.aapt.StringPool)PARSER.parseFrom(data);
        }

        public static com.android.aapt.StringPool parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.StringPool)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.StringPool parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (com.android.aapt.StringPool)PARSER.parseFrom(data);
        }

        public static com.android.aapt.StringPool parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.StringPool)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.StringPool parseFrom(InputStream input) throws IOException {
            return (com.android.aapt.StringPool)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.StringPool parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.StringPool)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.StringPool parseDelimitedFrom(InputStream input) throws IOException {
            return (com.android.aapt.StringPool)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static com.android.aapt.StringPool parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.StringPool)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.StringPool parseFrom(CodedInputStream input) throws IOException {
            return (com.android.aapt.StringPool)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.StringPool parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.StringPool)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public com.android.aapt.StringPool.Builder newBuilderForType() {
            return newBuilder();
        }

        public static com.android.aapt.StringPool.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static com.android.aapt.StringPool.Builder newBuilder(com.android.aapt.StringPool prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public com.android.aapt.StringPool.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new com.android.aapt.StringPool.Builder() : (new com.android.aapt.StringPool.Builder()).mergeFrom(this);
        }

        public com.android.aapt.StringPool.Builder newBuilderForType(BuilderParent parent) {
            com.android.aapt.StringPool.Builder builder = new com.android.aapt.StringPool.Builder(parent);
            return builder;
        }

        public static com.android.aapt.StringPool getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<com.android.aapt.StringPool> parser() {
            return PARSER;
        }

        public Parser<com.android.aapt.StringPool> getParserForType() {
            return PARSER;
        }

        public com.android.aapt.StringPool getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.StringPool.Builder> implements com.android.aapt.StringPoolOrBuilder {
            private ByteString data_;

            public static Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_StringPool_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_StringPool_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.StringPool.class, com.android.aapt.StringPool.Builder.class);
            }

            private Builder() {
                this.data_ = ByteString.EMPTY;
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.data_ = ByteString.EMPTY;
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.android.aapt.StringPool.alwaysUseFieldBuilders) {
                }

            }

            public com.android.aapt.StringPool.Builder clear() {
                super.clear();
                this.data_ = ByteString.EMPTY;
                return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Resources.internal_static_aapt_pb_StringPool_descriptor;
            }

            public com.android.aapt.StringPool getDefaultInstanceForType() {
                return com.android.aapt.StringPool.getDefaultInstance();
            }

            public com.android.aapt.StringPool build() {
                com.android.aapt.StringPool result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public com.android.aapt.StringPool buildPartial() {
                com.android.aapt.StringPool result = new com.android.aapt.StringPool(this);
                result.data_ = this.data_;
                this.onBuilt();
                return result;
            }

            public com.android.aapt.StringPool.Builder clone() {
                return (com.android.aapt.StringPool.Builder)super.clone();
            }

            public com.android.aapt.StringPool.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.StringPool.Builder)super.setField(field, value);
            }

            public com.android.aapt.StringPool.Builder clearField(Descriptors.FieldDescriptor field) {
                return (com.android.aapt.StringPool.Builder)super.clearField(field);
            }

            public com.android.aapt.StringPool.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (com.android.aapt.StringPool.Builder)super.clearOneof(oneof);
            }

            public com.android.aapt.StringPool.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (com.android.aapt.StringPool.Builder)super.setRepeatedField(field, index, value);
            }

            public com.android.aapt.StringPool.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.StringPool.Builder)super.addRepeatedField(field, value);
            }

            public com.android.aapt.StringPool.Builder mergeFrom(Message other) {
                if (other instanceof com.android.aapt.StringPool) {
                    return this.mergeFrom((com.android.aapt.StringPool)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public com.android.aapt.StringPool.Builder mergeFrom(com.android.aapt.StringPool other) {
                if (other == com.android.aapt.StringPool.getDefaultInstance()) {
                    return this;
                } else {
                    if (other.getData() != ByteString.EMPTY) {
                        this.setData(other.getData());
                    }

                    this.mergeUnknownFields(other.unknownFields);
                    this.onChanged();
                    return this;
                }
            }

            public final boolean isInitialized() {
                return true;
            }

            public com.android.aapt.StringPool.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                com.android.aapt.StringPool parsedMessage = null;

                try {
                    parsedMessage = (com.android.aapt.StringPool)com.android.aapt.StringPool.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (com.android.aapt.StringPool)var8.getUnfinishedMessage();
                    throw var8.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }

                }

                return this;
            }

            public ByteString getData() {
                return this.data_;
            }

            public com.android.aapt.StringPool.Builder setData(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.data_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public com.android.aapt.StringPool.Builder clearData() {
                this.data_ = com.android.aapt.StringPool.getDefaultInstance().getData();
                this.onChanged();
                return this;
            }

            public final com.android.aapt.StringPool.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.StringPool.Builder)super.setUnknownFields(unknownFields);
            }

            public final com.android.aapt.StringPool.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.StringPool.Builder)super.mergeUnknownFields(unknownFields);
            }
        }
    }