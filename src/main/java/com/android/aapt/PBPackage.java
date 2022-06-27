package com.android.aapt;

import com.google.protobuf.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PBPackage extends GeneratedMessageV3 implements com.android.aapt.PackageOrBuilder {
    private static final long serialVersionUID = 0L;
    public static final int PACKAGE_ID_FIELD_NUMBER = 1;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 3;
    private com.android.aapt.PackageId packageId_;
    private volatile Object packageName_;
    private List<PBType> type_;
    private byte memoizedIsInitialized;
    private static final PBPackage DEFAULT_INSTANCE = new PBPackage();
    private static final Parser<PBPackage> PARSER = new AbstractParser<PBPackage>() {
        @Override
        public PBPackage parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new PBPackage(input, extensionRegistry);
        }
    };

    private PBPackage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private PBPackage() {
        this.memoizedIsInitialized = -1;
        this.packageName_ = "";
        this.type_ = Collections.emptyList();
    }

    @Override
    public Object newInstance(UnusedPrivateParameter unused) {
        return new PBPackage();
    }

    @Override
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private PBPackage(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            com.android.aapt.PackageId.Builder subBuilder = null;
                            if (this.packageId_ != null) {
                                subBuilder = this.packageId_.toBuilder();
                            }

                            this.packageId_ = (com.android.aapt.PackageId)input.readMessage(com.android.aapt.PackageId.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.packageId_);
                                this.packageId_ = subBuilder.buildPartial();
                            }
                            break;
                        case 18:
                            java.lang.String s = input.readStringRequireUtf8();
                            this.packageName_ = s;
                            break;
                        case 26:
                            if (!(mutable_bitField0_)) {
                                this.type_ = new ArrayList();
                                mutable_bitField0_ = true;
                            }

                            this.type_.add((PBType)input.readMessage(PBType.parser(), extensionRegistry));
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
                    this.type_ = Collections.unmodifiableList(this.type_);
                }

                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }

        }
    }

    public static Descriptors.Descriptor getDescriptor() {
        return Resources.internal_static_aapt_pb_Package_descriptor;
    }

    public FieldAccessorTable internalGetFieldAccessorTable() {
        return Resources.internal_static_aapt_pb_Package_fieldAccessorTable.ensureFieldAccessorsInitialized(PBPackage.class, PBPackage.Builder.class);
    }

    public boolean hasPackageId() {
        return this.packageId_ != null;
    }

    public com.android.aapt.PackageId getPackageId() {
        return this.packageId_ == null ? com.android.aapt.PackageId.getDefaultInstance() : this.packageId_;
    }

    public com.android.aapt.PackageIdOrBuilder getPackageIdOrBuilder() {
        return this.getPackageId();
    }

    public java.lang.String getPackageName() {
        Object ref = this.packageName_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String)ref;
        } else {
            ByteString bs = (ByteString)ref;
            java.lang.String s = bs.toStringUtf8();
            this.packageName_ = s;
            return s;
        }
    }

    public ByteString getPackageNameBytes() {
        Object ref = this.packageName_;
        if (ref instanceof java.lang.String) {
            ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
            this.packageName_ = b;
            return b;
        } else {
            return (ByteString)ref;
        }
    }

    public List<PBType> getTypeList() {
        return this.type_;
    }

    public List<? extends com.android.aapt.TypeOrBuilder> getTypeOrBuilderList() {
        return this.type_;
    }

    public int getTypeCount() {
        return this.type_.size();
    }

    public PBType getType(int index) {
        return (PBType)this.type_.get(index);
    }

    public com.android.aapt.TypeOrBuilder getTypeOrBuilder(int index) {
        return (com.android.aapt.TypeOrBuilder)this.type_.get(index);
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
        if (this.packageId_ != null) {
            output.writeMessage(PACKAGE_ID_FIELD_NUMBER, this.getPackageId());
        }

        if (!this.getPackageNameBytes().isEmpty()) {
            GeneratedMessageV3.writeString(output, PACKAGE_NAME_FIELD_NUMBER, this.packageName_);
        }

        for(int i = 0; i < this.type_.size(); ++i) {
            output.writeMessage(TYPE_FIELD_NUMBER, (MessageLite)this.type_.get(i));
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
            if (this.packageId_ != null) {
                size += CodedOutputStream.computeMessageSize(PACKAGE_ID_FIELD_NUMBER, this.getPackageId());
            }

            if (!this.getPackageNameBytes().isEmpty()) {
                size += GeneratedMessageV3.computeStringSize(PACKAGE_NAME_FIELD_NUMBER, this.packageName_);
            }

            for(int i = 0; i < this.type_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(TYPE_FIELD_NUMBER, (MessageLite)this.type_.get(i));
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
        } else if (!(obj instanceof PBPackage)) {
            return super.equals(obj);
        } else {
            PBPackage other = (PBPackage)obj;
            if (this.hasPackageId() != other.hasPackageId()) {
                return false;
            } else if (this.hasPackageId() && !this.getPackageId().equals(other.getPackageId())) {
                return false;
            } else if (!this.getPackageName().equals(other.getPackageName())) {
                return false;
            } else if (!this.getTypeList().equals(other.getTypeList())) {
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
            if (this.hasPackageId()) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getPackageId().hashCode();
            }

            hash = 37 * hash + 2;
            hash = 53 * hash + this.getPackageName().hashCode();
            if (this.getTypeCount() > 0) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getTypeList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
        }
    }

    public static PBPackage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (PBPackage)PARSER.parseFrom(data);
    }

    public static PBPackage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (PBPackage)PARSER.parseFrom(data, extensionRegistry);
    }

    public static PBPackage parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (PBPackage)PARSER.parseFrom(data);
    }

    public static PBPackage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (PBPackage)PARSER.parseFrom(data, extensionRegistry);
    }

    public static PBPackage parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (PBPackage)PARSER.parseFrom(data);
    }

    public static PBPackage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (PBPackage)PARSER.parseFrom(data, extensionRegistry);
    }

    public static PBPackage parseFrom(InputStream input) throws IOException {
        return (PBPackage)GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static PBPackage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (PBPackage)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static PBPackage parseDelimitedFrom(InputStream input) throws IOException {
        return (PBPackage)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static PBPackage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (PBPackage)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static PBPackage parseFrom(CodedInputStream input) throws IOException {
        return (PBPackage)GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static PBPackage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (PBPackage)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public PBPackage.Builder newBuilderForType() {
        return newBuilder();
    }

    public static PBPackage.Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static PBPackage.Builder newBuilder(PBPackage prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public PBPackage.Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new PBPackage.Builder() : (new PBPackage.Builder()).mergeFrom(this);
    }

    public PBPackage.Builder newBuilderForType(BuilderParent parent) {
        PBPackage.Builder builder = new PBPackage.Builder(parent);
        return builder;
    }

    public static PBPackage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<PBPackage> parser() {
        return PARSER;
    }

    public Parser<PBPackage> getParserForType() {
        return PARSER;
    }

    public PBPackage getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<PBPackage.Builder> implements com.android.aapt.PackageOrBuilder {
        private int bitField0_;
        private com.android.aapt.PackageId packageId_;
        private SingleFieldBuilderV3<com.android.aapt.PackageId, com.android.aapt.PackageId.Builder, com.android.aapt.PackageIdOrBuilder> packageIdBuilder_;
        private Object packageName_;
        private List<PBType> type_;
        private RepeatedFieldBuilderV3<PBType, PBType.Builder, com.android.aapt.TypeOrBuilder> typeBuilder_;

        public static Descriptors.Descriptor getDescriptor() {
            return Resources.internal_static_aapt_pb_Package_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_Package_fieldAccessorTable.ensureFieldAccessorsInitialized(PBPackage.class, PBPackage.Builder.class);
        }

        private Builder() {
            this.packageName_ = "";
            this.type_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
        }

        private Builder(BuilderParent parent) {
            super(parent);
            this.packageName_ = "";
            this.type_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (PBPackage.alwaysUseFieldBuilders) {
                this.getTypeFieldBuilder();
            }

        }

        public PBPackage.Builder clear() {
            super.clear();
            if (this.packageIdBuilder_ == null) {
                this.packageId_ = null;
            } else {
                this.packageId_ = null;
                this.packageIdBuilder_ = null;
            }

            this.packageName_ = "";
            if (this.typeBuilder_ == null) {
                this.type_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                this.typeBuilder_.clear();
            }

            return this;
        }

        @Override
        public Descriptors.Descriptor getDescriptorForType() {
            return Resources.internal_static_aapt_pb_Package_descriptor;
        }

        public PBPackage getDefaultInstanceForType() {
            return PBPackage.getDefaultInstance();
        }

        public PBPackage build() {
            PBPackage result = this.buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            } else {
                return result;
            }
        }

        public PBPackage buildPartial() {
            PBPackage result = new PBPackage(this);
            int from_bitField0_ = this.bitField0_;
            if (this.packageIdBuilder_ == null) {
                result.packageId_ = this.packageId_;
            } else {
                result.packageId_ = (com.android.aapt.PackageId)this.packageIdBuilder_.build();
            }

            result.packageName_ = this.packageName_;
            if (this.typeBuilder_ == null) {
                if ((this.bitField0_ & 1) != 0) {
                    this.type_ = Collections.unmodifiableList(this.type_);
                    this.bitField0_ &= -2;
                }

                result.type_ = this.type_;
            } else {
                result.type_ = this.typeBuilder_.build();
            }

            this.onBuilt();
            return result;
        }

        public PBPackage.Builder clone() {
            return (PBPackage.Builder)super.clone();
        }

        public PBPackage.Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (PBPackage.Builder)super.setField(field, value);
        }

        public PBPackage.Builder clearField(Descriptors.FieldDescriptor field) {
            return (PBPackage.Builder)super.clearField(field);
        }

        public PBPackage.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (PBPackage.Builder)super.clearOneof(oneof);
        }

        public PBPackage.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (PBPackage.Builder)super.setRepeatedField(field, index, value);
        }

        public PBPackage.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (PBPackage.Builder)super.addRepeatedField(field, value);
        }

        public PBPackage.Builder mergeFrom(Message other) {
            if (other instanceof PBPackage) {
                return this.mergeFrom((PBPackage)other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public PBPackage.Builder mergeFrom(PBPackage other) {
            if (other == PBPackage.getDefaultInstance()) {
                return this;
            } else {
                if (other.hasPackageId()) {
                    this.mergePackageId(other.getPackageId());
                }

                if (!other.getPackageName().isEmpty()) {
                    this.packageName_ = other.packageName_;
                    this.onChanged();
                }

                if (this.typeBuilder_ == null) {
                    if (!other.type_.isEmpty()) {
                        if (this.type_.isEmpty()) {
                            this.type_ = other.type_;
                            this.bitField0_ &= -2;
                        } else {
                            this.ensureTypeIsMutable();
                            this.type_.addAll(other.type_);
                        }

                        this.onChanged();
                    }
                } else if (!other.type_.isEmpty()) {
                    if (this.typeBuilder_.isEmpty()) {
                        this.typeBuilder_.dispose();
                        this.typeBuilder_ = null;
                        this.type_ = other.type_;
                        this.bitField0_ &= -2;
                        this.typeBuilder_ = PBPackage.alwaysUseFieldBuilders ? this.getTypeFieldBuilder() : null;
                    } else {
                        this.typeBuilder_.addAllMessages(other.type_);
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

        public PBPackage.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            PBPackage parsedMessage = null;

            try {
                parsedMessage = (PBPackage) PBPackage.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException var8) {
                parsedMessage = (PBPackage)var8.getUnfinishedMessage();
                throw var8.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    this.mergeFrom(parsedMessage);
                }

            }

            return this;
        }

        public boolean hasPackageId() {
            return this.packageIdBuilder_ != null || this.packageId_ != null;
        }

        public com.android.aapt.PackageId getPackageId() {
            if (this.packageIdBuilder_ == null) {
                return this.packageId_ == null ? com.android.aapt.PackageId.getDefaultInstance() : this.packageId_;
            } else {
                return (com.android.aapt.PackageId)this.packageIdBuilder_.getMessage();
            }
        }

        public PBPackage.Builder setPackageId(com.android.aapt.PackageId value) {
            if (this.packageIdBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }

                this.packageId_ = value;
                this.onChanged();
            } else {
                this.packageIdBuilder_.setMessage(value);
            }

            return this;
        }

        public PBPackage.Builder setPackageId(com.android.aapt.PackageId.Builder builderForValue) {
            if (this.packageIdBuilder_ == null) {
                this.packageId_ = builderForValue.build();
                this.onChanged();
            } else {
                this.packageIdBuilder_.setMessage(builderForValue.build());
            }

            return this;
        }

        public PBPackage.Builder mergePackageId(com.android.aapt.PackageId value) {
            if (this.packageIdBuilder_ == null) {
                if (this.packageId_ != null) {
                    this.packageId_ = com.android.aapt.PackageId.newBuilder(this.packageId_).mergeFrom(value).buildPartial();
                } else {
                    this.packageId_ = value;
                }

                this.onChanged();
            } else {
                this.packageIdBuilder_.mergeFrom(value);
            }

            return this;
        }

        public PBPackage.Builder clearPackageId() {
            if (this.packageIdBuilder_ == null) {
                this.packageId_ = null;
                this.onChanged();
            } else {
                this.packageId_ = null;
                this.packageIdBuilder_ = null;
            }

            return this;
        }

        public com.android.aapt.PackageId.Builder getPackageIdBuilder() {
            this.onChanged();
            return (com.android.aapt.PackageId.Builder)this.getPackageIdFieldBuilder().getBuilder();
        }

        public com.android.aapt.PackageIdOrBuilder getPackageIdOrBuilder() {
            if (this.packageIdBuilder_ != null) {
                return (com.android.aapt.PackageIdOrBuilder)this.packageIdBuilder_.getMessageOrBuilder();
            } else {
                return this.packageId_ == null ? com.android.aapt.PackageId.getDefaultInstance() : this.packageId_;
            }
        }

        private SingleFieldBuilderV3<com.android.aapt.PackageId, com.android.aapt.PackageId.Builder, com.android.aapt.PackageIdOrBuilder> getPackageIdFieldBuilder() {
            if (this.packageIdBuilder_ == null) {
                this.packageIdBuilder_ = new SingleFieldBuilderV3(this.getPackageId(), this.getParentForChildren(), this.isClean());
                this.packageId_ = null;
            }

            return this.packageIdBuilder_;
        }

        public java.lang.String getPackageName() {
            Object ref = this.packageName_;
            if (!(ref instanceof java.lang.String)) {
                ByteString bs = (ByteString)ref;
                java.lang.String s = bs.toStringUtf8();
                this.packageName_ = s;
                return s;
            } else {
                return (java.lang.String)ref;
            }
        }

        public ByteString getPackageNameBytes() {
            Object ref = this.packageName_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                this.packageName_ = b;
                return b;
            } else {
                return (ByteString)ref;
            }
        }

        public PBPackage.Builder setPackageName(java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            } else {
                this.packageName_ = value;
                this.onChanged();
                return this;
            }
        }

        public PBPackage.Builder clearPackageName() {
            this.packageName_ = PBPackage.getDefaultInstance().getPackageName();
            this.onChanged();
            return this;
        }

        public PBPackage.Builder setPackageNameBytes(ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            } else {
                PBPackage.checkByteStringIsUtf8(value);
                this.packageName_ = value;
                this.onChanged();
                return this;
            }
        }

        private void ensureTypeIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.type_ = new ArrayList(this.type_);
                this.bitField0_ |= 1;
            }

        }

        public List<PBType> getTypeList() {
            return this.typeBuilder_ == null ? Collections.unmodifiableList(this.type_) : this.typeBuilder_.getMessageList();
        }

        public int getTypeCount() {
            return this.typeBuilder_ == null ? this.type_.size() : this.typeBuilder_.getCount();
        }

        public PBType getType(int index) {
            return this.typeBuilder_ == null ? (PBType)this.type_.get(index) : (PBType)this.typeBuilder_.getMessage(index);
        }

        public PBPackage.Builder setType(int index, PBType value) {
            if (this.typeBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }

                this.ensureTypeIsMutable();
                this.type_.set(index, value);
                this.onChanged();
            } else {
                this.typeBuilder_.setMessage(index, value);
            }

            return this;
        }

        public PBPackage.Builder setType(int index, PBType.Builder builderForValue) {
            if (this.typeBuilder_ == null) {
                this.ensureTypeIsMutable();
                this.type_.set(index, builderForValue.build());
                this.onChanged();
            } else {
                this.typeBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
        }

        public PBPackage.Builder addType(PBType value) {
            if (this.typeBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }

                this.ensureTypeIsMutable();
                this.type_.add(value);
                this.onChanged();
            } else {
                this.typeBuilder_.addMessage(value);
            }

            return this;
        }

        public PBPackage.Builder addType(int index, PBType value) {
            if (this.typeBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }

                this.ensureTypeIsMutable();
                this.type_.add(index, value);
                this.onChanged();
            } else {
                this.typeBuilder_.addMessage(index, value);
            }

            return this;
        }

        public PBPackage.Builder addType(PBType.Builder builderForValue) {
            if (this.typeBuilder_ == null) {
                this.ensureTypeIsMutable();
                this.type_.add(builderForValue.build());
                this.onChanged();
            } else {
                this.typeBuilder_.addMessage(builderForValue.build());
            }

            return this;
        }

        public PBPackage.Builder addType(int index, PBType.Builder builderForValue) {
            if (this.typeBuilder_ == null) {
                this.ensureTypeIsMutable();
                this.type_.add(index, builderForValue.build());
                this.onChanged();
            } else {
                this.typeBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
        }

        public PBPackage.Builder addAllType(Iterable<? extends PBType> values) {
            if (this.typeBuilder_ == null) {
                this.ensureTypeIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.type_);
                this.onChanged();
            } else {
                this.typeBuilder_.addAllMessages(values);
            }

            return this;
        }

        public PBPackage.Builder clearType() {
            if (this.typeBuilder_ == null) {
                this.type_ = Collections.emptyList();
                this.bitField0_ &= -2;
                this.onChanged();
            } else {
                this.typeBuilder_.clear();
            }

            return this;
        }

        public PBPackage.Builder removeType(int index) {
            if (this.typeBuilder_ == null) {
                this.ensureTypeIsMutable();
                this.type_.remove(index);
                this.onChanged();
            } else {
                this.typeBuilder_.remove(index);
            }

            return this;
        }

        public PBType.Builder getTypeBuilder(int index) {
            return (PBType.Builder)this.getTypeFieldBuilder().getBuilder(index);
        }

        public com.android.aapt.TypeOrBuilder getTypeOrBuilder(int index) {
            return this.typeBuilder_ == null ? (com.android.aapt.TypeOrBuilder)this.type_.get(index) : (com.android.aapt.TypeOrBuilder)this.typeBuilder_.getMessageOrBuilder(index);
        }

        public List<? extends com.android.aapt.TypeOrBuilder> getTypeOrBuilderList() {
            return this.typeBuilder_ != null ? this.typeBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.type_);
        }

        public PBType.Builder addTypeBuilder() {
            return (PBType.Builder)this.getTypeFieldBuilder().addBuilder(PBType.getDefaultInstance());
        }

        public PBType.Builder addTypeBuilder(int index) {
            return (PBType.Builder)this.getTypeFieldBuilder().addBuilder(index, PBType.getDefaultInstance());
        }

        public List<PBType.Builder> getTypeBuilderList() {
            return this.getTypeFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<PBType, PBType.Builder, com.android.aapt.TypeOrBuilder> getTypeFieldBuilder() {
            if (this.typeBuilder_ == null) {
                this.typeBuilder_ = new RepeatedFieldBuilderV3(this.type_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
                this.type_ = null;
            }

            return this.typeBuilder_;
        }

        public final PBPackage.Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (PBPackage.Builder)super.setUnknownFields(unknownFields);
        }

        public final PBPackage.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (PBPackage.Builder)super.mergeUnknownFields(unknownFields);
        }
    }
}