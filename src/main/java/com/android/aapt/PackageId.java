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

public class PackageId extends GeneratedMessageV3 implements com.android.aapt.PackageIdOrBuilder {
        private static final long serialVersionUID = 0L;
        public static final int ID_FIELD_NUMBER = 1;
        private int id_;
        private byte memoizedIsInitialized;
        private static final com.android.aapt.PackageId DEFAULT_INSTANCE = new com.android.aapt.PackageId();
        private static final Parser<com.android.aapt.PackageId> PARSER = new AbstractParser<com.android.aapt.PackageId>() {
            public com.android.aapt.PackageId parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new com.android.aapt.PackageId(input, extensionRegistry);
            }
        };

        private PackageId(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private PackageId() {
            this.memoizedIsInitialized = -1;
        }

        @Override
        public Object newInstance(UnusedPrivateParameter unused) {
            return new com.android.aapt.PackageId();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private PackageId(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            case 8:
                                this.id_ = input.readUInt32();
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
            return Resources.internal_static_aapt_pb_PackageId_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_PackageId_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.PackageId.class, com.android.aapt.PackageId.Builder.class);
        }

        public int getId() {
            return this.id_;
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
            if (this.id_ != 0) {
                output.writeUInt32(1, this.id_);
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
                if (this.id_ != 0) {
                    size += CodedOutputStream.computeUInt32Size(1, this.id_);
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
            } else if (!(obj instanceof com.android.aapt.PackageId)) {
                return super.equals(obj);
            } else {
                com.android.aapt.PackageId other = (com.android.aapt.PackageId)obj;
                if (this.getId() != other.getId()) {
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
                hash = 53 * hash + this.getId();
                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static com.android.aapt.PackageId parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (com.android.aapt.PackageId)PARSER.parseFrom(data);
        }

        public static com.android.aapt.PackageId parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.PackageId)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.PackageId parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (com.android.aapt.PackageId)PARSER.parseFrom(data);
        }

        public static com.android.aapt.PackageId parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.PackageId)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.PackageId parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (com.android.aapt.PackageId)PARSER.parseFrom(data);
        }

        public static com.android.aapt.PackageId parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.PackageId)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.PackageId parseFrom(InputStream input) throws IOException {
            return (com.android.aapt.PackageId)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.PackageId parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.PackageId)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.PackageId parseDelimitedFrom(InputStream input) throws IOException {
            return (com.android.aapt.PackageId)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static com.android.aapt.PackageId parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.PackageId)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.PackageId parseFrom(CodedInputStream input) throws IOException {
            return (com.android.aapt.PackageId)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.PackageId parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.PackageId)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public com.android.aapt.PackageId.Builder newBuilderForType() {
            return newBuilder();
        }

        public static com.android.aapt.PackageId.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static com.android.aapt.PackageId.Builder newBuilder(com.android.aapt.PackageId prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public com.android.aapt.PackageId.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new com.android.aapt.PackageId.Builder() : (new com.android.aapt.PackageId.Builder()).mergeFrom(this);
        }

        public com.android.aapt.PackageId.Builder newBuilderForType(BuilderParent parent) {
            com.android.aapt.PackageId.Builder builder = new com.android.aapt.PackageId.Builder(parent);
            return builder;
        }

        public static com.android.aapt.PackageId getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<com.android.aapt.PackageId> parser() {
            return PARSER;
        }

        public Parser<com.android.aapt.PackageId> getParserForType() {
            return PARSER;
        }

        public com.android.aapt.PackageId getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.PackageId.Builder> implements com.android.aapt.PackageIdOrBuilder {
            private int id_;

            public static Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_PackageId_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_PackageId_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.PackageId.class, com.android.aapt.PackageId.Builder.class);
            }

            private Builder() {
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.android.aapt.PackageId.alwaysUseFieldBuilders) {
                }

            }

            public com.android.aapt.PackageId.Builder clear() {
                super.clear();
                this.id_ = 0;
                return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Resources.internal_static_aapt_pb_PackageId_descriptor;
            }

            public com.android.aapt.PackageId getDefaultInstanceForType() {
                return com.android.aapt.PackageId.getDefaultInstance();
            }

            public com.android.aapt.PackageId build() {
                com.android.aapt.PackageId result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public com.android.aapt.PackageId buildPartial() {
                com.android.aapt.PackageId result = new com.android.aapt.PackageId(this);
                result.id_ = this.id_;
                this.onBuilt();
                return result;
            }

            public com.android.aapt.PackageId.Builder clone() {
                return (com.android.aapt.PackageId.Builder)super.clone();
            }

            public com.android.aapt.PackageId.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.PackageId.Builder)super.setField(field, value);
            }

            public com.android.aapt.PackageId.Builder clearField(Descriptors.FieldDescriptor field) {
                return (com.android.aapt.PackageId.Builder)super.clearField(field);
            }

            public com.android.aapt.PackageId.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (com.android.aapt.PackageId.Builder)super.clearOneof(oneof);
            }

            public com.android.aapt.PackageId.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (com.android.aapt.PackageId.Builder)super.setRepeatedField(field, index, value);
            }

            public com.android.aapt.PackageId.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.PackageId.Builder)super.addRepeatedField(field, value);
            }

            public com.android.aapt.PackageId.Builder mergeFrom(Message other) {
                if (other instanceof com.android.aapt.PackageId) {
                    return this.mergeFrom((com.android.aapt.PackageId)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public com.android.aapt.PackageId.Builder mergeFrom(com.android.aapt.PackageId other) {
                if (other == com.android.aapt.PackageId.getDefaultInstance()) {
                    return this;
                } else {
                    if (other.getId() != 0) {
                        this.setId(other.getId());
                    }

                    this.mergeUnknownFields(other.unknownFields);
                    this.onChanged();
                    return this;
                }
            }

            public final boolean isInitialized() {
                return true;
            }

            public com.android.aapt.PackageId.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                com.android.aapt.PackageId parsedMessage = null;

                try {
                    parsedMessage = (com.android.aapt.PackageId)com.android.aapt.PackageId.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (com.android.aapt.PackageId)var8.getUnfinishedMessage();
                    throw var8.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }

                }

                return this;
            }

            public int getId() {
                return this.id_;
            }

            public com.android.aapt.PackageId.Builder setId(int value) {
                this.id_ = value;
                this.onChanged();
                return this;
            }

            public com.android.aapt.PackageId.Builder clearId() {
                this.id_ = 0;
                this.onChanged();
                return this;
            }

            public final com.android.aapt.PackageId.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.PackageId.Builder)super.setUnknownFields(unknownFields);
            }

            public final com.android.aapt.PackageId.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.PackageId.Builder)super.mergeUnknownFields(unknownFields);
            }
        }
    }