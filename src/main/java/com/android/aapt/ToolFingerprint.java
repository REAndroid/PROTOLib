package com.android.aapt;

import com.google.protobuf.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class ToolFingerprint extends GeneratedMessageV3 implements com.android.aapt.ToolFingerprintOrBuilder {
        private static final long serialVersionUID = 0L;
        public static final int TOOL_FIELD_NUMBER = 1;
        private volatile Object tool_;
        public static final int VERSION_FIELD_NUMBER = 2;
        private volatile Object version_;
        private byte memoizedIsInitialized;
        private static final com.android.aapt.ToolFingerprint DEFAULT_INSTANCE = new com.android.aapt.ToolFingerprint();
        private static final Parser<com.android.aapt.ToolFingerprint> PARSER = new AbstractParser<com.android.aapt.ToolFingerprint>() {
            public com.android.aapt.ToolFingerprint parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new com.android.aapt.ToolFingerprint(input, extensionRegistry);
            }
        };

        private ToolFingerprint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private ToolFingerprint() {
            this.memoizedIsInitialized = -1;
            this.tool_ = "";
            this.version_ = "";
        }

        @Override
        public Object newInstance(UnusedPrivateParameter unused) {
            return new com.android.aapt.ToolFingerprint();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ToolFingerprint(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            } else {
                com.google.protobuf.UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

                try {
                    boolean done = false;

                    while(!done) {
                        int tag = input.readTag();
                        java.lang.String s;
                        switch(tag) {
                            case 0:
                                done = true;
                                break;
                            case 10:
                                s = input.readStringRequireUtf8();
                                this.tool_ = s;
                                break;
                            case 18:
                                s = input.readStringRequireUtf8();
                                this.version_ = s;
                                break;
                            default:
                                if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                        }
                    }
                } catch (InvalidProtocolBufferException var11) {
                    throw var11.setUnfinishedMessage(this);
                } catch (IOException var12) {
                    throw (new InvalidProtocolBufferException(var12)).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    this.makeExtensionsImmutable();
                }

            }
        }

        public static Descriptors.Descriptor getDescriptor() {
            return Resources.internal_static_aapt_pb_ToolFingerprint_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_ToolFingerprint_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.ToolFingerprint.class, com.android.aapt.ToolFingerprint.Builder.class);
        }

        public java.lang.String getTool() {
            Object ref = this.tool_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String)ref;
            } else {
                ByteString bs = (ByteString)ref;
                java.lang.String s = bs.toStringUtf8();
                this.tool_ = s;
                return s;
            }
        }

        public ByteString getToolBytes() {
            Object ref = this.tool_;
            if (ref instanceof java.lang.String) {
                ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                this.tool_ = b;
                return b;
            } else {
                return (ByteString)ref;
            }
        }

        public java.lang.String getVersion() {
            Object ref = this.version_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String)ref;
            } else {
                ByteString bs = (ByteString)ref;
                java.lang.String s = bs.toStringUtf8();
                this.version_ = s;
                return s;
            }
        }

        public ByteString getVersionBytes() {
            Object ref = this.version_;
            if (ref instanceof java.lang.String) {
                ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                this.version_ = b;
                return b;
            } else {
                return (ByteString)ref;
            }
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
            if (!this.getToolBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 1, this.tool_);
            }

            if (!this.getVersionBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 2, this.version_);
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
                if (!this.getToolBytes().isEmpty()) {
                    size += GeneratedMessageV3.computeStringSize(1, this.tool_);
                }

                if (!this.getVersionBytes().isEmpty()) {
                    size += GeneratedMessageV3.computeStringSize(2, this.version_);
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
            } else if (!(obj instanceof com.android.aapt.ToolFingerprint)) {
                return super.equals(obj);
            } else {
                com.android.aapt.ToolFingerprint other = (com.android.aapt.ToolFingerprint)obj;
                if (!this.getTool().equals(other.getTool())) {
                    return false;
                } else if (!this.getVersion().equals(other.getVersion())) {
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
                hash = 53 * hash + this.getTool().hashCode();
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getVersion().hashCode();
                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static com.android.aapt.ToolFingerprint parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (com.android.aapt.ToolFingerprint)PARSER.parseFrom(data);
        }

        public static com.android.aapt.ToolFingerprint parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.ToolFingerprint)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.ToolFingerprint parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (com.android.aapt.ToolFingerprint)PARSER.parseFrom(data);
        }

        public static com.android.aapt.ToolFingerprint parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.ToolFingerprint)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.ToolFingerprint parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (com.android.aapt.ToolFingerprint)PARSER.parseFrom(data);
        }

        public static com.android.aapt.ToolFingerprint parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.ToolFingerprint)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.ToolFingerprint parseFrom(InputStream input) throws IOException {
            return (com.android.aapt.ToolFingerprint)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.ToolFingerprint parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.ToolFingerprint)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.ToolFingerprint parseDelimitedFrom(InputStream input) throws IOException {
            return (com.android.aapt.ToolFingerprint)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static com.android.aapt.ToolFingerprint parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.ToolFingerprint)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.ToolFingerprint parseFrom(CodedInputStream input) throws IOException {
            return (com.android.aapt.ToolFingerprint)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.ToolFingerprint parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.ToolFingerprint)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public com.android.aapt.ToolFingerprint.Builder newBuilderForType() {
            return newBuilder();
        }

        public static com.android.aapt.ToolFingerprint.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static com.android.aapt.ToolFingerprint.Builder newBuilder(com.android.aapt.ToolFingerprint prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public com.android.aapt.ToolFingerprint.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new com.android.aapt.ToolFingerprint.Builder() : (new com.android.aapt.ToolFingerprint.Builder()).mergeFrom(this);
        }

        public com.android.aapt.ToolFingerprint.Builder newBuilderForType(BuilderParent parent) {
            com.android.aapt.ToolFingerprint.Builder builder = new com.android.aapt.ToolFingerprint.Builder(parent);
            return builder;
        }

        public static com.android.aapt.ToolFingerprint getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<com.android.aapt.ToolFingerprint> parser() {
            return PARSER;
        }

        public Parser<com.android.aapt.ToolFingerprint> getParserForType() {
            return PARSER;
        }

        public com.android.aapt.ToolFingerprint getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.ToolFingerprint.Builder> implements com.android.aapt.ToolFingerprintOrBuilder {
            private Object tool_;
            private Object version_;

            public static Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_ToolFingerprint_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_ToolFingerprint_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.ToolFingerprint.class, com.android.aapt.ToolFingerprint.Builder.class);
            }

            private Builder() {
                this.tool_ = "";
                this.version_ = "";
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.tool_ = "";
                this.version_ = "";
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.android.aapt.ToolFingerprint.alwaysUseFieldBuilders) {
                }

            }

            public com.android.aapt.ToolFingerprint.Builder clear() {
                super.clear();
                this.tool_ = "";
                this.version_ = "";
                return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Resources.internal_static_aapt_pb_ToolFingerprint_descriptor;
            }

            public com.android.aapt.ToolFingerprint getDefaultInstanceForType() {
                return com.android.aapt.ToolFingerprint.getDefaultInstance();
            }

            public com.android.aapt.ToolFingerprint build() {
                com.android.aapt.ToolFingerprint result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public com.android.aapt.ToolFingerprint buildPartial() {
                com.android.aapt.ToolFingerprint result = new com.android.aapt.ToolFingerprint(this);
                result.tool_ = this.tool_;
                result.version_ = this.version_;
                this.onBuilt();
                return result;
            }

            public com.android.aapt.ToolFingerprint.Builder clone() {
                return (com.android.aapt.ToolFingerprint.Builder)super.clone();
            }

            public com.android.aapt.ToolFingerprint.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.ToolFingerprint.Builder)super.setField(field, value);
            }

            public com.android.aapt.ToolFingerprint.Builder clearField(Descriptors.FieldDescriptor field) {
                return (com.android.aapt.ToolFingerprint.Builder)super.clearField(field);
            }

            public com.android.aapt.ToolFingerprint.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (com.android.aapt.ToolFingerprint.Builder)super.clearOneof(oneof);
            }

            public com.android.aapt.ToolFingerprint.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (com.android.aapt.ToolFingerprint.Builder)super.setRepeatedField(field, index, value);
            }

            public com.android.aapt.ToolFingerprint.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.ToolFingerprint.Builder)super.addRepeatedField(field, value);
            }

            public com.android.aapt.ToolFingerprint.Builder mergeFrom(Message other) {
                if (other instanceof com.android.aapt.ToolFingerprint) {
                    return this.mergeFrom((com.android.aapt.ToolFingerprint)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public com.android.aapt.ToolFingerprint.Builder mergeFrom(com.android.aapt.ToolFingerprint other) {
                if (other == com.android.aapt.ToolFingerprint.getDefaultInstance()) {
                    return this;
                } else {
                    if (!other.getTool().isEmpty()) {
                        this.tool_ = other.tool_;
                        this.onChanged();
                    }

                    if (!other.getVersion().isEmpty()) {
                        this.version_ = other.version_;
                        this.onChanged();
                    }

                    this.mergeUnknownFields(other.unknownFields);
                    this.onChanged();
                    return this;
                }
            }

            public final boolean isInitialized() {
                return true;
            }

            public com.android.aapt.ToolFingerprint.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                com.android.aapt.ToolFingerprint parsedMessage = null;

                try {
                    parsedMessage = (com.android.aapt.ToolFingerprint)com.android.aapt.ToolFingerprint.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (com.android.aapt.ToolFingerprint)var8.getUnfinishedMessage();
                    throw var8.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }

                }

                return this;
            }

            public java.lang.String getTool() {
                Object ref = this.tool_;
                if (!(ref instanceof java.lang.String)) {
                    ByteString bs = (ByteString)ref;
                    java.lang.String s = bs.toStringUtf8();
                    this.tool_ = s;
                    return s;
                } else {
                    return (java.lang.String)ref;
                }
            }

            public ByteString getToolBytes() {
                Object ref = this.tool_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                    this.tool_ = b;
                    return b;
                } else {
                    return (ByteString)ref;
                }
            }

            public com.android.aapt.ToolFingerprint.Builder setTool(java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.tool_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public com.android.aapt.ToolFingerprint.Builder clearTool() {
                this.tool_ = com.android.aapt.ToolFingerprint.getDefaultInstance().getTool();
                this.onChanged();
                return this;
            }

            public com.android.aapt.ToolFingerprint.Builder setToolBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    com.android.aapt.ToolFingerprint.checkByteStringIsUtf8(value);
                    this.tool_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public java.lang.String getVersion() {
                Object ref = this.version_;
                if (!(ref instanceof java.lang.String)) {
                    ByteString bs = (ByteString)ref;
                    java.lang.String s = bs.toStringUtf8();
                    this.version_ = s;
                    return s;
                } else {
                    return (java.lang.String)ref;
                }
            }

            public ByteString getVersionBytes() {
                Object ref = this.version_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                    this.version_ = b;
                    return b;
                } else {
                    return (ByteString)ref;
                }
            }

            public com.android.aapt.ToolFingerprint.Builder setVersion(java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.version_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public com.android.aapt.ToolFingerprint.Builder clearVersion() {
                this.version_ = com.android.aapt.ToolFingerprint.getDefaultInstance().getVersion();
                this.onChanged();
                return this;
            }

            public com.android.aapt.ToolFingerprint.Builder setVersionBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    com.android.aapt.ToolFingerprint.checkByteStringIsUtf8(value);
                    this.version_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public final com.android.aapt.ToolFingerprint.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.ToolFingerprint.Builder)super.setUnknownFields(unknownFields);
            }

            public final com.android.aapt.ToolFingerprint.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.ToolFingerprint.Builder)super.mergeUnknownFields(unknownFields);
            }
        }
    }