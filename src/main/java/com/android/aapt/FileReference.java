package com.android.aapt;

import com.google.protobuf.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class FileReference extends GeneratedMessageV3 implements com.android.aapt.FileReferenceOrBuilder {
        private static final long serialVersionUID = 0L;
        public static final int PATH_FIELD_NUMBER = 1;
        private volatile Object path_;
        public static final int TYPE_FIELD_NUMBER = 2;
        private int type_;
        private byte memoizedIsInitialized;
        private static final com.android.aapt.FileReference DEFAULT_INSTANCE = new com.android.aapt.FileReference();
        private static final Parser<com.android.aapt.FileReference> PARSER = new AbstractParser<com.android.aapt.FileReference>() {
            public com.android.aapt.FileReference parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new com.android.aapt.FileReference(input, extensionRegistry);
            }
        };

        private FileReference(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private FileReference() {
            this.memoizedIsInitialized = -1;
            this.path_ = "";
            this.type_ = 0;
        }

        @Override
        public Object newInstance(UnusedPrivateParameter unused) {
            return new com.android.aapt.FileReference();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private FileReference(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                java.lang.String s = input.readStringRequireUtf8();
                                this.path_ = s;
                                break;
                            case 16:
                                int rawValue = input.readEnum();
                                this.type_ = rawValue;
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
            return Resources.internal_static_aapt_pb_FileReference_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_FileReference_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.FileReference.class, com.android.aapt.FileReference.Builder.class);
        }

        public java.lang.String getPath() {
            Object ref = this.path_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String)ref;
            } else {
                ByteString bs = (ByteString)ref;
                java.lang.String s = bs.toStringUtf8();
                this.path_ = s;
                return s;
            }
        }

        public ByteString getPathBytes() {
            Object ref = this.path_;
            if (ref instanceof java.lang.String) {
                ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                this.path_ = b;
                return b;
            } else {
                return (ByteString)ref;
            }
        }

        public int getTypeValue() {
            return this.type_;
        }

        public com.android.aapt.FileReference.Type getType() {
            com.android.aapt.FileReference.Type result = com.android.aapt.FileReference.Type.valueOf(this.type_);
            return result == null ? com.android.aapt.FileReference.Type.UNRECOGNIZED : result;
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
            if (!this.getPathBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 1, this.path_);
            }

            if (this.type_ != com.android.aapt.FileReference.Type.UNKNOWN.getNumber()) {
                output.writeEnum(2, this.type_);
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
                if (!this.getPathBytes().isEmpty()) {
                    size += GeneratedMessageV3.computeStringSize(1, this.path_);
                }

                if (this.type_ != com.android.aapt.FileReference.Type.UNKNOWN.getNumber()) {
                    size += CodedOutputStream.computeEnumSize(2, this.type_);
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
            } else if (!(obj instanceof com.android.aapt.FileReference)) {
                return super.equals(obj);
            } else {
                com.android.aapt.FileReference other = (com.android.aapt.FileReference)obj;
                if (!this.getPath().equals(other.getPath())) {
                    return false;
                } else if (this.type_ != other.type_) {
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
                hash = 53 * hash + this.getPath().hashCode();
                hash = 37 * hash + 2;
                hash = 53 * hash + this.type_;
                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static com.android.aapt.FileReference parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (com.android.aapt.FileReference)PARSER.parseFrom(data);
        }

        public static com.android.aapt.FileReference parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.FileReference)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.FileReference parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (com.android.aapt.FileReference)PARSER.parseFrom(data);
        }

        public static com.android.aapt.FileReference parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.FileReference)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.FileReference parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (com.android.aapt.FileReference)PARSER.parseFrom(data);
        }

        public static com.android.aapt.FileReference parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.FileReference)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.FileReference parseFrom(InputStream input) throws IOException {
            return (com.android.aapt.FileReference)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.FileReference parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.FileReference)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.FileReference parseDelimitedFrom(InputStream input) throws IOException {
            return (com.android.aapt.FileReference)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static com.android.aapt.FileReference parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.FileReference)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.FileReference parseFrom(CodedInputStream input) throws IOException {
            return (com.android.aapt.FileReference)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.FileReference parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.FileReference)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public com.android.aapt.FileReference.Builder newBuilderForType() {
            return newBuilder();
        }

        public static com.android.aapt.FileReference.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static com.android.aapt.FileReference.Builder newBuilder(com.android.aapt.FileReference prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public com.android.aapt.FileReference.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new com.android.aapt.FileReference.Builder() : (new com.android.aapt.FileReference.Builder()).mergeFrom(this);
        }

        public com.android.aapt.FileReference.Builder newBuilderForType(BuilderParent parent) {
            com.android.aapt.FileReference.Builder builder = new com.android.aapt.FileReference.Builder(parent);
            return builder;
        }

        public static com.android.aapt.FileReference getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<com.android.aapt.FileReference> parser() {
            return PARSER;
        }

        public Parser<com.android.aapt.FileReference> getParserForType() {
            return PARSER;
        }

        public com.android.aapt.FileReference getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.FileReference.Builder> implements com.android.aapt.FileReferenceOrBuilder {
            private Object path_;
            private int type_;

            public static Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_FileReference_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_FileReference_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.FileReference.class, com.android.aapt.FileReference.Builder.class);
            }

            private Builder() {
                this.path_ = "";
                this.type_ = 0;
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.path_ = "";
                this.type_ = 0;
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.android.aapt.FileReference.alwaysUseFieldBuilders) {
                }

            }

            public com.android.aapt.FileReference.Builder clear() {
                super.clear();
                this.path_ = "";
                this.type_ = 0;
                return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Resources.internal_static_aapt_pb_FileReference_descriptor;
            }

            public com.android.aapt.FileReference getDefaultInstanceForType() {
                return com.android.aapt.FileReference.getDefaultInstance();
            }

            public com.android.aapt.FileReference build() {
                com.android.aapt.FileReference result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public com.android.aapt.FileReference buildPartial() {
                com.android.aapt.FileReference result = new com.android.aapt.FileReference(this);
                result.path_ = this.path_;
                result.type_ = this.type_;
                this.onBuilt();
                return result;
            }

            public com.android.aapt.FileReference.Builder clone() {
                return (com.android.aapt.FileReference.Builder)super.clone();
            }

            public com.android.aapt.FileReference.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.FileReference.Builder)super.setField(field, value);
            }

            public com.android.aapt.FileReference.Builder clearField(Descriptors.FieldDescriptor field) {
                return (com.android.aapt.FileReference.Builder)super.clearField(field);
            }

            public com.android.aapt.FileReference.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (com.android.aapt.FileReference.Builder)super.clearOneof(oneof);
            }

            public com.android.aapt.FileReference.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (com.android.aapt.FileReference.Builder)super.setRepeatedField(field, index, value);
            }

            public com.android.aapt.FileReference.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.FileReference.Builder)super.addRepeatedField(field, value);
            }

            public com.android.aapt.FileReference.Builder mergeFrom(Message other) {
                if (other instanceof com.android.aapt.FileReference) {
                    return this.mergeFrom((com.android.aapt.FileReference)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public com.android.aapt.FileReference.Builder mergeFrom(com.android.aapt.FileReference other) {
                if (other == com.android.aapt.FileReference.getDefaultInstance()) {
                    return this;
                } else {
                    if (!other.getPath().isEmpty()) {
                        this.path_ = other.path_;
                        this.onChanged();
                    }

                    if (other.type_ != 0) {
                        this.setTypeValue(other.getTypeValue());
                    }

                    this.mergeUnknownFields(other.unknownFields);
                    this.onChanged();
                    return this;
                }
            }

            public final boolean isInitialized() {
                return true;
            }

            public com.android.aapt.FileReference.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                com.android.aapt.FileReference parsedMessage = null;

                try {
                    parsedMessage = (com.android.aapt.FileReference)com.android.aapt.FileReference.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (com.android.aapt.FileReference)var8.getUnfinishedMessage();
                    throw var8.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }

                }

                return this;
            }

            public java.lang.String getPath() {
                Object ref = this.path_;
                if (!(ref instanceof java.lang.String)) {
                    ByteString bs = (ByteString)ref;
                    java.lang.String s = bs.toStringUtf8();
                    this.path_ = s;
                    return s;
                } else {
                    return (java.lang.String)ref;
                }
            }

            public ByteString getPathBytes() {
                Object ref = this.path_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                    this.path_ = b;
                    return b;
                } else {
                    return (ByteString)ref;
                }
            }

            public com.android.aapt.FileReference.Builder setPath(java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.path_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public com.android.aapt.FileReference.Builder clearPath() {
                this.path_ = com.android.aapt.FileReference.getDefaultInstance().getPath();
                this.onChanged();
                return this;
            }

            public com.android.aapt.FileReference.Builder setPathBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    com.android.aapt.FileReference.checkByteStringIsUtf8(value);
                    this.path_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public int getTypeValue() {
                return this.type_;
            }

            public com.android.aapt.FileReference.Builder setTypeValue(int value) {
                this.type_ = value;
                this.onChanged();
                return this;
            }

            public com.android.aapt.FileReference.Type getType() {
                com.android.aapt.FileReference.Type result = com.android.aapt.FileReference.Type.valueOf(this.type_);
                return result == null ? com.android.aapt.FileReference.Type.UNRECOGNIZED : result;
            }

            public com.android.aapt.FileReference.Builder setType(com.android.aapt.FileReference.Type value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.type_ = value.getNumber();
                    this.onChanged();
                    return this;
                }
            }

            public com.android.aapt.FileReference.Builder clearType() {
                this.type_ = 0;
                this.onChanged();
                return this;
            }

            public final com.android.aapt.FileReference.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.FileReference.Builder)super.setUnknownFields(unknownFields);
            }

            public final com.android.aapt.FileReference.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.FileReference.Builder)super.mergeUnknownFields(unknownFields);
            }
        }

        public static enum Type implements ProtocolMessageEnum {
            UNKNOWN(0),
            PNG(1),
            BINARY_XML(2),
            PROTO_XML(3),
            UNRECOGNIZED(-1);

            public static final int UNKNOWN_VALUE = 0;
            public static final int PNG_VALUE = 1;
            public static final int BINARY_XML_VALUE = 2;
            public static final int PROTO_XML_VALUE = 3;
            private static final Internal.EnumLiteMap<Type> internalValueMap = new Internal.EnumLiteMap<Type>() {
                public com.android.aapt.FileReference.Type findValueByNumber(int number) {
                    return com.android.aapt.FileReference.Type.forNumber(number);
                }
            };
            private static final com.android.aapt.FileReference.Type[] VALUES = values();
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
            public static com.android.aapt.FileReference.Type valueOf(int value) {
                return forNumber(value);
            }

            public static com.android.aapt.FileReference.Type forNumber(int value) {
                switch(value) {
                    case 0:
                        return UNKNOWN;
                    case 1:
                        return PNG;
                    case 2:
                        return BINARY_XML;
                    case 3:
                        return PROTO_XML;
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
                return (Descriptors.EnumDescriptor)com.android.aapt.FileReference.getDescriptor().getEnumTypes().get(0);
            }

            public static com.android.aapt.FileReference.Type valueOf(Descriptors.EnumValueDescriptor desc) {
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