package com.android.aapt;

import com.google.protobuf.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class RawString extends GeneratedMessageV3 implements com.android.aapt.RawStringOrBuilder {
        private static final long serialVersionUID = 0L;
        public static final int VALUE_FIELD_NUMBER = 1;
        private volatile Object value_;
        private byte memoizedIsInitialized;
        private static final com.android.aapt.RawString DEFAULT_INSTANCE = new com.android.aapt.RawString();
        private static final Parser<com.android.aapt.RawString> PARSER = new AbstractParser<com.android.aapt.RawString>() {
            public com.android.aapt.RawString parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new com.android.aapt.RawString(input, extensionRegistry);
            }
        };

        private RawString(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private RawString() {
            this.memoizedIsInitialized = -1;
            this.value_ = "";
        }

        @Override
        public Object newInstance(UnusedPrivateParameter unused) {
            return new com.android.aapt.RawString();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private RawString(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                java.lang.String s = input.readStringRequireUtf8();
                                this.value_ = s;
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
            return Resources.internal_static_aapt_pb_RawString_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_RawString_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.RawString.class, com.android.aapt.RawString.Builder.class);
        }

        public java.lang.String getValue() {
            Object ref = this.value_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String)ref;
            } else {
                ByteString bs = (ByteString)ref;
                java.lang.String s = bs.toStringUtf8();
                this.value_ = s;
                return s;
            }
        }

        public ByteString getValueBytes() {
            Object ref = this.value_;
            if (ref instanceof java.lang.String) {
                ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                this.value_ = b;
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
            if (!this.getValueBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 1, this.value_);
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
                if (!this.getValueBytes().isEmpty()) {
                    size += GeneratedMessageV3.computeStringSize(1, this.value_);
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
            } else if (!(obj instanceof com.android.aapt.RawString)) {
                return super.equals(obj);
            } else {
                com.android.aapt.RawString other = (com.android.aapt.RawString)obj;
                if (!this.getValue().equals(other.getValue())) {
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
                hash = 53 * hash + this.getValue().hashCode();
                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static com.android.aapt.RawString parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (com.android.aapt.RawString)PARSER.parseFrom(data);
        }

        public static com.android.aapt.RawString parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.RawString)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.RawString parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (com.android.aapt.RawString)PARSER.parseFrom(data);
        }

        public static com.android.aapt.RawString parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.RawString)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.RawString parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (com.android.aapt.RawString)PARSER.parseFrom(data);
        }

        public static com.android.aapt.RawString parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.RawString)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.RawString parseFrom(InputStream input) throws IOException {
            return (com.android.aapt.RawString)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.RawString parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.RawString)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.RawString parseDelimitedFrom(InputStream input) throws IOException {
            return (com.android.aapt.RawString)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static com.android.aapt.RawString parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.RawString)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.RawString parseFrom(CodedInputStream input) throws IOException {
            return (com.android.aapt.RawString)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.RawString parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.RawString)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public com.android.aapt.RawString.Builder newBuilderForType() {
            return newBuilder();
        }

        public static com.android.aapt.RawString.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static com.android.aapt.RawString.Builder newBuilder(com.android.aapt.RawString prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public com.android.aapt.RawString.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new com.android.aapt.RawString.Builder() : (new com.android.aapt.RawString.Builder()).mergeFrom(this);
        }

        public com.android.aapt.RawString.Builder newBuilderForType(BuilderParent parent) {
            com.android.aapt.RawString.Builder builder = new com.android.aapt.RawString.Builder(parent);
            return builder;
        }

        public static com.android.aapt.RawString getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<com.android.aapt.RawString> parser() {
            return PARSER;
        }

        public Parser<com.android.aapt.RawString> getParserForType() {
            return PARSER;
        }

        public com.android.aapt.RawString getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.RawString.Builder> implements com.android.aapt.RawStringOrBuilder {
            private Object value_;

            public static Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_RawString_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_RawString_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.RawString.class, com.android.aapt.RawString.Builder.class);
            }

            private Builder() {
                this.value_ = "";
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.value_ = "";
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.android.aapt.RawString.alwaysUseFieldBuilders) {
                }

            }

            public com.android.aapt.RawString.Builder clear() {
                super.clear();
                this.value_ = "";
                return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Resources.internal_static_aapt_pb_RawString_descriptor;
            }

            public com.android.aapt.RawString getDefaultInstanceForType() {
                return com.android.aapt.RawString.getDefaultInstance();
            }

            public com.android.aapt.RawString build() {
                com.android.aapt.RawString result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public com.android.aapt.RawString buildPartial() {
                com.android.aapt.RawString result = new com.android.aapt.RawString(this);
                result.value_ = this.value_;
                this.onBuilt();
                return result;
            }

            public com.android.aapt.RawString.Builder clone() {
                return (com.android.aapt.RawString.Builder)super.clone();
            }

            public com.android.aapt.RawString.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.RawString.Builder)super.setField(field, value);
            }

            public com.android.aapt.RawString.Builder clearField(Descriptors.FieldDescriptor field) {
                return (com.android.aapt.RawString.Builder)super.clearField(field);
            }

            public com.android.aapt.RawString.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (com.android.aapt.RawString.Builder)super.clearOneof(oneof);
            }

            public com.android.aapt.RawString.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (com.android.aapt.RawString.Builder)super.setRepeatedField(field, index, value);
            }

            public com.android.aapt.RawString.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.RawString.Builder)super.addRepeatedField(field, value);
            }

            public com.android.aapt.RawString.Builder mergeFrom(Message other) {
                if (other instanceof com.android.aapt.RawString) {
                    return this.mergeFrom((com.android.aapt.RawString)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public com.android.aapt.RawString.Builder mergeFrom(com.android.aapt.RawString other) {
                if (other == com.android.aapt.RawString.getDefaultInstance()) {
                    return this;
                } else {
                    if (!other.getValue().isEmpty()) {
                        this.value_ = other.value_;
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

            public com.android.aapt.RawString.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                com.android.aapt.RawString parsedMessage = null;

                try {
                    parsedMessage = (com.android.aapt.RawString)com.android.aapt.RawString.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (com.android.aapt.RawString)var8.getUnfinishedMessage();
                    throw var8.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }

                }

                return this;
            }

            public java.lang.String getValue() {
                Object ref = this.value_;
                if (!(ref instanceof java.lang.String)) {
                    ByteString bs = (ByteString)ref;
                    java.lang.String s = bs.toStringUtf8();
                    this.value_ = s;
                    return s;
                } else {
                    return (java.lang.String)ref;
                }
            }

            public ByteString getValueBytes() {
                Object ref = this.value_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                    this.value_ = b;
                    return b;
                } else {
                    return (ByteString)ref;
                }
            }

            public com.android.aapt.RawString.Builder setValue(java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.value_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public com.android.aapt.RawString.Builder clearValue() {
                this.value_ = com.android.aapt.RawString.getDefaultInstance().getValue();
                this.onChanged();
                return this;
            }

            public com.android.aapt.RawString.Builder setValueBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    com.android.aapt.RawString.checkByteStringIsUtf8(value);
                    this.value_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public final com.android.aapt.RawString.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.RawString.Builder)super.setUnknownFields(unknownFields);
            }

            public final com.android.aapt.RawString.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.RawString.Builder)super.mergeUnknownFields(unknownFields);
            }
        }
    }