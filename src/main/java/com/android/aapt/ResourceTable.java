package com.android.aapt;

import com.google.protobuf.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ResourceTable extends GeneratedMessageV3 implements com.android.aapt.ResourceTableOrBuilder {
        private static final long serialVersionUID = 0L;
        public static final int SOURCE_POOL_FIELD_NUMBER = 1;
        public static final int PACKAGE_FIELD_NUMBER = 2;
        public static final int OVERLAYABLE_FIELD_NUMBER = 3;
        public static final int TOOL_FINGERPRINT_FIELD_NUMBER = 4;
        private com.android.aapt.StringPool sourcePool_;
        private List<PBPackage> package_;
        private List<com.android.aapt.Overlayable> overlayable_;
        private List<com.android.aapt.ToolFingerprint> toolFingerprint_;
        private byte memoizedIsInitialized;
        private static final com.android.aapt.ResourceTable DEFAULT_INSTANCE = new com.android.aapt.ResourceTable();
        private static final Parser<com.android.aapt.ResourceTable> PARSER = new AbstractParser<com.android.aapt.ResourceTable>() {
            public com.android.aapt.ResourceTable parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new com.android.aapt.ResourceTable(input, extensionRegistry);
            }
        };

        private ResourceTable(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private ResourceTable() {
            this.memoizedIsInitialized = -1;
            this.package_ = Collections.emptyList();
            this.overlayable_ = Collections.emptyList();
            this.toolFingerprint_ = Collections.emptyList();
        }

        @Override
        public Object newInstance(UnusedPrivateParameter unused) {
            return new com.android.aapt.ResourceTable();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ResourceTable(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            } else {
                int mutable_bitField0_ = 0;
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
                                com.android.aapt.StringPool.Builder subBuilder = null;
                                if (this.sourcePool_ != null) {
                                    subBuilder = this.sourcePool_.toBuilder();
                                }

                                this.sourcePool_ = (com.android.aapt.StringPool)input.readMessage(com.android.aapt.StringPool.parser(), extensionRegistry);
                                if (subBuilder != null) {
                                    subBuilder.mergeFrom(this.sourcePool_);
                                    this.sourcePool_ = subBuilder.buildPartial();
                                }
                                break;
                            case 18:
                                if ((mutable_bitField0_ & 1) == 0) {
                                    this.package_ = new ArrayList();
                                    mutable_bitField0_ |= 1;
                                }

                                this.package_.add((PBPackage)input.readMessage(PBPackage.parser(), extensionRegistry));
                                break;
                            case 26:
                                if ((mutable_bitField0_ & 2) == 0) {
                                    this.overlayable_ = new ArrayList();
                                    mutable_bitField0_ |= 2;
                                }

                                this.overlayable_.add((com.android.aapt.Overlayable)input.readMessage(com.android.aapt.Overlayable.parser(), extensionRegistry));
                                break;
                            case 34:
                                if ((mutable_bitField0_ & 4) == 0) {
                                    this.toolFingerprint_ = new ArrayList();
                                    mutable_bitField0_ |= 4;
                                }

                                this.toolFingerprint_.add((com.android.aapt.ToolFingerprint)input.readMessage(com.android.aapt.ToolFingerprint.parser(), extensionRegistry));
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
                    if ((mutable_bitField0_ & 1) != 0) {
                        this.package_ = Collections.unmodifiableList(this.package_);
                    }

                    if ((mutable_bitField0_ & 2) != 0) {
                        this.overlayable_ = Collections.unmodifiableList(this.overlayable_);
                    }

                    if ((mutable_bitField0_ & 4) != 0) {
                        this.toolFingerprint_ = Collections.unmodifiableList(this.toolFingerprint_);
                    }

                    this.unknownFields = unknownFields.build();
                    this.makeExtensionsImmutable();
                }

            }
        }

        public static Descriptors.Descriptor getDescriptor() {
            return Resources.internal_static_aapt_pb_ResourceTable_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_ResourceTable_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.ResourceTable.class, com.android.aapt.ResourceTable.Builder.class);
        }

        public boolean hasSourcePool() {
            return this.sourcePool_ != null;
        }

        public com.android.aapt.StringPool getSourcePool() {
            return this.sourcePool_ == null ? com.android.aapt.StringPool.getDefaultInstance() : this.sourcePool_;
        }

        public com.android.aapt.StringPoolOrBuilder getSourcePoolOrBuilder() {
            return this.getSourcePool();
        }

        public List<PBPackage> getPackageList() {
            return this.package_;
        }

        public List<? extends com.android.aapt.PackageOrBuilder> getPackageOrBuilderList() {
            return this.package_;
        }

        public int getPackageCount() {
            return this.package_.size();
        }

        public PBPackage getPackage(int index) {
            return (PBPackage)this.package_.get(index);
        }

        public com.android.aapt.PackageOrBuilder getPackageOrBuilder(int index) {
            return (com.android.aapt.PackageOrBuilder)this.package_.get(index);
        }

        public List<com.android.aapt.Overlayable> getOverlayableList() {
            return this.overlayable_;
        }

        public List<? extends com.android.aapt.OverlayableOrBuilder> getOverlayableOrBuilderList() {
            return this.overlayable_;
        }

        public int getOverlayableCount() {
            return this.overlayable_.size();
        }

        public com.android.aapt.Overlayable getOverlayable(int index) {
            return (com.android.aapt.Overlayable)this.overlayable_.get(index);
        }

        public com.android.aapt.OverlayableOrBuilder getOverlayableOrBuilder(int index) {
            return (com.android.aapt.OverlayableOrBuilder)this.overlayable_.get(index);
        }

        public List<com.android.aapt.ToolFingerprint> getToolFingerprintList() {
            return this.toolFingerprint_;
        }

        public List<? extends com.android.aapt.ToolFingerprintOrBuilder> getToolFingerprintOrBuilderList() {
            return this.toolFingerprint_;
        }

        public int getToolFingerprintCount() {
            return this.toolFingerprint_.size();
        }

        public com.android.aapt.ToolFingerprint getToolFingerprint(int index) {
            return (com.android.aapt.ToolFingerprint)this.toolFingerprint_.get(index);
        }

        public com.android.aapt.ToolFingerprintOrBuilder getToolFingerprintOrBuilder(int index) {
            return (com.android.aapt.ToolFingerprintOrBuilder)this.toolFingerprint_.get(index);
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
            if (this.sourcePool_ != null) {
                output.writeMessage(SOURCE_POOL_FIELD_NUMBER, this.getSourcePool());
            }

            int i;
            for(i = 0; i < this.package_.size(); ++i) {
                output.writeMessage(PACKAGE_FIELD_NUMBER, (MessageLite)this.package_.get(i));
            }

            for(i = 0; i < this.overlayable_.size(); ++i) {
                output.writeMessage(OVERLAYABLE_FIELD_NUMBER, (MessageLite)this.overlayable_.get(i));
            }

            for(i = 0; i < this.toolFingerprint_.size(); ++i) {
                output.writeMessage(TOOL_FINGERPRINT_FIELD_NUMBER, (MessageLite)this.toolFingerprint_.get(i));
            }

            this.unknownFields.writeTo(output);
        }

        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if (this.sourcePool_ != null) {
                size += CodedOutputStream.computeMessageSize(SOURCE_POOL_FIELD_NUMBER, this.getSourcePool());
            }

            int i;
            for(i = 0; i < this.package_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(PACKAGE_FIELD_NUMBER, (MessageLite)this.package_.get(i));
            }

            for(i = 0; i < this.overlayable_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(OVERLAYABLE_FIELD_NUMBER, (MessageLite)this.overlayable_.get(i));
            }

            for(i = 0; i < this.toolFingerprint_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(TOOL_FINGERPRINT_FIELD_NUMBER, (MessageLite)this.toolFingerprint_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            } else if (!(obj instanceof com.android.aapt.ResourceTable)) {
                return super.equals(obj);
            } else {
                com.android.aapt.ResourceTable other = (com.android.aapt.ResourceTable)obj;
                if (this.hasSourcePool() != other.hasSourcePool()) {
                    return false;
                } else if (this.hasSourcePool() && !this.getSourcePool().equals(other.getSourcePool())) {
                    return false;
                } else if (!this.getPackageList().equals(other.getPackageList())) {
                    return false;
                } else if (!this.getOverlayableList().equals(other.getOverlayableList())) {
                    return false;
                } else if (!this.getToolFingerprintList().equals(other.getToolFingerprintList())) {
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
                if (this.hasSourcePool()) {
                    hash = 37 * hash + 1;
                    hash = 53 * hash + this.getSourcePool().hashCode();
                }

                if (this.getPackageCount() > 0) {
                    hash = 37 * hash + 2;
                    hash = 53 * hash + this.getPackageList().hashCode();
                }

                if (this.getOverlayableCount() > 0) {
                    hash = 37 * hash + 3;
                    hash = 53 * hash + this.getOverlayableList().hashCode();
                }

                if (this.getToolFingerprintCount() > 0) {
                    hash = 37 * hash + 4;
                    hash = 53 * hash + this.getToolFingerprintList().hashCode();
                }

                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static com.android.aapt.ResourceTable parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (com.android.aapt.ResourceTable)PARSER.parseFrom(data);
        }

        public static com.android.aapt.ResourceTable parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.ResourceTable)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.ResourceTable parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (com.android.aapt.ResourceTable)PARSER.parseFrom(data);
        }

        public static com.android.aapt.ResourceTable parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.ResourceTable)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.ResourceTable parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (com.android.aapt.ResourceTable)PARSER.parseFrom(data);
        }

        public static com.android.aapt.ResourceTable parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.ResourceTable)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.ResourceTable parseFrom(InputStream input) throws IOException {
            return (com.android.aapt.ResourceTable)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.ResourceTable parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.ResourceTable)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.ResourceTable parseDelimitedFrom(InputStream input) throws IOException {
            return (com.android.aapt.ResourceTable)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static com.android.aapt.ResourceTable parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.ResourceTable)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.ResourceTable parseFrom(CodedInputStream input) throws IOException {
            return (com.android.aapt.ResourceTable)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.ResourceTable parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.ResourceTable)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public com.android.aapt.ResourceTable.Builder newBuilderForType() {
            return newBuilder();
        }

        public static com.android.aapt.ResourceTable.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static com.android.aapt.ResourceTable.Builder newBuilder(com.android.aapt.ResourceTable prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public com.android.aapt.ResourceTable.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new com.android.aapt.ResourceTable.Builder() : (new com.android.aapt.ResourceTable.Builder()).mergeFrom(this);
        }

        public com.android.aapt.ResourceTable.Builder newBuilderForType(BuilderParent parent) {
            com.android.aapt.ResourceTable.Builder builder = new com.android.aapt.ResourceTable.Builder(parent);
            return builder;
        }

        public static com.android.aapt.ResourceTable getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<com.android.aapt.ResourceTable> parser() {
            return PARSER;
        }

        public Parser<com.android.aapt.ResourceTable> getParserForType() {
            return PARSER;
        }

        public com.android.aapt.ResourceTable getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.ResourceTable.Builder> implements com.android.aapt.ResourceTableOrBuilder {
            private int bitField0_;
            private com.android.aapt.StringPool sourcePool_;
            private SingleFieldBuilderV3<com.android.aapt.StringPool, com.android.aapt.StringPool.Builder, com.android.aapt.StringPoolOrBuilder> sourcePoolBuilder_;
            private List<PBPackage> package_;
            private RepeatedFieldBuilderV3<PBPackage, PBPackage.Builder, com.android.aapt.PackageOrBuilder> packageBuilder_;
            private List<com.android.aapt.Overlayable> overlayable_;
            private RepeatedFieldBuilderV3<com.android.aapt.Overlayable, com.android.aapt.Overlayable.Builder, com.android.aapt.OverlayableOrBuilder> overlayableBuilder_;
            private List<com.android.aapt.ToolFingerprint> toolFingerprint_;
            private RepeatedFieldBuilderV3<com.android.aapt.ToolFingerprint, com.android.aapt.ToolFingerprint.Builder, com.android.aapt.ToolFingerprintOrBuilder> toolFingerprintBuilder_;

            public static Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_ResourceTable_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_ResourceTable_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.ResourceTable.class, com.android.aapt.ResourceTable.Builder.class);
            }

            private Builder() {
                this.package_ = Collections.emptyList();
                this.overlayable_ = Collections.emptyList();
                this.toolFingerprint_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.package_ = Collections.emptyList();
                this.overlayable_ = Collections.emptyList();
                this.toolFingerprint_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.android.aapt.ResourceTable.alwaysUseFieldBuilders) {
                    this.getPackageFieldBuilder();
                    this.getOverlayableFieldBuilder();
                    this.getToolFingerprintFieldBuilder();
                }

            }

            public com.android.aapt.ResourceTable.Builder clear() {
                super.clear();
                if (this.sourcePoolBuilder_ == null) {
                    this.sourcePool_ = null;
                } else {
                    this.sourcePool_ = null;
                    this.sourcePoolBuilder_ = null;
                }

                if (this.packageBuilder_ == null) {
                    this.package_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    this.packageBuilder_.clear();
                }

                if (this.overlayableBuilder_ == null) {
                    this.overlayable_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                } else {
                    this.overlayableBuilder_.clear();
                }

                if (this.toolFingerprintBuilder_ == null) {
                    this.toolFingerprint_ = Collections.emptyList();
                    this.bitField0_ &= -5;
                } else {
                    this.toolFingerprintBuilder_.clear();
                }

                return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Resources.internal_static_aapt_pb_ResourceTable_descriptor;
            }

            public com.android.aapt.ResourceTable getDefaultInstanceForType() {
                return com.android.aapt.ResourceTable.getDefaultInstance();
            }

            public com.android.aapt.ResourceTable build() {
                com.android.aapt.ResourceTable result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public com.android.aapt.ResourceTable buildPartial() {
                com.android.aapt.ResourceTable result = new com.android.aapt.ResourceTable(this);
                int from_bitField0_ = this.bitField0_;
                if (this.sourcePoolBuilder_ == null) {
                    result.sourcePool_ = this.sourcePool_;
                } else {
                    result.sourcePool_ = (com.android.aapt.StringPool)this.sourcePoolBuilder_.build();
                }

                if (this.packageBuilder_ == null) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.package_ = Collections.unmodifiableList(this.package_);
                        this.bitField0_ &= -2;
                    }

                    result.package_ = this.package_;
                } else {
                    result.package_ = this.packageBuilder_.build();
                }

                if (this.overlayableBuilder_ == null) {
                    if ((this.bitField0_ & 2) != 0) {
                        this.overlayable_ = Collections.unmodifiableList(this.overlayable_);
                        this.bitField0_ &= -3;
                    }

                    result.overlayable_ = this.overlayable_;
                } else {
                    result.overlayable_ = this.overlayableBuilder_.build();
                }

                if (this.toolFingerprintBuilder_ == null) {
                    if ((this.bitField0_ & 4) != 0) {
                        this.toolFingerprint_ = Collections.unmodifiableList(this.toolFingerprint_);
                        this.bitField0_ &= -5;
                    }

                    result.toolFingerprint_ = this.toolFingerprint_;
                } else {
                    result.toolFingerprint_ = this.toolFingerprintBuilder_.build();
                }

                this.onBuilt();
                return result;
            }

            public com.android.aapt.ResourceTable.Builder clone() {
                return (com.android.aapt.ResourceTable.Builder)super.clone();
            }

            public com.android.aapt.ResourceTable.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.ResourceTable.Builder)super.setField(field, value);
            }

            public com.android.aapt.ResourceTable.Builder clearField(Descriptors.FieldDescriptor field) {
                return (com.android.aapt.ResourceTable.Builder)super.clearField(field);
            }

            public com.android.aapt.ResourceTable.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (com.android.aapt.ResourceTable.Builder)super.clearOneof(oneof);
            }

            public com.android.aapt.ResourceTable.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (com.android.aapt.ResourceTable.Builder)super.setRepeatedField(field, index, value);
            }

            public com.android.aapt.ResourceTable.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.ResourceTable.Builder)super.addRepeatedField(field, value);
            }

            public com.android.aapt.ResourceTable.Builder mergeFrom(Message other) {
                if (other instanceof com.android.aapt.ResourceTable) {
                    return this.mergeFrom((com.android.aapt.ResourceTable)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public com.android.aapt.ResourceTable.Builder mergeFrom(com.android.aapt.ResourceTable other) {
                if (other == com.android.aapt.ResourceTable.getDefaultInstance()) {
                    return this;
                } else {
                    if (other.hasSourcePool()) {
                        this.mergeSourcePool(other.getSourcePool());
                    }

                    if (this.packageBuilder_ == null) {
                        if (!other.package_.isEmpty()) {
                            if (this.package_.isEmpty()) {
                                this.package_ = other.package_;
                                this.bitField0_ &= -2;
                            } else {
                                this.ensurePackageIsMutable();
                                this.package_.addAll(other.package_);
                            }

                            this.onChanged();
                        }
                    } else if (!other.package_.isEmpty()) {
                        if (this.packageBuilder_.isEmpty()) {
                            this.packageBuilder_.dispose();
                            this.packageBuilder_ = null;
                            this.package_ = other.package_;
                            this.bitField0_ &= -2;
                            this.packageBuilder_ = com.android.aapt.ResourceTable.alwaysUseFieldBuilders ? this.getPackageFieldBuilder() : null;
                        } else {
                            this.packageBuilder_.addAllMessages(other.package_);
                        }
                    }

                    if (this.overlayableBuilder_ == null) {
                        if (!other.overlayable_.isEmpty()) {
                            if (this.overlayable_.isEmpty()) {
                                this.overlayable_ = other.overlayable_;
                                this.bitField0_ &= -3;
                            } else {
                                this.ensureOverlayableIsMutable();
                                this.overlayable_.addAll(other.overlayable_);
                            }

                            this.onChanged();
                        }
                    } else if (!other.overlayable_.isEmpty()) {
                        if (this.overlayableBuilder_.isEmpty()) {
                            this.overlayableBuilder_.dispose();
                            this.overlayableBuilder_ = null;
                            this.overlayable_ = other.overlayable_;
                            this.bitField0_ &= -3;
                            this.overlayableBuilder_ = com.android.aapt.ResourceTable.alwaysUseFieldBuilders ? this.getOverlayableFieldBuilder() : null;
                        } else {
                            this.overlayableBuilder_.addAllMessages(other.overlayable_);
                        }
                    }

                    if (this.toolFingerprintBuilder_ == null) {
                        if (!other.toolFingerprint_.isEmpty()) {
                            if (this.toolFingerprint_.isEmpty()) {
                                this.toolFingerprint_ = other.toolFingerprint_;
                                this.bitField0_ &= -5;
                            } else {
                                this.ensureToolFingerprintIsMutable();
                                this.toolFingerprint_.addAll(other.toolFingerprint_);
                            }

                            this.onChanged();
                        }
                    } else if (!other.toolFingerprint_.isEmpty()) {
                        if (this.toolFingerprintBuilder_.isEmpty()) {
                            this.toolFingerprintBuilder_.dispose();
                            this.toolFingerprintBuilder_ = null;
                            this.toolFingerprint_ = other.toolFingerprint_;
                            this.bitField0_ &= -5;
                            this.toolFingerprintBuilder_ = com.android.aapt.ResourceTable.alwaysUseFieldBuilders ? this.getToolFingerprintFieldBuilder() : null;
                        } else {
                            this.toolFingerprintBuilder_.addAllMessages(other.toolFingerprint_);
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

            public com.android.aapt.ResourceTable.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                com.android.aapt.ResourceTable parsedMessage = null;

                try {
                    parsedMessage = (com.android.aapt.ResourceTable)com.android.aapt.ResourceTable.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (com.android.aapt.ResourceTable)var8.getUnfinishedMessage();
                    throw var8.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }

                }

                return this;
            }

            public boolean hasSourcePool() {
                return this.sourcePoolBuilder_ != null || this.sourcePool_ != null;
            }

            public com.android.aapt.StringPool getSourcePool() {
                if (this.sourcePoolBuilder_ == null) {
                    return this.sourcePool_ == null ? com.android.aapt.StringPool.getDefaultInstance() : this.sourcePool_;
                } else {
                    return (com.android.aapt.StringPool)this.sourcePoolBuilder_.getMessage();
                }
            }

            public com.android.aapt.ResourceTable.Builder setSourcePool(com.android.aapt.StringPool value) {
                if (this.sourcePoolBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.sourcePool_ = value;
                    this.onChanged();
                } else {
                    this.sourcePoolBuilder_.setMessage(value);
                }

                return this;
            }

            public com.android.aapt.ResourceTable.Builder setSourcePool(com.android.aapt.StringPool.Builder builderForValue) {
                if (this.sourcePoolBuilder_ == null) {
                    this.sourcePool_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.sourcePoolBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.ResourceTable.Builder mergeSourcePool(com.android.aapt.StringPool value) {
                if (this.sourcePoolBuilder_ == null) {
                    if (this.sourcePool_ != null) {
                        this.sourcePool_ = com.android.aapt.StringPool.newBuilder(this.sourcePool_).mergeFrom(value).buildPartial();
                    } else {
                        this.sourcePool_ = value;
                    }

                    this.onChanged();
                } else {
                    this.sourcePoolBuilder_.mergeFrom(value);
                }

                return this;
            }

            public com.android.aapt.ResourceTable.Builder clearSourcePool() {
                if (this.sourcePoolBuilder_ == null) {
                    this.sourcePool_ = null;
                    this.onChanged();
                } else {
                    this.sourcePool_ = null;
                    this.sourcePoolBuilder_ = null;
                }

                return this;
            }

            public com.android.aapt.StringPool.Builder getSourcePoolBuilder() {
                this.onChanged();
                return (com.android.aapt.StringPool.Builder)this.getSourcePoolFieldBuilder().getBuilder();
            }

            public com.android.aapt.StringPoolOrBuilder getSourcePoolOrBuilder() {
                if (this.sourcePoolBuilder_ != null) {
                    return (com.android.aapt.StringPoolOrBuilder)this.sourcePoolBuilder_.getMessageOrBuilder();
                } else {
                    return this.sourcePool_ == null ? com.android.aapt.StringPool.getDefaultInstance() : this.sourcePool_;
                }
            }

            private SingleFieldBuilderV3<com.android.aapt.StringPool, com.android.aapt.StringPool.Builder, com.android.aapt.StringPoolOrBuilder> getSourcePoolFieldBuilder() {
                if (this.sourcePoolBuilder_ == null) {
                    this.sourcePoolBuilder_ = new SingleFieldBuilderV3(this.getSourcePool(), this.getParentForChildren(), this.isClean());
                    this.sourcePool_ = null;
                }

                return this.sourcePoolBuilder_;
            }

            private void ensurePackageIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.package_ = new ArrayList(this.package_);
                    this.bitField0_ |= 1;
                }

            }

            public List<PBPackage> getPackageList() {
                return this.packageBuilder_ == null ? Collections.unmodifiableList(this.package_) : this.packageBuilder_.getMessageList();
            }

            public int getPackageCount() {
                return this.packageBuilder_ == null ? this.package_.size() : this.packageBuilder_.getCount();
            }

            public PBPackage getPackage(int index) {
                return this.packageBuilder_ == null ? (PBPackage)this.package_.get(index) : (PBPackage)this.packageBuilder_.getMessage(index);
            }

            public com.android.aapt.ResourceTable.Builder setPackage(int index, PBPackage value) {
                if (this.packageBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensurePackageIsMutable();
                    this.package_.set(index, value);
                    this.onChanged();
                } else {
                    this.packageBuilder_.setMessage(index, value);
                }

                return this;
            }

            public com.android.aapt.ResourceTable.Builder setPackage(int index, PBPackage.Builder builderForValue) {
                if (this.packageBuilder_ == null) {
                    this.ensurePackageIsMutable();
                    this.package_.set(index, builderForValue.build());
                    this.onChanged();
                } else {
                    this.packageBuilder_.setMessage(index, builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.ResourceTable.Builder addPackage(PBPackage value) {
                if (this.packageBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensurePackageIsMutable();
                    this.package_.add(value);
                    this.onChanged();
                } else {
                    this.packageBuilder_.addMessage(value);
                }

                return this;
            }

            public com.android.aapt.ResourceTable.Builder addPackage(int index, PBPackage value) {
                if (this.packageBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensurePackageIsMutable();
                    this.package_.add(index, value);
                    this.onChanged();
                } else {
                    this.packageBuilder_.addMessage(index, value);
                }

                return this;
            }

            public com.android.aapt.ResourceTable.Builder addPackage(PBPackage.Builder builderForValue) {
                if (this.packageBuilder_ == null) {
                    this.ensurePackageIsMutable();
                    this.package_.add(builderForValue.build());
                    this.onChanged();
                } else {
                    this.packageBuilder_.addMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.ResourceTable.Builder addPackage(int index, PBPackage.Builder builderForValue) {
                if (this.packageBuilder_ == null) {
                    this.ensurePackageIsMutable();
                    this.package_.add(index, builderForValue.build());
                    this.onChanged();
                } else {
                    this.packageBuilder_.addMessage(index, builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.ResourceTable.Builder addAllPackage(Iterable<? extends PBPackage> values) {
                if (this.packageBuilder_ == null) {
                    this.ensurePackageIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.package_);
                    this.onChanged();
                } else {
                    this.packageBuilder_.addAllMessages(values);
                }

                return this;
            }

            public com.android.aapt.ResourceTable.Builder clearPackage() {
                if (this.packageBuilder_ == null) {
                    this.package_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    this.onChanged();
                } else {
                    this.packageBuilder_.clear();
                }

                return this;
            }

            public com.android.aapt.ResourceTable.Builder removePackage(int index) {
                if (this.packageBuilder_ == null) {
                    this.ensurePackageIsMutable();
                    this.package_.remove(index);
                    this.onChanged();
                } else {
                    this.packageBuilder_.remove(index);
                }

                return this;
            }

            public PBPackage.Builder getPackageBuilder(int index) {
                return (PBPackage.Builder)this.getPackageFieldBuilder().getBuilder(index);
            }

            public com.android.aapt.PackageOrBuilder getPackageOrBuilder(int index) {
                return this.packageBuilder_ == null ? (com.android.aapt.PackageOrBuilder)this.package_.get(index) : (com.android.aapt.PackageOrBuilder)this.packageBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends com.android.aapt.PackageOrBuilder> getPackageOrBuilderList() {
                return this.packageBuilder_ != null ? this.packageBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.package_);
            }

            public PBPackage.Builder addPackageBuilder() {
                return (PBPackage.Builder)this.getPackageFieldBuilder().addBuilder(PBPackage.getDefaultInstance());
            }

            public PBPackage.Builder addPackageBuilder(int index) {
                return (PBPackage.Builder)this.getPackageFieldBuilder().addBuilder(index, PBPackage.getDefaultInstance());
            }

            public List<PBPackage.Builder> getPackageBuilderList() {
                return this.getPackageFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<PBPackage, PBPackage.Builder, com.android.aapt.PackageOrBuilder> getPackageFieldBuilder() {
                if (this.packageBuilder_ == null) {
                    this.packageBuilder_ = new RepeatedFieldBuilderV3(this.package_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
                    this.package_ = null;
                }

                return this.packageBuilder_;
            }

            private void ensureOverlayableIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.overlayable_ = new ArrayList(this.overlayable_);
                    this.bitField0_ |= 2;
                }

            }

            public List<com.android.aapt.Overlayable> getOverlayableList() {
                return this.overlayableBuilder_ == null ? Collections.unmodifiableList(this.overlayable_) : this.overlayableBuilder_.getMessageList();
            }

            public int getOverlayableCount() {
                return this.overlayableBuilder_ == null ? this.overlayable_.size() : this.overlayableBuilder_.getCount();
            }

            public com.android.aapt.Overlayable getOverlayable(int index) {
                return this.overlayableBuilder_ == null ? (com.android.aapt.Overlayable)this.overlayable_.get(index) : (com.android.aapt.Overlayable)this.overlayableBuilder_.getMessage(index);
            }

            public com.android.aapt.ResourceTable.Builder setOverlayable(int index, com.android.aapt.Overlayable value) {
                if (this.overlayableBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureOverlayableIsMutable();
                    this.overlayable_.set(index, value);
                    this.onChanged();
                } else {
                    this.overlayableBuilder_.setMessage(index, value);
                }

                return this;
            }

            public com.android.aapt.ResourceTable.Builder setOverlayable(int index, com.android.aapt.Overlayable.Builder builderForValue) {
                if (this.overlayableBuilder_ == null) {
                    this.ensureOverlayableIsMutable();
                    this.overlayable_.set(index, builderForValue.build());
                    this.onChanged();
                } else {
                    this.overlayableBuilder_.setMessage(index, builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.ResourceTable.Builder addOverlayable(com.android.aapt.Overlayable value) {
                if (this.overlayableBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureOverlayableIsMutable();
                    this.overlayable_.add(value);
                    this.onChanged();
                } else {
                    this.overlayableBuilder_.addMessage(value);
                }

                return this;
            }

            public com.android.aapt.ResourceTable.Builder addOverlayable(int index, com.android.aapt.Overlayable value) {
                if (this.overlayableBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureOverlayableIsMutable();
                    this.overlayable_.add(index, value);
                    this.onChanged();
                } else {
                    this.overlayableBuilder_.addMessage(index, value);
                }

                return this;
            }

            public com.android.aapt.ResourceTable.Builder addOverlayable(com.android.aapt.Overlayable.Builder builderForValue) {
                if (this.overlayableBuilder_ == null) {
                    this.ensureOverlayableIsMutable();
                    this.overlayable_.add(builderForValue.build());
                    this.onChanged();
                } else {
                    this.overlayableBuilder_.addMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.ResourceTable.Builder addOverlayable(int index, com.android.aapt.Overlayable.Builder builderForValue) {
                if (this.overlayableBuilder_ == null) {
                    this.ensureOverlayableIsMutable();
                    this.overlayable_.add(index, builderForValue.build());
                    this.onChanged();
                } else {
                    this.overlayableBuilder_.addMessage(index, builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.ResourceTable.Builder addAllOverlayable(Iterable<? extends com.android.aapt.Overlayable> values) {
                if (this.overlayableBuilder_ == null) {
                    this.ensureOverlayableIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.overlayable_);
                    this.onChanged();
                } else {
                    this.overlayableBuilder_.addAllMessages(values);
                }

                return this;
            }

            public com.android.aapt.ResourceTable.Builder clearOverlayable() {
                if (this.overlayableBuilder_ == null) {
                    this.overlayable_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                    this.onChanged();
                } else {
                    this.overlayableBuilder_.clear();
                }

                return this;
            }

            public com.android.aapt.ResourceTable.Builder removeOverlayable(int index) {
                if (this.overlayableBuilder_ == null) {
                    this.ensureOverlayableIsMutable();
                    this.overlayable_.remove(index);
                    this.onChanged();
                } else {
                    this.overlayableBuilder_.remove(index);
                }

                return this;
            }

            public com.android.aapt.Overlayable.Builder getOverlayableBuilder(int index) {
                return (com.android.aapt.Overlayable.Builder)this.getOverlayableFieldBuilder().getBuilder(index);
            }

            public com.android.aapt.OverlayableOrBuilder getOverlayableOrBuilder(int index) {
                return this.overlayableBuilder_ == null ? (com.android.aapt.OverlayableOrBuilder)this.overlayable_.get(index) : (com.android.aapt.OverlayableOrBuilder)this.overlayableBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends com.android.aapt.OverlayableOrBuilder> getOverlayableOrBuilderList() {
                return this.overlayableBuilder_ != null ? this.overlayableBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.overlayable_);
            }

            public com.android.aapt.Overlayable.Builder addOverlayableBuilder() {
                return (com.android.aapt.Overlayable.Builder)this.getOverlayableFieldBuilder().addBuilder(com.android.aapt.Overlayable.getDefaultInstance());
            }

            public com.android.aapt.Overlayable.Builder addOverlayableBuilder(int index) {
                return (com.android.aapt.Overlayable.Builder)this.getOverlayableFieldBuilder().addBuilder(index, com.android.aapt.Overlayable.getDefaultInstance());
            }

            public List<com.android.aapt.Overlayable.Builder> getOverlayableBuilderList() {
                return this.getOverlayableFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<com.android.aapt.Overlayable, com.android.aapt.Overlayable.Builder, com.android.aapt.OverlayableOrBuilder> getOverlayableFieldBuilder() {
                if (this.overlayableBuilder_ == null) {
                    this.overlayableBuilder_ = new RepeatedFieldBuilderV3(this.overlayable_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
                    this.overlayable_ = null;
                }

                return this.overlayableBuilder_;
            }

            private void ensureToolFingerprintIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.toolFingerprint_ = new ArrayList(this.toolFingerprint_);
                    this.bitField0_ |= 4;
                }

            }

            public List<com.android.aapt.ToolFingerprint> getToolFingerprintList() {
                return this.toolFingerprintBuilder_ == null ? Collections.unmodifiableList(this.toolFingerprint_) : this.toolFingerprintBuilder_.getMessageList();
            }

            public int getToolFingerprintCount() {
                return this.toolFingerprintBuilder_ == null ? this.toolFingerprint_.size() : this.toolFingerprintBuilder_.getCount();
            }

            public com.android.aapt.ToolFingerprint getToolFingerprint(int index) {
                return this.toolFingerprintBuilder_ == null ? (com.android.aapt.ToolFingerprint)this.toolFingerprint_.get(index) : (com.android.aapt.ToolFingerprint)this.toolFingerprintBuilder_.getMessage(index);
            }

            public com.android.aapt.ResourceTable.Builder setToolFingerprint(int index, com.android.aapt.ToolFingerprint value) {
                if (this.toolFingerprintBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureToolFingerprintIsMutable();
                    this.toolFingerprint_.set(index, value);
                    this.onChanged();
                } else {
                    this.toolFingerprintBuilder_.setMessage(index, value);
                }

                return this;
            }

            public com.android.aapt.ResourceTable.Builder setToolFingerprint(int index, com.android.aapt.ToolFingerprint.Builder builderForValue) {
                if (this.toolFingerprintBuilder_ == null) {
                    this.ensureToolFingerprintIsMutable();
                    this.toolFingerprint_.set(index, builderForValue.build());
                    this.onChanged();
                } else {
                    this.toolFingerprintBuilder_.setMessage(index, builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.ResourceTable.Builder addToolFingerprint(com.android.aapt.ToolFingerprint value) {
                if (this.toolFingerprintBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureToolFingerprintIsMutable();
                    this.toolFingerprint_.add(value);
                    this.onChanged();
                } else {
                    this.toolFingerprintBuilder_.addMessage(value);
                }

                return this;
            }

            public com.android.aapt.ResourceTable.Builder addToolFingerprint(int index, com.android.aapt.ToolFingerprint value) {
                if (this.toolFingerprintBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureToolFingerprintIsMutable();
                    this.toolFingerprint_.add(index, value);
                    this.onChanged();
                } else {
                    this.toolFingerprintBuilder_.addMessage(index, value);
                }

                return this;
            }

            public com.android.aapt.ResourceTable.Builder addToolFingerprint(com.android.aapt.ToolFingerprint.Builder builderForValue) {
                if (this.toolFingerprintBuilder_ == null) {
                    this.ensureToolFingerprintIsMutable();
                    this.toolFingerprint_.add(builderForValue.build());
                    this.onChanged();
                } else {
                    this.toolFingerprintBuilder_.addMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.ResourceTable.Builder addToolFingerprint(int index, com.android.aapt.ToolFingerprint.Builder builderForValue) {
                if (this.toolFingerprintBuilder_ == null) {
                    this.ensureToolFingerprintIsMutable();
                    this.toolFingerprint_.add(index, builderForValue.build());
                    this.onChanged();
                } else {
                    this.toolFingerprintBuilder_.addMessage(index, builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.ResourceTable.Builder addAllToolFingerprint(Iterable<? extends com.android.aapt.ToolFingerprint> values) {
                if (this.toolFingerprintBuilder_ == null) {
                    this.ensureToolFingerprintIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.toolFingerprint_);
                    this.onChanged();
                } else {
                    this.toolFingerprintBuilder_.addAllMessages(values);
                }

                return this;
            }

            public com.android.aapt.ResourceTable.Builder clearToolFingerprint() {
                if (this.toolFingerprintBuilder_ == null) {
                    this.toolFingerprint_ = Collections.emptyList();
                    this.bitField0_ &= -5;
                    this.onChanged();
                } else {
                    this.toolFingerprintBuilder_.clear();
                }

                return this;
            }

            public com.android.aapt.ResourceTable.Builder removeToolFingerprint(int index) {
                if (this.toolFingerprintBuilder_ == null) {
                    this.ensureToolFingerprintIsMutable();
                    this.toolFingerprint_.remove(index);
                    this.onChanged();
                } else {
                    this.toolFingerprintBuilder_.remove(index);
                }

                return this;
            }

            public com.android.aapt.ToolFingerprint.Builder getToolFingerprintBuilder(int index) {
                return (com.android.aapt.ToolFingerprint.Builder)this.getToolFingerprintFieldBuilder().getBuilder(index);
            }

            public com.android.aapt.ToolFingerprintOrBuilder getToolFingerprintOrBuilder(int index) {
                return this.toolFingerprintBuilder_ == null ? (com.android.aapt.ToolFingerprintOrBuilder)this.toolFingerprint_.get(index) : (com.android.aapt.ToolFingerprintOrBuilder)this.toolFingerprintBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends com.android.aapt.ToolFingerprintOrBuilder> getToolFingerprintOrBuilderList() {
                return this.toolFingerprintBuilder_ != null ? this.toolFingerprintBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.toolFingerprint_);
            }

            public com.android.aapt.ToolFingerprint.Builder addToolFingerprintBuilder() {
                return (com.android.aapt.ToolFingerprint.Builder)this.getToolFingerprintFieldBuilder().addBuilder(com.android.aapt.ToolFingerprint.getDefaultInstance());
            }

            public com.android.aapt.ToolFingerprint.Builder addToolFingerprintBuilder(int index) {
                return (com.android.aapt.ToolFingerprint.Builder)this.getToolFingerprintFieldBuilder().addBuilder(index, com.android.aapt.ToolFingerprint.getDefaultInstance());
            }

            public List<com.android.aapt.ToolFingerprint.Builder> getToolFingerprintBuilderList() {
                return this.getToolFingerprintFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<com.android.aapt.ToolFingerprint, com.android.aapt.ToolFingerprint.Builder, com.android.aapt.ToolFingerprintOrBuilder> getToolFingerprintFieldBuilder() {
                if (this.toolFingerprintBuilder_ == null) {
                    this.toolFingerprintBuilder_ = new RepeatedFieldBuilderV3(this.toolFingerprint_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
                    this.toolFingerprint_ = null;
                }

                return this.toolFingerprintBuilder_;
            }

            public final com.android.aapt.ResourceTable.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.ResourceTable.Builder)super.setUnknownFields(unknownFields);
            }

            public final com.android.aapt.ResourceTable.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.ResourceTable.Builder)super.mergeUnknownFields(unknownFields);
            }
        }
    }