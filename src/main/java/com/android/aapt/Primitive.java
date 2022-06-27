package com.android.aapt;

import com.android.aapt.ConfigurationOuterClass.Configuration;
import com.android.aapt.ConfigurationOuterClass.ConfigurationOrBuilder;
import com.google.protobuf.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Primitive extends GeneratedMessageV3 implements com.android.aapt.PrimitiveOrBuilder {
        private static final long serialVersionUID = 0L;
        private int oneofValueCase_;
        private Object oneofValue_;
        public static final int NULL_VALUE_FIELD_NUMBER = 1;
        public static final int EMPTY_VALUE_FIELD_NUMBER = 2;
        public static final int FLOAT_VALUE_FIELD_NUMBER = 3;
        public static final int DIMENSION_VALUE_FIELD_NUMBER = 13;
        public static final int FRACTION_VALUE_FIELD_NUMBER = 14;
        public static final int INT_DECIMAL_VALUE_FIELD_NUMBER = 6;
        public static final int INT_HEXADECIMAL_VALUE_FIELD_NUMBER = 7;
        public static final int BOOLEAN_VALUE_FIELD_NUMBER = 8;
        public static final int COLOR_ARGB8_VALUE_FIELD_NUMBER = 9;
        public static final int COLOR_RGB8_VALUE_FIELD_NUMBER = 10;
        public static final int COLOR_ARGB4_VALUE_FIELD_NUMBER = 11;
        public static final int COLOR_RGB4_VALUE_FIELD_NUMBER = 12;
        public static final int DIMENSION_VALUE_DEPRECATED_FIELD_NUMBER = 4;
        public static final int FRACTION_VALUE_DEPRECATED_FIELD_NUMBER = 5;
        private byte memoizedIsInitialized;
        private static final com.android.aapt.Primitive DEFAULT_INSTANCE = new com.android.aapt.Primitive();
        private static final Parser<com.android.aapt.Primitive> PARSER = new AbstractParser<com.android.aapt.Primitive>() {
            public com.android.aapt.Primitive parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new com.android.aapt.Primitive(input, extensionRegistry);
            }
        };

        private Primitive(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.oneofValueCase_ = 0;
            this.memoizedIsInitialized = -1;
        }

        private Primitive() {
            this.oneofValueCase_ = 0;
            this.memoizedIsInitialized = -1;
        }

        @Override
        public Object newInstance(UnusedPrivateParameter unused) {
            return new com.android.aapt.Primitive();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Primitive(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                com.android.aapt.Primitive.NullType.Builder subBuilder = null;
                                if (this.oneofValueCase_ == 1) {
                                    subBuilder = ((com.android.aapt.Primitive.NullType)this.oneofValue_).toBuilder();
                                }

                                this.oneofValue_ = input.readMessage(com.android.aapt.Primitive.NullType.parser(), extensionRegistry);
                                if (subBuilder != null) {
                                    subBuilder.mergeFrom((com.android.aapt.Primitive.NullType)this.oneofValue_);
                                    this.oneofValue_ = subBuilder.buildPartial();
                                }

                                this.oneofValueCase_ = 1;
                                break;
                            case 18:
                                com.android.aapt.Primitive.EmptyType.Builder subBuilder2 = null;
                                if (this.oneofValueCase_ == 2) {
                                    subBuilder2 = ((com.android.aapt.Primitive.EmptyType)this.oneofValue_).toBuilder();
                                }

                                this.oneofValue_ = input.readMessage(com.android.aapt.Primitive.EmptyType.parser(), extensionRegistry);
                                if (subBuilder2 != null) {
                                    subBuilder2.mergeFrom((com.android.aapt.Primitive.EmptyType)this.oneofValue_);
                                    this.oneofValue_ = subBuilder2.buildPartial();
                                }

                                this.oneofValueCase_ = 2;
                                break;
                            case 29:
                                this.oneofValueCase_ = 3;
                                this.oneofValue_ = input.readFloat();
                                break;
                            case 37:
                                this.oneofValueCase_ = 4;
                                this.oneofValue_ = input.readFloat();
                                break;
                            case 45:
                                this.oneofValueCase_ = 5;
                                this.oneofValue_ = input.readFloat();
                                break;
                            case 48:
                                this.oneofValueCase_ = 6;
                                this.oneofValue_ = input.readInt32();
                                break;
                            case 56:
                                this.oneofValueCase_ = 7;
                                this.oneofValue_ = input.readUInt32();
                                break;
                            case 64:
                                this.oneofValueCase_ = 8;
                                this.oneofValue_ = input.readBool();
                                break;
                            case 72:
                                this.oneofValueCase_ = 9;
                                this.oneofValue_ = input.readUInt32();
                                break;
                            case 80:
                                this.oneofValueCase_ = 10;
                                this.oneofValue_ = input.readUInt32();
                                break;
                            case 88:
                                this.oneofValueCase_ = 11;
                                this.oneofValue_ = input.readUInt32();
                                break;
                            case 96:
                                this.oneofValueCase_ = 12;
                                this.oneofValue_ = input.readUInt32();
                                break;
                            case 104:
                                this.oneofValueCase_ = 13;
                                this.oneofValue_ = input.readUInt32();
                                break;
                            case 112:
                                this.oneofValueCase_ = 14;
                                this.oneofValue_ = input.readUInt32();
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
            return Resources.internal_static_aapt_pb_Primitive_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_Primitive_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.Primitive.class, com.android.aapt.Primitive.Builder.class);
        }

        public com.android.aapt.Primitive.OneofValueCase getOneofValueCase() {
            return com.android.aapt.Primitive.OneofValueCase.forNumber(this.oneofValueCase_);
        }

        public boolean hasNullValue() {
            return this.oneofValueCase_ == 1;
        }

        public com.android.aapt.Primitive.NullType getNullValue() {
            return this.oneofValueCase_ == 1 ? (com.android.aapt.Primitive.NullType)this.oneofValue_ : com.android.aapt.Primitive.NullType.getDefaultInstance();
        }

        public com.android.aapt.Primitive.NullTypeOrBuilder getNullValueOrBuilder() {
            return this.oneofValueCase_ == 1 ? (com.android.aapt.Primitive.NullType)this.oneofValue_ : com.android.aapt.Primitive.NullType.getDefaultInstance();
        }

        public boolean hasEmptyValue() {
            return this.oneofValueCase_ == 2;
        }

        public com.android.aapt.Primitive.EmptyType getEmptyValue() {
            return this.oneofValueCase_ == 2 ? (com.android.aapt.Primitive.EmptyType)this.oneofValue_ : com.android.aapt.Primitive.EmptyType.getDefaultInstance();
        }

        public com.android.aapt.Primitive.EmptyTypeOrBuilder getEmptyValueOrBuilder() {
            return this.oneofValueCase_ == 2 ? (com.android.aapt.Primitive.EmptyType)this.oneofValue_ : com.android.aapt.Primitive.EmptyType.getDefaultInstance();
        }

        public float getFloatValue() {
            return this.oneofValueCase_ == 3 ? (Float)this.oneofValue_ : 0.0F;
        }

        public int getDimensionValue() {
            return this.oneofValueCase_ == 13 ? (Integer)this.oneofValue_ : 0;
        }

        public int getFractionValue() {
            return this.oneofValueCase_ == 14 ? (Integer)this.oneofValue_ : 0;
        }

        public int getIntDecimalValue() {
            return this.oneofValueCase_ == 6 ? (Integer)this.oneofValue_ : 0;
        }

        public int getIntHexadecimalValue() {
            return this.oneofValueCase_ == 7 ? (Integer)this.oneofValue_ : 0;
        }

        public boolean getBooleanValue() {
            return this.oneofValueCase_ == 8 ? (java.lang.Boolean)this.oneofValue_ : false;
        }

        public int getColorArgb8Value() {
            return this.oneofValueCase_ == 9 ? (Integer)this.oneofValue_ : 0;
        }

        public int getColorRgb8Value() {
            return this.oneofValueCase_ == 10 ? (Integer)this.oneofValue_ : 0;
        }

        public int getColorArgb4Value() {
            return this.oneofValueCase_ == 11 ? (Integer)this.oneofValue_ : 0;
        }

        public int getColorRgb4Value() {
            return this.oneofValueCase_ == 12 ? (Integer)this.oneofValue_ : 0;
        }

        /** @deprecated */
        @Deprecated
        public float getDimensionValueDeprecated() {
            return this.oneofValueCase_ == 4 ? (Float)this.oneofValue_ : 0.0F;
        }

        /** @deprecated */
        @Deprecated
        public float getFractionValueDeprecated() {
            return this.oneofValueCase_ == 5 ? (Float)this.oneofValue_ : 0.0F;
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
            if (this.oneofValueCase_ == 1) {
                output.writeMessage(1, (com.android.aapt.Primitive.NullType)this.oneofValue_);
            }

            if (this.oneofValueCase_ == 2) {
                output.writeMessage(2, (com.android.aapt.Primitive.EmptyType)this.oneofValue_);
            }

            if (this.oneofValueCase_ == 3) {
                output.writeFloat(3, (Float)this.oneofValue_);
            }

            if (this.oneofValueCase_ == 4) {
                output.writeFloat(4, (Float)this.oneofValue_);
            }

            if (this.oneofValueCase_ == 5) {
                output.writeFloat(5, (Float)this.oneofValue_);
            }

            if (this.oneofValueCase_ == 6) {
                output.writeInt32(6, (Integer)this.oneofValue_);
            }

            if (this.oneofValueCase_ == 7) {
                output.writeUInt32(7, (Integer)this.oneofValue_);
            }

            if (this.oneofValueCase_ == 8) {
                output.writeBool(8, (java.lang.Boolean)this.oneofValue_);
            }

            if (this.oneofValueCase_ == 9) {
                output.writeUInt32(9, (Integer)this.oneofValue_);
            }

            if (this.oneofValueCase_ == 10) {
                output.writeUInt32(10, (Integer)this.oneofValue_);
            }

            if (this.oneofValueCase_ == 11) {
                output.writeUInt32(11, (Integer)this.oneofValue_);
            }

            if (this.oneofValueCase_ == 12) {
                output.writeUInt32(12, (Integer)this.oneofValue_);
            }

            if (this.oneofValueCase_ == 13) {
                output.writeUInt32(13, (Integer)this.oneofValue_);
            }

            if (this.oneofValueCase_ == 14) {
                output.writeUInt32(14, (Integer)this.oneofValue_);
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
                if (this.oneofValueCase_ == 1) {
                    size += CodedOutputStream.computeMessageSize(1, (com.android.aapt.Primitive.NullType)this.oneofValue_);
                }

                if (this.oneofValueCase_ == 2) {
                    size += CodedOutputStream.computeMessageSize(2, (com.android.aapt.Primitive.EmptyType)this.oneofValue_);
                }

                if (this.oneofValueCase_ == 3) {
                    size += CodedOutputStream.computeFloatSize(3, (Float)this.oneofValue_);
                }

                if (this.oneofValueCase_ == 4) {
                    size += CodedOutputStream.computeFloatSize(4, (Float)this.oneofValue_);
                }

                if (this.oneofValueCase_ == 5) {
                    size += CodedOutputStream.computeFloatSize(5, (Float)this.oneofValue_);
                }

                if (this.oneofValueCase_ == 6) {
                    size += CodedOutputStream.computeInt32Size(6, (Integer)this.oneofValue_);
                }

                if (this.oneofValueCase_ == 7) {
                    size += CodedOutputStream.computeUInt32Size(7, (Integer)this.oneofValue_);
                }

                if (this.oneofValueCase_ == 8) {
                    size += CodedOutputStream.computeBoolSize(8, (java.lang.Boolean)this.oneofValue_);
                }

                if (this.oneofValueCase_ == 9) {
                    size += CodedOutputStream.computeUInt32Size(9, (Integer)this.oneofValue_);
                }

                if (this.oneofValueCase_ == 10) {
                    size += CodedOutputStream.computeUInt32Size(10, (Integer)this.oneofValue_);
                }

                if (this.oneofValueCase_ == 11) {
                    size += CodedOutputStream.computeUInt32Size(11, (Integer)this.oneofValue_);
                }

                if (this.oneofValueCase_ == 12) {
                    size += CodedOutputStream.computeUInt32Size(12, (Integer)this.oneofValue_);
                }

                if (this.oneofValueCase_ == 13) {
                    size += CodedOutputStream.computeUInt32Size(13, (Integer)this.oneofValue_);
                }

                if (this.oneofValueCase_ == 14) {
                    size += CodedOutputStream.computeUInt32Size(14, (Integer)this.oneofValue_);
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
            } else if (!(obj instanceof com.android.aapt.Primitive)) {
                return super.equals(obj);
            } else {
                com.android.aapt.Primitive other = (com.android.aapt.Primitive)obj;
                if (!this.getOneofValueCase().equals(other.getOneofValueCase())) {
                    return false;
                } else {
                    switch(this.oneofValueCase_) {
                        case 0:
                        default:
                            break;
                        case 1:
                            if (!this.getNullValue().equals(other.getNullValue())) {
                                return false;
                            }
                            break;
                        case 2:
                            if (!this.getEmptyValue().equals(other.getEmptyValue())) {
                                return false;
                            }
                            break;
                        case 3:
                            if (Float.floatToIntBits(this.getFloatValue()) != Float.floatToIntBits(other.getFloatValue())) {
                                return false;
                            }
                            break;
                        case 4:
                            if (Float.floatToIntBits(this.getDimensionValueDeprecated()) != Float.floatToIntBits(other.getDimensionValueDeprecated())) {
                                return false;
                            }
                            break;
                        case 5:
                            if (Float.floatToIntBits(this.getFractionValueDeprecated()) != Float.floatToIntBits(other.getFractionValueDeprecated())) {
                                return false;
                            }
                            break;
                        case 6:
                            if (this.getIntDecimalValue() != other.getIntDecimalValue()) {
                                return false;
                            }
                            break;
                        case 7:
                            if (this.getIntHexadecimalValue() != other.getIntHexadecimalValue()) {
                                return false;
                            }
                            break;
                        case 8:
                            if (this.getBooleanValue() != other.getBooleanValue()) {
                                return false;
                            }
                            break;
                        case 9:
                            if (this.getColorArgb8Value() != other.getColorArgb8Value()) {
                                return false;
                            }
                            break;
                        case 10:
                            if (this.getColorRgb8Value() != other.getColorRgb8Value()) {
                                return false;
                            }
                            break;
                        case 11:
                            if (this.getColorArgb4Value() != other.getColorArgb4Value()) {
                                return false;
                            }
                            break;
                        case 12:
                            if (this.getColorRgb4Value() != other.getColorRgb4Value()) {
                                return false;
                            }
                            break;
                        case 13:
                            if (this.getDimensionValue() != other.getDimensionValue()) {
                                return false;
                            }
                            break;
                        case 14:
                            if (this.getFractionValue() != other.getFractionValue()) {
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
                switch(this.oneofValueCase_) {
                    case 0:
                    default:
                        break;
                    case 1:
                        hash = 37 * hash + 1;
                        hash = 53 * hash + this.getNullValue().hashCode();
                        break;
                    case 2:
                        hash = 37 * hash + 2;
                        hash = 53 * hash + this.getEmptyValue().hashCode();
                        break;
                    case 3:
                        hash = 37 * hash + 3;
                        hash = 53 * hash + Float.floatToIntBits(this.getFloatValue());
                        break;
                    case 4:
                        hash = 37 * hash + 4;
                        hash = 53 * hash + Float.floatToIntBits(this.getDimensionValueDeprecated());
                        break;
                    case 5:
                        hash = 37 * hash + 5;
                        hash = 53 * hash + Float.floatToIntBits(this.getFractionValueDeprecated());
                        break;
                    case 6:
                        hash = 37 * hash + 6;
                        hash = 53 * hash + this.getIntDecimalValue();
                        break;
                    case 7:
                        hash = 37 * hash + 7;
                        hash = 53 * hash + this.getIntHexadecimalValue();
                        break;
                    case 8:
                        hash = 37 * hash + 8;
                        hash = 53 * hash + Internal.hashBoolean(this.getBooleanValue());
                        break;
                    case 9:
                        hash = 37 * hash + 9;
                        hash = 53 * hash + this.getColorArgb8Value();
                        break;
                    case 10:
                        hash = 37 * hash + 10;
                        hash = 53 * hash + this.getColorRgb8Value();
                        break;
                    case 11:
                        hash = 37 * hash + 11;
                        hash = 53 * hash + this.getColorArgb4Value();
                        break;
                    case 12:
                        hash = 37 * hash + 12;
                        hash = 53 * hash + this.getColorRgb4Value();
                        break;
                    case 13:
                        hash = 37 * hash + 13;
                        hash = 53 * hash + this.getDimensionValue();
                        break;
                    case 14:
                        hash = 37 * hash + 14;
                        hash = 53 * hash + this.getFractionValue();
                }

                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static com.android.aapt.Primitive parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Primitive)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Primitive parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Primitive)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Primitive parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Primitive)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Primitive parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Primitive)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Primitive parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Primitive)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Primitive parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Primitive)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Primitive parseFrom(InputStream input) throws IOException {
            return (com.android.aapt.Primitive)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.Primitive parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Primitive)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.Primitive parseDelimitedFrom(InputStream input) throws IOException {
            return (com.android.aapt.Primitive)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static com.android.aapt.Primitive parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Primitive)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.Primitive parseFrom(CodedInputStream input) throws IOException {
            return (com.android.aapt.Primitive)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.Primitive parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Primitive)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public com.android.aapt.Primitive.Builder newBuilderForType() {
            return newBuilder();
        }

        public static com.android.aapt.Primitive.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static com.android.aapt.Primitive.Builder newBuilder(com.android.aapt.Primitive prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public com.android.aapt.Primitive.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new com.android.aapt.Primitive.Builder() : (new com.android.aapt.Primitive.Builder()).mergeFrom(this);
        }

        public com.android.aapt.Primitive.Builder newBuilderForType(BuilderParent parent) {
            com.android.aapt.Primitive.Builder builder = new com.android.aapt.Primitive.Builder(parent);
            return builder;
        }

        public static com.android.aapt.Primitive getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<com.android.aapt.Primitive> parser() {
            return PARSER;
        }

        public Parser<com.android.aapt.Primitive> getParserForType() {
            return PARSER;
        }

        public com.android.aapt.Primitive getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.Primitive.Builder> implements com.android.aapt.PrimitiveOrBuilder {
            private int oneofValueCase_;
            private Object oneofValue_;
            private SingleFieldBuilderV3<com.android.aapt.Primitive.NullType, com.android.aapt.Primitive.NullType.Builder, com.android.aapt.Primitive.NullTypeOrBuilder> nullValueBuilder_;
            private SingleFieldBuilderV3<com.android.aapt.Primitive.EmptyType, com.android.aapt.Primitive.EmptyType.Builder, com.android.aapt.Primitive.EmptyTypeOrBuilder> emptyValueBuilder_;

            public static Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_Primitive_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_Primitive_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.Primitive.class, com.android.aapt.Primitive.Builder.class);
            }

            private Builder() {
                this.oneofValueCase_ = 0;
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.oneofValueCase_ = 0;
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.android.aapt.Primitive.alwaysUseFieldBuilders) {
                }

            }

            public com.android.aapt.Primitive.Builder clear() {
                super.clear();
                this.oneofValueCase_ = 0;
                this.oneofValue_ = null;
                return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Resources.internal_static_aapt_pb_Primitive_descriptor;
            }

            public com.android.aapt.Primitive getDefaultInstanceForType() {
                return com.android.aapt.Primitive.getDefaultInstance();
            }

            public com.android.aapt.Primitive build() {
                com.android.aapt.Primitive result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public com.android.aapt.Primitive buildPartial() {
                com.android.aapt.Primitive result = new com.android.aapt.Primitive(this);
                if (this.oneofValueCase_ == 1) {
                    if (this.nullValueBuilder_ == null) {
                        result.oneofValue_ = this.oneofValue_;
                    } else {
                        result.oneofValue_ = this.nullValueBuilder_.build();
                    }
                }

                if (this.oneofValueCase_ == 2) {
                    if (this.emptyValueBuilder_ == null) {
                        result.oneofValue_ = this.oneofValue_;
                    } else {
                        result.oneofValue_ = this.emptyValueBuilder_.build();
                    }
                }

                if (this.oneofValueCase_ == 3) {
                    result.oneofValue_ = this.oneofValue_;
                }

                if (this.oneofValueCase_ == 13) {
                    result.oneofValue_ = this.oneofValue_;
                }

                if (this.oneofValueCase_ == 14) {
                    result.oneofValue_ = this.oneofValue_;
                }

                if (this.oneofValueCase_ == 6) {
                    result.oneofValue_ = this.oneofValue_;
                }

                if (this.oneofValueCase_ == 7) {
                    result.oneofValue_ = this.oneofValue_;
                }

                if (this.oneofValueCase_ == 8) {
                    result.oneofValue_ = this.oneofValue_;
                }

                if (this.oneofValueCase_ == 9) {
                    result.oneofValue_ = this.oneofValue_;
                }

                if (this.oneofValueCase_ == 10) {
                    result.oneofValue_ = this.oneofValue_;
                }

                if (this.oneofValueCase_ == 11) {
                    result.oneofValue_ = this.oneofValue_;
                }

                if (this.oneofValueCase_ == 12) {
                    result.oneofValue_ = this.oneofValue_;
                }

                if (this.oneofValueCase_ == 4) {
                    result.oneofValue_ = this.oneofValue_;
                }

                if (this.oneofValueCase_ == 5) {
                    result.oneofValue_ = this.oneofValue_;
                }

                result.oneofValueCase_ = this.oneofValueCase_;
                this.onBuilt();
                return result;
            }

            public com.android.aapt.Primitive.Builder clone() {
                return (com.android.aapt.Primitive.Builder)super.clone();
            }

            public com.android.aapt.Primitive.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.Primitive.Builder)super.setField(field, value);
            }

            public com.android.aapt.Primitive.Builder clearField(Descriptors.FieldDescriptor field) {
                return (com.android.aapt.Primitive.Builder)super.clearField(field);
            }

            public com.android.aapt.Primitive.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (com.android.aapt.Primitive.Builder)super.clearOneof(oneof);
            }

            public com.android.aapt.Primitive.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (com.android.aapt.Primitive.Builder)super.setRepeatedField(field, index, value);
            }

            public com.android.aapt.Primitive.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.Primitive.Builder)super.addRepeatedField(field, value);
            }

            public com.android.aapt.Primitive.Builder mergeFrom(Message other) {
                if (other instanceof com.android.aapt.Primitive) {
                    return this.mergeFrom((com.android.aapt.Primitive)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public com.android.aapt.Primitive.Builder mergeFrom(com.android.aapt.Primitive other) {
                if (other == com.android.aapt.Primitive.getDefaultInstance()) {
                    return this;
                } else {
                    switch(other.getOneofValueCase()) {
                        case NULL_VALUE:
                            this.mergeNullValue(other.getNullValue());
                            break;
                        case EMPTY_VALUE:
                            this.mergeEmptyValue(other.getEmptyValue());
                            break;
                        case FLOAT_VALUE:
                            this.setFloatValue(other.getFloatValue());
                            break;
                        case DIMENSION_VALUE:
                            this.setDimensionValue(other.getDimensionValue());
                            break;
                        case FRACTION_VALUE:
                            this.setFractionValue(other.getFractionValue());
                            break;
                        case INT_DECIMAL_VALUE:
                            this.setIntDecimalValue(other.getIntDecimalValue());
                            break;
                        case INT_HEXADECIMAL_VALUE:
                            this.setIntHexadecimalValue(other.getIntHexadecimalValue());
                            break;
                        case BOOLEAN_VALUE:
                            this.setBooleanValue(other.getBooleanValue());
                            break;
                        case COLOR_ARGB8_VALUE:
                            this.setColorArgb8Value(other.getColorArgb8Value());
                            break;
                        case COLOR_RGB8_VALUE:
                            this.setColorRgb8Value(other.getColorRgb8Value());
                            break;
                        case COLOR_ARGB4_VALUE:
                            this.setColorArgb4Value(other.getColorArgb4Value());
                            break;
                        case COLOR_RGB4_VALUE:
                            this.setColorRgb4Value(other.getColorRgb4Value());
                            break;
                        case DIMENSION_VALUE_DEPRECATED:
                            this.setDimensionValueDeprecated(other.getDimensionValueDeprecated());
                            break;
                        case FRACTION_VALUE_DEPRECATED:
                            this.setFractionValueDeprecated(other.getFractionValueDeprecated());
                        case ONEOFVALUE_NOT_SET:
                    }

                    this.mergeUnknownFields(other.unknownFields);
                    this.onChanged();
                    return this;
                }
            }

            public final boolean isInitialized() {
                return true;
            }

            public com.android.aapt.Primitive.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                com.android.aapt.Primitive parsedMessage = null;

                try {
                    parsedMessage = (com.android.aapt.Primitive)com.android.aapt.Primitive.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (com.android.aapt.Primitive)var8.getUnfinishedMessage();
                    throw var8.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }

                }

                return this;
            }

            public com.android.aapt.Primitive.OneofValueCase getOneofValueCase() {
                return com.android.aapt.Primitive.OneofValueCase.forNumber(this.oneofValueCase_);
            }

            public com.android.aapt.Primitive.Builder clearOneofValue() {
                this.oneofValueCase_ = 0;
                this.oneofValue_ = null;
                this.onChanged();
                return this;
            }

            public boolean hasNullValue() {
                return this.oneofValueCase_ == 1;
            }

            public com.android.aapt.Primitive.NullType getNullValue() {
                if (this.nullValueBuilder_ == null) {
                    return this.oneofValueCase_ == 1 ? (com.android.aapt.Primitive.NullType)this.oneofValue_ : com.android.aapt.Primitive.NullType.getDefaultInstance();
                } else {
                    return this.oneofValueCase_ == 1 ? (com.android.aapt.Primitive.NullType)this.nullValueBuilder_.getMessage() : com.android.aapt.Primitive.NullType.getDefaultInstance();
                }
            }

            public com.android.aapt.Primitive.Builder setNullValue(com.android.aapt.Primitive.NullType value) {
                if (this.nullValueBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.oneofValue_ = value;
                    this.onChanged();
                } else {
                    this.nullValueBuilder_.setMessage(value);
                }

                this.oneofValueCase_ = 1;
                return this;
            }

            public com.android.aapt.Primitive.Builder setNullValue(com.android.aapt.Primitive.NullType.Builder builderForValue) {
                if (this.nullValueBuilder_ == null) {
                    this.oneofValue_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.nullValueBuilder_.setMessage(builderForValue.build());
                }

                this.oneofValueCase_ = 1;
                return this;
            }

            public com.android.aapt.Primitive.Builder mergeNullValue(com.android.aapt.Primitive.NullType value) {
                if (this.nullValueBuilder_ == null) {
                    if (this.oneofValueCase_ == 1 && this.oneofValue_ != com.android.aapt.Primitive.NullType.getDefaultInstance()) {
                        this.oneofValue_ = com.android.aapt.Primitive.NullType.newBuilder((com.android.aapt.Primitive.NullType)this.oneofValue_).mergeFrom(value).buildPartial();
                    } else {
                        this.oneofValue_ = value;
                    }

                    this.onChanged();
                } else {
                    if (this.oneofValueCase_ == 1) {
                        this.nullValueBuilder_.mergeFrom(value);
                    }

                    this.nullValueBuilder_.setMessage(value);
                }

                this.oneofValueCase_ = 1;
                return this;
            }

            public com.android.aapt.Primitive.Builder clearNullValue() {
                if (this.nullValueBuilder_ == null) {
                    if (this.oneofValueCase_ == 1) {
                        this.oneofValueCase_ = 0;
                        this.oneofValue_ = null;
                        this.onChanged();
                    }
                } else {
                    if (this.oneofValueCase_ == 1) {
                        this.oneofValueCase_ = 0;
                        this.oneofValue_ = null;
                    }

                    this.nullValueBuilder_.clear();
                }

                return this;
            }

            public com.android.aapt.Primitive.NullType.Builder getNullValueBuilder() {
                return (com.android.aapt.Primitive.NullType.Builder)this.getNullValueFieldBuilder().getBuilder();
            }

            public com.android.aapt.Primitive.NullTypeOrBuilder getNullValueOrBuilder() {
                if (this.oneofValueCase_ == 1 && this.nullValueBuilder_ != null) {
                    return (com.android.aapt.Primitive.NullTypeOrBuilder)this.nullValueBuilder_.getMessageOrBuilder();
                } else {
                    return this.oneofValueCase_ == 1 ? (com.android.aapt.Primitive.NullType)this.oneofValue_ : com.android.aapt.Primitive.NullType.getDefaultInstance();
                }
            }

            private SingleFieldBuilderV3<com.android.aapt.Primitive.NullType, com.android.aapt.Primitive.NullType.Builder, com.android.aapt.Primitive.NullTypeOrBuilder> getNullValueFieldBuilder() {
                if (this.nullValueBuilder_ == null) {
                    if (this.oneofValueCase_ != 1) {
                        this.oneofValue_ = com.android.aapt.Primitive.NullType.getDefaultInstance();
                    }

                    this.nullValueBuilder_ = new SingleFieldBuilderV3((com.android.aapt.Primitive.NullType)this.oneofValue_, this.getParentForChildren(), this.isClean());
                    this.oneofValue_ = null;
                }

                this.oneofValueCase_ = 1;
                this.onChanged();
                return this.nullValueBuilder_;
            }

            public boolean hasEmptyValue() {
                return this.oneofValueCase_ == 2;
            }

            public com.android.aapt.Primitive.EmptyType getEmptyValue() {
                if (this.emptyValueBuilder_ == null) {
                    return this.oneofValueCase_ == 2 ? (com.android.aapt.Primitive.EmptyType)this.oneofValue_ : com.android.aapt.Primitive.EmptyType.getDefaultInstance();
                } else {
                    return this.oneofValueCase_ == 2 ? (com.android.aapt.Primitive.EmptyType)this.emptyValueBuilder_.getMessage() : com.android.aapt.Primitive.EmptyType.getDefaultInstance();
                }
            }

            public com.android.aapt.Primitive.Builder setEmptyValue(com.android.aapt.Primitive.EmptyType value) {
                if (this.emptyValueBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.oneofValue_ = value;
                    this.onChanged();
                } else {
                    this.emptyValueBuilder_.setMessage(value);
                }

                this.oneofValueCase_ = 2;
                return this;
            }

            public com.android.aapt.Primitive.Builder setEmptyValue(com.android.aapt.Primitive.EmptyType.Builder builderForValue) {
                if (this.emptyValueBuilder_ == null) {
                    this.oneofValue_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.emptyValueBuilder_.setMessage(builderForValue.build());
                }

                this.oneofValueCase_ = 2;
                return this;
            }

            public com.android.aapt.Primitive.Builder mergeEmptyValue(com.android.aapt.Primitive.EmptyType value) {
                if (this.emptyValueBuilder_ == null) {
                    if (this.oneofValueCase_ == 2 && this.oneofValue_ != com.android.aapt.Primitive.EmptyType.getDefaultInstance()) {
                        this.oneofValue_ = com.android.aapt.Primitive.EmptyType.newBuilder((com.android.aapt.Primitive.EmptyType)this.oneofValue_).mergeFrom(value).buildPartial();
                    } else {
                        this.oneofValue_ = value;
                    }

                    this.onChanged();
                } else {
                    if (this.oneofValueCase_ == 2) {
                        this.emptyValueBuilder_.mergeFrom(value);
                    }

                    this.emptyValueBuilder_.setMessage(value);
                }

                this.oneofValueCase_ = 2;
                return this;
            }

            public com.android.aapt.Primitive.Builder clearEmptyValue() {
                if (this.emptyValueBuilder_ == null) {
                    if (this.oneofValueCase_ == 2) {
                        this.oneofValueCase_ = 0;
                        this.oneofValue_ = null;
                        this.onChanged();
                    }
                } else {
                    if (this.oneofValueCase_ == 2) {
                        this.oneofValueCase_ = 0;
                        this.oneofValue_ = null;
                    }

                    this.emptyValueBuilder_.clear();
                }

                return this;
            }

            public com.android.aapt.Primitive.EmptyType.Builder getEmptyValueBuilder() {
                return (com.android.aapt.Primitive.EmptyType.Builder)this.getEmptyValueFieldBuilder().getBuilder();
            }

            public com.android.aapt.Primitive.EmptyTypeOrBuilder getEmptyValueOrBuilder() {
                if (this.oneofValueCase_ == 2 && this.emptyValueBuilder_ != null) {
                    return (com.android.aapt.Primitive.EmptyTypeOrBuilder)this.emptyValueBuilder_.getMessageOrBuilder();
                } else {
                    return this.oneofValueCase_ == 2 ? (com.android.aapt.Primitive.EmptyType)this.oneofValue_ : com.android.aapt.Primitive.EmptyType.getDefaultInstance();
                }
            }

            private SingleFieldBuilderV3<com.android.aapt.Primitive.EmptyType, com.android.aapt.Primitive.EmptyType.Builder, com.android.aapt.Primitive.EmptyTypeOrBuilder> getEmptyValueFieldBuilder() {
                if (this.emptyValueBuilder_ == null) {
                    if (this.oneofValueCase_ != 2) {
                        this.oneofValue_ = com.android.aapt.Primitive.EmptyType.getDefaultInstance();
                    }

                    this.emptyValueBuilder_ = new SingleFieldBuilderV3((com.android.aapt.Primitive.EmptyType)this.oneofValue_, this.getParentForChildren(), this.isClean());
                    this.oneofValue_ = null;
                }

                this.oneofValueCase_ = 2;
                this.onChanged();
                return this.emptyValueBuilder_;
            }

            public float getFloatValue() {
                return this.oneofValueCase_ == 3 ? (Float)this.oneofValue_ : 0.0F;
            }

            public com.android.aapt.Primitive.Builder setFloatValue(float value) {
                this.oneofValueCase_ = 3;
                this.oneofValue_ = value;
                this.onChanged();
                return this;
            }

            public com.android.aapt.Primitive.Builder clearFloatValue() {
                if (this.oneofValueCase_ == 3) {
                    this.oneofValueCase_ = 0;
                    this.oneofValue_ = null;
                    this.onChanged();
                }

                return this;
            }

            public int getDimensionValue() {
                return this.oneofValueCase_ == 13 ? (Integer)this.oneofValue_ : 0;
            }

            public com.android.aapt.Primitive.Builder setDimensionValue(int value) {
                this.oneofValueCase_ = 13;
                this.oneofValue_ = value;
                this.onChanged();
                return this;
            }

            public com.android.aapt.Primitive.Builder clearDimensionValue() {
                if (this.oneofValueCase_ == 13) {
                    this.oneofValueCase_ = 0;
                    this.oneofValue_ = null;
                    this.onChanged();
                }

                return this;
            }

            public int getFractionValue() {
                return this.oneofValueCase_ == 14 ? (Integer)this.oneofValue_ : 0;
            }

            public com.android.aapt.Primitive.Builder setFractionValue(int value) {
                this.oneofValueCase_ = 14;
                this.oneofValue_ = value;
                this.onChanged();
                return this;
            }

            public com.android.aapt.Primitive.Builder clearFractionValue() {
                if (this.oneofValueCase_ == 14) {
                    this.oneofValueCase_ = 0;
                    this.oneofValue_ = null;
                    this.onChanged();
                }

                return this;
            }

            public int getIntDecimalValue() {
                return this.oneofValueCase_ == 6 ? (Integer)this.oneofValue_ : 0;
            }

            public com.android.aapt.Primitive.Builder setIntDecimalValue(int value) {
                this.oneofValueCase_ = 6;
                this.oneofValue_ = value;
                this.onChanged();
                return this;
            }

            public com.android.aapt.Primitive.Builder clearIntDecimalValue() {
                if (this.oneofValueCase_ == 6) {
                    this.oneofValueCase_ = 0;
                    this.oneofValue_ = null;
                    this.onChanged();
                }

                return this;
            }

            public int getIntHexadecimalValue() {
                return this.oneofValueCase_ == 7 ? (Integer)this.oneofValue_ : 0;
            }

            public com.android.aapt.Primitive.Builder setIntHexadecimalValue(int value) {
                this.oneofValueCase_ = 7;
                this.oneofValue_ = value;
                this.onChanged();
                return this;
            }

            public com.android.aapt.Primitive.Builder clearIntHexadecimalValue() {
                if (this.oneofValueCase_ == 7) {
                    this.oneofValueCase_ = 0;
                    this.oneofValue_ = null;
                    this.onChanged();
                }

                return this;
            }

            public boolean getBooleanValue() {
                return this.oneofValueCase_ == 8 ? (java.lang.Boolean)this.oneofValue_ : false;
            }

            public com.android.aapt.Primitive.Builder setBooleanValue(boolean value) {
                this.oneofValueCase_ = 8;
                this.oneofValue_ = value;
                this.onChanged();
                return this;
            }

            public com.android.aapt.Primitive.Builder clearBooleanValue() {
                if (this.oneofValueCase_ == 8) {
                    this.oneofValueCase_ = 0;
                    this.oneofValue_ = null;
                    this.onChanged();
                }

                return this;
            }

            public int getColorArgb8Value() {
                return this.oneofValueCase_ == 9 ? (Integer)this.oneofValue_ : 0;
            }

            public com.android.aapt.Primitive.Builder setColorArgb8Value(int value) {
                this.oneofValueCase_ = 9;
                this.oneofValue_ = value;
                this.onChanged();
                return this;
            }

            public com.android.aapt.Primitive.Builder clearColorArgb8Value() {
                if (this.oneofValueCase_ == 9) {
                    this.oneofValueCase_ = 0;
                    this.oneofValue_ = null;
                    this.onChanged();
                }

                return this;
            }

            public int getColorRgb8Value() {
                return this.oneofValueCase_ == 10 ? (Integer)this.oneofValue_ : 0;
            }

            public com.android.aapt.Primitive.Builder setColorRgb8Value(int value) {
                this.oneofValueCase_ = 10;
                this.oneofValue_ = value;
                this.onChanged();
                return this;
            }

            public com.android.aapt.Primitive.Builder clearColorRgb8Value() {
                if (this.oneofValueCase_ == 10) {
                    this.oneofValueCase_ = 0;
                    this.oneofValue_ = null;
                    this.onChanged();
                }

                return this;
            }

            public int getColorArgb4Value() {
                return this.oneofValueCase_ == 11 ? (Integer)this.oneofValue_ : 0;
            }

            public com.android.aapt.Primitive.Builder setColorArgb4Value(int value) {
                this.oneofValueCase_ = 11;
                this.oneofValue_ = value;
                this.onChanged();
                return this;
            }

            public com.android.aapt.Primitive.Builder clearColorArgb4Value() {
                if (this.oneofValueCase_ == 11) {
                    this.oneofValueCase_ = 0;
                    this.oneofValue_ = null;
                    this.onChanged();
                }

                return this;
            }

            public int getColorRgb4Value() {
                return this.oneofValueCase_ == 12 ? (Integer)this.oneofValue_ : 0;
            }

            public com.android.aapt.Primitive.Builder setColorRgb4Value(int value) {
                this.oneofValueCase_ = 12;
                this.oneofValue_ = value;
                this.onChanged();
                return this;
            }

            public com.android.aapt.Primitive.Builder clearColorRgb4Value() {
                if (this.oneofValueCase_ == 12) {
                    this.oneofValueCase_ = 0;
                    this.oneofValue_ = null;
                    this.onChanged();
                }

                return this;
            }

            /** @deprecated */
            @Deprecated
            public float getDimensionValueDeprecated() {
                return this.oneofValueCase_ == 4 ? (Float)this.oneofValue_ : 0.0F;
            }

            /** @deprecated */
            @Deprecated
            public com.android.aapt.Primitive.Builder setDimensionValueDeprecated(float value) {
                this.oneofValueCase_ = 4;
                this.oneofValue_ = value;
                this.onChanged();
                return this;
            }

            /** @deprecated */
            @Deprecated
            public com.android.aapt.Primitive.Builder clearDimensionValueDeprecated() {
                if (this.oneofValueCase_ == 4) {
                    this.oneofValueCase_ = 0;
                    this.oneofValue_ = null;
                    this.onChanged();
                }

                return this;
            }

            /** @deprecated */
            @Deprecated
            public float getFractionValueDeprecated() {
                return this.oneofValueCase_ == 5 ? (Float)this.oneofValue_ : 0.0F;
            }

            /** @deprecated */
            @Deprecated
            public com.android.aapt.Primitive.Builder setFractionValueDeprecated(float value) {
                this.oneofValueCase_ = 5;
                this.oneofValue_ = value;
                this.onChanged();
                return this;
            }

            /** @deprecated */
            @Deprecated
            public com.android.aapt.Primitive.Builder clearFractionValueDeprecated() {
                if (this.oneofValueCase_ == 5) {
                    this.oneofValueCase_ = 0;
                    this.oneofValue_ = null;
                    this.onChanged();
                }

                return this;
            }

            public final com.android.aapt.Primitive.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.Primitive.Builder)super.setUnknownFields(unknownFields);
            }

            public final com.android.aapt.Primitive.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.Primitive.Builder)super.mergeUnknownFields(unknownFields);
            }
        }

        public static enum OneofValueCase implements Internal.EnumLite, InternalOneOfEnum {
            NULL_VALUE(1),
            EMPTY_VALUE(2),
            FLOAT_VALUE(3),
            DIMENSION_VALUE(13),
            FRACTION_VALUE(14),
            INT_DECIMAL_VALUE(6),
            INT_HEXADECIMAL_VALUE(7),
            BOOLEAN_VALUE(8),
            COLOR_ARGB8_VALUE(9),
            COLOR_RGB8_VALUE(10),
            COLOR_ARGB4_VALUE(11),
            COLOR_RGB4_VALUE(12),
            /** @deprecated */
            @Deprecated
            DIMENSION_VALUE_DEPRECATED(4),
            /** @deprecated */
            @Deprecated
            FRACTION_VALUE_DEPRECATED(5),
            ONEOFVALUE_NOT_SET(0);

            private final int value;

            private OneofValueCase(int value) {
                this.value = value;
            }

            /** @deprecated */
            @Deprecated
            public static com.android.aapt.Primitive.OneofValueCase valueOf(int value) {
                return forNumber(value);
            }

            public static com.android.aapt.Primitive.OneofValueCase forNumber(int value) {
                switch(value) {
                    case 0:
                        return ONEOFVALUE_NOT_SET;
                    case 1:
                        return NULL_VALUE;
                    case 2:
                        return EMPTY_VALUE;
                    case 3:
                        return FLOAT_VALUE;
                    case 4:
                        return DIMENSION_VALUE_DEPRECATED;
                    case 5:
                        return FRACTION_VALUE_DEPRECATED;
                    case 6:
                        return INT_DECIMAL_VALUE;
                    case 7:
                        return INT_HEXADECIMAL_VALUE;
                    case 8:
                        return BOOLEAN_VALUE;
                    case 9:
                        return COLOR_ARGB8_VALUE;
                    case 10:
                        return COLOR_RGB8_VALUE;
                    case 11:
                        return COLOR_ARGB4_VALUE;
                    case 12:
                        return COLOR_RGB4_VALUE;
                    case 13:
                        return DIMENSION_VALUE;
                    case 14:
                        return FRACTION_VALUE;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.value;
            }
        }

        public static final class EmptyType extends GeneratedMessageV3 implements com.android.aapt.Primitive.EmptyTypeOrBuilder {
            private static final long serialVersionUID = 0L;
            private byte memoizedIsInitialized;
            private static final com.android.aapt.Primitive.EmptyType DEFAULT_INSTANCE = new com.android.aapt.Primitive.EmptyType();
            private static final Parser<com.android.aapt.Primitive.EmptyType> PARSER = new AbstractParser<com.android.aapt.Primitive.EmptyType>() {
                public com.android.aapt.Primitive.EmptyType parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new com.android.aapt.Primitive.EmptyType(input, extensionRegistry);
                }
            };

            private EmptyType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = -1;
            }

            private EmptyType() {
                this.memoizedIsInitialized = -1;
            }

            @Override
            public Object newInstance(UnusedPrivateParameter unused) {
                return new com.android.aapt.Primitive.EmptyType();
            }

            @Override
            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            private EmptyType(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                default:
                                    if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                        done = true;
                                    }
                            }
                        }
                    } catch (InvalidProtocolBufferException var10) {
                        throw var10.setUnfinishedMessage(this);
                    } catch (IOException var11) {
                        throw (new InvalidProtocolBufferException(var11)).setUnfinishedMessage(this);
                    } finally {
                        this.unknownFields = unknownFields.build();
                        this.makeExtensionsImmutable();
                    }

                }
            }

            public static Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_Primitive_EmptyType_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_Primitive_EmptyType_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.Primitive.EmptyType.class, com.android.aapt.Primitive.EmptyType.Builder.class);
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
                this.unknownFields.writeTo(output);
            }

            @Override
            public int getSerializedSize() {
                int size = this.memoizedSize;
                if (size != -1) {
                    return size;
                } else {
                    size = 0;
                    size = size + this.unknownFields.getSerializedSize();
                    this.memoizedSize = size;
                    return size;
                }
            }

            @Override
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                } else if (!(obj instanceof com.android.aapt.Primitive.EmptyType)) {
                    return super.equals(obj);
                } else {
                    com.android.aapt.Primitive.EmptyType other = (com.android.aapt.Primitive.EmptyType)obj;
                    return this.unknownFields.equals(other.unknownFields);
                }
            }

            @Override
            public int hashCode() {
                if (this.memoizedHashCode != 0) {
                    return this.memoizedHashCode;
                } else {
                    int hash = 41;
                    hash = 19 * hash + getDescriptor().hashCode();
                    hash = 29 * hash + this.unknownFields.hashCode();
                    this.memoizedHashCode = hash;
                    return hash;
                }
            }

            public static com.android.aapt.Primitive.EmptyType parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (com.android.aapt.Primitive.EmptyType)PARSER.parseFrom(data);
            }

            public static com.android.aapt.Primitive.EmptyType parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (com.android.aapt.Primitive.EmptyType)PARSER.parseFrom(data, extensionRegistry);
            }

            public static com.android.aapt.Primitive.EmptyType parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (com.android.aapt.Primitive.EmptyType)PARSER.parseFrom(data);
            }

            public static com.android.aapt.Primitive.EmptyType parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (com.android.aapt.Primitive.EmptyType)PARSER.parseFrom(data, extensionRegistry);
            }

            public static com.android.aapt.Primitive.EmptyType parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (com.android.aapt.Primitive.EmptyType)PARSER.parseFrom(data);
            }

            public static com.android.aapt.Primitive.EmptyType parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (com.android.aapt.Primitive.EmptyType)PARSER.parseFrom(data, extensionRegistry);
            }

            public static com.android.aapt.Primitive.EmptyType parseFrom(InputStream input) throws IOException {
                return (com.android.aapt.Primitive.EmptyType)GeneratedMessageV3.parseWithIOException(PARSER, input);
            }

            public static com.android.aapt.Primitive.EmptyType parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (com.android.aapt.Primitive.EmptyType)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
            }

            public static com.android.aapt.Primitive.EmptyType parseDelimitedFrom(InputStream input) throws IOException {
                return (com.android.aapt.Primitive.EmptyType)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
            }

            public static com.android.aapt.Primitive.EmptyType parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (com.android.aapt.Primitive.EmptyType)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }

            public static com.android.aapt.Primitive.EmptyType parseFrom(CodedInputStream input) throws IOException {
                return (com.android.aapt.Primitive.EmptyType)GeneratedMessageV3.parseWithIOException(PARSER, input);
            }

            public static com.android.aapt.Primitive.EmptyType parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (com.android.aapt.Primitive.EmptyType)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
            }

            public com.android.aapt.Primitive.EmptyType.Builder newBuilderForType() {
                return newBuilder();
            }

            public static com.android.aapt.Primitive.EmptyType.Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static com.android.aapt.Primitive.EmptyType.Builder newBuilder(com.android.aapt.Primitive.EmptyType prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }

            public com.android.aapt.Primitive.EmptyType.Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new com.android.aapt.Primitive.EmptyType.Builder() : (new com.android.aapt.Primitive.EmptyType.Builder()).mergeFrom(this);
            }

            public com.android.aapt.Primitive.EmptyType.Builder newBuilderForType(BuilderParent parent) {
                com.android.aapt.Primitive.EmptyType.Builder builder = new com.android.aapt.Primitive.EmptyType.Builder(parent);
                return builder;
            }

            public static com.android.aapt.Primitive.EmptyType getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<com.android.aapt.Primitive.EmptyType> parser() {
                return PARSER;
            }

            public Parser<com.android.aapt.Primitive.EmptyType> getParserForType() {
                return PARSER;
            }

            public com.android.aapt.Primitive.EmptyType getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.Primitive.EmptyType.Builder> implements com.android.aapt.Primitive.EmptyTypeOrBuilder {
                public static Descriptors.Descriptor getDescriptor() {
                    return Resources.internal_static_aapt_pb_Primitive_EmptyType_descriptor;
                }

                public FieldAccessorTable internalGetFieldAccessorTable() {
                    return Resources.internal_static_aapt_pb_Primitive_EmptyType_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.Primitive.EmptyType.class, com.android.aapt.Primitive.EmptyType.Builder.class);
                }

                private Builder() {
                    this.maybeForceBuilderInitialization();
                }

                private Builder(BuilderParent parent) {
                    super(parent);
                    this.maybeForceBuilderInitialization();
                }

                private void maybeForceBuilderInitialization() {
                    if (com.android.aapt.Primitive.EmptyType.alwaysUseFieldBuilders) {
                    }

                }

                public com.android.aapt.Primitive.EmptyType.Builder clear() {
                    super.clear();
                    return this;
                }

                @Override
                public Descriptors.Descriptor getDescriptorForType() {
                    return Resources.internal_static_aapt_pb_Primitive_EmptyType_descriptor;
                }

                public com.android.aapt.Primitive.EmptyType getDefaultInstanceForType() {
                    return com.android.aapt.Primitive.EmptyType.getDefaultInstance();
                }

                public com.android.aapt.Primitive.EmptyType build() {
                    com.android.aapt.Primitive.EmptyType result = this.buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    } else {
                        return result;
                    }
                }

                public com.android.aapt.Primitive.EmptyType buildPartial() {
                    com.android.aapt.Primitive.EmptyType result = new com.android.aapt.Primitive.EmptyType(this);
                    this.onBuilt();
                    return result;
                }

                public com.android.aapt.Primitive.EmptyType.Builder clone() {
                    return (com.android.aapt.Primitive.EmptyType.Builder)super.clone();
                }

                public com.android.aapt.Primitive.EmptyType.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                    return (com.android.aapt.Primitive.EmptyType.Builder)super.setField(field, value);
                }

                public com.android.aapt.Primitive.EmptyType.Builder clearField(Descriptors.FieldDescriptor field) {
                    return (com.android.aapt.Primitive.EmptyType.Builder)super.clearField(field);
                }

                public com.android.aapt.Primitive.EmptyType.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                    return (com.android.aapt.Primitive.EmptyType.Builder)super.clearOneof(oneof);
                }

                public com.android.aapt.Primitive.EmptyType.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                    return (com.android.aapt.Primitive.EmptyType.Builder)super.setRepeatedField(field, index, value);
                }

                public com.android.aapt.Primitive.EmptyType.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                    return (com.android.aapt.Primitive.EmptyType.Builder)super.addRepeatedField(field, value);
                }

                public com.android.aapt.Primitive.EmptyType.Builder mergeFrom(Message other) {
                    if (other instanceof com.android.aapt.Primitive.EmptyType) {
                        return this.mergeFrom((com.android.aapt.Primitive.EmptyType)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public com.android.aapt.Primitive.EmptyType.Builder mergeFrom(com.android.aapt.Primitive.EmptyType other) {
                    if (other == com.android.aapt.Primitive.EmptyType.getDefaultInstance()) {
                        return this;
                    } else {
                        this.mergeUnknownFields(other.unknownFields);
                        this.onChanged();
                        return this;
                    }
                }

                public final boolean isInitialized() {
                    return true;
                }

                public com.android.aapt.Primitive.EmptyType.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                    com.android.aapt.Primitive.EmptyType parsedMessage = null;

                    try {
                        parsedMessage = (com.android.aapt.Primitive.EmptyType)com.android.aapt.Primitive.EmptyType.PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (InvalidProtocolBufferException var8) {
                        parsedMessage = (com.android.aapt.Primitive.EmptyType)var8.getUnfinishedMessage();
                        throw var8.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            this.mergeFrom(parsedMessage);
                        }

                    }

                    return this;
                }

                public final com.android.aapt.Primitive.EmptyType.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                    return (com.android.aapt.Primitive.EmptyType.Builder)super.setUnknownFields(unknownFields);
                }

                public final com.android.aapt.Primitive.EmptyType.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                    return (com.android.aapt.Primitive.EmptyType.Builder)super.mergeUnknownFields(unknownFields);
                }
            }
        }

        public interface EmptyTypeOrBuilder extends MessageOrBuilder {
        }

        public static final class NullType extends GeneratedMessageV3 implements com.android.aapt.Primitive.NullTypeOrBuilder {
            private static final long serialVersionUID = 0L;
            private byte memoizedIsInitialized;
            private static final com.android.aapt.Primitive.NullType DEFAULT_INSTANCE = new com.android.aapt.Primitive.NullType();
            private static final Parser<com.android.aapt.Primitive.NullType> PARSER = new AbstractParser<com.android.aapt.Primitive.NullType>() {
                public com.android.aapt.Primitive.NullType parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new com.android.aapt.Primitive.NullType(input, extensionRegistry);
                }
            };

            private NullType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = -1;
            }

            private NullType() {
                this.memoizedIsInitialized = -1;
            }

            @Override
            public Object newInstance(UnusedPrivateParameter unused) {
                return new com.android.aapt.Primitive.NullType();
            }

            @Override
            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            private NullType(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                default:
                                    if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                        done = true;
                                    }
                            }
                        }
                    } catch (InvalidProtocolBufferException var10) {
                        throw var10.setUnfinishedMessage(this);
                    } catch (IOException var11) {
                        throw (new InvalidProtocolBufferException(var11)).setUnfinishedMessage(this);
                    } finally {
                        this.unknownFields = unknownFields.build();
                        this.makeExtensionsImmutable();
                    }

                }
            }

            public static Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_Primitive_NullType_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_Primitive_NullType_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.Primitive.NullType.class, com.android.aapt.Primitive.NullType.Builder.class);
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
                this.unknownFields.writeTo(output);
            }

            @Override
            public int getSerializedSize() {
                int size = this.memoizedSize;
                if (size != -1) {
                    return size;
                } else {
                     size = 0;
                    size = size + this.unknownFields.getSerializedSize();
                    this.memoizedSize = size;
                    return size;
                }
            }

            @Override
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                } else if (!(obj instanceof com.android.aapt.Primitive.NullType)) {
                    return super.equals(obj);
                } else {
                    com.android.aapt.Primitive.NullType other = (com.android.aapt.Primitive.NullType)obj;
                    return this.unknownFields.equals(other.unknownFields);
                }
            }

            @Override
            public int hashCode() {
                if (this.memoizedHashCode != 0) {
                    return this.memoizedHashCode;
                } else {
                    int hash = 41;
                    hash = 19 * hash + getDescriptor().hashCode();
                    hash = 29 * hash + this.unknownFields.hashCode();
                    this.memoizedHashCode = hash;
                    return hash;
                }
            }

            public static com.android.aapt.Primitive.NullType parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (com.android.aapt.Primitive.NullType)PARSER.parseFrom(data);
            }

            public static com.android.aapt.Primitive.NullType parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (com.android.aapt.Primitive.NullType)PARSER.parseFrom(data, extensionRegistry);
            }

            public static com.android.aapt.Primitive.NullType parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (com.android.aapt.Primitive.NullType)PARSER.parseFrom(data);
            }

            public static com.android.aapt.Primitive.NullType parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (com.android.aapt.Primitive.NullType)PARSER.parseFrom(data, extensionRegistry);
            }

            public static com.android.aapt.Primitive.NullType parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (com.android.aapt.Primitive.NullType)PARSER.parseFrom(data);
            }

            public static com.android.aapt.Primitive.NullType parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (com.android.aapt.Primitive.NullType)PARSER.parseFrom(data, extensionRegistry);
            }

            public static com.android.aapt.Primitive.NullType parseFrom(InputStream input) throws IOException {
                return (com.android.aapt.Primitive.NullType)GeneratedMessageV3.parseWithIOException(PARSER, input);
            }

            public static com.android.aapt.Primitive.NullType parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (com.android.aapt.Primitive.NullType)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
            }

            public static com.android.aapt.Primitive.NullType parseDelimitedFrom(InputStream input) throws IOException {
                return (com.android.aapt.Primitive.NullType)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
            }

            public static com.android.aapt.Primitive.NullType parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (com.android.aapt.Primitive.NullType)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }

            public static com.android.aapt.Primitive.NullType parseFrom(CodedInputStream input) throws IOException {
                return (com.android.aapt.Primitive.NullType)GeneratedMessageV3.parseWithIOException(PARSER, input);
            }

            public static com.android.aapt.Primitive.NullType parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (com.android.aapt.Primitive.NullType)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
            }

            public com.android.aapt.Primitive.NullType.Builder newBuilderForType() {
                return newBuilder();
            }

            public static com.android.aapt.Primitive.NullType.Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static com.android.aapt.Primitive.NullType.Builder newBuilder(com.android.aapt.Primitive.NullType prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }

            public com.android.aapt.Primitive.NullType.Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new com.android.aapt.Primitive.NullType.Builder() : (new com.android.aapt.Primitive.NullType.Builder()).mergeFrom(this);
            }

            public com.android.aapt.Primitive.NullType.Builder newBuilderForType(BuilderParent parent) {
                com.android.aapt.Primitive.NullType.Builder builder = new com.android.aapt.Primitive.NullType.Builder(parent);
                return builder;
            }

            public static com.android.aapt.Primitive.NullType getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<com.android.aapt.Primitive.NullType> parser() {
                return PARSER;
            }

            public Parser<com.android.aapt.Primitive.NullType> getParserForType() {
                return PARSER;
            }

            public com.android.aapt.Primitive.NullType getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.Primitive.NullType.Builder> implements com.android.aapt.Primitive.NullTypeOrBuilder {
                public static Descriptors.Descriptor getDescriptor() {
                    return Resources.internal_static_aapt_pb_Primitive_NullType_descriptor;
                }

                public FieldAccessorTable internalGetFieldAccessorTable() {
                    return Resources.internal_static_aapt_pb_Primitive_NullType_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.Primitive.NullType.class, com.android.aapt.Primitive.NullType.Builder.class);
                }

                private Builder() {
                    this.maybeForceBuilderInitialization();
                }

                private Builder(BuilderParent parent) {
                    super(parent);
                    this.maybeForceBuilderInitialization();
                }

                private void maybeForceBuilderInitialization() {
                    if (com.android.aapt.Primitive.NullType.alwaysUseFieldBuilders) {
                    }

                }

                public com.android.aapt.Primitive.NullType.Builder clear() {
                    super.clear();
                    return this;
                }

                @Override
                public Descriptors.Descriptor getDescriptorForType() {
                    return Resources.internal_static_aapt_pb_Primitive_NullType_descriptor;
                }

                public com.android.aapt.Primitive.NullType getDefaultInstanceForType() {
                    return com.android.aapt.Primitive.NullType.getDefaultInstance();
                }

                public com.android.aapt.Primitive.NullType build() {
                    com.android.aapt.Primitive.NullType result = this.buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    } else {
                        return result;
                    }
                }

                public com.android.aapt.Primitive.NullType buildPartial() {
                    com.android.aapt.Primitive.NullType result = new com.android.aapt.Primitive.NullType(this);
                    this.onBuilt();
                    return result;
                }

                public com.android.aapt.Primitive.NullType.Builder clone() {
                    return (com.android.aapt.Primitive.NullType.Builder)super.clone();
                }

                public com.android.aapt.Primitive.NullType.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                    return (com.android.aapt.Primitive.NullType.Builder)super.setField(field, value);
                }

                public com.android.aapt.Primitive.NullType.Builder clearField(Descriptors.FieldDescriptor field) {
                    return (com.android.aapt.Primitive.NullType.Builder)super.clearField(field);
                }

                public com.android.aapt.Primitive.NullType.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                    return (com.android.aapt.Primitive.NullType.Builder)super.clearOneof(oneof);
                }

                public com.android.aapt.Primitive.NullType.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                    return (com.android.aapt.Primitive.NullType.Builder)super.setRepeatedField(field, index, value);
                }

                public com.android.aapt.Primitive.NullType.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                    return (com.android.aapt.Primitive.NullType.Builder)super.addRepeatedField(field, value);
                }

                public com.android.aapt.Primitive.NullType.Builder mergeFrom(Message other) {
                    if (other instanceof com.android.aapt.Primitive.NullType) {
                        return this.mergeFrom((com.android.aapt.Primitive.NullType)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public com.android.aapt.Primitive.NullType.Builder mergeFrom(com.android.aapt.Primitive.NullType other) {
                    if (other == com.android.aapt.Primitive.NullType.getDefaultInstance()) {
                        return this;
                    } else {
                        this.mergeUnknownFields(other.unknownFields);
                        this.onChanged();
                        return this;
                    }
                }

                public final boolean isInitialized() {
                    return true;
                }

                public com.android.aapt.Primitive.NullType.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                    com.android.aapt.Primitive.NullType parsedMessage = null;

                    try {
                        parsedMessage = (com.android.aapt.Primitive.NullType)com.android.aapt.Primitive.NullType.PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (InvalidProtocolBufferException var8) {
                        parsedMessage = (com.android.aapt.Primitive.NullType)var8.getUnfinishedMessage();
                        throw var8.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            this.mergeFrom(parsedMessage);
                        }

                    }

                    return this;
                }

                public final com.android.aapt.Primitive.NullType.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                    return (com.android.aapt.Primitive.NullType.Builder)super.setUnknownFields(unknownFields);
                }

                public final com.android.aapt.Primitive.NullType.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                    return (com.android.aapt.Primitive.NullType.Builder)super.mergeUnknownFields(unknownFields);
                }
            }
        }

        public interface NullTypeOrBuilder extends MessageOrBuilder {
        }
    }