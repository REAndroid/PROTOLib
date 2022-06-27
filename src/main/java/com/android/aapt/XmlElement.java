package com.android.aapt;

import com.google.protobuf.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class XmlElement extends GeneratedMessageV3 implements com.android.aapt.XmlElementOrBuilder {
        private static final long serialVersionUID = 0L;
        public static final int NAMESPACE_DECLARATION_FIELD_NUMBER = 1;
        private List<com.android.aapt.XmlNamespace> namespaceDeclaration_;
        public static final int NAMESPACE_URI_FIELD_NUMBER = 2;
        private volatile Object namespaceUri_;
        public static final int NAME_FIELD_NUMBER = 3;
        private volatile Object name_;
        public static final int ATTRIBUTE_FIELD_NUMBER = 4;
        private List<com.android.aapt.XmlAttribute> attribute_;
        public static final int CHILD_FIELD_NUMBER = 5;
        private List<com.android.aapt.XmlNode> child_;
        private byte memoizedIsInitialized;
        private static final com.android.aapt.XmlElement DEFAULT_INSTANCE = new com.android.aapt.XmlElement();
        private static final Parser<com.android.aapt.XmlElement> PARSER = new AbstractParser<com.android.aapt.XmlElement>() {
            public com.android.aapt.XmlElement parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new com.android.aapt.XmlElement(input, extensionRegistry);
            }
        };

        private XmlElement(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private XmlElement() {
            this.memoizedIsInitialized = -1;
            this.namespaceDeclaration_ = Collections.emptyList();
            this.namespaceUri_ = "";
            this.name_ = "";
            this.attribute_ = Collections.emptyList();
            this.child_ = Collections.emptyList();
        }

        @Override
        public Object newInstance(UnusedPrivateParameter unused) {
            return new com.android.aapt.XmlElement();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private XmlElement(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        java.lang.String s;
                        switch(tag) {
                            case 0:
                                done = true;
                                break;
                            case 10:
                                if ((mutable_bitField0_ & 1) == 0) {
                                    this.namespaceDeclaration_ = new ArrayList();
                                    mutable_bitField0_ |= 1;
                                }

                                this.namespaceDeclaration_.add((com.android.aapt.XmlNamespace)input.readMessage(com.android.aapt.XmlNamespace.parser(), extensionRegistry));
                                break;
                            case 18:
                                s = input.readStringRequireUtf8();
                                this.namespaceUri_ = s;
                                break;
                            case 26:
                                s = input.readStringRequireUtf8();
                                this.name_ = s;
                                break;
                            case 34:
                                if ((mutable_bitField0_ & 2) == 0) {
                                    this.attribute_ = new ArrayList();
                                    mutable_bitField0_ |= 2;
                                }

                                this.attribute_.add((com.android.aapt.XmlAttribute)input.readMessage(com.android.aapt.XmlAttribute.parser(), extensionRegistry));
                                break;
                            case 42:
                                if ((mutable_bitField0_ & 4) == 0) {
                                    this.child_ = new ArrayList();
                                    mutable_bitField0_ |= 4;
                                }

                                this.child_.add((com.android.aapt.XmlNode)input.readMessage(com.android.aapt.XmlNode.parser(), extensionRegistry));
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
                        this.namespaceDeclaration_ = Collections.unmodifiableList(this.namespaceDeclaration_);
                    }

                    if ((mutable_bitField0_ & 2) != 0) {
                        this.attribute_ = Collections.unmodifiableList(this.attribute_);
                    }

                    if ((mutable_bitField0_ & 4) != 0) {
                        this.child_ = Collections.unmodifiableList(this.child_);
                    }

                    this.unknownFields = unknownFields.build();
                    this.makeExtensionsImmutable();
                }

            }
        }

        public static Descriptors.Descriptor getDescriptor() {
            return Resources.internal_static_aapt_pb_XmlElement_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_XmlElement_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.XmlElement.class, com.android.aapt.XmlElement.Builder.class);
        }

        public List<com.android.aapt.XmlNamespace> getNamespaceDeclarationList() {
            return this.namespaceDeclaration_;
        }

        public List<? extends com.android.aapt.XmlNamespaceOrBuilder> getNamespaceDeclarationOrBuilderList() {
            return this.namespaceDeclaration_;
        }

        public int getNamespaceDeclarationCount() {
            return this.namespaceDeclaration_.size();
        }

        public com.android.aapt.XmlNamespace getNamespaceDeclaration(int index) {
            return (com.android.aapt.XmlNamespace)this.namespaceDeclaration_.get(index);
        }

        public com.android.aapt.XmlNamespaceOrBuilder getNamespaceDeclarationOrBuilder(int index) {
            return (com.android.aapt.XmlNamespaceOrBuilder)this.namespaceDeclaration_.get(index);
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

        public List<com.android.aapt.XmlAttribute> getAttributeList() {
            return this.attribute_;
        }

        public List<? extends com.android.aapt.XmlAttributeOrBuilder> getAttributeOrBuilderList() {
            return this.attribute_;
        }

        public int getAttributeCount() {
            return this.attribute_.size();
        }

        public com.android.aapt.XmlAttribute getAttribute(int index) {
            return (com.android.aapt.XmlAttribute)this.attribute_.get(index);
        }

        public com.android.aapt.XmlAttributeOrBuilder getAttributeOrBuilder(int index) {
            return (com.android.aapt.XmlAttributeOrBuilder)this.attribute_.get(index);
        }

        public List<com.android.aapt.XmlNode> getChildList() {
            return this.child_;
        }

        public List<? extends com.android.aapt.XmlNodeOrBuilder> getChildOrBuilderList() {
            return this.child_;
        }

        public int getChildCount() {
            return this.child_.size();
        }

        public com.android.aapt.XmlNode getChild(int index) {
            return (com.android.aapt.XmlNode)this.child_.get(index);
        }

        public com.android.aapt.XmlNodeOrBuilder getChildOrBuilder(int index) {
            return (com.android.aapt.XmlNodeOrBuilder)this.child_.get(index);
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
            int i;
            for(i = 0; i < this.namespaceDeclaration_.size(); ++i) {
                output.writeMessage(1, (MessageLite)this.namespaceDeclaration_.get(i));
            }

            if (!this.getNamespaceUriBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 2, this.namespaceUri_);
            }

            if (!this.getNameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 3, this.name_);
            }

            for(i = 0; i < this.attribute_.size(); ++i) {
                output.writeMessage(4, (MessageLite)this.attribute_.get(i));
            }

            for(i = 0; i < this.child_.size(); ++i) {
                output.writeMessage(5, (MessageLite)this.child_.get(i));
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

                int i;
                for(i = 0; i < this.namespaceDeclaration_.size(); ++i) {
                    size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.namespaceDeclaration_.get(i));
                }

                if (!this.getNamespaceUriBytes().isEmpty()) {
                    size += GeneratedMessageV3.computeStringSize(2, this.namespaceUri_);
                }

                if (!this.getNameBytes().isEmpty()) {
                    size += GeneratedMessageV3.computeStringSize(3, this.name_);
                }

                for(i = 0; i < this.attribute_.size(); ++i) {
                    size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.attribute_.get(i));
                }

                for(i = 0; i < this.child_.size(); ++i) {
                    size += CodedOutputStream.computeMessageSize(5, (MessageLite)this.child_.get(i));
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
            } else if (!(obj instanceof com.android.aapt.XmlElement)) {
                return super.equals(obj);
            } else {
                com.android.aapt.XmlElement other = (com.android.aapt.XmlElement)obj;
                if (!this.getNamespaceDeclarationList().equals(other.getNamespaceDeclarationList())) {
                    return false;
                } else if (!this.getNamespaceUri().equals(other.getNamespaceUri())) {
                    return false;
                } else if (!this.getName().equals(other.getName())) {
                    return false;
                } else if (!this.getAttributeList().equals(other.getAttributeList())) {
                    return false;
                } else if (!this.getChildList().equals(other.getChildList())) {
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
                if (this.getNamespaceDeclarationCount() > 0) {
                    hash = 37 * hash + 1;
                    hash = 53 * hash + this.getNamespaceDeclarationList().hashCode();
                }

                hash = 37 * hash + 2;
                hash = 53 * hash + this.getNamespaceUri().hashCode();
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getName().hashCode();
                if (this.getAttributeCount() > 0) {
                    hash = 37 * hash + 4;
                    hash = 53 * hash + this.getAttributeList().hashCode();
                }

                if (this.getChildCount() > 0) {
                    hash = 37 * hash + 5;
                    hash = 53 * hash + this.getChildList().hashCode();
                }

                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static com.android.aapt.XmlElement parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (com.android.aapt.XmlElement)PARSER.parseFrom(data);
        }

        public static com.android.aapt.XmlElement parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.XmlElement)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.XmlElement parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (com.android.aapt.XmlElement)PARSER.parseFrom(data);
        }

        public static com.android.aapt.XmlElement parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.XmlElement)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.XmlElement parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (com.android.aapt.XmlElement)PARSER.parseFrom(data);
        }

        public static com.android.aapt.XmlElement parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.XmlElement)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.XmlElement parseFrom(InputStream input) throws IOException {
            return (com.android.aapt.XmlElement)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.XmlElement parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.XmlElement)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.XmlElement parseDelimitedFrom(InputStream input) throws IOException {
            return (com.android.aapt.XmlElement)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static com.android.aapt.XmlElement parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.XmlElement)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.XmlElement parseFrom(CodedInputStream input) throws IOException {
            return (com.android.aapt.XmlElement)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.XmlElement parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.XmlElement)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public com.android.aapt.XmlElement.Builder newBuilderForType() {
            return newBuilder();
        }

        public static com.android.aapt.XmlElement.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static com.android.aapt.XmlElement.Builder newBuilder(com.android.aapt.XmlElement prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public com.android.aapt.XmlElement.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new com.android.aapt.XmlElement.Builder() : (new com.android.aapt.XmlElement.Builder()).mergeFrom(this);
        }

        public com.android.aapt.XmlElement.Builder newBuilderForType(BuilderParent parent) {
            com.android.aapt.XmlElement.Builder builder = new com.android.aapt.XmlElement.Builder(parent);
            return builder;
        }

        public static com.android.aapt.XmlElement getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<com.android.aapt.XmlElement> parser() {
            return PARSER;
        }

        public Parser<com.android.aapt.XmlElement> getParserForType() {
            return PARSER;
        }

        public com.android.aapt.XmlElement getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.XmlElement.Builder> implements com.android.aapt.XmlElementOrBuilder {
            private int bitField0_;
            private List<com.android.aapt.XmlNamespace> namespaceDeclaration_;
            private RepeatedFieldBuilderV3<com.android.aapt.XmlNamespace, com.android.aapt.XmlNamespace.Builder, com.android.aapt.XmlNamespaceOrBuilder> namespaceDeclarationBuilder_;
            private Object namespaceUri_;
            private Object name_;
            private List<com.android.aapt.XmlAttribute> attribute_;
            private RepeatedFieldBuilderV3<com.android.aapt.XmlAttribute, com.android.aapt.XmlAttribute.Builder, com.android.aapt.XmlAttributeOrBuilder> attributeBuilder_;
            private List<com.android.aapt.XmlNode> child_;
            private RepeatedFieldBuilderV3<com.android.aapt.XmlNode, com.android.aapt.XmlNode.Builder, com.android.aapt.XmlNodeOrBuilder> childBuilder_;

            public static Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_XmlElement_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_XmlElement_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.XmlElement.class, com.android.aapt.XmlElement.Builder.class);
            }

            private Builder() {
                this.namespaceDeclaration_ = Collections.emptyList();
                this.namespaceUri_ = "";
                this.name_ = "";
                this.attribute_ = Collections.emptyList();
                this.child_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.namespaceDeclaration_ = Collections.emptyList();
                this.namespaceUri_ = "";
                this.name_ = "";
                this.attribute_ = Collections.emptyList();
                this.child_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.android.aapt.XmlElement.alwaysUseFieldBuilders) {
                    this.getNamespaceDeclarationFieldBuilder();
                    this.getAttributeFieldBuilder();
                    this.getChildFieldBuilder();
                }

            }

            public com.android.aapt.XmlElement.Builder clear() {
                super.clear();
                if (this.namespaceDeclarationBuilder_ == null) {
                    this.namespaceDeclaration_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    this.namespaceDeclarationBuilder_.clear();
                }

                this.namespaceUri_ = "";
                this.name_ = "";
                if (this.attributeBuilder_ == null) {
                    this.attribute_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                } else {
                    this.attributeBuilder_.clear();
                }

                if (this.childBuilder_ == null) {
                    this.child_ = Collections.emptyList();
                    this.bitField0_ &= -5;
                } else {
                    this.childBuilder_.clear();
                }

                return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Resources.internal_static_aapt_pb_XmlElement_descriptor;
            }

            public com.android.aapt.XmlElement getDefaultInstanceForType() {
                return com.android.aapt.XmlElement.getDefaultInstance();
            }

            public com.android.aapt.XmlElement build() {
                com.android.aapt.XmlElement result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public com.android.aapt.XmlElement buildPartial() {
                com.android.aapt.XmlElement result = new com.android.aapt.XmlElement(this);
                int from_bitField0_ = this.bitField0_;
                if (this.namespaceDeclarationBuilder_ == null) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.namespaceDeclaration_ = Collections.unmodifiableList(this.namespaceDeclaration_);
                        this.bitField0_ &= -2;
                    }

                    result.namespaceDeclaration_ = this.namespaceDeclaration_;
                } else {
                    result.namespaceDeclaration_ = this.namespaceDeclarationBuilder_.build();
                }

                result.namespaceUri_ = this.namespaceUri_;
                result.name_ = this.name_;
                if (this.attributeBuilder_ == null) {
                    if ((this.bitField0_ & 2) != 0) {
                        this.attribute_ = Collections.unmodifiableList(this.attribute_);
                        this.bitField0_ &= -3;
                    }

                    result.attribute_ = this.attribute_;
                } else {
                    result.attribute_ = this.attributeBuilder_.build();
                }

                if (this.childBuilder_ == null) {
                    if ((this.bitField0_ & 4) != 0) {
                        this.child_ = Collections.unmodifiableList(this.child_);
                        this.bitField0_ &= -5;
                    }

                    result.child_ = this.child_;
                } else {
                    result.child_ = this.childBuilder_.build();
                }

                this.onBuilt();
                return result;
            }

            public com.android.aapt.XmlElement.Builder clone() {
                return (com.android.aapt.XmlElement.Builder)super.clone();
            }

            public com.android.aapt.XmlElement.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.XmlElement.Builder)super.setField(field, value);
            }

            public com.android.aapt.XmlElement.Builder clearField(Descriptors.FieldDescriptor field) {
                return (com.android.aapt.XmlElement.Builder)super.clearField(field);
            }

            public com.android.aapt.XmlElement.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (com.android.aapt.XmlElement.Builder)super.clearOneof(oneof);
            }

            public com.android.aapt.XmlElement.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (com.android.aapt.XmlElement.Builder)super.setRepeatedField(field, index, value);
            }

            public com.android.aapt.XmlElement.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.XmlElement.Builder)super.addRepeatedField(field, value);
            }

            public com.android.aapt.XmlElement.Builder mergeFrom(Message other) {
                if (other instanceof com.android.aapt.XmlElement) {
                    return this.mergeFrom((com.android.aapt.XmlElement)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public com.android.aapt.XmlElement.Builder mergeFrom(com.android.aapt.XmlElement other) {
                if (other == com.android.aapt.XmlElement.getDefaultInstance()) {
                    return this;
                } else {
                    if (this.namespaceDeclarationBuilder_ == null) {
                        if (!other.namespaceDeclaration_.isEmpty()) {
                            if (this.namespaceDeclaration_.isEmpty()) {
                                this.namespaceDeclaration_ = other.namespaceDeclaration_;
                                this.bitField0_ &= -2;
                            } else {
                                this.ensureNamespaceDeclarationIsMutable();
                                this.namespaceDeclaration_.addAll(other.namespaceDeclaration_);
                            }

                            this.onChanged();
                        }
                    } else if (!other.namespaceDeclaration_.isEmpty()) {
                        if (this.namespaceDeclarationBuilder_.isEmpty()) {
                            this.namespaceDeclarationBuilder_.dispose();
                            this.namespaceDeclarationBuilder_ = null;
                            this.namespaceDeclaration_ = other.namespaceDeclaration_;
                            this.bitField0_ &= -2;
                            this.namespaceDeclarationBuilder_ = com.android.aapt.XmlElement.alwaysUseFieldBuilders ? this.getNamespaceDeclarationFieldBuilder() : null;
                        } else {
                            this.namespaceDeclarationBuilder_.addAllMessages(other.namespaceDeclaration_);
                        }
                    }

                    if (!other.getNamespaceUri().isEmpty()) {
                        this.namespaceUri_ = other.namespaceUri_;
                        this.onChanged();
                    }

                    if (!other.getName().isEmpty()) {
                        this.name_ = other.name_;
                        this.onChanged();
                    }

                    if (this.attributeBuilder_ == null) {
                        if (!other.attribute_.isEmpty()) {
                            if (this.attribute_.isEmpty()) {
                                this.attribute_ = other.attribute_;
                                this.bitField0_ &= -3;
                            } else {
                                this.ensureAttributeIsMutable();
                                this.attribute_.addAll(other.attribute_);
                            }

                            this.onChanged();
                        }
                    } else if (!other.attribute_.isEmpty()) {
                        if (this.attributeBuilder_.isEmpty()) {
                            this.attributeBuilder_.dispose();
                            this.attributeBuilder_ = null;
                            this.attribute_ = other.attribute_;
                            this.bitField0_ &= -3;
                            this.attributeBuilder_ = com.android.aapt.XmlElement.alwaysUseFieldBuilders ? this.getAttributeFieldBuilder() : null;
                        } else {
                            this.attributeBuilder_.addAllMessages(other.attribute_);
                        }
                    }

                    if (this.childBuilder_ == null) {
                        if (!other.child_.isEmpty()) {
                            if (this.child_.isEmpty()) {
                                this.child_ = other.child_;
                                this.bitField0_ &= -5;
                            } else {
                                this.ensureChildIsMutable();
                                this.child_.addAll(other.child_);
                            }

                            this.onChanged();
                        }
                    } else if (!other.child_.isEmpty()) {
                        if (this.childBuilder_.isEmpty()) {
                            this.childBuilder_.dispose();
                            this.childBuilder_ = null;
                            this.child_ = other.child_;
                            this.bitField0_ &= -5;
                            this.childBuilder_ = com.android.aapt.XmlElement.alwaysUseFieldBuilders ? this.getChildFieldBuilder() : null;
                        } else {
                            this.childBuilder_.addAllMessages(other.child_);
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

            public com.android.aapt.XmlElement.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                com.android.aapt.XmlElement parsedMessage = null;

                try {
                    parsedMessage = (com.android.aapt.XmlElement)com.android.aapt.XmlElement.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (com.android.aapt.XmlElement)var8.getUnfinishedMessage();
                    throw var8.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }

                }

                return this;
            }

            private void ensureNamespaceDeclarationIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.namespaceDeclaration_ = new ArrayList(this.namespaceDeclaration_);
                    this.bitField0_ |= 1;
                }

            }

            public List<com.android.aapt.XmlNamespace> getNamespaceDeclarationList() {
                return this.namespaceDeclarationBuilder_ == null ? Collections.unmodifiableList(this.namespaceDeclaration_) : this.namespaceDeclarationBuilder_.getMessageList();
            }

            public int getNamespaceDeclarationCount() {
                return this.namespaceDeclarationBuilder_ == null ? this.namespaceDeclaration_.size() : this.namespaceDeclarationBuilder_.getCount();
            }

            public com.android.aapt.XmlNamespace getNamespaceDeclaration(int index) {
                return this.namespaceDeclarationBuilder_ == null ? (com.android.aapt.XmlNamespace)this.namespaceDeclaration_.get(index) : (com.android.aapt.XmlNamespace)this.namespaceDeclarationBuilder_.getMessage(index);
            }

            public com.android.aapt.XmlElement.Builder setNamespaceDeclaration(int index, com.android.aapt.XmlNamespace value) {
                if (this.namespaceDeclarationBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureNamespaceDeclarationIsMutable();
                    this.namespaceDeclaration_.set(index, value);
                    this.onChanged();
                } else {
                    this.namespaceDeclarationBuilder_.setMessage(index, value);
                }

                return this;
            }

            public com.android.aapt.XmlElement.Builder setNamespaceDeclaration(int index, com.android.aapt.XmlNamespace.Builder builderForValue) {
                if (this.namespaceDeclarationBuilder_ == null) {
                    this.ensureNamespaceDeclarationIsMutable();
                    this.namespaceDeclaration_.set(index, builderForValue.build());
                    this.onChanged();
                } else {
                    this.namespaceDeclarationBuilder_.setMessage(index, builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.XmlElement.Builder addNamespaceDeclaration(com.android.aapt.XmlNamespace value) {
                if (this.namespaceDeclarationBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureNamespaceDeclarationIsMutable();
                    this.namespaceDeclaration_.add(value);
                    this.onChanged();
                } else {
                    this.namespaceDeclarationBuilder_.addMessage(value);
                }

                return this;
            }

            public com.android.aapt.XmlElement.Builder addNamespaceDeclaration(int index, com.android.aapt.XmlNamespace value) {
                if (this.namespaceDeclarationBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureNamespaceDeclarationIsMutable();
                    this.namespaceDeclaration_.add(index, value);
                    this.onChanged();
                } else {
                    this.namespaceDeclarationBuilder_.addMessage(index, value);
                }

                return this;
            }

            public com.android.aapt.XmlElement.Builder addNamespaceDeclaration(com.android.aapt.XmlNamespace.Builder builderForValue) {
                if (this.namespaceDeclarationBuilder_ == null) {
                    this.ensureNamespaceDeclarationIsMutable();
                    this.namespaceDeclaration_.add(builderForValue.build());
                    this.onChanged();
                } else {
                    this.namespaceDeclarationBuilder_.addMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.XmlElement.Builder addNamespaceDeclaration(int index, com.android.aapt.XmlNamespace.Builder builderForValue) {
                if (this.namespaceDeclarationBuilder_ == null) {
                    this.ensureNamespaceDeclarationIsMutable();
                    this.namespaceDeclaration_.add(index, builderForValue.build());
                    this.onChanged();
                } else {
                    this.namespaceDeclarationBuilder_.addMessage(index, builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.XmlElement.Builder addAllNamespaceDeclaration(Iterable<? extends com.android.aapt.XmlNamespace> values) {
                if (this.namespaceDeclarationBuilder_ == null) {
                    this.ensureNamespaceDeclarationIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.namespaceDeclaration_);
                    this.onChanged();
                } else {
                    this.namespaceDeclarationBuilder_.addAllMessages(values);
                }

                return this;
            }

            public com.android.aapt.XmlElement.Builder clearNamespaceDeclaration() {
                if (this.namespaceDeclarationBuilder_ == null) {
                    this.namespaceDeclaration_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    this.onChanged();
                } else {
                    this.namespaceDeclarationBuilder_.clear();
                }

                return this;
            }

            public com.android.aapt.XmlElement.Builder removeNamespaceDeclaration(int index) {
                if (this.namespaceDeclarationBuilder_ == null) {
                    this.ensureNamespaceDeclarationIsMutable();
                    this.namespaceDeclaration_.remove(index);
                    this.onChanged();
                } else {
                    this.namespaceDeclarationBuilder_.remove(index);
                }

                return this;
            }

            public com.android.aapt.XmlNamespace.Builder getNamespaceDeclarationBuilder(int index) {
                return (com.android.aapt.XmlNamespace.Builder)this.getNamespaceDeclarationFieldBuilder().getBuilder(index);
            }

            public com.android.aapt.XmlNamespaceOrBuilder getNamespaceDeclarationOrBuilder(int index) {
                return this.namespaceDeclarationBuilder_ == null ? (com.android.aapt.XmlNamespaceOrBuilder)this.namespaceDeclaration_.get(index) : (com.android.aapt.XmlNamespaceOrBuilder)this.namespaceDeclarationBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends com.android.aapt.XmlNamespaceOrBuilder> getNamespaceDeclarationOrBuilderList() {
                return this.namespaceDeclarationBuilder_ != null ? this.namespaceDeclarationBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.namespaceDeclaration_);
            }

            public com.android.aapt.XmlNamespace.Builder addNamespaceDeclarationBuilder() {
                return (com.android.aapt.XmlNamespace.Builder)this.getNamespaceDeclarationFieldBuilder().addBuilder(com.android.aapt.XmlNamespace.getDefaultInstance());
            }

            public com.android.aapt.XmlNamespace.Builder addNamespaceDeclarationBuilder(int index) {
                return (com.android.aapt.XmlNamespace.Builder)this.getNamespaceDeclarationFieldBuilder().addBuilder(index, com.android.aapt.XmlNamespace.getDefaultInstance());
            }

            public List<com.android.aapt.XmlNamespace.Builder> getNamespaceDeclarationBuilderList() {
                return this.getNamespaceDeclarationFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<com.android.aapt.XmlNamespace, com.android.aapt.XmlNamespace.Builder, com.android.aapt.XmlNamespaceOrBuilder> getNamespaceDeclarationFieldBuilder() {
                if (this.namespaceDeclarationBuilder_ == null) {
                    this.namespaceDeclarationBuilder_ = new RepeatedFieldBuilderV3(this.namespaceDeclaration_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
                    this.namespaceDeclaration_ = null;
                }

                return this.namespaceDeclarationBuilder_;
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

            public com.android.aapt.XmlElement.Builder setNamespaceUri(java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.namespaceUri_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public com.android.aapt.XmlElement.Builder clearNamespaceUri() {
                this.namespaceUri_ = com.android.aapt.XmlElement.getDefaultInstance().getNamespaceUri();
                this.onChanged();
                return this;
            }

            public com.android.aapt.XmlElement.Builder setNamespaceUriBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    com.android.aapt.XmlElement.checkByteStringIsUtf8(value);
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

            public com.android.aapt.XmlElement.Builder setName(java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.name_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public com.android.aapt.XmlElement.Builder clearName() {
                this.name_ = com.android.aapt.XmlElement.getDefaultInstance().getName();
                this.onChanged();
                return this;
            }

            public com.android.aapt.XmlElement.Builder setNameBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    com.android.aapt.XmlElement.checkByteStringIsUtf8(value);
                    this.name_ = value;
                    this.onChanged();
                    return this;
                }
            }

            private void ensureAttributeIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.attribute_ = new ArrayList(this.attribute_);
                    this.bitField0_ |= 2;
                }

            }

            public List<com.android.aapt.XmlAttribute> getAttributeList() {
                return this.attributeBuilder_ == null ? Collections.unmodifiableList(this.attribute_) : this.attributeBuilder_.getMessageList();
            }

            public int getAttributeCount() {
                return this.attributeBuilder_ == null ? this.attribute_.size() : this.attributeBuilder_.getCount();
            }

            public com.android.aapt.XmlAttribute getAttribute(int index) {
                return this.attributeBuilder_ == null ? (com.android.aapt.XmlAttribute)this.attribute_.get(index) : (com.android.aapt.XmlAttribute)this.attributeBuilder_.getMessage(index);
            }

            public com.android.aapt.XmlElement.Builder setAttribute(int index, com.android.aapt.XmlAttribute value) {
                if (this.attributeBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureAttributeIsMutable();
                    this.attribute_.set(index, value);
                    this.onChanged();
                } else {
                    this.attributeBuilder_.setMessage(index, value);
                }

                return this;
            }

            public com.android.aapt.XmlElement.Builder setAttribute(int index, com.android.aapt.XmlAttribute.Builder builderForValue) {
                if (this.attributeBuilder_ == null) {
                    this.ensureAttributeIsMutable();
                    this.attribute_.set(index, builderForValue.build());
                    this.onChanged();
                } else {
                    this.attributeBuilder_.setMessage(index, builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.XmlElement.Builder addAttribute(com.android.aapt.XmlAttribute value) {
                if (this.attributeBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureAttributeIsMutable();
                    this.attribute_.add(value);
                    this.onChanged();
                } else {
                    this.attributeBuilder_.addMessage(value);
                }

                return this;
            }

            public com.android.aapt.XmlElement.Builder addAttribute(int index, com.android.aapt.XmlAttribute value) {
                if (this.attributeBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureAttributeIsMutable();
                    this.attribute_.add(index, value);
                    this.onChanged();
                } else {
                    this.attributeBuilder_.addMessage(index, value);
                }

                return this;
            }

            public com.android.aapt.XmlElement.Builder addAttribute(com.android.aapt.XmlAttribute.Builder builderForValue) {
                if (this.attributeBuilder_ == null) {
                    this.ensureAttributeIsMutable();
                    this.attribute_.add(builderForValue.build());
                    this.onChanged();
                } else {
                    this.attributeBuilder_.addMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.XmlElement.Builder addAttribute(int index, com.android.aapt.XmlAttribute.Builder builderForValue) {
                if (this.attributeBuilder_ == null) {
                    this.ensureAttributeIsMutable();
                    this.attribute_.add(index, builderForValue.build());
                    this.onChanged();
                } else {
                    this.attributeBuilder_.addMessage(index, builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.XmlElement.Builder addAllAttribute(Iterable<? extends com.android.aapt.XmlAttribute> values) {
                if (this.attributeBuilder_ == null) {
                    this.ensureAttributeIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.attribute_);
                    this.onChanged();
                } else {
                    this.attributeBuilder_.addAllMessages(values);
                }

                return this;
            }

            public com.android.aapt.XmlElement.Builder clearAttribute() {
                if (this.attributeBuilder_ == null) {
                    this.attribute_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                    this.onChanged();
                } else {
                    this.attributeBuilder_.clear();
                }

                return this;
            }

            public com.android.aapt.XmlElement.Builder removeAttribute(int index) {
                if (this.attributeBuilder_ == null) {
                    this.ensureAttributeIsMutable();
                    this.attribute_.remove(index);
                    this.onChanged();
                } else {
                    this.attributeBuilder_.remove(index);
                }

                return this;
            }

            public com.android.aapt.XmlAttribute.Builder getAttributeBuilder(int index) {
                return (com.android.aapt.XmlAttribute.Builder)this.getAttributeFieldBuilder().getBuilder(index);
            }

            public com.android.aapt.XmlAttributeOrBuilder getAttributeOrBuilder(int index) {
                return this.attributeBuilder_ == null ? (com.android.aapt.XmlAttributeOrBuilder)this.attribute_.get(index) : (com.android.aapt.XmlAttributeOrBuilder)this.attributeBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends com.android.aapt.XmlAttributeOrBuilder> getAttributeOrBuilderList() {
                return this.attributeBuilder_ != null ? this.attributeBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.attribute_);
            }

            public com.android.aapt.XmlAttribute.Builder addAttributeBuilder() {
                return (com.android.aapt.XmlAttribute.Builder)this.getAttributeFieldBuilder().addBuilder(com.android.aapt.XmlAttribute.getDefaultInstance());
            }

            public com.android.aapt.XmlAttribute.Builder addAttributeBuilder(int index) {
                return (com.android.aapt.XmlAttribute.Builder)this.getAttributeFieldBuilder().addBuilder(index, com.android.aapt.XmlAttribute.getDefaultInstance());
            }

            public List<com.android.aapt.XmlAttribute.Builder> getAttributeBuilderList() {
                return this.getAttributeFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<com.android.aapt.XmlAttribute, com.android.aapt.XmlAttribute.Builder, com.android.aapt.XmlAttributeOrBuilder> getAttributeFieldBuilder() {
                if (this.attributeBuilder_ == null) {
                    this.attributeBuilder_ = new RepeatedFieldBuilderV3(this.attribute_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
                    this.attribute_ = null;
                }

                return this.attributeBuilder_;
            }

            private void ensureChildIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.child_ = new ArrayList(this.child_);
                    this.bitField0_ |= 4;
                }

            }

            public List<com.android.aapt.XmlNode> getChildList() {
                return this.childBuilder_ == null ? Collections.unmodifiableList(this.child_) : this.childBuilder_.getMessageList();
            }

            public int getChildCount() {
                return this.childBuilder_ == null ? this.child_.size() : this.childBuilder_.getCount();
            }

            public com.android.aapt.XmlNode getChild(int index) {
                return this.childBuilder_ == null ? (com.android.aapt.XmlNode)this.child_.get(index) : (com.android.aapt.XmlNode)this.childBuilder_.getMessage(index);
            }

            public com.android.aapt.XmlElement.Builder setChild(int index, com.android.aapt.XmlNode value) {
                if (this.childBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureChildIsMutable();
                    this.child_.set(index, value);
                    this.onChanged();
                } else {
                    this.childBuilder_.setMessage(index, value);
                }

                return this;
            }

            public com.android.aapt.XmlElement.Builder setChild(int index, com.android.aapt.XmlNode.Builder builderForValue) {
                if (this.childBuilder_ == null) {
                    this.ensureChildIsMutable();
                    this.child_.set(index, builderForValue.build());
                    this.onChanged();
                } else {
                    this.childBuilder_.setMessage(index, builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.XmlElement.Builder addChild(com.android.aapt.XmlNode value) {
                if (this.childBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureChildIsMutable();
                    this.child_.add(value);
                    this.onChanged();
                } else {
                    this.childBuilder_.addMessage(value);
                }

                return this;
            }

            public com.android.aapt.XmlElement.Builder addChild(int index, com.android.aapt.XmlNode value) {
                if (this.childBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureChildIsMutable();
                    this.child_.add(index, value);
                    this.onChanged();
                } else {
                    this.childBuilder_.addMessage(index, value);
                }

                return this;
            }

            public com.android.aapt.XmlElement.Builder addChild(com.android.aapt.XmlNode.Builder builderForValue) {
                if (this.childBuilder_ == null) {
                    this.ensureChildIsMutable();
                    this.child_.add(builderForValue.build());
                    this.onChanged();
                } else {
                    this.childBuilder_.addMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.XmlElement.Builder addChild(int index, com.android.aapt.XmlNode.Builder builderForValue) {
                if (this.childBuilder_ == null) {
                    this.ensureChildIsMutable();
                    this.child_.add(index, builderForValue.build());
                    this.onChanged();
                } else {
                    this.childBuilder_.addMessage(index, builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.XmlElement.Builder addAllChild(Iterable<? extends com.android.aapt.XmlNode> values) {
                if (this.childBuilder_ == null) {
                    this.ensureChildIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.child_);
                    this.onChanged();
                } else {
                    this.childBuilder_.addAllMessages(values);
                }

                return this;
            }

            public com.android.aapt.XmlElement.Builder clearChild() {
                if (this.childBuilder_ == null) {
                    this.child_ = Collections.emptyList();
                    this.bitField0_ &= -5;
                    this.onChanged();
                } else {
                    this.childBuilder_.clear();
                }

                return this;
            }

            public com.android.aapt.XmlElement.Builder removeChild(int index) {
                if (this.childBuilder_ == null) {
                    this.ensureChildIsMutable();
                    this.child_.remove(index);
                    this.onChanged();
                } else {
                    this.childBuilder_.remove(index);
                }

                return this;
            }

            public com.android.aapt.XmlNode.Builder getChildBuilder(int index) {
                return (com.android.aapt.XmlNode.Builder)this.getChildFieldBuilder().getBuilder(index);
            }

            public com.android.aapt.XmlNodeOrBuilder getChildOrBuilder(int index) {
                return this.childBuilder_ == null ? (com.android.aapt.XmlNodeOrBuilder)this.child_.get(index) : (com.android.aapt.XmlNodeOrBuilder)this.childBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends com.android.aapt.XmlNodeOrBuilder> getChildOrBuilderList() {
                return this.childBuilder_ != null ? this.childBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.child_);
            }

            public com.android.aapt.XmlNode.Builder addChildBuilder() {
                return (com.android.aapt.XmlNode.Builder)this.getChildFieldBuilder().addBuilder(com.android.aapt.XmlNode.getDefaultInstance());
            }

            public com.android.aapt.XmlNode.Builder addChildBuilder(int index) {
                return (com.android.aapt.XmlNode.Builder)this.getChildFieldBuilder().addBuilder(index, com.android.aapt.XmlNode.getDefaultInstance());
            }

            public List<com.android.aapt.XmlNode.Builder> getChildBuilderList() {
                return this.getChildFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<com.android.aapt.XmlNode, com.android.aapt.XmlNode.Builder, com.android.aapt.XmlNodeOrBuilder> getChildFieldBuilder() {
                if (this.childBuilder_ == null) {
                    this.childBuilder_ = new RepeatedFieldBuilderV3(this.child_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
                    this.child_ = null;
                }

                return this.childBuilder_;
            }

            public final com.android.aapt.XmlElement.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.XmlElement.Builder)super.setUnknownFields(unknownFields);
            }

            public final com.android.aapt.XmlElement.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.XmlElement.Builder)super.mergeUnknownFields(unknownFields);
            }
        }
    }