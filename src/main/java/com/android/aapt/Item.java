package com.android.aapt;

import com.google.protobuf.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class Item extends GeneratedMessageV3 implements com.android.aapt.ItemOrBuilder {
        private static final long serialVersionUID = 0L;
        private int valueCase_;
        private Object value_;
        public static final int REF_FIELD_NUMBER = 1;
        public static final int STR_FIELD_NUMBER = 2;
        public static final int RAW_STR_FIELD_NUMBER = 3;
        public static final int STYLED_STR_FIELD_NUMBER = 4;
        public static final int FILE_FIELD_NUMBER = 5;
        public static final int ID_FIELD_NUMBER = 6;
        public static final int PRIM_FIELD_NUMBER = 7;
        private byte memoizedIsInitialized;
        private static final com.android.aapt.Item DEFAULT_INSTANCE = new com.android.aapt.Item();
        private static final Parser<com.android.aapt.Item> PARSER = new AbstractParser<com.android.aapt.Item>() {
            public com.android.aapt.Item parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new com.android.aapt.Item(input, extensionRegistry);
            }
        };

        private Item(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.valueCase_ = 0;
            this.memoizedIsInitialized = -1;
        }

        private Item() {
            this.valueCase_ = 0;
            this.memoizedIsInitialized = -1;
        }

        @Override
        public Object newInstance(UnusedPrivateParameter unused) {
            return new com.android.aapt.Item();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Item(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                com.android.aapt.Reference.Builder subBuilder = null;
                                if (this.valueCase_ == 1) {
                                    subBuilder = ((com.android.aapt.Reference)this.value_).toBuilder();
                                }

                                this.value_ = input.readMessage(com.android.aapt.Reference.parser(), extensionRegistry);
                                if (subBuilder != null) {
                                    subBuilder.mergeFrom((com.android.aapt.Reference)this.value_);
                                    this.value_ = subBuilder.buildPartial();
                                }

                                this.valueCase_ = 1;
                                break;
                            case 18:
                                PBString.Builder subBuilder2 = null;
                                if (this.valueCase_ == 2) {
                                    subBuilder2 = ((PBString)this.value_).toBuilder();
                                }

                                this.value_ = input.readMessage(PBString.parser(), extensionRegistry);
                                if (subBuilder2 != null) {
                                    subBuilder2.mergeFrom((PBString)this.value_);
                                    this.value_ = subBuilder2.buildPartial();
                                }

                                this.valueCase_ = 2;
                                break;
                            case 26:
                                com.android.aapt.RawString.Builder subBuilder3 = null;
                                if (this.valueCase_ == 3) {
                                    subBuilder3 = ((com.android.aapt.RawString)this.value_).toBuilder();
                                }

                                this.value_ = input.readMessage(com.android.aapt.RawString.parser(), extensionRegistry);
                                if (subBuilder3 != null) {
                                    subBuilder3.mergeFrom((com.android.aapt.RawString)this.value_);
                                    this.value_ = subBuilder3.buildPartial();
                                }

                                this.valueCase_ = 3;
                                break;
                            case 34:
                                com.android.aapt.StyledString.Builder subBuilder4 = null;
                                if (this.valueCase_ == 4) {
                                    subBuilder4 = ((com.android.aapt.StyledString)this.value_).toBuilder();
                                }

                                this.value_ = input.readMessage(com.android.aapt.StyledString.parser(), extensionRegistry);
                                if (subBuilder4 != null) {
                                    subBuilder4.mergeFrom((com.android.aapt.StyledString)this.value_);
                                    this.value_ = subBuilder4.buildPartial();
                                }

                                this.valueCase_ = 4;
                                break;
                            case 42:
                                com.android.aapt.FileReference.Builder subBuilder5 = null;
                                if (this.valueCase_ == 5) {
                                    subBuilder5 = ((com.android.aapt.FileReference)this.value_).toBuilder();
                                }

                                this.value_ = input.readMessage(com.android.aapt.FileReference.parser(), extensionRegistry);
                                if (subBuilder5 != null) {
                                    subBuilder5.mergeFrom((com.android.aapt.FileReference)this.value_);
                                    this.value_ = subBuilder5.buildPartial();
                                }

                                this.valueCase_ = 5;
                                break;
                            case 50:
                                com.android.aapt.Id.Builder subBuilder6 = null;
                                if (this.valueCase_ == 6) {
                                    subBuilder6 = ((com.android.aapt.Id)this.value_).toBuilder();
                                }

                                this.value_ = input.readMessage(com.android.aapt.Id.parser(), extensionRegistry);
                                if (subBuilder6 != null) {
                                    subBuilder6.mergeFrom((com.android.aapt.Id)this.value_);
                                    this.value_ = subBuilder6.buildPartial();
                                }

                                this.valueCase_ = 6;
                                break;
                            case 58:
                                com.android.aapt.Primitive.Builder subBuilder7 = null;
                                if (this.valueCase_ == 7) {
                                    subBuilder7 = ((com.android.aapt.Primitive)this.value_).toBuilder();
                                }

                                this.value_ = input.readMessage(com.android.aapt.Primitive.parser(), extensionRegistry);
                                if (subBuilder7 != null) {
                                    subBuilder7.mergeFrom((com.android.aapt.Primitive)this.value_);
                                    this.value_ = subBuilder7.buildPartial();
                                }

                                this.valueCase_ = 7;
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
            return Resources.internal_static_aapt_pb_Item_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_Item_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.Item.class, com.android.aapt.Item.Builder.class);
        }

        public com.android.aapt.Item.ValueCase getValueCase() {
            return com.android.aapt.Item.ValueCase.forNumber(this.valueCase_);
        }

        public boolean hasRef() {
            return this.valueCase_ == 1;
        }

        public com.android.aapt.Reference getRef() {
            return this.valueCase_ == 1 ? (com.android.aapt.Reference)this.value_ : com.android.aapt.Reference.getDefaultInstance();
        }

        public com.android.aapt.ReferenceOrBuilder getRefOrBuilder() {
            return this.valueCase_ == 1 ? (com.android.aapt.Reference)this.value_ : com.android.aapt.Reference.getDefaultInstance();
        }

        public boolean hasStr() {
            return this.valueCase_ == 2;
        }

        public PBString getStr() {
            return this.valueCase_ == 2 ? (PBString)this.value_ : PBString.getDefaultInstance();
        }

        public com.android.aapt.StringOrBuilder getStrOrBuilder() {
            return this.valueCase_ == 2 ? (PBString)this.value_ : PBString.getDefaultInstance();
        }

        public boolean hasRawStr() {
            return this.valueCase_ == 3;
        }

        public com.android.aapt.RawString getRawStr() {
            return this.valueCase_ == 3 ? (com.android.aapt.RawString)this.value_ : com.android.aapt.RawString.getDefaultInstance();
        }

        public com.android.aapt.RawStringOrBuilder getRawStrOrBuilder() {
            return this.valueCase_ == 3 ? (com.android.aapt.RawString)this.value_ : com.android.aapt.RawString.getDefaultInstance();
        }

        public boolean hasStyledStr() {
            return this.valueCase_ == 4;
        }

        public com.android.aapt.StyledString getStyledStr() {
            return this.valueCase_ == 4 ? (com.android.aapt.StyledString)this.value_ : com.android.aapt.StyledString.getDefaultInstance();
        }

        public com.android.aapt.StyledStringOrBuilder getStyledStrOrBuilder() {
            return this.valueCase_ == 4 ? (com.android.aapt.StyledString)this.value_ : com.android.aapt.StyledString.getDefaultInstance();
        }

        public boolean hasFile() {
            return this.valueCase_ == 5;
        }

        public com.android.aapt.FileReference getFile() {
            return this.valueCase_ == 5 ? (com.android.aapt.FileReference)this.value_ : com.android.aapt.FileReference.getDefaultInstance();
        }

        public com.android.aapt.FileReferenceOrBuilder getFileOrBuilder() {
            return this.valueCase_ == 5 ? (com.android.aapt.FileReference)this.value_ : com.android.aapt.FileReference.getDefaultInstance();
        }

        public boolean hasId() {
            return this.valueCase_ == 6;
        }

        public com.android.aapt.Id getId() {
            return this.valueCase_ == 6 ? (com.android.aapt.Id)this.value_ : com.android.aapt.Id.getDefaultInstance();
        }

        public com.android.aapt.IdOrBuilder getIdOrBuilder() {
            return this.valueCase_ == 6 ? (com.android.aapt.Id)this.value_ : com.android.aapt.Id.getDefaultInstance();
        }

        public boolean hasPrim() {
            return this.valueCase_ == 7;
        }

        public com.android.aapt.Primitive getPrim() {
            return this.valueCase_ == 7 ? (com.android.aapt.Primitive)this.value_ : com.android.aapt.Primitive.getDefaultInstance();
        }

        public com.android.aapt.PrimitiveOrBuilder getPrimOrBuilder() {
            return this.valueCase_ == 7 ? (com.android.aapt.Primitive)this.value_ : com.android.aapt.Primitive.getDefaultInstance();
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
            if (this.valueCase_ == 1) {
                output.writeMessage(1, (com.android.aapt.Reference)this.value_);
            }

            if (this.valueCase_ == 2) {
                output.writeMessage(2, (PBString)this.value_);
            }

            if (this.valueCase_ == 3) {
                output.writeMessage(3, (com.android.aapt.RawString)this.value_);
            }

            if (this.valueCase_ == 4) {
                output.writeMessage(4, (com.android.aapt.StyledString)this.value_);
            }

            if (this.valueCase_ == 5) {
                output.writeMessage(5, (com.android.aapt.FileReference)this.value_);
            }

            if (this.valueCase_ == 6) {
                output.writeMessage(6, (com.android.aapt.Id)this.value_);
            }

            if (this.valueCase_ == 7) {
                output.writeMessage(7, (com.android.aapt.Primitive)this.value_);
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
                if (this.valueCase_ == 1) {
                    size += CodedOutputStream.computeMessageSize(1, (com.android.aapt.Reference)this.value_);
                }

                if (this.valueCase_ == 2) {
                    size += CodedOutputStream.computeMessageSize(2, (PBString)this.value_);
                }

                if (this.valueCase_ == 3) {
                    size += CodedOutputStream.computeMessageSize(3, (com.android.aapt.RawString)this.value_);
                }

                if (this.valueCase_ == 4) {
                    size += CodedOutputStream.computeMessageSize(4, (com.android.aapt.StyledString)this.value_);
                }

                if (this.valueCase_ == 5) {
                    size += CodedOutputStream.computeMessageSize(5, (com.android.aapt.FileReference)this.value_);
                }

                if (this.valueCase_ == 6) {
                    size += CodedOutputStream.computeMessageSize(6, (com.android.aapt.Id)this.value_);
                }

                if (this.valueCase_ == 7) {
                    size += CodedOutputStream.computeMessageSize(7, (com.android.aapt.Primitive)this.value_);
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
            } else if (!(obj instanceof com.android.aapt.Item)) {
                return super.equals(obj);
            } else {
                com.android.aapt.Item other = (com.android.aapt.Item)obj;
                if (!this.getValueCase().equals(other.getValueCase())) {
                    return false;
                } else {
                    switch(this.valueCase_) {
                        case 0:
                        default:
                            break;
                        case 1:
                            if (!this.getRef().equals(other.getRef())) {
                                return false;
                            }
                            break;
                        case 2:
                            if (!this.getStr().equals(other.getStr())) {
                                return false;
                            }
                            break;
                        case 3:
                            if (!this.getRawStr().equals(other.getRawStr())) {
                                return false;
                            }
                            break;
                        case 4:
                            if (!this.getStyledStr().equals(other.getStyledStr())) {
                                return false;
                            }
                            break;
                        case 5:
                            if (!this.getFile().equals(other.getFile())) {
                                return false;
                            }
                            break;
                        case 6:
                            if (!this.getId().equals(other.getId())) {
                                return false;
                            }
                            break;
                        case 7:
                            if (!this.getPrim().equals(other.getPrim())) {
                                return false;
                            }
                    }

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
                switch(this.valueCase_) {
                    case 0:
                    default:
                        break;
                    case 1:
                        hash = 37 * hash + 1;
                        hash = 53 * hash + this.getRef().hashCode();
                        break;
                    case 2:
                        hash = 37 * hash + 2;
                        hash = 53 * hash + this.getStr().hashCode();
                        break;
                    case 3:
                        hash = 37 * hash + 3;
                        hash = 53 * hash + this.getRawStr().hashCode();
                        break;
                    case 4:
                        hash = 37 * hash + 4;
                        hash = 53 * hash + this.getStyledStr().hashCode();
                        break;
                    case 5:
                        hash = 37 * hash + 5;
                        hash = 53 * hash + this.getFile().hashCode();
                        break;
                    case 6:
                        hash = 37 * hash + 6;
                        hash = 53 * hash + this.getId().hashCode();
                        break;
                    case 7:
                        hash = 37 * hash + 7;
                        hash = 53 * hash + this.getPrim().hashCode();
                }

                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static com.android.aapt.Item parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Item)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Item parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Item)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Item parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Item)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Item parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Item)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Item parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Item)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Item parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Item)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Item parseFrom(InputStream input) throws IOException {
            return (com.android.aapt.Item)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.Item parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Item)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.Item parseDelimitedFrom(InputStream input) throws IOException {
            return (com.android.aapt.Item)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static com.android.aapt.Item parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Item)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.Item parseFrom(CodedInputStream input) throws IOException {
            return (com.android.aapt.Item)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.Item parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Item)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public com.android.aapt.Item.Builder newBuilderForType() {
            return newBuilder();
        }

        public static com.android.aapt.Item.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static com.android.aapt.Item.Builder newBuilder(com.android.aapt.Item prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public com.android.aapt.Item.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new com.android.aapt.Item.Builder() : (new com.android.aapt.Item.Builder()).mergeFrom(this);
        }

        public com.android.aapt.Item.Builder newBuilderForType(BuilderParent parent) {
            com.android.aapt.Item.Builder builder = new com.android.aapt.Item.Builder(parent);
            return builder;
        }

        public static com.android.aapt.Item getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<com.android.aapt.Item> parser() {
            return PARSER;
        }

        public Parser<com.android.aapt.Item> getParserForType() {
            return PARSER;
        }

        public com.android.aapt.Item getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.Item.Builder> implements com.android.aapt.ItemOrBuilder {
            private int valueCase_;
            private Object value_;
            private SingleFieldBuilderV3<com.android.aapt.Reference, com.android.aapt.Reference.Builder, com.android.aapt.ReferenceOrBuilder> refBuilder_;
            private SingleFieldBuilderV3<PBString, PBString.Builder, com.android.aapt.StringOrBuilder> strBuilder_;
            private SingleFieldBuilderV3<com.android.aapt.RawString, com.android.aapt.RawString.Builder, com.android.aapt.RawStringOrBuilder> rawStrBuilder_;
            private SingleFieldBuilderV3<com.android.aapt.StyledString, com.android.aapt.StyledString.Builder, com.android.aapt.StyledStringOrBuilder> styledStrBuilder_;
            private SingleFieldBuilderV3<com.android.aapt.FileReference, com.android.aapt.FileReference.Builder, com.android.aapt.FileReferenceOrBuilder> fileBuilder_;
            private SingleFieldBuilderV3<com.android.aapt.Id, com.android.aapt.Id.Builder, com.android.aapt.IdOrBuilder> idBuilder_;
            private SingleFieldBuilderV3<com.android.aapt.Primitive, com.android.aapt.Primitive.Builder, com.android.aapt.PrimitiveOrBuilder> primBuilder_;

            public static Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_Item_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_Item_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.Item.class, com.android.aapt.Item.Builder.class);
            }

            private Builder() {
                this.valueCase_ = 0;
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.valueCase_ = 0;
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.android.aapt.Item.alwaysUseFieldBuilders) {
                }

            }

            public com.android.aapt.Item.Builder clear() {
                super.clear();
                this.valueCase_ = 0;
                this.value_ = null;
                return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Resources.internal_static_aapt_pb_Item_descriptor;
            }

            public com.android.aapt.Item getDefaultInstanceForType() {
                return com.android.aapt.Item.getDefaultInstance();
            }

            public com.android.aapt.Item build() {
                com.android.aapt.Item result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public com.android.aapt.Item buildPartial() {
                com.android.aapt.Item result = new com.android.aapt.Item(this);
                if (this.valueCase_ == 1) {
                    if (this.refBuilder_ == null) {
                        result.value_ = this.value_;
                    } else {
                        result.value_ = this.refBuilder_.build();
                    }
                }

                if (this.valueCase_ == 2) {
                    if (this.strBuilder_ == null) {
                        result.value_ = this.value_;
                    } else {
                        result.value_ = this.strBuilder_.build();
                    }
                }

                if (this.valueCase_ == 3) {
                    if (this.rawStrBuilder_ == null) {
                        result.value_ = this.value_;
                    } else {
                        result.value_ = this.rawStrBuilder_.build();
                    }
                }

                if (this.valueCase_ == 4) {
                    if (this.styledStrBuilder_ == null) {
                        result.value_ = this.value_;
                    } else {
                        result.value_ = this.styledStrBuilder_.build();
                    }
                }

                if (this.valueCase_ == 5) {
                    if (this.fileBuilder_ == null) {
                        result.value_ = this.value_;
                    } else {
                        result.value_ = this.fileBuilder_.build();
                    }
                }

                if (this.valueCase_ == 6) {
                    if (this.idBuilder_ == null) {
                        result.value_ = this.value_;
                    } else {
                        result.value_ = this.idBuilder_.build();
                    }
                }

                if (this.valueCase_ == 7) {
                    if (this.primBuilder_ == null) {
                        result.value_ = this.value_;
                    } else {
                        result.value_ = this.primBuilder_.build();
                    }
                }

                result.valueCase_ = this.valueCase_;
                this.onBuilt();
                return result;
            }

            public com.android.aapt.Item.Builder clone() {
                return (com.android.aapt.Item.Builder)super.clone();
            }

            public com.android.aapt.Item.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.Item.Builder)super.setField(field, value);
            }

            public com.android.aapt.Item.Builder clearField(Descriptors.FieldDescriptor field) {
                return (com.android.aapt.Item.Builder)super.clearField(field);
            }

            public com.android.aapt.Item.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (com.android.aapt.Item.Builder)super.clearOneof(oneof);
            }

            public com.android.aapt.Item.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (com.android.aapt.Item.Builder)super.setRepeatedField(field, index, value);
            }

            public com.android.aapt.Item.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.Item.Builder)super.addRepeatedField(field, value);
            }

            public com.android.aapt.Item.Builder mergeFrom(Message other) {
                if (other instanceof com.android.aapt.Item) {
                    return this.mergeFrom((com.android.aapt.Item)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public com.android.aapt.Item.Builder mergeFrom(com.android.aapt.Item other) {
                if (other == com.android.aapt.Item.getDefaultInstance()) {
                    return this;
                } else {
                    switch(other.getValueCase()) {
                        case REF:
                            this.mergeRef(other.getRef());
                            break;
                        case STR:
                            this.mergeStr(other.getStr());
                            break;
                        case RAW_STR:
                            this.mergeRawStr(other.getRawStr());
                            break;
                        case STYLED_STR:
                            this.mergeStyledStr(other.getStyledStr());
                            break;
                        case FILE:
                            this.mergeFile(other.getFile());
                            break;
                        case ID:
                            this.mergeId(other.getId());
                            break;
                        case PRIM:
                            this.mergePrim(other.getPrim());
                        case VALUE_NOT_SET:
                    }

                    this.mergeUnknownFields(other.unknownFields);
                    this.onChanged();
                    return this;
                }
            }

            public final boolean isInitialized() {
                return true;
            }

            public com.android.aapt.Item.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                com.android.aapt.Item parsedMessage = null;

                try {
                    parsedMessage = (com.android.aapt.Item)com.android.aapt.Item.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (com.android.aapt.Item)var8.getUnfinishedMessage();
                    throw var8.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }

                }

                return this;
            }

            public com.android.aapt.Item.ValueCase getValueCase() {
                return com.android.aapt.Item.ValueCase.forNumber(this.valueCase_);
            }

            public com.android.aapt.Item.Builder clearValue() {
                this.valueCase_ = 0;
                this.value_ = null;
                this.onChanged();
                return this;
            }

            public boolean hasRef() {
                return this.valueCase_ == 1;
            }

            public com.android.aapt.Reference getRef() {
                if (this.refBuilder_ == null) {
                    return this.valueCase_ == 1 ? (com.android.aapt.Reference)this.value_ : com.android.aapt.Reference.getDefaultInstance();
                } else {
                    return this.valueCase_ == 1 ? (com.android.aapt.Reference)this.refBuilder_.getMessage() : com.android.aapt.Reference.getDefaultInstance();
                }
            }

            public com.android.aapt.Item.Builder setRef(com.android.aapt.Reference value) {
                if (this.refBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.value_ = value;
                    this.onChanged();
                } else {
                    this.refBuilder_.setMessage(value);
                }

                this.valueCase_ = 1;
                return this;
            }

            public com.android.aapt.Item.Builder setRef(com.android.aapt.Reference.Builder builderForValue) {
                if (this.refBuilder_ == null) {
                    this.value_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.refBuilder_.setMessage(builderForValue.build());
                }

                this.valueCase_ = 1;
                return this;
            }

            public com.android.aapt.Item.Builder mergeRef(com.android.aapt.Reference value) {
                if (this.refBuilder_ == null) {
                    if (this.valueCase_ == 1 && this.value_ != com.android.aapt.Reference.getDefaultInstance()) {
                        this.value_ = com.android.aapt.Reference.newBuilder((com.android.aapt.Reference)this.value_).mergeFrom(value).buildPartial();
                    } else {
                        this.value_ = value;
                    }

                    this.onChanged();
                } else {
                    if (this.valueCase_ == 1) {
                        this.refBuilder_.mergeFrom(value);
                    }

                    this.refBuilder_.setMessage(value);
                }

                this.valueCase_ = 1;
                return this;
            }

            public com.android.aapt.Item.Builder clearRef() {
                if (this.refBuilder_ == null) {
                    if (this.valueCase_ == 1) {
                        this.valueCase_ = 0;
                        this.value_ = null;
                        this.onChanged();
                    }
                } else {
                    if (this.valueCase_ == 1) {
                        this.valueCase_ = 0;
                        this.value_ = null;
                    }

                    this.refBuilder_.clear();
                }

                return this;
            }

            public com.android.aapt.Reference.Builder getRefBuilder() {
                return (com.android.aapt.Reference.Builder)this.getRefFieldBuilder().getBuilder();
            }

            public com.android.aapt.ReferenceOrBuilder getRefOrBuilder() {
                if (this.valueCase_ == 1 && this.refBuilder_ != null) {
                    return (com.android.aapt.ReferenceOrBuilder)this.refBuilder_.getMessageOrBuilder();
                } else {
                    return this.valueCase_ == 1 ? (com.android.aapt.Reference)this.value_ : com.android.aapt.Reference.getDefaultInstance();
                }
            }

            private SingleFieldBuilderV3<com.android.aapt.Reference, com.android.aapt.Reference.Builder, com.android.aapt.ReferenceOrBuilder> getRefFieldBuilder() {
                if (this.refBuilder_ == null) {
                    if (this.valueCase_ != 1) {
                        this.value_ = com.android.aapt.Reference.getDefaultInstance();
                    }

                    this.refBuilder_ = new SingleFieldBuilderV3((com.android.aapt.Reference)this.value_, this.getParentForChildren(), this.isClean());
                    this.value_ = null;
                }

                this.valueCase_ = 1;
                this.onChanged();
                return this.refBuilder_;
            }

            public boolean hasStr() {
                return this.valueCase_ == 2;
            }

            public PBString getStr() {
                if (this.strBuilder_ == null) {
                    return this.valueCase_ == 2 ? (PBString)this.value_ : PBString.getDefaultInstance();
                } else {
                    return this.valueCase_ == 2 ? (PBString)this.strBuilder_.getMessage() : PBString.getDefaultInstance();
                }
            }

            public com.android.aapt.Item.Builder setStr(PBString value) {
                if (this.strBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.value_ = value;
                    this.onChanged();
                } else {
                    this.strBuilder_.setMessage(value);
                }

                this.valueCase_ = 2;
                return this;
            }

            public com.android.aapt.Item.Builder setStr(PBString.Builder builderForValue) {
                if (this.strBuilder_ == null) {
                    this.value_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.strBuilder_.setMessage(builderForValue.build());
                }

                this.valueCase_ = 2;
                return this;
            }

            public com.android.aapt.Item.Builder mergeStr(PBString value) {
                if (this.strBuilder_ == null) {
                    if (this.valueCase_ == 2 && this.value_ != PBString.getDefaultInstance()) {
                        this.value_ = PBString.newBuilder((PBString)this.value_).mergeFrom(value).buildPartial();
                    } else {
                        this.value_ = value;
                    }

                    this.onChanged();
                } else {
                    if (this.valueCase_ == 2) {
                        this.strBuilder_.mergeFrom(value);
                    }

                    this.strBuilder_.setMessage(value);
                }

                this.valueCase_ = 2;
                return this;
            }

            public com.android.aapt.Item.Builder clearStr() {
                if (this.strBuilder_ == null) {
                    if (this.valueCase_ == 2) {
                        this.valueCase_ = 0;
                        this.value_ = null;
                        this.onChanged();
                    }
                } else {
                    if (this.valueCase_ == 2) {
                        this.valueCase_ = 0;
                        this.value_ = null;
                    }

                    this.strBuilder_.clear();
                }

                return this;
            }

            public PBString.Builder getStrBuilder() {
                return (PBString.Builder)this.getStrFieldBuilder().getBuilder();
            }

            public com.android.aapt.StringOrBuilder getStrOrBuilder() {
                if (this.valueCase_ == 2 && this.strBuilder_ != null) {
                    return (com.android.aapt.StringOrBuilder)this.strBuilder_.getMessageOrBuilder();
                } else {
                    return this.valueCase_ == 2 ? (PBString)this.value_ : PBString.getDefaultInstance();
                }
            }

            private SingleFieldBuilderV3<PBString, PBString.Builder, com.android.aapt.StringOrBuilder> getStrFieldBuilder() {
                if (this.strBuilder_ == null) {
                    if (this.valueCase_ != 2) {
                        this.value_ = PBString.getDefaultInstance();
                    }

                    this.strBuilder_ = new SingleFieldBuilderV3((PBString)this.value_, this.getParentForChildren(), this.isClean());
                    this.value_ = null;
                }

                this.valueCase_ = 2;
                this.onChanged();
                return this.strBuilder_;
            }

            public boolean hasRawStr() {
                return this.valueCase_ == 3;
            }

            public com.android.aapt.RawString getRawStr() {
                if (this.rawStrBuilder_ == null) {
                    return this.valueCase_ == 3 ? (com.android.aapt.RawString)this.value_ : com.android.aapt.RawString.getDefaultInstance();
                } else {
                    return this.valueCase_ == 3 ? (com.android.aapt.RawString)this.rawStrBuilder_.getMessage() : com.android.aapt.RawString.getDefaultInstance();
                }
            }

            public com.android.aapt.Item.Builder setRawStr(com.android.aapt.RawString value) {
                if (this.rawStrBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.value_ = value;
                    this.onChanged();
                } else {
                    this.rawStrBuilder_.setMessage(value);
                }

                this.valueCase_ = 3;
                return this;
            }

            public com.android.aapt.Item.Builder setRawStr(com.android.aapt.RawString.Builder builderForValue) {
                if (this.rawStrBuilder_ == null) {
                    this.value_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.rawStrBuilder_.setMessage(builderForValue.build());
                }

                this.valueCase_ = 3;
                return this;
            }

            public com.android.aapt.Item.Builder mergeRawStr(com.android.aapt.RawString value) {
                if (this.rawStrBuilder_ == null) {
                    if (this.valueCase_ == 3 && this.value_ != com.android.aapt.RawString.getDefaultInstance()) {
                        this.value_ = com.android.aapt.RawString.newBuilder((com.android.aapt.RawString)this.value_).mergeFrom(value).buildPartial();
                    } else {
                        this.value_ = value;
                    }

                    this.onChanged();
                } else {
                    if (this.valueCase_ == 3) {
                        this.rawStrBuilder_.mergeFrom(value);
                    }

                    this.rawStrBuilder_.setMessage(value);
                }

                this.valueCase_ = 3;
                return this;
            }

            public com.android.aapt.Item.Builder clearRawStr() {
                if (this.rawStrBuilder_ == null) {
                    if (this.valueCase_ == 3) {
                        this.valueCase_ = 0;
                        this.value_ = null;
                        this.onChanged();
                    }
                } else {
                    if (this.valueCase_ == 3) {
                        this.valueCase_ = 0;
                        this.value_ = null;
                    }

                    this.rawStrBuilder_.clear();
                }

                return this;
            }

            public com.android.aapt.RawString.Builder getRawStrBuilder() {
                return (com.android.aapt.RawString.Builder)this.getRawStrFieldBuilder().getBuilder();
            }

            public com.android.aapt.RawStringOrBuilder getRawStrOrBuilder() {
                if (this.valueCase_ == 3 && this.rawStrBuilder_ != null) {
                    return (com.android.aapt.RawStringOrBuilder)this.rawStrBuilder_.getMessageOrBuilder();
                } else {
                    return this.valueCase_ == 3 ? (com.android.aapt.RawString)this.value_ : com.android.aapt.RawString.getDefaultInstance();
                }
            }

            private SingleFieldBuilderV3<com.android.aapt.RawString, com.android.aapt.RawString.Builder, com.android.aapt.RawStringOrBuilder> getRawStrFieldBuilder() {
                if (this.rawStrBuilder_ == null) {
                    if (this.valueCase_ != 3) {
                        this.value_ = com.android.aapt.RawString.getDefaultInstance();
                    }

                    this.rawStrBuilder_ = new SingleFieldBuilderV3((com.android.aapt.RawString)this.value_, this.getParentForChildren(), this.isClean());
                    this.value_ = null;
                }

                this.valueCase_ = 3;
                this.onChanged();
                return this.rawStrBuilder_;
            }

            public boolean hasStyledStr() {
                return this.valueCase_ == 4;
            }

            public com.android.aapt.StyledString getStyledStr() {
                if (this.styledStrBuilder_ == null) {
                    return this.valueCase_ == 4 ? (com.android.aapt.StyledString)this.value_ : com.android.aapt.StyledString.getDefaultInstance();
                } else {
                    return this.valueCase_ == 4 ? (com.android.aapt.StyledString)this.styledStrBuilder_.getMessage() : com.android.aapt.StyledString.getDefaultInstance();
                }
            }

            public com.android.aapt.Item.Builder setStyledStr(com.android.aapt.StyledString value) {
                if (this.styledStrBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.value_ = value;
                    this.onChanged();
                } else {
                    this.styledStrBuilder_.setMessage(value);
                }

                this.valueCase_ = 4;
                return this;
            }

            public com.android.aapt.Item.Builder setStyledStr(com.android.aapt.StyledString.Builder builderForValue) {
                if (this.styledStrBuilder_ == null) {
                    this.value_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.styledStrBuilder_.setMessage(builderForValue.build());
                }

                this.valueCase_ = 4;
                return this;
            }

            public com.android.aapt.Item.Builder mergeStyledStr(com.android.aapt.StyledString value) {
                if (this.styledStrBuilder_ == null) {
                    if (this.valueCase_ == 4 && this.value_ != com.android.aapt.StyledString.getDefaultInstance()) {
                        this.value_ = com.android.aapt.StyledString.newBuilder((com.android.aapt.StyledString)this.value_).mergeFrom(value).buildPartial();
                    } else {
                        this.value_ = value;
                    }

                    this.onChanged();
                } else {
                    if (this.valueCase_ == 4) {
                        this.styledStrBuilder_.mergeFrom(value);
                    }

                    this.styledStrBuilder_.setMessage(value);
                }

                this.valueCase_ = 4;
                return this;
            }

            public com.android.aapt.Item.Builder clearStyledStr() {
                if (this.styledStrBuilder_ == null) {
                    if (this.valueCase_ == 4) {
                        this.valueCase_ = 0;
                        this.value_ = null;
                        this.onChanged();
                    }
                } else {
                    if (this.valueCase_ == 4) {
                        this.valueCase_ = 0;
                        this.value_ = null;
                    }

                    this.styledStrBuilder_.clear();
                }

                return this;
            }

            public com.android.aapt.StyledString.Builder getStyledStrBuilder() {
                return (com.android.aapt.StyledString.Builder)this.getStyledStrFieldBuilder().getBuilder();
            }

            public com.android.aapt.StyledStringOrBuilder getStyledStrOrBuilder() {
                if (this.valueCase_ == 4 && this.styledStrBuilder_ != null) {
                    return (com.android.aapt.StyledStringOrBuilder)this.styledStrBuilder_.getMessageOrBuilder();
                } else {
                    return this.valueCase_ == 4 ? (com.android.aapt.StyledString)this.value_ : com.android.aapt.StyledString.getDefaultInstance();
                }
            }

            private SingleFieldBuilderV3<com.android.aapt.StyledString, com.android.aapt.StyledString.Builder, com.android.aapt.StyledStringOrBuilder> getStyledStrFieldBuilder() {
                if (this.styledStrBuilder_ == null) {
                    if (this.valueCase_ != 4) {
                        this.value_ = com.android.aapt.StyledString.getDefaultInstance();
                    }

                    this.styledStrBuilder_ = new SingleFieldBuilderV3((com.android.aapt.StyledString)this.value_, this.getParentForChildren(), this.isClean());
                    this.value_ = null;
                }

                this.valueCase_ = 4;
                this.onChanged();
                return this.styledStrBuilder_;
            }

            public boolean hasFile() {
                return this.valueCase_ == 5;
            }

            public com.android.aapt.FileReference getFile() {
                if (this.fileBuilder_ == null) {
                    return this.valueCase_ == 5 ? (com.android.aapt.FileReference)this.value_ : com.android.aapt.FileReference.getDefaultInstance();
                } else {
                    return this.valueCase_ == 5 ? (com.android.aapt.FileReference)this.fileBuilder_.getMessage() : com.android.aapt.FileReference.getDefaultInstance();
                }
            }

            public com.android.aapt.Item.Builder setFile(com.android.aapt.FileReference value) {
                if (this.fileBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.value_ = value;
                    this.onChanged();
                } else {
                    this.fileBuilder_.setMessage(value);
                }

                this.valueCase_ = 5;
                return this;
            }

            public com.android.aapt.Item.Builder setFile(com.android.aapt.FileReference.Builder builderForValue) {
                if (this.fileBuilder_ == null) {
                    this.value_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.fileBuilder_.setMessage(builderForValue.build());
                }

                this.valueCase_ = 5;
                return this;
            }

            public com.android.aapt.Item.Builder mergeFile(com.android.aapt.FileReference value) {
                if (this.fileBuilder_ == null) {
                    if (this.valueCase_ == 5 && this.value_ != com.android.aapt.FileReference.getDefaultInstance()) {
                        this.value_ = com.android.aapt.FileReference.newBuilder((com.android.aapt.FileReference)this.value_).mergeFrom(value).buildPartial();
                    } else {
                        this.value_ = value;
                    }

                    this.onChanged();
                } else {
                    if (this.valueCase_ == 5) {
                        this.fileBuilder_.mergeFrom(value);
                    }

                    this.fileBuilder_.setMessage(value);
                }

                this.valueCase_ = 5;
                return this;
            }

            public com.android.aapt.Item.Builder clearFile() {
                if (this.fileBuilder_ == null) {
                    if (this.valueCase_ == 5) {
                        this.valueCase_ = 0;
                        this.value_ = null;
                        this.onChanged();
                    }
                } else {
                    if (this.valueCase_ == 5) {
                        this.valueCase_ = 0;
                        this.value_ = null;
                    }

                    this.fileBuilder_.clear();
                }

                return this;
            }

            public com.android.aapt.FileReference.Builder getFileBuilder() {
                return (com.android.aapt.FileReference.Builder)this.getFileFieldBuilder().getBuilder();
            }

            public com.android.aapt.FileReferenceOrBuilder getFileOrBuilder() {
                if (this.valueCase_ == 5 && this.fileBuilder_ != null) {
                    return (com.android.aapt.FileReferenceOrBuilder)this.fileBuilder_.getMessageOrBuilder();
                } else {
                    return this.valueCase_ == 5 ? (com.android.aapt.FileReference)this.value_ : com.android.aapt.FileReference.getDefaultInstance();
                }
            }

            private SingleFieldBuilderV3<com.android.aapt.FileReference, com.android.aapt.FileReference.Builder, com.android.aapt.FileReferenceOrBuilder> getFileFieldBuilder() {
                if (this.fileBuilder_ == null) {
                    if (this.valueCase_ != 5) {
                        this.value_ = com.android.aapt.FileReference.getDefaultInstance();
                    }

                    this.fileBuilder_ = new SingleFieldBuilderV3((com.android.aapt.FileReference)this.value_, this.getParentForChildren(), this.isClean());
                    this.value_ = null;
                }

                this.valueCase_ = 5;
                this.onChanged();
                return this.fileBuilder_;
            }

            public boolean hasId() {
                return this.valueCase_ == 6;
            }

            public com.android.aapt.Id getId() {
                if (this.idBuilder_ == null) {
                    return this.valueCase_ == 6 ? (com.android.aapt.Id)this.value_ : com.android.aapt.Id.getDefaultInstance();
                } else {
                    return this.valueCase_ == 6 ? (com.android.aapt.Id)this.idBuilder_.getMessage() : com.android.aapt.Id.getDefaultInstance();
                }
            }

            public com.android.aapt.Item.Builder setId(com.android.aapt.Id value) {
                if (this.idBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.value_ = value;
                    this.onChanged();
                } else {
                    this.idBuilder_.setMessage(value);
                }

                this.valueCase_ = 6;
                return this;
            }

            public com.android.aapt.Item.Builder setId(com.android.aapt.Id.Builder builderForValue) {
                if (this.idBuilder_ == null) {
                    this.value_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.idBuilder_.setMessage(builderForValue.build());
                }

                this.valueCase_ = 6;
                return this;
            }

            public com.android.aapt.Item.Builder mergeId(com.android.aapt.Id value) {
                if (this.idBuilder_ == null) {
                    if (this.valueCase_ == 6 && this.value_ != com.android.aapt.Id.getDefaultInstance()) {
                        this.value_ = com.android.aapt.Id.newBuilder((com.android.aapt.Id)this.value_).mergeFrom(value).buildPartial();
                    } else {
                        this.value_ = value;
                    }

                    this.onChanged();
                } else {
                    if (this.valueCase_ == 6) {
                        this.idBuilder_.mergeFrom(value);
                    }

                    this.idBuilder_.setMessage(value);
                }

                this.valueCase_ = 6;
                return this;
            }

            public com.android.aapt.Item.Builder clearId() {
                if (this.idBuilder_ == null) {
                    if (this.valueCase_ == 6) {
                        this.valueCase_ = 0;
                        this.value_ = null;
                        this.onChanged();
                    }
                } else {
                    if (this.valueCase_ == 6) {
                        this.valueCase_ = 0;
                        this.value_ = null;
                    }

                    this.idBuilder_.clear();
                }

                return this;
            }

            public com.android.aapt.Id.Builder getIdBuilder() {
                return (com.android.aapt.Id.Builder)this.getIdFieldBuilder().getBuilder();
            }

            public com.android.aapt.IdOrBuilder getIdOrBuilder() {
                if (this.valueCase_ == 6 && this.idBuilder_ != null) {
                    return (com.android.aapt.IdOrBuilder)this.idBuilder_.getMessageOrBuilder();
                } else {
                    return this.valueCase_ == 6 ? (com.android.aapt.Id)this.value_ : com.android.aapt.Id.getDefaultInstance();
                }
            }

            private SingleFieldBuilderV3<com.android.aapt.Id, com.android.aapt.Id.Builder, com.android.aapt.IdOrBuilder> getIdFieldBuilder() {
                if (this.idBuilder_ == null) {
                    if (this.valueCase_ != 6) {
                        this.value_ = com.android.aapt.Id.getDefaultInstance();
                    }

                    this.idBuilder_ = new SingleFieldBuilderV3((com.android.aapt.Id)this.value_, this.getParentForChildren(), this.isClean());
                    this.value_ = null;
                }

                this.valueCase_ = 6;
                this.onChanged();
                return this.idBuilder_;
            }

            public boolean hasPrim() {
                return this.valueCase_ == 7;
            }

            public com.android.aapt.Primitive getPrim() {
                if (this.primBuilder_ == null) {
                    return this.valueCase_ == 7 ? (com.android.aapt.Primitive)this.value_ : com.android.aapt.Primitive.getDefaultInstance();
                } else {
                    return this.valueCase_ == 7 ? (com.android.aapt.Primitive)this.primBuilder_.getMessage() : com.android.aapt.Primitive.getDefaultInstance();
                }
            }

            public com.android.aapt.Item.Builder setPrim(com.android.aapt.Primitive value) {
                if (this.primBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.value_ = value;
                    this.onChanged();
                } else {
                    this.primBuilder_.setMessage(value);
                }

                this.valueCase_ = 7;
                return this;
            }

            public com.android.aapt.Item.Builder setPrim(com.android.aapt.Primitive.Builder builderForValue) {
                if (this.primBuilder_ == null) {
                    this.value_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.primBuilder_.setMessage(builderForValue.build());
                }

                this.valueCase_ = 7;
                return this;
            }

            public com.android.aapt.Item.Builder mergePrim(com.android.aapt.Primitive value) {
                if (this.primBuilder_ == null) {
                    if (this.valueCase_ == 7 && this.value_ != com.android.aapt.Primitive.getDefaultInstance()) {
                        this.value_ = com.android.aapt.Primitive.newBuilder((com.android.aapt.Primitive)this.value_).mergeFrom(value).buildPartial();
                    } else {
                        this.value_ = value;
                    }

                    this.onChanged();
                } else {
                    if (this.valueCase_ == 7) {
                        this.primBuilder_.mergeFrom(value);
                    }

                    this.primBuilder_.setMessage(value);
                }

                this.valueCase_ = 7;
                return this;
            }

            public com.android.aapt.Item.Builder clearPrim() {
                if (this.primBuilder_ == null) {
                    if (this.valueCase_ == 7) {
                        this.valueCase_ = 0;
                        this.value_ = null;
                        this.onChanged();
                    }
                } else {
                    if (this.valueCase_ == 7) {
                        this.valueCase_ = 0;
                        this.value_ = null;
                    }

                    this.primBuilder_.clear();
                }

                return this;
            }

            public com.android.aapt.Primitive.Builder getPrimBuilder() {
                return (com.android.aapt.Primitive.Builder)this.getPrimFieldBuilder().getBuilder();
            }

            public com.android.aapt.PrimitiveOrBuilder getPrimOrBuilder() {
                if (this.valueCase_ == 7 && this.primBuilder_ != null) {
                    return (com.android.aapt.PrimitiveOrBuilder)this.primBuilder_.getMessageOrBuilder();
                } else {
                    return this.valueCase_ == 7 ? (com.android.aapt.Primitive)this.value_ : com.android.aapt.Primitive.getDefaultInstance();
                }
            }

            private SingleFieldBuilderV3<com.android.aapt.Primitive, com.android.aapt.Primitive.Builder, com.android.aapt.PrimitiveOrBuilder> getPrimFieldBuilder() {
                if (this.primBuilder_ == null) {
                    if (this.valueCase_ != 7) {
                        this.value_ = com.android.aapt.Primitive.getDefaultInstance();
                    }

                    this.primBuilder_ = new SingleFieldBuilderV3((com.android.aapt.Primitive)this.value_, this.getParentForChildren(), this.isClean());
                    this.value_ = null;
                }

                this.valueCase_ = 7;
                this.onChanged();
                return this.primBuilder_;
            }

            public final com.android.aapt.Item.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.Item.Builder)super.setUnknownFields(unknownFields);
            }

            public final com.android.aapt.Item.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.Item.Builder)super.mergeUnknownFields(unknownFields);
            }
        }

        public static enum ValueCase implements Internal.EnumLite, InternalOneOfEnum {
            REF(1),
            STR(2),
            RAW_STR(3),
            STYLED_STR(4),
            FILE(5),
            ID(6),
            PRIM(7),
            VALUE_NOT_SET(0);

            private final int value;

            private ValueCase(int value) {
                this.value = value;
            }

            /** @deprecated */
            @Deprecated
            public static com.android.aapt.Item.ValueCase valueOf(int value) {
                return forNumber(value);
            }

            public static com.android.aapt.Item.ValueCase forNumber(int value) {
                switch(value) {
                    case 0:
                        return VALUE_NOT_SET;
                    case 1:
                        return REF;
                    case 2:
                        return STR;
                    case 3:
                        return RAW_STR;
                    case 4:
                        return STYLED_STR;
                    case 5:
                        return FILE;
                    case 6:
                        return ID;
                    case 7:
                        return PRIM;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.value;
            }
        }
    }