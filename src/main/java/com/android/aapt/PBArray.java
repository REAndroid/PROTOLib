package com.android.aapt;

import com.google.protobuf.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PBArray extends GeneratedMessageV3 implements com.android.aapt.ArrayOrBuilder {
        private static final long serialVersionUID = 0L;
        public static final int ELEMENT_FIELD_NUMBER = 1;
        private List<PBArray.Element> element_;
        private byte memoizedIsInitialized;
        private static final PBArray DEFAULT_INSTANCE = new PBArray();
        private static final Parser<PBArray> PARSER = new AbstractParser<PBArray>() {
            public PBArray parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new PBArray(input, extensionRegistry);
            }
        };

        private PBArray(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private PBArray() {
            this.memoizedIsInitialized = -1;
            this.element_ = Collections.emptyList();
        }

        @Override
        public Object newInstance(UnusedPrivateParameter unused) {
            return new PBArray();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private PBArray(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                if (!(mutable_bitField0_ & true)) {
                                    this.element_ = new ArrayList();
                                    mutable_bitField0_ |= true;
                                }

                                this.element_.add((PBArray.Element)input.readMessage(PBArray.Element.parser(), extensionRegistry));
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
                    if (mutable_bitField0_ & true) {
                        this.element_ = Collections.unmodifiableList(this.element_);
                    }

                    this.unknownFields = unknownFields.build();
                    this.makeExtensionsImmutable();
                }

            }
        }

        public static Descriptors.Descriptor getDescriptor() {
            return Resources.internal_static_aapt_pb_Array_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_Array_fieldAccessorTable.ensureFieldAccessorsInitialized(PBArray.class, PBArray.Builder.class);
        }

        public List<PBArray.Element> getElementList() {
            return this.element_;
        }

        public List<? extends PBArray.ElementOrBuilder> getElementOrBuilderList() {
            return this.element_;
        }

        public int getElementCount() {
            return this.element_.size();
        }

        public PBArray.Element getElement(int index) {
            return (PBArray.Element)this.element_.get(index);
        }

        public PBArray.ElementOrBuilder getElementOrBuilder(int index) {
            return (PBArray.ElementOrBuilder)this.element_.get(index);
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
            for(int i = 0; i < this.element_.size(); ++i) {
                output.writeMessage(1, (MessageLite)this.element_.get(i));
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

                for(int i = 0; i < this.element_.size(); ++i) {
                    size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.element_.get(i));
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
            } else if (!(obj instanceof PBArray)) {
                return super.equals(obj);
            } else {
                PBArray other = (PBArray)obj;
                if (!this.getElementList().equals(other.getElementList())) {
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
                if (this.getElementCount() > 0) {
                    hash = 37 * hash + 1;
                    hash = 53 * hash + this.getElementList().hashCode();
                }

                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static PBArray parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (PBArray)PARSER.parseFrom(data);
        }

        public static PBArray parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PBArray)PARSER.parseFrom(data, extensionRegistry);
        }

        public static PBArray parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (PBArray)PARSER.parseFrom(data);
        }

        public static PBArray parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PBArray)PARSER.parseFrom(data, extensionRegistry);
        }

        public static PBArray parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (PBArray)PARSER.parseFrom(data);
        }

        public static PBArray parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PBArray)PARSER.parseFrom(data, extensionRegistry);
        }

        public static PBArray parseFrom(InputStream input) throws IOException {
            return (PBArray)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static PBArray parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PBArray)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static PBArray parseDelimitedFrom(InputStream input) throws IOException {
            return (PBArray)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static PBArray parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PBArray)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static PBArray parseFrom(CodedInputStream input) throws IOException {
            return (PBArray)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static PBArray parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PBArray)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public PBArray.Builder newBuilderForType() {
            return newBuilder();
        }

        public static PBArray.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PBArray.Builder newBuilder(PBArray prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public PBArray.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new PBArray.Builder() : (new PBArray.Builder()).mergeFrom(this);
        }

        public PBArray.Builder newBuilderForType(BuilderParent parent) {
            PBArray.Builder builder = new PBArray.Builder(parent);
            return builder;
        }

        public static PBArray getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<PBArray> parser() {
            return PARSER;
        }

        public Parser<PBArray> getParserForType() {
            return PARSER;
        }

        public PBArray getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<PBArray.Builder> implements com.android.aapt.ArrayOrBuilder {
            private int bitField0_;
            private List<PBArray.Element> element_;
            private RepeatedFieldBuilderV3<PBArray.Element, PBArray.Element.Builder, PBArray.ElementOrBuilder> elementBuilder_;

            public static Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_Array_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_Array_fieldAccessorTable.ensureFieldAccessorsInitialized(PBArray.class, PBArray.Builder.class);
            }

            private Builder() {
                this.element_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.element_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (PBArray.alwaysUseFieldBuilders) {
                    this.getElementFieldBuilder();
                }

            }

            public PBArray.Builder clear() {
                super.clear();
                if (this.elementBuilder_ == null) {
                    this.element_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    this.elementBuilder_.clear();
                }

                return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Resources.internal_static_aapt_pb_Array_descriptor;
            }

            public PBArray getDefaultInstanceForType() {
                return PBArray.getDefaultInstance();
            }

            public PBArray build() {
                PBArray result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public PBArray buildPartial() {
                PBArray result = new PBArray(this);
                int from_bitField0_ = this.bitField0_;
                if (this.elementBuilder_ == null) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.element_ = Collections.unmodifiableList(this.element_);
                        this.bitField0_ &= -2;
                    }

                    result.element_ = this.element_;
                } else {
                    result.element_ = this.elementBuilder_.build();
                }

                this.onBuilt();
                return result;
            }

            public PBArray.Builder clone() {
                return (PBArray.Builder)super.clone();
            }

            public PBArray.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (PBArray.Builder)super.setField(field, value);
            }

            public PBArray.Builder clearField(Descriptors.FieldDescriptor field) {
                return (PBArray.Builder)super.clearField(field);
            }

            public PBArray.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (PBArray.Builder)super.clearOneof(oneof);
            }

            public PBArray.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (PBArray.Builder)super.setRepeatedField(field, index, value);
            }

            public PBArray.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (PBArray.Builder)super.addRepeatedField(field, value);
            }

            public PBArray.Builder mergeFrom(Message other) {
                if (other instanceof PBArray) {
                    return this.mergeFrom((PBArray)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public PBArray.Builder mergeFrom(PBArray other) {
                if (other == PBArray.getDefaultInstance()) {
                    return this;
                } else {
                    if (this.elementBuilder_ == null) {
                        if (!other.element_.isEmpty()) {
                            if (this.element_.isEmpty()) {
                                this.element_ = other.element_;
                                this.bitField0_ &= -2;
                            } else {
                                this.ensureElementIsMutable();
                                this.element_.addAll(other.element_);
                            }

                            this.onChanged();
                        }
                    } else if (!other.element_.isEmpty()) {
                        if (this.elementBuilder_.isEmpty()) {
                            this.elementBuilder_.dispose();
                            this.elementBuilder_ = null;
                            this.element_ = other.element_;
                            this.bitField0_ &= -2;
                            this.elementBuilder_ = PBArray.alwaysUseFieldBuilders ? this.getElementFieldBuilder() : null;
                        } else {
                            this.elementBuilder_.addAllMessages(other.element_);
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

            public PBArray.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                PBArray parsedMessage = null;

                try {
                    parsedMessage = (PBArray) PBArray.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (PBArray)var8.getUnfinishedMessage();
                    throw var8.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }

                }

                return this;
            }

            private void ensureElementIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.element_ = new ArrayList(this.element_);
                    this.bitField0_ |= 1;
                }

            }

            public List<PBArray.Element> getElementList() {
                return this.elementBuilder_ == null ? Collections.unmodifiableList(this.element_) : this.elementBuilder_.getMessageList();
            }

            public int getElementCount() {
                return this.elementBuilder_ == null ? this.element_.size() : this.elementBuilder_.getCount();
            }

            public PBArray.Element getElement(int index) {
                return this.elementBuilder_ == null ? (PBArray.Element)this.element_.get(index) : (PBArray.Element)this.elementBuilder_.getMessage(index);
            }

            public PBArray.Builder setElement(int index, PBArray.Element value) {
                if (this.elementBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureElementIsMutable();
                    this.element_.set(index, value);
                    this.onChanged();
                } else {
                    this.elementBuilder_.setMessage(index, value);
                }

                return this;
            }

            public PBArray.Builder setElement(int index, PBArray.Element.Builder builderForValue) {
                if (this.elementBuilder_ == null) {
                    this.ensureElementIsMutable();
                    this.element_.set(index, builderForValue.build());
                    this.onChanged();
                } else {
                    this.elementBuilder_.setMessage(index, builderForValue.build());
                }

                return this;
            }

            public PBArray.Builder addElement(PBArray.Element value) {
                if (this.elementBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureElementIsMutable();
                    this.element_.add(value);
                    this.onChanged();
                } else {
                    this.elementBuilder_.addMessage(value);
                }

                return this;
            }

            public PBArray.Builder addElement(int index, PBArray.Element value) {
                if (this.elementBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureElementIsMutable();
                    this.element_.add(index, value);
                    this.onChanged();
                } else {
                    this.elementBuilder_.addMessage(index, value);
                }

                return this;
            }

            public PBArray.Builder addElement(PBArray.Element.Builder builderForValue) {
                if (this.elementBuilder_ == null) {
                    this.ensureElementIsMutable();
                    this.element_.add(builderForValue.build());
                    this.onChanged();
                } else {
                    this.elementBuilder_.addMessage(builderForValue.build());
                }

                return this;
            }

            public PBArray.Builder addElement(int index, PBArray.Element.Builder builderForValue) {
                if (this.elementBuilder_ == null) {
                    this.ensureElementIsMutable();
                    this.element_.add(index, builderForValue.build());
                    this.onChanged();
                } else {
                    this.elementBuilder_.addMessage(index, builderForValue.build());
                }

                return this;
            }

            public PBArray.Builder addAllElement(Iterable<? extends PBArray.Element> values) {
                if (this.elementBuilder_ == null) {
                    this.ensureElementIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.element_);
                    this.onChanged();
                } else {
                    this.elementBuilder_.addAllMessages(values);
                }

                return this;
            }

            public PBArray.Builder clearElement() {
                if (this.elementBuilder_ == null) {
                    this.element_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    this.onChanged();
                } else {
                    this.elementBuilder_.clear();
                }

                return this;
            }

            public PBArray.Builder removeElement(int index) {
                if (this.elementBuilder_ == null) {
                    this.ensureElementIsMutable();
                    this.element_.remove(index);
                    this.onChanged();
                } else {
                    this.elementBuilder_.remove(index);
                }

                return this;
            }

            public PBArray.Element.Builder getElementBuilder(int index) {
                return (PBArray.Element.Builder)this.getElementFieldBuilder().getBuilder(index);
            }

            public PBArray.ElementOrBuilder getElementOrBuilder(int index) {
                return this.elementBuilder_ == null ? (PBArray.ElementOrBuilder)this.element_.get(index) : (PBArray.ElementOrBuilder)this.elementBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends PBArray.ElementOrBuilder> getElementOrBuilderList() {
                return this.elementBuilder_ != null ? this.elementBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.element_);
            }

            public PBArray.Element.Builder addElementBuilder() {
                return (PBArray.Element.Builder)this.getElementFieldBuilder().addBuilder(PBArray.Element.getDefaultInstance());
            }

            public PBArray.Element.Builder addElementBuilder(int index) {
                return (PBArray.Element.Builder)this.getElementFieldBuilder().addBuilder(index, PBArray.Element.getDefaultInstance());
            }

            public List<PBArray.Element.Builder> getElementBuilderList() {
                return this.getElementFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<PBArray.Element, PBArray.Element.Builder, PBArray.ElementOrBuilder> getElementFieldBuilder() {
                if (this.elementBuilder_ == null) {
                    this.elementBuilder_ = new RepeatedFieldBuilderV3(this.element_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
                    this.element_ = null;
                }

                return this.elementBuilder_;
            }

            public final PBArray.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (PBArray.Builder)super.setUnknownFields(unknownFields);
            }

            public final PBArray.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (PBArray.Builder)super.mergeUnknownFields(unknownFields);
            }
        }

        public static final class Element extends GeneratedMessageV3 implements PBArray.ElementOrBuilder {
            private static final long serialVersionUID = 0L;
            public static final int SOURCE_FIELD_NUMBER = 1;
            private com.android.aapt.Source source_;
            public static final int COMMENT_FIELD_NUMBER = 2;
            private volatile Object comment_;
            public static final int ITEM_FIELD_NUMBER = 3;
            private com.android.aapt.Item item_;
            private byte memoizedIsInitialized;
            private static final PBArray.Element DEFAULT_INSTANCE = new PBArray.Element();
            private static final Parser<PBArray.Element> PARSER = new AbstractParser<PBArray.Element>() {
                public PBArray.Element parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PBArray.Element(input, extensionRegistry);
                }
            };

            private Element(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = -1;
            }

            private Element() {
                this.memoizedIsInitialized = -1;
                this.comment_ = "";
            }

            @Override
            public Object newInstance(UnusedPrivateParameter unused) {
                return new PBArray.Element();
            }

            @Override
            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            private Element(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                case 26:
                                    com.android.aapt.Item.Builder subBuilder2 = null;
                                    if (this.item_ != null) {
                                        subBuilder2 = this.item_.toBuilder();
                                    }

                                    this.item_ = (com.android.aapt.Item)input.readMessage(com.android.aapt.Item.parser(), extensionRegistry);
                                    if (subBuilder2 != null) {
                                        subBuilder2.mergeFrom(this.item_);
                                        this.item_ = subBuilder2.buildPartial();
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
                return Resources.internal_static_aapt_pb_Array_Element_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_Array_Element_fieldAccessorTable.ensureFieldAccessorsInitialized(PBArray.Element.class, PBArray.Element.Builder.class);
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

            public boolean hasItem() {
                return this.item_ != null;
            }

            public com.android.aapt.Item getItem() {
                return this.item_ == null ? com.android.aapt.Item.getDefaultInstance() : this.item_;
            }

            public com.android.aapt.ItemOrBuilder getItemOrBuilder() {
                return this.getItem();
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

                if (!this.getCommentBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(output, 2, this.comment_);
                }

                if (this.item_ != null) {
                    output.writeMessage(3, this.getItem());
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

                    if (this.item_ != null) {
                        size += CodedOutputStream.computeMessageSize(3, this.getItem());
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
                } else if (!(obj instanceof PBArray.Element)) {
                    return super.equals(obj);
                } else {
                    PBArray.Element other = (PBArray.Element)obj;
                    if (this.hasSource() != other.hasSource()) {
                        return false;
                    } else if (this.hasSource() && !this.getSource().equals(other.getSource())) {
                        return false;
                    } else if (!this.getComment().equals(other.getComment())) {
                        return false;
                    } else if (this.hasItem() != other.hasItem()) {
                        return false;
                    } else if (this.hasItem() && !this.getItem().equals(other.getItem())) {
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
                    if (this.hasItem()) {
                        hash = 37 * hash + 3;
                        hash = 53 * hash + this.getItem().hashCode();
                    }

                    hash = 29 * hash + this.unknownFields.hashCode();
                    this.memoizedHashCode = hash;
                    return hash;
                }
            }

            public static PBArray.Element parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (PBArray.Element)PARSER.parseFrom(data);
            }

            public static PBArray.Element parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (PBArray.Element)PARSER.parseFrom(data, extensionRegistry);
            }

            public static PBArray.Element parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (PBArray.Element)PARSER.parseFrom(data);
            }

            public static PBArray.Element parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (PBArray.Element)PARSER.parseFrom(data, extensionRegistry);
            }

            public static PBArray.Element parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (PBArray.Element)PARSER.parseFrom(data);
            }

            public static PBArray.Element parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (PBArray.Element)PARSER.parseFrom(data, extensionRegistry);
            }

            public static PBArray.Element parseFrom(InputStream input) throws IOException {
                return (PBArray.Element)GeneratedMessageV3.parseWithIOException(PARSER, input);
            }

            public static PBArray.Element parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (PBArray.Element)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
            }

            public static PBArray.Element parseDelimitedFrom(InputStream input) throws IOException {
                return (PBArray.Element)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
            }

            public static PBArray.Element parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (PBArray.Element)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }

            public static PBArray.Element parseFrom(CodedInputStream input) throws IOException {
                return (PBArray.Element)GeneratedMessageV3.parseWithIOException(PARSER, input);
            }

            public static PBArray.Element parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (PBArray.Element)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
            }

            public PBArray.Element.Builder newBuilderForType() {
                return newBuilder();
            }

            public static PBArray.Element.Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static PBArray.Element.Builder newBuilder(PBArray.Element prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }

            public PBArray.Element.Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new PBArray.Element.Builder() : (new PBArray.Element.Builder()).mergeFrom(this);
            }

            public PBArray.Element.Builder newBuilderForType(BuilderParent parent) {
                PBArray.Element.Builder builder = new PBArray.Element.Builder(parent);
                return builder;
            }

            public static PBArray.Element getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<PBArray.Element> parser() {
                return PARSER;
            }

            public Parser<PBArray.Element> getParserForType() {
                return PARSER;
            }

            public PBArray.Element getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<PBArray.Element.Builder> implements PBArray.ElementOrBuilder {
                private com.android.aapt.Source source_;
                private SingleFieldBuilderV3<com.android.aapt.Source, com.android.aapt.Source.Builder, com.android.aapt.SourceOrBuilder> sourceBuilder_;
                private Object comment_;
                private com.android.aapt.Item item_;
                private SingleFieldBuilderV3<com.android.aapt.Item, com.android.aapt.Item.Builder, com.android.aapt.ItemOrBuilder> itemBuilder_;

                public static Descriptors.Descriptor getDescriptor() {
                    return Resources.internal_static_aapt_pb_Array_Element_descriptor;
                }

                public FieldAccessorTable internalGetFieldAccessorTable() {
                    return Resources.internal_static_aapt_pb_Array_Element_fieldAccessorTable.ensureFieldAccessorsInitialized(PBArray.Element.class, PBArray.Element.Builder.class);
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
                    if (PBArray.Element.alwaysUseFieldBuilders) {
                    }

                }

                public PBArray.Element.Builder clear() {
                    super.clear();
                    if (this.sourceBuilder_ == null) {
                        this.source_ = null;
                    } else {
                        this.source_ = null;
                        this.sourceBuilder_ = null;
                    }

                    this.comment_ = "";
                    if (this.itemBuilder_ == null) {
                        this.item_ = null;
                    } else {
                        this.item_ = null;
                        this.itemBuilder_ = null;
                    }

                    return this;
                }

                @Override
                public Descriptors.Descriptor getDescriptorForType() {
                    return Resources.internal_static_aapt_pb_Array_Element_descriptor;
                }

                public PBArray.Element getDefaultInstanceForType() {
                    return PBArray.Element.getDefaultInstance();
                }

                public PBArray.Element build() {
                    PBArray.Element result = this.buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    } else {
                        return result;
                    }
                }

                public PBArray.Element buildPartial() {
                    PBArray.Element result = new PBArray.Element(this);
                    if (this.sourceBuilder_ == null) {
                        result.source_ = this.source_;
                    } else {
                        result.source_ = (com.android.aapt.Source)this.sourceBuilder_.build();
                    }

                    result.comment_ = this.comment_;
                    if (this.itemBuilder_ == null) {
                        result.item_ = this.item_;
                    } else {
                        result.item_ = (com.android.aapt.Item)this.itemBuilder_.build();
                    }

                    this.onBuilt();
                    return result;
                }

                public PBArray.Element.Builder clone() {
                    return (PBArray.Element.Builder)super.clone();
                }

                public PBArray.Element.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                    return (PBArray.Element.Builder)super.setField(field, value);
                }

                public PBArray.Element.Builder clearField(Descriptors.FieldDescriptor field) {
                    return (PBArray.Element.Builder)super.clearField(field);
                }

                public PBArray.Element.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                    return (PBArray.Element.Builder)super.clearOneof(oneof);
                }

                public PBArray.Element.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                    return (PBArray.Element.Builder)super.setRepeatedField(field, index, value);
                }

                public PBArray.Element.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                    return (PBArray.Element.Builder)super.addRepeatedField(field, value);
                }

                public PBArray.Element.Builder mergeFrom(Message other) {
                    if (other instanceof PBArray.Element) {
                        return this.mergeFrom((PBArray.Element)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public PBArray.Element.Builder mergeFrom(PBArray.Element other) {
                    if (other == PBArray.Element.getDefaultInstance()) {
                        return this;
                    } else {
                        if (other.hasSource()) {
                            this.mergeSource(other.getSource());
                        }

                        if (!other.getComment().isEmpty()) {
                            this.comment_ = other.comment_;
                            this.onChanged();
                        }

                        if (other.hasItem()) {
                            this.mergeItem(other.getItem());
                        }

                        this.mergeUnknownFields(other.unknownFields);
                        this.onChanged();
                        return this;
                    }
                }

                public final boolean isInitialized() {
                    return true;
                }

                public PBArray.Element.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                    PBArray.Element parsedMessage = null;

                    try {
                        parsedMessage = (PBArray.Element) PBArray.Element.PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (InvalidProtocolBufferException var8) {
                        parsedMessage = (PBArray.Element)var8.getUnfinishedMessage();
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

                public PBArray.Element.Builder setSource(com.android.aapt.Source value) {
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

                public PBArray.Element.Builder setSource(com.android.aapt.Source.Builder builderForValue) {
                    if (this.sourceBuilder_ == null) {
                        this.source_ = builderForValue.build();
                        this.onChanged();
                    } else {
                        this.sourceBuilder_.setMessage(builderForValue.build());
                    }

                    return this;
                }

                public PBArray.Element.Builder mergeSource(com.android.aapt.Source value) {
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

                public PBArray.Element.Builder clearSource() {
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

                public PBArray.Element.Builder setComment(java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    } else {
                        this.comment_ = value;
                        this.onChanged();
                        return this;
                    }
                }

                public PBArray.Element.Builder clearComment() {
                    this.comment_ = PBArray.Element.getDefaultInstance().getComment();
                    this.onChanged();
                    return this;
                }

                public PBArray.Element.Builder setCommentBytes(ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    } else {
                        PBArray.Element.checkByteStringIsUtf8(value);
                        this.comment_ = value;
                        this.onChanged();
                        return this;
                    }
                }

                public boolean hasItem() {
                    return this.itemBuilder_ != null || this.item_ != null;
                }

                public com.android.aapt.Item getItem() {
                    if (this.itemBuilder_ == null) {
                        return this.item_ == null ? com.android.aapt.Item.getDefaultInstance() : this.item_;
                    } else {
                        return (com.android.aapt.Item)this.itemBuilder_.getMessage();
                    }
                }

                public PBArray.Element.Builder setItem(com.android.aapt.Item value) {
                    if (this.itemBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }

                        this.item_ = value;
                        this.onChanged();
                    } else {
                        this.itemBuilder_.setMessage(value);
                    }

                    return this;
                }

                public PBArray.Element.Builder setItem(com.android.aapt.Item.Builder builderForValue) {
                    if (this.itemBuilder_ == null) {
                        this.item_ = builderForValue.build();
                        this.onChanged();
                    } else {
                        this.itemBuilder_.setMessage(builderForValue.build());
                    }

                    return this;
                }

                public PBArray.Element.Builder mergeItem(com.android.aapt.Item value) {
                    if (this.itemBuilder_ == null) {
                        if (this.item_ != null) {
                            this.item_ = com.android.aapt.Item.newBuilder(this.item_).mergeFrom(value).buildPartial();
                        } else {
                            this.item_ = value;
                        }

                        this.onChanged();
                    } else {
                        this.itemBuilder_.mergeFrom(value);
                    }

                    return this;
                }

                public PBArray.Element.Builder clearItem() {
                    if (this.itemBuilder_ == null) {
                        this.item_ = null;
                        this.onChanged();
                    } else {
                        this.item_ = null;
                        this.itemBuilder_ = null;
                    }

                    return this;
                }

                public com.android.aapt.Item.Builder getItemBuilder() {
                    this.onChanged();
                    return (com.android.aapt.Item.Builder)this.getItemFieldBuilder().getBuilder();
                }

                public com.android.aapt.ItemOrBuilder getItemOrBuilder() {
                    if (this.itemBuilder_ != null) {
                        return (com.android.aapt.ItemOrBuilder)this.itemBuilder_.getMessageOrBuilder();
                    } else {
                        return this.item_ == null ? com.android.aapt.Item.getDefaultInstance() : this.item_;
                    }
                }

                private SingleFieldBuilderV3<com.android.aapt.Item, com.android.aapt.Item.Builder, com.android.aapt.ItemOrBuilder> getItemFieldBuilder() {
                    if (this.itemBuilder_ == null) {
                        this.itemBuilder_ = new SingleFieldBuilderV3(this.getItem(), this.getParentForChildren(), this.isClean());
                        this.item_ = null;
                    }

                    return this.itemBuilder_;
                }

                public final PBArray.Element.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                    return (PBArray.Element.Builder)super.setUnknownFields(unknownFields);
                }

                public final PBArray.Element.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                    return (PBArray.Element.Builder)super.mergeUnknownFields(unknownFields);
                }
            }
        }

        public interface ElementOrBuilder extends MessageOrBuilder {
            boolean hasSource();

            com.android.aapt.Source getSource();

            com.android.aapt.SourceOrBuilder getSourceOrBuilder();

            java.lang.String getComment();

            ByteString getCommentBytes();

            boolean hasItem();

            com.android.aapt.Item getItem();

            com.android.aapt.ItemOrBuilder getItemOrBuilder();
        }
    }