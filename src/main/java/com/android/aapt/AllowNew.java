package com.android.aapt;

import com.google.protobuf.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class AllowNew extends GeneratedMessageV3 implements AllowNewOrBuilder {
    private static final long serialVersionUID = 0L;
    public static final int SOURCE_FIELD_NUMBER = 1;
    public static final int COMMENT_FIELD_NUMBER = 2;
    private com.android.aapt.Source source_;
    private volatile Object comment_;
    private byte memoizedIsInitialized;
    private static final AllowNew DEFAULT_INSTANCE = new AllowNew();
    private static final Parser<AllowNew> PARSER = new AbstractParser<AllowNew>() {
        public AllowNew parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new AllowNew(input, extensionRegistry);
        }
    };

    private AllowNew(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }
    private AllowNew() {
        this.memoizedIsInitialized = -1;
        this.comment_ = "";
    }
    private AllowNew(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                            this.source_ = input.readMessage(Source.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.source_);
                                this.source_ = subBuilder.buildPartial();
                            }
                            break;
                        case 18:
                            this.comment_ = input.readStringRequireUtf8();
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



    @Override
    public Object newInstance(UnusedPrivateParameter unused) {
            return new AllowNew();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        public static  Descriptors.Descriptor getDescriptor() {
            return Resources.internal_static_aapt_pb_AllowNew_descriptor;
        }

        @Override
        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_AllowNew_fieldAccessorTable.ensureFieldAccessorsInitialized(AllowNew.class, AllowNew.Builder.class);
        }
        @Override
        public boolean hasSource() {
            return this.source_ != null;
        }

        @Override
        public com.android.aapt.Source getSource() {
            return this.source_ == null ? com.android.aapt.Source.getDefaultInstance() : this.source_;
        }
        @Override
        public com.android.aapt.SourceOrBuilder getSourceOrBuilder() {
            return this.getSource();
        }

        @Override
        public java.lang.String getComment() {
            Object ref = this.comment_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String)ref;
            } else {
                ByteString bs = (ByteString)ref;
                java.lang.String s = bs.toStringUtf8();
                this.comment_ = s;
                return s;
            }
        }

        @Override
        public ByteString getCommentBytes() {
            Object ref = this.comment_;
            if (ref instanceof java.lang.String) {
                ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                this.comment_ = b;
                return b;
            } else {
                return (ByteString)ref;
            }
        }

        @Override
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
                output.writeMessage(SOURCE_FIELD_NUMBER, this.getSource());
            }

            if (!this.getCommentBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, COMMENT_FIELD_NUMBER, this.comment_);
            }

            this.unknownFields.writeTo(output);
        }
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if (this.source_ != null) {
                size += CodedOutputStream.computeMessageSize(SOURCE_FIELD_NUMBER, this.getSource());
            }

            if (!this.getCommentBytes().isEmpty()) {
                size += GeneratedMessageV3.computeStringSize(COMMENT_FIELD_NUMBER, this.comment_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
        }
        @Override
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            } else if (!(obj instanceof AllowNew)) {
                return super.equals(obj);
            } else {
                AllowNew other = (AllowNew)obj;
                if (this.hasSource() != other.hasSource()) {
                    return false;
                } else if (this.hasSource() && !this.getSource().equals(other.getSource())) {
                    return false;
                } else if (!this.getComment().equals(other.getComment())) {
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
                hash = 53 * hash + this.getComment().hashCode();
                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static AllowNew parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AllowNew parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AllowNew parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AllowNew parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AllowNew parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AllowNew parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AllowNew parseFrom(InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static AllowNew parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static AllowNew parseDelimitedFrom(InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static AllowNew parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static AllowNew parseFrom(CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static AllowNew parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public AllowNew.Builder newBuilderForType() {
            return newBuilder();
        }

        public static AllowNew.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AllowNew.Builder newBuilder(AllowNew prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public AllowNew.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new AllowNew.Builder() : (new AllowNew.Builder()).mergeFrom(this);
        }

        public AllowNew.Builder newBuilderForType(BuilderParent parent) {
            return new AllowNew.Builder(parent);
        }

        public static AllowNew getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<AllowNew> parser() {
            return PARSER;
        }

        public Parser<AllowNew> getParserForType() {
            return PARSER;
        }

        public AllowNew getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<AllowNew.Builder> implements AllowNewOrBuilder {
            private com.android.aapt.Source source_;
            private SingleFieldBuilderV3<com.android.aapt.Source, com.android.aapt.Source.Builder, com.android.aapt.SourceOrBuilder> sourceBuilder_;
            private Object comment_;

            public static  Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_AllowNew_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_AllowNew_fieldAccessorTable.ensureFieldAccessorsInitialized(AllowNew.class, AllowNew.Builder.class);
            }

            private Builder() {
                this.comment_ = "";
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.comment_ = "";
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (AllowNew.alwaysUseFieldBuilders) {
                }

            }

            public AllowNew.Builder clear() {
                super.clear();
                if (this.sourceBuilder_ == null) {
                    this.source_ = null;
                } else {
                    this.source_ = null;
                    this.sourceBuilder_ = null;
                }

                this.comment_ = "";
                return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Resources.internal_static_aapt_pb_AllowNew_descriptor;
            }

            public AllowNew getDefaultInstanceForType() {
                return AllowNew.getDefaultInstance();
            }

            public AllowNew build() {
                AllowNew result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public AllowNew buildPartial() {
                AllowNew result = new AllowNew(this);
                if (this.sourceBuilder_ == null) {
                    result.source_ = this.source_;
                } else {
                    result.source_ = this.sourceBuilder_.build();
                }

                result.comment_ = this.comment_;
                this.onBuilt();
                return result;
            }

            @Override
            public AllowNew.Builder clone() {
                return super.clone();
            }
            @Override
            public AllowNew.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return super.setField(field, value);
            }
            @Override
            public AllowNew.Builder clearField(Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            @Override
            public AllowNew.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            @Override
            public AllowNew.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return super.setRepeatedField(field, index, value);
            }
            @Override
            public AllowNew.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return super.addRepeatedField(field, value);
            }
            @Override
            public AllowNew.Builder mergeFrom(Message other) {
                if (other instanceof AllowNew) {
                    return this.mergeFrom((AllowNew)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }
            public AllowNew.Builder mergeFrom(AllowNew other) {
                if (other == AllowNew.getDefaultInstance()) {
                    return this;
                } else {
                    if (other.hasSource()) {
                        this.mergeSource(other.getSource());
                    }

                    if (!other.getComment().isEmpty()) {
                        this.comment_ = other.comment_;
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

            public AllowNew.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                AllowNew parsedMessage = null;

                try {
                    parsedMessage = AllowNew.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (AllowNew)var8.getUnfinishedMessage();
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
                    return this.sourceBuilder_.getMessage();
                }
            }

            public AllowNew.Builder setSource(com.android.aapt.Source value) {
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

            public AllowNew.Builder setSource(com.android.aapt.Source.Builder builderForValue) {
                if (this.sourceBuilder_ == null) {
                    this.source_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.sourceBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            public AllowNew.Builder mergeSource(com.android.aapt.Source value) {
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

            public AllowNew.Builder clearSource() {
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
                return this.getSourceFieldBuilder().getBuilder();
            }

            public com.android.aapt.SourceOrBuilder getSourceOrBuilder() {
                if (this.sourceBuilder_ != null) {
                    return this.sourceBuilder_.getMessageOrBuilder();
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

            @Override
            public java.lang.String getComment() {
                Object ref = this.comment_;
                if (!(ref instanceof java.lang.String)) {
                    ByteString bs = (ByteString)ref;
                    java.lang.String s = bs.toStringUtf8();
                    this.comment_ = s;
                    return s;
                } else {
                    return (java.lang.String)ref;
                }
            }

            public ByteString getCommentBytes() {
                Object ref = this.comment_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                    this.comment_ = b;
                    return b;
                } else {
                    return (ByteString)ref;
                }
            }

            public AllowNew.Builder setComment(java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.comment_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public AllowNew.Builder clearComment() {
                this.comment_ = AllowNew.getDefaultInstance().getComment();
                this.onChanged();
                return this;
            }

            public AllowNew.Builder setCommentBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    AllowNew.checkByteStringIsUtf8(value);
                    this.comment_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public final AllowNew.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            public final AllowNew.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }