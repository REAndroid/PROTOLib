package com.android.aapt;

import com.google.protobuf.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Styleable extends GeneratedMessageV3 implements com.android.aapt.StyleableOrBuilder {
        private static final long serialVersionUID = 0L;
        public static final int ENTRY_FIELD_NUMBER = 1;
        private List<com.android.aapt.Styleable.Entry> entry_;
        private byte memoizedIsInitialized;
        private static final com.android.aapt.Styleable DEFAULT_INSTANCE = new com.android.aapt.Styleable();
        private static final Parser<com.android.aapt.Styleable> PARSER = new AbstractParser<com.android.aapt.Styleable>() {
            public com.android.aapt.Styleable parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new com.android.aapt.Styleable(input, extensionRegistry);
            }
        };

        private Styleable(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private Styleable() {
            this.memoizedIsInitialized = -1;
            this.entry_ = Collections.emptyList();
        }

        @Override
        public Object newInstance(UnusedPrivateParameter unused) {
            return new com.android.aapt.Styleable();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Styleable(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                    this.entry_ = new ArrayList();
                                    mutable_bitField0_ |= true;
                                }

                                this.entry_.add((com.android.aapt.Styleable.Entry)input.readMessage(com.android.aapt.Styleable.Entry.parser(), extensionRegistry));
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
                        this.entry_ = Collections.unmodifiableList(this.entry_);
                    }

                    this.unknownFields = unknownFields.build();
                    this.makeExtensionsImmutable();
                }

            }
        }

        public static Descriptors.Descriptor getDescriptor() {
            return Resources.internal_static_aapt_pb_Styleable_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_Styleable_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.Styleable.class, com.android.aapt.Styleable.Builder.class);
        }

        public List<com.android.aapt.Styleable.Entry> getEntryList() {
            return this.entry_;
        }

        public List<? extends com.android.aapt.Styleable.EntryOrBuilder> getEntryOrBuilderList() {
            return this.entry_;
        }

        public int getEntryCount() {
            return this.entry_.size();
        }

        public com.android.aapt.Styleable.Entry getEntry(int index) {
            return (com.android.aapt.Styleable.Entry)this.entry_.get(index);
        }

        public com.android.aapt.Styleable.EntryOrBuilder getEntryOrBuilder(int index) {
            return (com.android.aapt.Styleable.EntryOrBuilder)this.entry_.get(index);
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
            for(int i = 0; i < this.entry_.size(); ++i) {
                output.writeMessage(1, (MessageLite)this.entry_.get(i));
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

                for(int i = 0; i < this.entry_.size(); ++i) {
                    size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.entry_.get(i));
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
            } else if (!(obj instanceof com.android.aapt.Styleable)) {
                return super.equals(obj);
            } else {
                com.android.aapt.Styleable other = (com.android.aapt.Styleable)obj;
                if (!this.getEntryList().equals(other.getEntryList())) {
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
                if (this.getEntryCount() > 0) {
                    hash = 37 * hash + 1;
                    hash = 53 * hash + this.getEntryList().hashCode();
                }

                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static com.android.aapt.Styleable parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Styleable)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Styleable parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Styleable)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Styleable parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Styleable)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Styleable parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Styleable)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Styleable parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Styleable)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Styleable parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Styleable)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Styleable parseFrom(InputStream input) throws IOException {
            return (com.android.aapt.Styleable)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.Styleable parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Styleable)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.Styleable parseDelimitedFrom(InputStream input) throws IOException {
            return (com.android.aapt.Styleable)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static com.android.aapt.Styleable parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Styleable)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.Styleable parseFrom(CodedInputStream input) throws IOException {
            return (com.android.aapt.Styleable)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.Styleable parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Styleable)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public com.android.aapt.Styleable.Builder newBuilderForType() {
            return newBuilder();
        }

        public static com.android.aapt.Styleable.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static com.android.aapt.Styleable.Builder newBuilder(com.android.aapt.Styleable prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public com.android.aapt.Styleable.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new com.android.aapt.Styleable.Builder() : (new com.android.aapt.Styleable.Builder()).mergeFrom(this);
        }

        public com.android.aapt.Styleable.Builder newBuilderForType(BuilderParent parent) {
            com.android.aapt.Styleable.Builder builder = new com.android.aapt.Styleable.Builder(parent);
            return builder;
        }

        public static com.android.aapt.Styleable getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<com.android.aapt.Styleable> parser() {
            return PARSER;
        }

        public Parser<com.android.aapt.Styleable> getParserForType() {
            return PARSER;
        }

        public com.android.aapt.Styleable getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.Styleable.Builder> implements com.android.aapt.StyleableOrBuilder {
            private int bitField0_;
            private List<com.android.aapt.Styleable.Entry> entry_;
            private RepeatedFieldBuilderV3<com.android.aapt.Styleable.Entry, com.android.aapt.Styleable.Entry.Builder, com.android.aapt.Styleable.EntryOrBuilder> entryBuilder_;

            public static Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_Styleable_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_Styleable_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.Styleable.class, com.android.aapt.Styleable.Builder.class);
            }

            private Builder() {
                this.entry_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.entry_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.android.aapt.Styleable.alwaysUseFieldBuilders) {
                    this.getEntryFieldBuilder();
                }

            }

            public com.android.aapt.Styleable.Builder clear() {
                super.clear();
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
                return Resources.internal_static_aapt_pb_Styleable_descriptor;
            }

            public com.android.aapt.Styleable getDefaultInstanceForType() {
                return com.android.aapt.Styleable.getDefaultInstance();
            }

            public com.android.aapt.Styleable build() {
                com.android.aapt.Styleable result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public com.android.aapt.Styleable buildPartial() {
                com.android.aapt.Styleable result = new com.android.aapt.Styleable(this);
                int from_bitField0_ = this.bitField0_;
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

            public com.android.aapt.Styleable.Builder clone() {
                return (com.android.aapt.Styleable.Builder)super.clone();
            }

            public com.android.aapt.Styleable.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.Styleable.Builder)super.setField(field, value);
            }

            public com.android.aapt.Styleable.Builder clearField(Descriptors.FieldDescriptor field) {
                return (com.android.aapt.Styleable.Builder)super.clearField(field);
            }

            public com.android.aapt.Styleable.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (com.android.aapt.Styleable.Builder)super.clearOneof(oneof);
            }

            public com.android.aapt.Styleable.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (com.android.aapt.Styleable.Builder)super.setRepeatedField(field, index, value);
            }

            public com.android.aapt.Styleable.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.Styleable.Builder)super.addRepeatedField(field, value);
            }

            public com.android.aapt.Styleable.Builder mergeFrom(Message other) {
                if (other instanceof com.android.aapt.Styleable) {
                    return this.mergeFrom((com.android.aapt.Styleable)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public com.android.aapt.Styleable.Builder mergeFrom(com.android.aapt.Styleable other) {
                if (other == com.android.aapt.Styleable.getDefaultInstance()) {
                    return this;
                } else {
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
                            this.entryBuilder_ = com.android.aapt.Styleable.alwaysUseFieldBuilders ? this.getEntryFieldBuilder() : null;
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

            public com.android.aapt.Styleable.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                com.android.aapt.Styleable parsedMessage = null;

                try {
                    parsedMessage = (com.android.aapt.Styleable)com.android.aapt.Styleable.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (com.android.aapt.Styleable)var8.getUnfinishedMessage();
                    throw var8.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }

                }

                return this;
            }

            private void ensureEntryIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.entry_ = new ArrayList(this.entry_);
                    this.bitField0_ |= 1;
                }

            }

            public List<com.android.aapt.Styleable.Entry> getEntryList() {
                return this.entryBuilder_ == null ? Collections.unmodifiableList(this.entry_) : this.entryBuilder_.getMessageList();
            }

            public int getEntryCount() {
                return this.entryBuilder_ == null ? this.entry_.size() : this.entryBuilder_.getCount();
            }

            public com.android.aapt.Styleable.Entry getEntry(int index) {
                return this.entryBuilder_ == null ? (com.android.aapt.Styleable.Entry)this.entry_.get(index) : (com.android.aapt.Styleable.Entry)this.entryBuilder_.getMessage(index);
            }

            public com.android.aapt.Styleable.Builder setEntry(int index, com.android.aapt.Styleable.Entry value) {
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

            public com.android.aapt.Styleable.Builder setEntry(int index, com.android.aapt.Styleable.Entry.Builder builderForValue) {
                if (this.entryBuilder_ == null) {
                    this.ensureEntryIsMutable();
                    this.entry_.set(index, builderForValue.build());
                    this.onChanged();
                } else {
                    this.entryBuilder_.setMessage(index, builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.Styleable.Builder addEntry(com.android.aapt.Styleable.Entry value) {
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

            public com.android.aapt.Styleable.Builder addEntry(int index, com.android.aapt.Styleable.Entry value) {
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

            public com.android.aapt.Styleable.Builder addEntry(com.android.aapt.Styleable.Entry.Builder builderForValue) {
                if (this.entryBuilder_ == null) {
                    this.ensureEntryIsMutable();
                    this.entry_.add(builderForValue.build());
                    this.onChanged();
                } else {
                    this.entryBuilder_.addMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.Styleable.Builder addEntry(int index, com.android.aapt.Styleable.Entry.Builder builderForValue) {
                if (this.entryBuilder_ == null) {
                    this.ensureEntryIsMutable();
                    this.entry_.add(index, builderForValue.build());
                    this.onChanged();
                } else {
                    this.entryBuilder_.addMessage(index, builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.Styleable.Builder addAllEntry(Iterable<? extends com.android.aapt.Styleable.Entry> values) {
                if (this.entryBuilder_ == null) {
                    this.ensureEntryIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.entry_);
                    this.onChanged();
                } else {
                    this.entryBuilder_.addAllMessages(values);
                }

                return this;
            }

            public com.android.aapt.Styleable.Builder clearEntry() {
                if (this.entryBuilder_ == null) {
                    this.entry_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    this.onChanged();
                } else {
                    this.entryBuilder_.clear();
                }

                return this;
            }

            public com.android.aapt.Styleable.Builder removeEntry(int index) {
                if (this.entryBuilder_ == null) {
                    this.ensureEntryIsMutable();
                    this.entry_.remove(index);
                    this.onChanged();
                } else {
                    this.entryBuilder_.remove(index);
                }

                return this;
            }

            public com.android.aapt.Styleable.Entry.Builder getEntryBuilder(int index) {
                return (com.android.aapt.Styleable.Entry.Builder)this.getEntryFieldBuilder().getBuilder(index);
            }

            public com.android.aapt.Styleable.EntryOrBuilder getEntryOrBuilder(int index) {
                return this.entryBuilder_ == null ? (com.android.aapt.Styleable.EntryOrBuilder)this.entry_.get(index) : (com.android.aapt.Styleable.EntryOrBuilder)this.entryBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends com.android.aapt.Styleable.EntryOrBuilder> getEntryOrBuilderList() {
                return this.entryBuilder_ != null ? this.entryBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.entry_);
            }

            public com.android.aapt.Styleable.Entry.Builder addEntryBuilder() {
                return (com.android.aapt.Styleable.Entry.Builder)this.getEntryFieldBuilder().addBuilder(com.android.aapt.Styleable.Entry.getDefaultInstance());
            }

            public com.android.aapt.Styleable.Entry.Builder addEntryBuilder(int index) {
                return (com.android.aapt.Styleable.Entry.Builder)this.getEntryFieldBuilder().addBuilder(index, com.android.aapt.Styleable.Entry.getDefaultInstance());
            }

            public List<com.android.aapt.Styleable.Entry.Builder> getEntryBuilderList() {
                return this.getEntryFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<com.android.aapt.Styleable.Entry, com.android.aapt.Styleable.Entry.Builder, com.android.aapt.Styleable.EntryOrBuilder> getEntryFieldBuilder() {
                if (this.entryBuilder_ == null) {
                    this.entryBuilder_ = new RepeatedFieldBuilderV3(this.entry_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
                    this.entry_ = null;
                }

                return this.entryBuilder_;
            }

            public final com.android.aapt.Styleable.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.Styleable.Builder)super.setUnknownFields(unknownFields);
            }

            public final com.android.aapt.Styleable.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.Styleable.Builder)super.mergeUnknownFields(unknownFields);
            }
        }

        public static final class Entry extends GeneratedMessageV3 implements com.android.aapt.Styleable.EntryOrBuilder {
            private static final long serialVersionUID = 0L;
            public static final int SOURCE_FIELD_NUMBER = 1;
            private com.android.aapt.Source source_;
            public static final int COMMENT_FIELD_NUMBER = 2;
            private volatile Object comment_;
            public static final int ATTR_FIELD_NUMBER = 3;
            private com.android.aapt.Reference attr_;
            private byte memoizedIsInitialized;
            private static final com.android.aapt.Styleable.Entry DEFAULT_INSTANCE = new com.android.aapt.Styleable.Entry();
            private static final Parser<com.android.aapt.Styleable.Entry> PARSER = new AbstractParser<com.android.aapt.Styleable.Entry>() {
                public com.android.aapt.Styleable.Entry parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new com.android.aapt.Styleable.Entry(input, extensionRegistry);
                }
            };

            private Entry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = -1;
            }

            private Entry() {
                this.memoizedIsInitialized = -1;
                this.comment_ = "";
            }

            @Override
            public Object newInstance(UnusedPrivateParameter unused) {
                return new com.android.aapt.Styleable.Entry();
            }

            @Override
            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            private Entry(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                    com.android.aapt.Reference.Builder subBuilder2 = null;
                                    if (this.attr_ != null) {
                                        subBuilder2 = this.attr_.toBuilder();
                                    }

                                    this.attr_ = (com.android.aapt.Reference)input.readMessage(com.android.aapt.Reference.parser(), extensionRegistry);
                                    if (subBuilder2 != null) {
                                        subBuilder2.mergeFrom(this.attr_);
                                        this.attr_ = subBuilder2.buildPartial();
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
                return Resources.internal_static_aapt_pb_Styleable_Entry_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_Styleable_Entry_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.Styleable.Entry.class, com.android.aapt.Styleable.Entry.Builder.class);
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

            public boolean hasAttr() {
                return this.attr_ != null;
            }

            public com.android.aapt.Reference getAttr() {
                return this.attr_ == null ? com.android.aapt.Reference.getDefaultInstance() : this.attr_;
            }

            public com.android.aapt.ReferenceOrBuilder getAttrOrBuilder() {
                return this.getAttr();
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

                if (this.attr_ != null) {
                    output.writeMessage(3, this.getAttr());
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

                    if (this.attr_ != null) {
                        size += CodedOutputStream.computeMessageSize(3, this.getAttr());
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
                } else if (!(obj instanceof com.android.aapt.Styleable.Entry)) {
                    return super.equals(obj);
                } else {
                    com.android.aapt.Styleable.Entry other = (com.android.aapt.Styleable.Entry)obj;
                    if (this.hasSource() != other.hasSource()) {
                        return false;
                    } else if (this.hasSource() && !this.getSource().equals(other.getSource())) {
                        return false;
                    } else if (!this.getComment().equals(other.getComment())) {
                        return false;
                    } else if (this.hasAttr() != other.hasAttr()) {
                        return false;
                    } else if (this.hasAttr() && !this.getAttr().equals(other.getAttr())) {
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
                    if (this.hasAttr()) {
                        hash = 37 * hash + 3;
                        hash = 53 * hash + this.getAttr().hashCode();
                    }

                    hash = 29 * hash + this.unknownFields.hashCode();
                    this.memoizedHashCode = hash;
                    return hash;
                }
            }

            public static com.android.aapt.Styleable.Entry parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (com.android.aapt.Styleable.Entry)PARSER.parseFrom(data);
            }

            public static com.android.aapt.Styleable.Entry parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (com.android.aapt.Styleable.Entry)PARSER.parseFrom(data, extensionRegistry);
            }

            public static com.android.aapt.Styleable.Entry parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (com.android.aapt.Styleable.Entry)PARSER.parseFrom(data);
            }

            public static com.android.aapt.Styleable.Entry parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (com.android.aapt.Styleable.Entry)PARSER.parseFrom(data, extensionRegistry);
            }

            public static com.android.aapt.Styleable.Entry parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (com.android.aapt.Styleable.Entry)PARSER.parseFrom(data);
            }

            public static com.android.aapt.Styleable.Entry parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (com.android.aapt.Styleable.Entry)PARSER.parseFrom(data, extensionRegistry);
            }

            public static com.android.aapt.Styleable.Entry parseFrom(InputStream input) throws IOException {
                return (com.android.aapt.Styleable.Entry)GeneratedMessageV3.parseWithIOException(PARSER, input);
            }

            public static com.android.aapt.Styleable.Entry parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (com.android.aapt.Styleable.Entry)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
            }

            public static com.android.aapt.Styleable.Entry parseDelimitedFrom(InputStream input) throws IOException {
                return (com.android.aapt.Styleable.Entry)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
            }

            public static com.android.aapt.Styleable.Entry parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (com.android.aapt.Styleable.Entry)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }

            public static com.android.aapt.Styleable.Entry parseFrom(CodedInputStream input) throws IOException {
                return (com.android.aapt.Styleable.Entry)GeneratedMessageV3.parseWithIOException(PARSER, input);
            }

            public static com.android.aapt.Styleable.Entry parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (com.android.aapt.Styleable.Entry)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
            }

            public com.android.aapt.Styleable.Entry.Builder newBuilderForType() {
                return newBuilder();
            }

            public static com.android.aapt.Styleable.Entry.Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static com.android.aapt.Styleable.Entry.Builder newBuilder(com.android.aapt.Styleable.Entry prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }

            public com.android.aapt.Styleable.Entry.Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new com.android.aapt.Styleable.Entry.Builder() : (new com.android.aapt.Styleable.Entry.Builder()).mergeFrom(this);
            }

            public com.android.aapt.Styleable.Entry.Builder newBuilderForType(BuilderParent parent) {
                com.android.aapt.Styleable.Entry.Builder builder = new com.android.aapt.Styleable.Entry.Builder(parent);
                return builder;
            }

            public static com.android.aapt.Styleable.Entry getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<com.android.aapt.Styleable.Entry> parser() {
                return PARSER;
            }

            public Parser<com.android.aapt.Styleable.Entry> getParserForType() {
                return PARSER;
            }

            public com.android.aapt.Styleable.Entry getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.Styleable.Entry.Builder> implements com.android.aapt.Styleable.EntryOrBuilder {
                private com.android.aapt.Source source_;
                private SingleFieldBuilderV3<com.android.aapt.Source, com.android.aapt.Source.Builder, com.android.aapt.SourceOrBuilder> sourceBuilder_;
                private Object comment_;
                private com.android.aapt.Reference attr_;
                private SingleFieldBuilderV3<com.android.aapt.Reference, com.android.aapt.Reference.Builder, com.android.aapt.ReferenceOrBuilder> attrBuilder_;

                public static Descriptors.Descriptor getDescriptor() {
                    return Resources.internal_static_aapt_pb_Styleable_Entry_descriptor;
                }

                public FieldAccessorTable internalGetFieldAccessorTable() {
                    return Resources.internal_static_aapt_pb_Styleable_Entry_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.Styleable.Entry.class, com.android.aapt.Styleable.Entry.Builder.class);
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
                    if (com.android.aapt.Styleable.Entry.alwaysUseFieldBuilders) {
                    }

                }

                public com.android.aapt.Styleable.Entry.Builder clear() {
                    super.clear();
                    if (this.sourceBuilder_ == null) {
                        this.source_ = null;
                    } else {
                        this.source_ = null;
                        this.sourceBuilder_ = null;
                    }

                    this.comment_ = "";
                    if (this.attrBuilder_ == null) {
                        this.attr_ = null;
                    } else {
                        this.attr_ = null;
                        this.attrBuilder_ = null;
                    }

                    return this;
                }

                @Override
                public Descriptors.Descriptor getDescriptorForType() {
                    return Resources.internal_static_aapt_pb_Styleable_Entry_descriptor;
                }

                public com.android.aapt.Styleable.Entry getDefaultInstanceForType() {
                    return com.android.aapt.Styleable.Entry.getDefaultInstance();
                }

                public com.android.aapt.Styleable.Entry build() {
                    com.android.aapt.Styleable.Entry result = this.buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    } else {
                        return result;
                    }
                }

                public com.android.aapt.Styleable.Entry buildPartial() {
                    com.android.aapt.Styleable.Entry result = new com.android.aapt.Styleable.Entry(this);
                    if (this.sourceBuilder_ == null) {
                        result.source_ = this.source_;
                    } else {
                        result.source_ = (com.android.aapt.Source)this.sourceBuilder_.build();
                    }

                    result.comment_ = this.comment_;
                    if (this.attrBuilder_ == null) {
                        result.attr_ = this.attr_;
                    } else {
                        result.attr_ = (com.android.aapt.Reference)this.attrBuilder_.build();
                    }

                    this.onBuilt();
                    return result;
                }

                public com.android.aapt.Styleable.Entry.Builder clone() {
                    return (com.android.aapt.Styleable.Entry.Builder)super.clone();
                }

                public com.android.aapt.Styleable.Entry.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                    return (com.android.aapt.Styleable.Entry.Builder)super.setField(field, value);
                }

                public com.android.aapt.Styleable.Entry.Builder clearField(Descriptors.FieldDescriptor field) {
                    return (com.android.aapt.Styleable.Entry.Builder)super.clearField(field);
                }

                public com.android.aapt.Styleable.Entry.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                    return (com.android.aapt.Styleable.Entry.Builder)super.clearOneof(oneof);
                }

                public com.android.aapt.Styleable.Entry.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                    return (com.android.aapt.Styleable.Entry.Builder)super.setRepeatedField(field, index, value);
                }

                public com.android.aapt.Styleable.Entry.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                    return (com.android.aapt.Styleable.Entry.Builder)super.addRepeatedField(field, value);
                }

                public com.android.aapt.Styleable.Entry.Builder mergeFrom(Message other) {
                    if (other instanceof com.android.aapt.Styleable.Entry) {
                        return this.mergeFrom((com.android.aapt.Styleable.Entry)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public com.android.aapt.Styleable.Entry.Builder mergeFrom(com.android.aapt.Styleable.Entry other) {
                    if (other == com.android.aapt.Styleable.Entry.getDefaultInstance()) {
                        return this;
                    } else {
                        if (other.hasSource()) {
                            this.mergeSource(other.getSource());
                        }

                        if (!other.getComment().isEmpty()) {
                            this.comment_ = other.comment_;
                            this.onChanged();
                        }

                        if (other.hasAttr()) {
                            this.mergeAttr(other.getAttr());
                        }

                        this.mergeUnknownFields(other.unknownFields);
                        this.onChanged();
                        return this;
                    }
                }

                public final boolean isInitialized() {
                    return true;
                }

                public com.android.aapt.Styleable.Entry.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                    com.android.aapt.Styleable.Entry parsedMessage = null;

                    try {
                        parsedMessage = (com.android.aapt.Styleable.Entry)com.android.aapt.Styleable.Entry.PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (InvalidProtocolBufferException var8) {
                        parsedMessage = (com.android.aapt.Styleable.Entry)var8.getUnfinishedMessage();
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

                public com.android.aapt.Styleable.Entry.Builder setSource(com.android.aapt.Source value) {
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

                public com.android.aapt.Styleable.Entry.Builder setSource(com.android.aapt.Source.Builder builderForValue) {
                    if (this.sourceBuilder_ == null) {
                        this.source_ = builderForValue.build();
                        this.onChanged();
                    } else {
                        this.sourceBuilder_.setMessage(builderForValue.build());
                    }

                    return this;
                }

                public com.android.aapt.Styleable.Entry.Builder mergeSource(com.android.aapt.Source value) {
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

                public com.android.aapt.Styleable.Entry.Builder clearSource() {
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

                public com.android.aapt.Styleable.Entry.Builder setComment(java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    } else {
                        this.comment_ = value;
                        this.onChanged();
                        return this;
                    }
                }

                public com.android.aapt.Styleable.Entry.Builder clearComment() {
                    this.comment_ = com.android.aapt.Styleable.Entry.getDefaultInstance().getComment();
                    this.onChanged();
                    return this;
                }

                public com.android.aapt.Styleable.Entry.Builder setCommentBytes(ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    } else {
                        com.android.aapt.Styleable.Entry.checkByteStringIsUtf8(value);
                        this.comment_ = value;
                        this.onChanged();
                        return this;
                    }
                }

                public boolean hasAttr() {
                    return this.attrBuilder_ != null || this.attr_ != null;
                }

                public com.android.aapt.Reference getAttr() {
                    if (this.attrBuilder_ == null) {
                        return this.attr_ == null ? com.android.aapt.Reference.getDefaultInstance() : this.attr_;
                    } else {
                        return (com.android.aapt.Reference)this.attrBuilder_.getMessage();
                    }
                }

                public com.android.aapt.Styleable.Entry.Builder setAttr(com.android.aapt.Reference value) {
                    if (this.attrBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }

                        this.attr_ = value;
                        this.onChanged();
                    } else {
                        this.attrBuilder_.setMessage(value);
                    }

                    return this;
                }

                public com.android.aapt.Styleable.Entry.Builder setAttr(com.android.aapt.Reference.Builder builderForValue) {
                    if (this.attrBuilder_ == null) {
                        this.attr_ = builderForValue.build();
                        this.onChanged();
                    } else {
                        this.attrBuilder_.setMessage(builderForValue.build());
                    }

                    return this;
                }

                public com.android.aapt.Styleable.Entry.Builder mergeAttr(com.android.aapt.Reference value) {
                    if (this.attrBuilder_ == null) {
                        if (this.attr_ != null) {
                            this.attr_ = com.android.aapt.Reference.newBuilder(this.attr_).mergeFrom(value).buildPartial();
                        } else {
                            this.attr_ = value;
                        }

                        this.onChanged();
                    } else {
                        this.attrBuilder_.mergeFrom(value);
                    }

                    return this;
                }

                public com.android.aapt.Styleable.Entry.Builder clearAttr() {
                    if (this.attrBuilder_ == null) {
                        this.attr_ = null;
                        this.onChanged();
                    } else {
                        this.attr_ = null;
                        this.attrBuilder_ = null;
                    }

                    return this;
                }

                public com.android.aapt.Reference.Builder getAttrBuilder() {
                    this.onChanged();
                    return (com.android.aapt.Reference.Builder)this.getAttrFieldBuilder().getBuilder();
                }

                public com.android.aapt.ReferenceOrBuilder getAttrOrBuilder() {
                    if (this.attrBuilder_ != null) {
                        return (com.android.aapt.ReferenceOrBuilder)this.attrBuilder_.getMessageOrBuilder();
                    } else {
                        return this.attr_ == null ? com.android.aapt.Reference.getDefaultInstance() : this.attr_;
                    }
                }

                private SingleFieldBuilderV3<com.android.aapt.Reference, com.android.aapt.Reference.Builder, com.android.aapt.ReferenceOrBuilder> getAttrFieldBuilder() {
                    if (this.attrBuilder_ == null) {
                        this.attrBuilder_ = new SingleFieldBuilderV3(this.getAttr(), this.getParentForChildren(), this.isClean());
                        this.attr_ = null;
                    }

                    return this.attrBuilder_;
                }

                public final com.android.aapt.Styleable.Entry.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                    return (com.android.aapt.Styleable.Entry.Builder)super.setUnknownFields(unknownFields);
                }

                public final com.android.aapt.Styleable.Entry.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                    return (com.android.aapt.Styleable.Entry.Builder)super.mergeUnknownFields(unknownFields);
                }
            }
        }

        public interface EntryOrBuilder extends MessageOrBuilder {
            boolean hasSource();

            com.android.aapt.Source getSource();

            com.android.aapt.SourceOrBuilder getSourceOrBuilder();

            java.lang.String getComment();

            ByteString getCommentBytes();

            boolean hasAttr();

            com.android.aapt.Reference getAttr();

            com.android.aapt.ReferenceOrBuilder getAttrOrBuilder();
        }
    }