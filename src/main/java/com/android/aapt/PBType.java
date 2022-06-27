package com.android.aapt;

import com.google.protobuf.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PBType extends GeneratedMessageV3 implements com.android.aapt.TypeOrBuilder {
        private static final long serialVersionUID = 0L;
        public static final int TYPE_ID_FIELD_NUMBER = 1;
        private com.android.aapt.TypeId typeId_;
        public static final int NAME_FIELD_NUMBER = 2;
        private volatile Object name_;
        public static final int ENTRY_FIELD_NUMBER = 3;
        private List<com.android.aapt.Entry> entry_;
        private byte memoizedIsInitialized;
        private static final PBType DEFAULT_INSTANCE = new PBType();
        private static final Parser<PBType> PARSER = new AbstractParser<PBType>() {
            public PBType parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new PBType(input, extensionRegistry);
            }
        };

        private PBType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private PBType() {
            this.memoizedIsInitialized = -1;
            this.name_ = "";
            this.entry_ = Collections.emptyList();
        }

        @Override
        public Object newInstance(UnusedPrivateParameter unused) {
            return new PBType();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private PBType(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                com.android.aapt.TypeId.Builder subBuilder = null;
                                if (this.typeId_ != null) {
                                    subBuilder = this.typeId_.toBuilder();
                                }

                                this.typeId_ = (com.android.aapt.TypeId)input.readMessage(com.android.aapt.TypeId.parser(), extensionRegistry);
                                if (subBuilder != null) {
                                    subBuilder.mergeFrom(this.typeId_);
                                    this.typeId_ = subBuilder.buildPartial();
                                }
                                break;
                            case 18:
                                java.lang.String s = input.readStringRequireUtf8();
                                this.name_ = s;
                                break;
                            case 26:
                                if (!(mutable_bitField0_ & true)) {
                                    this.entry_ = new ArrayList();
                                    mutable_bitField0_ |= true;
                                }

                                this.entry_.add((com.android.aapt.Entry)input.readMessage(com.android.aapt.Entry.parser(), extensionRegistry));
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
                        this.entry_ = Collections.unmodifiableList(this.entry_);
                    }

                    this.unknownFields = unknownFields.build();
                    this.makeExtensionsImmutable();
                }

            }
        }

        public static Descriptors.Descriptor getDescriptor() {
            return Resources.internal_static_aapt_pb_Type_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_Type_fieldAccessorTable.ensureFieldAccessorsInitialized(PBType.class, PBType.Builder.class);
        }

        public boolean hasTypeId() {
            return this.typeId_ != null;
        }

        public com.android.aapt.TypeId getTypeId() {
            return this.typeId_ == null ? com.android.aapt.TypeId.getDefaultInstance() : this.typeId_;
        }

        public com.android.aapt.TypeIdOrBuilder getTypeIdOrBuilder() {
            return this.getTypeId();
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

        public List<com.android.aapt.Entry> getEntryList() {
            return this.entry_;
        }

        public List<? extends com.android.aapt.EntryOrBuilder> getEntryOrBuilderList() {
            return this.entry_;
        }

        public int getEntryCount() {
            return this.entry_.size();
        }

        public com.android.aapt.Entry getEntry(int index) {
            return (com.android.aapt.Entry)this.entry_.get(index);
        }

        public com.android.aapt.EntryOrBuilder getEntryOrBuilder(int index) {
            return (com.android.aapt.EntryOrBuilder)this.entry_.get(index);
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
            if (this.typeId_ != null) {
                output.writeMessage(1, this.getTypeId());
            }

            if (!this.getNameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 2, this.name_);
            }

            for(int i = 0; i < this.entry_.size(); ++i) {
                output.writeMessage(3, (MessageLite)this.entry_.get(i));
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
                if (this.typeId_ != null) {
                    size += CodedOutputStream.computeMessageSize(1, this.getTypeId());
                }

                if (!this.getNameBytes().isEmpty()) {
                    size += GeneratedMessageV3.computeStringSize(2, this.name_);
                }

                for(int i = 0; i < this.entry_.size(); ++i) {
                    size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.entry_.get(i));
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
            } else if (!(obj instanceof PBType)) {
                return super.equals(obj);
            } else {
                PBType other = (PBType)obj;
                if (this.hasTypeId() != other.hasTypeId()) {
                    return false;
                } else if (this.hasTypeId() && !this.getTypeId().equals(other.getTypeId())) {
                    return false;
                } else if (!this.getName().equals(other.getName())) {
                    return false;
                } else if (!this.getEntryList().equals(other.getEntryList())) {
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
                if (this.hasTypeId()) {
                    hash = 37 * hash + 1;
                    hash = 53 * hash + this.getTypeId().hashCode();
                }

                hash = 37 * hash + 2;
                hash = 53 * hash + this.getName().hashCode();
                if (this.getEntryCount() > 0) {
                    hash = 37 * hash + 3;
                    hash = 53 * hash + this.getEntryList().hashCode();
                }

                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static PBType parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (PBType)PARSER.parseFrom(data);
        }

        public static PBType parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PBType)PARSER.parseFrom(data, extensionRegistry);
        }

        public static PBType parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (PBType)PARSER.parseFrom(data);
        }

        public static PBType parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PBType)PARSER.parseFrom(data, extensionRegistry);
        }

        public static PBType parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (PBType)PARSER.parseFrom(data);
        }

        public static PBType parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PBType)PARSER.parseFrom(data, extensionRegistry);
        }

        public static PBType parseFrom(InputStream input) throws IOException {
            return (PBType)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static PBType parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PBType)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static PBType parseDelimitedFrom(InputStream input) throws IOException {
            return (PBType)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static PBType parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PBType)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static PBType parseFrom(CodedInputStream input) throws IOException {
            return (PBType)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static PBType parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PBType)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public PBType.Builder newBuilderForType() {
            return newBuilder();
        }

        public static PBType.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PBType.Builder newBuilder(PBType prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public PBType.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new PBType.Builder() : (new PBType.Builder()).mergeFrom(this);
        }

        public PBType.Builder newBuilderForType(BuilderParent parent) {
            PBType.Builder builder = new PBType.Builder(parent);
            return builder;
        }

        public static PBType getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<PBType> parser() {
            return PARSER;
        }

        public Parser<PBType> getParserForType() {
            return PARSER;
        }

        public PBType getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<PBType.Builder> implements com.android.aapt.TypeOrBuilder {
            private int bitField0_;
            private com.android.aapt.TypeId typeId_;
            private SingleFieldBuilderV3<com.android.aapt.TypeId, com.android.aapt.TypeId.Builder, com.android.aapt.TypeIdOrBuilder> typeIdBuilder_;
            private Object name_;
            private List<com.android.aapt.Entry> entry_;
            private RepeatedFieldBuilderV3<com.android.aapt.Entry, com.android.aapt.Entry.Builder, com.android.aapt.EntryOrBuilder> entryBuilder_;

            public static Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_Type_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_Type_fieldAccessorTable.ensureFieldAccessorsInitialized(PBType.class, PBType.Builder.class);
            }

            private Builder() {
                this.name_ = "";
                this.entry_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.name_ = "";
                this.entry_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (PBType.alwaysUseFieldBuilders) {
                    this.getEntryFieldBuilder();
                }

            }

            public PBType.Builder clear() {
                super.clear();
                if (this.typeIdBuilder_ == null) {
                    this.typeId_ = null;
                } else {
                    this.typeId_ = null;
                    this.typeIdBuilder_ = null;
                }

                this.name_ = "";
                if (this.entryBuilder_ == null) {
                    this.entry_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    this.entryBuilder_.clear();
                }

                return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Resources.internal_static_aapt_pb_Type_descriptor;
            }

            public PBType getDefaultInstanceForType() {
                return PBType.getDefaultInstance();
            }

            public PBType build() {
                PBType result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public PBType buildPartial() {
                PBType result = new PBType(this);
                int from_bitField0_ = this.bitField0_;
                if (this.typeIdBuilder_ == null) {
                    result.typeId_ = this.typeId_;
                } else {
                    result.typeId_ = (com.android.aapt.TypeId)this.typeIdBuilder_.build();
                }

                result.name_ = this.name_;
                if (this.entryBuilder_ == null) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.entry_ = Collections.unmodifiableList(this.entry_);
                        this.bitField0_ &= -2;
                    }

                    result.entry_ = this.entry_;
                } else {
                    result.entry_ = this.entryBuilder_.build();
                }

                this.onBuilt();
                return result;
            }

            public PBType.Builder clone() {
                return (PBType.Builder)super.clone();
            }

            public PBType.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (PBType.Builder)super.setField(field, value);
            }

            public PBType.Builder clearField(Descriptors.FieldDescriptor field) {
                return (PBType.Builder)super.clearField(field);
            }

            public PBType.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (PBType.Builder)super.clearOneof(oneof);
            }

            public PBType.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (PBType.Builder)super.setRepeatedField(field, index, value);
            }

            public PBType.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (PBType.Builder)super.addRepeatedField(field, value);
            }

            public PBType.Builder mergeFrom(Message other) {
                if (other instanceof PBType) {
                    return this.mergeFrom((PBType)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public PBType.Builder mergeFrom(PBType other) {
                if (other == PBType.getDefaultInstance()) {
                    return this;
                } else {
                    if (other.hasTypeId()) {
                        this.mergeTypeId(other.getTypeId());
                    }

                    if (!other.getName().isEmpty()) {
                        this.name_ = other.name_;
                        this.onChanged();
                    }

                    if (this.entryBuilder_ == null) {
                        if (!other.entry_.isEmpty()) {
                            if (this.entry_.isEmpty()) {
                                this.entry_ = other.entry_;
                                this.bitField0_ &= -2;
                            } else {
                                this.ensureEntryIsMutable();
                                this.entry_.addAll(other.entry_);
                            }

                            this.onChanged();
                        }
                    } else if (!other.entry_.isEmpty()) {
                        if (this.entryBuilder_.isEmpty()) {
                            this.entryBuilder_.dispose();
                            this.entryBuilder_ = null;
                            this.entry_ = other.entry_;
                            this.bitField0_ &= -2;
                            this.entryBuilder_ = PBType.alwaysUseFieldBuilders ? this.getEntryFieldBuilder() : null;
                        } else {
                            this.entryBuilder_.addAllMessages(other.entry_);
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

            public PBType.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                PBType parsedMessage = null;

                try {
                    parsedMessage = (PBType) PBType.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (PBType)var8.getUnfinishedMessage();
                    throw var8.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }

                }

                return this;
            }

            public boolean hasTypeId() {
                return this.typeIdBuilder_ != null || this.typeId_ != null;
            }

            public com.android.aapt.TypeId getTypeId() {
                if (this.typeIdBuilder_ == null) {
                    return this.typeId_ == null ? com.android.aapt.TypeId.getDefaultInstance() : this.typeId_;
                } else {
                    return (com.android.aapt.TypeId)this.typeIdBuilder_.getMessage();
                }
            }

            public PBType.Builder setTypeId(com.android.aapt.TypeId value) {
                if (this.typeIdBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.typeId_ = value;
                    this.onChanged();
                } else {
                    this.typeIdBuilder_.setMessage(value);
                }

                return this;
            }

            public PBType.Builder setTypeId(com.android.aapt.TypeId.Builder builderForValue) {
                if (this.typeIdBuilder_ == null) {
                    this.typeId_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.typeIdBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            public PBType.Builder mergeTypeId(com.android.aapt.TypeId value) {
                if (this.typeIdBuilder_ == null) {
                    if (this.typeId_ != null) {
                        this.typeId_ = com.android.aapt.TypeId.newBuilder(this.typeId_).mergeFrom(value).buildPartial();
                    } else {
                        this.typeId_ = value;
                    }

                    this.onChanged();
                } else {
                    this.typeIdBuilder_.mergeFrom(value);
                }

                return this;
            }

            public PBType.Builder clearTypeId() {
                if (this.typeIdBuilder_ == null) {
                    this.typeId_ = null;
                    this.onChanged();
                } else {
                    this.typeId_ = null;
                    this.typeIdBuilder_ = null;
                }

                return this;
            }

            public com.android.aapt.TypeId.Builder getTypeIdBuilder() {
                this.onChanged();
                return (com.android.aapt.TypeId.Builder)this.getTypeIdFieldBuilder().getBuilder();
            }

            public com.android.aapt.TypeIdOrBuilder getTypeIdOrBuilder() {
                if (this.typeIdBuilder_ != null) {
                    return (com.android.aapt.TypeIdOrBuilder)this.typeIdBuilder_.getMessageOrBuilder();
                } else {
                    return this.typeId_ == null ? com.android.aapt.TypeId.getDefaultInstance() : this.typeId_;
                }
            }

            private SingleFieldBuilderV3<com.android.aapt.TypeId, com.android.aapt.TypeId.Builder, com.android.aapt.TypeIdOrBuilder> getTypeIdFieldBuilder() {
                if (this.typeIdBuilder_ == null) {
                    this.typeIdBuilder_ = new SingleFieldBuilderV3(this.getTypeId(), this.getParentForChildren(), this.isClean());
                    this.typeId_ = null;
                }

                return this.typeIdBuilder_;
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

            public PBType.Builder setName(java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.name_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public PBType.Builder clearName() {
                this.name_ = PBType.getDefaultInstance().getName();
                this.onChanged();
                return this;
            }

            public PBType.Builder setNameBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    PBType.checkByteStringIsUtf8(value);
                    this.name_ = value;
                    this.onChanged();
                    return this;
                }
            }

            private void ensureEntryIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.entry_ = new ArrayList(this.entry_);
                    this.bitField0_ |= 1;
                }

            }

            public List<com.android.aapt.Entry> getEntryList() {
                return this.entryBuilder_ == null ? Collections.unmodifiableList(this.entry_) : this.entryBuilder_.getMessageList();
            }

            public int getEntryCount() {
                return this.entryBuilder_ == null ? this.entry_.size() : this.entryBuilder_.getCount();
            }

            public com.android.aapt.Entry getEntry(int index) {
                return this.entryBuilder_ == null ? (com.android.aapt.Entry)this.entry_.get(index) : (com.android.aapt.Entry)this.entryBuilder_.getMessage(index);
            }

            public PBType.Builder setEntry(int index, com.android.aapt.Entry value) {
                if (this.entryBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureEntryIsMutable();
                    this.entry_.set(index, value);
                    this.onChanged();
                } else {
                    this.entryBuilder_.setMessage(index, value);
                }

                return this;
            }

            public PBType.Builder setEntry(int index, com.android.aapt.Entry.Builder builderForValue) {
                if (this.entryBuilder_ == null) {
                    this.ensureEntryIsMutable();
                    this.entry_.set(index, builderForValue.build());
                    this.onChanged();
                } else {
                    this.entryBuilder_.setMessage(index, builderForValue.build());
                }

                return this;
            }

            public PBType.Builder addEntry(com.android.aapt.Entry value) {
                if (this.entryBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureEntryIsMutable();
                    this.entry_.add(value);
                    this.onChanged();
                } else {
                    this.entryBuilder_.addMessage(value);
                }

                return this;
            }

            public PBType.Builder addEntry(int index, com.android.aapt.Entry value) {
                if (this.entryBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureEntryIsMutable();
                    this.entry_.add(index, value);
                    this.onChanged();
                } else {
                    this.entryBuilder_.addMessage(index, value);
                }

                return this;
            }

            public PBType.Builder addEntry(com.android.aapt.Entry.Builder builderForValue) {
                if (this.entryBuilder_ == null) {
                    this.ensureEntryIsMutable();
                    this.entry_.add(builderForValue.build());
                    this.onChanged();
                } else {
                    this.entryBuilder_.addMessage(builderForValue.build());
                }

                return this;
            }

            public PBType.Builder addEntry(int index, com.android.aapt.Entry.Builder builderForValue) {
                if (this.entryBuilder_ == null) {
                    this.ensureEntryIsMutable();
                    this.entry_.add(index, builderForValue.build());
                    this.onChanged();
                } else {
                    this.entryBuilder_.addMessage(index, builderForValue.build());
                }

                return this;
            }

            public PBType.Builder addAllEntry(Iterable<? extends com.android.aapt.Entry> values) {
                if (this.entryBuilder_ == null) {
                    this.ensureEntryIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.entry_);
                    this.onChanged();
                } else {
                    this.entryBuilder_.addAllMessages(values);
                }

                return this;
            }

            public PBType.Builder clearEntry() {
                if (this.entryBuilder_ == null) {
                    this.entry_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    this.onChanged();
                } else {
                    this.entryBuilder_.clear();
                }

                return this;
            }

            public PBType.Builder removeEntry(int index) {
                if (this.entryBuilder_ == null) {
                    this.ensureEntryIsMutable();
                    this.entry_.remove(index);
                    this.onChanged();
                } else {
                    this.entryBuilder_.remove(index);
                }

                return this;
            }

            public com.android.aapt.Entry.Builder getEntryBuilder(int index) {
                return (com.android.aapt.Entry.Builder)this.getEntryFieldBuilder().getBuilder(index);
            }

            public com.android.aapt.EntryOrBuilder getEntryOrBuilder(int index) {
                return this.entryBuilder_ == null ? (com.android.aapt.EntryOrBuilder)this.entry_.get(index) : (com.android.aapt.EntryOrBuilder)this.entryBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends com.android.aapt.EntryOrBuilder> getEntryOrBuilderList() {
                return this.entryBuilder_ != null ? this.entryBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.entry_);
            }

            public com.android.aapt.Entry.Builder addEntryBuilder() {
                return (com.android.aapt.Entry.Builder)this.getEntryFieldBuilder().addBuilder(com.android.aapt.Entry.getDefaultInstance());
            }

            public com.android.aapt.Entry.Builder addEntryBuilder(int index) {
                return (com.android.aapt.Entry.Builder)this.getEntryFieldBuilder().addBuilder(index, com.android.aapt.Entry.getDefaultInstance());
            }

            public List<com.android.aapt.Entry.Builder> getEntryBuilderList() {
                return this.getEntryFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<com.android.aapt.Entry, com.android.aapt.Entry.Builder, com.android.aapt.EntryOrBuilder> getEntryFieldBuilder() {
                if (this.entryBuilder_ == null) {
                    this.entryBuilder_ = new RepeatedFieldBuilderV3(this.entry_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
                    this.entry_ = null;
                }

                return this.entryBuilder_;
            }

            public final PBType.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (PBType.Builder)super.setUnknownFields(unknownFields);
            }

            public final PBType.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (PBType.Builder)super.mergeUnknownFields(unknownFields);
            }
        }
    }