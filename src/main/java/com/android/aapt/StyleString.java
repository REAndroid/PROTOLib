package com.android.aapt;

import com.google.protobuf.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StyleString extends GeneratedMessageV3 implements com.android.aapt.StyleStringOrBuilder {
        private static final long serialVersionUID = 0L;
        public static final int STR_FIELD_NUMBER = 1;
        private volatile Object str_;
        public static final int SPANS_FIELD_NUMBER = 2;
        private List<com.android.aapt.StyleString.Span> spans_;
        private byte memoizedIsInitialized;
        private static final com.android.aapt.StyleString DEFAULT_INSTANCE = new com.android.aapt.StyleString();
        private static final Parser<com.android.aapt.StyleString> PARSER = new AbstractParser<com.android.aapt.StyleString>() {
            public com.android.aapt.StyleString parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new com.android.aapt.StyleString(input, extensionRegistry);
            }
        };

        private StyleString(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private StyleString() {
            this.memoizedIsInitialized = -1;
            this.str_ = "";
            this.spans_ = Collections.emptyList();
        }

        @Override
        public Object newInstance(UnusedPrivateParameter unused) {
            return new com.android.aapt.StyleString();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private StyleString(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                this.str_ = s;
                                break;
                            case 18:
                                if (!mutable_bitField0_ ) {
                                    this.spans_ = new ArrayList();
                                    mutable_bitField0_ |= true;
                                }

                                this.spans_.add((com.android.aapt.StyleString.Span)input.readMessage(com.android.aapt.StyleString.Span.parser(), extensionRegistry));
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
                        this.spans_ = Collections.unmodifiableList(this.spans_);
                    }

                    this.unknownFields = unknownFields.build();
                    this.makeExtensionsImmutable();
                }

            }
        }

        public static Descriptors.Descriptor getDescriptor() {
            return Resources.internal_static_aapt_pb_StyleString_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_StyleString_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.StyleString.class, com.android.aapt.StyleString.Builder.class);
        }

        public java.lang.String getStr() {
            Object ref = this.str_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String)ref;
            } else {
                ByteString bs = (ByteString)ref;
                java.lang.String s = bs.toStringUtf8();
                this.str_ = s;
                return s;
            }
        }

        public ByteString getStrBytes() {
            Object ref = this.str_;
            if (ref instanceof java.lang.String) {
                ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                this.str_ = b;
                return b;
            } else {
                return (ByteString)ref;
            }
        }

        public List<com.android.aapt.StyleString.Span> getSpansList() {
            return this.spans_;
        }

        public List<? extends com.android.aapt.StyleString.SpanOrBuilder> getSpansOrBuilderList() {
            return this.spans_;
        }

        public int getSpansCount() {
            return this.spans_.size();
        }

        public com.android.aapt.StyleString.Span getSpans(int index) {
            return (com.android.aapt.StyleString.Span)this.spans_.get(index);
        }

        public com.android.aapt.StyleString.SpanOrBuilder getSpansOrBuilder(int index) {
            return (com.android.aapt.StyleString.SpanOrBuilder)this.spans_.get(index);
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
            if (!this.getStrBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 1, this.str_);
            }

            for(int i = 0; i < this.spans_.size(); ++i) {
                output.writeMessage(2, (MessageLite)this.spans_.get(i));
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
                if (!this.getStrBytes().isEmpty()) {
                    size += GeneratedMessageV3.computeStringSize(1, this.str_);
                }

                for(int i = 0; i < this.spans_.size(); ++i) {
                    size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.spans_.get(i));
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
            } else if (!(obj instanceof com.android.aapt.StyleString)) {
                return super.equals(obj);
            } else {
                com.android.aapt.StyleString other = (com.android.aapt.StyleString)obj;
                if (!this.getStr().equals(other.getStr())) {
                    return false;
                } else if (!this.getSpansList().equals(other.getSpansList())) {
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
                hash = 53 * hash + this.getStr().hashCode();
                if (this.getSpansCount() > 0) {
                    hash = 37 * hash + 2;
                    hash = 53 * hash + this.getSpansList().hashCode();
                }

                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static com.android.aapt.StyleString parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (com.android.aapt.StyleString)PARSER.parseFrom(data);
        }

        public static com.android.aapt.StyleString parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.StyleString)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.StyleString parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (com.android.aapt.StyleString)PARSER.parseFrom(data);
        }

        public static com.android.aapt.StyleString parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.StyleString)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.StyleString parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (com.android.aapt.StyleString)PARSER.parseFrom(data);
        }

        public static com.android.aapt.StyleString parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.StyleString)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.StyleString parseFrom(InputStream input) throws IOException {
            return (com.android.aapt.StyleString)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.StyleString parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.StyleString)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.StyleString parseDelimitedFrom(InputStream input) throws IOException {
            return (com.android.aapt.StyleString)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static com.android.aapt.StyleString parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.StyleString)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.StyleString parseFrom(CodedInputStream input) throws IOException {
            return (com.android.aapt.StyleString)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.StyleString parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.StyleString)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public com.android.aapt.StyleString.Builder newBuilderForType() {
            return newBuilder();
        }

        public static com.android.aapt.StyleString.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static com.android.aapt.StyleString.Builder newBuilder(com.android.aapt.StyleString prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public com.android.aapt.StyleString.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new com.android.aapt.StyleString.Builder() : (new com.android.aapt.StyleString.Builder()).mergeFrom(this);
        }

        public com.android.aapt.StyleString.Builder newBuilderForType(BuilderParent parent) {
            com.android.aapt.StyleString.Builder builder = new com.android.aapt.StyleString.Builder(parent);
            return builder;
        }

        public static com.android.aapt.StyleString getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<com.android.aapt.StyleString> parser() {
            return PARSER;
        }

        public Parser<com.android.aapt.StyleString> getParserForType() {
            return PARSER;
        }

        public com.android.aapt.StyleString getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.StyleString.Builder> implements com.android.aapt.StyleStringOrBuilder {
            private int bitField0_;
            private Object str_;
            private List<com.android.aapt.StyleString.Span> spans_;
            private RepeatedFieldBuilderV3<com.android.aapt.StyleString.Span, com.android.aapt.StyleString.Span.Builder, com.android.aapt.StyleString.SpanOrBuilder> spansBuilder_;

            public static Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_StyleString_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_StyleString_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.StyleString.class, com.android.aapt.StyleString.Builder.class);
            }

            private Builder() {
                this.str_ = "";
                this.spans_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.str_ = "";
                this.spans_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.android.aapt.StyleString.alwaysUseFieldBuilders) {
                    this.getSpansFieldBuilder();
                }

            }

            public com.android.aapt.StyleString.Builder clear() {
                super.clear();
                this.str_ = "";
                if (this.spansBuilder_ == null) {
                    this.spans_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    this.spansBuilder_.clear();
                }

                return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Resources.internal_static_aapt_pb_StyleString_descriptor;
            }

            public com.android.aapt.StyleString getDefaultInstanceForType() {
                return com.android.aapt.StyleString.getDefaultInstance();
            }

            public com.android.aapt.StyleString build() {
                com.android.aapt.StyleString result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public com.android.aapt.StyleString buildPartial() {
                com.android.aapt.StyleString result = new com.android.aapt.StyleString(this);
                int from_bitField0_ = this.bitField0_;
                result.str_ = this.str_;
                if (this.spansBuilder_ == null) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.spans_ = Collections.unmodifiableList(this.spans_);
                        this.bitField0_ &= -2;
                    }

                    result.spans_ = this.spans_;
                } else {
                    result.spans_ = this.spansBuilder_.build();
                }

                this.onBuilt();
                return result;
            }

            public com.android.aapt.StyleString.Builder clone() {
                return (com.android.aapt.StyleString.Builder)super.clone();
            }

            public com.android.aapt.StyleString.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.StyleString.Builder)super.setField(field, value);
            }

            public com.android.aapt.StyleString.Builder clearField(Descriptors.FieldDescriptor field) {
                return (com.android.aapt.StyleString.Builder)super.clearField(field);
            }

            public com.android.aapt.StyleString.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (com.android.aapt.StyleString.Builder)super.clearOneof(oneof);
            }

            public com.android.aapt.StyleString.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (com.android.aapt.StyleString.Builder)super.setRepeatedField(field, index, value);
            }

            public com.android.aapt.StyleString.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.StyleString.Builder)super.addRepeatedField(field, value);
            }

            public com.android.aapt.StyleString.Builder mergeFrom(Message other) {
                if (other instanceof com.android.aapt.StyleString) {
                    return this.mergeFrom((com.android.aapt.StyleString)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public com.android.aapt.StyleString.Builder mergeFrom(com.android.aapt.StyleString other) {
                if (other == com.android.aapt.StyleString.getDefaultInstance()) {
                    return this;
                } else {
                    if (!other.getStr().isEmpty()) {
                        this.str_ = other.str_;
                        this.onChanged();
                    }

                    if (this.spansBuilder_ == null) {
                        if (!other.spans_.isEmpty()) {
                            if (this.spans_.isEmpty()) {
                                this.spans_ = other.spans_;
                                this.bitField0_ &= -2;
                            } else {
                                this.ensureSpansIsMutable();
                                this.spans_.addAll(other.spans_);
                            }

                            this.onChanged();
                        }
                    } else if (!other.spans_.isEmpty()) {
                        if (this.spansBuilder_.isEmpty()) {
                            this.spansBuilder_.dispose();
                            this.spansBuilder_ = null;
                            this.spans_ = other.spans_;
                            this.bitField0_ &= -2;
                            this.spansBuilder_ = com.android.aapt.StyleString.alwaysUseFieldBuilders ? this.getSpansFieldBuilder() : null;
                        } else {
                            this.spansBuilder_.addAllMessages(other.spans_);
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

            public com.android.aapt.StyleString.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                com.android.aapt.StyleString parsedMessage = null;

                try {
                    parsedMessage = (com.android.aapt.StyleString)com.android.aapt.StyleString.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (com.android.aapt.StyleString)var8.getUnfinishedMessage();
                    throw var8.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }

                }

                return this;
            }

            public java.lang.String getStr() {
                Object ref = this.str_;
                if (!(ref instanceof java.lang.String)) {
                    ByteString bs = (ByteString)ref;
                    java.lang.String s = bs.toStringUtf8();
                    this.str_ = s;
                    return s;
                } else {
                    return (java.lang.String)ref;
                }
            }

            public ByteString getStrBytes() {
                Object ref = this.str_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                    this.str_ = b;
                    return b;
                } else {
                    return (ByteString)ref;
                }
            }

            public com.android.aapt.StyleString.Builder setStr(java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.str_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public com.android.aapt.StyleString.Builder clearStr() {
                this.str_ = com.android.aapt.StyleString.getDefaultInstance().getStr();
                this.onChanged();
                return this;
            }

            public com.android.aapt.StyleString.Builder setStrBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    com.android.aapt.StyleString.checkByteStringIsUtf8(value);
                    this.str_ = value;
                    this.onChanged();
                    return this;
                }
            }

            private void ensureSpansIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.spans_ = new ArrayList(this.spans_);
                    this.bitField0_ |= 1;
                }

            }

            public List<com.android.aapt.StyleString.Span> getSpansList() {
                return this.spansBuilder_ == null ? Collections.unmodifiableList(this.spans_) : this.spansBuilder_.getMessageList();
            }

            public int getSpansCount() {
                return this.spansBuilder_ == null ? this.spans_.size() : this.spansBuilder_.getCount();
            }

            public com.android.aapt.StyleString.Span getSpans(int index) {
                return this.spansBuilder_ == null ? (com.android.aapt.StyleString.Span)this.spans_.get(index) : (com.android.aapt.StyleString.Span)this.spansBuilder_.getMessage(index);
            }

            public com.android.aapt.StyleString.Builder setSpans(int index, com.android.aapt.StyleString.Span value) {
                if (this.spansBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureSpansIsMutable();
                    this.spans_.set(index, value);
                    this.onChanged();
                } else {
                    this.spansBuilder_.setMessage(index, value);
                }

                return this;
            }

            public com.android.aapt.StyleString.Builder setSpans(int index, com.android.aapt.StyleString.Span.Builder builderForValue) {
                if (this.spansBuilder_ == null) {
                    this.ensureSpansIsMutable();
                    this.spans_.set(index, builderForValue.build());
                    this.onChanged();
                } else {
                    this.spansBuilder_.setMessage(index, builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.StyleString.Builder addSpans(com.android.aapt.StyleString.Span value) {
                if (this.spansBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureSpansIsMutable();
                    this.spans_.add(value);
                    this.onChanged();
                } else {
                    this.spansBuilder_.addMessage(value);
                }

                return this;
            }

            public com.android.aapt.StyleString.Builder addSpans(int index, com.android.aapt.StyleString.Span value) {
                if (this.spansBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureSpansIsMutable();
                    this.spans_.add(index, value);
                    this.onChanged();
                } else {
                    this.spansBuilder_.addMessage(index, value);
                }

                return this;
            }

            public com.android.aapt.StyleString.Builder addSpans(com.android.aapt.StyleString.Span.Builder builderForValue) {
                if (this.spansBuilder_ == null) {
                    this.ensureSpansIsMutable();
                    this.spans_.add(builderForValue.build());
                    this.onChanged();
                } else {
                    this.spansBuilder_.addMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.StyleString.Builder addSpans(int index, com.android.aapt.StyleString.Span.Builder builderForValue) {
                if (this.spansBuilder_ == null) {
                    this.ensureSpansIsMutable();
                    this.spans_.add(index, builderForValue.build());
                    this.onChanged();
                } else {
                    this.spansBuilder_.addMessage(index, builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.StyleString.Builder addAllSpans(Iterable<? extends com.android.aapt.StyleString.Span> values) {
                if (this.spansBuilder_ == null) {
                    this.ensureSpansIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.spans_);
                    this.onChanged();
                } else {
                    this.spansBuilder_.addAllMessages(values);
                }

                return this;
            }

            public com.android.aapt.StyleString.Builder clearSpans() {
                if (this.spansBuilder_ == null) {
                    this.spans_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    this.onChanged();
                } else {
                    this.spansBuilder_.clear();
                }

                return this;
            }

            public com.android.aapt.StyleString.Builder removeSpans(int index) {
                if (this.spansBuilder_ == null) {
                    this.ensureSpansIsMutable();
                    this.spans_.remove(index);
                    this.onChanged();
                } else {
                    this.spansBuilder_.remove(index);
                }

                return this;
            }

            public com.android.aapt.StyleString.Span.Builder getSpansBuilder(int index) {
                return (com.android.aapt.StyleString.Span.Builder)this.getSpansFieldBuilder().getBuilder(index);
            }

            public com.android.aapt.StyleString.SpanOrBuilder getSpansOrBuilder(int index) {
                return this.spansBuilder_ == null ? (com.android.aapt.StyleString.SpanOrBuilder)this.spans_.get(index) : (com.android.aapt.StyleString.SpanOrBuilder)this.spansBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends com.android.aapt.StyleString.SpanOrBuilder> getSpansOrBuilderList() {
                return this.spansBuilder_ != null ? this.spansBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.spans_);
            }

            public com.android.aapt.StyleString.Span.Builder addSpansBuilder() {
                return (com.android.aapt.StyleString.Span.Builder)this.getSpansFieldBuilder().addBuilder(com.android.aapt.StyleString.Span.getDefaultInstance());
            }

            public com.android.aapt.StyleString.Span.Builder addSpansBuilder(int index) {
                return (com.android.aapt.StyleString.Span.Builder)this.getSpansFieldBuilder().addBuilder(index, com.android.aapt.StyleString.Span.getDefaultInstance());
            }

            public List<com.android.aapt.StyleString.Span.Builder> getSpansBuilderList() {
                return this.getSpansFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<com.android.aapt.StyleString.Span, com.android.aapt.StyleString.Span.Builder, com.android.aapt.StyleString.SpanOrBuilder> getSpansFieldBuilder() {
                if (this.spansBuilder_ == null) {
                    this.spansBuilder_ = new RepeatedFieldBuilderV3(this.spans_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
                    this.spans_ = null;
                }

                return this.spansBuilder_;
            }

            public final com.android.aapt.StyleString.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.StyleString.Builder)super.setUnknownFields(unknownFields);
            }

            public final com.android.aapt.StyleString.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.StyleString.Builder)super.mergeUnknownFields(unknownFields);
            }
        }

        public static final class Span extends GeneratedMessageV3 implements com.android.aapt.StyleString.SpanOrBuilder {
            private static final long serialVersionUID = 0L;
            public static final int NAME_FIELD_NUMBER = 1;
            private volatile Object name_;
            public static final int START_INDEX_FIELD_NUMBER = 2;
            private int startIndex_;
            public static final int END_INDEX_FIELD_NUMBER = 3;
            private int endIndex_;
            private byte memoizedIsInitialized;
            private static final com.android.aapt.StyleString.Span DEFAULT_INSTANCE = new com.android.aapt.StyleString.Span();
            private static final Parser<com.android.aapt.StyleString.Span> PARSER = new AbstractParser<com.android.aapt.StyleString.Span>() {
                public com.android.aapt.StyleString.Span parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new com.android.aapt.StyleString.Span(input, extensionRegistry);
                }
            };

            private Span(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = -1;
            }

            private Span() {
                this.memoizedIsInitialized = -1;
                this.name_ = "";
            }

            @Override
            public Object newInstance(UnusedPrivateParameter unused) {
                return new com.android.aapt.StyleString.Span();
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
                                    this.name_ = s;
                                    break;
                                case 16:
                                    this.startIndex_ = input.readUInt32();
                                    break;
                                case 24:
                                    this.endIndex_ = input.readUInt32();
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
                return Resources.internal_static_aapt_pb_StyleString_Span_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_StyleString_Span_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.StyleString.Span.class, com.android.aapt.StyleString.Span.Builder.class);
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

            public int getStartIndex() {
                return this.startIndex_;
            }

            public int getEndIndex() {
                return this.endIndex_;
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

                if (this.startIndex_ != 0) {
                    output.writeUInt32(2, this.startIndex_);
                }

                if (this.endIndex_ != 0) {
                    output.writeUInt32(3, this.endIndex_);
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

                    if (this.startIndex_ != 0) {
                        size += CodedOutputStream.computeUInt32Size(2, this.startIndex_);
                    }

                    if (this.endIndex_ != 0) {
                        size += CodedOutputStream.computeUInt32Size(3, this.endIndex_);
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
                } else if (!(obj instanceof com.android.aapt.StyleString.Span)) {
                    return super.equals(obj);
                } else {
                    com.android.aapt.StyleString.Span other = (com.android.aapt.StyleString.Span)obj;
                    if (!this.getName().equals(other.getName())) {
                        return false;
                    } else if (this.getStartIndex() != other.getStartIndex()) {
                        return false;
                    } else if (this.getEndIndex() != other.getEndIndex()) {
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
                    hash = 37 * hash + 2;
                    hash = 53 * hash + this.getStartIndex();
                    hash = 37 * hash + 3;
                    hash = 53 * hash + this.getEndIndex();
                    hash = 29 * hash + this.unknownFields.hashCode();
                    this.memoizedHashCode = hash;
                    return hash;
                }
            }

            public static com.android.aapt.StyleString.Span parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (com.android.aapt.StyleString.Span)PARSER.parseFrom(data);
            }

            public static com.android.aapt.StyleString.Span parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (com.android.aapt.StyleString.Span)PARSER.parseFrom(data, extensionRegistry);
            }

            public static com.android.aapt.StyleString.Span parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (com.android.aapt.StyleString.Span)PARSER.parseFrom(data);
            }

            public static com.android.aapt.StyleString.Span parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (com.android.aapt.StyleString.Span)PARSER.parseFrom(data, extensionRegistry);
            }

            public static com.android.aapt.StyleString.Span parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (com.android.aapt.StyleString.Span)PARSER.parseFrom(data);
            }

            public static com.android.aapt.StyleString.Span parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (com.android.aapt.StyleString.Span)PARSER.parseFrom(data, extensionRegistry);
            }

            public static com.android.aapt.StyleString.Span parseFrom(InputStream input) throws IOException {
                return (com.android.aapt.StyleString.Span)GeneratedMessageV3.parseWithIOException(PARSER, input);
            }

            public static com.android.aapt.StyleString.Span parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (com.android.aapt.StyleString.Span)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
            }

            public static com.android.aapt.StyleString.Span parseDelimitedFrom(InputStream input) throws IOException {
                return (com.android.aapt.StyleString.Span)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
            }

            public static com.android.aapt.StyleString.Span parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (com.android.aapt.StyleString.Span)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }

            public static com.android.aapt.StyleString.Span parseFrom(CodedInputStream input) throws IOException {
                return (com.android.aapt.StyleString.Span)GeneratedMessageV3.parseWithIOException(PARSER, input);
            }

            public static com.android.aapt.StyleString.Span parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (com.android.aapt.StyleString.Span)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
            }

            public com.android.aapt.StyleString.Span.Builder newBuilderForType() {
                return newBuilder();
            }

            public static com.android.aapt.StyleString.Span.Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static com.android.aapt.StyleString.Span.Builder newBuilder(com.android.aapt.StyleString.Span prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }

            public com.android.aapt.StyleString.Span.Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new com.android.aapt.StyleString.Span.Builder() : (new com.android.aapt.StyleString.Span.Builder()).mergeFrom(this);
            }

            public com.android.aapt.StyleString.Span.Builder newBuilderForType(BuilderParent parent) {
                com.android.aapt.StyleString.Span.Builder builder = new com.android.aapt.StyleString.Span.Builder(parent);
                return builder;
            }

            public static com.android.aapt.StyleString.Span getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<com.android.aapt.StyleString.Span> parser() {
                return PARSER;
            }

            public Parser<com.android.aapt.StyleString.Span> getParserForType() {
                return PARSER;
            }

            public com.android.aapt.StyleString.Span getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.StyleString.Span.Builder> implements com.android.aapt.StyleString.SpanOrBuilder {
                private Object name_;
                private int startIndex_;
                private int endIndex_;

                public static Descriptors.Descriptor getDescriptor() {
                    return Resources.internal_static_aapt_pb_StyleString_Span_descriptor;
                }

                public FieldAccessorTable internalGetFieldAccessorTable() {
                    return Resources.internal_static_aapt_pb_StyleString_Span_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.StyleString.Span.class, com.android.aapt.StyleString.Span.Builder.class);
                }

                private Builder() {
                    this.name_ = "";
                    this.maybeForceBuilderInitialization();
                }

                private Builder(BuilderParent parent) {
                    super(parent);
                    this.name_ = "";
                    this.maybeForceBuilderInitialization();
                }

                private void maybeForceBuilderInitialization() {
                    if (com.android.aapt.StyleString.Span.alwaysUseFieldBuilders) {
                    }

                }

                public com.android.aapt.StyleString.Span.Builder clear() {
                    super.clear();
                    this.name_ = "";
                    this.startIndex_ = 0;
                    this.endIndex_ = 0;
                    return this;
                }

                @Override
                public Descriptors.Descriptor getDescriptorForType() {
                    return Resources.internal_static_aapt_pb_StyleString_Span_descriptor;
                }

                public com.android.aapt.StyleString.Span getDefaultInstanceForType() {
                    return com.android.aapt.StyleString.Span.getDefaultInstance();
                }

                public com.android.aapt.StyleString.Span build() {
                    com.android.aapt.StyleString.Span result = this.buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    } else {
                        return result;
                    }
                }

                public com.android.aapt.StyleString.Span buildPartial() {
                    com.android.aapt.StyleString.Span result = new com.android.aapt.StyleString.Span(this);
                    result.name_ = this.name_;
                    result.startIndex_ = this.startIndex_;
                    result.endIndex_ = this.endIndex_;
                    this.onBuilt();
                    return result;
                }

                public com.android.aapt.StyleString.Span.Builder clone() {
                    return (com.android.aapt.StyleString.Span.Builder)super.clone();
                }

                public com.android.aapt.StyleString.Span.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                    return (com.android.aapt.StyleString.Span.Builder)super.setField(field, value);
                }

                public com.android.aapt.StyleString.Span.Builder clearField(Descriptors.FieldDescriptor field) {
                    return (com.android.aapt.StyleString.Span.Builder)super.clearField(field);
                }

                public com.android.aapt.StyleString.Span.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                    return (com.android.aapt.StyleString.Span.Builder)super.clearOneof(oneof);
                }

                public com.android.aapt.StyleString.Span.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                    return (com.android.aapt.StyleString.Span.Builder)super.setRepeatedField(field, index, value);
                }

                public com.android.aapt.StyleString.Span.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                    return (com.android.aapt.StyleString.Span.Builder)super.addRepeatedField(field, value);
                }

                public com.android.aapt.StyleString.Span.Builder mergeFrom(Message other) {
                    if (other instanceof com.android.aapt.StyleString.Span) {
                        return this.mergeFrom((com.android.aapt.StyleString.Span)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public com.android.aapt.StyleString.Span.Builder mergeFrom(com.android.aapt.StyleString.Span other) {
                    if (other == com.android.aapt.StyleString.Span.getDefaultInstance()) {
                        return this;
                    } else {
                        if (!other.getName().isEmpty()) {
                            this.name_ = other.name_;
                            this.onChanged();
                        }

                        if (other.getStartIndex() != 0) {
                            this.setStartIndex(other.getStartIndex());
                        }

                        if (other.getEndIndex() != 0) {
                            this.setEndIndex(other.getEndIndex());
                        }

                        this.mergeUnknownFields(other.unknownFields);
                        this.onChanged();
                        return this;
                    }
                }

                public final boolean isInitialized() {
                    return true;
                }

                public com.android.aapt.StyleString.Span.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                    com.android.aapt.StyleString.Span parsedMessage = null;

                    try {
                        parsedMessage = (com.android.aapt.StyleString.Span)com.android.aapt.StyleString.Span.PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (InvalidProtocolBufferException var8) {
                        parsedMessage = (com.android.aapt.StyleString.Span)var8.getUnfinishedMessage();
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

                public com.android.aapt.StyleString.Span.Builder setName(java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    } else {
                        this.name_ = value;
                        this.onChanged();
                        return this;
                    }
                }

                public com.android.aapt.StyleString.Span.Builder clearName() {
                    this.name_ = com.android.aapt.StyleString.Span.getDefaultInstance().getName();
                    this.onChanged();
                    return this;
                }

                public com.android.aapt.StyleString.Span.Builder setNameBytes(ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    } else {
                        com.android.aapt.StyleString.Span.checkByteStringIsUtf8(value);
                        this.name_ = value;
                        this.onChanged();
                        return this;
                    }
                }

                public int getStartIndex() {
                    return this.startIndex_;
                }

                public com.android.aapt.StyleString.Span.Builder setStartIndex(int value) {
                    this.startIndex_ = value;
                    this.onChanged();
                    return this;
                }

                public com.android.aapt.StyleString.Span.Builder clearStartIndex() {
                    this.startIndex_ = 0;
                    this.onChanged();
                    return this;
                }

                public int getEndIndex() {
                    return this.endIndex_;
                }

                public com.android.aapt.StyleString.Span.Builder setEndIndex(int value) {
                    this.endIndex_ = value;
                    this.onChanged();
                    return this;
                }

                public com.android.aapt.StyleString.Span.Builder clearEndIndex() {
                    this.endIndex_ = 0;
                    this.onChanged();
                    return this;
                }

                public final com.android.aapt.StyleString.Span.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                    return (com.android.aapt.StyleString.Span.Builder)super.setUnknownFields(unknownFields);
                }

                public final com.android.aapt.StyleString.Span.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                    return (com.android.aapt.StyleString.Span.Builder)super.mergeUnknownFields(unknownFields);
                }
            }
        }

        public interface SpanOrBuilder extends MessageOrBuilder {
            java.lang.String getName();

            ByteString getNameBytes();

            int getStartIndex();

            int getEndIndex();
        }
    }