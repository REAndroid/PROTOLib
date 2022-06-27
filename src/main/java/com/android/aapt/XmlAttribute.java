package com.android.aapt;

import com.google.protobuf.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class XmlAttribute extends GeneratedMessageV3 implements com.android.aapt.XmlAttributeOrBuilder {
        private static final long serialVersionUID = 0L;
        public static final int NAMESPACE_URI_FIELD_NUMBER = 1;
        private volatile Object namespaceUri_;
        public static final int NAME_FIELD_NUMBER = 2;
        private volatile Object name_;
        public static final int VALUE_FIELD_NUMBER = 3;
        private volatile Object value_;
        public static final int SOURCE_FIELD_NUMBER = 4;
        private com.android.aapt.SourcePosition source_;
        public static final int RESOURCE_ID_FIELD_NUMBER = 5;
        private int resourceId_;
        public static final int COMPILED_ITEM_FIELD_NUMBER = 6;
        private com.android.aapt.Item compiledItem_;
        private byte memoizedIsInitialized;
        private static final com.android.aapt.XmlAttribute DEFAULT_INSTANCE = new com.android.aapt.XmlAttribute();
        private static final Parser<com.android.aapt.XmlAttribute> PARSER = new AbstractParser<com.android.aapt.XmlAttribute>() {
            public com.android.aapt.XmlAttribute parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new com.android.aapt.XmlAttribute(input, extensionRegistry);
            }
        };

        private XmlAttribute(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private XmlAttribute() {
            this.memoizedIsInitialized = -1;
            this.namespaceUri_ = "";
            this.name_ = "";
            this.value_ = "";
        }

        @Override
        public Object newInstance(UnusedPrivateParameter unused) {
            return new com.android.aapt.XmlAttribute();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private XmlAttribute(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            } else {
                com.google.protobuf.UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

                try {
                    boolean done = false;

                    while(!done) {
                        int tag = input.readTag();
                        java.lang.String s;
                        switch(tag) {
                            case 0:
                                done = true;
                                break;
                            case 10:
                                s = input.readStringRequireUtf8();
                                this.namespaceUri_ = s;
                                break;
                            case 18:
                                s = input.readStringRequireUtf8();
                                this.name_ = s;
                                break;
                            case 26:
                                s = input.readStringRequireUtf8();
                                this.value_ = s;
                                break;
                            case 34:
                                com.android.aapt.SourcePosition.Builder subBuilder = null;
                                if (this.source_ != null) {
                                    subBuilder = this.source_.toBuilder();
                                }

                                this.source_ = (com.android.aapt.SourcePosition)input.readMessage(com.android.aapt.SourcePosition.parser(), extensionRegistry);
                                if (subBuilder != null) {
                                    subBuilder.mergeFrom(this.source_);
                                    this.source_ = subBuilder.buildPartial();
                                }
                                break;
                            case 40:
                                this.resourceId_ = input.readUInt32();
                                break;
                            case 50:
                                com.android.aapt.Item.Builder subBuilder2 = null;
                                if (this.compiledItem_ != null) {
                                    subBuilder2 = this.compiledItem_.toBuilder();
                                }

                                this.compiledItem_ = (com.android.aapt.Item)input.readMessage(com.android.aapt.Item.parser(), extensionRegistry);
                                if (subBuilder2 != null) {
                                    subBuilder2.mergeFrom(this.compiledItem_);
                                    this.compiledItem_ = subBuilder2.buildPartial();
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
            return Resources.internal_static_aapt_pb_XmlAttribute_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_XmlAttribute_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.XmlAttribute.class, com.android.aapt.XmlAttribute.Builder.class);
        }

        public java.lang.String getNamespaceUri() {
            Object ref = this.namespaceUri_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String)ref;
            } else {
                ByteString bs = (ByteString)ref;
                java.lang.String s = bs.toStringUtf8();
                this.namespaceUri_ = s;
                return s;
            }
        }

        public ByteString getNamespaceUriBytes() {
            Object ref = this.namespaceUri_;
            if (ref instanceof java.lang.String) {
                ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                this.namespaceUri_ = b;
                return b;
            } else {
                return (ByteString)ref;
            }
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

        public java.lang.String getValue() {
            Object ref = this.value_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String)ref;
            } else {
                ByteString bs = (ByteString)ref;
                java.lang.String s = bs.toStringUtf8();
                this.value_ = s;
                return s;
            }
        }

        public ByteString getValueBytes() {
            Object ref = this.value_;
            if (ref instanceof java.lang.String) {
                ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                this.value_ = b;
                return b;
            } else {
                return (ByteString)ref;
            }
        }

        public boolean hasSource() {
            return this.source_ != null;
        }

        public com.android.aapt.SourcePosition getSource() {
            return this.source_ == null ? com.android.aapt.SourcePosition.getDefaultInstance() : this.source_;
        }

        public com.android.aapt.SourcePositionOrBuilder getSourceOrBuilder() {
            return this.getSource();
        }

        public int getResourceId() {
            return this.resourceId_;
        }

        public boolean hasCompiledItem() {
            return this.compiledItem_ != null;
        }

        public com.android.aapt.Item getCompiledItem() {
            return this.compiledItem_ == null ? com.android.aapt.Item.getDefaultInstance() : this.compiledItem_;
        }

        public com.android.aapt.ItemOrBuilder getCompiledItemOrBuilder() {
            return this.getCompiledItem();
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
            if (!this.getNamespaceUriBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 1, this.namespaceUri_);
            }

            if (!this.getNameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 2, this.name_);
            }

            if (!this.getValueBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 3, this.value_);
            }

            if (this.source_ != null) {
                output.writeMessage(4, this.getSource());
            }

            if (this.resourceId_ != 0) {
                output.writeUInt32(5, this.resourceId_);
            }

            if (this.compiledItem_ != null) {
                output.writeMessage(6, this.getCompiledItem());
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
                if (!this.getNamespaceUriBytes().isEmpty()) {
                    size += GeneratedMessageV3.computeStringSize(1, this.namespaceUri_);
                }

                if (!this.getNameBytes().isEmpty()) {
                    size += GeneratedMessageV3.computeStringSize(2, this.name_);
                }

                if (!this.getValueBytes().isEmpty()) {
                    size += GeneratedMessageV3.computeStringSize(3, this.value_);
                }

                if (this.source_ != null) {
                    size += CodedOutputStream.computeMessageSize(4, this.getSource());
                }

                if (this.resourceId_ != 0) {
                    size += CodedOutputStream.computeUInt32Size(5, this.resourceId_);
                }

                if (this.compiledItem_ != null) {
                    size += CodedOutputStream.computeMessageSize(6, this.getCompiledItem());
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
            } else if (!(obj instanceof com.android.aapt.XmlAttribute)) {
                return super.equals(obj);
            } else {
                com.android.aapt.XmlAttribute other = (com.android.aapt.XmlAttribute)obj;
                if (!this.getNamespaceUri().equals(other.getNamespaceUri())) {
                    return false;
                } else if (!this.getName().equals(other.getName())) {
                    return false;
                } else if (!this.getValue().equals(other.getValue())) {
                    return false;
                } else if (this.hasSource() != other.hasSource()) {
                    return false;
                } else if (this.hasSource() && !this.getSource().equals(other.getSource())) {
                    return false;
                } else if (this.getResourceId() != other.getResourceId()) {
                    return false;
                } else if (this.hasCompiledItem() != other.hasCompiledItem()) {
                    return false;
                } else if (this.hasCompiledItem() && !this.getCompiledItem().equals(other.getCompiledItem())) {
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
                hash = 53 * hash + this.getNamespaceUri().hashCode();
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getName().hashCode();
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getValue().hashCode();
                if (this.hasSource()) {
                    hash = 37 * hash + 4;
                    hash = 53 * hash + this.getSource().hashCode();
                }

                hash = 37 * hash + 5;
                hash = 53 * hash + this.getResourceId();
                if (this.hasCompiledItem()) {
                    hash = 37 * hash + 6;
                    hash = 53 * hash + this.getCompiledItem().hashCode();
                }

                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static com.android.aapt.XmlAttribute parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (com.android.aapt.XmlAttribute)PARSER.parseFrom(data);
        }

        public static com.android.aapt.XmlAttribute parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.XmlAttribute)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.XmlAttribute parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (com.android.aapt.XmlAttribute)PARSER.parseFrom(data);
        }

        public static com.android.aapt.XmlAttribute parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.XmlAttribute)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.XmlAttribute parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (com.android.aapt.XmlAttribute)PARSER.parseFrom(data);
        }

        public static com.android.aapt.XmlAttribute parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.XmlAttribute)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.XmlAttribute parseFrom(InputStream input) throws IOException {
            return (com.android.aapt.XmlAttribute)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.XmlAttribute parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.XmlAttribute)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.XmlAttribute parseDelimitedFrom(InputStream input) throws IOException {
            return (com.android.aapt.XmlAttribute)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static com.android.aapt.XmlAttribute parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.XmlAttribute)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.XmlAttribute parseFrom(CodedInputStream input) throws IOException {
            return (com.android.aapt.XmlAttribute)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.XmlAttribute parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.XmlAttribute)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public com.android.aapt.XmlAttribute.Builder newBuilderForType() {
            return newBuilder();
        }

        public static com.android.aapt.XmlAttribute.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static com.android.aapt.XmlAttribute.Builder newBuilder(com.android.aapt.XmlAttribute prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public com.android.aapt.XmlAttribute.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new com.android.aapt.XmlAttribute.Builder() : (new com.android.aapt.XmlAttribute.Builder()).mergeFrom(this);
        }

        public com.android.aapt.XmlAttribute.Builder newBuilderForType(BuilderParent parent) {
            com.android.aapt.XmlAttribute.Builder builder = new com.android.aapt.XmlAttribute.Builder(parent);
            return builder;
        }

        public static com.android.aapt.XmlAttribute getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<com.android.aapt.XmlAttribute> parser() {
            return PARSER;
        }

        public Parser<com.android.aapt.XmlAttribute> getParserForType() {
            return PARSER;
        }

        public com.android.aapt.XmlAttribute getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.XmlAttribute.Builder> implements com.android.aapt.XmlAttributeOrBuilder {
            private Object namespaceUri_;
            private Object name_;
            private Object value_;
            private com.android.aapt.SourcePosition source_;
            private SingleFieldBuilderV3<com.android.aapt.SourcePosition, com.android.aapt.SourcePosition.Builder, com.android.aapt.SourcePositionOrBuilder> sourceBuilder_;
            private int resourceId_;
            private com.android.aapt.Item compiledItem_;
            private SingleFieldBuilderV3<com.android.aapt.Item, com.android.aapt.Item.Builder, com.android.aapt.ItemOrBuilder> compiledItemBuilder_;

            public static Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_XmlAttribute_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_XmlAttribute_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.XmlAttribute.class, com.android.aapt.XmlAttribute.Builder.class);
            }

            private Builder() {
                this.namespaceUri_ = "";
                this.name_ = "";
                this.value_ = "";
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.namespaceUri_ = "";
                this.name_ = "";
                this.value_ = "";
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.android.aapt.XmlAttribute.alwaysUseFieldBuilders) {
                }

            }

            public com.android.aapt.XmlAttribute.Builder clear() {
                super.clear();
                this.namespaceUri_ = "";
                this.name_ = "";
                this.value_ = "";
                if (this.sourceBuilder_ == null) {
                    this.source_ = null;
                } else {
                    this.source_ = null;
                    this.sourceBuilder_ = null;
                }

                this.resourceId_ = 0;
                if (this.compiledItemBuilder_ == null) {
                    this.compiledItem_ = null;
                } else {
                    this.compiledItem_ = null;
                    this.compiledItemBuilder_ = null;
                }

                return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Resources.internal_static_aapt_pb_XmlAttribute_descriptor;
            }

            public com.android.aapt.XmlAttribute getDefaultInstanceForType() {
                return com.android.aapt.XmlAttribute.getDefaultInstance();
            }

            public com.android.aapt.XmlAttribute build() {
                com.android.aapt.XmlAttribute result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public com.android.aapt.XmlAttribute buildPartial() {
                com.android.aapt.XmlAttribute result = new com.android.aapt.XmlAttribute(this);
                result.namespaceUri_ = this.namespaceUri_;
                result.name_ = this.name_;
                result.value_ = this.value_;
                if (this.sourceBuilder_ == null) {
                    result.source_ = this.source_;
                } else {
                    result.source_ = (com.android.aapt.SourcePosition)this.sourceBuilder_.build();
                }

                result.resourceId_ = this.resourceId_;
                if (this.compiledItemBuilder_ == null) {
                    result.compiledItem_ = this.compiledItem_;
                } else {
                    result.compiledItem_ = (com.android.aapt.Item)this.compiledItemBuilder_.build();
                }

                this.onBuilt();
                return result;
            }

            public com.android.aapt.XmlAttribute.Builder clone() {
                return (com.android.aapt.XmlAttribute.Builder)super.clone();
            }

            public com.android.aapt.XmlAttribute.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.XmlAttribute.Builder)super.setField(field, value);
            }

            public com.android.aapt.XmlAttribute.Builder clearField(Descriptors.FieldDescriptor field) {
                return (com.android.aapt.XmlAttribute.Builder)super.clearField(field);
            }

            public com.android.aapt.XmlAttribute.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (com.android.aapt.XmlAttribute.Builder)super.clearOneof(oneof);
            }

            public com.android.aapt.XmlAttribute.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (com.android.aapt.XmlAttribute.Builder)super.setRepeatedField(field, index, value);
            }

            public com.android.aapt.XmlAttribute.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.XmlAttribute.Builder)super.addRepeatedField(field, value);
            }

            public com.android.aapt.XmlAttribute.Builder mergeFrom(Message other) {
                if (other instanceof com.android.aapt.XmlAttribute) {
                    return this.mergeFrom((com.android.aapt.XmlAttribute)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public com.android.aapt.XmlAttribute.Builder mergeFrom(com.android.aapt.XmlAttribute other) {
                if (other == com.android.aapt.XmlAttribute.getDefaultInstance()) {
                    return this;
                } else {
                    if (!other.getNamespaceUri().isEmpty()) {
                        this.namespaceUri_ = other.namespaceUri_;
                        this.onChanged();
                    }

                    if (!other.getName().isEmpty()) {
                        this.name_ = other.name_;
                        this.onChanged();
                    }

                    if (!other.getValue().isEmpty()) {
                        this.value_ = other.value_;
                        this.onChanged();
                    }

                    if (other.hasSource()) {
                        this.mergeSource(other.getSource());
                    }

                    if (other.getResourceId() != 0) {
                        this.setResourceId(other.getResourceId());
                    }

                    if (other.hasCompiledItem()) {
                        this.mergeCompiledItem(other.getCompiledItem());
                    }

                    this.mergeUnknownFields(other.unknownFields);
                    this.onChanged();
                    return this;
                }
            }

            public final boolean isInitialized() {
                return true;
            }

            public com.android.aapt.XmlAttribute.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                com.android.aapt.XmlAttribute parsedMessage = null;

                try {
                    parsedMessage = (com.android.aapt.XmlAttribute)com.android.aapt.XmlAttribute.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (com.android.aapt.XmlAttribute)var8.getUnfinishedMessage();
                    throw var8.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }

                }

                return this;
            }

            public java.lang.String getNamespaceUri() {
                Object ref = this.namespaceUri_;
                if (!(ref instanceof java.lang.String)) {
                    ByteString bs = (ByteString)ref;
                    java.lang.String s = bs.toStringUtf8();
                    this.namespaceUri_ = s;
                    return s;
                } else {
                    return (java.lang.String)ref;
                }
            }

            public ByteString getNamespaceUriBytes() {
                Object ref = this.namespaceUri_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                    this.namespaceUri_ = b;
                    return b;
                } else {
                    return (ByteString)ref;
                }
            }

            public com.android.aapt.XmlAttribute.Builder setNamespaceUri(java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.namespaceUri_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public com.android.aapt.XmlAttribute.Builder clearNamespaceUri() {
                this.namespaceUri_ = com.android.aapt.XmlAttribute.getDefaultInstance().getNamespaceUri();
                this.onChanged();
                return this;
            }

            public com.android.aapt.XmlAttribute.Builder setNamespaceUriBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    com.android.aapt.XmlAttribute.checkByteStringIsUtf8(value);
                    this.namespaceUri_ = value;
                    this.onChanged();
                    return this;
                }
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

            public com.android.aapt.XmlAttribute.Builder setName(java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.name_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public com.android.aapt.XmlAttribute.Builder clearName() {
                this.name_ = com.android.aapt.XmlAttribute.getDefaultInstance().getName();
                this.onChanged();
                return this;
            }

            public com.android.aapt.XmlAttribute.Builder setNameBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    com.android.aapt.XmlAttribute.checkByteStringIsUtf8(value);
                    this.name_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public java.lang.String getValue() {
                Object ref = this.value_;
                if (!(ref instanceof java.lang.String)) {
                    ByteString bs = (ByteString)ref;
                    java.lang.String s = bs.toStringUtf8();
                    this.value_ = s;
                    return s;
                } else {
                    return (java.lang.String)ref;
                }
            }

            public ByteString getValueBytes() {
                Object ref = this.value_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                    this.value_ = b;
                    return b;
                } else {
                    return (ByteString)ref;
                }
            }

            public com.android.aapt.XmlAttribute.Builder setValue(java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.value_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public com.android.aapt.XmlAttribute.Builder clearValue() {
                this.value_ = com.android.aapt.XmlAttribute.getDefaultInstance().getValue();
                this.onChanged();
                return this;
            }

            public com.android.aapt.XmlAttribute.Builder setValueBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    com.android.aapt.XmlAttribute.checkByteStringIsUtf8(value);
                    this.value_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public boolean hasSource() {
                return this.sourceBuilder_ != null || this.source_ != null;
            }

            public com.android.aapt.SourcePosition getSource() {
                if (this.sourceBuilder_ == null) {
                    return this.source_ == null ? com.android.aapt.SourcePosition.getDefaultInstance() : this.source_;
                } else {
                    return (com.android.aapt.SourcePosition)this.sourceBuilder_.getMessage();
                }
            }

            public com.android.aapt.XmlAttribute.Builder setSource(com.android.aapt.SourcePosition value) {
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

            public com.android.aapt.XmlAttribute.Builder setSource(com.android.aapt.SourcePosition.Builder builderForValue) {
                if (this.sourceBuilder_ == null) {
                    this.source_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.sourceBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.XmlAttribute.Builder mergeSource(com.android.aapt.SourcePosition value) {
                if (this.sourceBuilder_ == null) {
                    if (this.source_ != null) {
                        this.source_ = com.android.aapt.SourcePosition.newBuilder(this.source_).mergeFrom(value).buildPartial();
                    } else {
                        this.source_ = value;
                    }

                    this.onChanged();
                } else {
                    this.sourceBuilder_.mergeFrom(value);
                }

                return this;
            }

            public com.android.aapt.XmlAttribute.Builder clearSource() {
                if (this.sourceBuilder_ == null) {
                    this.source_ = null;
                    this.onChanged();
                } else {
                    this.source_ = null;
                    this.sourceBuilder_ = null;
                }

                return this;
            }

            public com.android.aapt.SourcePosition.Builder getSourceBuilder() {
                this.onChanged();
                return (com.android.aapt.SourcePosition.Builder)this.getSourceFieldBuilder().getBuilder();
            }

            public com.android.aapt.SourcePositionOrBuilder getSourceOrBuilder() {
                if (this.sourceBuilder_ != null) {
                    return (com.android.aapt.SourcePositionOrBuilder)this.sourceBuilder_.getMessageOrBuilder();
                } else {
                    return this.source_ == null ? com.android.aapt.SourcePosition.getDefaultInstance() : this.source_;
                }
            }

            private SingleFieldBuilderV3<com.android.aapt.SourcePosition, com.android.aapt.SourcePosition.Builder, com.android.aapt.SourcePositionOrBuilder> getSourceFieldBuilder() {
                if (this.sourceBuilder_ == null) {
                    this.sourceBuilder_ = new SingleFieldBuilderV3(this.getSource(), this.getParentForChildren(), this.isClean());
                    this.source_ = null;
                }

                return this.sourceBuilder_;
            }

            public int getResourceId() {
                return this.resourceId_;
            }

            public com.android.aapt.XmlAttribute.Builder setResourceId(int value) {
                this.resourceId_ = value;
                this.onChanged();
                return this;
            }

            public com.android.aapt.XmlAttribute.Builder clearResourceId() {
                this.resourceId_ = 0;
                this.onChanged();
                return this;
            }

            public boolean hasCompiledItem() {
                return this.compiledItemBuilder_ != null || this.compiledItem_ != null;
            }

            public com.android.aapt.Item getCompiledItem() {
                if (this.compiledItemBuilder_ == null) {
                    return this.compiledItem_ == null ? com.android.aapt.Item.getDefaultInstance() : this.compiledItem_;
                } else {
                    return (com.android.aapt.Item)this.compiledItemBuilder_.getMessage();
                }
            }

            public com.android.aapt.XmlAttribute.Builder setCompiledItem(com.android.aapt.Item value) {
                if (this.compiledItemBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.compiledItem_ = value;
                    this.onChanged();
                } else {
                    this.compiledItemBuilder_.setMessage(value);
                }

                return this;
            }

            public com.android.aapt.XmlAttribute.Builder setCompiledItem(com.android.aapt.Item.Builder builderForValue) {
                if (this.compiledItemBuilder_ == null) {
                    this.compiledItem_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.compiledItemBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.XmlAttribute.Builder mergeCompiledItem(com.android.aapt.Item value) {
                if (this.compiledItemBuilder_ == null) {
                    if (this.compiledItem_ != null) {
                        this.compiledItem_ = com.android.aapt.Item.newBuilder(this.compiledItem_).mergeFrom(value).buildPartial();
                    } else {
                        this.compiledItem_ = value;
                    }

                    this.onChanged();
                } else {
                    this.compiledItemBuilder_.mergeFrom(value);
                }

                return this;
            }

            public com.android.aapt.XmlAttribute.Builder clearCompiledItem() {
                if (this.compiledItemBuilder_ == null) {
                    this.compiledItem_ = null;
                    this.onChanged();
                } else {
                    this.compiledItem_ = null;
                    this.compiledItemBuilder_ = null;
                }

                return this;
            }

            public com.android.aapt.Item.Builder getCompiledItemBuilder() {
                this.onChanged();
                return (com.android.aapt.Item.Builder)this.getCompiledItemFieldBuilder().getBuilder();
            }

            public com.android.aapt.ItemOrBuilder getCompiledItemOrBuilder() {
                if (this.compiledItemBuilder_ != null) {
                    return (com.android.aapt.ItemOrBuilder)this.compiledItemBuilder_.getMessageOrBuilder();
                } else {
                    return this.compiledItem_ == null ? com.android.aapt.Item.getDefaultInstance() : this.compiledItem_;
                }
            }

            private SingleFieldBuilderV3<com.android.aapt.Item, com.android.aapt.Item.Builder, com.android.aapt.ItemOrBuilder> getCompiledItemFieldBuilder() {
                if (this.compiledItemBuilder_ == null) {
                    this.compiledItemBuilder_ = new SingleFieldBuilderV3(this.getCompiledItem(), this.getParentForChildren(), this.isClean());
                    this.compiledItem_ = null;
                }

                return this.compiledItemBuilder_;
            }

            public final com.android.aapt.XmlAttribute.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.XmlAttribute.Builder)super.setUnknownFields(unknownFields);
            }

            public final com.android.aapt.XmlAttribute.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.XmlAttribute.Builder)super.mergeUnknownFields(unknownFields);
            }
        }
    }