package com.android.aapt;

import com.google.protobuf.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Plural extends GeneratedMessageV3 implements com.android.aapt.PluralOrBuilder {
        private static final long serialVersionUID = 0L;
        public static final int ENTRY_FIELD_NUMBER = 1;
        private List<com.android.aapt.Plural.Entry> entry_;
        private byte memoizedIsInitialized;
        private static final com.android.aapt.Plural DEFAULT_INSTANCE = new com.android.aapt.Plural();
        private static final Parser<com.android.aapt.Plural> PARSER = new AbstractParser<com.android.aapt.Plural>() {
            public com.android.aapt.Plural parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new com.android.aapt.Plural(input, extensionRegistry);
            }
        };

        private Plural(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private Plural() {
            this.memoizedIsInitialized = -1;
            this.entry_ = Collections.emptyList();
        }

        @Override
        public Object newInstance(UnusedPrivateParameter unused) {
            return new com.android.aapt.Plural();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Plural(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                if (!(mutable_bitField0_ )) {
                                    this.entry_ = new ArrayList();
                                    mutable_bitField0_ = true;
                                }

                                this.entry_.add((com.android.aapt.Plural.Entry)input.readMessage(com.android.aapt.Plural.Entry.parser(), extensionRegistry));
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
            return Resources.internal_static_aapt_pb_Plural_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_Plural_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.Plural.class, com.android.aapt.Plural.Builder.class);
        }

        public List<com.android.aapt.Plural.Entry> getEntryList() {
            return this.entry_;
        }

        public List<? extends com.android.aapt.Plural.EntryOrBuilder> getEntryOrBuilderList() {
            return this.entry_;
        }

        public int getEntryCount() {
            return this.entry_.size();
        }

        public com.android.aapt.Plural.Entry getEntry(int index) {
            return (com.android.aapt.Plural.Entry)this.entry_.get(index);
        }

        public com.android.aapt.Plural.EntryOrBuilder getEntryOrBuilder(int index) {
            return (com.android.aapt.Plural.EntryOrBuilder)this.entry_.get(index);
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
            } else if (!(obj instanceof com.android.aapt.Plural)) {
                return super.equals(obj);
            } else {
                com.android.aapt.Plural other = (com.android.aapt.Plural)obj;
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

        public static com.android.aapt.Plural parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Plural)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Plural parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Plural)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Plural parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Plural)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Plural parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Plural)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Plural parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Plural)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Plural parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Plural)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Plural parseFrom(InputStream input) throws IOException {
            return (com.android.aapt.Plural)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.Plural parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Plural)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.Plural parseDelimitedFrom(InputStream input) throws IOException {
            return (com.android.aapt.Plural)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static com.android.aapt.Plural parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Plural)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.Plural parseFrom(CodedInputStream input) throws IOException {
            return (com.android.aapt.Plural)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.Plural parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Plural)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public com.android.aapt.Plural.Builder newBuilderForType() {
            return newBuilder();
        }

        public static com.android.aapt.Plural.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static com.android.aapt.Plural.Builder newBuilder(com.android.aapt.Plural prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public com.android.aapt.Plural.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new com.android.aapt.Plural.Builder() : (new com.android.aapt.Plural.Builder()).mergeFrom(this);
        }

        public com.android.aapt.Plural.Builder newBuilderForType(BuilderParent parent) {
            com.android.aapt.Plural.Builder builder = new com.android.aapt.Plural.Builder(parent);
            return builder;
        }

        public static com.android.aapt.Plural getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<com.android.aapt.Plural> parser() {
            return PARSER;
        }

        public Parser<com.android.aapt.Plural> getParserForType() {
            return PARSER;
        }

        public com.android.aapt.Plural getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.Plural.Builder> implements com.android.aapt.PluralOrBuilder {
            private int bitField0_;
            private List<com.android.aapt.Plural.Entry> entry_;
            private RepeatedFieldBuilderV3<com.android.aapt.Plural.Entry, com.android.aapt.Plural.Entry.Builder, com.android.aapt.Plural.EntryOrBuilder> entryBuilder_;

            public static Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_Plural_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_Plural_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.Plural.class, com.android.aapt.Plural.Builder.class);
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
                if (com.android.aapt.Plural.alwaysUseFieldBuilders) {
                    this.getEntryFieldBuilder();
                }

            }

            public com.android.aapt.Plural.Builder clear() {
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
                return Resources.internal_static_aapt_pb_Plural_descriptor;
            }

            public com.android.aapt.Plural getDefaultInstanceForType() {
                return com.android.aapt.Plural.getDefaultInstance();
            }

            public com.android.aapt.Plural build() {
                com.android.aapt.Plural result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public com.android.aapt.Plural buildPartial() {
                com.android.aapt.Plural result = new com.android.aapt.Plural(this);
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

            public com.android.aapt.Plural.Builder clone() {
                return (com.android.aapt.Plural.Builder)super.clone();
            }

            public com.android.aapt.Plural.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.Plural.Builder)super.setField(field, value);
            }

            public com.android.aapt.Plural.Builder clearField(Descriptors.FieldDescriptor field) {
                return (com.android.aapt.Plural.Builder)super.clearField(field);
            }

            public com.android.aapt.Plural.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (com.android.aapt.Plural.Builder)super.clearOneof(oneof);
            }

            public com.android.aapt.Plural.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (com.android.aapt.Plural.Builder)super.setRepeatedField(field, index, value);
            }

            public com.android.aapt.Plural.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.Plural.Builder)super.addRepeatedField(field, value);
            }

            public com.android.aapt.Plural.Builder mergeFrom(Message other) {
                if (other instanceof com.android.aapt.Plural) {
                    return this.mergeFrom((com.android.aapt.Plural)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public com.android.aapt.Plural.Builder mergeFrom(com.android.aapt.Plural other) {
                if (other == com.android.aapt.Plural.getDefaultInstance()) {
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
                            this.entryBuilder_ = com.android.aapt.Plural.alwaysUseFieldBuilders ? this.getEntryFieldBuilder() : null;
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

            public com.android.aapt.Plural.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                com.android.aapt.Plural parsedMessage = null;

                try {
                    parsedMessage = (com.android.aapt.Plural)com.android.aapt.Plural.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (com.android.aapt.Plural)var8.getUnfinishedMessage();
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

            public List<com.android.aapt.Plural.Entry> getEntryList() {
                return this.entryBuilder_ == null ? Collections.unmodifiableList(this.entry_) : this.entryBuilder_.getMessageList();
            }

            public int getEntryCount() {
                return this.entryBuilder_ == null ? this.entry_.size() : this.entryBuilder_.getCount();
            }

            public com.android.aapt.Plural.Entry getEntry(int index) {
                return this.entryBuilder_ == null ? (com.android.aapt.Plural.Entry)this.entry_.get(index) : (com.android.aapt.Plural.Entry)this.entryBuilder_.getMessage(index);
            }

            public com.android.aapt.Plural.Builder setEntry(int index, com.android.aapt.Plural.Entry value) {
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

            public com.android.aapt.Plural.Builder setEntry(int index, com.android.aapt.Plural.Entry.Builder builderForValue) {
                if (this.entryBuilder_ == null) {
                    this.ensureEntryIsMutable();
                    this.entry_.set(index, builderForValue.build());
                    this.onChanged();
                } else {
                    this.entryBuilder_.setMessage(index, builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.Plural.Builder addEntry(com.android.aapt.Plural.Entry value) {
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

            public com.android.aapt.Plural.Builder addEntry(int index, com.android.aapt.Plural.Entry value) {
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

            public com.android.aapt.Plural.Builder addEntry(com.android.aapt.Plural.Entry.Builder builderForValue) {
                if (this.entryBuilder_ == null) {
                    this.ensureEntryIsMutable();
                    this.entry_.add(builderForValue.build());
                    this.onChanged();
                } else {
                    this.entryBuilder_.addMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.Plural.Builder addEntry(int index, com.android.aapt.Plural.Entry.Builder builderForValue) {
                if (this.entryBuilder_ == null) {
                    this.ensureEntryIsMutable();
                    this.entry_.add(index, builderForValue.build());
                    this.onChanged();
                } else {
                    this.entryBuilder_.addMessage(index, builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.Plural.Builder addAllEntry(Iterable<? extends com.android.aapt.Plural.Entry> values) {
                if (this.entryBuilder_ == null) {
                    this.ensureEntryIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.entry_);
                    this.onChanged();
                } else {
                    this.entryBuilder_.addAllMessages(values);
                }

                return this;
            }

            public com.android.aapt.Plural.Builder clearEntry() {
                if (this.entryBuilder_ == null) {
                    this.entry_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    this.onChanged();
                } else {
                    this.entryBuilder_.clear();
                }

                return this;
            }

            public com.android.aapt.Plural.Builder removeEntry(int index) {
                if (this.entryBuilder_ == null) {
                    this.ensureEntryIsMutable();
                    this.entry_.remove(index);
                    this.onChanged();
                } else {
                    this.entryBuilder_.remove(index);
                }

                return this;
            }

            public com.android.aapt.Plural.Entry.Builder getEntryBuilder(int index) {
                return (com.android.aapt.Plural.Entry.Builder)this.getEntryFieldBuilder().getBuilder(index);
            }

            public com.android.aapt.Plural.EntryOrBuilder getEntryOrBuilder(int index) {
                return this.entryBuilder_ == null ? (com.android.aapt.Plural.EntryOrBuilder)this.entry_.get(index) : (com.android.aapt.Plural.EntryOrBuilder)this.entryBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends com.android.aapt.Plural.EntryOrBuilder> getEntryOrBuilderList() {
                return this.entryBuilder_ != null ? this.entryBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.entry_);
            }

            public com.android.aapt.Plural.Entry.Builder addEntryBuilder() {
                return (com.android.aapt.Plural.Entry.Builder)this.getEntryFieldBuilder().addBuilder(com.android.aapt.Plural.Entry.getDefaultInstance());
            }

            public com.android.aapt.Plural.Entry.Builder addEntryBuilder(int index) {
                return (com.android.aapt.Plural.Entry.Builder)this.getEntryFieldBuilder().addBuilder(index, com.android.aapt.Plural.Entry.getDefaultInstance());
            }

            public List<com.android.aapt.Plural.Entry.Builder> getEntryBuilderList() {
                return this.getEntryFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<com.android.aapt.Plural.Entry, com.android.aapt.Plural.Entry.Builder, com.android.aapt.Plural.EntryOrBuilder> getEntryFieldBuilder() {
                if (this.entryBuilder_ == null) {
                    this.entryBuilder_ = new RepeatedFieldBuilderV3(this.entry_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
                    this.entry_ = null;
                }

                return this.entryBuilder_;
            }

            public final com.android.aapt.Plural.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.Plural.Builder)super.setUnknownFields(unknownFields);
            }

            public final com.android.aapt.Plural.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.Plural.Builder)super.mergeUnknownFields(unknownFields);
            }
        }

        public static final class Entry extends GeneratedMessageV3 implements com.android.aapt.Plural.EntryOrBuilder {
            private static final long serialVersionUID = 0L;
            public static final int SOURCE_FIELD_NUMBER = 1;
            private com.android.aapt.Source source_;
            public static final int COMMENT_FIELD_NUMBER = 2;
            private volatile Object comment_;
            public static final int ARITY_FIELD_NUMBER = 3;
            private int arity_;
            public static final int ITEM_FIELD_NUMBER = 4;
            private com.android.aapt.Item item_;
            private byte memoizedIsInitialized;
            private static final com.android.aapt.Plural.Entry DEFAULT_INSTANCE = new com.android.aapt.Plural.Entry();
            private static final Parser<com.android.aapt.Plural.Entry> PARSER = new AbstractParser<com.android.aapt.Plural.Entry>() {
                public com.android.aapt.Plural.Entry parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new com.android.aapt.Plural.Entry(input, extensionRegistry);
                }
            };

            private Entry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = -1;
            }

            private Entry() {
                this.memoizedIsInitialized = -1;
                this.comment_ = "";
                this.arity_ = 0;
            }

            @Override
            public Object newInstance(UnusedPrivateParameter unused) {
                return new com.android.aapt.Plural.Entry();
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
                                case 24:
                                    int rawValue = input.readEnum();
                                    this.arity_ = rawValue;
                                    break;
                                case 34:
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
                return Resources.internal_static_aapt_pb_Plural_Entry_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_Plural_Entry_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.Plural.Entry.class, com.android.aapt.Plural.Entry.Builder.class);
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

            public int getArityValue() {
                return this.arity_;
            }

            public com.android.aapt.Plural.Arity getArity() {
                com.android.aapt.Plural.Arity result = com.android.aapt.Plural.Arity.valueOf(this.arity_);
                return result == null ? com.android.aapt.Plural.Arity.UNRECOGNIZED : result;
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

                if (this.arity_ != com.android.aapt.Plural.Arity.ZERO.getNumber()) {
                    output.writeEnum(3, this.arity_);
                }

                if (this.item_ != null) {
                    output.writeMessage(4, this.getItem());
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

                    if (this.arity_ != com.android.aapt.Plural.Arity.ZERO.getNumber()) {
                        size += CodedOutputStream.computeEnumSize(3, this.arity_);
                    }

                    if (this.item_ != null) {
                        size += CodedOutputStream.computeMessageSize(4, this.getItem());
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
                } else if (!(obj instanceof com.android.aapt.Plural.Entry)) {
                    return super.equals(obj);
                } else {
                    com.android.aapt.Plural.Entry other = (com.android.aapt.Plural.Entry)obj;
                    if (this.hasSource() != other.hasSource()) {
                        return false;
                    } else if (this.hasSource() && !this.getSource().equals(other.getSource())) {
                        return false;
                    } else if (!this.getComment().equals(other.getComment())) {
                        return false;
                    } else if (this.arity_ != other.arity_) {
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
                    hash = 37 * hash + 3;
                    hash = 53 * hash + this.arity_;
                    if (this.hasItem()) {
                        hash = 37 * hash + 4;
                        hash = 53 * hash + this.getItem().hashCode();
                    }

                    hash = 29 * hash + this.unknownFields.hashCode();
                    this.memoizedHashCode = hash;
                    return hash;
                }
            }

            public static com.android.aapt.Plural.Entry parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (com.android.aapt.Plural.Entry)PARSER.parseFrom(data);
            }

            public static com.android.aapt.Plural.Entry parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (com.android.aapt.Plural.Entry)PARSER.parseFrom(data, extensionRegistry);
            }

            public static com.android.aapt.Plural.Entry parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (com.android.aapt.Plural.Entry)PARSER.parseFrom(data);
            }

            public static com.android.aapt.Plural.Entry parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (com.android.aapt.Plural.Entry)PARSER.parseFrom(data, extensionRegistry);
            }

            public static com.android.aapt.Plural.Entry parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (com.android.aapt.Plural.Entry)PARSER.parseFrom(data);
            }

            public static com.android.aapt.Plural.Entry parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (com.android.aapt.Plural.Entry)PARSER.parseFrom(data, extensionRegistry);
            }

            public static com.android.aapt.Plural.Entry parseFrom(InputStream input) throws IOException {
                return (com.android.aapt.Plural.Entry)GeneratedMessageV3.parseWithIOException(PARSER, input);
            }

            public static com.android.aapt.Plural.Entry parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (com.android.aapt.Plural.Entry)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
            }

            public static com.android.aapt.Plural.Entry parseDelimitedFrom(InputStream input) throws IOException {
                return (com.android.aapt.Plural.Entry)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
            }

            public static com.android.aapt.Plural.Entry parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (com.android.aapt.Plural.Entry)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }

            public static com.android.aapt.Plural.Entry parseFrom(CodedInputStream input) throws IOException {
                return (com.android.aapt.Plural.Entry)GeneratedMessageV3.parseWithIOException(PARSER, input);
            }

            public static com.android.aapt.Plural.Entry parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (com.android.aapt.Plural.Entry)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
            }

            public com.android.aapt.Plural.Entry.Builder newBuilderForType() {
                return newBuilder();
            }

            public static com.android.aapt.Plural.Entry.Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static com.android.aapt.Plural.Entry.Builder newBuilder(com.android.aapt.Plural.Entry prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }

            public com.android.aapt.Plural.Entry.Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new com.android.aapt.Plural.Entry.Builder() : (new com.android.aapt.Plural.Entry.Builder()).mergeFrom(this);
            }

            public com.android.aapt.Plural.Entry.Builder newBuilderForType(BuilderParent parent) {
                com.android.aapt.Plural.Entry.Builder builder = new com.android.aapt.Plural.Entry.Builder(parent);
                return builder;
            }

            public static com.android.aapt.Plural.Entry getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<com.android.aapt.Plural.Entry> parser() {
                return PARSER;
            }

            public Parser<com.android.aapt.Plural.Entry> getParserForType() {
                return PARSER;
            }

            public com.android.aapt.Plural.Entry getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.Plural.Entry.Builder> implements com.android.aapt.Plural.EntryOrBuilder {
                private com.android.aapt.Source source_;
                private SingleFieldBuilderV3<com.android.aapt.Source, com.android.aapt.Source.Builder, com.android.aapt.SourceOrBuilder> sourceBuilder_;
                private Object comment_;
                private int arity_;
                private com.android.aapt.Item item_;
                private SingleFieldBuilderV3<com.android.aapt.Item, com.android.aapt.Item.Builder, com.android.aapt.ItemOrBuilder> itemBuilder_;

                public static Descriptors.Descriptor getDescriptor() {
                    return Resources.internal_static_aapt_pb_Plural_Entry_descriptor;
                }

                public FieldAccessorTable internalGetFieldAccessorTable() {
                    return Resources.internal_static_aapt_pb_Plural_Entry_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.Plural.Entry.class, com.android.aapt.Plural.Entry.Builder.class);
                }

                private Builder() {
                    this.comment_ = "";
                    this.arity_ = 0;
                    this.maybeForceBuilderInitialization();
                }

                private Builder(BuilderParent parent) {
                    super(parent);
                    this.comment_ = "";
                    this.arity_ = 0;
                    this.maybeForceBuilderInitialization();
                }

                private void maybeForceBuilderInitialization() {
                    if (com.android.aapt.Plural.Entry.alwaysUseFieldBuilders) {
                    }

                }

                public com.android.aapt.Plural.Entry.Builder clear() {
                    super.clear();
                    if (this.sourceBuilder_ == null) {
                        this.source_ = null;
                    } else {
                        this.source_ = null;
                        this.sourceBuilder_ = null;
                    }

                    this.comment_ = "";
                    this.arity_ = 0;
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
                    return Resources.internal_static_aapt_pb_Plural_Entry_descriptor;
                }

                public com.android.aapt.Plural.Entry getDefaultInstanceForType() {
                    return com.android.aapt.Plural.Entry.getDefaultInstance();
                }

                public com.android.aapt.Plural.Entry build() {
                    com.android.aapt.Plural.Entry result = this.buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    } else {
                        return result;
                    }
                }

                public com.android.aapt.Plural.Entry buildPartial() {
                    com.android.aapt.Plural.Entry result = new com.android.aapt.Plural.Entry(this);
                    if (this.sourceBuilder_ == null) {
                        result.source_ = this.source_;
                    } else {
                        result.source_ = (com.android.aapt.Source)this.sourceBuilder_.build();
                    }

                    result.comment_ = this.comment_;
                    result.arity_ = this.arity_;
                    if (this.itemBuilder_ == null) {
                        result.item_ = this.item_;
                    } else {
                        result.item_ = (com.android.aapt.Item)this.itemBuilder_.build();
                    }

                    this.onBuilt();
                    return result;
                }

                public com.android.aapt.Plural.Entry.Builder clone() {
                    return (com.android.aapt.Plural.Entry.Builder)super.clone();
                }

                public com.android.aapt.Plural.Entry.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                    return (com.android.aapt.Plural.Entry.Builder)super.setField(field, value);
                }

                public com.android.aapt.Plural.Entry.Builder clearField(Descriptors.FieldDescriptor field) {
                    return (com.android.aapt.Plural.Entry.Builder)super.clearField(field);
                }

                public com.android.aapt.Plural.Entry.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                    return (com.android.aapt.Plural.Entry.Builder)super.clearOneof(oneof);
                }

                public com.android.aapt.Plural.Entry.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                    return (com.android.aapt.Plural.Entry.Builder)super.setRepeatedField(field, index, value);
                }

                public com.android.aapt.Plural.Entry.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                    return (com.android.aapt.Plural.Entry.Builder)super.addRepeatedField(field, value);
                }

                public com.android.aapt.Plural.Entry.Builder mergeFrom(Message other) {
                    if (other instanceof com.android.aapt.Plural.Entry) {
                        return this.mergeFrom((com.android.aapt.Plural.Entry)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public com.android.aapt.Plural.Entry.Builder mergeFrom(com.android.aapt.Plural.Entry other) {
                    if (other == com.android.aapt.Plural.Entry.getDefaultInstance()) {
                        return this;
                    } else {
                        if (other.hasSource()) {
                            this.mergeSource(other.getSource());
                        }

                        if (!other.getComment().isEmpty()) {
                            this.comment_ = other.comment_;
                            this.onChanged();
                        }

                        if (other.arity_ != 0) {
                            this.setArityValue(other.getArityValue());
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

                public com.android.aapt.Plural.Entry.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                    com.android.aapt.Plural.Entry parsedMessage = null;

                    try {
                        parsedMessage = (com.android.aapt.Plural.Entry)com.android.aapt.Plural.Entry.PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (InvalidProtocolBufferException var8) {
                        parsedMessage = (com.android.aapt.Plural.Entry)var8.getUnfinishedMessage();
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

                public com.android.aapt.Plural.Entry.Builder setSource(com.android.aapt.Source value) {
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

                public com.android.aapt.Plural.Entry.Builder setSource(com.android.aapt.Source.Builder builderForValue) {
                    if (this.sourceBuilder_ == null) {
                        this.source_ = builderForValue.build();
                        this.onChanged();
                    } else {
                        this.sourceBuilder_.setMessage(builderForValue.build());
                    }

                    return this;
                }

                public com.android.aapt.Plural.Entry.Builder mergeSource(com.android.aapt.Source value) {
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

                public com.android.aapt.Plural.Entry.Builder clearSource() {
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

                public com.android.aapt.Plural.Entry.Builder setComment(java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    } else {
                        this.comment_ = value;
                        this.onChanged();
                        return this;
                    }
                }

                public com.android.aapt.Plural.Entry.Builder clearComment() {
                    this.comment_ = com.android.aapt.Plural.Entry.getDefaultInstance().getComment();
                    this.onChanged();
                    return this;
                }

                public com.android.aapt.Plural.Entry.Builder setCommentBytes(ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    } else {
                        com.android.aapt.Plural.Entry.checkByteStringIsUtf8(value);
                        this.comment_ = value;
                        this.onChanged();
                        return this;
                    }
                }

                public int getArityValue() {
                    return this.arity_;
                }

                public com.android.aapt.Plural.Entry.Builder setArityValue(int value) {
                    this.arity_ = value;
                    this.onChanged();
                    return this;
                }

                public com.android.aapt.Plural.Arity getArity() {
                    com.android.aapt.Plural.Arity result = com.android.aapt.Plural.Arity.valueOf(this.arity_);
                    return result == null ? com.android.aapt.Plural.Arity.UNRECOGNIZED : result;
                }

                public com.android.aapt.Plural.Entry.Builder setArity(com.android.aapt.Plural.Arity value) {
                    if (value == null) {
                        throw new NullPointerException();
                    } else {
                        this.arity_ = value.getNumber();
                        this.onChanged();
                        return this;
                    }
                }

                public com.android.aapt.Plural.Entry.Builder clearArity() {
                    this.arity_ = 0;
                    this.onChanged();
                    return this;
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

                public com.android.aapt.Plural.Entry.Builder setItem(com.android.aapt.Item value) {
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

                public com.android.aapt.Plural.Entry.Builder setItem(com.android.aapt.Item.Builder builderForValue) {
                    if (this.itemBuilder_ == null) {
                        this.item_ = builderForValue.build();
                        this.onChanged();
                    } else {
                        this.itemBuilder_.setMessage(builderForValue.build());
                    }

                    return this;
                }

                public com.android.aapt.Plural.Entry.Builder mergeItem(com.android.aapt.Item value) {
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

                public com.android.aapt.Plural.Entry.Builder clearItem() {
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

                public final com.android.aapt.Plural.Entry.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                    return (com.android.aapt.Plural.Entry.Builder)super.setUnknownFields(unknownFields);
                }

                public final com.android.aapt.Plural.Entry.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                    return (com.android.aapt.Plural.Entry.Builder)super.mergeUnknownFields(unknownFields);
                }
            }
        }

        public interface EntryOrBuilder extends MessageOrBuilder {
            boolean hasSource();

            com.android.aapt.Source getSource();

            com.android.aapt.SourceOrBuilder getSourceOrBuilder();

            java.lang.String getComment();

            ByteString getCommentBytes();

            int getArityValue();

            com.android.aapt.Plural.Arity getArity();

            boolean hasItem();

            com.android.aapt.Item getItem();

            com.android.aapt.ItemOrBuilder getItemOrBuilder();
        }

        public static enum Arity implements ProtocolMessageEnum {
            ZERO(0),
            ONE(1),
            TWO(2),
            FEW(3),
            MANY(4),
            OTHER(5),
            UNRECOGNIZED(-1);

            public static final int ZERO_VALUE = 0;
            public static final int ONE_VALUE = 1;
            public static final int TWO_VALUE = 2;
            public static final int FEW_VALUE = 3;
            public static final int MANY_VALUE = 4;
            public static final int OTHER_VALUE = 5;
            private static final Internal.EnumLiteMap<Arity> internalValueMap = new Internal.EnumLiteMap<Arity>() {
                public com.android.aapt.Plural.Arity findValueByNumber(int number) {
                    return com.android.aapt.Plural.Arity.forNumber(number);
                }
            };
            private static final com.android.aapt.Plural.Arity[] VALUES = values();
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
            public static com.android.aapt.Plural.Arity valueOf(int value) {
                return forNumber(value);
            }

            public static com.android.aapt.Plural.Arity forNumber(int value) {
                switch(value) {
                    case 0:
                        return ZERO;
                    case 1:
                        return ONE;
                    case 2:
                        return TWO;
                    case 3:
                        return FEW;
                    case 4:
                        return MANY;
                    case 5:
                        return OTHER;
                    default:
                        return null;
                }
            }

            public static Internal.EnumLiteMap<Arity> internalGetValueMap() {
                return internalValueMap;
            }

            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
            }

            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return (Descriptors.EnumDescriptor)com.android.aapt.Plural.getDescriptor().getEnumTypes().get(0);
            }

            public static com.android.aapt.Plural.Arity valueOf(Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                } else {
                    return desc.getIndex() == -1 ? UNRECOGNIZED : VALUES[desc.getIndex()];
                }
            }

            private Arity(int value) {
                this.value = value;
            }
        }
    }