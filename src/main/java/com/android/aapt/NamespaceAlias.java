package com.android.aapt;

import com.google.protobuf.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class NamespaceAlias extends GeneratedMessageV3 implements com.android.aapt.NamespaceAliasOrBuilder {
        private static final long serialVersionUID = 0L;
        public static final int PREFIX_FIELD_NUMBER = 1;
        private volatile Object prefix_;
        public static final int PACKAGE_NAME_FIELD_NUMBER = 2;
        private volatile Object packageName_;
        public static final int IS_PRIVATE_FIELD_NUMBER = 3;
        private boolean isPrivate_;
        private byte memoizedIsInitialized;
        private static final com.android.aapt.NamespaceAlias DEFAULT_INSTANCE = new com.android.aapt.NamespaceAlias();
        private static final Parser<com.android.aapt.NamespaceAlias> PARSER = new AbstractParser<com.android.aapt.NamespaceAlias>() {
            public com.android.aapt.NamespaceAlias parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new com.android.aapt.NamespaceAlias(input, extensionRegistry);
            }
        };

        private NamespaceAlias(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private NamespaceAlias() {
            this.memoizedIsInitialized = -1;
            this.prefix_ = "";
            this.packageName_ = "";
        }

        @Override
        public Object newInstance(UnusedPrivateParameter unused) {
            return new com.android.aapt.NamespaceAlias();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private NamespaceAlias(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                this.prefix_ = s;
                                break;
                            case 18:
                                s = input.readStringRequireUtf8();
                                this.packageName_ = s;
                                break;
                            case 24:
                                this.isPrivate_ = input.readBool();
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
            return Resources.internal_static_aapt_pb_NamespaceAlias_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_NamespaceAlias_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.NamespaceAlias.class, com.android.aapt.NamespaceAlias.Builder.class);
        }

        public java.lang.String getPrefix() {
            Object ref = this.prefix_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String)ref;
            } else {
                ByteString bs = (ByteString)ref;
                java.lang.String s = bs.toStringUtf8();
                this.prefix_ = s;
                return s;
            }
        }

        public ByteString getPrefixBytes() {
            Object ref = this.prefix_;
            if (ref instanceof java.lang.String) {
                ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                this.prefix_ = b;
                return b;
            } else {
                return (ByteString)ref;
            }
        }

        public java.lang.String getPackageName() {
            Object ref = this.packageName_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String)ref;
            } else {
                ByteString bs = (ByteString)ref;
                java.lang.String s = bs.toStringUtf8();
                this.packageName_ = s;
                return s;
            }
        }

        public ByteString getPackageNameBytes() {
            Object ref = this.packageName_;
            if (ref instanceof java.lang.String) {
                ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                this.packageName_ = b;
                return b;
            } else {
                return (ByteString)ref;
            }
        }

        public boolean getIsPrivate() {
            return this.isPrivate_;
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
            if (!this.getPrefixBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 1, this.prefix_);
            }

            if (!this.getPackageNameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 2, this.packageName_);
            }

            if (this.isPrivate_) {
                output.writeBool(3, this.isPrivate_);
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
                if (!this.getPrefixBytes().isEmpty()) {
                    size += GeneratedMessageV3.computeStringSize(1, this.prefix_);
                }

                if (!this.getPackageNameBytes().isEmpty()) {
                    size += GeneratedMessageV3.computeStringSize(2, this.packageName_);
                }

                if (this.isPrivate_) {
                    size += CodedOutputStream.computeBoolSize(3, this.isPrivate_);
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
            } else if (!(obj instanceof com.android.aapt.NamespaceAlias)) {
                return super.equals(obj);
            } else {
                com.android.aapt.NamespaceAlias other = (com.android.aapt.NamespaceAlias)obj;
                if (!this.getPrefix().equals(other.getPrefix())) {
                    return false;
                } else if (!this.getPackageName().equals(other.getPackageName())) {
                    return false;
                } else if (this.getIsPrivate() != other.getIsPrivate()) {
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
                hash = 53 * hash + this.getPrefix().hashCode();
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getPackageName().hashCode();
                hash = 37 * hash + 3;
                hash = 53 * hash + Internal.hashBoolean(this.getIsPrivate());
                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static com.android.aapt.NamespaceAlias parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (com.android.aapt.NamespaceAlias)PARSER.parseFrom(data);
        }

        public static com.android.aapt.NamespaceAlias parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.NamespaceAlias)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.NamespaceAlias parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (com.android.aapt.NamespaceAlias)PARSER.parseFrom(data);
        }

        public static com.android.aapt.NamespaceAlias parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.NamespaceAlias)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.NamespaceAlias parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (com.android.aapt.NamespaceAlias)PARSER.parseFrom(data);
        }

        public static com.android.aapt.NamespaceAlias parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.NamespaceAlias)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.NamespaceAlias parseFrom(InputStream input) throws IOException {
            return (com.android.aapt.NamespaceAlias)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.NamespaceAlias parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.NamespaceAlias)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.NamespaceAlias parseDelimitedFrom(InputStream input) throws IOException {
            return (com.android.aapt.NamespaceAlias)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static com.android.aapt.NamespaceAlias parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.NamespaceAlias)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.NamespaceAlias parseFrom(CodedInputStream input) throws IOException {
            return (com.android.aapt.NamespaceAlias)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.NamespaceAlias parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.NamespaceAlias)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public com.android.aapt.NamespaceAlias.Builder newBuilderForType() {
            return newBuilder();
        }

        public static com.android.aapt.NamespaceAlias.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static com.android.aapt.NamespaceAlias.Builder newBuilder(com.android.aapt.NamespaceAlias prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public com.android.aapt.NamespaceAlias.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new com.android.aapt.NamespaceAlias.Builder() : (new com.android.aapt.NamespaceAlias.Builder()).mergeFrom(this);
        }

        public com.android.aapt.NamespaceAlias.Builder newBuilderForType(BuilderParent parent) {
            com.android.aapt.NamespaceAlias.Builder builder = new com.android.aapt.NamespaceAlias.Builder(parent);
            return builder;
        }

        public static com.android.aapt.NamespaceAlias getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<com.android.aapt.NamespaceAlias> parser() {
            return PARSER;
        }

        public Parser<com.android.aapt.NamespaceAlias> getParserForType() {
            return PARSER;
        }

        public com.android.aapt.NamespaceAlias getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.NamespaceAlias.Builder> implements com.android.aapt.NamespaceAliasOrBuilder {
            private Object prefix_;
            private Object packageName_;
            private boolean isPrivate_;

            public static Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_NamespaceAlias_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_NamespaceAlias_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.NamespaceAlias.class, com.android.aapt.NamespaceAlias.Builder.class);
            }

            private Builder() {
                this.prefix_ = "";
                this.packageName_ = "";
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.prefix_ = "";
                this.packageName_ = "";
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.android.aapt.NamespaceAlias.alwaysUseFieldBuilders) {
                }

            }

            public com.android.aapt.NamespaceAlias.Builder clear() {
                super.clear();
                this.prefix_ = "";
                this.packageName_ = "";
                this.isPrivate_ = false;
                return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Resources.internal_static_aapt_pb_NamespaceAlias_descriptor;
            }

            public com.android.aapt.NamespaceAlias getDefaultInstanceForType() {
                return com.android.aapt.NamespaceAlias.getDefaultInstance();
            }

            public com.android.aapt.NamespaceAlias build() {
                com.android.aapt.NamespaceAlias result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public com.android.aapt.NamespaceAlias buildPartial() {
                com.android.aapt.NamespaceAlias result = new com.android.aapt.NamespaceAlias(this);
                result.prefix_ = this.prefix_;
                result.packageName_ = this.packageName_;
                result.isPrivate_ = this.isPrivate_;
                this.onBuilt();
                return result;
            }

            public com.android.aapt.NamespaceAlias.Builder clone() {
                return (com.android.aapt.NamespaceAlias.Builder)super.clone();
            }

            public com.android.aapt.NamespaceAlias.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.NamespaceAlias.Builder)super.setField(field, value);
            }

            public com.android.aapt.NamespaceAlias.Builder clearField(Descriptors.FieldDescriptor field) {
                return (com.android.aapt.NamespaceAlias.Builder)super.clearField(field);
            }

            public com.android.aapt.NamespaceAlias.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (com.android.aapt.NamespaceAlias.Builder)super.clearOneof(oneof);
            }

            public com.android.aapt.NamespaceAlias.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (com.android.aapt.NamespaceAlias.Builder)super.setRepeatedField(field, index, value);
            }

            public com.android.aapt.NamespaceAlias.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.NamespaceAlias.Builder)super.addRepeatedField(field, value);
            }

            public com.android.aapt.NamespaceAlias.Builder mergeFrom(Message other) {
                if (other instanceof com.android.aapt.NamespaceAlias) {
                    return this.mergeFrom((com.android.aapt.NamespaceAlias)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public com.android.aapt.NamespaceAlias.Builder mergeFrom(com.android.aapt.NamespaceAlias other) {
                if (other == com.android.aapt.NamespaceAlias.getDefaultInstance()) {
                    return this;
                } else {
                    if (!other.getPrefix().isEmpty()) {
                        this.prefix_ = other.prefix_;
                        this.onChanged();
                    }

                    if (!other.getPackageName().isEmpty()) {
                        this.packageName_ = other.packageName_;
                        this.onChanged();
                    }

                    if (other.getIsPrivate()) {
                        this.setIsPrivate(other.getIsPrivate());
                    }

                    this.mergeUnknownFields(other.unknownFields);
                    this.onChanged();
                    return this;
                }
            }

            public final boolean isInitialized() {
                return true;
            }

            public com.android.aapt.NamespaceAlias.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                com.android.aapt.NamespaceAlias parsedMessage = null;

                try {
                    parsedMessage = (com.android.aapt.NamespaceAlias)com.android.aapt.NamespaceAlias.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (com.android.aapt.NamespaceAlias)var8.getUnfinishedMessage();
                    throw var8.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }

                }

                return this;
            }

            public java.lang.String getPrefix() {
                Object ref = this.prefix_;
                if (!(ref instanceof java.lang.String)) {
                    ByteString bs = (ByteString)ref;
                    java.lang.String s = bs.toStringUtf8();
                    this.prefix_ = s;
                    return s;
                } else {
                    return (java.lang.String)ref;
                }
            }

            public ByteString getPrefixBytes() {
                Object ref = this.prefix_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                    this.prefix_ = b;
                    return b;
                } else {
                    return (ByteString)ref;
                }
            }

            public com.android.aapt.NamespaceAlias.Builder setPrefix(java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.prefix_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public com.android.aapt.NamespaceAlias.Builder clearPrefix() {
                this.prefix_ = com.android.aapt.NamespaceAlias.getDefaultInstance().getPrefix();
                this.onChanged();
                return this;
            }

            public com.android.aapt.NamespaceAlias.Builder setPrefixBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    com.android.aapt.NamespaceAlias.checkByteStringIsUtf8(value);
                    this.prefix_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public java.lang.String getPackageName() {
                Object ref = this.packageName_;
                if (!(ref instanceof java.lang.String)) {
                    ByteString bs = (ByteString)ref;
                    java.lang.String s = bs.toStringUtf8();
                    this.packageName_ = s;
                    return s;
                } else {
                    return (java.lang.String)ref;
                }
            }

            public ByteString getPackageNameBytes() {
                Object ref = this.packageName_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                    this.packageName_ = b;
                    return b;
                } else {
                    return (ByteString)ref;
                }
            }

            public com.android.aapt.NamespaceAlias.Builder setPackageName(java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.packageName_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public com.android.aapt.NamespaceAlias.Builder clearPackageName() {
                this.packageName_ = com.android.aapt.NamespaceAlias.getDefaultInstance().getPackageName();
                this.onChanged();
                return this;
            }

            public com.android.aapt.NamespaceAlias.Builder setPackageNameBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    com.android.aapt.NamespaceAlias.checkByteStringIsUtf8(value);
                    this.packageName_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public boolean getIsPrivate() {
                return this.isPrivate_;
            }

            public com.android.aapt.NamespaceAlias.Builder setIsPrivate(boolean value) {
                this.isPrivate_ = value;
                this.onChanged();
                return this;
            }

            public com.android.aapt.NamespaceAlias.Builder clearIsPrivate() {
                this.isPrivate_ = false;
                this.onChanged();
                return this;
            }

            public final com.android.aapt.NamespaceAlias.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.NamespaceAlias.Builder)super.setUnknownFields(unknownFields);
            }

            public final com.android.aapt.NamespaceAlias.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.NamespaceAlias.Builder)super.mergeUnknownFields(unknownFields);
            }
        }
    }