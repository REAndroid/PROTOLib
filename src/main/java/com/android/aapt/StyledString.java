package com.android.aapt;

import com.google.protobuf.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StyledString extends GeneratedMessageV3 implements com.android.aapt.StyledStringOrBuilder {
        private static final long serialVersionUID = 0L;
        public static final int VALUE_FIELD_NUMBER = 1;
        private volatile Object value_;
        public static final int SPAN_FIELD_NUMBER = 2;
        private List<com.android.aapt.StyledString.Span> span_;
        private byte memoizedIsInitialized;
        private static final com.android.aapt.StyledString DEFAULT_INSTANCE = new com.android.aapt.StyledString();
        private static final Parser<com.android.aapt.StyledString> PARSER = new AbstractParser<com.android.aapt.StyledString>() {
            public com.android.aapt.StyledString parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new com.android.aapt.StyledString(input, extensionRegistry);
            }
        };

        private StyledString(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private StyledString() {
            this.memoizedIsInitialized = -1;
            this.value_ = "";
            this.span_ = Collections.emptyList();
        }

        @Override
        public Object newInstance(UnusedPrivateParameter unused) {
            return new com.android.aapt.StyledString();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private StyledString(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        switch(tag) {
                            case 0:
                                done = true;
                                break;
                            case 10:
                                java.lang.String s = input.readStringRequireUtf8();
                                this.value_ = s;
                                break;
                            case 18:
                                if (!(mutable_bitField0_ & true)) {
                                    this.span_ = new ArrayList();
                                    mutable_bitField0_ |= true;
                                }

                                this.span_.add((com.android.aapt.StyledString.Span)input.readMessage(com.android.aapt.StyledString.Span.parser(), extensionRegistry));
                                break;
                            default:
                                if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                        }
                    }
                } catch (InvalidProtocolBufferException var12) {
                    throw var12.setUnfinishedMessage(this);
                } catch (IOException var13) {
                    throw (new InvalidProtocolBufferException(var13)).setUnfinishedMessage(this);
                } finally {
                    if (mutable_bitField0_ & true) {
                        this.span_ = Collections.unmodifiableList(this.span_);
                    }

                    this.unknownFields = unknownFields.build();
                    this.makeExtensionsImmutable();
                }

            }
        }

        public static Descriptors.Descriptor getDescriptor() {
            return Resources.internal_static_aapt_pb_StyledString_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_StyledString_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.StyledString.class, com.android.aapt.StyledString.Builder.class);
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

        public List<com.android.aapt.StyledString.Span> getSpanList() {
            return this.span_;
        }

        public List<? extends com.android.aapt.StyledString.SpanOrBuilder> getSpanOrBuilderList() {
            return this.span_;
        }

        public int getSpanCount() {
            return this.span_.size();
        }

        public com.android.aapt.StyledString.Span getSpan(int index) {
            return (com.android.aapt.StyledString.Span)this.span_.get(index);
        }

        public com.android.aapt.StyledString.SpanOrBuilder getSpanOrBuilder(int index) {
            return (com.android.aapt.StyledString.SpanOrBuilder)this.span_.get(index);
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

            for(int i = 0; i < this.span_.size(); ++i) {
                output.writeMessage(2, (MessageLite)this.span_.get(i));
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

                for(int i = 0; i < this.span_.size(); ++i) {
                    size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.span_.get(i));
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
            } else if (!(obj instanceof com.android.aapt.StyledString)) {
                return super.equals(obj);
            } else {
                com.android.aapt.StyledString other = (com.android.aapt.StyledString)obj;
                if (!this.getValue().equals(other.getValue())) {
                    return false;
                } else if (!this.getSpanList().equals(other.getSpanList())) {
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
                if (this.getSpanCount() > 0) {
                    hash = 37 * hash + 2;
                    hash = 53 * hash + this.getSpanList().hashCode();
                }

                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static com.android.aapt.StyledString parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (com.android.aapt.StyledString)PARSER.parseFrom(data);
        }

        public static com.android.aapt.StyledString parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.StyledString)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.StyledString parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (com.android.aapt.StyledString)PARSER.parseFrom(data);
        }

        public static com.android.aapt.StyledString parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.StyledString)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.StyledString parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (com.android.aapt.StyledString)PARSER.parseFrom(data);
        }

        public static com.android.aapt.StyledString parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.StyledString)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.StyledString parseFrom(InputStream input) throws IOException {
            return (com.android.aapt.StyledString)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.StyledString parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.StyledString)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.StyledString parseDelimitedFrom(InputStream input) throws IOException {
            return (com.android.aapt.StyledString)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static com.android.aapt.StyledString parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.StyledString)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.StyledString parseFrom(CodedInputStream input) throws IOException {
            return (com.android.aapt.StyledString)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.StyledString parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.StyledString)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public com.android.aapt.StyledString.Builder newBuilderForType() {
            return newBuilder();
        }

        public static com.android.aapt.StyledString.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static com.android.aapt.StyledString.Builder newBuilder(com.android.aapt.StyledString prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public com.android.aapt.StyledString.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new com.android.aapt.StyledString.Builder() : (new com.android.aapt.StyledString.Builder()).mergeFrom(this);
        }

        public com.android.aapt.StyledString.Builder newBuilderForType(BuilderParent parent) {
            com.android.aapt.StyledString.Builder builder = new com.android.aapt.StyledString.Builder(parent);
            return builder;
        }

        public static com.android.aapt.StyledString getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<com.android.aapt.StyledString> parser() {
            return PARSER;
        }

        public Parser<com.android.aapt.StyledString> getParserForType() {
            return PARSER;
        }

        public com.android.aapt.StyledString getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.StyledString.Builder> implements com.android.aapt.StyledStringOrBuilder {
            private int bitField0_;
            private Object value_;
            private List<com.android.aapt.StyledString.Span> span_;
            private RepeatedFieldBuilderV3<com.android.aapt.StyledString.Span, com.android.aapt.StyledString.Span.Builder, com.android.aapt.StyledString.SpanOrBuilder> spanBuilder_;

            public static Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_StyledString_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_StyledString_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.StyledString.class, com.android.aapt.StyledString.Builder.class);
            }

            private Builder() {
                this.value_ = "";
                this.span_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.value_ = "";
                this.span_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.android.aapt.StyledString.alwaysUseFieldBuilders) {
                    this.getSpanFieldBuilder();
                }

            }

            public com.android.aapt.StyledString.Builder clear() {
                super.clear();
                this.value_ = "";
                if (this.spanBuilder_ == null) {
                    this.span_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    this.spanBuilder_.clear();
                }

                return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Resources.internal_static_aapt_pb_StyledString_descriptor;
            }

            public com.android.aapt.StyledString getDefaultInstanceForType() {
                return com.android.aapt.StyledString.getDefaultInstance();
            }

            public com.android.aapt.StyledString build() {
                com.android.aapt.StyledString result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public com.android.aapt.StyledString buildPartial() {
                com.android.aapt.StyledString result = new com.android.aapt.StyledString(this);
                int from_bitField0_ = this.bitField0_;
                result.value_ = this.value_;
                if (this.spanBuilder_ == null) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.span_ = Collections.unmodifiableList(this.span_);
                        this.bitField0_ &= -2;
                    }

                    result.span_ = this.span_;
                } else {
                    result.span_ = this.spanBuilder_.build();
                }

                this.onBuilt();
                return result;
            }

            public com.android.aapt.StyledString.Builder clone() {
                return (com.android.aapt.StyledString.Builder)super.clone();
            }

            public com.android.aapt.StyledString.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.StyledString.Builder)super.setField(field, value);
            }

            public com.android.aapt.StyledString.Builder clearField(Descriptors.FieldDescriptor field) {
                return (com.android.aapt.StyledString.Builder)super.clearField(field);
            }

            public com.android.aapt.StyledString.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (com.android.aapt.StyledString.Builder)super.clearOneof(oneof);
            }

            public com.android.aapt.StyledString.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (com.android.aapt.StyledString.Builder)super.setRepeatedField(field, index, value);
            }

            public com.android.aapt.StyledString.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.StyledString.Builder)super.addRepeatedField(field, value);
            }

            public com.android.aapt.StyledString.Builder mergeFrom(Message other) {
                if (other instanceof com.android.aapt.StyledString) {
                    return this.mergeFrom((com.android.aapt.StyledString)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public com.android.aapt.StyledString.Builder mergeFrom(com.android.aapt.StyledString other) {
                if (other == com.android.aapt.StyledString.getDefaultInstance()) {
                    return this;
                } else {
                    if (!other.getValue().isEmpty()) {
                        this.value_ = other.value_;
                        this.onChanged();
                    }

                    if (this.spanBuilder_ == null) {
                        if (!other.span_.isEmpty()) {
                            if (this.span_.isEmpty()) {
                                this.span_ = other.span_;
                                this.bitField0_ &= -2;
                            } else {
                                this.ensureSpanIsMutable();
                                this.span_.addAll(other.span_);
                            }

                            this.onChanged();
                        }
                    } else if (!other.span_.isEmpty()) {
                        if (this.spanBuilder_.isEmpty()) {
                            this.spanBuilder_.dispose();
                            this.spanBuilder_ = null;
                            this.span_ = other.span_;
                            this.bitField0_ &= -2;
                            this.spanBuilder_ = com.android.aapt.StyledString.alwaysUseFieldBuilders ? this.getSpanFieldBuilder() : null;
                        } else {
                            this.spanBuilder_.addAllMessages(other.span_);
                        }
                    }

                    this.mergeUnknownFields(other.unknownFields);
                    this.onChanged();
                    return this;
                }
            }

            public final boolean isInitialized() {
                return true;
            }

            public com.android.aapt.StyledString.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                com.android.aapt.StyledString parsedMessage = null;

                try {
                    parsedMessage = (com.android.aapt.StyledString)com.android.aapt.StyledString.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (com.android.aapt.StyledString)var8.getUnfinishedMessage();
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

            public com.android.aapt.StyledString.Builder setValue(java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.value_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public com.android.aapt.StyledString.Builder clearValue() {
                this.value_ = com.android.aapt.StyledString.getDefaultInstance().getValue();
                this.onChanged();
                return this;
            }

            public com.android.aapt.StyledString.Builder setValueBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    com.android.aapt.StyledString.checkByteStringIsUtf8(value);
                    this.value_ = value;
                    this.onChanged();
                    return this;
                }
            }

            private void ensureSpanIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.span_ = new ArrayList(this.span_);
                    this.bitField0_ |= 1;
                }

            }

            public List<com.android.aapt.StyledString.Span> getSpanList() {
                return this.spanBuilder_ == null ? Collections.unmodifiableList(this.span_) : this.spanBuilder_.getMessageList();
            }

            public int getSpanCount() {
                return this.spanBuilder_ == null ? this.span_.size() : this.spanBuilder_.getCount();
            }

            public com.android.aapt.StyledString.Span getSpan(int index) {
                return this.spanBuilder_ == null ? (com.android.aapt.StyledString.Span)this.span_.get(index) : (com.android.aapt.StyledString.Span)this.spanBuilder_.getMessage(index);
            }

            public com.android.aapt.StyledString.Builder setSpan(int index, com.android.aapt.StyledString.Span value) {
                if (this.spanBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureSpanIsMutable();
                    this.span_.set(index, value);
                    this.onChanged();
                } else {
                    this.spanBuilder_.setMessage(index, value);
                }

                return this;
            }

            public com.android.aapt.StyledString.Builder setSpan(int index, com.android.aapt.StyledString.Span.Builder builderForValue) {
                if (this.spanBuilder_ == null) {
                    this.ensureSpanIsMutable();
                    this.span_.set(index, builderForValue.build());
                    this.onChanged();
                } else {
                    this.spanBuilder_.setMessage(index, builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.StyledString.Builder addSpan(com.android.aapt.StyledString.Span value) {
                if (this.spanBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureSpanIsMutable();
                    this.span_.add(value);
                    this.onChanged();
                } else {
                    this.spanBuilder_.addMessage(value);
                }

                return this;
            }

            public com.android.aapt.StyledString.Builder addSpan(int index, com.android.aapt.StyledString.Span value) {
                if (this.spanBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureSpanIsMutable();
                    this.span_.add(index, value);
                    this.onChanged();
                } else {
                    this.spanBuilder_.addMessage(index, value);
                }

                return this;
            }

            public com.android.aapt.StyledString.Builder addSpan(com.android.aapt.StyledString.Span.Builder builderForValue) {
                if (this.spanBuilder_ == null) {
                    this.ensureSpanIsMutable();
                    this.span_.add(builderForValue.build());
                    this.onChanged();
                } else {
                    this.spanBuilder_.addMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.StyledString.Builder addSpan(int index, com.android.aapt.StyledString.Span.Builder builderForValue) {
                if (this.spanBuilder_ == null) {
                    this.ensureSpanIsMutable();
                    this.span_.add(index, builderForValue.build());
                    this.onChanged();
                } else {
                    this.spanBuilder_.addMessage(index, builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.StyledString.Builder addAllSpan(Iterable<? extends com.android.aapt.StyledString.Span> values) {
                if (this.spanBuilder_ == null) {
                    this.ensureSpanIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.span_);
                    this.onChanged();
                } else {
                    this.spanBuilder_.addAllMessages(values);
                }

                return this;
            }

            public com.android.aapt.StyledString.Builder clearSpan() {
                if (this.spanBuilder_ == null) {
                    this.span_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    this.onChanged();
                } else {
                    this.spanBuilder_.clear();
                }

                return this;
            }

            public com.android.aapt.StyledString.Builder removeSpan(int index) {
                if (this.spanBuilder_ == null) {
                    this.ensureSpanIsMutable();
                    this.span_.remove(index);
                    this.onChanged();
                } else {
                    this.spanBuilder_.remove(index);
                }

                return this;
            }

            public com.android.aapt.StyledString.Span.Builder getSpanBuilder(int index) {
                return (com.android.aapt.StyledString.Span.Builder)this.getSpanFieldBuilder().getBuilder(index);
            }

            public com.android.aapt.StyledString.SpanOrBuilder getSpanOrBuilder(int index) {
                return this.spanBuilder_ == null ? (com.android.aapt.StyledString.SpanOrBuilder)this.span_.get(index) : (com.android.aapt.StyledString.SpanOrBuilder)this.spanBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends com.android.aapt.StyledString.SpanOrBuilder> getSpanOrBuilderList() {
                return this.spanBuilder_ != null ? this.spanBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.span_);
            }

            public com.android.aapt.StyledString.Span.Builder addSpanBuilder() {
                return (com.android.aapt.StyledString.Span.Builder)this.getSpanFieldBuilder().addBuilder(com.android.aapt.StyledString.Span.getDefaultInstance());
            }

            public com.android.aapt.StyledString.Span.Builder addSpanBuilder(int index) {
                return (com.android.aapt.StyledString.Span.Builder)this.getSpanFieldBuilder().addBuilder(index, com.android.aapt.StyledString.Span.getDefaultInstance());
            }

            public List<com.android.aapt.StyledString.Span.Builder> getSpanBuilderList() {
                return this.getSpanFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<com.android.aapt.StyledString.Span, com.android.aapt.StyledString.Span.Builder, com.android.aapt.StyledString.SpanOrBuilder> getSpanFieldBuilder() {
                if (this.spanBuilder_ == null) {
                    this.spanBuilder_ = new RepeatedFieldBuilderV3(this.span_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
                    this.span_ = null;
                }

                return this.spanBuilder_;
            }

            public final com.android.aapt.StyledString.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.StyledString.Builder)super.setUnknownFields(unknownFields);
            }

            public final com.android.aapt.StyledString.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.StyledString.Builder)super.mergeUnknownFields(unknownFields);
            }
        }

        public static final class Span extends GeneratedMessageV3 implements com.android.aapt.StyledString.SpanOrBuilder {
            private static final long serialVersionUID = 0L;
            public static final int TAG_FIELD_NUMBER = 1;
            private volatile Object tag_;
            public static final int FIRST_CHAR_FIELD_NUMBER = 2;
            private int firstChar_;
            public static final int LAST_CHAR_FIELD_NUMBER = 3;
            private int lastChar_;
            private byte memoizedIsInitialized;
            private static final com.android.aapt.StyledString.Span DEFAULT_INSTANCE = new com.android.aapt.StyledString.Span();
            private static final Parser<com.android.aapt.StyledString.Span> PARSER = new AbstractParser<com.android.aapt.StyledString.Span>() {
                public com.android.aapt.StyledString.Span parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new com.android.aapt.StyledString.Span(input, extensionRegistry);
                }
            };

            private Span(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = -1;
            }

            private Span() {
                this.memoizedIsInitialized = -1;
                this.tag_ = "";
            }

            @Override
            public Object newInstance(UnusedPrivateParameter unused) {
                return new com.android.aapt.StyledString.Span();
            }

            @Override
            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            private Span(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                    this.tag_ = s;
                                    break;
                                case 16:
                                    this.firstChar_ = input.readUInt32();
                                    break;
                                case 24:
                                    this.lastChar_ = input.readUInt32();
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
                return Resources.internal_static_aapt_pb_StyledString_Span_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_StyledString_Span_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.StyledString.Span.class, com.android.aapt.StyledString.Span.Builder.class);
            }

            public java.lang.String getTag() {
                Object ref = this.tag_;
                if (ref instanceof java.lang.String) {
                    return (java.lang.String)ref;
                } else {
                    ByteString bs = (ByteString)ref;
                    java.lang.String s = bs.toStringUtf8();
                    this.tag_ = s;
                    return s;
                }
            }

            public ByteString getTagBytes() {
                Object ref = this.tag_;
                if (ref instanceof java.lang.String) {
                    ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                    this.tag_ = b;
                    return b;
                } else {
                    return (ByteString)ref;
                }
            }

            public int getFirstChar() {
                return this.firstChar_;
            }

            public int getLastChar() {
                return this.lastChar_;
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
                if (!this.getTagBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(output, 1, this.tag_);
                }

                if (this.firstChar_ != 0) {
                    output.writeUInt32(2, this.firstChar_);
                }

                if (this.lastChar_ != 0) {
                    output.writeUInt32(3, this.lastChar_);
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
                    if (!this.getTagBytes().isEmpty()) {
                        size += GeneratedMessageV3.computeStringSize(1, this.tag_);
                    }

                    if (this.firstChar_ != 0) {
                        size += CodedOutputStream.computeUInt32Size(2, this.firstChar_);
                    }

                    if (this.lastChar_ != 0) {
                        size += CodedOutputStream.computeUInt32Size(3, this.lastChar_);
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
                } else if (!(obj instanceof com.android.aapt.StyledString.Span)) {
                    return super.equals(obj);
                } else {
                    com.android.aapt.StyledString.Span other = (com.android.aapt.StyledString.Span)obj;
                    if (!this.getTag().equals(other.getTag())) {
                        return false;
                    } else if (this.getFirstChar() != other.getFirstChar()) {
                        return false;
                    } else if (this.getLastChar() != other.getLastChar()) {
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
                    hash = 53 * hash + this.getTag().hashCode();
                    hash = 37 * hash + 2;
                    hash = 53 * hash + this.getFirstChar();
                    hash = 37 * hash + 3;
                    hash = 53 * hash + this.getLastChar();
                    hash = 29 * hash + this.unknownFields.hashCode();
                    this.memoizedHashCode = hash;
                    return hash;
                }
            }

            public static com.android.aapt.StyledString.Span parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (com.android.aapt.StyledString.Span)PARSER.parseFrom(data);
            }

            public static com.android.aapt.StyledString.Span parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (com.android.aapt.StyledString.Span)PARSER.parseFrom(data, extensionRegistry);
            }

            public static com.android.aapt.StyledString.Span parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (com.android.aapt.StyledString.Span)PARSER.parseFrom(data);
            }

            public static com.android.aapt.StyledString.Span parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (com.android.aapt.StyledString.Span)PARSER.parseFrom(data, extensionRegistry);
            }

            public static com.android.aapt.StyledString.Span parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (com.android.aapt.StyledString.Span)PARSER.parseFrom(data);
            }

            public static com.android.aapt.StyledString.Span parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (com.android.aapt.StyledString.Span)PARSER.parseFrom(data, extensionRegistry);
            }

            public static com.android.aapt.StyledString.Span parseFrom(InputStream input) throws IOException {
                return (com.android.aapt.StyledString.Span)GeneratedMessageV3.parseWithIOException(PARSER, input);
            }

            public static com.android.aapt.StyledString.Span parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (com.android.aapt.StyledString.Span)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
            }

            public static com.android.aapt.StyledString.Span parseDelimitedFrom(InputStream input) throws IOException {
                return (com.android.aapt.StyledString.Span)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
            }

            public static com.android.aapt.StyledString.Span parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (com.android.aapt.StyledString.Span)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }

            public static com.android.aapt.StyledString.Span parseFrom(CodedInputStream input) throws IOException {
                return (com.android.aapt.StyledString.Span)GeneratedMessageV3.parseWithIOException(PARSER, input);
            }

            public static com.android.aapt.StyledString.Span parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (com.android.aapt.StyledString.Span)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
            }

            public com.android.aapt.StyledString.Span.Builder newBuilderForType() {
                return newBuilder();
            }

            public static com.android.aapt.StyledString.Span.Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static com.android.aapt.StyledString.Span.Builder newBuilder(com.android.aapt.StyledString.Span prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }

            public com.android.aapt.StyledString.Span.Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new com.android.aapt.StyledString.Span.Builder() : (new com.android.aapt.StyledString.Span.Builder()).mergeFrom(this);
            }

            public com.android.aapt.StyledString.Span.Builder newBuilderForType(BuilderParent parent) {
                com.android.aapt.StyledString.Span.Builder builder = new com.android.aapt.StyledString.Span.Builder(parent);
                return builder;
            }

            public static com.android.aapt.StyledString.Span getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<com.android.aapt.StyledString.Span> parser() {
                return PARSER;
            }

            public Parser<com.android.aapt.StyledString.Span> getParserForType() {
                return PARSER;
            }

            public com.android.aapt.StyledString.Span getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.StyledString.Span.Builder> implements com.android.aapt.StyledString.SpanOrBuilder {
                private Object tag_;
                private int firstChar_;
                private int lastChar_;

                public static Descriptors.Descriptor getDescriptor() {
                    return Resources.internal_static_aapt_pb_StyledString_Span_descriptor;
                }

                public FieldAccessorTable internalGetFieldAccessorTable() {
                    return Resources.internal_static_aapt_pb_StyledString_Span_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.StyledString.Span.class, com.android.aapt.StyledString.Span.Builder.class);
                }

                private Builder() {
                    this.tag_ = "";
                    this.maybeForceBuilderInitialization();
                }

                private Builder(BuilderParent parent) {
                    super(parent);
                    this.tag_ = "";
                    this.maybeForceBuilderInitialization();
                }

                private void maybeForceBuilderInitialization() {
                    if (com.android.aapt.StyledString.Span.alwaysUseFieldBuilders) {
                    }

                }

                public com.android.aapt.StyledString.Span.Builder clear() {
                    super.clear();
                    this.tag_ = "";
                    this.firstChar_ = 0;
                    this.lastChar_ = 0;
                    return this;
                }

                @Override
                public Descriptors.Descriptor getDescriptorForType() {
                    return Resources.internal_static_aapt_pb_StyledString_Span_descriptor;
                }

                public com.android.aapt.StyledString.Span getDefaultInstanceForType() {
                    return com.android.aapt.StyledString.Span.getDefaultInstance();
                }

                public com.android.aapt.StyledString.Span build() {
                    com.android.aapt.StyledString.Span result = this.buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    } else {
                        return result;
                    }
                }

                public com.android.aapt.StyledString.Span buildPartial() {
                    com.android.aapt.StyledString.Span result = new com.android.aapt.StyledString.Span(this);
                    result.tag_ = this.tag_;
                    result.firstChar_ = this.firstChar_;
                    result.lastChar_ = this.lastChar_;
                    this.onBuilt();
                    return result;
                }

                public com.android.aapt.StyledString.Span.Builder clone() {
                    return (com.android.aapt.StyledString.Span.Builder)super.clone();
                }

                public com.android.aapt.StyledString.Span.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                    return (com.android.aapt.StyledString.Span.Builder)super.setField(field, value);
                }

                public com.android.aapt.StyledString.Span.Builder clearField(Descriptors.FieldDescriptor field) {
                    return (com.android.aapt.StyledString.Span.Builder)super.clearField(field);
                }

                public com.android.aapt.StyledString.Span.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                    return (com.android.aapt.StyledString.Span.Builder)super.clearOneof(oneof);
                }

                public com.android.aapt.StyledString.Span.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                    return (com.android.aapt.StyledString.Span.Builder)super.setRepeatedField(field, index, value);
                }

                public com.android.aapt.StyledString.Span.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                    return (com.android.aapt.StyledString.Span.Builder)super.addRepeatedField(field, value);
                }

                public com.android.aapt.StyledString.Span.Builder mergeFrom(Message other) {
                    if (other instanceof com.android.aapt.StyledString.Span) {
                        return this.mergeFrom((com.android.aapt.StyledString.Span)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public com.android.aapt.StyledString.Span.Builder mergeFrom(com.android.aapt.StyledString.Span other) {
                    if (other == com.android.aapt.StyledString.Span.getDefaultInstance()) {
                        return this;
                    } else {
                        if (!other.getTag().isEmpty()) {
                            this.tag_ = other.tag_;
                            this.onChanged();
                        }

                        if (other.getFirstChar() != 0) {
                            this.setFirstChar(other.getFirstChar());
                        }

                        if (other.getLastChar() != 0) {
                            this.setLastChar(other.getLastChar());
                        }

                        this.mergeUnknownFields(other.unknownFields);
                        this.onChanged();
                        return this;
                    }
                }

                public final boolean isInitialized() {
                    return true;
                }

                public com.android.aapt.StyledString.Span.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                    com.android.aapt.StyledString.Span parsedMessage = null;

                    try {
                        parsedMessage = (com.android.aapt.StyledString.Span)com.android.aapt.StyledString.Span.PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (InvalidProtocolBufferException var8) {
                        parsedMessage = (com.android.aapt.StyledString.Span)var8.getUnfinishedMessage();
                        throw var8.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            this.mergeFrom(parsedMessage);
                        }

                    }

                    return this;
                }

                public java.lang.String getTag() {
                    Object ref = this.tag_;
                    if (!(ref instanceof java.lang.String)) {
                        ByteString bs = (ByteString)ref;
                        java.lang.String s = bs.toStringUtf8();
                        this.tag_ = s;
                        return s;
                    } else {
                        return (java.lang.String)ref;
                    }
                }

                public ByteString getTagBytes() {
                    Object ref = this.tag_;
                    if (ref instanceof String) {
                        ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                        this.tag_ = b;
                        return b;
                    } else {
                        return (ByteString)ref;
                    }
                }

                public com.android.aapt.StyledString.Span.Builder setTag(java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    } else {
                        this.tag_ = value;
                        this.onChanged();
                        return this;
                    }
                }

                public com.android.aapt.StyledString.Span.Builder clearTag() {
                    this.tag_ = com.android.aapt.StyledString.Span.getDefaultInstance().getTag();
                    this.onChanged();
                    return this;
                }

                public com.android.aapt.StyledString.Span.Builder setTagBytes(ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    } else {
                        com.android.aapt.StyledString.Span.checkByteStringIsUtf8(value);
                        this.tag_ = value;
                        this.onChanged();
                        return this;
                    }
                }

                public int getFirstChar() {
                    return this.firstChar_;
                }

                public com.android.aapt.StyledString.Span.Builder setFirstChar(int value) {
                    this.firstChar_ = value;
                    this.onChanged();
                    return this;
                }

                public com.android.aapt.StyledString.Span.Builder clearFirstChar() {
                    this.firstChar_ = 0;
                    this.onChanged();
                    return this;
                }

                public int getLastChar() {
                    return this.lastChar_;
                }

                public com.android.aapt.StyledString.Span.Builder setLastChar(int value) {
                    this.lastChar_ = value;
                    this.onChanged();
                    return this;
                }

                public com.android.aapt.StyledString.Span.Builder clearLastChar() {
                    this.lastChar_ = 0;
                    this.onChanged();
                    return this;
                }

                public final com.android.aapt.StyledString.Span.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                    return (com.android.aapt.StyledString.Span.Builder)super.setUnknownFields(unknownFields);
                }

                public final com.android.aapt.StyledString.Span.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                    return (com.android.aapt.StyledString.Span.Builder)super.mergeUnknownFields(unknownFields);
                }
            }
        }

        public interface SpanOrBuilder extends MessageOrBuilder {
            java.lang.String getTag();

            ByteString getTagBytes();

            int getFirstChar();

            int getLastChar();
        }
    }