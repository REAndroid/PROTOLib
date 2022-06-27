package com.android.aapt;

import com.google.protobuf.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class XmlNamespace extends GeneratedMessageV3 implements com.android.aapt.XmlNamespaceOrBuilder {
        private static final long serialVersionUID = 0L;
        public static final int PREFIX_FIELD_NUMBER = 1;
        private volatile Object prefix_;
        public static final int URI_FIELD_NUMBER = 2;
        private volatile Object uri_;
        public static final int SOURCE_FIELD_NUMBER = 3;
        private com.android.aapt.SourcePosition source_;
        private byte memoizedIsInitialized;
        private static final com.android.aapt.XmlNamespace DEFAULT_INSTANCE = new com.android.aapt.XmlNamespace();
        private static final Parser<com.android.aapt.XmlNamespace> PARSER = new AbstractParser<com.android.aapt.XmlNamespace>() {
            public com.android.aapt.XmlNamespace parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new com.android.aapt.XmlNamespace(input, extensionRegistry);
            }
        };

        private XmlNamespace(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private XmlNamespace() {
            this.memoizedIsInitialized = -1;
            this.prefix_ = "";
            this.uri_ = "";
        }

        @Override
        public Object newInstance(UnusedPrivateParameter unused) {
            return new com.android.aapt.XmlNamespace();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private XmlNamespace(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                this.uri_ = s;
                                break;
                            case 26:
                                com.android.aapt.SourcePosition.Builder subBuilder = null;
                                if (this.source_ != null) {
                                    subBuilder = this.source_.toBuilder();
                                }

                                this.source_ = (com.android.aapt.SourcePosition)input.readMessage(com.android.aapt.SourcePosition.parser(), extensionRegistry);
                                if (subBuilder != null) {
                                    subBuilder.mergeFrom(this.source_);
                                    this.source_ = subBuilder.buildPartial();
                                }
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
            return Resources.internal_static_aapt_pb_XmlNamespace_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_XmlNamespace_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.XmlNamespace.class, com.android.aapt.XmlNamespace.Builder.class);
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

        public java.lang.String getUri() {
            Object ref = this.uri_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String)ref;
            } else {
                ByteString bs = (ByteString)ref;
                java.lang.String s = bs.toStringUtf8();
                this.uri_ = s;
                return s;
            }
        }

        public ByteString getUriBytes() {
            Object ref = this.uri_;
            if (ref instanceof java.lang.String) {
                ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                this.uri_ = b;
                return b;
            } else {
                return (ByteString)ref;
            }
        }

        public boolean hasSource() {
            return this.source_ != null;
        }

        public com.android.aapt.SourcePosition getSource() {
            return this.source_ == null ? com.android.aapt.SourcePosition.getDefaultInstance() : this.source_;
        }

        public com.android.aapt.SourcePositionOrBuilder getSourceOrBuilder() {
            return this.getSource();
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

            if (!this.getUriBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 2, this.uri_);
            }

            if (this.source_ != null) {
                output.writeMessage(3, this.getSource());
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

                if (!this.getUriBytes().isEmpty()) {
                    size += GeneratedMessageV3.computeStringSize(2, this.uri_);
                }

                if (this.source_ != null) {
                    size += CodedOutputStream.computeMessageSize(3, this.getSource());
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
            } else if (!(obj instanceof com.android.aapt.XmlNamespace)) {
                return super.equals(obj);
            } else {
                com.android.aapt.XmlNamespace other = (com.android.aapt.XmlNamespace)obj;
                if (!this.getPrefix().equals(other.getPrefix())) {
                    return false;
                } else if (!this.getUri().equals(other.getUri())) {
                    return false;
                } else if (this.hasSource() != other.hasSource()) {
                    return false;
                } else if (this.hasSource() && !this.getSource().equals(other.getSource())) {
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
                hash = 53 * hash + this.getUri().hashCode();
                if (this.hasSource()) {
                    hash = 37 * hash + 3;
                    hash = 53 * hash + this.getSource().hashCode();
                }

                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static com.android.aapt.XmlNamespace parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (com.android.aapt.XmlNamespace)PARSER.parseFrom(data);
        }

        public static com.android.aapt.XmlNamespace parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.XmlNamespace)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.XmlNamespace parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (com.android.aapt.XmlNamespace)PARSER.parseFrom(data);
        }

        public static com.android.aapt.XmlNamespace parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.XmlNamespace)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.XmlNamespace parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (com.android.aapt.XmlNamespace)PARSER.parseFrom(data);
        }

        public static com.android.aapt.XmlNamespace parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.XmlNamespace)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.XmlNamespace parseFrom(InputStream input) throws IOException {
            return (com.android.aapt.XmlNamespace)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.XmlNamespace parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.XmlNamespace)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.XmlNamespace parseDelimitedFrom(InputStream input) throws IOException {
            return (com.android.aapt.XmlNamespace)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static com.android.aapt.XmlNamespace parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.XmlNamespace)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.XmlNamespace parseFrom(CodedInputStream input) throws IOException {
            return (com.android.aapt.XmlNamespace)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.XmlNamespace parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.XmlNamespace)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public com.android.aapt.XmlNamespace.Builder newBuilderForType() {
            return newBuilder();
        }

        public static com.android.aapt.XmlNamespace.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static com.android.aapt.XmlNamespace.Builder newBuilder(com.android.aapt.XmlNamespace prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public com.android.aapt.XmlNamespace.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new com.android.aapt.XmlNamespace.Builder() : (new com.android.aapt.XmlNamespace.Builder()).mergeFrom(this);
        }

        public com.android.aapt.XmlNamespace.Builder newBuilderForType(BuilderParent parent) {
            com.android.aapt.XmlNamespace.Builder builder = new com.android.aapt.XmlNamespace.Builder(parent);
            return builder;
        }

        public static com.android.aapt.XmlNamespace getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<com.android.aapt.XmlNamespace> parser() {
            return PARSER;
        }

        public Parser<com.android.aapt.XmlNamespace> getParserForType() {
            return PARSER;
        }

        public com.android.aapt.XmlNamespace getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.XmlNamespace.Builder> implements com.android.aapt.XmlNamespaceOrBuilder {
            private Object prefix_;
            private Object uri_;
            private com.android.aapt.SourcePosition source_;
            private SingleFieldBuilderV3<com.android.aapt.SourcePosition, com.android.aapt.SourcePosition.Builder, com.android.aapt.SourcePositionOrBuilder> sourceBuilder_;

            public static Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_XmlNamespace_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_XmlNamespace_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.XmlNamespace.class, com.android.aapt.XmlNamespace.Builder.class);
            }

            private Builder() {
                this.prefix_ = "";
                this.uri_ = "";
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.prefix_ = "";
                this.uri_ = "";
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.android.aapt.XmlNamespace.alwaysUseFieldBuilders) {
                }

            }

            public com.android.aapt.XmlNamespace.Builder clear() {
                super.clear();
                this.prefix_ = "";
                this.uri_ = "";
                if (this.sourceBuilder_ == null) {
                    this.source_ = null;
                } else {
                    this.source_ = null;
                    this.sourceBuilder_ = null;
                }

                return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Resources.internal_static_aapt_pb_XmlNamespace_descriptor;
            }

            public com.android.aapt.XmlNamespace getDefaultInstanceForType() {
                return com.android.aapt.XmlNamespace.getDefaultInstance();
            }

            public com.android.aapt.XmlNamespace build() {
                com.android.aapt.XmlNamespace result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public com.android.aapt.XmlNamespace buildPartial() {
                com.android.aapt.XmlNamespace result = new com.android.aapt.XmlNamespace(this);
                result.prefix_ = this.prefix_;
                result.uri_ = this.uri_;
                if (this.sourceBuilder_ == null) {
                    result.source_ = this.source_;
                } else {
                    result.source_ = (com.android.aapt.SourcePosition)this.sourceBuilder_.build();
                }

                this.onBuilt();
                return result;
            }

            public com.android.aapt.XmlNamespace.Builder clone() {
                return (com.android.aapt.XmlNamespace.Builder)super.clone();
            }

            public com.android.aapt.XmlNamespace.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.XmlNamespace.Builder)super.setField(field, value);
            }

            public com.android.aapt.XmlNamespace.Builder clearField(Descriptors.FieldDescriptor field) {
                return (com.android.aapt.XmlNamespace.Builder)super.clearField(field);
            }

            public com.android.aapt.XmlNamespace.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (com.android.aapt.XmlNamespace.Builder)super.clearOneof(oneof);
            }

            public com.android.aapt.XmlNamespace.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (com.android.aapt.XmlNamespace.Builder)super.setRepeatedField(field, index, value);
            }

            public com.android.aapt.XmlNamespace.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.XmlNamespace.Builder)super.addRepeatedField(field, value);
            }

            public com.android.aapt.XmlNamespace.Builder mergeFrom(Message other) {
                if (other instanceof com.android.aapt.XmlNamespace) {
                    return this.mergeFrom((com.android.aapt.XmlNamespace)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public com.android.aapt.XmlNamespace.Builder mergeFrom(com.android.aapt.XmlNamespace other) {
                if (other == com.android.aapt.XmlNamespace.getDefaultInstance()) {
                    return this;
                } else {
                    if (!other.getPrefix().isEmpty()) {
                        this.prefix_ = other.prefix_;
                        this.onChanged();
                    }

                    if (!other.getUri().isEmpty()) {
                        this.uri_ = other.uri_;
                        this.onChanged();
                    }

                    if (other.hasSource()) {
                        this.mergeSource(other.getSource());
                    }

                    this.mergeUnknownFields(other.unknownFields);
                    this.onChanged();
                    return this;
                }
            }

            public final boolean isInitialized() {
                return true;
            }

            public com.android.aapt.XmlNamespace.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                com.android.aapt.XmlNamespace parsedMessage = null;

                try {
                    parsedMessage = (com.android.aapt.XmlNamespace)com.android.aapt.XmlNamespace.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (com.android.aapt.XmlNamespace)var8.getUnfinishedMessage();
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

            public com.android.aapt.XmlNamespace.Builder setPrefix(java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.prefix_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public com.android.aapt.XmlNamespace.Builder clearPrefix() {
                this.prefix_ = com.android.aapt.XmlNamespace.getDefaultInstance().getPrefix();
                this.onChanged();
                return this;
            }

            public com.android.aapt.XmlNamespace.Builder setPrefixBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    com.android.aapt.XmlNamespace.checkByteStringIsUtf8(value);
                    this.prefix_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public java.lang.String getUri() {
                Object ref = this.uri_;
                if (!(ref instanceof java.lang.String)) {
                    ByteString bs = (ByteString)ref;
                    java.lang.String s = bs.toStringUtf8();
                    this.uri_ = s;
                    return s;
                } else {
                    return (java.lang.String)ref;
                }
            }

            public ByteString getUriBytes() {
                Object ref = this.uri_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                    this.uri_ = b;
                    return b;
                } else {
                    return (ByteString)ref;
                }
            }

            public com.android.aapt.XmlNamespace.Builder setUri(java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.uri_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public com.android.aapt.XmlNamespace.Builder clearUri() {
                this.uri_ = com.android.aapt.XmlNamespace.getDefaultInstance().getUri();
                this.onChanged();
                return this;
            }

            public com.android.aapt.XmlNamespace.Builder setUriBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    com.android.aapt.XmlNamespace.checkByteStringIsUtf8(value);
                    this.uri_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public boolean hasSource() {
                return this.sourceBuilder_ != null || this.source_ != null;
            }

            public com.android.aapt.SourcePosition getSource() {
                if (this.sourceBuilder_ == null) {
                    return this.source_ == null ? com.android.aapt.SourcePosition.getDefaultInstance() : this.source_;
                } else {
                    return (com.android.aapt.SourcePosition)this.sourceBuilder_.getMessage();
                }
            }

            public com.android.aapt.XmlNamespace.Builder setSource(com.android.aapt.SourcePosition value) {
                if (this.sourceBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.source_ = value;
                    this.onChanged();
                } else {
                    this.sourceBuilder_.setMessage(value);
                }

                return this;
            }

            public com.android.aapt.XmlNamespace.Builder setSource(com.android.aapt.SourcePosition.Builder builderForValue) {
                if (this.sourceBuilder_ == null) {
                    this.source_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.sourceBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.XmlNamespace.Builder mergeSource(com.android.aapt.SourcePosition value) {
                if (this.sourceBuilder_ == null) {
                    if (this.source_ != null) {
                        this.source_ = com.android.aapt.SourcePosition.newBuilder(this.source_).mergeFrom(value).buildPartial();
                    } else {
                        this.source_ = value;
                    }

                    this.onChanged();
                } else {
                    this.sourceBuilder_.mergeFrom(value);
                }

                return this;
            }

            public com.android.aapt.XmlNamespace.Builder clearSource() {
                if (this.sourceBuilder_ == null) {
                    this.source_ = null;
                    this.onChanged();
                } else {
                    this.source_ = null;
                    this.sourceBuilder_ = null;
                }

                return this;
            }

            public com.android.aapt.SourcePosition.Builder getSourceBuilder() {
                this.onChanged();
                return (com.android.aapt.SourcePosition.Builder)this.getSourceFieldBuilder().getBuilder();
            }

            public com.android.aapt.SourcePositionOrBuilder getSourceOrBuilder() {
                if (this.sourceBuilder_ != null) {
                    return (com.android.aapt.SourcePositionOrBuilder)this.sourceBuilder_.getMessageOrBuilder();
                } else {
                    return this.source_ == null ? com.android.aapt.SourcePosition.getDefaultInstance() : this.source_;
                }
            }

            private SingleFieldBuilderV3<com.android.aapt.SourcePosition, com.android.aapt.SourcePosition.Builder, com.android.aapt.SourcePositionOrBuilder> getSourceFieldBuilder() {
                if (this.sourceBuilder_ == null) {
                    this.sourceBuilder_ = new SingleFieldBuilderV3(this.getSource(), this.getParentForChildren(), this.isClean());
                    this.source_ = null;
                }

                return this.sourceBuilder_;
            }

            public final com.android.aapt.XmlNamespace.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.XmlNamespace.Builder)super.setUnknownFields(unknownFields);
            }

            public final com.android.aapt.XmlNamespace.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.XmlNamespace.Builder)super.mergeUnknownFields(unknownFields);
            }
        }
    }