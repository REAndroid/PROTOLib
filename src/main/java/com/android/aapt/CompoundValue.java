package com.android.aapt;

import com.google.protobuf.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class CompoundValue extends GeneratedMessageV3 implements com.android.aapt.CompoundValueOrBuilder {
        private static final long serialVersionUID = 0L;
        private int valueCase_;
        private Object value_;
        public static final int ATTR_FIELD_NUMBER = 1;
        public static final int STYLE_FIELD_NUMBER = 2;
        public static final int STYLEABLE_FIELD_NUMBER = 3;
        public static final int ARRAY_FIELD_NUMBER = 4;
        public static final int PLURAL_FIELD_NUMBER = 5;
        public static final int MACRO_FIELD_NUMBER = 6;
        private byte memoizedIsInitialized;
        private static final com.android.aapt.CompoundValue DEFAULT_INSTANCE = new com.android.aapt.CompoundValue();
        private static final Parser<com.android.aapt.CompoundValue> PARSER = new AbstractParser<com.android.aapt.CompoundValue>() {
            public com.android.aapt.CompoundValue parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new com.android.aapt.CompoundValue(input, extensionRegistry);
            }
        };

        private CompoundValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.valueCase_ = 0;
            this.memoizedIsInitialized = -1;
        }

        private CompoundValue() {
            this.valueCase_ = 0;
            this.memoizedIsInitialized = -1;
        }

        @Override
        public Object newInstance(UnusedPrivateParameter unused) {
            return new com.android.aapt.CompoundValue();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CompoundValue(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                com.android.aapt.Attribute.Builder subBuilder = null;
                                if (this.valueCase_ == 1) {
                                    subBuilder = ((com.android.aapt.Attribute)this.value_).toBuilder();
                                }

                                this.value_ = input.readMessage(com.android.aapt.Attribute.parser(), extensionRegistry);
                                if (subBuilder != null) {
                                    subBuilder.mergeFrom((com.android.aapt.Attribute)this.value_);
                                    this.value_ = subBuilder.buildPartial();
                                }

                                this.valueCase_ = 1;
                                break;
                            case 18:
                                com.android.aapt.Style.Builder subBuilder4 = null;
                                if (this.valueCase_ == 2) {
                                    subBuilder4 = ((com.android.aapt.Style)this.value_).toBuilder();
                                }

                                this.value_ = input.readMessage(com.android.aapt.Style.parser(), extensionRegistry);
                                if (subBuilder4 != null) {
                                    subBuilder4.mergeFrom((com.android.aapt.Style)this.value_);
                                    this.value_ = subBuilder4.buildPartial();
                                }

                                this.valueCase_ = 2;
                                break;
                            case 26:
                                com.android.aapt.Styleable.Builder subBuilder5 = null;
                                if (this.valueCase_ == 3) {
                                    subBuilder5 = ((com.android.aapt.Styleable)this.value_).toBuilder();
                                }

                                this.value_ = input.readMessage(com.android.aapt.Styleable.parser(), extensionRegistry);
                                if (subBuilder5 != null) {
                                    subBuilder5.mergeFrom((com.android.aapt.Styleable)this.value_);
                                    this.value_ = subBuilder5.buildPartial();
                                }

                                this.valueCase_ = 3;
                                break;
                            case 34:
                                PBArray.Builder subBuilder6 = null;
                                if (this.valueCase_ == 4) {
                                    subBuilder6 = ((PBArray)this.value_).toBuilder();
                                }

                                this.value_ = input.readMessage(PBArray.parser(), extensionRegistry);
                                if (subBuilder6 != null) {
                                    subBuilder6.mergeFrom((PBArray)this.value_);
                                    this.value_ = subBuilder6.buildPartial();
                                }

                                this.valueCase_ = 4;
                                break;
                            case 42:
                                com.android.aapt.Plural.Builder subBuilder2 = null;
                                if (this.valueCase_ == 5) {
                                    subBuilder2 = ((com.android.aapt.Plural)this.value_).toBuilder();
                                }

                                this.value_ = input.readMessage(com.android.aapt.Plural.parser(), extensionRegistry);
                                if (subBuilder2 != null) {
                                    subBuilder2.mergeFrom((com.android.aapt.Plural)this.value_);
                                    this.value_ = subBuilder2.buildPartial();
                                }

                                this.valueCase_ = 5;
                                break;
                            case 50:
                                com.android.aapt.MacroBody.Builder subBuilder3 = null;
                                if (this.valueCase_ == 6) {
                                    subBuilder3 = ((com.android.aapt.MacroBody)this.value_).toBuilder();
                                }

                                this.value_ = input.readMessage(com.android.aapt.MacroBody.parser(), extensionRegistry);
                                if (subBuilder3 != null) {
                                    subBuilder3.mergeFrom((com.android.aapt.MacroBody)this.value_);
                                    this.value_ = subBuilder3.buildPartial();
                                }

                                this.valueCase_ = 6;
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
            return Resources.internal_static_aapt_pb_CompoundValue_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_CompoundValue_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.CompoundValue.class, com.android.aapt.CompoundValue.Builder.class);
        }

        public com.android.aapt.CompoundValue.ValueCase getValueCase() {
            return com.android.aapt.CompoundValue.ValueCase.forNumber(this.valueCase_);
        }

        public boolean hasAttr() {
            return this.valueCase_ == 1;
        }

        public com.android.aapt.Attribute getAttr() {
            return this.valueCase_ == 1 ? (com.android.aapt.Attribute)this.value_ : com.android.aapt.Attribute.getDefaultInstance();
        }

        public com.android.aapt.AttributeOrBuilder getAttrOrBuilder() {
            return this.valueCase_ == 1 ? (com.android.aapt.Attribute)this.value_ : com.android.aapt.Attribute.getDefaultInstance();
        }

        public boolean hasStyle() {
            return this.valueCase_ == 2;
        }

        public com.android.aapt.Style getStyle() {
            return this.valueCase_ == 2 ? (com.android.aapt.Style)this.value_ : com.android.aapt.Style.getDefaultInstance();
        }

        public com.android.aapt.StyleOrBuilder getStyleOrBuilder() {
            return this.valueCase_ == 2 ? (com.android.aapt.Style)this.value_ : com.android.aapt.Style.getDefaultInstance();
        }

        public boolean hasStyleable() {
            return this.valueCase_ == 3;
        }

        public com.android.aapt.Styleable getStyleable() {
            return this.valueCase_ == 3 ? (com.android.aapt.Styleable)this.value_ : com.android.aapt.Styleable.getDefaultInstance();
        }

        public com.android.aapt.StyleableOrBuilder getStyleableOrBuilder() {
            return this.valueCase_ == 3 ? (com.android.aapt.Styleable)this.value_ : com.android.aapt.Styleable.getDefaultInstance();
        }

        public boolean hasArray() {
            return this.valueCase_ == 4;
        }

        public PBArray getArray() {
            return this.valueCase_ == 4 ? (PBArray)this.value_ : PBArray.getDefaultInstance();
        }

        public com.android.aapt.ArrayOrBuilder getArrayOrBuilder() {
            return this.valueCase_ == 4 ? (PBArray)this.value_ : PBArray.getDefaultInstance();
        }

        public boolean hasPlural() {
            return this.valueCase_ == 5;
        }

        public com.android.aapt.Plural getPlural() {
            return this.valueCase_ == 5 ? (com.android.aapt.Plural)this.value_ : com.android.aapt.Plural.getDefaultInstance();
        }

        public com.android.aapt.PluralOrBuilder getPluralOrBuilder() {
            return this.valueCase_ == 5 ? (com.android.aapt.Plural)this.value_ : com.android.aapt.Plural.getDefaultInstance();
        }

        public boolean hasMacro() {
            return this.valueCase_ == 6;
        }

        public com.android.aapt.MacroBody getMacro() {
            return this.valueCase_ == 6 ? (com.android.aapt.MacroBody)this.value_ : com.android.aapt.MacroBody.getDefaultInstance();
        }

        public com.android.aapt.MacroBodyOrBuilder getMacroOrBuilder() {
            return this.valueCase_ == 6 ? (com.android.aapt.MacroBody)this.value_ : com.android.aapt.MacroBody.getDefaultInstance();
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
                output.writeMessage(1, (com.android.aapt.Attribute)this.value_);
            }

            if (this.valueCase_ == 2) {
                output.writeMessage(2, (com.android.aapt.Style)this.value_);
            }

            if (this.valueCase_ == 3) {
                output.writeMessage(3, (com.android.aapt.Styleable)this.value_);
            }

            if (this.valueCase_ == 4) {
                output.writeMessage(4, (PBArray)this.value_);
            }

            if (this.valueCase_ == 5) {
                output.writeMessage(5, (com.android.aapt.Plural)this.value_);
            }

            if (this.valueCase_ == 6) {
                output.writeMessage(6, (com.android.aapt.MacroBody)this.value_);
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
                    size += CodedOutputStream.computeMessageSize(1, (com.android.aapt.Attribute)this.value_);
                }

                if (this.valueCase_ == 2) {
                    size += CodedOutputStream.computeMessageSize(2, (com.android.aapt.Style)this.value_);
                }

                if (this.valueCase_ == 3) {
                    size += CodedOutputStream.computeMessageSize(3, (com.android.aapt.Styleable)this.value_);
                }

                if (this.valueCase_ == 4) {
                    size += CodedOutputStream.computeMessageSize(4, (PBArray)this.value_);
                }

                if (this.valueCase_ == 5) {
                    size += CodedOutputStream.computeMessageSize(5, (com.android.aapt.Plural)this.value_);
                }

                if (this.valueCase_ == 6) {
                    size += CodedOutputStream.computeMessageSize(6, (com.android.aapt.MacroBody)this.value_);
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
            } else if (!(obj instanceof com.android.aapt.CompoundValue)) {
                return super.equals(obj);
            } else {
                com.android.aapt.CompoundValue other = (com.android.aapt.CompoundValue)obj;
                if (!this.getValueCase().equals(other.getValueCase())) {
                    return false;
                } else {
                    switch(this.valueCase_) {
                        case 0:
                        default:
                            break;
                        case 1:
                            if (!this.getAttr().equals(other.getAttr())) {
                                return false;
                            }
                            break;
                        case 2:
                            if (!this.getStyle().equals(other.getStyle())) {
                                return false;
                            }
                            break;
                        case 3:
                            if (!this.getStyleable().equals(other.getStyleable())) {
                                return false;
                            }
                            break;
                        case 4:
                            if (!this.getArray().equals(other.getArray())) {
                                return false;
                            }
                            break;
                        case 5:
                            if (!this.getPlural().equals(other.getPlural())) {
                                return false;
                            }
                            break;
                        case 6:
                            if (!this.getMacro().equals(other.getMacro())) {
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
                        hash = 53 * hash + this.getAttr().hashCode();
                        break;
                    case 2:
                        hash = 37 * hash + 2;
                        hash = 53 * hash + this.getStyle().hashCode();
                        break;
                    case 3:
                        hash = 37 * hash + 3;
                        hash = 53 * hash + this.getStyleable().hashCode();
                        break;
                    case 4:
                        hash = 37 * hash + 4;
                        hash = 53 * hash + this.getArray().hashCode();
                        break;
                    case 5:
                        hash = 37 * hash + 5;
                        hash = 53 * hash + this.getPlural().hashCode();
                        break;
                    case 6:
                        hash = 37 * hash + 6;
                        hash = 53 * hash + this.getMacro().hashCode();
                }

                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static com.android.aapt.CompoundValue parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (com.android.aapt.CompoundValue)PARSER.parseFrom(data);
        }

        public static com.android.aapt.CompoundValue parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.CompoundValue)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.CompoundValue parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (com.android.aapt.CompoundValue)PARSER.parseFrom(data);
        }

        public static com.android.aapt.CompoundValue parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.CompoundValue)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.CompoundValue parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (com.android.aapt.CompoundValue)PARSER.parseFrom(data);
        }

        public static com.android.aapt.CompoundValue parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.CompoundValue)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.CompoundValue parseFrom(InputStream input) throws IOException {
            return (com.android.aapt.CompoundValue)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.CompoundValue parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.CompoundValue)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.CompoundValue parseDelimitedFrom(InputStream input) throws IOException {
            return (com.android.aapt.CompoundValue)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static com.android.aapt.CompoundValue parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.CompoundValue)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.CompoundValue parseFrom(CodedInputStream input) throws IOException {
            return (com.android.aapt.CompoundValue)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.CompoundValue parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.CompoundValue)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public com.android.aapt.CompoundValue.Builder newBuilderForType() {
            return newBuilder();
        }

        public static com.android.aapt.CompoundValue.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static com.android.aapt.CompoundValue.Builder newBuilder(com.android.aapt.CompoundValue prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public com.android.aapt.CompoundValue.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new com.android.aapt.CompoundValue.Builder() : (new com.android.aapt.CompoundValue.Builder()).mergeFrom(this);
        }

        public com.android.aapt.CompoundValue.Builder newBuilderForType(BuilderParent parent) {
            com.android.aapt.CompoundValue.Builder builder = new com.android.aapt.CompoundValue.Builder(parent);
            return builder;
        }

        public static com.android.aapt.CompoundValue getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<com.android.aapt.CompoundValue> parser() {
            return PARSER;
        }

        public Parser<com.android.aapt.CompoundValue> getParserForType() {
            return PARSER;
        }

        public com.android.aapt.CompoundValue getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.CompoundValue.Builder> implements com.android.aapt.CompoundValueOrBuilder {
            private int valueCase_;
            private Object value_;
            private SingleFieldBuilderV3<com.android.aapt.Attribute, com.android.aapt.Attribute.Builder, com.android.aapt.AttributeOrBuilder> attrBuilder_;
            private SingleFieldBuilderV3<com.android.aapt.Style, com.android.aapt.Style.Builder, com.android.aapt.StyleOrBuilder> styleBuilder_;
            private SingleFieldBuilderV3<com.android.aapt.Styleable, com.android.aapt.Styleable.Builder, com.android.aapt.StyleableOrBuilder> styleableBuilder_;
            private SingleFieldBuilderV3<PBArray, PBArray.Builder, com.android.aapt.ArrayOrBuilder> arrayBuilder_;
            private SingleFieldBuilderV3<com.android.aapt.Plural, com.android.aapt.Plural.Builder, com.android.aapt.PluralOrBuilder> pluralBuilder_;
            private SingleFieldBuilderV3<com.android.aapt.MacroBody, com.android.aapt.MacroBody.Builder, com.android.aapt.MacroBodyOrBuilder> macroBuilder_;

            public static Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_CompoundValue_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_CompoundValue_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.CompoundValue.class, com.android.aapt.CompoundValue.Builder.class);
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
                if (com.android.aapt.CompoundValue.alwaysUseFieldBuilders) {
                }

            }

            public com.android.aapt.CompoundValue.Builder clear() {
                super.clear();
                this.valueCase_ = 0;
                this.value_ = null;
                return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Resources.internal_static_aapt_pb_CompoundValue_descriptor;
            }

            public com.android.aapt.CompoundValue getDefaultInstanceForType() {
                return com.android.aapt.CompoundValue.getDefaultInstance();
            }

            public com.android.aapt.CompoundValue build() {
                com.android.aapt.CompoundValue result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public com.android.aapt.CompoundValue buildPartial() {
                com.android.aapt.CompoundValue result = new com.android.aapt.CompoundValue(this);
                if (this.valueCase_ == 1) {
                    if (this.attrBuilder_ == null) {
                        result.value_ = this.value_;
                    } else {
                        result.value_ = this.attrBuilder_.build();
                    }
                }

                if (this.valueCase_ == 2) {
                    if (this.styleBuilder_ == null) {
                        result.value_ = this.value_;
                    } else {
                        result.value_ = this.styleBuilder_.build();
                    }
                }

                if (this.valueCase_ == 3) {
                    if (this.styleableBuilder_ == null) {
                        result.value_ = this.value_;
                    } else {
                        result.value_ = this.styleableBuilder_.build();
                    }
                }

                if (this.valueCase_ == 4) {
                    if (this.arrayBuilder_ == null) {
                        result.value_ = this.value_;
                    } else {
                        result.value_ = this.arrayBuilder_.build();
                    }
                }

                if (this.valueCase_ == 5) {
                    if (this.pluralBuilder_ == null) {
                        result.value_ = this.value_;
                    } else {
                        result.value_ = this.pluralBuilder_.build();
                    }
                }

                if (this.valueCase_ == 6) {
                    if (this.macroBuilder_ == null) {
                        result.value_ = this.value_;
                    } else {
                        result.value_ = this.macroBuilder_.build();
                    }
                }

                result.valueCase_ = this.valueCase_;
                this.onBuilt();
                return result;
            }

            public com.android.aapt.CompoundValue.Builder clone() {
                return (com.android.aapt.CompoundValue.Builder)super.clone();
            }

            public com.android.aapt.CompoundValue.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.CompoundValue.Builder)super.setField(field, value);
            }

            public com.android.aapt.CompoundValue.Builder clearField(Descriptors.FieldDescriptor field) {
                return (com.android.aapt.CompoundValue.Builder)super.clearField(field);
            }

            public com.android.aapt.CompoundValue.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (com.android.aapt.CompoundValue.Builder)super.clearOneof(oneof);
            }

            public com.android.aapt.CompoundValue.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (com.android.aapt.CompoundValue.Builder)super.setRepeatedField(field, index, value);
            }

            public com.android.aapt.CompoundValue.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.CompoundValue.Builder)super.addRepeatedField(field, value);
            }

            public com.android.aapt.CompoundValue.Builder mergeFrom(Message other) {
                if (other instanceof com.android.aapt.CompoundValue) {
                    return this.mergeFrom((com.android.aapt.CompoundValue)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public com.android.aapt.CompoundValue.Builder mergeFrom(com.android.aapt.CompoundValue other) {
                if (other == com.android.aapt.CompoundValue.getDefaultInstance()) {
                    return this;
                } else {
                    switch(other.getValueCase()) {
                        case ATTR:
                            this.mergeAttr(other.getAttr());
                            break;
                        case STYLE:
                            this.mergeStyle(other.getStyle());
                            break;
                        case STYLEABLE:
                            this.mergeStyleable(other.getStyleable());
                            break;
                        case ARRAY:
                            this.mergeArray(other.getArray());
                            break;
                        case PLURAL:
                            this.mergePlural(other.getPlural());
                            break;
                        case MACRO:
                            this.mergeMacro(other.getMacro());
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

            public com.android.aapt.CompoundValue.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                com.android.aapt.CompoundValue parsedMessage = null;

                try {
                    parsedMessage = (com.android.aapt.CompoundValue)com.android.aapt.CompoundValue.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (com.android.aapt.CompoundValue)var8.getUnfinishedMessage();
                    throw var8.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }

                }

                return this;
            }

            public com.android.aapt.CompoundValue.ValueCase getValueCase() {
                return com.android.aapt.CompoundValue.ValueCase.forNumber(this.valueCase_);
            }

            public com.android.aapt.CompoundValue.Builder clearValue() {
                this.valueCase_ = 0;
                this.value_ = null;
                this.onChanged();
                return this;
            }

            public boolean hasAttr() {
                return this.valueCase_ == 1;
            }

            public com.android.aapt.Attribute getAttr() {
                if (this.attrBuilder_ == null) {
                    return this.valueCase_ == 1 ? (com.android.aapt.Attribute)this.value_ : com.android.aapt.Attribute.getDefaultInstance();
                } else {
                    return this.valueCase_ == 1 ? (com.android.aapt.Attribute)this.attrBuilder_.getMessage() : com.android.aapt.Attribute.getDefaultInstance();
                }
            }

            public com.android.aapt.CompoundValue.Builder setAttr(com.android.aapt.Attribute value) {
                if (this.attrBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.value_ = value;
                    this.onChanged();
                } else {
                    this.attrBuilder_.setMessage(value);
                }

                this.valueCase_ = 1;
                return this;
            }

            public com.android.aapt.CompoundValue.Builder setAttr(com.android.aapt.Attribute.Builder builderForValue) {
                if (this.attrBuilder_ == null) {
                    this.value_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.attrBuilder_.setMessage(builderForValue.build());
                }

                this.valueCase_ = 1;
                return this;
            }

            public com.android.aapt.CompoundValue.Builder mergeAttr(com.android.aapt.Attribute value) {
                if (this.attrBuilder_ == null) {
                    if (this.valueCase_ == 1 && this.value_ != com.android.aapt.Attribute.getDefaultInstance()) {
                        this.value_ = com.android.aapt.Attribute.newBuilder((com.android.aapt.Attribute)this.value_).mergeFrom(value).buildPartial();
                    } else {
                        this.value_ = value;
                    }

                    this.onChanged();
                } else {
                    if (this.valueCase_ == 1) {
                        this.attrBuilder_.mergeFrom(value);
                    }

                    this.attrBuilder_.setMessage(value);
                }

                this.valueCase_ = 1;
                return this;
            }

            public com.android.aapt.CompoundValue.Builder clearAttr() {
                if (this.attrBuilder_ == null) {
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

                    this.attrBuilder_.clear();
                }

                return this;
            }

            public com.android.aapt.Attribute.Builder getAttrBuilder() {
                return (com.android.aapt.Attribute.Builder)this.getAttrFieldBuilder().getBuilder();
            }

            public com.android.aapt.AttributeOrBuilder getAttrOrBuilder() {
                if (this.valueCase_ == 1 && this.attrBuilder_ != null) {
                    return (com.android.aapt.AttributeOrBuilder)this.attrBuilder_.getMessageOrBuilder();
                } else {
                    return this.valueCase_ == 1 ? (com.android.aapt.Attribute)this.value_ : com.android.aapt.Attribute.getDefaultInstance();
                }
            }

            private SingleFieldBuilderV3<com.android.aapt.Attribute, com.android.aapt.Attribute.Builder, com.android.aapt.AttributeOrBuilder> getAttrFieldBuilder() {
                if (this.attrBuilder_ == null) {
                    if (this.valueCase_ != 1) {
                        this.value_ = com.android.aapt.Attribute.getDefaultInstance();
                    }

                    this.attrBuilder_ = new SingleFieldBuilderV3((com.android.aapt.Attribute)this.value_, this.getParentForChildren(), this.isClean());
                    this.value_ = null;
                }

                this.valueCase_ = 1;
                this.onChanged();
                return this.attrBuilder_;
            }

            public boolean hasStyle() {
                return this.valueCase_ == 2;
            }

            public com.android.aapt.Style getStyle() {
                if (this.styleBuilder_ == null) {
                    return this.valueCase_ == 2 ? (com.android.aapt.Style)this.value_ : com.android.aapt.Style.getDefaultInstance();
                } else {
                    return this.valueCase_ == 2 ? (com.android.aapt.Style)this.styleBuilder_.getMessage() : com.android.aapt.Style.getDefaultInstance();
                }
            }

            public com.android.aapt.CompoundValue.Builder setStyle(com.android.aapt.Style value) {
                if (this.styleBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.value_ = value;
                    this.onChanged();
                } else {
                    this.styleBuilder_.setMessage(value);
                }

                this.valueCase_ = 2;
                return this;
            }

            public com.android.aapt.CompoundValue.Builder setStyle(com.android.aapt.Style.Builder builderForValue) {
                if (this.styleBuilder_ == null) {
                    this.value_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.styleBuilder_.setMessage(builderForValue.build());
                }

                this.valueCase_ = 2;
                return this;
            }

            public com.android.aapt.CompoundValue.Builder mergeStyle(com.android.aapt.Style value) {
                if (this.styleBuilder_ == null) {
                    if (this.valueCase_ == 2 && this.value_ != com.android.aapt.Style.getDefaultInstance()) {
                        this.value_ = com.android.aapt.Style.newBuilder((com.android.aapt.Style)this.value_).mergeFrom(value).buildPartial();
                    } else {
                        this.value_ = value;
                    }

                    this.onChanged();
                } else {
                    if (this.valueCase_ == 2) {
                        this.styleBuilder_.mergeFrom(value);
                    }

                    this.styleBuilder_.setMessage(value);
                }

                this.valueCase_ = 2;
                return this;
            }

            public com.android.aapt.CompoundValue.Builder clearStyle() {
                if (this.styleBuilder_ == null) {
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

                    this.styleBuilder_.clear();
                }

                return this;
            }

            public com.android.aapt.Style.Builder getStyleBuilder() {
                return (com.android.aapt.Style.Builder)this.getStyleFieldBuilder().getBuilder();
            }

            public com.android.aapt.StyleOrBuilder getStyleOrBuilder() {
                if (this.valueCase_ == 2 && this.styleBuilder_ != null) {
                    return (com.android.aapt.StyleOrBuilder)this.styleBuilder_.getMessageOrBuilder();
                } else {
                    return this.valueCase_ == 2 ? (com.android.aapt.Style)this.value_ : com.android.aapt.Style.getDefaultInstance();
                }
            }

            private SingleFieldBuilderV3<com.android.aapt.Style, com.android.aapt.Style.Builder, com.android.aapt.StyleOrBuilder> getStyleFieldBuilder() {
                if (this.styleBuilder_ == null) {
                    if (this.valueCase_ != 2) {
                        this.value_ = com.android.aapt.Style.getDefaultInstance();
                    }

                    this.styleBuilder_ = new SingleFieldBuilderV3((com.android.aapt.Style)this.value_, this.getParentForChildren(), this.isClean());
                    this.value_ = null;
                }

                this.valueCase_ = 2;
                this.onChanged();
                return this.styleBuilder_;
            }

            public boolean hasStyleable() {
                return this.valueCase_ == 3;
            }

            public com.android.aapt.Styleable getStyleable() {
                if (this.styleableBuilder_ == null) {
                    return this.valueCase_ == 3 ? (com.android.aapt.Styleable)this.value_ : com.android.aapt.Styleable.getDefaultInstance();
                } else {
                    return this.valueCase_ == 3 ? (com.android.aapt.Styleable)this.styleableBuilder_.getMessage() : com.android.aapt.Styleable.getDefaultInstance();
                }
            }

            public com.android.aapt.CompoundValue.Builder setStyleable(com.android.aapt.Styleable value) {
                if (this.styleableBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.value_ = value;
                    this.onChanged();
                } else {
                    this.styleableBuilder_.setMessage(value);
                }

                this.valueCase_ = 3;
                return this;
            }

            public com.android.aapt.CompoundValue.Builder setStyleable(com.android.aapt.Styleable.Builder builderForValue) {
                if (this.styleableBuilder_ == null) {
                    this.value_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.styleableBuilder_.setMessage(builderForValue.build());
                }

                this.valueCase_ = 3;
                return this;
            }

            public com.android.aapt.CompoundValue.Builder mergeStyleable(com.android.aapt.Styleable value) {
                if (this.styleableBuilder_ == null) {
                    if (this.valueCase_ == 3 && this.value_ != com.android.aapt.Styleable.getDefaultInstance()) {
                        this.value_ = com.android.aapt.Styleable.newBuilder((com.android.aapt.Styleable)this.value_).mergeFrom(value).buildPartial();
                    } else {
                        this.value_ = value;
                    }

                    this.onChanged();
                } else {
                    if (this.valueCase_ == 3) {
                        this.styleableBuilder_.mergeFrom(value);
                    }

                    this.styleableBuilder_.setMessage(value);
                }

                this.valueCase_ = 3;
                return this;
            }

            public com.android.aapt.CompoundValue.Builder clearStyleable() {
                if (this.styleableBuilder_ == null) {
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

                    this.styleableBuilder_.clear();
                }

                return this;
            }

            public com.android.aapt.Styleable.Builder getStyleableBuilder() {
                return (com.android.aapt.Styleable.Builder)this.getStyleableFieldBuilder().getBuilder();
            }

            public com.android.aapt.StyleableOrBuilder getStyleableOrBuilder() {
                if (this.valueCase_ == 3 && this.styleableBuilder_ != null) {
                    return (com.android.aapt.StyleableOrBuilder)this.styleableBuilder_.getMessageOrBuilder();
                } else {
                    return this.valueCase_ == 3 ? (com.android.aapt.Styleable)this.value_ : com.android.aapt.Styleable.getDefaultInstance();
                }
            }

            private SingleFieldBuilderV3<com.android.aapt.Styleable, com.android.aapt.Styleable.Builder, com.android.aapt.StyleableOrBuilder> getStyleableFieldBuilder() {
                if (this.styleableBuilder_ == null) {
                    if (this.valueCase_ != 3) {
                        this.value_ = com.android.aapt.Styleable.getDefaultInstance();
                    }

                    this.styleableBuilder_ = new SingleFieldBuilderV3((com.android.aapt.Styleable)this.value_, this.getParentForChildren(), this.isClean());
                    this.value_ = null;
                }

                this.valueCase_ = 3;
                this.onChanged();
                return this.styleableBuilder_;
            }

            public boolean hasArray() {
                return this.valueCase_ == 4;
            }

            public PBArray getArray() {
                if (this.arrayBuilder_ == null) {
                    return this.valueCase_ == 4 ? (PBArray)this.value_ : PBArray.getDefaultInstance();
                } else {
                    return this.valueCase_ == 4 ? (PBArray)this.arrayBuilder_.getMessage() : PBArray.getDefaultInstance();
                }
            }

            public com.android.aapt.CompoundValue.Builder setArray(PBArray value) {
                if (this.arrayBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.value_ = value;
                    this.onChanged();
                } else {
                    this.arrayBuilder_.setMessage(value);
                }

                this.valueCase_ = 4;
                return this;
            }

            public com.android.aapt.CompoundValue.Builder setArray(PBArray.Builder builderForValue) {
                if (this.arrayBuilder_ == null) {
                    this.value_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.arrayBuilder_.setMessage(builderForValue.build());
                }

                this.valueCase_ = 4;
                return this;
            }

            public com.android.aapt.CompoundValue.Builder mergeArray(PBArray value) {
                if (this.arrayBuilder_ == null) {
                    if (this.valueCase_ == 4 && this.value_ != PBArray.getDefaultInstance()) {
                        this.value_ = PBArray.newBuilder((PBArray)this.value_).mergeFrom(value).buildPartial();
                    } else {
                        this.value_ = value;
                    }

                    this.onChanged();
                } else {
                    if (this.valueCase_ == 4) {
                        this.arrayBuilder_.mergeFrom(value);
                    }

                    this.arrayBuilder_.setMessage(value);
                }

                this.valueCase_ = 4;
                return this;
            }

            public com.android.aapt.CompoundValue.Builder clearArray() {
                if (this.arrayBuilder_ == null) {
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

                    this.arrayBuilder_.clear();
                }

                return this;
            }

            public PBArray.Builder getArrayBuilder() {
                return (PBArray.Builder)this.getArrayFieldBuilder().getBuilder();
            }

            public com.android.aapt.ArrayOrBuilder getArrayOrBuilder() {
                if (this.valueCase_ == 4 && this.arrayBuilder_ != null) {
                    return (com.android.aapt.ArrayOrBuilder)this.arrayBuilder_.getMessageOrBuilder();
                } else {
                    return this.valueCase_ == 4 ? (PBArray)this.value_ : PBArray.getDefaultInstance();
                }
            }

            private SingleFieldBuilderV3<PBArray, PBArray.Builder, com.android.aapt.ArrayOrBuilder> getArrayFieldBuilder() {
                if (this.arrayBuilder_ == null) {
                    if (this.valueCase_ != 4) {
                        this.value_ = PBArray.getDefaultInstance();
                    }

                    this.arrayBuilder_ = new SingleFieldBuilderV3((PBArray)this.value_, this.getParentForChildren(), this.isClean());
                    this.value_ = null;
                }

                this.valueCase_ = 4;
                this.onChanged();
                return this.arrayBuilder_;
            }

            public boolean hasPlural() {
                return this.valueCase_ == 5;
            }

            public com.android.aapt.Plural getPlural() {
                if (this.pluralBuilder_ == null) {
                    return this.valueCase_ == 5 ? (com.android.aapt.Plural)this.value_ : com.android.aapt.Plural.getDefaultInstance();
                } else {
                    return this.valueCase_ == 5 ? (com.android.aapt.Plural)this.pluralBuilder_.getMessage() : com.android.aapt.Plural.getDefaultInstance();
                }
            }

            public com.android.aapt.CompoundValue.Builder setPlural(com.android.aapt.Plural value) {
                if (this.pluralBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.value_ = value;
                    this.onChanged();
                } else {
                    this.pluralBuilder_.setMessage(value);
                }

                this.valueCase_ = 5;
                return this;
            }

            public com.android.aapt.CompoundValue.Builder setPlural(com.android.aapt.Plural.Builder builderForValue) {
                if (this.pluralBuilder_ == null) {
                    this.value_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.pluralBuilder_.setMessage(builderForValue.build());
                }

                this.valueCase_ = 5;
                return this;
            }

            public com.android.aapt.CompoundValue.Builder mergePlural(com.android.aapt.Plural value) {
                if (this.pluralBuilder_ == null) {
                    if (this.valueCase_ == 5 && this.value_ != com.android.aapt.Plural.getDefaultInstance()) {
                        this.value_ = com.android.aapt.Plural.newBuilder((com.android.aapt.Plural)this.value_).mergeFrom(value).buildPartial();
                    } else {
                        this.value_ = value;
                    }

                    this.onChanged();
                } else {
                    if (this.valueCase_ == 5) {
                        this.pluralBuilder_.mergeFrom(value);
                    }

                    this.pluralBuilder_.setMessage(value);
                }

                this.valueCase_ = 5;
                return this;
            }

            public com.android.aapt.CompoundValue.Builder clearPlural() {
                if (this.pluralBuilder_ == null) {
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

                    this.pluralBuilder_.clear();
                }

                return this;
            }

            public com.android.aapt.Plural.Builder getPluralBuilder() {
                return (com.android.aapt.Plural.Builder)this.getPluralFieldBuilder().getBuilder();
            }

            public com.android.aapt.PluralOrBuilder getPluralOrBuilder() {
                if (this.valueCase_ == 5 && this.pluralBuilder_ != null) {
                    return (com.android.aapt.PluralOrBuilder)this.pluralBuilder_.getMessageOrBuilder();
                } else {
                    return this.valueCase_ == 5 ? (com.android.aapt.Plural)this.value_ : com.android.aapt.Plural.getDefaultInstance();
                }
            }

            private SingleFieldBuilderV3<com.android.aapt.Plural, com.android.aapt.Plural.Builder, com.android.aapt.PluralOrBuilder> getPluralFieldBuilder() {
                if (this.pluralBuilder_ == null) {
                    if (this.valueCase_ != 5) {
                        this.value_ = com.android.aapt.Plural.getDefaultInstance();
                    }

                    this.pluralBuilder_ = new SingleFieldBuilderV3((com.android.aapt.Plural)this.value_, this.getParentForChildren(), this.isClean());
                    this.value_ = null;
                }

                this.valueCase_ = 5;
                this.onChanged();
                return this.pluralBuilder_;
            }

            public boolean hasMacro() {
                return this.valueCase_ == 6;
            }

            public com.android.aapt.MacroBody getMacro() {
                if (this.macroBuilder_ == null) {
                    return this.valueCase_ == 6 ? (com.android.aapt.MacroBody)this.value_ : com.android.aapt.MacroBody.getDefaultInstance();
                } else {
                    return this.valueCase_ == 6 ? (com.android.aapt.MacroBody)this.macroBuilder_.getMessage() : com.android.aapt.MacroBody.getDefaultInstance();
                }
            }

            public com.android.aapt.CompoundValue.Builder setMacro(com.android.aapt.MacroBody value) {
                if (this.macroBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.value_ = value;
                    this.onChanged();
                } else {
                    this.macroBuilder_.setMessage(value);
                }

                this.valueCase_ = 6;
                return this;
            }

            public com.android.aapt.CompoundValue.Builder setMacro(com.android.aapt.MacroBody.Builder builderForValue) {
                if (this.macroBuilder_ == null) {
                    this.value_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.macroBuilder_.setMessage(builderForValue.build());
                }

                this.valueCase_ = 6;
                return this;
            }

            public com.android.aapt.CompoundValue.Builder mergeMacro(com.android.aapt.MacroBody value) {
                if (this.macroBuilder_ == null) {
                    if (this.valueCase_ == 6 && this.value_ != com.android.aapt.MacroBody.getDefaultInstance()) {
                        this.value_ = com.android.aapt.MacroBody.newBuilder((com.android.aapt.MacroBody)this.value_).mergeFrom(value).buildPartial();
                    } else {
                        this.value_ = value;
                    }

                    this.onChanged();
                } else {
                    if (this.valueCase_ == 6) {
                        this.macroBuilder_.mergeFrom(value);
                    }

                    this.macroBuilder_.setMessage(value);
                }

                this.valueCase_ = 6;
                return this;
            }

            public com.android.aapt.CompoundValue.Builder clearMacro() {
                if (this.macroBuilder_ == null) {
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

                    this.macroBuilder_.clear();
                }

                return this;
            }

            public com.android.aapt.MacroBody.Builder getMacroBuilder() {
                return (com.android.aapt.MacroBody.Builder)this.getMacroFieldBuilder().getBuilder();
            }

            public com.android.aapt.MacroBodyOrBuilder getMacroOrBuilder() {
                if (this.valueCase_ == 6 && this.macroBuilder_ != null) {
                    return (com.android.aapt.MacroBodyOrBuilder)this.macroBuilder_.getMessageOrBuilder();
                } else {
                    return this.valueCase_ == 6 ? (com.android.aapt.MacroBody)this.value_ : com.android.aapt.MacroBody.getDefaultInstance();
                }
            }

            private SingleFieldBuilderV3<com.android.aapt.MacroBody, com.android.aapt.MacroBody.Builder, com.android.aapt.MacroBodyOrBuilder> getMacroFieldBuilder() {
                if (this.macroBuilder_ == null) {
                    if (this.valueCase_ != 6) {
                        this.value_ = com.android.aapt.MacroBody.getDefaultInstance();
                    }

                    this.macroBuilder_ = new SingleFieldBuilderV3((com.android.aapt.MacroBody)this.value_, this.getParentForChildren(), this.isClean());
                    this.value_ = null;
                }

                this.valueCase_ = 6;
                this.onChanged();
                return this.macroBuilder_;
            }

            public final com.android.aapt.CompoundValue.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.CompoundValue.Builder)super.setUnknownFields(unknownFields);
            }

            public final com.android.aapt.CompoundValue.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.CompoundValue.Builder)super.mergeUnknownFields(unknownFields);
            }
        }

        public static enum ValueCase implements Internal.EnumLite, InternalOneOfEnum {
            ATTR(1),
            STYLE(2),
            STYLEABLE(3),
            ARRAY(4),
            PLURAL(5),
            MACRO(6),
            VALUE_NOT_SET(0);

            private final int value;

            private ValueCase(int value) {
                this.value = value;
            }

            /** @deprecated */
            @Deprecated
            public static com.android.aapt.CompoundValue.ValueCase valueOf(int value) {
                return forNumber(value);
            }

            public static com.android.aapt.CompoundValue.ValueCase forNumber(int value) {
                switch(value) {
                    case 0:
                        return VALUE_NOT_SET;
                    case 1:
                        return ATTR;
                    case 2:
                        return STYLE;
                    case 3:
                        return STYLEABLE;
                    case 4:
                        return ARRAY;
                    case 5:
                        return PLURAL;
                    case 6:
                        return MACRO;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.value;
            }
        }
    }