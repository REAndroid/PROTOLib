package com.android.aapt;

import com.google.protobuf.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class Overlayable extends GeneratedMessageV3 implements com.android.aapt.OverlayableOrBuilder {
        private static final long serialVersionUID = 0L;
        public static final int NAME_FIELD_NUMBER = 1;
        private volatile Object name_;
        public static final int SOURCE_FIELD_NUMBER = 2;
        private com.android.aapt.Source source_;
        public static final int ACTOR_FIELD_NUMBER = 3;
        private volatile Object actor_;
        private byte memoizedIsInitialized;
        private static final com.android.aapt.Overlayable DEFAULT_INSTANCE = new com.android.aapt.Overlayable();
        private static final Parser<com.android.aapt.Overlayable> PARSER = new AbstractParser<com.android.aapt.Overlayable>() {
            public com.android.aapt.Overlayable parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new com.android.aapt.Overlayable(input, extensionRegistry);
            }
        };

        private Overlayable(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private Overlayable() {
            this.memoizedIsInitialized = -1;
            this.name_ = "";
            this.actor_ = "";
        }

        @Override
        public Object newInstance(UnusedPrivateParameter unused) {
            return new com.android.aapt.Overlayable();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Overlayable(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                this.name_ = s;
                                break;
                            case 18:
                                com.android.aapt.Source.Builder subBuilder = null;
                                if (this.source_ != null) {
                                    subBuilder = this.source_.toBuilder();
                                }

                                this.source_ = (com.android.aapt.Source)input.readMessage(com.android.aapt.Source.parser(), extensionRegistry);
                                if (subBuilder != null) {
                                    subBuilder.mergeFrom(this.source_);
                                    this.source_ = subBuilder.buildPartial();
                                }
                                break;
                            case 26:
                                s = input.readStringRequireUtf8();
                                this.actor_ = s;
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
            return Resources.internal_static_aapt_pb_Overlayable_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_Overlayable_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.Overlayable.class, com.android.aapt.Overlayable.Builder.class);
        }

        public java.lang.String getName() {
            Object ref = this.name_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String)ref;
            } else {
                ByteString bs = (ByteString)ref;
                java.lang.String s = bs.toStringUtf8();
                this.name_ = s;
                return s;
            }
        }

        public ByteString getNameBytes() {
            Object ref = this.name_;
            if (ref instanceof java.lang.String) {
                ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                this.name_ = b;
                return b;
            } else {
                return (ByteString)ref;
            }
        }

        public boolean hasSource() {
            return this.source_ != null;
        }

        public com.android.aapt.Source getSource() {
            return this.source_ == null ? com.android.aapt.Source.getDefaultInstance() : this.source_;
        }

        public com.android.aapt.SourceOrBuilder getSourceOrBuilder() {
            return this.getSource();
        }

        public java.lang.String getActor() {
            Object ref = this.actor_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String)ref;
            } else {
                ByteString bs = (ByteString)ref;
                java.lang.String s = bs.toStringUtf8();
                this.actor_ = s;
                return s;
            }
        }

        public ByteString getActorBytes() {
            Object ref = this.actor_;
            if (ref instanceof java.lang.String) {
                ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                this.actor_ = b;
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
            if (!this.getNameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 1, this.name_);
            }

            if (this.source_ != null) {
                output.writeMessage(2, this.getSource());
            }

            if (!this.getActorBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 3, this.actor_);
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
                if (!this.getNameBytes().isEmpty()) {
                    size += GeneratedMessageV3.computeStringSize(1, this.name_);
                }

                if (this.source_ != null) {
                    size += CodedOutputStream.computeMessageSize(2, this.getSource());
                }

                if (!this.getActorBytes().isEmpty()) {
                    size += GeneratedMessageV3.computeStringSize(3, this.actor_);
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
            } else if (!(obj instanceof com.android.aapt.Overlayable)) {
                return super.equals(obj);
            } else {
                com.android.aapt.Overlayable other = (com.android.aapt.Overlayable)obj;
                if (!this.getName().equals(other.getName())) {
                    return false;
                } else if (this.hasSource() != other.hasSource()) {
                    return false;
                } else if (this.hasSource() && !this.getSource().equals(other.getSource())) {
                    return false;
                } else if (!this.getActor().equals(other.getActor())) {
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
                hash = 53 * hash + this.getName().hashCode();
                if (this.hasSource()) {
                    hash = 37 * hash + 2;
                    hash = 53 * hash + this.getSource().hashCode();
                }

                hash = 37 * hash + 3;
                hash = 53 * hash + this.getActor().hashCode();
                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static com.android.aapt.Overlayable parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Overlayable)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Overlayable parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Overlayable)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Overlayable parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Overlayable)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Overlayable parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Overlayable)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Overlayable parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Overlayable)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Overlayable parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Overlayable)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Overlayable parseFrom(InputStream input) throws IOException {
            return (com.android.aapt.Overlayable)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.Overlayable parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Overlayable)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.Overlayable parseDelimitedFrom(InputStream input) throws IOException {
            return (com.android.aapt.Overlayable)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static com.android.aapt.Overlayable parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Overlayable)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.Overlayable parseFrom(CodedInputStream input) throws IOException {
            return (com.android.aapt.Overlayable)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.Overlayable parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Overlayable)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public com.android.aapt.Overlayable.Builder newBuilderForType() {
            return newBuilder();
        }

        public static com.android.aapt.Overlayable.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static com.android.aapt.Overlayable.Builder newBuilder(com.android.aapt.Overlayable prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public com.android.aapt.Overlayable.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new com.android.aapt.Overlayable.Builder() : (new com.android.aapt.Overlayable.Builder()).mergeFrom(this);
        }

        public com.android.aapt.Overlayable.Builder newBuilderForType(BuilderParent parent) {
            com.android.aapt.Overlayable.Builder builder = new com.android.aapt.Overlayable.Builder(parent);
            return builder;
        }

        public static com.android.aapt.Overlayable getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<com.android.aapt.Overlayable> parser() {
            return PARSER;
        }

        public Parser<com.android.aapt.Overlayable> getParserForType() {
            return PARSER;
        }

        public com.android.aapt.Overlayable getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.Overlayable.Builder> implements com.android.aapt.OverlayableOrBuilder {
            private Object name_;
            private com.android.aapt.Source source_;
            private SingleFieldBuilderV3<com.android.aapt.Source, com.android.aapt.Source.Builder, com.android.aapt.SourceOrBuilder> sourceBuilder_;
            private Object actor_;

            public static Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_Overlayable_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_Overlayable_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.Overlayable.class, com.android.aapt.Overlayable.Builder.class);
            }

            private Builder() {
                this.name_ = "";
                this.actor_ = "";
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.name_ = "";
                this.actor_ = "";
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.android.aapt.Overlayable.alwaysUseFieldBuilders) {
                }

            }

            public com.android.aapt.Overlayable.Builder clear() {
                super.clear();
                this.name_ = "";
                if (this.sourceBuilder_ == null) {
                    this.source_ = null;
                } else {
                    this.source_ = null;
                    this.sourceBuilder_ = null;
                }

                this.actor_ = "";
                return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Resources.internal_static_aapt_pb_Overlayable_descriptor;
            }

            public com.android.aapt.Overlayable getDefaultInstanceForType() {
                return com.android.aapt.Overlayable.getDefaultInstance();
            }

            public com.android.aapt.Overlayable build() {
                com.android.aapt.Overlayable result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public com.android.aapt.Overlayable buildPartial() {
                com.android.aapt.Overlayable result = new com.android.aapt.Overlayable(this);
                result.name_ = this.name_;
                if (this.sourceBuilder_ == null) {
                    result.source_ = this.source_;
                } else {
                    result.source_ = (com.android.aapt.Source)this.sourceBuilder_.build();
                }

                result.actor_ = this.actor_;
                this.onBuilt();
                return result;
            }

            public com.android.aapt.Overlayable.Builder clone() {
                return (com.android.aapt.Overlayable.Builder)super.clone();
            }

            public com.android.aapt.Overlayable.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.Overlayable.Builder)super.setField(field, value);
            }

            public com.android.aapt.Overlayable.Builder clearField(Descriptors.FieldDescriptor field) {
                return (com.android.aapt.Overlayable.Builder)super.clearField(field);
            }

            public com.android.aapt.Overlayable.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (com.android.aapt.Overlayable.Builder)super.clearOneof(oneof);
            }

            public com.android.aapt.Overlayable.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (com.android.aapt.Overlayable.Builder)super.setRepeatedField(field, index, value);
            }

            public com.android.aapt.Overlayable.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.Overlayable.Builder)super.addRepeatedField(field, value);
            }

            public com.android.aapt.Overlayable.Builder mergeFrom(Message other) {
                if (other instanceof com.android.aapt.Overlayable) {
                    return this.mergeFrom((com.android.aapt.Overlayable)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public com.android.aapt.Overlayable.Builder mergeFrom(com.android.aapt.Overlayable other) {
                if (other == com.android.aapt.Overlayable.getDefaultInstance()) {
                    return this;
                } else {
                    if (!other.getName().isEmpty()) {
                        this.name_ = other.name_;
                        this.onChanged();
                    }

                    if (other.hasSource()) {
                        this.mergeSource(other.getSource());
                    }

                    if (!other.getActor().isEmpty()) {
                        this.actor_ = other.actor_;
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

            public com.android.aapt.Overlayable.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                com.android.aapt.Overlayable parsedMessage = null;

                try {
                    parsedMessage = (com.android.aapt.Overlayable)com.android.aapt.Overlayable.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (com.android.aapt.Overlayable)var8.getUnfinishedMessage();
                    throw var8.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }

                }

                return this;
            }

            public java.lang.String getName() {
                Object ref = this.name_;
                if (!(ref instanceof java.lang.String)) {
                    ByteString bs = (ByteString)ref;
                    java.lang.String s = bs.toStringUtf8();
                    this.name_ = s;
                    return s;
                } else {
                    return (java.lang.String)ref;
                }
            }

            public ByteString getNameBytes() {
                Object ref = this.name_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                    this.name_ = b;
                    return b;
                } else {
                    return (ByteString)ref;
                }
            }

            public com.android.aapt.Overlayable.Builder setName(java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.name_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public com.android.aapt.Overlayable.Builder clearName() {
                this.name_ = com.android.aapt.Overlayable.getDefaultInstance().getName();
                this.onChanged();
                return this;
            }

            public com.android.aapt.Overlayable.Builder setNameBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    com.android.aapt.Overlayable.checkByteStringIsUtf8(value);
                    this.name_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public boolean hasSource() {
                return this.sourceBuilder_ != null || this.source_ != null;
            }

            public com.android.aapt.Source getSource() {
                if (this.sourceBuilder_ == null) {
                    return this.source_ == null ? com.android.aapt.Source.getDefaultInstance() : this.source_;
                } else {
                    return (com.android.aapt.Source)this.sourceBuilder_.getMessage();
                }
            }

            public com.android.aapt.Overlayable.Builder setSource(com.android.aapt.Source value) {
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

            public com.android.aapt.Overlayable.Builder setSource(com.android.aapt.Source.Builder builderForValue) {
                if (this.sourceBuilder_ == null) {
                    this.source_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.sourceBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.Overlayable.Builder mergeSource(com.android.aapt.Source value) {
                if (this.sourceBuilder_ == null) {
                    if (this.source_ != null) {
                        this.source_ = com.android.aapt.Source.newBuilder(this.source_).mergeFrom(value).buildPartial();
                    } else {
                        this.source_ = value;
                    }

                    this.onChanged();
                } else {
                    this.sourceBuilder_.mergeFrom(value);
                }

                return this;
            }

            public com.android.aapt.Overlayable.Builder clearSource() {
                if (this.sourceBuilder_ == null) {
                    this.source_ = null;
                    this.onChanged();
                } else {
                    this.source_ = null;
                    this.sourceBuilder_ = null;
                }

                return this;
            }

            public com.android.aapt.Source.Builder getSourceBuilder() {
                this.onChanged();
                return (com.android.aapt.Source.Builder)this.getSourceFieldBuilder().getBuilder();
            }

            public com.android.aapt.SourceOrBuilder getSourceOrBuilder() {
                if (this.sourceBuilder_ != null) {
                    return (com.android.aapt.SourceOrBuilder)this.sourceBuilder_.getMessageOrBuilder();
                } else {
                    return this.source_ == null ? com.android.aapt.Source.getDefaultInstance() : this.source_;
                }
            }

            private SingleFieldBuilderV3<com.android.aapt.Source, com.android.aapt.Source.Builder, com.android.aapt.SourceOrBuilder> getSourceFieldBuilder() {
                if (this.sourceBuilder_ == null) {
                    this.sourceBuilder_ = new SingleFieldBuilderV3(this.getSource(), this.getParentForChildren(), this.isClean());
                    this.source_ = null;
                }

                return this.sourceBuilder_;
            }

            public java.lang.String getActor() {
                Object ref = this.actor_;
                if (!(ref instanceof java.lang.String)) {
                    ByteString bs = (ByteString)ref;
                    java.lang.String s = bs.toStringUtf8();
                    this.actor_ = s;
                    return s;
                } else {
                    return (java.lang.String)ref;
                }
            }

            public ByteString getActorBytes() {
                Object ref = this.actor_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                    this.actor_ = b;
                    return b;
                } else {
                    return (ByteString)ref;
                }
            }

            public com.android.aapt.Overlayable.Builder setActor(java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.actor_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public com.android.aapt.Overlayable.Builder clearActor() {
                this.actor_ = com.android.aapt.Overlayable.getDefaultInstance().getActor();
                this.onChanged();
                return this;
            }

            public com.android.aapt.Overlayable.Builder setActorBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    com.android.aapt.Overlayable.checkByteStringIsUtf8(value);
                    this.actor_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public final com.android.aapt.Overlayable.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.Overlayable.Builder)super.setUnknownFields(unknownFields);
            }

            public final com.android.aapt.Overlayable.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.Overlayable.Builder)super.mergeUnknownFields(unknownFields);
            }
        }
    }