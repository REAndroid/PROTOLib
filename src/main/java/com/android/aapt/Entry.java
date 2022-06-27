package com.android.aapt;

import com.google.protobuf.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Entry extends GeneratedMessageV3 implements com.android.aapt.EntryOrBuilder {
        private static final long serialVersionUID = 0L;
        public static final int ENTRY_ID_FIELD_NUMBER = 1;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int VISIBILITY_FIELD_NUMBER = 3;
        public static final int ALLOW_NEW_FIELD_NUMBER = 4;
        public static final int OVERLAYABLE_ITEM_FIELD_NUMBER = 5;
        public static final int CONFIG_VALUE_FIELD_NUMBER = 6;
        public static final int STAGED_ID_FIELD_NUMBER = 7;

        private com.android.aapt.EntryId entryId_;
        private volatile Object name_;
        private com.android.aapt.Visibility visibility_;
        private com.android.aapt.AllowNew allowNew_;
        private com.android.aapt.OverlayableItem overlayableItem_;
        private List<com.android.aapt.ConfigValue> configValue_;
        private com.android.aapt.StagedId stagedId_;
        private byte memoizedIsInitialized;
        private static final com.android.aapt.Entry DEFAULT_INSTANCE = new com.android.aapt.Entry();
        private static final Parser<com.android.aapt.Entry> PARSER = new AbstractParser<com.android.aapt.Entry>() {
            public com.android.aapt.Entry parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new com.android.aapt.Entry(input, extensionRegistry);
            }
        };

        private Entry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private Entry() {
            this.memoizedIsInitialized = -1;
            this.name_ = "";
            this.configValue_ = Collections.emptyList();
        }

        @Override
        public Object newInstance(UnusedPrivateParameter unused) {
            return new com.android.aapt.Entry();
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
                                com.android.aapt.EntryId.Builder subBuilder = null;
                                if (this.entryId_ != null) {
                                    subBuilder = this.entryId_.toBuilder();
                                }

                                this.entryId_ = (com.android.aapt.EntryId)input.readMessage(com.android.aapt.EntryId.parser(), extensionRegistry);
                                if (subBuilder != null) {
                                    subBuilder.mergeFrom(this.entryId_);
                                    this.entryId_ = subBuilder.buildPartial();
                                }
                                break;
                            case 18:
                                java.lang.String s = input.readStringRequireUtf8();
                                this.name_ = s;
                                break;
                            case 26:
                                com.android.aapt.Visibility.Builder subBuilder2 = null;
                                if (this.visibility_ != null) {
                                    subBuilder2 = this.visibility_.toBuilder();
                                }

                                this.visibility_ = (com.android.aapt.Visibility)input.readMessage(com.android.aapt.Visibility.parser(), extensionRegistry);
                                if (subBuilder2 != null) {
                                    subBuilder2.mergeFrom(this.visibility_);
                                    this.visibility_ = subBuilder2.buildPartial();
                                }
                                break;
                            case 34:
                                com.android.aapt.AllowNew.Builder subBuilder3 = null;
                                if (this.allowNew_ != null) {
                                    subBuilder3 = this.allowNew_.toBuilder();
                                }

                                this.allowNew_ = (com.android.aapt.AllowNew)input.readMessage(com.android.aapt.AllowNew.parser(), extensionRegistry);
                                if (subBuilder3 != null) {
                                    subBuilder3.mergeFrom(this.allowNew_);
                                    this.allowNew_ = subBuilder3.buildPartial();
                                }
                                break;
                            case 42:
                                com.android.aapt.OverlayableItem.Builder subBuilder4 = null;
                                if (this.overlayableItem_ != null) {
                                    subBuilder4 = this.overlayableItem_.toBuilder();
                                }

                                this.overlayableItem_ = (com.android.aapt.OverlayableItem)input.readMessage(com.android.aapt.OverlayableItem.parser(), extensionRegistry);
                                if (subBuilder4 != null) {
                                    subBuilder4.mergeFrom(this.overlayableItem_);
                                    this.overlayableItem_ = subBuilder4.buildPartial();
                                }
                                break;
                            case 50:
                                if (!(mutable_bitField0_ & true)) {
                                    this.configValue_ = new ArrayList();
                                    mutable_bitField0_ |= true;
                                }

                                this.configValue_.add((com.android.aapt.ConfigValue)input.readMessage(com.android.aapt.ConfigValue.parser(), extensionRegistry));
                                break;
                            case 58:
                                com.android.aapt.StagedId.Builder subBuilder5 = null;
                                if (this.stagedId_ != null) {
                                    subBuilder5 = this.stagedId_.toBuilder();
                                }

                                this.stagedId_ = (com.android.aapt.StagedId)input.readMessage(com.android.aapt.StagedId.parser(), extensionRegistry);
                                if (subBuilder5 != null) {
                                    subBuilder5.mergeFrom(this.stagedId_);
                                    this.stagedId_ = subBuilder5.buildPartial();
                                }
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
                        this.configValue_ = Collections.unmodifiableList(this.configValue_);
                    }

                    this.unknownFields = unknownFields.build();
                    this.makeExtensionsImmutable();
                }

            }
        }

        public static Descriptors.Descriptor getDescriptor() {
            return Resources.internal_static_aapt_pb_Entry_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_Entry_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.Entry.class, com.android.aapt.Entry.Builder.class);
        }

        public boolean hasEntryId() {
            return this.entryId_ != null;
        }

        public com.android.aapt.EntryId getEntryId() {
            return this.entryId_ == null ? com.android.aapt.EntryId.getDefaultInstance() : this.entryId_;
        }

        public com.android.aapt.EntryIdOrBuilder getEntryIdOrBuilder() {
            return this.getEntryId();
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

        public boolean hasVisibility() {
            return this.visibility_ != null;
        }

        public com.android.aapt.Visibility getVisibility() {
            return this.visibility_ == null ? com.android.aapt.Visibility.getDefaultInstance() : this.visibility_;
        }

        public com.android.aapt.VisibilityOrBuilder getVisibilityOrBuilder() {
            return this.getVisibility();
        }

        public boolean hasAllowNew() {
            return this.allowNew_ != null;
        }

        public com.android.aapt.AllowNew getAllowNew() {
            return this.allowNew_ == null ? com.android.aapt.AllowNew.getDefaultInstance() : this.allowNew_;
        }

        public com.android.aapt.AllowNewOrBuilder getAllowNewOrBuilder() {
            return this.getAllowNew();
        }

        public boolean hasOverlayableItem() {
            return this.overlayableItem_ != null;
        }

        public com.android.aapt.OverlayableItem getOverlayableItem() {
            return this.overlayableItem_ == null ? com.android.aapt.OverlayableItem.getDefaultInstance() : this.overlayableItem_;
        }

        public com.android.aapt.OverlayableItemOrBuilder getOverlayableItemOrBuilder() {
            return this.getOverlayableItem();
        }

        public List<com.android.aapt.ConfigValue> getConfigValueList() {
            return this.configValue_;
        }

        public List<? extends com.android.aapt.ConfigValueOrBuilder> getConfigValueOrBuilderList() {
            return this.configValue_;
        }

        public int getConfigValueCount() {
            return this.configValue_.size();
        }

        public com.android.aapt.ConfigValue getConfigValue(int index) {
            return (com.android.aapt.ConfigValue)this.configValue_.get(index);
        }

        public com.android.aapt.ConfigValueOrBuilder getConfigValueOrBuilder(int index) {
            return (com.android.aapt.ConfigValueOrBuilder)this.configValue_.get(index);
        }

        public boolean hasStagedId() {
            return this.stagedId_ != null;
        }

        public com.android.aapt.StagedId getStagedId() {
            return this.stagedId_ == null ? com.android.aapt.StagedId.getDefaultInstance() : this.stagedId_;
        }

        public com.android.aapt.StagedIdOrBuilder getStagedIdOrBuilder() {
            return this.getStagedId();
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
            if (this.entryId_ != null) {
                output.writeMessage(ENTRY_ID_FIELD_NUMBER, this.getEntryId());
            }

            if (!this.getNameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, NAME_FIELD_NUMBER, this.name_);
            }

            if (this.visibility_ != null) {
                output.writeMessage(VISIBILITY_FIELD_NUMBER, this.getVisibility());
            }

            if (this.allowNew_ != null) {
                output.writeMessage(ALLOW_NEW_FIELD_NUMBER, this.getAllowNew());
            }

            if (this.overlayableItem_ != null) {
                output.writeMessage(OVERLAYABLE_ITEM_FIELD_NUMBER, this.getOverlayableItem());
            }

            for(int i = 0; i < this.configValue_.size(); ++i) {
                output.writeMessage(CONFIG_VALUE_FIELD_NUMBER, (MessageLite)this.configValue_.get(i));
            }

            if (this.stagedId_ != null) {
                output.writeMessage(STAGED_ID_FIELD_NUMBER, this.getStagedId());
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
                if (this.entryId_ != null) {
                    size += CodedOutputStream.computeMessageSize(1, this.getEntryId());
                }

                if (!this.getNameBytes().isEmpty()) {
                    size += GeneratedMessageV3.computeStringSize(2, this.name_);
                }

                if (this.visibility_ != null) {
                    size += CodedOutputStream.computeMessageSize(3, this.getVisibility());
                }

                if (this.allowNew_ != null) {
                    size += CodedOutputStream.computeMessageSize(4, this.getAllowNew());
                }

                if (this.overlayableItem_ != null) {
                    size += CodedOutputStream.computeMessageSize(5, this.getOverlayableItem());
                }

                for(int i = 0; i < this.configValue_.size(); ++i) {
                    size += CodedOutputStream.computeMessageSize(6, (MessageLite)this.configValue_.get(i));
                }

                if (this.stagedId_ != null) {
                    size += CodedOutputStream.computeMessageSize(7, this.getStagedId());
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
            } else if (!(obj instanceof com.android.aapt.Entry)) {
                return super.equals(obj);
            } else {
                com.android.aapt.Entry other = (com.android.aapt.Entry)obj;
                if (this.hasEntryId() != other.hasEntryId()) {
                    return false;
                } else if (this.hasEntryId() && !this.getEntryId().equals(other.getEntryId())) {
                    return false;
                } else if (!this.getName().equals(other.getName())) {
                    return false;
                } else if (this.hasVisibility() != other.hasVisibility()) {
                    return false;
                } else if (this.hasVisibility() && !this.getVisibility().equals(other.getVisibility())) {
                    return false;
                } else if (this.hasAllowNew() != other.hasAllowNew()) {
                    return false;
                } else if (this.hasAllowNew() && !this.getAllowNew().equals(other.getAllowNew())) {
                    return false;
                } else if (this.hasOverlayableItem() != other.hasOverlayableItem()) {
                    return false;
                } else if (this.hasOverlayableItem() && !this.getOverlayableItem().equals(other.getOverlayableItem())) {
                    return false;
                } else if (!this.getConfigValueList().equals(other.getConfigValueList())) {
                    return false;
                } else if (this.hasStagedId() != other.hasStagedId()) {
                    return false;
                } else if (this.hasStagedId() && !this.getStagedId().equals(other.getStagedId())) {
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
                if (this.hasEntryId()) {
                    hash = 37 * hash + 1;
                    hash = 53 * hash + this.getEntryId().hashCode();
                }

                hash = 37 * hash + 2;
                hash = 53 * hash + this.getName().hashCode();
                if (this.hasVisibility()) {
                    hash = 37 * hash + 3;
                    hash = 53 * hash + this.getVisibility().hashCode();
                }

                if (this.hasAllowNew()) {
                    hash = 37 * hash + 4;
                    hash = 53 * hash + this.getAllowNew().hashCode();
                }

                if (this.hasOverlayableItem()) {
                    hash = 37 * hash + 5;
                    hash = 53 * hash + this.getOverlayableItem().hashCode();
                }

                if (this.getConfigValueCount() > 0) {
                    hash = 37 * hash + 6;
                    hash = 53 * hash + this.getConfigValueList().hashCode();
                }

                if (this.hasStagedId()) {
                    hash = 37 * hash + 7;
                    hash = 53 * hash + this.getStagedId().hashCode();
                }

                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static com.android.aapt.Entry parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Entry)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Entry parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Entry)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Entry parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Entry)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Entry parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Entry)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Entry parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Entry)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Entry parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Entry)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Entry parseFrom(InputStream input) throws IOException {
            return (com.android.aapt.Entry)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.Entry parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Entry)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.Entry parseDelimitedFrom(InputStream input) throws IOException {
            return (com.android.aapt.Entry)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static com.android.aapt.Entry parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Entry)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.Entry parseFrom(CodedInputStream input) throws IOException {
            return (com.android.aapt.Entry)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.Entry parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Entry)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public com.android.aapt.Entry.Builder newBuilderForType() {
            return newBuilder();
        }

        public static com.android.aapt.Entry.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static com.android.aapt.Entry.Builder newBuilder(com.android.aapt.Entry prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public com.android.aapt.Entry.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new com.android.aapt.Entry.Builder() : (new com.android.aapt.Entry.Builder()).mergeFrom(this);
        }

        public com.android.aapt.Entry.Builder newBuilderForType(BuilderParent parent) {
            com.android.aapt.Entry.Builder builder = new com.android.aapt.Entry.Builder(parent);
            return builder;
        }

        public static com.android.aapt.Entry getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<com.android.aapt.Entry> parser() {
            return PARSER;
        }

        public Parser<com.android.aapt.Entry> getParserForType() {
            return PARSER;
        }

        public com.android.aapt.Entry getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.Entry.Builder> implements com.android.aapt.EntryOrBuilder {
            private int bitField0_;
            private com.android.aapt.EntryId entryId_;
            private SingleFieldBuilderV3<com.android.aapt.EntryId, com.android.aapt.EntryId.Builder, com.android.aapt.EntryIdOrBuilder> entryIdBuilder_;
            private Object name_;
            private com.android.aapt.Visibility visibility_;
            private SingleFieldBuilderV3<com.android.aapt.Visibility, com.android.aapt.Visibility.Builder, com.android.aapt.VisibilityOrBuilder> visibilityBuilder_;
            private com.android.aapt.AllowNew allowNew_;
            private SingleFieldBuilderV3<com.android.aapt.AllowNew, com.android.aapt.AllowNew.Builder, com.android.aapt.AllowNewOrBuilder> allowNewBuilder_;
            private com.android.aapt.OverlayableItem overlayableItem_;
            private SingleFieldBuilderV3<com.android.aapt.OverlayableItem, com.android.aapt.OverlayableItem.Builder, com.android.aapt.OverlayableItemOrBuilder> overlayableItemBuilder_;
            private List<com.android.aapt.ConfigValue> configValue_;
            private RepeatedFieldBuilderV3<com.android.aapt.ConfigValue, com.android.aapt.ConfigValue.Builder, com.android.aapt.ConfigValueOrBuilder> configValueBuilder_;
            private com.android.aapt.StagedId stagedId_;
            private SingleFieldBuilderV3<com.android.aapt.StagedId, com.android.aapt.StagedId.Builder, com.android.aapt.StagedIdOrBuilder> stagedIdBuilder_;

            public static Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_Entry_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_Entry_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.Entry.class, com.android.aapt.Entry.Builder.class);
            }

            private Builder() {
                this.name_ = "";
                this.configValue_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.name_ = "";
                this.configValue_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.android.aapt.Entry.alwaysUseFieldBuilders) {
                    this.getConfigValueFieldBuilder();
                }

            }

            public com.android.aapt.Entry.Builder clear() {
                super.clear();
                if (this.entryIdBuilder_ == null) {
                    this.entryId_ = null;
                } else {
                    this.entryId_ = null;
                    this.entryIdBuilder_ = null;
                }

                this.name_ = "";
                if (this.visibilityBuilder_ == null) {
                    this.visibility_ = null;
                } else {
                    this.visibility_ = null;
                    this.visibilityBuilder_ = null;
                }

                if (this.allowNewBuilder_ == null) {
                    this.allowNew_ = null;
                } else {
                    this.allowNew_ = null;
                    this.allowNewBuilder_ = null;
                }

                if (this.overlayableItemBuilder_ == null) {
                    this.overlayableItem_ = null;
                } else {
                    this.overlayableItem_ = null;
                    this.overlayableItemBuilder_ = null;
                }

                if (this.configValueBuilder_ == null) {
                    this.configValue_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    this.configValueBuilder_.clear();
                }

                if (this.stagedIdBuilder_ == null) {
                    this.stagedId_ = null;
                } else {
                    this.stagedId_ = null;
                    this.stagedIdBuilder_ = null;
                }

                return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Resources.internal_static_aapt_pb_Entry_descriptor;
            }

            public com.android.aapt.Entry getDefaultInstanceForType() {
                return com.android.aapt.Entry.getDefaultInstance();
            }

            public com.android.aapt.Entry build() {
                com.android.aapt.Entry result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public com.android.aapt.Entry buildPartial() {
                com.android.aapt.Entry result = new com.android.aapt.Entry(this);
                int from_bitField0_ = this.bitField0_;
                if (this.entryIdBuilder_ == null) {
                    result.entryId_ = this.entryId_;
                } else {
                    result.entryId_ = (com.android.aapt.EntryId)this.entryIdBuilder_.build();
                }

                result.name_ = this.name_;
                if (this.visibilityBuilder_ == null) {
                    result.visibility_ = this.visibility_;
                } else {
                    result.visibility_ = (com.android.aapt.Visibility)this.visibilityBuilder_.build();
                }

                if (this.allowNewBuilder_ == null) {
                    result.allowNew_ = this.allowNew_;
                } else {
                    result.allowNew_ = (com.android.aapt.AllowNew)this.allowNewBuilder_.build();
                }

                if (this.overlayableItemBuilder_ == null) {
                    result.overlayableItem_ = this.overlayableItem_;
                } else {
                    result.overlayableItem_ = (com.android.aapt.OverlayableItem)this.overlayableItemBuilder_.build();
                }

                if (this.configValueBuilder_ == null) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.configValue_ = Collections.unmodifiableList(this.configValue_);
                        this.bitField0_ &= -2;
                    }

                    result.configValue_ = this.configValue_;
                } else {
                    result.configValue_ = this.configValueBuilder_.build();
                }

                if (this.stagedIdBuilder_ == null) {
                    result.stagedId_ = this.stagedId_;
                } else {
                    result.stagedId_ = (com.android.aapt.StagedId)this.stagedIdBuilder_.build();
                }

                this.onBuilt();
                return result;
            }

            public com.android.aapt.Entry.Builder clone() {
                return (com.android.aapt.Entry.Builder)super.clone();
            }

            public com.android.aapt.Entry.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.Entry.Builder)super.setField(field, value);
            }

            public com.android.aapt.Entry.Builder clearField(Descriptors.FieldDescriptor field) {
                return (com.android.aapt.Entry.Builder)super.clearField(field);
            }

            public com.android.aapt.Entry.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (com.android.aapt.Entry.Builder)super.clearOneof(oneof);
            }

            public com.android.aapt.Entry.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (com.android.aapt.Entry.Builder)super.setRepeatedField(field, index, value);
            }

            public com.android.aapt.Entry.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.Entry.Builder)super.addRepeatedField(field, value);
            }

            public com.android.aapt.Entry.Builder mergeFrom(Message other) {
                if (other instanceof com.android.aapt.Entry) {
                    return this.mergeFrom((com.android.aapt.Entry)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public com.android.aapt.Entry.Builder mergeFrom(com.android.aapt.Entry other) {
                if (other == com.android.aapt.Entry.getDefaultInstance()) {
                    return this;
                } else {
                    if (other.hasEntryId()) {
                        this.mergeEntryId(other.getEntryId());
                    }

                    if (!other.getName().isEmpty()) {
                        this.name_ = other.name_;
                        this.onChanged();
                    }

                    if (other.hasVisibility()) {
                        this.mergeVisibility(other.getVisibility());
                    }

                    if (other.hasAllowNew()) {
                        this.mergeAllowNew(other.getAllowNew());
                    }

                    if (other.hasOverlayableItem()) {
                        this.mergeOverlayableItem(other.getOverlayableItem());
                    }

                    if (this.configValueBuilder_ == null) {
                        if (!other.configValue_.isEmpty()) {
                            if (this.configValue_.isEmpty()) {
                                this.configValue_ = other.configValue_;
                                this.bitField0_ &= -2;
                            } else {
                                this.ensureConfigValueIsMutable();
                                this.configValue_.addAll(other.configValue_);
                            }

                            this.onChanged();
                        }
                    } else if (!other.configValue_.isEmpty()) {
                        if (this.configValueBuilder_.isEmpty()) {
                            this.configValueBuilder_.dispose();
                            this.configValueBuilder_ = null;
                            this.configValue_ = other.configValue_;
                            this.bitField0_ &= -2;
                            this.configValueBuilder_ = com.android.aapt.Entry.alwaysUseFieldBuilders ? this.getConfigValueFieldBuilder() : null;
                        } else {
                            this.configValueBuilder_.addAllMessages(other.configValue_);
                        }
                    }

                    if (other.hasStagedId()) {
                        this.mergeStagedId(other.getStagedId());
                    }

                    this.mergeUnknownFields(other.unknownFields);
                    this.onChanged();
                    return this;
                }
            }

            public final boolean isInitialized() {
                return true;
            }

            public com.android.aapt.Entry.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                com.android.aapt.Entry parsedMessage = null;

                try {
                    parsedMessage = (com.android.aapt.Entry)com.android.aapt.Entry.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (com.android.aapt.Entry)var8.getUnfinishedMessage();
                    throw var8.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }

                }

                return this;
            }

            public boolean hasEntryId() {
                return this.entryIdBuilder_ != null || this.entryId_ != null;
            }

            public com.android.aapt.EntryId getEntryId() {
                if (this.entryIdBuilder_ == null) {
                    return this.entryId_ == null ? com.android.aapt.EntryId.getDefaultInstance() : this.entryId_;
                } else {
                    return (com.android.aapt.EntryId)this.entryIdBuilder_.getMessage();
                }
            }

            public com.android.aapt.Entry.Builder setEntryId(com.android.aapt.EntryId value) {
                if (this.entryIdBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.entryId_ = value;
                    this.onChanged();
                } else {
                    this.entryIdBuilder_.setMessage(value);
                }

                return this;
            }

            public com.android.aapt.Entry.Builder setEntryId(com.android.aapt.EntryId.Builder builderForValue) {
                if (this.entryIdBuilder_ == null) {
                    this.entryId_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.entryIdBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.Entry.Builder mergeEntryId(com.android.aapt.EntryId value) {
                if (this.entryIdBuilder_ == null) {
                    if (this.entryId_ != null) {
                        this.entryId_ = com.android.aapt.EntryId.newBuilder(this.entryId_).mergeFrom(value).buildPartial();
                    } else {
                        this.entryId_ = value;
                    }

                    this.onChanged();
                } else {
                    this.entryIdBuilder_.mergeFrom(value);
                }

                return this;
            }

            public com.android.aapt.Entry.Builder clearEntryId() {
                if (this.entryIdBuilder_ == null) {
                    this.entryId_ = null;
                    this.onChanged();
                } else {
                    this.entryId_ = null;
                    this.entryIdBuilder_ = null;
                }

                return this;
            }

            public com.android.aapt.EntryId.Builder getEntryIdBuilder() {
                this.onChanged();
                return (com.android.aapt.EntryId.Builder)this.getEntryIdFieldBuilder().getBuilder();
            }

            public com.android.aapt.EntryIdOrBuilder getEntryIdOrBuilder() {
                if (this.entryIdBuilder_ != null) {
                    return (com.android.aapt.EntryIdOrBuilder)this.entryIdBuilder_.getMessageOrBuilder();
                } else {
                    return this.entryId_ == null ? com.android.aapt.EntryId.getDefaultInstance() : this.entryId_;
                }
            }

            private SingleFieldBuilderV3<com.android.aapt.EntryId, com.android.aapt.EntryId.Builder, com.android.aapt.EntryIdOrBuilder> getEntryIdFieldBuilder() {
                if (this.entryIdBuilder_ == null) {
                    this.entryIdBuilder_ = new SingleFieldBuilderV3(this.getEntryId(), this.getParentForChildren(), this.isClean());
                    this.entryId_ = null;
                }

                return this.entryIdBuilder_;
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

            public com.android.aapt.Entry.Builder setName(java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.name_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public com.android.aapt.Entry.Builder clearName() {
                this.name_ = com.android.aapt.Entry.getDefaultInstance().getName();
                this.onChanged();
                return this;
            }

            public com.android.aapt.Entry.Builder setNameBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    com.android.aapt.Entry.checkByteStringIsUtf8(value);
                    this.name_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public boolean hasVisibility() {
                return this.visibilityBuilder_ != null || this.visibility_ != null;
            }

            public com.android.aapt.Visibility getVisibility() {
                if (this.visibilityBuilder_ == null) {
                    return this.visibility_ == null ? com.android.aapt.Visibility.getDefaultInstance() : this.visibility_;
                } else {
                    return (com.android.aapt.Visibility)this.visibilityBuilder_.getMessage();
                }
            }

            public com.android.aapt.Entry.Builder setVisibility(com.android.aapt.Visibility value) {
                if (this.visibilityBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.visibility_ = value;
                    this.onChanged();
                } else {
                    this.visibilityBuilder_.setMessage(value);
                }

                return this;
            }

            public com.android.aapt.Entry.Builder setVisibility(com.android.aapt.Visibility.Builder builderForValue) {
                if (this.visibilityBuilder_ == null) {
                    this.visibility_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.visibilityBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.Entry.Builder mergeVisibility(com.android.aapt.Visibility value) {
                if (this.visibilityBuilder_ == null) {
                    if (this.visibility_ != null) {
                        this.visibility_ = com.android.aapt.Visibility.newBuilder(this.visibility_).mergeFrom(value).buildPartial();
                    } else {
                        this.visibility_ = value;
                    }

                    this.onChanged();
                } else {
                    this.visibilityBuilder_.mergeFrom(value);
                }

                return this;
            }

            public com.android.aapt.Entry.Builder clearVisibility() {
                if (this.visibilityBuilder_ == null) {
                    this.visibility_ = null;
                    this.onChanged();
                } else {
                    this.visibility_ = null;
                    this.visibilityBuilder_ = null;
                }

                return this;
            }

            public com.android.aapt.Visibility.Builder getVisibilityBuilder() {
                this.onChanged();
                return (com.android.aapt.Visibility.Builder)this.getVisibilityFieldBuilder().getBuilder();
            }

            public com.android.aapt.VisibilityOrBuilder getVisibilityOrBuilder() {
                if (this.visibilityBuilder_ != null) {
                    return (com.android.aapt.VisibilityOrBuilder)this.visibilityBuilder_.getMessageOrBuilder();
                } else {
                    return this.visibility_ == null ? com.android.aapt.Visibility.getDefaultInstance() : this.visibility_;
                }
            }

            private SingleFieldBuilderV3<com.android.aapt.Visibility, com.android.aapt.Visibility.Builder, com.android.aapt.VisibilityOrBuilder> getVisibilityFieldBuilder() {
                if (this.visibilityBuilder_ == null) {
                    this.visibilityBuilder_ = new SingleFieldBuilderV3(this.getVisibility(), this.getParentForChildren(), this.isClean());
                    this.visibility_ = null;
                }

                return this.visibilityBuilder_;
            }

            public boolean hasAllowNew() {
                return this.allowNewBuilder_ != null || this.allowNew_ != null;
            }

            public com.android.aapt.AllowNew getAllowNew() {
                if (this.allowNewBuilder_ == null) {
                    return this.allowNew_ == null ? com.android.aapt.AllowNew.getDefaultInstance() : this.allowNew_;
                } else {
                    return (com.android.aapt.AllowNew)this.allowNewBuilder_.getMessage();
                }
            }

            public com.android.aapt.Entry.Builder setAllowNew(com.android.aapt.AllowNew value) {
                if (this.allowNewBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.allowNew_ = value;
                    this.onChanged();
                } else {
                    this.allowNewBuilder_.setMessage(value);
                }

                return this;
            }

            public com.android.aapt.Entry.Builder setAllowNew(com.android.aapt.AllowNew.Builder builderForValue) {
                if (this.allowNewBuilder_ == null) {
                    this.allowNew_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.allowNewBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.Entry.Builder mergeAllowNew(com.android.aapt.AllowNew value) {
                if (this.allowNewBuilder_ == null) {
                    if (this.allowNew_ != null) {
                        this.allowNew_ = com.android.aapt.AllowNew.newBuilder(this.allowNew_).mergeFrom(value).buildPartial();
                    } else {
                        this.allowNew_ = value;
                    }

                    this.onChanged();
                } else {
                    this.allowNewBuilder_.mergeFrom(value);
                }

                return this;
            }

            public com.android.aapt.Entry.Builder clearAllowNew() {
                if (this.allowNewBuilder_ == null) {
                    this.allowNew_ = null;
                    this.onChanged();
                } else {
                    this.allowNew_ = null;
                    this.allowNewBuilder_ = null;
                }

                return this;
            }

            public com.android.aapt.AllowNew.Builder getAllowNewBuilder() {
                this.onChanged();
                return (com.android.aapt.AllowNew.Builder)this.getAllowNewFieldBuilder().getBuilder();
            }

            public com.android.aapt.AllowNewOrBuilder getAllowNewOrBuilder() {
                if (this.allowNewBuilder_ != null) {
                    return (com.android.aapt.AllowNewOrBuilder)this.allowNewBuilder_.getMessageOrBuilder();
                } else {
                    return this.allowNew_ == null ? com.android.aapt.AllowNew.getDefaultInstance() : this.allowNew_;
                }
            }

            private SingleFieldBuilderV3<com.android.aapt.AllowNew, com.android.aapt.AllowNew.Builder, com.android.aapt.AllowNewOrBuilder> getAllowNewFieldBuilder() {
                if (this.allowNewBuilder_ == null) {
                    this.allowNewBuilder_ = new SingleFieldBuilderV3(this.getAllowNew(), this.getParentForChildren(), this.isClean());
                    this.allowNew_ = null;
                }

                return this.allowNewBuilder_;
            }

            public boolean hasOverlayableItem() {
                return this.overlayableItemBuilder_ != null || this.overlayableItem_ != null;
            }

            public com.android.aapt.OverlayableItem getOverlayableItem() {
                if (this.overlayableItemBuilder_ == null) {
                    return this.overlayableItem_ == null ? com.android.aapt.OverlayableItem.getDefaultInstance() : this.overlayableItem_;
                } else {
                    return (com.android.aapt.OverlayableItem)this.overlayableItemBuilder_.getMessage();
                }
            }

            public com.android.aapt.Entry.Builder setOverlayableItem(com.android.aapt.OverlayableItem value) {
                if (this.overlayableItemBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.overlayableItem_ = value;
                    this.onChanged();
                } else {
                    this.overlayableItemBuilder_.setMessage(value);
                }

                return this;
            }

            public com.android.aapt.Entry.Builder setOverlayableItem(com.android.aapt.OverlayableItem.Builder builderForValue) {
                if (this.overlayableItemBuilder_ == null) {
                    this.overlayableItem_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.overlayableItemBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.Entry.Builder mergeOverlayableItem(com.android.aapt.OverlayableItem value) {
                if (this.overlayableItemBuilder_ == null) {
                    if (this.overlayableItem_ != null) {
                        this.overlayableItem_ = com.android.aapt.OverlayableItem.newBuilder(this.overlayableItem_).mergeFrom(value).buildPartial();
                    } else {
                        this.overlayableItem_ = value;
                    }

                    this.onChanged();
                } else {
                    this.overlayableItemBuilder_.mergeFrom(value);
                }

                return this;
            }

            public com.android.aapt.Entry.Builder clearOverlayableItem() {
                if (this.overlayableItemBuilder_ == null) {
                    this.overlayableItem_ = null;
                    this.onChanged();
                } else {
                    this.overlayableItem_ = null;
                    this.overlayableItemBuilder_ = null;
                }

                return this;
            }

            public com.android.aapt.OverlayableItem.Builder getOverlayableItemBuilder() {
                this.onChanged();
                return (com.android.aapt.OverlayableItem.Builder)this.getOverlayableItemFieldBuilder().getBuilder();
            }

            public com.android.aapt.OverlayableItemOrBuilder getOverlayableItemOrBuilder() {
                if (this.overlayableItemBuilder_ != null) {
                    return (com.android.aapt.OverlayableItemOrBuilder)this.overlayableItemBuilder_.getMessageOrBuilder();
                } else {
                    return this.overlayableItem_ == null ? com.android.aapt.OverlayableItem.getDefaultInstance() : this.overlayableItem_;
                }
            }

            private SingleFieldBuilderV3<com.android.aapt.OverlayableItem, com.android.aapt.OverlayableItem.Builder, com.android.aapt.OverlayableItemOrBuilder> getOverlayableItemFieldBuilder() {
                if (this.overlayableItemBuilder_ == null) {
                    this.overlayableItemBuilder_ = new SingleFieldBuilderV3(this.getOverlayableItem(), this.getParentForChildren(), this.isClean());
                    this.overlayableItem_ = null;
                }

                return this.overlayableItemBuilder_;
            }

            private void ensureConfigValueIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.configValue_ = new ArrayList(this.configValue_);
                    this.bitField0_ |= 1;
                }

            }

            public List<com.android.aapt.ConfigValue> getConfigValueList() {
                return this.configValueBuilder_ == null ? Collections.unmodifiableList(this.configValue_) : this.configValueBuilder_.getMessageList();
            }

            public int getConfigValueCount() {
                return this.configValueBuilder_ == null ? this.configValue_.size() : this.configValueBuilder_.getCount();
            }

            public com.android.aapt.ConfigValue getConfigValue(int index) {
                return this.configValueBuilder_ == null ? (com.android.aapt.ConfigValue)this.configValue_.get(index) : (com.android.aapt.ConfigValue)this.configValueBuilder_.getMessage(index);
            }

            public com.android.aapt.Entry.Builder setConfigValue(int index, com.android.aapt.ConfigValue value) {
                if (this.configValueBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureConfigValueIsMutable();
                    this.configValue_.set(index, value);
                    this.onChanged();
                } else {
                    this.configValueBuilder_.setMessage(index, value);
                }

                return this;
            }

            public com.android.aapt.Entry.Builder setConfigValue(int index, com.android.aapt.ConfigValue.Builder builderForValue) {
                if (this.configValueBuilder_ == null) {
                    this.ensureConfigValueIsMutable();
                    this.configValue_.set(index, builderForValue.build());
                    this.onChanged();
                } else {
                    this.configValueBuilder_.setMessage(index, builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.Entry.Builder addConfigValue(com.android.aapt.ConfigValue value) {
                if (this.configValueBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureConfigValueIsMutable();
                    this.configValue_.add(value);
                    this.onChanged();
                } else {
                    this.configValueBuilder_.addMessage(value);
                }

                return this;
            }

            public com.android.aapt.Entry.Builder addConfigValue(int index, com.android.aapt.ConfigValue value) {
                if (this.configValueBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureConfigValueIsMutable();
                    this.configValue_.add(index, value);
                    this.onChanged();
                } else {
                    this.configValueBuilder_.addMessage(index, value);
                }

                return this;
            }

            public com.android.aapt.Entry.Builder addConfigValue(com.android.aapt.ConfigValue.Builder builderForValue) {
                if (this.configValueBuilder_ == null) {
                    this.ensureConfigValueIsMutable();
                    this.configValue_.add(builderForValue.build());
                    this.onChanged();
                } else {
                    this.configValueBuilder_.addMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.Entry.Builder addConfigValue(int index, com.android.aapt.ConfigValue.Builder builderForValue) {
                if (this.configValueBuilder_ == null) {
                    this.ensureConfigValueIsMutable();
                    this.configValue_.add(index, builderForValue.build());
                    this.onChanged();
                } else {
                    this.configValueBuilder_.addMessage(index, builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.Entry.Builder addAllConfigValue(Iterable<? extends com.android.aapt.ConfigValue> values) {
                if (this.configValueBuilder_ == null) {
                    this.ensureConfigValueIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.configValue_);
                    this.onChanged();
                } else {
                    this.configValueBuilder_.addAllMessages(values);
                }

                return this;
            }

            public com.android.aapt.Entry.Builder clearConfigValue() {
                if (this.configValueBuilder_ == null) {
                    this.configValue_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    this.onChanged();
                } else {
                    this.configValueBuilder_.clear();
                }

                return this;
            }

            public com.android.aapt.Entry.Builder removeConfigValue(int index) {
                if (this.configValueBuilder_ == null) {
                    this.ensureConfigValueIsMutable();
                    this.configValue_.remove(index);
                    this.onChanged();
                } else {
                    this.configValueBuilder_.remove(index);
                }

                return this;
            }

            public com.android.aapt.ConfigValue.Builder getConfigValueBuilder(int index) {
                return (com.android.aapt.ConfigValue.Builder)this.getConfigValueFieldBuilder().getBuilder(index);
            }

            public com.android.aapt.ConfigValueOrBuilder getConfigValueOrBuilder(int index) {
                return this.configValueBuilder_ == null ? (com.android.aapt.ConfigValueOrBuilder)this.configValue_.get(index) : (com.android.aapt.ConfigValueOrBuilder)this.configValueBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends com.android.aapt.ConfigValueOrBuilder> getConfigValueOrBuilderList() {
                return this.configValueBuilder_ != null ? this.configValueBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.configValue_);
            }

            public com.android.aapt.ConfigValue.Builder addConfigValueBuilder() {
                return (com.android.aapt.ConfigValue.Builder)this.getConfigValueFieldBuilder().addBuilder(com.android.aapt.ConfigValue.getDefaultInstance());
            }

            public com.android.aapt.ConfigValue.Builder addConfigValueBuilder(int index) {
                return (com.android.aapt.ConfigValue.Builder)this.getConfigValueFieldBuilder().addBuilder(index, com.android.aapt.ConfigValue.getDefaultInstance());
            }

            public List<com.android.aapt.ConfigValue.Builder> getConfigValueBuilderList() {
                return this.getConfigValueFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<com.android.aapt.ConfigValue, com.android.aapt.ConfigValue.Builder, com.android.aapt.ConfigValueOrBuilder> getConfigValueFieldBuilder() {
                if (this.configValueBuilder_ == null) {
                    this.configValueBuilder_ = new RepeatedFieldBuilderV3(this.configValue_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
                    this.configValue_ = null;
                }

                return this.configValueBuilder_;
            }

            public boolean hasStagedId() {
                return this.stagedIdBuilder_ != null || this.stagedId_ != null;
            }

            public com.android.aapt.StagedId getStagedId() {
                if (this.stagedIdBuilder_ == null) {
                    return this.stagedId_ == null ? com.android.aapt.StagedId.getDefaultInstance() : this.stagedId_;
                } else {
                    return (com.android.aapt.StagedId)this.stagedIdBuilder_.getMessage();
                }
            }

            public com.android.aapt.Entry.Builder setStagedId(com.android.aapt.StagedId value) {
                if (this.stagedIdBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.stagedId_ = value;
                    this.onChanged();
                } else {
                    this.stagedIdBuilder_.setMessage(value);
                }

                return this;
            }

            public com.android.aapt.Entry.Builder setStagedId(com.android.aapt.StagedId.Builder builderForValue) {
                if (this.stagedIdBuilder_ == null) {
                    this.stagedId_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.stagedIdBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.Entry.Builder mergeStagedId(com.android.aapt.StagedId value) {
                if (this.stagedIdBuilder_ == null) {
                    if (this.stagedId_ != null) {
                        this.stagedId_ = com.android.aapt.StagedId.newBuilder(this.stagedId_).mergeFrom(value).buildPartial();
                    } else {
                        this.stagedId_ = value;
                    }

                    this.onChanged();
                } else {
                    this.stagedIdBuilder_.mergeFrom(value);
                }

                return this;
            }

            public com.android.aapt.Entry.Builder clearStagedId() {
                if (this.stagedIdBuilder_ == null) {
                    this.stagedId_ = null;
                    this.onChanged();
                } else {
                    this.stagedId_ = null;
                    this.stagedIdBuilder_ = null;
                }

                return this;
            }

            public com.android.aapt.StagedId.Builder getStagedIdBuilder() {
                this.onChanged();
                return (com.android.aapt.StagedId.Builder)this.getStagedIdFieldBuilder().getBuilder();
            }

            public com.android.aapt.StagedIdOrBuilder getStagedIdOrBuilder() {
                if (this.stagedIdBuilder_ != null) {
                    return (com.android.aapt.StagedIdOrBuilder)this.stagedIdBuilder_.getMessageOrBuilder();
                } else {
                    return this.stagedId_ == null ? com.android.aapt.StagedId.getDefaultInstance() : this.stagedId_;
                }
            }

            private SingleFieldBuilderV3<com.android.aapt.StagedId, com.android.aapt.StagedId.Builder, com.android.aapt.StagedIdOrBuilder> getStagedIdFieldBuilder() {
                if (this.stagedIdBuilder_ == null) {
                    this.stagedIdBuilder_ = new SingleFieldBuilderV3(this.getStagedId(), this.getParentForChildren(), this.isClean());
                    this.stagedId_ = null;
                }

                return this.stagedIdBuilder_;
            }

            public final com.android.aapt.Entry.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.Entry.Builder)super.setUnknownFields(unknownFields);
            }

            public final com.android.aapt.Entry.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.Entry.Builder)super.mergeUnknownFields(unknownFields);
            }
        }
    }