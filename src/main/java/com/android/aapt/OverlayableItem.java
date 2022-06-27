package com.android.aapt;

import com.google.protobuf.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class OverlayableItem extends GeneratedMessageV3 implements com.android.aapt.OverlayableItemOrBuilder {
        private static final long serialVersionUID = 0L;
        public static final int SOURCE_FIELD_NUMBER = 1;
        private com.android.aapt.Source source_;
        public static final int COMMENT_FIELD_NUMBER = 2;
        private volatile Object comment_;
        public static final int POLICY_FIELD_NUMBER = 3;
        private List<Integer> policy_;
        private static final Internal.ListAdapter.Converter<Integer, Policy> policy_converter_ = new Internal.ListAdapter.Converter<Integer, Policy>() {
            public com.android.aapt.OverlayableItem.Policy convert(Integer from) {
                com.android.aapt.OverlayableItem.Policy result = com.android.aapt.OverlayableItem.Policy.valueOf(from);
                return result == null ? com.android.aapt.OverlayableItem.Policy.UNRECOGNIZED : result;
            }
        };
        private int policyMemoizedSerializedSize;
        public static final int OVERLAYABLE_IDX_FIELD_NUMBER = 4;
        private int overlayableIdx_;
        private byte memoizedIsInitialized;
        private static final com.android.aapt.OverlayableItem DEFAULT_INSTANCE = new com.android.aapt.OverlayableItem();
        private static final Parser<com.android.aapt.OverlayableItem> PARSER = new AbstractParser<com.android.aapt.OverlayableItem>() {
            public com.android.aapt.OverlayableItem parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new com.android.aapt.OverlayableItem(input, extensionRegistry);
            }
        };

        private OverlayableItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private OverlayableItem() {
            this.memoizedIsInitialized = -1;
            this.comment_ = "";
            this.policy_ = Collections.emptyList();
        }

        @Override
        public Object newInstance(UnusedPrivateParameter unused) {
            return new com.android.aapt.OverlayableItem();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private OverlayableItem(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            } else {
                boolean mutable_bitField0_ = false;
                com.google.protobuf.UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

                try {
                    boolean done = false;

                    while(!done) {
                        int tag = input.readTag();
                        int rawValue;
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
                            case 18:
                                java.lang.String s = input.readStringRequireUtf8();
                                this.comment_ = s;
                                break;
                            case 24:
                                rawValue = input.readEnum();
                                if (!(mutable_bitField0_ & true)) {
                                    this.policy_ = new ArrayList();
                                    mutable_bitField0_ |= true;
                                }

                                this.policy_.add(rawValue);
                                break;
                            case 26:
                                rawValue = input.readRawVarint32();
                                int oldLimit = input.pushLimit(rawValue);

                                for(; input.getBytesUntilLimit() > 0; this.policy_.add(rawValue)) {
                                    rawValue = input.readEnum();
                                    if (!(mutable_bitField0_ & true)) {
                                        this.policy_ = new ArrayList();
                                        mutable_bitField0_ |= true;
                                    }
                                }

                                input.popLimit(oldLimit);
                                break;
                            case 32:
                                this.overlayableIdx_ = input.readUInt32();
                                break;
                            default:
                                if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                        }
                    }
                } catch (InvalidProtocolBufferException var14) {
                    throw var14.setUnfinishedMessage(this);
                } catch (IOException var15) {
                    throw (new InvalidProtocolBufferException(var15)).setUnfinishedMessage(this);
                } finally {
                    if (mutable_bitField0_ & true) {
                        this.policy_ = Collections.unmodifiableList(this.policy_);
                    }

                    this.unknownFields = unknownFields.build();
                    this.makeExtensionsImmutable();
                }

            }
        }

        public static Descriptors.Descriptor getDescriptor() {
            return Resources.internal_static_aapt_pb_OverlayableItem_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_OverlayableItem_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.OverlayableItem.class, com.android.aapt.OverlayableItem.Builder.class);
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

        public List<com.android.aapt.OverlayableItem.Policy> getPolicyList() {
            return new Internal.ListAdapter(this.policy_, policy_converter_);
        }

        public int getPolicyCount() {
            return this.policy_.size();
        }

        public com.android.aapt.OverlayableItem.Policy getPolicy(int index) {
            return (com.android.aapt.OverlayableItem.Policy)policy_converter_.convert((Integer)this.policy_.get(index));
        }

        public List<Integer> getPolicyValueList() {
            return this.policy_;
        }

        public int getPolicyValue(int index) {
            return (Integer)this.policy_.get(index);
        }

        public int getOverlayableIdx() {
            return this.overlayableIdx_;
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
            this.getSerializedSize();
            if (this.source_ != null) {
                output.writeMessage(1, this.getSource());
            }

            if (!this.getCommentBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 2, this.comment_);
            }

            if (this.getPolicyList().size() > 0) {
                output.writeUInt32NoTag(26);
                output.writeUInt32NoTag(this.policyMemoizedSerializedSize);
            }

            for(int i = 0; i < this.policy_.size(); ++i) {
                output.writeEnumNoTag((Integer)this.policy_.get(i));
            }

            if (this.overlayableIdx_ != 0) {
                output.writeUInt32(4, this.overlayableIdx_);
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

                if (!this.getCommentBytes().isEmpty()) {
                    size += GeneratedMessageV3.computeStringSize(2, this.comment_);
                }

                int dataSize = 0;

                for(int i = 0; i < this.policy_.size(); ++i) {
                    dataSize += CodedOutputStream.computeEnumSizeNoTag((Integer)this.policy_.get(i));
                }

                size += dataSize;
                if (!this.getPolicyList().isEmpty()) {
                    ++size;
                    size += CodedOutputStream.computeUInt32SizeNoTag(dataSize);
                }

                this.policyMemoizedSerializedSize = dataSize;
                if (this.overlayableIdx_ != 0) {
                    size += CodedOutputStream.computeUInt32Size(4, this.overlayableIdx_);
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
            } else if (!(obj instanceof com.android.aapt.OverlayableItem)) {
                return super.equals(obj);
            } else {
                com.android.aapt.OverlayableItem other = (com.android.aapt.OverlayableItem)obj;
                if (this.hasSource() != other.hasSource()) {
                    return false;
                } else if (this.hasSource() && !this.getSource().equals(other.getSource())) {
                    return false;
                } else if (!this.getComment().equals(other.getComment())) {
                    return false;
                } else if (!this.policy_.equals(other.policy_)) {
                    return false;
                } else if (this.getOverlayableIdx() != other.getOverlayableIdx()) {
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
                if (this.getPolicyCount() > 0) {
                    hash = 37 * hash + 3;
                    hash = 53 * hash + this.policy_.hashCode();
                }

                hash = 37 * hash + 4;
                hash = 53 * hash + this.getOverlayableIdx();
                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static com.android.aapt.OverlayableItem parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (com.android.aapt.OverlayableItem)PARSER.parseFrom(data);
        }

        public static com.android.aapt.OverlayableItem parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.OverlayableItem)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.OverlayableItem parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (com.android.aapt.OverlayableItem)PARSER.parseFrom(data);
        }

        public static com.android.aapt.OverlayableItem parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.OverlayableItem)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.OverlayableItem parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (com.android.aapt.OverlayableItem)PARSER.parseFrom(data);
        }

        public static com.android.aapt.OverlayableItem parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.OverlayableItem)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.OverlayableItem parseFrom(InputStream input) throws IOException {
            return (com.android.aapt.OverlayableItem)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.OverlayableItem parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.OverlayableItem)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.OverlayableItem parseDelimitedFrom(InputStream input) throws IOException {
            return (com.android.aapt.OverlayableItem)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static com.android.aapt.OverlayableItem parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.OverlayableItem)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.OverlayableItem parseFrom(CodedInputStream input) throws IOException {
            return (com.android.aapt.OverlayableItem)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.OverlayableItem parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.OverlayableItem)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public com.android.aapt.OverlayableItem.Builder newBuilderForType() {
            return newBuilder();
        }

        public static com.android.aapt.OverlayableItem.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static com.android.aapt.OverlayableItem.Builder newBuilder(com.android.aapt.OverlayableItem prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public com.android.aapt.OverlayableItem.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new com.android.aapt.OverlayableItem.Builder() : (new com.android.aapt.OverlayableItem.Builder()).mergeFrom(this);
        }

        public com.android.aapt.OverlayableItem.Builder newBuilderForType(BuilderParent parent) {
            com.android.aapt.OverlayableItem.Builder builder = new com.android.aapt.OverlayableItem.Builder(parent);
            return builder;
        }

        public static com.android.aapt.OverlayableItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<com.android.aapt.OverlayableItem> parser() {
            return PARSER;
        }

        public Parser<com.android.aapt.OverlayableItem> getParserForType() {
            return PARSER;
        }

        public com.android.aapt.OverlayableItem getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.OverlayableItem.Builder> implements com.android.aapt.OverlayableItemOrBuilder {
            private int bitField0_;
            private com.android.aapt.Source source_;
            private SingleFieldBuilderV3<com.android.aapt.Source, com.android.aapt.Source.Builder, com.android.aapt.SourceOrBuilder> sourceBuilder_;
            private Object comment_;
            private List<Integer> policy_;
            private int overlayableIdx_;

            public static Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_OverlayableItem_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_OverlayableItem_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.OverlayableItem.class, com.android.aapt.OverlayableItem.Builder.class);
            }

            private Builder() {
                this.comment_ = "";
                this.policy_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.comment_ = "";
                this.policy_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.android.aapt.OverlayableItem.alwaysUseFieldBuilders) {
                }

            }

            public com.android.aapt.OverlayableItem.Builder clear() {
                super.clear();
                if (this.sourceBuilder_ == null) {
                    this.source_ = null;
                } else {
                    this.source_ = null;
                    this.sourceBuilder_ = null;
                }

                this.comment_ = "";
                this.policy_ = Collections.emptyList();
                this.bitField0_ &= -2;
                this.overlayableIdx_ = 0;
                return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Resources.internal_static_aapt_pb_OverlayableItem_descriptor;
            }

            public com.android.aapt.OverlayableItem getDefaultInstanceForType() {
                return com.android.aapt.OverlayableItem.getDefaultInstance();
            }

            public com.android.aapt.OverlayableItem build() {
                com.android.aapt.OverlayableItem result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public com.android.aapt.OverlayableItem buildPartial() {
                com.android.aapt.OverlayableItem result = new com.android.aapt.OverlayableItem(this);
                int from_bitField0_ = this.bitField0_;
                if (this.sourceBuilder_ == null) {
                    result.source_ = this.source_;
                } else {
                    result.source_ = (com.android.aapt.Source)this.sourceBuilder_.build();
                }

                result.comment_ = this.comment_;
                if ((this.bitField0_ & 1) != 0) {
                    this.policy_ = Collections.unmodifiableList(this.policy_);
                    this.bitField0_ &= -2;
                }

                result.policy_ = this.policy_;
                result.overlayableIdx_ = this.overlayableIdx_;
                this.onBuilt();
                return result;
            }

            public com.android.aapt.OverlayableItem.Builder clone() {
                return (com.android.aapt.OverlayableItem.Builder)super.clone();
            }

            public com.android.aapt.OverlayableItem.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.OverlayableItem.Builder)super.setField(field, value);
            }

            public com.android.aapt.OverlayableItem.Builder clearField(Descriptors.FieldDescriptor field) {
                return (com.android.aapt.OverlayableItem.Builder)super.clearField(field);
            }

            public com.android.aapt.OverlayableItem.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (com.android.aapt.OverlayableItem.Builder)super.clearOneof(oneof);
            }

            public com.android.aapt.OverlayableItem.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (com.android.aapt.OverlayableItem.Builder)super.setRepeatedField(field, index, value);
            }

            public com.android.aapt.OverlayableItem.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.OverlayableItem.Builder)super.addRepeatedField(field, value);
            }

            public com.android.aapt.OverlayableItem.Builder mergeFrom(Message other) {
                if (other instanceof com.android.aapt.OverlayableItem) {
                    return this.mergeFrom((com.android.aapt.OverlayableItem)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public com.android.aapt.OverlayableItem.Builder mergeFrom(com.android.aapt.OverlayableItem other) {
                if (other == com.android.aapt.OverlayableItem.getDefaultInstance()) {
                    return this;
                } else {
                    if (other.hasSource()) {
                        this.mergeSource(other.getSource());
                    }

                    if (!other.getComment().isEmpty()) {
                        this.comment_ = other.comment_;
                        this.onChanged();
                    }

                    if (!other.policy_.isEmpty()) {
                        if (this.policy_.isEmpty()) {
                            this.policy_ = other.policy_;
                            this.bitField0_ &= -2;
                        } else {
                            this.ensurePolicyIsMutable();
                            this.policy_.addAll(other.policy_);
                        }

                        this.onChanged();
                    }

                    if (other.getOverlayableIdx() != 0) {
                        this.setOverlayableIdx(other.getOverlayableIdx());
                    }

                    this.mergeUnknownFields(other.unknownFields);
                    this.onChanged();
                    return this;
                }
            }

            public final boolean isInitialized() {
                return true;
            }

            public com.android.aapt.OverlayableItem.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                com.android.aapt.OverlayableItem parsedMessage = null;

                try {
                    parsedMessage = (com.android.aapt.OverlayableItem)com.android.aapt.OverlayableItem.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (com.android.aapt.OverlayableItem)var8.getUnfinishedMessage();
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

            public com.android.aapt.OverlayableItem.Builder setSource(com.android.aapt.Source value) {
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

            public com.android.aapt.OverlayableItem.Builder setSource(com.android.aapt.Source.Builder builderForValue) {
                if (this.sourceBuilder_ == null) {
                    this.source_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.sourceBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.OverlayableItem.Builder mergeSource(com.android.aapt.Source value) {
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

            public com.android.aapt.OverlayableItem.Builder clearSource() {
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

            public com.android.aapt.OverlayableItem.Builder setComment(java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.comment_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public com.android.aapt.OverlayableItem.Builder clearComment() {
                this.comment_ = com.android.aapt.OverlayableItem.getDefaultInstance().getComment();
                this.onChanged();
                return this;
            }

            public com.android.aapt.OverlayableItem.Builder setCommentBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    com.android.aapt.OverlayableItem.checkByteStringIsUtf8(value);
                    this.comment_ = value;
                    this.onChanged();
                    return this;
                }
            }

            private void ensurePolicyIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.policy_ = new ArrayList(this.policy_);
                    this.bitField0_ |= 1;
                }

            }

            public List<com.android.aapt.OverlayableItem.Policy> getPolicyList() {
                return new Internal.ListAdapter(this.policy_, com.android.aapt.OverlayableItem.policy_converter_);
            }

            public int getPolicyCount() {
                return this.policy_.size();
            }

            public com.android.aapt.OverlayableItem.Policy getPolicy(int index) {
                return (com.android.aapt.OverlayableItem.Policy)com.android.aapt.OverlayableItem.policy_converter_.convert((Integer)this.policy_.get(index));
            }

            public com.android.aapt.OverlayableItem.Builder setPolicy(int index, com.android.aapt.OverlayableItem.Policy value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.ensurePolicyIsMutable();
                    this.policy_.set(index, value.getNumber());
                    this.onChanged();
                    return this;
                }
            }

            public com.android.aapt.OverlayableItem.Builder addPolicy(com.android.aapt.OverlayableItem.Policy value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.ensurePolicyIsMutable();
                    this.policy_.add(value.getNumber());
                    this.onChanged();
                    return this;
                }
            }

            public com.android.aapt.OverlayableItem.Builder addAllPolicy(Iterable<? extends com.android.aapt.OverlayableItem.Policy> values) {
                this.ensurePolicyIsMutable();
                Iterator var2 = values.iterator();

                while(var2.hasNext()) {
                    com.android.aapt.OverlayableItem.Policy value = (com.android.aapt.OverlayableItem.Policy)var2.next();
                    this.policy_.add(value.getNumber());
                }

                this.onChanged();
                return this;
            }

            public com.android.aapt.OverlayableItem.Builder clearPolicy() {
                this.policy_ = Collections.emptyList();
                this.bitField0_ &= -2;
                this.onChanged();
                return this;
            }

            public List<Integer> getPolicyValueList() {
                return Collections.unmodifiableList(this.policy_);
            }

            public int getPolicyValue(int index) {
                return (Integer)this.policy_.get(index);
            }

            public com.android.aapt.OverlayableItem.Builder setPolicyValue(int index, int value) {
                this.ensurePolicyIsMutable();
                this.policy_.set(index, value);
                this.onChanged();
                return this;
            }

            public com.android.aapt.OverlayableItem.Builder addPolicyValue(int value) {
                this.ensurePolicyIsMutable();
                this.policy_.add(value);
                this.onChanged();
                return this;
            }

            public com.android.aapt.OverlayableItem.Builder addAllPolicyValue(Iterable<Integer> values) {
                this.ensurePolicyIsMutable();
                Iterator var2 = values.iterator();

                while(var2.hasNext()) {
                    int value = (Integer)var2.next();
                    this.policy_.add(value);
                }

                this.onChanged();
                return this;
            }

            public int getOverlayableIdx() {
                return this.overlayableIdx_;
            }

            public com.android.aapt.OverlayableItem.Builder setOverlayableIdx(int value) {
                this.overlayableIdx_ = value;
                this.onChanged();
                return this;
            }

            public com.android.aapt.OverlayableItem.Builder clearOverlayableIdx() {
                this.overlayableIdx_ = 0;
                this.onChanged();
                return this;
            }

            public final com.android.aapt.OverlayableItem.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.OverlayableItem.Builder)super.setUnknownFields(unknownFields);
            }

            public final com.android.aapt.OverlayableItem.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.OverlayableItem.Builder)super.mergeUnknownFields(unknownFields);
            }
        }

        public static enum Policy implements ProtocolMessageEnum {
            NONE(0),
            PUBLIC(1),
            SYSTEM(2),
            VENDOR(3),
            PRODUCT(4),
            SIGNATURE(5),
            ODM(6),
            OEM(7),
            ACTOR(8),
            CONFIG_SIGNATURE(9),
            UNRECOGNIZED(-1);

            public static final int NONE_VALUE = 0;
            public static final int PUBLIC_VALUE = 1;
            public static final int SYSTEM_VALUE = 2;
            public static final int VENDOR_VALUE = 3;
            public static final int PRODUCT_VALUE = 4;
            public static final int SIGNATURE_VALUE = 5;
            public static final int ODM_VALUE = 6;
            public static final int OEM_VALUE = 7;
            public static final int ACTOR_VALUE = 8;
            public static final int CONFIG_SIGNATURE_VALUE = 9;
            private static final Internal.EnumLiteMap<Policy> internalValueMap = new Internal.EnumLiteMap<Policy>() {
                public com.android.aapt.OverlayableItem.Policy findValueByNumber(int number) {
                    return com.android.aapt.OverlayableItem.Policy.forNumber(number);
                }
            };
            private static final com.android.aapt.OverlayableItem.Policy[] VALUES = values();
            private final int value;

            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                } else {
                    return this.value;
                }
            }

            /** @deprecated */
            @Deprecated
            public static com.android.aapt.OverlayableItem.Policy valueOf(int value) {
                return forNumber(value);
            }

            public static com.android.aapt.OverlayableItem.Policy forNumber(int value) {
                switch(value) {
                    case 0:
                        return NONE;
                    case 1:
                        return PUBLIC;
                    case 2:
                        return SYSTEM;
                    case 3:
                        return VENDOR;
                    case 4:
                        return PRODUCT;
                    case 5:
                        return SIGNATURE;
                    case 6:
                        return ODM;
                    case 7:
                        return OEM;
                    case 8:
                        return ACTOR;
                    case 9:
                        return CONFIG_SIGNATURE;
                    default:
                        return null;
                }
            }

            public static Internal.EnumLiteMap<Policy> internalGetValueMap() {
                return internalValueMap;
            }

            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
            }

            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return (Descriptors.EnumDescriptor)com.android.aapt.OverlayableItem.getDescriptor().getEnumTypes().get(0);
            }

            public static com.android.aapt.OverlayableItem.Policy valueOf(Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                } else {
                    return desc.getIndex() == -1 ? UNRECOGNIZED : VALUES[desc.getIndex()];
                }
            }

            private Policy(int value) {
                this.value = value;
            }
        }
    }