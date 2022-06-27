package com.android.aapt;

import com.google.protobuf.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class PBString extends GeneratedMessageV3 implements com.android.aapt.StringOrBuilder {
        private static final long serialVersionUID = 0L;
        public static final int VALUE_FIELD_NUMBER = 1;
        private volatile Object value_;
        private byte memoizedIsInitialized;
        private static final PBString DEFAULT_INSTANCE = new PBString();
        private static final Parser<PBString> PARSER = new AbstractParser<PBString>() {
            public PBString parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new PBString(input, extensionRegistry);
            }
        };

        private PBString(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private PBString() {
            this.memoizedIsInitialized = -1;
            this.value_ = "";
        }

        @Override
        public Object newInstance(UnusedPrivateParameter unused) {
            return new PBString();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private PBString(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                this.value_ = input.readStringRequireUtf8();
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

        public static  Descriptors.Descriptor getDescriptor() {
            return Resources.internal_static_aapt_pb_String_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_String_fieldAccessorTable.ensureFieldAccessorsInitialized(PBString.class, PBString.Builder.class);
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
            } else if (!(obj instanceof PBString)) {
                return super.equals(obj);
            } else {
                PBString other = (PBString)obj;
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

        public static PBString parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (PBString)PARSER.parseFrom(data);
        }

        public static PBString parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PBString)PARSER.parseFrom(data, extensionRegistry);
        }

        public static PBString parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (PBString)PARSER.parseFrom(data);
        }

        public static PBString parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PBString)PARSER.parseFrom(data, extensionRegistry);
        }

        public static PBString parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (PBString)PARSER.parseFrom(data);
        }

        public static PBString parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PBString)PARSER.parseFrom(data, extensionRegistry);
        }

        public static PBString parseFrom(InputStream input) throws IOException {
            return (PBString)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static PBString parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PBString)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static PBString parseDelimitedFrom(InputStream input) throws IOException {
            return (PBString)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static PBString parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PBString)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static PBString parseFrom(CodedInputStream input) throws IOException {
            return (PBString)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static PBString parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PBString)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public PBString.Builder newBuilderForType() {
            return newBuilder();
        }

        public static PBString.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PBString.Builder newBuilder(PBString prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public PBString.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new PBString.Builder() : (new PBString.Builder()).mergeFrom(this);
        }

        public PBString.Builder newBuilderForType(BuilderParent parent) {
            PBString.Builder builder = new PBString.Builder(parent);
            return builder;
        }

        public static PBString getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<PBString> parser() {
            return PARSER;
        }

        public Parser<PBString> getParserForType() {
            return PARSER;
        }

        public PBString getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<PBString.Builder> implements com.android.aapt.StringOrBuilder {
            private Object value_;

            public static  Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_String_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_String_fieldAccessorTable.ensureFieldAccessorsInitialized(PBString.class, PBString.Builder.class);
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
                if (PBString.alwaysUseFieldBuilders) {
                }

            }

            public PBString.Builder clear() {
                super.clear();
                this.value_ = "";
                return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Resources.internal_static_aapt_pb_String_descriptor;
            }

            public PBString getDefaultInstanceForType() {
                return PBString.getDefaultInstance();
            }

            public PBString build() {
                PBString result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public PBString buildPartial() {
                PBString result = new PBString(this);
                result.value_ = this.value_;
                this.onBuilt();
                return result;
            }

            public PBString.Builder clone() {
                return (PBString.Builder)super.clone();
            }

            public PBString.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (PBString.Builder)super.setField(field, value);
            }

            public PBString.Builder clearField(Descriptors.FieldDescriptor field) {
                return (PBString.Builder)super.clearField(field);
            }

            public PBString.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (PBString.Builder)super.clearOneof(oneof);
            }

            public PBString.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (PBString.Builder)super.setRepeatedField(field, index, value);
            }

            public PBString.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (PBString.Builder)super.addRepeatedField(field, value);
            }

            public PBString.Builder mergeFrom(Message other) {
                if (other instanceof PBString) {
                    return this.mergeFrom((PBString)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public PBString.Builder mergeFrom(PBString other) {
                if (other == PBString.getDefaultInstance()) {
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

            public PBString.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                PBString parsedMessage = null;

                try {
                    parsedMessage = (PBString) PBString.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (PBString)var8.getUnfinishedMessage();
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

            public PBString.Builder setValue(java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.value_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public PBString.Builder clearValue() {
                this.value_ = PBString.getDefaultInstance().getValue();
                this.onChanged();
                return this;
            }

            public PBString.Builder setValueBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    PBString.checkByteStringIsUtf8(value);
                    this.value_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public final PBString.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (PBString.Builder)super.setUnknownFields(unknownFields);
            }

            public final PBString.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (PBString.Builder)super.mergeUnknownFields(unknownFields);
            }
        }
    }