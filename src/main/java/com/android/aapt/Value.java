package com.android.aapt;

import com.google.protobuf.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class Value extends GeneratedMessageV3 implements com.android.aapt.ValueOrBuilder {
        private static final long serialVersionUID = 0L;
        public static final int SOURCE_FIELD_NUMBER = 1;
        public static final int COMMENT_FIELD_NUMBER = 2;
        public static final int WEAK_FIELD_NUMBER = 3;
        public static final int ITEM_FIELD_NUMBER = 4;
        public static final int COMPOUND_VALUE_FIELD_NUMBER = 5;

        private int valueCase_;
        private Object value_;
        private com.android.aapt.Source source_;
        private volatile Object comment_;
        private boolean weak_;
        private byte memoizedIsInitialized;
        private static final com.android.aapt.Value DEFAULT_INSTANCE = new com.android.aapt.Value();
        private static final Parser<com.android.aapt.Value> PARSER = new AbstractParser<com.android.aapt.Value>() {
            public com.android.aapt.Value parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new com.android.aapt.Value(input, extensionRegistry);
            }
        };

        private Value(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.valueCase_ = 0;
            this.memoizedIsInitialized = -1;
        }

        private Value() {
            this.valueCase_ = 0;
            this.memoizedIsInitialized = -1;
            this.comment_ = "";
        }

        @Override
        public Object newInstance(UnusedPrivateParameter unused) {
            return new com.android.aapt.Value();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Value(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            case 18:
                                java.lang.String s = input.readStringRequireUtf8();
                                this.comment_ = s;
                                break;
                            case 24:
                                this.weak_ = input.readBool();
                                break;
                            case 34:
                                com.android.aapt.Item.Builder subBuilder2 = null;
                                if (this.valueCase_ == 4) {
                                    subBuilder2 = ((com.android.aapt.Item)this.value_).toBuilder();
                                }

                                this.value_ = input.readMessage(com.android.aapt.Item.parser(), extensionRegistry);
                                if (subBuilder2 != null) {
                                    subBuilder2.mergeFrom((com.android.aapt.Item)this.value_);
                                    this.value_ = subBuilder2.buildPartial();
                                }

                                this.valueCase_ = 4;
                                break;
                            case 42:
                                com.android.aapt.CompoundValue.Builder subBuilder3 = null;
                                if (this.valueCase_ == 5) {
                                    subBuilder3 = ((com.android.aapt.CompoundValue)this.value_).toBuilder();
                                }

                                this.value_ = input.readMessage(com.android.aapt.CompoundValue.parser(), extensionRegistry);
                                if (subBuilder3 != null) {
                                    subBuilder3.mergeFrom((com.android.aapt.CompoundValue)this.value_);
                                    this.value_ = subBuilder3.buildPartial();
                                }

                                this.valueCase_ = 5;
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
            return Resources.internal_static_aapt_pb_Value_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_Value_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.Value.class, com.android.aapt.Value.Builder.class);
        }

        public com.android.aapt.Value.ValueCase getValueCase() {
            return com.android.aapt.Value.ValueCase.forNumber(this.valueCase_);
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

        public boolean getWeak() {
            return this.weak_;
        }

        public boolean hasItem() {
            return this.valueCase_ == 4;
        }

        public com.android.aapt.Item getItem() {
            return this.valueCase_ == 4 ? (com.android.aapt.Item)this.value_ : com.android.aapt.Item.getDefaultInstance();
        }

        public com.android.aapt.ItemOrBuilder getItemOrBuilder() {
            return this.valueCase_ == 4 ? (com.android.aapt.Item)this.value_ : com.android.aapt.Item.getDefaultInstance();
        }

        public boolean hasCompoundValue() {
            return this.valueCase_ == 5;
        }

        public com.android.aapt.CompoundValue getCompoundValue() {
            return this.valueCase_ == 5 ? (com.android.aapt.CompoundValue)this.value_ : com.android.aapt.CompoundValue.getDefaultInstance();
        }

        public com.android.aapt.CompoundValueOrBuilder getCompoundValueOrBuilder() {
            return this.valueCase_ == 5 ? (com.android.aapt.CompoundValue)this.value_ : com.android.aapt.CompoundValue.getDefaultInstance();
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
                output.writeMessage(SOURCE_FIELD_NUMBER, this.getSource());
            }

            if (!this.getCommentBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, COMMENT_FIELD_NUMBER, this.comment_);
            }

            if (this.weak_) {
                output.writeBool(WEAK_FIELD_NUMBER, this.weak_);
            }

            if (this.valueCase_ == ITEM_FIELD_NUMBER) {
                output.writeMessage(ITEM_FIELD_NUMBER, (com.android.aapt.Item)this.value_);
            }

            if (this.valueCase_ == COMPOUND_VALUE_FIELD_NUMBER) {
                output.writeMessage(COMPOUND_VALUE_FIELD_NUMBER, (com.android.aapt.CompoundValue)this.value_);
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

                if (this.weak_) {
                    size += CodedOutputStream.computeBoolSize(3, this.weak_);
                }

                if (this.valueCase_ == 4) {
                    size += CodedOutputStream.computeMessageSize(4, (com.android.aapt.Item)this.value_);
                }

                if (this.valueCase_ == 5) {
                    size += CodedOutputStream.computeMessageSize(5, (com.android.aapt.CompoundValue)this.value_);
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
            } else if (!(obj instanceof com.android.aapt.Value)) {
                return super.equals(obj);
            } else {
                com.android.aapt.Value other = (com.android.aapt.Value)obj;
                if (this.hasSource() != other.hasSource()) {
                    return false;
                } else if (this.hasSource() && !this.getSource().equals(other.getSource())) {
                    return false;
                } else if (!this.getComment().equals(other.getComment())) {
                    return false;
                } else if (this.getWeak() != other.getWeak()) {
                    return false;
                } else if (!this.getValueCase().equals(other.getValueCase())) {
                    return false;
                } else {
                    switch(this.valueCase_) {
                        case 0:
                        default:
                            break;
                        case 4:
                            if (!this.getItem().equals(other.getItem())) {
                                return false;
                            }
                            break;
                        case 5:
                            if (!this.getCompoundValue().equals(other.getCompoundValue())) {
                                return false;
                            }
                    }

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
                hash = 37 * hash + 3;
                hash = 53 * hash + Internal.hashBoolean(this.getWeak());
                switch(this.valueCase_) {
                    case 0:
                    default:
                        break;
                    case 4:
                        hash = 37 * hash + 4;
                        hash = 53 * hash + this.getItem().hashCode();
                        break;
                    case 5:
                        hash = 37 * hash + 5;
                        hash = 53 * hash + this.getCompoundValue().hashCode();
                }

                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static com.android.aapt.Value parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Value)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Value parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Value)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Value parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Value)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Value parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Value)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Value parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Value)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Value parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Value)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Value parseFrom(InputStream input) throws IOException {
            return (com.android.aapt.Value)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.Value parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Value)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.Value parseDelimitedFrom(InputStream input) throws IOException {
            return (com.android.aapt.Value)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static com.android.aapt.Value parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Value)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.Value parseFrom(CodedInputStream input) throws IOException {
            return (com.android.aapt.Value)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.Value parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Value)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public com.android.aapt.Value.Builder newBuilderForType() {
            return newBuilder();
        }

        public static com.android.aapt.Value.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static com.android.aapt.Value.Builder newBuilder(com.android.aapt.Value prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public com.android.aapt.Value.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new com.android.aapt.Value.Builder() : (new com.android.aapt.Value.Builder()).mergeFrom(this);
        }

        public com.android.aapt.Value.Builder newBuilderForType(BuilderParent parent) {
            com.android.aapt.Value.Builder builder = new com.android.aapt.Value.Builder(parent);
            return builder;
        }

        public static com.android.aapt.Value getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<com.android.aapt.Value> parser() {
            return PARSER;
        }

        public Parser<com.android.aapt.Value> getParserForType() {
            return PARSER;
        }

        public com.android.aapt.Value getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.Value.Builder> implements com.android.aapt.ValueOrBuilder {
            private int valueCase_;
            private Object value_;
            private com.android.aapt.Source source_;
            private SingleFieldBuilderV3<com.android.aapt.Source, com.android.aapt.Source.Builder, com.android.aapt.SourceOrBuilder> sourceBuilder_;
            private Object comment_;
            private boolean weak_;
            private SingleFieldBuilderV3<com.android.aapt.Item, com.android.aapt.Item.Builder, com.android.aapt.ItemOrBuilder> itemBuilder_;
            private SingleFieldBuilderV3<com.android.aapt.CompoundValue, com.android.aapt.CompoundValue.Builder, com.android.aapt.CompoundValueOrBuilder> compoundValueBuilder_;

            public static Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_Value_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_Value_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.Value.class, com.android.aapt.Value.Builder.class);
            }

            private Builder() {
                this.valueCase_ = 0;
                this.comment_ = "";
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.valueCase_ = 0;
                this.comment_ = "";
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.android.aapt.Value.alwaysUseFieldBuilders) {
                }

            }

            public com.android.aapt.Value.Builder clear() {
                super.clear();
                if (this.sourceBuilder_ == null) {
                    this.source_ = null;
                } else {
                    this.source_ = null;
                    this.sourceBuilder_ = null;
                }

                this.comment_ = "";
                this.weak_ = false;
                this.valueCase_ = 0;
                this.value_ = null;
                return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Resources.internal_static_aapt_pb_Value_descriptor;
            }

            public com.android.aapt.Value getDefaultInstanceForType() {
                return com.android.aapt.Value.getDefaultInstance();
            }

            public com.android.aapt.Value build() {
                com.android.aapt.Value result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public com.android.aapt.Value buildPartial() {
                com.android.aapt.Value result = new com.android.aapt.Value(this);
                if (this.sourceBuilder_ == null) {
                    result.source_ = this.source_;
                } else {
                    result.source_ = (com.android.aapt.Source)this.sourceBuilder_.build();
                }

                result.comment_ = this.comment_;
                result.weak_ = this.weak_;
                if (this.valueCase_ == 4) {
                    if (this.itemBuilder_ == null) {
                        result.value_ = this.value_;
                    } else {
                        result.value_ = this.itemBuilder_.build();
                    }
                }

                if (this.valueCase_ == 5) {
                    if (this.compoundValueBuilder_ == null) {
                        result.value_ = this.value_;
                    } else {
                        result.value_ = this.compoundValueBuilder_.build();
                    }
                }

                result.valueCase_ = this.valueCase_;
                this.onBuilt();
                return result;
            }

            public com.android.aapt.Value.Builder clone() {
                return (com.android.aapt.Value.Builder)super.clone();
            }

            public com.android.aapt.Value.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.Value.Builder)super.setField(field, value);
            }

            public com.android.aapt.Value.Builder clearField(Descriptors.FieldDescriptor field) {
                return (com.android.aapt.Value.Builder)super.clearField(field);
            }

            public com.android.aapt.Value.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (com.android.aapt.Value.Builder)super.clearOneof(oneof);
            }

            public com.android.aapt.Value.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (com.android.aapt.Value.Builder)super.setRepeatedField(field, index, value);
            }

            public com.android.aapt.Value.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.Value.Builder)super.addRepeatedField(field, value);
            }

            public com.android.aapt.Value.Builder mergeFrom(Message other) {
                if (other instanceof com.android.aapt.Value) {
                    return this.mergeFrom((com.android.aapt.Value)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public com.android.aapt.Value.Builder mergeFrom(com.android.aapt.Value other) {
                if (other == com.android.aapt.Value.getDefaultInstance()) {
                    return this;
                } else {
                    if (other.hasSource()) {
                        this.mergeSource(other.getSource());
                    }

                    if (!other.getComment().isEmpty()) {
                        this.comment_ = other.comment_;
                        this.onChanged();
                    }

                    if (other.getWeak()) {
                        this.setWeak(other.getWeak());
                    }

                    switch(other.getValueCase()) {
                        case ITEM:
                            this.mergeItem(other.getItem());
                            break;
                        case COMPOUND_VALUE:
                            this.mergeCompoundValue(other.getCompoundValue());
                        case VALUE_NOT_SET:
                    }

                    this.mergeUnknownFields(other.unknownFields);
                    this.onChanged();
                    return this;
                }
            }

            public final boolean isInitialized() {
                return true;
            }

            public com.android.aapt.Value.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                com.android.aapt.Value parsedMessage = null;

                try {
                    parsedMessage = (com.android.aapt.Value)com.android.aapt.Value.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (com.android.aapt.Value)var8.getUnfinishedMessage();
                    throw var8.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }

                }

                return this;
            }

            public com.android.aapt.Value.ValueCase getValueCase() {
                return com.android.aapt.Value.ValueCase.forNumber(this.valueCase_);
            }

            public com.android.aapt.Value.Builder clearValue() {
                this.valueCase_ = 0;
                this.value_ = null;
                this.onChanged();
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

            public com.android.aapt.Value.Builder setSource(com.android.aapt.Source value) {
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

            public com.android.aapt.Value.Builder setSource(com.android.aapt.Source.Builder builderForValue) {
                if (this.sourceBuilder_ == null) {
                    this.source_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.sourceBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.Value.Builder mergeSource(com.android.aapt.Source value) {
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

            public com.android.aapt.Value.Builder clearSource() {
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

            public com.android.aapt.Value.Builder setComment(java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.comment_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public com.android.aapt.Value.Builder clearComment() {
                this.comment_ = com.android.aapt.Value.getDefaultInstance().getComment();
                this.onChanged();
                return this;
            }

            public com.android.aapt.Value.Builder setCommentBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    com.android.aapt.Value.checkByteStringIsUtf8(value);
                    this.comment_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public boolean getWeak() {
                return this.weak_;
            }

            public com.android.aapt.Value.Builder setWeak(boolean value) {
                this.weak_ = value;
                this.onChanged();
                return this;
            }

            public com.android.aapt.Value.Builder clearWeak() {
                this.weak_ = false;
                this.onChanged();
                return this;
            }

            public boolean hasItem() {
                return this.valueCase_ == 4;
            }

            public com.android.aapt.Item getItem() {
                if (this.itemBuilder_ == null) {
                    return this.valueCase_ == 4 ? (com.android.aapt.Item)this.value_ : com.android.aapt.Item.getDefaultInstance();
                } else {
                    return this.valueCase_ == 4 ? (com.android.aapt.Item)this.itemBuilder_.getMessage() : com.android.aapt.Item.getDefaultInstance();
                }
            }

            public com.android.aapt.Value.Builder setItem(com.android.aapt.Item value) {
                if (this.itemBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.value_ = value;
                    this.onChanged();
                } else {
                    this.itemBuilder_.setMessage(value);
                }

                this.valueCase_ = 4;
                return this;
            }

            public com.android.aapt.Value.Builder setItem(com.android.aapt.Item.Builder builderForValue) {
                if (this.itemBuilder_ == null) {
                    this.value_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.itemBuilder_.setMessage(builderForValue.build());
                }

                this.valueCase_ = 4;
                return this;
            }

            public com.android.aapt.Value.Builder mergeItem(com.android.aapt.Item value) {
                if (this.itemBuilder_ == null) {
                    if (this.valueCase_ == 4 && this.value_ != com.android.aapt.Item.getDefaultInstance()) {
                        this.value_ = com.android.aapt.Item.newBuilder((com.android.aapt.Item)this.value_).mergeFrom(value).buildPartial();
                    } else {
                        this.value_ = value;
                    }

                    this.onChanged();
                } else {
                    if (this.valueCase_ == 4) {
                        this.itemBuilder_.mergeFrom(value);
                    }

                    this.itemBuilder_.setMessage(value);
                }

                this.valueCase_ = 4;
                return this;
            }

            public com.android.aapt.Value.Builder clearItem() {
                if (this.itemBuilder_ == null) {
                    if (this.valueCase_ == 4) {
                        this.valueCase_ = 0;
                        this.value_ = null;
                        this.onChanged();
                    }
                } else {
                    if (this.valueCase_ == 4) {
                        this.valueCase_ = 0;
                        this.value_ = null;
                    }

                    this.itemBuilder_.clear();
                }

                return this;
            }

            public com.android.aapt.Item.Builder getItemBuilder() {
                return (com.android.aapt.Item.Builder)this.getItemFieldBuilder().getBuilder();
            }

            public com.android.aapt.ItemOrBuilder getItemOrBuilder() {
                if (this.valueCase_ == 4 && this.itemBuilder_ != null) {
                    return (com.android.aapt.ItemOrBuilder)this.itemBuilder_.getMessageOrBuilder();
                } else {
                    return this.valueCase_ == 4 ? (com.android.aapt.Item)this.value_ : com.android.aapt.Item.getDefaultInstance();
                }
            }

            private SingleFieldBuilderV3<com.android.aapt.Item, com.android.aapt.Item.Builder, com.android.aapt.ItemOrBuilder> getItemFieldBuilder() {
                if (this.itemBuilder_ == null) {
                    if (this.valueCase_ != 4) {
                        this.value_ = com.android.aapt.Item.getDefaultInstance();
                    }

                    this.itemBuilder_ = new SingleFieldBuilderV3((com.android.aapt.Item)this.value_, this.getParentForChildren(), this.isClean());
                    this.value_ = null;
                }

                this.valueCase_ = 4;
                this.onChanged();
                return this.itemBuilder_;
            }

            public boolean hasCompoundValue() {
                return this.valueCase_ == 5;
            }

            public com.android.aapt.CompoundValue getCompoundValue() {
                if (this.compoundValueBuilder_ == null) {
                    return this.valueCase_ == 5 ? (com.android.aapt.CompoundValue)this.value_ : com.android.aapt.CompoundValue.getDefaultInstance();
                } else {
                    return this.valueCase_ == 5 ? (com.android.aapt.CompoundValue)this.compoundValueBuilder_.getMessage() : com.android.aapt.CompoundValue.getDefaultInstance();
                }
            }

            public com.android.aapt.Value.Builder setCompoundValue(com.android.aapt.CompoundValue value) {
                if (this.compoundValueBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.value_ = value;
                    this.onChanged();
                } else {
                    this.compoundValueBuilder_.setMessage(value);
                }

                this.valueCase_ = 5;
                return this;
            }

            public com.android.aapt.Value.Builder setCompoundValue(com.android.aapt.CompoundValue.Builder builderForValue) {
                if (this.compoundValueBuilder_ == null) {
                    this.value_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.compoundValueBuilder_.setMessage(builderForValue.build());
                }

                this.valueCase_ = 5;
                return this;
            }

            public com.android.aapt.Value.Builder mergeCompoundValue(com.android.aapt.CompoundValue value) {
                if (this.compoundValueBuilder_ == null) {
                    if (this.valueCase_ == 5 && this.value_ != com.android.aapt.CompoundValue.getDefaultInstance()) {
                        this.value_ = com.android.aapt.CompoundValue.newBuilder((com.android.aapt.CompoundValue)this.value_).mergeFrom(value).buildPartial();
                    } else {
                        this.value_ = value;
                    }

                    this.onChanged();
                } else {
                    if (this.valueCase_ == 5) {
                        this.compoundValueBuilder_.mergeFrom(value);
                    }

                    this.compoundValueBuilder_.setMessage(value);
                }

                this.valueCase_ = 5;
                return this;
            }

            public com.android.aapt.Value.Builder clearCompoundValue() {
                if (this.compoundValueBuilder_ == null) {
                    if (this.valueCase_ == 5) {
                        this.valueCase_ = 0;
                        this.value_ = null;
                        this.onChanged();
                    }
                } else {
                    if (this.valueCase_ == 5) {
                        this.valueCase_ = 0;
                        this.value_ = null;
                    }

                    this.compoundValueBuilder_.clear();
                }

                return this;
            }

            public com.android.aapt.CompoundValue.Builder getCompoundValueBuilder() {
                return (com.android.aapt.CompoundValue.Builder)this.getCompoundValueFieldBuilder().getBuilder();
            }

            public com.android.aapt.CompoundValueOrBuilder getCompoundValueOrBuilder() {
                if (this.valueCase_ == 5 && this.compoundValueBuilder_ != null) {
                    return (com.android.aapt.CompoundValueOrBuilder)this.compoundValueBuilder_.getMessageOrBuilder();
                } else {
                    return this.valueCase_ == 5 ? (com.android.aapt.CompoundValue)this.value_ : com.android.aapt.CompoundValue.getDefaultInstance();
                }
            }

            private SingleFieldBuilderV3<com.android.aapt.CompoundValue, com.android.aapt.CompoundValue.Builder, com.android.aapt.CompoundValueOrBuilder> getCompoundValueFieldBuilder() {
                if (this.compoundValueBuilder_ == null) {
                    if (this.valueCase_ != 5) {
                        this.value_ = com.android.aapt.CompoundValue.getDefaultInstance();
                    }

                    this.compoundValueBuilder_ = new SingleFieldBuilderV3((com.android.aapt.CompoundValue)this.value_, this.getParentForChildren(), this.isClean());
                    this.value_ = null;
                }

                this.valueCase_ = 5;
                this.onChanged();
                return this.compoundValueBuilder_;
            }

            public final com.android.aapt.Value.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.Value.Builder)super.setUnknownFields(unknownFields);
            }

            public final com.android.aapt.Value.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.Value.Builder)super.mergeUnknownFields(unknownFields);
            }
        }

        public static enum ValueCase implements Internal.EnumLite, InternalOneOfEnum {
            ITEM(4),
            COMPOUND_VALUE(5),
            VALUE_NOT_SET(0);

            private final int value;

            private ValueCase(int value) {
                this.value = value;
            }

            /** @deprecated */
            @Deprecated
            public static com.android.aapt.Value.ValueCase valueOf(int value) {
                return forNumber(value);
            }

            public static com.android.aapt.Value.ValueCase forNumber(int value) {
                switch(value) {
                    case 0:
                        return VALUE_NOT_SET;
                    case 4:
                        return ITEM;
                    case 5:
                        return COMPOUND_VALUE;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.value;
            }
        }
    }