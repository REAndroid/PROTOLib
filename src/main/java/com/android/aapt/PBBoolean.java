package com.android.aapt;

import com.google.protobuf.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class PBBoolean extends GeneratedMessageV3 implements com.android.aapt.BooleanOrBuilder {
        private static final long serialVersionUID = 0L;
        public static final int VALUE_FIELD_NUMBER = 1;
        private boolean value_;
        private byte memoizedIsInitialized;
        private static final PBBoolean DEFAULT_INSTANCE = new PBBoolean();
        private static final Parser<PBBoolean> PARSER = new AbstractParser<PBBoolean>() {
            public PBBoolean parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new PBBoolean(input, extensionRegistry);
            }
        };

        private PBBoolean(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private PBBoolean() {
            this.memoizedIsInitialized = -1;
        }

        @Override
        public Object newInstance(UnusedPrivateParameter unused) {
            return new PBBoolean();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private PBBoolean(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                this.value_ = input.readBool();
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
            return Resources.internal_static_aapt_pb_Boolean_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_Boolean_fieldAccessorTable.ensureFieldAccessorsInitialized(PBBoolean.class, PBBoolean.Builder.class);
        }

        public boolean getValue() {
            return this.value_;
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
            if (this.value_) {
                output.writeBool(1, this.value_);
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
                if (this.value_) {
                    size += CodedOutputStream.computeBoolSize(1, this.value_);
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
            } else if (!(obj instanceof PBBoolean)) {
                return super.equals(obj);
            } else {
                PBBoolean other = (PBBoolean)obj;
                if (this.getValue() != other.getValue()) {
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
                hash = 53 * hash + Internal.hashBoolean(this.getValue());
                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static PBBoolean parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (PBBoolean)PARSER.parseFrom(data);
        }

        public static PBBoolean parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PBBoolean)PARSER.parseFrom(data, extensionRegistry);
        }

        public static PBBoolean parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (PBBoolean)PARSER.parseFrom(data);
        }

        public static PBBoolean parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PBBoolean)PARSER.parseFrom(data, extensionRegistry);
        }

        public static PBBoolean parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (PBBoolean)PARSER.parseFrom(data);
        }

        public static PBBoolean parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PBBoolean)PARSER.parseFrom(data, extensionRegistry);
        }

        public static PBBoolean parseFrom(InputStream input) throws IOException {
            return (PBBoolean)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static PBBoolean parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PBBoolean)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static PBBoolean parseDelimitedFrom(InputStream input) throws IOException {
            return (PBBoolean)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static PBBoolean parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PBBoolean)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static PBBoolean parseFrom(CodedInputStream input) throws IOException {
            return (PBBoolean)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static PBBoolean parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PBBoolean)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public PBBoolean.Builder newBuilderForType() {
            return newBuilder();
        }

        public static PBBoolean.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PBBoolean.Builder newBuilder(PBBoolean prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public PBBoolean.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new PBBoolean.Builder() : (new PBBoolean.Builder()).mergeFrom(this);
        }

        public PBBoolean.Builder newBuilderForType(BuilderParent parent) {
            PBBoolean.Builder builder = new PBBoolean.Builder(parent);
            return builder;
        }

        public static PBBoolean getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<PBBoolean> parser() {
            return PARSER;
        }

        public Parser<PBBoolean> getParserForType() {
            return PARSER;
        }

        public PBBoolean getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<PBBoolean.Builder> implements com.android.aapt.BooleanOrBuilder {
            private boolean value_;

            public static Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_Boolean_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_Boolean_fieldAccessorTable.ensureFieldAccessorsInitialized(PBBoolean.class, PBBoolean.Builder.class);
            }

            private Builder() {
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (PBBoolean.alwaysUseFieldBuilders) {
                }

            }

            public PBBoolean.Builder clear() {
                super.clear();
                this.value_ = false;
                return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Resources.internal_static_aapt_pb_Boolean_descriptor;
            }

            public PBBoolean getDefaultInstanceForType() {
                return PBBoolean.getDefaultInstance();
            }

            public PBBoolean build() {
                PBBoolean result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public PBBoolean buildPartial() {
                PBBoolean result = new PBBoolean(this);
                result.value_ = this.value_;
                this.onBuilt();
                return result;
            }

            public PBBoolean.Builder clone() {
                return (PBBoolean.Builder)super.clone();
            }

            public PBBoolean.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (PBBoolean.Builder)super.setField(field, value);
            }

            public PBBoolean.Builder clearField(Descriptors.FieldDescriptor field) {
                return (PBBoolean.Builder)super.clearField(field);
            }

            public PBBoolean.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (PBBoolean.Builder)super.clearOneof(oneof);
            }

            public PBBoolean.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (PBBoolean.Builder)super.setRepeatedField(field, index, value);
            }

            public PBBoolean.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (PBBoolean.Builder)super.addRepeatedField(field, value);
            }

            public PBBoolean.Builder mergeFrom(Message other) {
                if (other instanceof PBBoolean) {
                    return this.mergeFrom((PBBoolean)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public PBBoolean.Builder mergeFrom(PBBoolean other) {
                if (other == PBBoolean.getDefaultInstance()) {
                    return this;
                } else {
                    if (other.getValue()) {
                        this.setValue(other.getValue());
                    }

                    this.mergeUnknownFields(other.unknownFields);
                    this.onChanged();
                    return this;
                }
            }

            public final boolean isInitialized() {
                return true;
            }

            public PBBoolean.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                PBBoolean parsedMessage = null;

                try {
                    parsedMessage = (PBBoolean) PBBoolean.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (PBBoolean)var8.getUnfinishedMessage();
                    throw var8.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }

                }

                return this;
            }

            public boolean getValue() {
                return this.value_;
            }

            public PBBoolean.Builder setValue(boolean value) {
                this.value_ = value;
                this.onChanged();
                return this;
            }

            public PBBoolean.Builder clearValue() {
                this.value_ = false;
                this.onChanged();
                return this;
            }

            public final PBBoolean.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (PBBoolean.Builder)super.setUnknownFields(unknownFields);
            }

            public final PBBoolean.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (PBBoolean.Builder)super.mergeUnknownFields(unknownFields);
            }
        }
    }