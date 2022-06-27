package com.android.aapt;

import com.google.protobuf.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class Reference extends GeneratedMessageV3 implements com.android.aapt.ReferenceOrBuilder {
        private static final long serialVersionUID = 0L;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int type_;
        public static final int ID_FIELD_NUMBER = 2;
        private int id_;
        public static final int NAME_FIELD_NUMBER = 3;
        private volatile Object name_;
        public static final int PRIVATE_FIELD_NUMBER = 4;
        private boolean private_;
        public static final int IS_DYNAMIC_FIELD_NUMBER = 5;
        private PBBoolean isDynamic_;
        public static final int TYPE_FLAGS_FIELD_NUMBER = 6;
        private int typeFlags_;
        public static final int ALLOW_RAW_FIELD_NUMBER = 7;
        private boolean allowRaw_;
        private byte memoizedIsInitialized;
        private static final com.android.aapt.Reference DEFAULT_INSTANCE = new com.android.aapt.Reference();
        private static final Parser<com.android.aapt.Reference> PARSER = new AbstractParser<com.android.aapt.Reference>() {
            public com.android.aapt.Reference parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new com.android.aapt.Reference(input, extensionRegistry);
            }
        };

        private Reference(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private Reference() {
            this.memoizedIsInitialized = -1;
            this.type_ = 0;
            this.name_ = "";
        }

        @Override
        public Object newInstance(UnusedPrivateParameter unused) {
            return new com.android.aapt.Reference();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Reference(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            case 8:
                                int rawValue = input.readEnum();
                                this.type_ = rawValue;
                                break;
                            case 16:
                                this.id_ = input.readUInt32();
                                break;
                            case 26:
                                java.lang.String s = input.readStringRequireUtf8();
                                this.name_ = s;
                                break;
                            case 32:
                                this.private_ = input.readBool();
                                break;
                            case 42:
                                PBBoolean.Builder subBuilder = null;
                                if (this.isDynamic_ != null) {
                                    subBuilder = this.isDynamic_.toBuilder();
                                }

                                this.isDynamic_ = (PBBoolean)input.readMessage(PBBoolean.parser(), extensionRegistry);
                                if (subBuilder != null) {
                                    subBuilder.mergeFrom(this.isDynamic_);
                                    this.isDynamic_ = subBuilder.buildPartial();
                                }
                                break;
                            case 48:
                                this.typeFlags_ = input.readUInt32();
                                break;
                            case 56:
                                this.allowRaw_ = input.readBool();
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
            return Resources.internal_static_aapt_pb_Reference_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_Reference_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.Reference.class, com.android.aapt.Reference.Builder.class);
        }

        public int getTypeValue() {
            return this.type_;
        }

        public com.android.aapt.Reference.Type getType() {
            com.android.aapt.Reference.Type result = com.android.aapt.Reference.Type.valueOf(this.type_);
            return result == null ? com.android.aapt.Reference.Type.UNRECOGNIZED : result;
        }

        public int getId() {
            return this.id_;
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

        public boolean getPrivate() {
            return this.private_;
        }

        public boolean hasIsDynamic() {
            return this.isDynamic_ != null;
        }

        public PBBoolean getIsDynamic() {
            return this.isDynamic_ == null ? PBBoolean.getDefaultInstance() : this.isDynamic_;
        }

        public com.android.aapt.BooleanOrBuilder getIsDynamicOrBuilder() {
            return this.getIsDynamic();
        }

        public int getTypeFlags() {
            return this.typeFlags_;
        }

        public boolean getAllowRaw() {
            return this.allowRaw_;
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
            if (this.type_ != com.android.aapt.Reference.Type.REFERENCE.getNumber()) {
                output.writeEnum(1, this.type_);
            }

            if (this.id_ != 0) {
                output.writeUInt32(2, this.id_);
            }

            if (!this.getNameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 3, this.name_);
            }

            if (this.private_) {
                output.writeBool(4, this.private_);
            }

            if (this.isDynamic_ != null) {
                output.writeMessage(5, this.getIsDynamic());
            }

            if (this.typeFlags_ != 0) {
                output.writeUInt32(6, this.typeFlags_);
            }

            if (this.allowRaw_) {
                output.writeBool(7, this.allowRaw_);
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
                if (this.type_ != com.android.aapt.Reference.Type.REFERENCE.getNumber()) {
                    size += CodedOutputStream.computeEnumSize(1, this.type_);
                }

                if (this.id_ != 0) {
                    size += CodedOutputStream.computeUInt32Size(2, this.id_);
                }

                if (!this.getNameBytes().isEmpty()) {
                    size += GeneratedMessageV3.computeStringSize(3, this.name_);
                }

                if (this.private_) {
                    size += CodedOutputStream.computeBoolSize(4, this.private_);
                }

                if (this.isDynamic_ != null) {
                    size += CodedOutputStream.computeMessageSize(5, this.getIsDynamic());
                }

                if (this.typeFlags_ != 0) {
                    size += CodedOutputStream.computeUInt32Size(6, this.typeFlags_);
                }

                if (this.allowRaw_) {
                    size += CodedOutputStream.computeBoolSize(7, this.allowRaw_);
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
            } else if (!(obj instanceof com.android.aapt.Reference)) {
                return super.equals(obj);
            } else {
                com.android.aapt.Reference other = (com.android.aapt.Reference)obj;
                if (this.type_ != other.type_) {
                    return false;
                } else if (this.getId() != other.getId()) {
                    return false;
                } else if (!this.getName().equals(other.getName())) {
                    return false;
                } else if (this.getPrivate() != other.getPrivate()) {
                    return false;
                } else if (this.hasIsDynamic() != other.hasIsDynamic()) {
                    return false;
                } else if (this.hasIsDynamic() && !this.getIsDynamic().equals(other.getIsDynamic())) {
                    return false;
                } else if (this.getTypeFlags() != other.getTypeFlags()) {
                    return false;
                } else if (this.getAllowRaw() != other.getAllowRaw()) {
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
                hash = 53 * hash + this.type_;
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getId();
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getName().hashCode();
                hash = 37 * hash + 4;
                hash = 53 * hash + Internal.hashBoolean(this.getPrivate());
                if (this.hasIsDynamic()) {
                    hash = 37 * hash + 5;
                    hash = 53 * hash + this.getIsDynamic().hashCode();
                }

                hash = 37 * hash + 6;
                hash = 53 * hash + this.getTypeFlags();
                hash = 37 * hash + 7;
                hash = 53 * hash + Internal.hashBoolean(this.getAllowRaw());
                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static com.android.aapt.Reference parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Reference)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Reference parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Reference)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Reference parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Reference)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Reference parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Reference)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Reference parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Reference)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Reference parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Reference)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Reference parseFrom(InputStream input) throws IOException {
            return (com.android.aapt.Reference)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.Reference parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Reference)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.Reference parseDelimitedFrom(InputStream input) throws IOException {
            return (com.android.aapt.Reference)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static com.android.aapt.Reference parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Reference)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.Reference parseFrom(CodedInputStream input) throws IOException {
            return (com.android.aapt.Reference)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.Reference parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Reference)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public com.android.aapt.Reference.Builder newBuilderForType() {
            return newBuilder();
        }

        public static com.android.aapt.Reference.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static com.android.aapt.Reference.Builder newBuilder(com.android.aapt.Reference prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public com.android.aapt.Reference.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new com.android.aapt.Reference.Builder() : (new com.android.aapt.Reference.Builder()).mergeFrom(this);
        }

        public com.android.aapt.Reference.Builder newBuilderForType(BuilderParent parent) {
            com.android.aapt.Reference.Builder builder = new com.android.aapt.Reference.Builder(parent);
            return builder;
        }

        public static com.android.aapt.Reference getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<com.android.aapt.Reference> parser() {
            return PARSER;
        }

        public Parser<com.android.aapt.Reference> getParserForType() {
            return PARSER;
        }

        public com.android.aapt.Reference getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.Reference.Builder> implements com.android.aapt.ReferenceOrBuilder {
            private int type_;
            private int id_;
            private Object name_;
            private boolean private_;
            private PBBoolean isDynamic_;
            private SingleFieldBuilderV3<PBBoolean, PBBoolean.Builder, com.android.aapt.BooleanOrBuilder> isDynamicBuilder_;
            private int typeFlags_;
            private boolean allowRaw_;

            public static Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_Reference_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_Reference_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.Reference.class, com.android.aapt.Reference.Builder.class);
            }

            private Builder() {
                this.type_ = 0;
                this.name_ = "";
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.type_ = 0;
                this.name_ = "";
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.android.aapt.Reference.alwaysUseFieldBuilders) {
                }

            }

            public com.android.aapt.Reference.Builder clear() {
                super.clear();
                this.type_ = 0;
                this.id_ = 0;
                this.name_ = "";
                this.private_ = false;
                if (this.isDynamicBuilder_ == null) {
                    this.isDynamic_ = null;
                } else {
                    this.isDynamic_ = null;
                    this.isDynamicBuilder_ = null;
                }

                this.typeFlags_ = 0;
                this.allowRaw_ = false;
                return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Resources.internal_static_aapt_pb_Reference_descriptor;
            }

            public com.android.aapt.Reference getDefaultInstanceForType() {
                return com.android.aapt.Reference.getDefaultInstance();
            }

            public com.android.aapt.Reference build() {
                com.android.aapt.Reference result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public com.android.aapt.Reference buildPartial() {
                com.android.aapt.Reference result = new com.android.aapt.Reference(this);
                result.type_ = this.type_;
                result.id_ = this.id_;
                result.name_ = this.name_;
                result.private_ = this.private_;
                if (this.isDynamicBuilder_ == null) {
                    result.isDynamic_ = this.isDynamic_;
                } else {
                    result.isDynamic_ = (PBBoolean)this.isDynamicBuilder_.build();
                }

                result.typeFlags_ = this.typeFlags_;
                result.allowRaw_ = this.allowRaw_;
                this.onBuilt();
                return result;
            }

            public com.android.aapt.Reference.Builder clone() {
                return (com.android.aapt.Reference.Builder)super.clone();
            }

            public com.android.aapt.Reference.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.Reference.Builder)super.setField(field, value);
            }

            public com.android.aapt.Reference.Builder clearField(Descriptors.FieldDescriptor field) {
                return (com.android.aapt.Reference.Builder)super.clearField(field);
            }

            public com.android.aapt.Reference.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (com.android.aapt.Reference.Builder)super.clearOneof(oneof);
            }

            public com.android.aapt.Reference.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (com.android.aapt.Reference.Builder)super.setRepeatedField(field, index, value);
            }

            public com.android.aapt.Reference.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.Reference.Builder)super.addRepeatedField(field, value);
            }

            public com.android.aapt.Reference.Builder mergeFrom(Message other) {
                if (other instanceof com.android.aapt.Reference) {
                    return this.mergeFrom((com.android.aapt.Reference)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public com.android.aapt.Reference.Builder mergeFrom(com.android.aapt.Reference other) {
                if (other == com.android.aapt.Reference.getDefaultInstance()) {
                    return this;
                } else {
                    if (other.type_ != 0) {
                        this.setTypeValue(other.getTypeValue());
                    }

                    if (other.getId() != 0) {
                        this.setId(other.getId());
                    }

                    if (!other.getName().isEmpty()) {
                        this.name_ = other.name_;
                        this.onChanged();
                    }

                    if (other.getPrivate()) {
                        this.setPrivate(other.getPrivate());
                    }

                    if (other.hasIsDynamic()) {
                        this.mergeIsDynamic(other.getIsDynamic());
                    }

                    if (other.getTypeFlags() != 0) {
                        this.setTypeFlags(other.getTypeFlags());
                    }

                    if (other.getAllowRaw()) {
                        this.setAllowRaw(other.getAllowRaw());
                    }

                    this.mergeUnknownFields(other.unknownFields);
                    this.onChanged();
                    return this;
                }
            }

            public final boolean isInitialized() {
                return true;
            }

            public com.android.aapt.Reference.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                com.android.aapt.Reference parsedMessage = null;

                try {
                    parsedMessage = (com.android.aapt.Reference)com.android.aapt.Reference.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (com.android.aapt.Reference)var8.getUnfinishedMessage();
                    throw var8.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }

                }

                return this;
            }

            public int getTypeValue() {
                return this.type_;
            }

            public com.android.aapt.Reference.Builder setTypeValue(int value) {
                this.type_ = value;
                this.onChanged();
                return this;
            }

            public com.android.aapt.Reference.Type getType() {
                com.android.aapt.Reference.Type result = com.android.aapt.Reference.Type.valueOf(this.type_);
                return result == null ? com.android.aapt.Reference.Type.UNRECOGNIZED : result;
            }

            public com.android.aapt.Reference.Builder setType(com.android.aapt.Reference.Type value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.type_ = value.getNumber();
                    this.onChanged();
                    return this;
                }
            }

            public com.android.aapt.Reference.Builder clearType() {
                this.type_ = 0;
                this.onChanged();
                return this;
            }

            public int getId() {
                return this.id_;
            }

            public com.android.aapt.Reference.Builder setId(int value) {
                this.id_ = value;
                this.onChanged();
                return this;
            }

            public com.android.aapt.Reference.Builder clearId() {
                this.id_ = 0;
                this.onChanged();
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

            public com.android.aapt.Reference.Builder setName(java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.name_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public com.android.aapt.Reference.Builder clearName() {
                this.name_ = com.android.aapt.Reference.getDefaultInstance().getName();
                this.onChanged();
                return this;
            }

            public com.android.aapt.Reference.Builder setNameBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    com.android.aapt.Reference.checkByteStringIsUtf8(value);
                    this.name_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public boolean getPrivate() {
                return this.private_;
            }

            public com.android.aapt.Reference.Builder setPrivate(boolean value) {
                this.private_ = value;
                this.onChanged();
                return this;
            }

            public com.android.aapt.Reference.Builder clearPrivate() {
                this.private_ = false;
                this.onChanged();
                return this;
            }

            public boolean hasIsDynamic() {
                return this.isDynamicBuilder_ != null || this.isDynamic_ != null;
            }

            public PBBoolean getIsDynamic() {
                if (this.isDynamicBuilder_ == null) {
                    return this.isDynamic_ == null ? PBBoolean.getDefaultInstance() : this.isDynamic_;
                } else {
                    return (PBBoolean)this.isDynamicBuilder_.getMessage();
                }
            }

            public com.android.aapt.Reference.Builder setIsDynamic(PBBoolean value) {
                if (this.isDynamicBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.isDynamic_ = value;
                    this.onChanged();
                } else {
                    this.isDynamicBuilder_.setMessage(value);
                }

                return this;
            }

            public com.android.aapt.Reference.Builder setIsDynamic(PBBoolean.Builder builderForValue) {
                if (this.isDynamicBuilder_ == null) {
                    this.isDynamic_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.isDynamicBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.Reference.Builder mergeIsDynamic(PBBoolean value) {
                if (this.isDynamicBuilder_ == null) {
                    if (this.isDynamic_ != null) {
                        this.isDynamic_ = PBBoolean.newBuilder(this.isDynamic_).mergeFrom(value).buildPartial();
                    } else {
                        this.isDynamic_ = value;
                    }

                    this.onChanged();
                } else {
                    this.isDynamicBuilder_.mergeFrom(value);
                }

                return this;
            }

            public com.android.aapt.Reference.Builder clearIsDynamic() {
                if (this.isDynamicBuilder_ == null) {
                    this.isDynamic_ = null;
                    this.onChanged();
                } else {
                    this.isDynamic_ = null;
                    this.isDynamicBuilder_ = null;
                }

                return this;
            }

            public PBBoolean.Builder getIsDynamicBuilder() {
                this.onChanged();
                return (PBBoolean.Builder)this.getIsDynamicFieldBuilder().getBuilder();
            }

            public com.android.aapt.BooleanOrBuilder getIsDynamicOrBuilder() {
                if (this.isDynamicBuilder_ != null) {
                    return (com.android.aapt.BooleanOrBuilder)this.isDynamicBuilder_.getMessageOrBuilder();
                } else {
                    return this.isDynamic_ == null ? PBBoolean.getDefaultInstance() : this.isDynamic_;
                }
            }

            private SingleFieldBuilderV3<PBBoolean, PBBoolean.Builder, com.android.aapt.BooleanOrBuilder> getIsDynamicFieldBuilder() {
                if (this.isDynamicBuilder_ == null) {
                    this.isDynamicBuilder_ = new SingleFieldBuilderV3(this.getIsDynamic(), this.getParentForChildren(), this.isClean());
                    this.isDynamic_ = null;
                }

                return this.isDynamicBuilder_;
            }

            public int getTypeFlags() {
                return this.typeFlags_;
            }

            public com.android.aapt.Reference.Builder setTypeFlags(int value) {
                this.typeFlags_ = value;
                this.onChanged();
                return this;
            }

            public com.android.aapt.Reference.Builder clearTypeFlags() {
                this.typeFlags_ = 0;
                this.onChanged();
                return this;
            }

            public boolean getAllowRaw() {
                return this.allowRaw_;
            }

            public com.android.aapt.Reference.Builder setAllowRaw(boolean value) {
                this.allowRaw_ = value;
                this.onChanged();
                return this;
            }

            public com.android.aapt.Reference.Builder clearAllowRaw() {
                this.allowRaw_ = false;
                this.onChanged();
                return this;
            }

            public final com.android.aapt.Reference.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.Reference.Builder)super.setUnknownFields(unknownFields);
            }

            public final com.android.aapt.Reference.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.Reference.Builder)super.mergeUnknownFields(unknownFields);
            }
        }

        public static enum Type implements ProtocolMessageEnum {
            REFERENCE(0),
            ATTRIBUTE(1),
            UNRECOGNIZED(-1);

            public static final int REFERENCE_VALUE = 0;
            public static final int ATTRIBUTE_VALUE = 1;
            private static final Internal.EnumLiteMap<Type> internalValueMap = new Internal.EnumLiteMap<Type>() {
                public com.android.aapt.Reference.Type findValueByNumber(int number) {
                    return com.android.aapt.Reference.Type.forNumber(number);
                }
            };
            private static final com.android.aapt.Reference.Type[] VALUES = values();
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
            public static com.android.aapt.Reference.Type valueOf(int value) {
                return forNumber(value);
            }

            public static com.android.aapt.Reference.Type forNumber(int value) {
                switch(value) {
                    case 0:
                        return REFERENCE;
                    case 1:
                        return ATTRIBUTE;
                    default:
                        return null;
                }
            }

            public static Internal.EnumLiteMap<Type> internalGetValueMap() {
                return internalValueMap;
            }

            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
            }

            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return (Descriptors.EnumDescriptor)com.android.aapt.Reference.getDescriptor().getEnumTypes().get(0);
            }

            public static com.android.aapt.Reference.Type valueOf(Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                } else {
                    return desc.getIndex() == -1 ? UNRECOGNIZED : VALUES[desc.getIndex()];
                }
            }

            private Type(int value) {
                this.value = value;
            }
        }
    }