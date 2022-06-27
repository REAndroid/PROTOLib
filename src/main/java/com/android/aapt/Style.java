package com.android.aapt;

import com.google.protobuf.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Style extends GeneratedMessageV3 implements com.android.aapt.StyleOrBuilder {
        private static final long serialVersionUID = 0L;
        public static final int PARENT_FIELD_NUMBER = 1;
        private com.android.aapt.Reference parent_;
        public static final int PARENT_SOURCE_FIELD_NUMBER = 2;
        private com.android.aapt.Source parentSource_;
        public static final int ENTRY_FIELD_NUMBER = 3;
        private List<com.android.aapt.Style.Entry> entry_;
        private byte memoizedIsInitialized;
        private static final com.android.aapt.Style DEFAULT_INSTANCE = new com.android.aapt.Style();
        private static final Parser<com.android.aapt.Style> PARSER = new AbstractParser<com.android.aapt.Style>() {
            public com.android.aapt.Style parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new com.android.aapt.Style(input, extensionRegistry);
            }
        };

        private Style(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private Style() {
            this.memoizedIsInitialized = -1;
            this.entry_ = Collections.emptyList();
        }

        @Override
        public Object newInstance(UnusedPrivateParameter unused) {
            return new com.android.aapt.Style();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Style(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                com.android.aapt.Reference.Builder subBuilder = null;
                                if (this.parent_ != null) {
                                    subBuilder = this.parent_.toBuilder();
                                }

                                this.parent_ = (com.android.aapt.Reference)input.readMessage(com.android.aapt.Reference.parser(), extensionRegistry);
                                if (subBuilder != null) {
                                    subBuilder.mergeFrom(this.parent_);
                                    this.parent_ = subBuilder.buildPartial();
                                }
                                break;
                            case 18:
                                com.android.aapt.Source.Builder subBuilder3 = null;
                                if (this.parentSource_ != null) {
                                    subBuilder3 = this.parentSource_.toBuilder();
                                }

                                this.parentSource_ = (com.android.aapt.Source)input.readMessage(com.android.aapt.Source.parser(), extensionRegistry);
                                if (subBuilder3 != null) {
                                    subBuilder3.mergeFrom(this.parentSource_);
                                    this.parentSource_ = subBuilder3.buildPartial();
                                }
                                break;
                            case 26:
                                if (!(mutable_bitField0_ & true)) {
                                    this.entry_ = new ArrayList();
                                    mutable_bitField0_ |= true;
                                }

                                this.entry_.add((com.android.aapt.Style.Entry)input.readMessage(com.android.aapt.Style.Entry.parser(), extensionRegistry));
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
            return Resources.internal_static_aapt_pb_Style_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_Style_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.Style.class, com.android.aapt.Style.Builder.class);
        }

        public boolean hasParent() {
            return this.parent_ != null;
        }

        public com.android.aapt.Reference getParent() {
            return this.parent_ == null ? com.android.aapt.Reference.getDefaultInstance() : this.parent_;
        }

        public com.android.aapt.ReferenceOrBuilder getParentOrBuilder() {
            return this.getParent();
        }

        public boolean hasParentSource() {
            return this.parentSource_ != null;
        }

        public com.android.aapt.Source getParentSource() {
            return this.parentSource_ == null ? com.android.aapt.Source.getDefaultInstance() : this.parentSource_;
        }

        public com.android.aapt.SourceOrBuilder getParentSourceOrBuilder() {
            return this.getParentSource();
        }

        public List<com.android.aapt.Style.Entry> getEntryList() {
            return this.entry_;
        }

        public List<? extends com.android.aapt.Style.EntryOrBuilder> getEntryOrBuilderList() {
            return this.entry_;
        }

        public int getEntryCount() {
            return this.entry_.size();
        }

        public com.android.aapt.Style.Entry getEntry(int index) {
            return (com.android.aapt.Style.Entry)this.entry_.get(index);
        }

        public com.android.aapt.Style.EntryOrBuilder getEntryOrBuilder(int index) {
            return (com.android.aapt.Style.EntryOrBuilder)this.entry_.get(index);
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
            if (this.parent_ != null) {
                output.writeMessage(1, this.getParent());
            }

            if (this.parentSource_ != null) {
                output.writeMessage(2, this.getParentSource());
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
                if (this.parent_ != null) {
                    size += CodedOutputStream.computeMessageSize(1, this.getParent());
                }

                if (this.parentSource_ != null) {
                    size += CodedOutputStream.computeMessageSize(2, this.getParentSource());
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
            } else if (!(obj instanceof com.android.aapt.Style)) {
                return super.equals(obj);
            } else {
                com.android.aapt.Style other = (com.android.aapt.Style)obj;
                if (this.hasParent() != other.hasParent()) {
                    return false;
                } else if (this.hasParent() && !this.getParent().equals(other.getParent())) {
                    return false;
                } else if (this.hasParentSource() != other.hasParentSource()) {
                    return false;
                } else if (this.hasParentSource() && !this.getParentSource().equals(other.getParentSource())) {
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
                if (this.hasParent()) {
                    hash = 37 * hash + 1;
                    hash = 53 * hash + this.getParent().hashCode();
                }

                if (this.hasParentSource()) {
                    hash = 37 * hash + 2;
                    hash = 53 * hash + this.getParentSource().hashCode();
                }

                if (this.getEntryCount() > 0) {
                    hash = 37 * hash + 3;
                    hash = 53 * hash + this.getEntryList().hashCode();
                }

                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static com.android.aapt.Style parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Style)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Style parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Style)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Style parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Style)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Style parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Style)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Style parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Style)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Style parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Style)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Style parseFrom(InputStream input) throws IOException {
            return (com.android.aapt.Style)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.Style parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Style)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.Style parseDelimitedFrom(InputStream input) throws IOException {
            return (com.android.aapt.Style)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static com.android.aapt.Style parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Style)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.Style parseFrom(CodedInputStream input) throws IOException {
            return (com.android.aapt.Style)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.Style parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Style)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public com.android.aapt.Style.Builder newBuilderForType() {
            return newBuilder();
        }

        public static com.android.aapt.Style.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static com.android.aapt.Style.Builder newBuilder(com.android.aapt.Style prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public com.android.aapt.Style.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new com.android.aapt.Style.Builder() : (new com.android.aapt.Style.Builder()).mergeFrom(this);
        }

        public com.android.aapt.Style.Builder newBuilderForType(BuilderParent parent) {
            com.android.aapt.Style.Builder builder = new com.android.aapt.Style.Builder(parent);
            return builder;
        }

        public static com.android.aapt.Style getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<com.android.aapt.Style> parser() {
            return PARSER;
        }

        public Parser<com.android.aapt.Style> getParserForType() {
            return PARSER;
        }

        public com.android.aapt.Style getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.Style.Builder> implements com.android.aapt.StyleOrBuilder {
            private int bitField0_;
            private com.android.aapt.Reference parent_;
            private SingleFieldBuilderV3<com.android.aapt.Reference, com.android.aapt.Reference.Builder, com.android.aapt.ReferenceOrBuilder> parentBuilder_;
            private com.android.aapt.Source parentSource_;
            private SingleFieldBuilderV3<com.android.aapt.Source, com.android.aapt.Source.Builder, com.android.aapt.SourceOrBuilder> parentSourceBuilder_;
            private List<com.android.aapt.Style.Entry> entry_;
            private RepeatedFieldBuilderV3<com.android.aapt.Style.Entry, com.android.aapt.Style.Entry.Builder, com.android.aapt.Style.EntryOrBuilder> entryBuilder_;

            public static Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_Style_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_Style_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.Style.class, com.android.aapt.Style.Builder.class);
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
                if (com.android.aapt.Style.alwaysUseFieldBuilders) {
                    this.getEntryFieldBuilder();
                }

            }

            public com.android.aapt.Style.Builder clear() {
                super.clear();
                if (this.parentBuilder_ == null) {
                    this.parent_ = null;
                } else {
                    this.parent_ = null;
                    this.parentBuilder_ = null;
                }

                if (this.parentSourceBuilder_ == null) {
                    this.parentSource_ = null;
                } else {
                    this.parentSource_ = null;
                    this.parentSourceBuilder_ = null;
                }

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
                return Resources.internal_static_aapt_pb_Style_descriptor;
            }

            public com.android.aapt.Style getDefaultInstanceForType() {
                return com.android.aapt.Style.getDefaultInstance();
            }

            public com.android.aapt.Style build() {
                com.android.aapt.Style result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public com.android.aapt.Style buildPartial() {
                com.android.aapt.Style result = new com.android.aapt.Style(this);
                int from_bitField0_ = this.bitField0_;
                if (this.parentBuilder_ == null) {
                    result.parent_ = this.parent_;
                } else {
                    result.parent_ = (com.android.aapt.Reference)this.parentBuilder_.build();
                }

                if (this.parentSourceBuilder_ == null) {
                    result.parentSource_ = this.parentSource_;
                } else {
                    result.parentSource_ = (com.android.aapt.Source)this.parentSourceBuilder_.build();
                }

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

            public com.android.aapt.Style.Builder clone() {
                return (com.android.aapt.Style.Builder)super.clone();
            }

            public com.android.aapt.Style.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.Style.Builder)super.setField(field, value);
            }

            public com.android.aapt.Style.Builder clearField(Descriptors.FieldDescriptor field) {
                return (com.android.aapt.Style.Builder)super.clearField(field);
            }

            public com.android.aapt.Style.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (com.android.aapt.Style.Builder)super.clearOneof(oneof);
            }

            public com.android.aapt.Style.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (com.android.aapt.Style.Builder)super.setRepeatedField(field, index, value);
            }

            public com.android.aapt.Style.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.Style.Builder)super.addRepeatedField(field, value);
            }

            public com.android.aapt.Style.Builder mergeFrom(Message other) {
                if (other instanceof com.android.aapt.Style) {
                    return this.mergeFrom((com.android.aapt.Style)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public com.android.aapt.Style.Builder mergeFrom(com.android.aapt.Style other) {
                if (other == com.android.aapt.Style.getDefaultInstance()) {
                    return this;
                } else {
                    if (other.hasParent()) {
                        this.mergeParent(other.getParent());
                    }

                    if (other.hasParentSource()) {
                        this.mergeParentSource(other.getParentSource());
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
                            this.entryBuilder_ = com.android.aapt.Style.alwaysUseFieldBuilders ? this.getEntryFieldBuilder() : null;
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

            public com.android.aapt.Style.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                com.android.aapt.Style parsedMessage = null;

                try {
                    parsedMessage = (com.android.aapt.Style)com.android.aapt.Style.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (com.android.aapt.Style)var8.getUnfinishedMessage();
                    throw var8.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }

                }

                return this;
            }

            public boolean hasParent() {
                return this.parentBuilder_ != null || this.parent_ != null;
            }

            public com.android.aapt.Reference getParent() {
                if (this.parentBuilder_ == null) {
                    return this.parent_ == null ? com.android.aapt.Reference.getDefaultInstance() : this.parent_;
                } else {
                    return (com.android.aapt.Reference)this.parentBuilder_.getMessage();
                }
            }

            public com.android.aapt.Style.Builder setParent(com.android.aapt.Reference value) {
                if (this.parentBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.parent_ = value;
                    this.onChanged();
                } else {
                    this.parentBuilder_.setMessage(value);
                }

                return this;
            }

            public com.android.aapt.Style.Builder setParent(com.android.aapt.Reference.Builder builderForValue) {
                if (this.parentBuilder_ == null) {
                    this.parent_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.parentBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.Style.Builder mergeParent(com.android.aapt.Reference value) {
                if (this.parentBuilder_ == null) {
                    if (this.parent_ != null) {
                        this.parent_ = com.android.aapt.Reference.newBuilder(this.parent_).mergeFrom(value).buildPartial();
                    } else {
                        this.parent_ = value;
                    }

                    this.onChanged();
                } else {
                    this.parentBuilder_.mergeFrom(value);
                }

                return this;
            }

            public com.android.aapt.Style.Builder clearParent() {
                if (this.parentBuilder_ == null) {
                    this.parent_ = null;
                    this.onChanged();
                } else {
                    this.parent_ = null;
                    this.parentBuilder_ = null;
                }

                return this;
            }

            public com.android.aapt.Reference.Builder getParentBuilder() {
                this.onChanged();
                return (com.android.aapt.Reference.Builder)this.getParentFieldBuilder().getBuilder();
            }

            public com.android.aapt.ReferenceOrBuilder getParentOrBuilder() {
                if (this.parentBuilder_ != null) {
                    return (com.android.aapt.ReferenceOrBuilder)this.parentBuilder_.getMessageOrBuilder();
                } else {
                    return this.parent_ == null ? com.android.aapt.Reference.getDefaultInstance() : this.parent_;
                }
            }

            private SingleFieldBuilderV3<com.android.aapt.Reference, com.android.aapt.Reference.Builder, com.android.aapt.ReferenceOrBuilder> getParentFieldBuilder() {
                if (this.parentBuilder_ == null) {
                    this.parentBuilder_ = new SingleFieldBuilderV3(this.getParent(), this.getParentForChildren(), this.isClean());
                    this.parent_ = null;
                }

                return this.parentBuilder_;
            }

            public boolean hasParentSource() {
                return this.parentSourceBuilder_ != null || this.parentSource_ != null;
            }

            public com.android.aapt.Source getParentSource() {
                if (this.parentSourceBuilder_ == null) {
                    return this.parentSource_ == null ? com.android.aapt.Source.getDefaultInstance() : this.parentSource_;
                } else {
                    return (com.android.aapt.Source)this.parentSourceBuilder_.getMessage();
                }
            }

            public com.android.aapt.Style.Builder setParentSource(com.android.aapt.Source value) {
                if (this.parentSourceBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.parentSource_ = value;
                    this.onChanged();
                } else {
                    this.parentSourceBuilder_.setMessage(value);
                }

                return this;
            }

            public com.android.aapt.Style.Builder setParentSource(com.android.aapt.Source.Builder builderForValue) {
                if (this.parentSourceBuilder_ == null) {
                    this.parentSource_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.parentSourceBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.Style.Builder mergeParentSource(com.android.aapt.Source value) {
                if (this.parentSourceBuilder_ == null) {
                    if (this.parentSource_ != null) {
                        this.parentSource_ = com.android.aapt.Source.newBuilder(this.parentSource_).mergeFrom(value).buildPartial();
                    } else {
                        this.parentSource_ = value;
                    }

                    this.onChanged();
                } else {
                    this.parentSourceBuilder_.mergeFrom(value);
                }

                return this;
            }

            public com.android.aapt.Style.Builder clearParentSource() {
                if (this.parentSourceBuilder_ == null) {
                    this.parentSource_ = null;
                    this.onChanged();
                } else {
                    this.parentSource_ = null;
                    this.parentSourceBuilder_ = null;
                }

                return this;
            }

            public com.android.aapt.Source.Builder getParentSourceBuilder() {
                this.onChanged();
                return (com.android.aapt.Source.Builder)this.getParentSourceFieldBuilder().getBuilder();
            }

            public com.android.aapt.SourceOrBuilder getParentSourceOrBuilder() {
                if (this.parentSourceBuilder_ != null) {
                    return (com.android.aapt.SourceOrBuilder)this.parentSourceBuilder_.getMessageOrBuilder();
                } else {
                    return this.parentSource_ == null ? com.android.aapt.Source.getDefaultInstance() : this.parentSource_;
                }
            }

            private SingleFieldBuilderV3<com.android.aapt.Source, com.android.aapt.Source.Builder, com.android.aapt.SourceOrBuilder> getParentSourceFieldBuilder() {
                if (this.parentSourceBuilder_ == null) {
                    this.parentSourceBuilder_ = new SingleFieldBuilderV3(this.getParentSource(), this.getParentForChildren(), this.isClean());
                    this.parentSource_ = null;
                }

                return this.parentSourceBuilder_;
            }

            private void ensureEntryIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.entry_ = new ArrayList(this.entry_);
                    this.bitField0_ |= 1;
                }

            }

            public List<com.android.aapt.Style.Entry> getEntryList() {
                return this.entryBuilder_ == null ? Collections.unmodifiableList(this.entry_) : this.entryBuilder_.getMessageList();
            }

            public int getEntryCount() {
                return this.entryBuilder_ == null ? this.entry_.size() : this.entryBuilder_.getCount();
            }

            public com.android.aapt.Style.Entry getEntry(int index) {
                return this.entryBuilder_ == null ? (com.android.aapt.Style.Entry)this.entry_.get(index) : (com.android.aapt.Style.Entry)this.entryBuilder_.getMessage(index);
            }

            public com.android.aapt.Style.Builder setEntry(int index, com.android.aapt.Style.Entry value) {
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

            public com.android.aapt.Style.Builder setEntry(int index, com.android.aapt.Style.Entry.Builder builderForValue) {
                if (this.entryBuilder_ == null) {
                    this.ensureEntryIsMutable();
                    this.entry_.set(index, builderForValue.build());
                    this.onChanged();
                } else {
                    this.entryBuilder_.setMessage(index, builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.Style.Builder addEntry(com.android.aapt.Style.Entry value) {
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

            public com.android.aapt.Style.Builder addEntry(int index, com.android.aapt.Style.Entry value) {
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

            public com.android.aapt.Style.Builder addEntry(com.android.aapt.Style.Entry.Builder builderForValue) {
                if (this.entryBuilder_ == null) {
                    this.ensureEntryIsMutable();
                    this.entry_.add(builderForValue.build());
                    this.onChanged();
                } else {
                    this.entryBuilder_.addMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.Style.Builder addEntry(int index, com.android.aapt.Style.Entry.Builder builderForValue) {
                if (this.entryBuilder_ == null) {
                    this.ensureEntryIsMutable();
                    this.entry_.add(index, builderForValue.build());
                    this.onChanged();
                } else {
                    this.entryBuilder_.addMessage(index, builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.Style.Builder addAllEntry(Iterable<? extends com.android.aapt.Style.Entry> values) {
                if (this.entryBuilder_ == null) {
                    this.ensureEntryIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.entry_);
                    this.onChanged();
                } else {
                    this.entryBuilder_.addAllMessages(values);
                }

                return this;
            }

            public com.android.aapt.Style.Builder clearEntry() {
                if (this.entryBuilder_ == null) {
                    this.entry_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    this.onChanged();
                } else {
                    this.entryBuilder_.clear();
                }

                return this;
            }

            public com.android.aapt.Style.Builder removeEntry(int index) {
                if (this.entryBuilder_ == null) {
                    this.ensureEntryIsMutable();
                    this.entry_.remove(index);
                    this.onChanged();
                } else {
                    this.entryBuilder_.remove(index);
                }

                return this;
            }

            public com.android.aapt.Style.Entry.Builder getEntryBuilder(int index) {
                return (com.android.aapt.Style.Entry.Builder)this.getEntryFieldBuilder().getBuilder(index);
            }

            public com.android.aapt.Style.EntryOrBuilder getEntryOrBuilder(int index) {
                return this.entryBuilder_ == null ? (com.android.aapt.Style.EntryOrBuilder)this.entry_.get(index) : (com.android.aapt.Style.EntryOrBuilder)this.entryBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends com.android.aapt.Style.EntryOrBuilder> getEntryOrBuilderList() {
                return this.entryBuilder_ != null ? this.entryBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.entry_);
            }

            public com.android.aapt.Style.Entry.Builder addEntryBuilder() {
                return (com.android.aapt.Style.Entry.Builder)this.getEntryFieldBuilder().addBuilder(com.android.aapt.Style.Entry.getDefaultInstance());
            }

            public com.android.aapt.Style.Entry.Builder addEntryBuilder(int index) {
                return (com.android.aapt.Style.Entry.Builder)this.getEntryFieldBuilder().addBuilder(index, com.android.aapt.Style.Entry.getDefaultInstance());
            }

            public List<com.android.aapt.Style.Entry.Builder> getEntryBuilderList() {
                return this.getEntryFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<com.android.aapt.Style.Entry, com.android.aapt.Style.Entry.Builder, com.android.aapt.Style.EntryOrBuilder> getEntryFieldBuilder() {
                if (this.entryBuilder_ == null) {
                    this.entryBuilder_ = new RepeatedFieldBuilderV3(this.entry_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
                    this.entry_ = null;
                }

                return this.entryBuilder_;
            }

            public final com.android.aapt.Style.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.Style.Builder)super.setUnknownFields(unknownFields);
            }

            public final com.android.aapt.Style.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.Style.Builder)super.mergeUnknownFields(unknownFields);
            }
        }

        public static final class Entry extends GeneratedMessageV3 implements com.android.aapt.Style.EntryOrBuilder {
            private static final long serialVersionUID = 0L;
            public static final int SOURCE_FIELD_NUMBER = 1;
            private com.android.aapt.Source source_;
            public static final int COMMENT_FIELD_NUMBER = 2;
            private volatile Object comment_;
            public static final int KEY_FIELD_NUMBER = 3;
            private com.android.aapt.Reference key_;
            public static final int ITEM_FIELD_NUMBER = 4;
            private com.android.aapt.Item item_;
            private byte memoizedIsInitialized;
            private static final com.android.aapt.Style.Entry DEFAULT_INSTANCE = new com.android.aapt.Style.Entry();
            private static final Parser<com.android.aapt.Style.Entry> PARSER = new AbstractParser<com.android.aapt.Style.Entry>() {
                public com.android.aapt.Style.Entry parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new com.android.aapt.Style.Entry(input, extensionRegistry);
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
                return new com.android.aapt.Style.Entry();
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
                                    if (this.key_ != null) {
                                        subBuilder2 = this.key_.toBuilder();
                                    }

                                    this.key_ = (com.android.aapt.Reference)input.readMessage(com.android.aapt.Reference.parser(), extensionRegistry);
                                    if (subBuilder2 != null) {
                                        subBuilder2.mergeFrom(this.key_);
                                        this.key_ = subBuilder2.buildPartial();
                                    }
                                    break;
                                case 34:
                                    com.android.aapt.Item.Builder subBuilder3 = null;
                                    if (this.item_ != null) {
                                        subBuilder3 = this.item_.toBuilder();
                                    }

                                    this.item_ = (com.android.aapt.Item)input.readMessage(com.android.aapt.Item.parser(), extensionRegistry);
                                    if (subBuilder3 != null) {
                                        subBuilder3.mergeFrom(this.item_);
                                        this.item_ = subBuilder3.buildPartial();
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
                return Resources.internal_static_aapt_pb_Style_Entry_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_Style_Entry_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.Style.Entry.class, com.android.aapt.Style.Entry.Builder.class);
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

            public boolean hasKey() {
                return this.key_ != null;
            }

            public com.android.aapt.Reference getKey() {
                return this.key_ == null ? com.android.aapt.Reference.getDefaultInstance() : this.key_;
            }

            public com.android.aapt.ReferenceOrBuilder getKeyOrBuilder() {
                return this.getKey();
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

                if (this.key_ != null) {
                    output.writeMessage(3, this.getKey());
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

                    if (this.key_ != null) {
                        size += CodedOutputStream.computeMessageSize(3, this.getKey());
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
                } else if (!(obj instanceof com.android.aapt.Style.Entry)) {
                    return super.equals(obj);
                } else {
                    com.android.aapt.Style.Entry other = (com.android.aapt.Style.Entry)obj;
                    if (this.hasSource() != other.hasSource()) {
                        return false;
                    } else if (this.hasSource() && !this.getSource().equals(other.getSource())) {
                        return false;
                    } else if (!this.getComment().equals(other.getComment())) {
                        return false;
                    } else if (this.hasKey() != other.hasKey()) {
                        return false;
                    } else if (this.hasKey() && !this.getKey().equals(other.getKey())) {
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
                    if (this.hasKey()) {
                        hash = 37 * hash + 3;
                        hash = 53 * hash + this.getKey().hashCode();
                    }

                    if (this.hasItem()) {
                        hash = 37 * hash + 4;
                        hash = 53 * hash + this.getItem().hashCode();
                    }

                    hash = 29 * hash + this.unknownFields.hashCode();
                    this.memoizedHashCode = hash;
                    return hash;
                }
            }

            public static com.android.aapt.Style.Entry parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (com.android.aapt.Style.Entry)PARSER.parseFrom(data);
            }

            public static com.android.aapt.Style.Entry parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (com.android.aapt.Style.Entry)PARSER.parseFrom(data, extensionRegistry);
            }

            public static com.android.aapt.Style.Entry parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (com.android.aapt.Style.Entry)PARSER.parseFrom(data);
            }

            public static com.android.aapt.Style.Entry parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (com.android.aapt.Style.Entry)PARSER.parseFrom(data, extensionRegistry);
            }

            public static com.android.aapt.Style.Entry parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (com.android.aapt.Style.Entry)PARSER.parseFrom(data);
            }

            public static com.android.aapt.Style.Entry parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (com.android.aapt.Style.Entry)PARSER.parseFrom(data, extensionRegistry);
            }

            public static com.android.aapt.Style.Entry parseFrom(InputStream input) throws IOException {
                return (com.android.aapt.Style.Entry)GeneratedMessageV3.parseWithIOException(PARSER, input);
            }

            public static com.android.aapt.Style.Entry parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (com.android.aapt.Style.Entry)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
            }

            public static com.android.aapt.Style.Entry parseDelimitedFrom(InputStream input) throws IOException {
                return (com.android.aapt.Style.Entry)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
            }

            public static com.android.aapt.Style.Entry parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (com.android.aapt.Style.Entry)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }

            public static com.android.aapt.Style.Entry parseFrom(CodedInputStream input) throws IOException {
                return (com.android.aapt.Style.Entry)GeneratedMessageV3.parseWithIOException(PARSER, input);
            }

            public static com.android.aapt.Style.Entry parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (com.android.aapt.Style.Entry)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
            }

            public com.android.aapt.Style.Entry.Builder newBuilderForType() {
                return newBuilder();
            }

            public static com.android.aapt.Style.Entry.Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static com.android.aapt.Style.Entry.Builder newBuilder(com.android.aapt.Style.Entry prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }

            public com.android.aapt.Style.Entry.Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new com.android.aapt.Style.Entry.Builder() : (new com.android.aapt.Style.Entry.Builder()).mergeFrom(this);
            }

            public com.android.aapt.Style.Entry.Builder newBuilderForType(BuilderParent parent) {
                com.android.aapt.Style.Entry.Builder builder = new com.android.aapt.Style.Entry.Builder(parent);
                return builder;
            }

            public static com.android.aapt.Style.Entry getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<com.android.aapt.Style.Entry> parser() {
                return PARSER;
            }

            public Parser<com.android.aapt.Style.Entry> getParserForType() {
                return PARSER;
            }

            public com.android.aapt.Style.Entry getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.Style.Entry.Builder> implements com.android.aapt.Style.EntryOrBuilder {
                private com.android.aapt.Source source_;
                private SingleFieldBuilderV3<com.android.aapt.Source, com.android.aapt.Source.Builder, com.android.aapt.SourceOrBuilder> sourceBuilder_;
                private Object comment_;
                private com.android.aapt.Reference key_;
                private SingleFieldBuilderV3<com.android.aapt.Reference, com.android.aapt.Reference.Builder, com.android.aapt.ReferenceOrBuilder> keyBuilder_;
                private com.android.aapt.Item item_;
                private SingleFieldBuilderV3<com.android.aapt.Item, com.android.aapt.Item.Builder, com.android.aapt.ItemOrBuilder> itemBuilder_;

                public static Descriptors.Descriptor getDescriptor() {
                    return Resources.internal_static_aapt_pb_Style_Entry_descriptor;
                }

                public FieldAccessorTable internalGetFieldAccessorTable() {
                    return Resources.internal_static_aapt_pb_Style_Entry_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.Style.Entry.class, com.android.aapt.Style.Entry.Builder.class);
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
                    if (com.android.aapt.Style.Entry.alwaysUseFieldBuilders) {
                    }

                }

                public com.android.aapt.Style.Entry.Builder clear() {
                    super.clear();
                    if (this.sourceBuilder_ == null) {
                        this.source_ = null;
                    } else {
                        this.source_ = null;
                        this.sourceBuilder_ = null;
                    }

                    this.comment_ = "";
                    if (this.keyBuilder_ == null) {
                        this.key_ = null;
                    } else {
                        this.key_ = null;
                        this.keyBuilder_ = null;
                    }

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
                    return Resources.internal_static_aapt_pb_Style_Entry_descriptor;
                }

                public com.android.aapt.Style.Entry getDefaultInstanceForType() {
                    return com.android.aapt.Style.Entry.getDefaultInstance();
                }

                public com.android.aapt.Style.Entry build() {
                    com.android.aapt.Style.Entry result = this.buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    } else {
                        return result;
                    }
                }

                public com.android.aapt.Style.Entry buildPartial() {
                    com.android.aapt.Style.Entry result = new com.android.aapt.Style.Entry(this);
                    if (this.sourceBuilder_ == null) {
                        result.source_ = this.source_;
                    } else {
                        result.source_ = (com.android.aapt.Source)this.sourceBuilder_.build();
                    }

                    result.comment_ = this.comment_;
                    if (this.keyBuilder_ == null) {
                        result.key_ = this.key_;
                    } else {
                        result.key_ = (com.android.aapt.Reference)this.keyBuilder_.build();
                    }

                    if (this.itemBuilder_ == null) {
                        result.item_ = this.item_;
                    } else {
                        result.item_ = (com.android.aapt.Item)this.itemBuilder_.build();
                    }

                    this.onBuilt();
                    return result;
                }

                public com.android.aapt.Style.Entry.Builder clone() {
                    return (com.android.aapt.Style.Entry.Builder)super.clone();
                }

                public com.android.aapt.Style.Entry.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                    return (com.android.aapt.Style.Entry.Builder)super.setField(field, value);
                }

                public com.android.aapt.Style.Entry.Builder clearField(Descriptors.FieldDescriptor field) {
                    return (com.android.aapt.Style.Entry.Builder)super.clearField(field);
                }

                public com.android.aapt.Style.Entry.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                    return (com.android.aapt.Style.Entry.Builder)super.clearOneof(oneof);
                }

                public com.android.aapt.Style.Entry.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                    return (com.android.aapt.Style.Entry.Builder)super.setRepeatedField(field, index, value);
                }

                public com.android.aapt.Style.Entry.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                    return (com.android.aapt.Style.Entry.Builder)super.addRepeatedField(field, value);
                }

                public com.android.aapt.Style.Entry.Builder mergeFrom(Message other) {
                    if (other instanceof com.android.aapt.Style.Entry) {
                        return this.mergeFrom((com.android.aapt.Style.Entry)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public com.android.aapt.Style.Entry.Builder mergeFrom(com.android.aapt.Style.Entry other) {
                    if (other == com.android.aapt.Style.Entry.getDefaultInstance()) {
                        return this;
                    } else {
                        if (other.hasSource()) {
                            this.mergeSource(other.getSource());
                        }

                        if (!other.getComment().isEmpty()) {
                            this.comment_ = other.comment_;
                            this.onChanged();
                        }

                        if (other.hasKey()) {
                            this.mergeKey(other.getKey());
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

                public com.android.aapt.Style.Entry.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                    com.android.aapt.Style.Entry parsedMessage = null;

                    try {
                        parsedMessage = (com.android.aapt.Style.Entry)com.android.aapt.Style.Entry.PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (InvalidProtocolBufferException var8) {
                        parsedMessage = (com.android.aapt.Style.Entry)var8.getUnfinishedMessage();
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

                public com.android.aapt.Style.Entry.Builder setSource(com.android.aapt.Source value) {
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

                public com.android.aapt.Style.Entry.Builder setSource(com.android.aapt.Source.Builder builderForValue) {
                    if (this.sourceBuilder_ == null) {
                        this.source_ = builderForValue.build();
                        this.onChanged();
                    } else {
                        this.sourceBuilder_.setMessage(builderForValue.build());
                    }

                    return this;
                }

                public com.android.aapt.Style.Entry.Builder mergeSource(com.android.aapt.Source value) {
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

                public com.android.aapt.Style.Entry.Builder clearSource() {
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

                public com.android.aapt.Style.Entry.Builder setComment(java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    } else {
                        this.comment_ = value;
                        this.onChanged();
                        return this;
                    }
                }

                public com.android.aapt.Style.Entry.Builder clearComment() {
                    this.comment_ = com.android.aapt.Style.Entry.getDefaultInstance().getComment();
                    this.onChanged();
                    return this;
                }

                public com.android.aapt.Style.Entry.Builder setCommentBytes(ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    } else {
                        com.android.aapt.Style.Entry.checkByteStringIsUtf8(value);
                        this.comment_ = value;
                        this.onChanged();
                        return this;
                    }
                }

                public boolean hasKey() {
                    return this.keyBuilder_ != null || this.key_ != null;
                }

                public com.android.aapt.Reference getKey() {
                    if (this.keyBuilder_ == null) {
                        return this.key_ == null ? com.android.aapt.Reference.getDefaultInstance() : this.key_;
                    } else {
                        return (com.android.aapt.Reference)this.keyBuilder_.getMessage();
                    }
                }

                public com.android.aapt.Style.Entry.Builder setKey(com.android.aapt.Reference value) {
                    if (this.keyBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }

                        this.key_ = value;
                        this.onChanged();
                    } else {
                        this.keyBuilder_.setMessage(value);
                    }

                    return this;
                }

                public com.android.aapt.Style.Entry.Builder setKey(com.android.aapt.Reference.Builder builderForValue) {
                    if (this.keyBuilder_ == null) {
                        this.key_ = builderForValue.build();
                        this.onChanged();
                    } else {
                        this.keyBuilder_.setMessage(builderForValue.build());
                    }

                    return this;
                }

                public com.android.aapt.Style.Entry.Builder mergeKey(com.android.aapt.Reference value) {
                    if (this.keyBuilder_ == null) {
                        if (this.key_ != null) {
                            this.key_ = com.android.aapt.Reference.newBuilder(this.key_).mergeFrom(value).buildPartial();
                        } else {
                            this.key_ = value;
                        }

                        this.onChanged();
                    } else {
                        this.keyBuilder_.mergeFrom(value);
                    }

                    return this;
                }

                public com.android.aapt.Style.Entry.Builder clearKey() {
                    if (this.keyBuilder_ == null) {
                        this.key_ = null;
                        this.onChanged();
                    } else {
                        this.key_ = null;
                        this.keyBuilder_ = null;
                    }

                    return this;
                }

                public com.android.aapt.Reference.Builder getKeyBuilder() {
                    this.onChanged();
                    return (com.android.aapt.Reference.Builder)this.getKeyFieldBuilder().getBuilder();
                }

                public com.android.aapt.ReferenceOrBuilder getKeyOrBuilder() {
                    if (this.keyBuilder_ != null) {
                        return (com.android.aapt.ReferenceOrBuilder)this.keyBuilder_.getMessageOrBuilder();
                    } else {
                        return this.key_ == null ? com.android.aapt.Reference.getDefaultInstance() : this.key_;
                    }
                }

                private SingleFieldBuilderV3<com.android.aapt.Reference, com.android.aapt.Reference.Builder, com.android.aapt.ReferenceOrBuilder> getKeyFieldBuilder() {
                    if (this.keyBuilder_ == null) {
                        this.keyBuilder_ = new SingleFieldBuilderV3(this.getKey(), this.getParentForChildren(), this.isClean());
                        this.key_ = null;
                    }

                    return this.keyBuilder_;
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

                public com.android.aapt.Style.Entry.Builder setItem(com.android.aapt.Item value) {
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

                public com.android.aapt.Style.Entry.Builder setItem(com.android.aapt.Item.Builder builderForValue) {
                    if (this.itemBuilder_ == null) {
                        this.item_ = builderForValue.build();
                        this.onChanged();
                    } else {
                        this.itemBuilder_.setMessage(builderForValue.build());
                    }

                    return this;
                }

                public com.android.aapt.Style.Entry.Builder mergeItem(com.android.aapt.Item value) {
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

                public com.android.aapt.Style.Entry.Builder clearItem() {
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

                public final com.android.aapt.Style.Entry.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                    return (com.android.aapt.Style.Entry.Builder)super.setUnknownFields(unknownFields);
                }

                public final com.android.aapt.Style.Entry.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                    return (com.android.aapt.Style.Entry.Builder)super.mergeUnknownFields(unknownFields);
                }
            }
        }

        public interface EntryOrBuilder extends MessageOrBuilder {
            boolean hasSource();

            com.android.aapt.Source getSource();

            com.android.aapt.SourceOrBuilder getSourceOrBuilder();

            java.lang.String getComment();

            ByteString getCommentBytes();

            boolean hasKey();

            com.android.aapt.Reference getKey();

            com.android.aapt.ReferenceOrBuilder getKeyOrBuilder();

            boolean hasItem();

            com.android.aapt.Item getItem();

            com.android.aapt.ItemOrBuilder getItemOrBuilder();
        }
    }