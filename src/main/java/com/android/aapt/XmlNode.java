package com.android.aapt;

import com.google.protobuf.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class XmlNode extends GeneratedMessageV3 implements com.android.aapt.XmlNodeOrBuilder {
        private static final long serialVersionUID = 0L;
        private int nodeCase_;
        private Object node_;
        public static final int ELEMENT_FIELD_NUMBER = 1;
        public static final int TEXT_FIELD_NUMBER = 2;
        public static final int SOURCE_FIELD_NUMBER = 3;
        private com.android.aapt.SourcePosition source_;
        private byte memoizedIsInitialized;
        private static final com.android.aapt.XmlNode DEFAULT_INSTANCE = new com.android.aapt.XmlNode();
        private static final Parser<com.android.aapt.XmlNode> PARSER = new AbstractParser<com.android.aapt.XmlNode>() {
            public com.android.aapt.XmlNode parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new com.android.aapt.XmlNode(input, extensionRegistry);
            }
        };

        private XmlNode(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.nodeCase_ = 0;
            this.memoizedIsInitialized = -1;
        }

        private XmlNode() {
            this.nodeCase_ = 0;
            this.memoizedIsInitialized = -1;
        }

        @Override
        public Object newInstance(UnusedPrivateParameter unused) {
            return new com.android.aapt.XmlNode();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private XmlNode(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                com.android.aapt.XmlElement.Builder subBuilder = null;
                                if (this.nodeCase_ == 1) {
                                    subBuilder = ((com.android.aapt.XmlElement)this.node_).toBuilder();
                                }

                                this.node_ = input.readMessage(com.android.aapt.XmlElement.parser(), extensionRegistry);
                                if (subBuilder != null) {
                                    subBuilder.mergeFrom((com.android.aapt.XmlElement)this.node_);
                                    this.node_ = subBuilder.buildPartial();
                                }

                                this.nodeCase_ = 1;
                                break;
                            case 18:
                                java.lang.String s = input.readStringRequireUtf8();
                                this.nodeCase_ = 2;
                                this.node_ = s;
                                break;
                            case 26:
                                com.android.aapt.SourcePosition.Builder subBuilder2 = null;
                                if (this.source_ != null) {
                                    subBuilder2 = this.source_.toBuilder();
                                }

                                this.source_ = (com.android.aapt.SourcePosition)input.readMessage(com.android.aapt.SourcePosition.parser(), extensionRegistry);
                                if (subBuilder2 != null) {
                                    subBuilder2.mergeFrom(this.source_);
                                    this.source_ = subBuilder2.buildPartial();
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
            return Resources.internal_static_aapt_pb_XmlNode_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_XmlNode_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.XmlNode.class, com.android.aapt.XmlNode.Builder.class);
        }

        public com.android.aapt.XmlNode.NodeCase getNodeCase() {
            return com.android.aapt.XmlNode.NodeCase.forNumber(this.nodeCase_);
        }

        public boolean hasElement() {
            return this.nodeCase_ == 1;
        }

        public com.android.aapt.XmlElement getElement() {
            return this.nodeCase_ == 1 ? (com.android.aapt.XmlElement)this.node_ : com.android.aapt.XmlElement.getDefaultInstance();
        }

        public com.android.aapt.XmlElementOrBuilder getElementOrBuilder() {
            return this.nodeCase_ == 1 ? (com.android.aapt.XmlElement)this.node_ : com.android.aapt.XmlElement.getDefaultInstance();
        }

        public java.lang.String getText() {
            Object ref = "";
            if (this.nodeCase_ == 2) {
                ref = this.node_;
            }

            if (ref instanceof java.lang.String) {
                return (java.lang.String)ref;
            } else {
                ByteString bs = (ByteString)ref;
                java.lang.String s = bs.toStringUtf8();
                if (this.nodeCase_ == 2) {
                    this.node_ = s;
                }

                return s;
            }
        }

        public ByteString getTextBytes() {
            Object ref = "";
            if (this.nodeCase_ == 2) {
                ref = this.node_;
            }

            if (ref instanceof java.lang.String) {
                ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                if (this.nodeCase_ == 2) {
                    this.node_ = b;
                }

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
            if (this.nodeCase_ == ELEMENT_FIELD_NUMBER) {
                output.writeMessage(ELEMENT_FIELD_NUMBER, (com.android.aapt.XmlElement)this.node_);
            }

            if (this.nodeCase_ == TEXT_FIELD_NUMBER) {
                GeneratedMessageV3.writeString(output, TEXT_FIELD_NUMBER, this.node_);
            }

            if (this.source_ != null) {
                output.writeMessage(SOURCE_FIELD_NUMBER, this.getSource());
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
                if (this.nodeCase_ == ELEMENT_FIELD_NUMBER) {
                    size += CodedOutputStream.computeMessageSize(ELEMENT_FIELD_NUMBER, (com.android.aapt.XmlElement)this.node_);
                }

                if (this.nodeCase_ == TEXT_FIELD_NUMBER) {
                    size += GeneratedMessageV3.computeStringSize(TEXT_FIELD_NUMBER, this.node_);
                }

                if (this.source_ != null) {
                    size += CodedOutputStream.computeMessageSize(SOURCE_FIELD_NUMBER, this.getSource());
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
            } else if (!(obj instanceof com.android.aapt.XmlNode)) {
                return super.equals(obj);
            } else {
                com.android.aapt.XmlNode other = (com.android.aapt.XmlNode)obj;
                if (this.hasSource() != other.hasSource()) {
                    return false;
                } else if (this.hasSource() && !this.getSource().equals(other.getSource())) {
                    return false;
                } else if (!this.getNodeCase().equals(other.getNodeCase())) {
                    return false;
                } else {
                    switch(this.nodeCase_) {
                        case 0:
                        default:
                            break;
                        case 1:
                            if (!this.getElement().equals(other.getElement())) {
                                return false;
                            }
                            break;
                        case 2:
                            if (!this.getText().equals(other.getText())) {
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
                if (this.hasSource()) {
                    hash = 37 * hash + 3;
                    hash = 53 * hash + this.getSource().hashCode();
                }

                switch(this.nodeCase_) {
                    case 0:
                    default:
                        break;
                    case 1:
                        hash = 37 * hash + 1;
                        hash = 53 * hash + this.getElement().hashCode();
                        break;
                    case 2:
                        hash = 37 * hash + 2;
                        hash = 53 * hash + this.getText().hashCode();
                }

                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static com.android.aapt.XmlNode parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (com.android.aapt.XmlNode)PARSER.parseFrom(data);
        }

        public static com.android.aapt.XmlNode parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.XmlNode)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.XmlNode parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (com.android.aapt.XmlNode)PARSER.parseFrom(data);
        }

        public static com.android.aapt.XmlNode parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.XmlNode)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.XmlNode parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (com.android.aapt.XmlNode)PARSER.parseFrom(data);
        }

        public static com.android.aapt.XmlNode parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.XmlNode)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.XmlNode parseFrom(InputStream input) throws IOException {
            return (com.android.aapt.XmlNode)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.XmlNode parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.XmlNode)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.XmlNode parseDelimitedFrom(InputStream input) throws IOException {
            return (com.android.aapt.XmlNode)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static com.android.aapt.XmlNode parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.XmlNode)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.XmlNode parseFrom(CodedInputStream input) throws IOException {
            return (com.android.aapt.XmlNode)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.XmlNode parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.XmlNode)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public com.android.aapt.XmlNode.Builder newBuilderForType() {
            return newBuilder();
        }

        public static com.android.aapt.XmlNode.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static com.android.aapt.XmlNode.Builder newBuilder(com.android.aapt.XmlNode prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public com.android.aapt.XmlNode.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new com.android.aapt.XmlNode.Builder() : (new com.android.aapt.XmlNode.Builder()).mergeFrom(this);
        }

        public com.android.aapt.XmlNode.Builder newBuilderForType(BuilderParent parent) {
            com.android.aapt.XmlNode.Builder builder = new com.android.aapt.XmlNode.Builder(parent);
            return builder;
        }

        public static com.android.aapt.XmlNode getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<com.android.aapt.XmlNode> parser() {
            return PARSER;
        }

        public Parser<com.android.aapt.XmlNode> getParserForType() {
            return PARSER;
        }

        public com.android.aapt.XmlNode getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.XmlNode.Builder> implements com.android.aapt.XmlNodeOrBuilder {
            private int nodeCase_;
            private Object node_;
            private SingleFieldBuilderV3<com.android.aapt.XmlElement, com.android.aapt.XmlElement.Builder, com.android.aapt.XmlElementOrBuilder> elementBuilder_;
            private com.android.aapt.SourcePosition source_;
            private SingleFieldBuilderV3<com.android.aapt.SourcePosition, com.android.aapt.SourcePosition.Builder, com.android.aapt.SourcePositionOrBuilder> sourceBuilder_;

            public static Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_XmlNode_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_XmlNode_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.XmlNode.class, com.android.aapt.XmlNode.Builder.class);
            }

            private Builder() {
                this.nodeCase_ = 0;
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.nodeCase_ = 0;
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.android.aapt.XmlNode.alwaysUseFieldBuilders) {
                }

            }

            public com.android.aapt.XmlNode.Builder clear() {
                super.clear();
                if (this.sourceBuilder_ == null) {
                    this.source_ = null;
                } else {
                    this.source_ = null;
                    this.sourceBuilder_ = null;
                }

                this.nodeCase_ = 0;
                this.node_ = null;
                return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Resources.internal_static_aapt_pb_XmlNode_descriptor;
            }

            public com.android.aapt.XmlNode getDefaultInstanceForType() {
                return com.android.aapt.XmlNode.getDefaultInstance();
            }

            public com.android.aapt.XmlNode build() {
                com.android.aapt.XmlNode result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public com.android.aapt.XmlNode buildPartial() {
                com.android.aapt.XmlNode result = new com.android.aapt.XmlNode(this);
                if (this.nodeCase_ == 1) {
                    if (this.elementBuilder_ == null) {
                        result.node_ = this.node_;
                    } else {
                        result.node_ = this.elementBuilder_.build();
                    }
                }

                if (this.nodeCase_ == 2) {
                    result.node_ = this.node_;
                }

                if (this.sourceBuilder_ == null) {
                    result.source_ = this.source_;
                } else {
                    result.source_ = (com.android.aapt.SourcePosition)this.sourceBuilder_.build();
                }

                result.nodeCase_ = this.nodeCase_;
                this.onBuilt();
                return result;
            }

            public com.android.aapt.XmlNode.Builder clone() {
                return (com.android.aapt.XmlNode.Builder)super.clone();
            }

            public com.android.aapt.XmlNode.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.XmlNode.Builder)super.setField(field, value);
            }

            public com.android.aapt.XmlNode.Builder clearField(Descriptors.FieldDescriptor field) {
                return (com.android.aapt.XmlNode.Builder)super.clearField(field);
            }

            public com.android.aapt.XmlNode.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (com.android.aapt.XmlNode.Builder)super.clearOneof(oneof);
            }

            public com.android.aapt.XmlNode.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (com.android.aapt.XmlNode.Builder)super.setRepeatedField(field, index, value);
            }

            public com.android.aapt.XmlNode.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.XmlNode.Builder)super.addRepeatedField(field, value);
            }

            public com.android.aapt.XmlNode.Builder mergeFrom(Message other) {
                if (other instanceof com.android.aapt.XmlNode) {
                    return this.mergeFrom((com.android.aapt.XmlNode)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public com.android.aapt.XmlNode.Builder mergeFrom(com.android.aapt.XmlNode other) {
                if (other == com.android.aapt.XmlNode.getDefaultInstance()) {
                    return this;
                } else {
                    if (other.hasSource()) {
                        this.mergeSource(other.getSource());
                    }

                    switch(other.getNodeCase()) {
                        case ELEMENT:
                            this.mergeElement(other.getElement());
                            break;
                        case TEXT:
                            this.nodeCase_ = 2;
                            this.node_ = other.node_;
                            this.onChanged();
                        case NODE_NOT_SET:
                    }

                    this.mergeUnknownFields(other.unknownFields);
                    this.onChanged();
                    return this;
                }
            }

            public final boolean isInitialized() {
                return true;
            }

            public com.android.aapt.XmlNode.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                com.android.aapt.XmlNode parsedMessage = null;

                try {
                    parsedMessage = (com.android.aapt.XmlNode)com.android.aapt.XmlNode.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (com.android.aapt.XmlNode)var8.getUnfinishedMessage();
                    throw var8.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }

                }

                return this;
            }

            public com.android.aapt.XmlNode.NodeCase getNodeCase() {
                return com.android.aapt.XmlNode.NodeCase.forNumber(this.nodeCase_);
            }

            public com.android.aapt.XmlNode.Builder clearNode() {
                this.nodeCase_ = 0;
                this.node_ = null;
                this.onChanged();
                return this;
            }

            public boolean hasElement() {
                return this.nodeCase_ == 1;
            }

            public com.android.aapt.XmlElement getElement() {
                if (this.elementBuilder_ == null) {
                    return this.nodeCase_ == 1 ? (com.android.aapt.XmlElement)this.node_ : com.android.aapt.XmlElement.getDefaultInstance();
                } else {
                    return this.nodeCase_ == 1 ? (com.android.aapt.XmlElement)this.elementBuilder_.getMessage() : com.android.aapt.XmlElement.getDefaultInstance();
                }
            }

            public com.android.aapt.XmlNode.Builder setElement(com.android.aapt.XmlElement value) {
                if (this.elementBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.node_ = value;
                    this.onChanged();
                } else {
                    this.elementBuilder_.setMessage(value);
                }

                this.nodeCase_ = 1;
                return this;
            }

            public com.android.aapt.XmlNode.Builder setElement(com.android.aapt.XmlElement.Builder builderForValue) {
                if (this.elementBuilder_ == null) {
                    this.node_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.elementBuilder_.setMessage(builderForValue.build());
                }

                this.nodeCase_ = 1;
                return this;
            }

            public com.android.aapt.XmlNode.Builder mergeElement(com.android.aapt.XmlElement value) {
                if (this.elementBuilder_ == null) {
                    if (this.nodeCase_ == 1 && this.node_ != com.android.aapt.XmlElement.getDefaultInstance()) {
                        this.node_ = com.android.aapt.XmlElement.newBuilder((com.android.aapt.XmlElement)this.node_).mergeFrom(value).buildPartial();
                    } else {
                        this.node_ = value;
                    }

                    this.onChanged();
                } else {
                    if (this.nodeCase_ == 1) {
                        this.elementBuilder_.mergeFrom(value);
                    }

                    this.elementBuilder_.setMessage(value);
                }

                this.nodeCase_ = 1;
                return this;
            }

            public com.android.aapt.XmlNode.Builder clearElement() {
                if (this.elementBuilder_ == null) {
                    if (this.nodeCase_ == 1) {
                        this.nodeCase_ = 0;
                        this.node_ = null;
                        this.onChanged();
                    }
                } else {
                    if (this.nodeCase_ == 1) {
                        this.nodeCase_ = 0;
                        this.node_ = null;
                    }

                    this.elementBuilder_.clear();
                }

                return this;
            }

            public com.android.aapt.XmlElement.Builder getElementBuilder() {
                return (com.android.aapt.XmlElement.Builder)this.getElementFieldBuilder().getBuilder();
            }

            public com.android.aapt.XmlElementOrBuilder getElementOrBuilder() {
                if (this.nodeCase_ == 1 && this.elementBuilder_ != null) {
                    return (com.android.aapt.XmlElementOrBuilder)this.elementBuilder_.getMessageOrBuilder();
                } else {
                    return this.nodeCase_ == 1 ? (com.android.aapt.XmlElement)this.node_ : com.android.aapt.XmlElement.getDefaultInstance();
                }
            }

            private SingleFieldBuilderV3<com.android.aapt.XmlElement, com.android.aapt.XmlElement.Builder, com.android.aapt.XmlElementOrBuilder> getElementFieldBuilder() {
                if (this.elementBuilder_ == null) {
                    if (this.nodeCase_ != 1) {
                        this.node_ = com.android.aapt.XmlElement.getDefaultInstance();
                    }

                    this.elementBuilder_ = new SingleFieldBuilderV3((com.android.aapt.XmlElement)this.node_, this.getParentForChildren(), this.isClean());
                    this.node_ = null;
                }

                this.nodeCase_ = 1;
                this.onChanged();
                return this.elementBuilder_;
            }

            public java.lang.String getText() {
                Object ref = "";
                if (this.nodeCase_ == 2) {
                    ref = this.node_;
                }

                if (!(ref instanceof java.lang.String)) {
                    ByteString bs = (ByteString)ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (this.nodeCase_ == 2) {
                        this.node_ = s;
                    }

                    return s;
                } else {
                    return (java.lang.String)ref;
                }
            }

            public ByteString getTextBytes() {
                Object ref = "";
                if (this.nodeCase_ == 2) {
                    ref = this.node_;
                }

                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                    if (this.nodeCase_ == 2) {
                        this.node_ = b;
                    }

                    return b;
                } else {
                    return (ByteString)ref;
                }
            }

            public com.android.aapt.XmlNode.Builder setText(java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.nodeCase_ = 2;
                    this.node_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public com.android.aapt.XmlNode.Builder clearText() {
                if (this.nodeCase_ == 2) {
                    this.nodeCase_ = 0;
                    this.node_ = null;
                    this.onChanged();
                }

                return this;
            }

            public com.android.aapt.XmlNode.Builder setTextBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    com.android.aapt.XmlNode.checkByteStringIsUtf8(value);
                    this.nodeCase_ = 2;
                    this.node_ = value;
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

            public com.android.aapt.XmlNode.Builder setSource(com.android.aapt.SourcePosition value) {
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

            public com.android.aapt.XmlNode.Builder setSource(com.android.aapt.SourcePosition.Builder builderForValue) {
                if (this.sourceBuilder_ == null) {
                    this.source_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.sourceBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.XmlNode.Builder mergeSource(com.android.aapt.SourcePosition value) {
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

            public com.android.aapt.XmlNode.Builder clearSource() {
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

            public final com.android.aapt.XmlNode.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.XmlNode.Builder)super.setUnknownFields(unknownFields);
            }

            public final com.android.aapt.XmlNode.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.XmlNode.Builder)super.mergeUnknownFields(unknownFields);
            }
        }

        public static enum NodeCase implements Internal.EnumLite, InternalOneOfEnum {
            ELEMENT(1),
            TEXT(2),
            NODE_NOT_SET(0);

            private final int value;

            private NodeCase(int value) {
                this.value = value;
            }

            /** @deprecated */
            @Deprecated
            public static com.android.aapt.XmlNode.NodeCase valueOf(int value) {
                return forNumber(value);
            }

            public static com.android.aapt.XmlNode.NodeCase forNumber(int value) {
                switch(value) {
                    case 0:
                        return NODE_NOT_SET;
                    case 1:
                        return ELEMENT;
                    case 2:
                        return TEXT;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.value;
            }
        }
    }