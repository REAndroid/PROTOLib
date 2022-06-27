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

public class StagedId extends GeneratedMessageV3 implements com.android.aapt.StagedIdOrBuilder {
        private static final long serialVersionUID = 0L;
        public static final int SOURCE_FIELD_NUMBER = 1;
        private com.android.aapt.Source source_;
        public static final int STAGED_ID_FIELD_NUMBER = 2;
        private int stagedId_;
        private byte memoizedIsInitialized;
        private static final com.android.aapt.StagedId DEFAULT_INSTANCE = new com.android.aapt.StagedId();
        private static final Parser<com.android.aapt.StagedId> PARSER = new AbstractParser<com.android.aapt.StagedId>() {
            public com.android.aapt.StagedId parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new com.android.aapt.StagedId(input, extensionRegistry);
            }
        };

        private StagedId(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private StagedId() {
            this.memoizedIsInitialized = -1;
        }

        @Override
        public Object newInstance(UnusedPrivateParameter unused) {
            return new com.android.aapt.StagedId();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private StagedId(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            case 16:
                                this.stagedId_ = input.readUInt32();
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
            return Resources.internal_static_aapt_pb_StagedId_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_StagedId_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.StagedId.class, com.android.aapt.StagedId.Builder.class);
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

        public int getStagedId() {
            return this.stagedId_;
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
            if (this.source_ != null) {
                output.writeMessage(1, this.getSource());
            }

            if (this.stagedId_ != 0) {
                output.writeUInt32(2, this.stagedId_);
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
                if (this.source_ != null) {
                    size += CodedOutputStream.computeMessageSize(1, this.getSource());
                }

                if (this.stagedId_ != 0) {
                    size += CodedOutputStream.computeUInt32Size(2, this.stagedId_);
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
            } else if (!(obj instanceof com.android.aapt.StagedId)) {
                return super.equals(obj);
            } else {
                com.android.aapt.StagedId other = (com.android.aapt.StagedId)obj;
                if (this.hasSource() != other.hasSource()) {
                    return false;
                } else if (this.hasSource() && !this.getSource().equals(other.getSource())) {
                    return false;
                } else if (this.getStagedId() != other.getStagedId()) {
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
                if (this.hasSource()) {
                    hash = 37 * hash + 1;
                    hash = 53 * hash + this.getSource().hashCode();
                }

                hash = 37 * hash + 2;
                hash = 53 * hash + this.getStagedId();
                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static com.android.aapt.StagedId parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (com.android.aapt.StagedId)PARSER.parseFrom(data);
        }

        public static com.android.aapt.StagedId parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.StagedId)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.StagedId parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (com.android.aapt.StagedId)PARSER.parseFrom(data);
        }

        public static com.android.aapt.StagedId parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.StagedId)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.StagedId parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (com.android.aapt.StagedId)PARSER.parseFrom(data);
        }

        public static com.android.aapt.StagedId parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.StagedId)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.StagedId parseFrom(InputStream input) throws IOException {
            return (com.android.aapt.StagedId)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.StagedId parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.StagedId)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.StagedId parseDelimitedFrom(InputStream input) throws IOException {
            return (com.android.aapt.StagedId)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static com.android.aapt.StagedId parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.StagedId)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.StagedId parseFrom(CodedInputStream input) throws IOException {
            return (com.android.aapt.StagedId)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.StagedId parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.StagedId)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public com.android.aapt.StagedId.Builder newBuilderForType() {
            return newBuilder();
        }

        public static com.android.aapt.StagedId.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static com.android.aapt.StagedId.Builder newBuilder(com.android.aapt.StagedId prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public com.android.aapt.StagedId.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new com.android.aapt.StagedId.Builder() : (new com.android.aapt.StagedId.Builder()).mergeFrom(this);
        }

        public com.android.aapt.StagedId.Builder newBuilderForType(BuilderParent parent) {
            com.android.aapt.StagedId.Builder builder = new com.android.aapt.StagedId.Builder(parent);
            return builder;
        }

        public static com.android.aapt.StagedId getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<com.android.aapt.StagedId> parser() {
            return PARSER;
        }

        public Parser<com.android.aapt.StagedId> getParserForType() {
            return PARSER;
        }

        public com.android.aapt.StagedId getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.StagedId.Builder> implements com.android.aapt.StagedIdOrBuilder {
            private com.android.aapt.Source source_;
            private SingleFieldBuilderV3<com.android.aapt.Source, com.android.aapt.Source.Builder, com.android.aapt.SourceOrBuilder> sourceBuilder_;
            private int stagedId_;

            public static Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_StagedId_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_StagedId_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.StagedId.class, com.android.aapt.StagedId.Builder.class);
            }

            private Builder() {
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.android.aapt.StagedId.alwaysUseFieldBuilders) {
                }

            }

            public com.android.aapt.StagedId.Builder clear() {
                super.clear();
                if (this.sourceBuilder_ == null) {
                    this.source_ = null;
                } else {
                    this.source_ = null;
                    this.sourceBuilder_ = null;
                }

                this.stagedId_ = 0;
                return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Resources.internal_static_aapt_pb_StagedId_descriptor;
            }

            public com.android.aapt.StagedId getDefaultInstanceForType() {
                return com.android.aapt.StagedId.getDefaultInstance();
            }

            public com.android.aapt.StagedId build() {
                com.android.aapt.StagedId result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public com.android.aapt.StagedId buildPartial() {
                com.android.aapt.StagedId result = new com.android.aapt.StagedId(this);
                if (this.sourceBuilder_ == null) {
                    result.source_ = this.source_;
                } else {
                    result.source_ = (com.android.aapt.Source)this.sourceBuilder_.build();
                }

                result.stagedId_ = this.stagedId_;
                this.onBuilt();
                return result;
            }

            public com.android.aapt.StagedId.Builder clone() {
                return (com.android.aapt.StagedId.Builder)super.clone();
            }

            public com.android.aapt.StagedId.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.StagedId.Builder)super.setField(field, value);
            }

            public com.android.aapt.StagedId.Builder clearField(Descriptors.FieldDescriptor field) {
                return (com.android.aapt.StagedId.Builder)super.clearField(field);
            }

            public com.android.aapt.StagedId.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (com.android.aapt.StagedId.Builder)super.clearOneof(oneof);
            }

            public com.android.aapt.StagedId.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (com.android.aapt.StagedId.Builder)super.setRepeatedField(field, index, value);
            }

            public com.android.aapt.StagedId.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.StagedId.Builder)super.addRepeatedField(field, value);
            }

            public com.android.aapt.StagedId.Builder mergeFrom(Message other) {
                if (other instanceof com.android.aapt.StagedId) {
                    return this.mergeFrom((com.android.aapt.StagedId)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public com.android.aapt.StagedId.Builder mergeFrom(com.android.aapt.StagedId other) {
                if (other == com.android.aapt.StagedId.getDefaultInstance()) {
                    return this;
                } else {
                    if (other.hasSource()) {
                        this.mergeSource(other.getSource());
                    }

                    if (other.getStagedId() != 0) {
                        this.setStagedId(other.getStagedId());
                    }

                    this.mergeUnknownFields(other.unknownFields);
                    this.onChanged();
                    return this;
                }
            }

            public final boolean isInitialized() {
                return true;
            }

            public com.android.aapt.StagedId.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                com.android.aapt.StagedId parsedMessage = null;

                try {
                    parsedMessage = (com.android.aapt.StagedId)com.android.aapt.StagedId.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (com.android.aapt.StagedId)var8.getUnfinishedMessage();
                    throw var8.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }

                }

                return this;
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

            public com.android.aapt.StagedId.Builder setSource(com.android.aapt.Source value) {
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

            public com.android.aapt.StagedId.Builder setSource(com.android.aapt.Source.Builder builderForValue) {
                if (this.sourceBuilder_ == null) {
                    this.source_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.sourceBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.StagedId.Builder mergeSource(com.android.aapt.Source value) {
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

            public com.android.aapt.StagedId.Builder clearSource() {
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

            public int getStagedId() {
                return this.stagedId_;
            }

            public com.android.aapt.StagedId.Builder setStagedId(int value) {
                this.stagedId_ = value;
                this.onChanged();
                return this;
            }

            public com.android.aapt.StagedId.Builder clearStagedId() {
                this.stagedId_ = 0;
                this.onChanged();
                return this;
            }

            public final com.android.aapt.StagedId.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.StagedId.Builder)super.setUnknownFields(unknownFields);
            }

            public final com.android.aapt.StagedId.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.StagedId.Builder)super.mergeUnknownFields(unknownFields);
            }
        }
    }