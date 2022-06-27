package com.android.aapt;

import com.google.protobuf.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class Source extends GeneratedMessageV3 implements com.android.aapt.SourceOrBuilder {
    private static final long serialVersionUID = 0L;
    public static final int PATH_IDX_FIELD_NUMBER = 1;
    public static final int POSITION_FIELD_NUMBER = 2;
        private int pathIdx_;
        private com.android.aapt.SourcePosition position_;
        private byte memoizedIsInitialized;
        private static final com.android.aapt.Source DEFAULT_INSTANCE = new com.android.aapt.Source();
        private static final Parser<com.android.aapt.Source> PARSER = new AbstractParser<com.android.aapt.Source>() {
            public com.android.aapt.Source parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new com.android.aapt.Source(input, extensionRegistry);
            }
        };

        private Source(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private Source() {
            this.memoizedIsInitialized = -1;
        }

        @Override
        public Object newInstance(UnusedPrivateParameter unused) {
            return new com.android.aapt.Source();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Source(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                this.pathIdx_ = input.readUInt32();
                                break;
                            case 18:
                                com.android.aapt.SourcePosition.Builder subBuilder = null;
                                if (this.position_ != null) {
                                    subBuilder = this.position_.toBuilder();
                                }

                                this.position_ = (com.android.aapt.SourcePosition)input.readMessage(com.android.aapt.SourcePosition.parser(), extensionRegistry);
                                if (subBuilder != null) {
                                    subBuilder.mergeFrom(this.position_);
                                    this.position_ = subBuilder.buildPartial();
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
            return Resources.internal_static_aapt_pb_Source_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_Source_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.Source.class, com.android.aapt.Source.Builder.class);
        }

        public int getPathIdx() {
            return this.pathIdx_;
        }

        public boolean hasPosition() {
            return this.position_ != null;
        }

        public com.android.aapt.SourcePosition getPosition() {
            return this.position_ == null ? com.android.aapt.SourcePosition.getDefaultInstance() : this.position_;
        }

        public com.android.aapt.SourcePositionOrBuilder getPositionOrBuilder() {
            return this.getPosition();
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
            if (this.pathIdx_ != 0) {
                output.writeUInt32(1, this.pathIdx_);
            }

            if (this.position_ != null) {
                output.writeMessage(2, this.getPosition());
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
                if (this.pathIdx_ != 0) {
                    size += CodedOutputStream.computeUInt32Size(1, this.pathIdx_);
                }

                if (this.position_ != null) {
                    size += CodedOutputStream.computeMessageSize(2, this.getPosition());
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
            } else if (!(obj instanceof com.android.aapt.Source)) {
                return super.equals(obj);
            } else {
                com.android.aapt.Source other = (com.android.aapt.Source)obj;
                if (this.getPathIdx() != other.getPathIdx()) {
                    return false;
                } else if (this.hasPosition() != other.hasPosition()) {
                    return false;
                } else if (this.hasPosition() && !this.getPosition().equals(other.getPosition())) {
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
                hash = 53 * hash + this.getPathIdx();
                if (this.hasPosition()) {
                    hash = 37 * hash + 2;
                    hash = 53 * hash + this.getPosition().hashCode();
                }

                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static com.android.aapt.Source parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Source)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Source parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Source)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Source parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Source)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Source parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Source)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Source parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Source)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Source parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Source)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Source parseFrom(InputStream input) throws IOException {
            return (com.android.aapt.Source)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.Source parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Source)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.Source parseDelimitedFrom(InputStream input) throws IOException {
            return (com.android.aapt.Source)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static com.android.aapt.Source parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Source)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.Source parseFrom(CodedInputStream input) throws IOException {
            return (com.android.aapt.Source)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.Source parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Source)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public com.android.aapt.Source.Builder newBuilderForType() {
            return newBuilder();
        }

        public static com.android.aapt.Source.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static com.android.aapt.Source.Builder newBuilder(com.android.aapt.Source prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public com.android.aapt.Source.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new com.android.aapt.Source.Builder() : (new com.android.aapt.Source.Builder()).mergeFrom(this);
        }

        public com.android.aapt.Source.Builder newBuilderForType(BuilderParent parent) {
            return new com.android.aapt.Source.Builder(parent);
        }

        public static com.android.aapt.Source getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<com.android.aapt.Source> parser() {
            return PARSER;
        }

        public Parser<com.android.aapt.Source> getParserForType() {
            return PARSER;
        }

        public com.android.aapt.Source getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.Source.Builder> implements com.android.aapt.SourceOrBuilder {
            private int pathIdx_;
            private com.android.aapt.SourcePosition position_;
            private SingleFieldBuilderV3<com.android.aapt.SourcePosition, com.android.aapt.SourcePosition.Builder, com.android.aapt.SourcePositionOrBuilder> positionBuilder_;

            public static Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_Source_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_Source_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.Source.class, com.android.aapt.Source.Builder.class);
            }

            private Builder() {
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.android.aapt.Source.alwaysUseFieldBuilders) {
                }

            }

            public com.android.aapt.Source.Builder clear() {
                super.clear();
                this.pathIdx_ = 0;
                if (this.positionBuilder_ == null) {
                    this.position_ = null;
                } else {
                    this.position_ = null;
                    this.positionBuilder_ = null;
                }

                return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Resources.internal_static_aapt_pb_Source_descriptor;
            }

            public com.android.aapt.Source getDefaultInstanceForType() {
                return com.android.aapt.Source.getDefaultInstance();
            }

            public com.android.aapt.Source build() {
                com.android.aapt.Source result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public com.android.aapt.Source buildPartial() {
                com.android.aapt.Source result = new com.android.aapt.Source(this);
                result.pathIdx_ = this.pathIdx_;
                if (this.positionBuilder_ == null) {
                    result.position_ = this.position_;
                } else {
                    result.position_ = (com.android.aapt.SourcePosition)this.positionBuilder_.build();
                }

                this.onBuilt();
                return result;
            }

            public com.android.aapt.Source.Builder clone() {
                return (com.android.aapt.Source.Builder)super.clone();
            }

            public com.android.aapt.Source.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.Source.Builder)super.setField(field, value);
            }

            public com.android.aapt.Source.Builder clearField(Descriptors.FieldDescriptor field) {
                return (com.android.aapt.Source.Builder)super.clearField(field);
            }

            public com.android.aapt.Source.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (com.android.aapt.Source.Builder)super.clearOneof(oneof);
            }

            public com.android.aapt.Source.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (com.android.aapt.Source.Builder)super.setRepeatedField(field, index, value);
            }

            public com.android.aapt.Source.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.Source.Builder)super.addRepeatedField(field, value);
            }

            public com.android.aapt.Source.Builder mergeFrom(Message other) {
                if (other instanceof com.android.aapt.Source) {
                    return this.mergeFrom((com.android.aapt.Source)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public com.android.aapt.Source.Builder mergeFrom(com.android.aapt.Source other) {
                if (other == com.android.aapt.Source.getDefaultInstance()) {
                    return this;
                } else {
                    if (other.getPathIdx() != 0) {
                        this.setPathIdx(other.getPathIdx());
                    }

                    if (other.hasPosition()) {
                        this.mergePosition(other.getPosition());
                    }

                    this.mergeUnknownFields(other.unknownFields);
                    this.onChanged();
                    return this;
                }
            }

            public final boolean isInitialized() {
                return true;
            }

            public com.android.aapt.Source.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                com.android.aapt.Source parsedMessage = null;

                try {
                    parsedMessage = (com.android.aapt.Source)com.android.aapt.Source.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (com.android.aapt.Source)var8.getUnfinishedMessage();
                    throw var8.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }

                }

                return this;
            }

            public int getPathIdx() {
                return this.pathIdx_;
            }

            public com.android.aapt.Source.Builder setPathIdx(int value) {
                this.pathIdx_ = value;
                this.onChanged();
                return this;
            }

            public com.android.aapt.Source.Builder clearPathIdx() {
                this.pathIdx_ = 0;
                this.onChanged();
                return this;
            }

            public boolean hasPosition() {
                return this.positionBuilder_ != null || this.position_ != null;
            }

            public com.android.aapt.SourcePosition getPosition() {
                if (this.positionBuilder_ == null) {
                    return this.position_ == null ? com.android.aapt.SourcePosition.getDefaultInstance() : this.position_;
                } else {
                    return (com.android.aapt.SourcePosition)this.positionBuilder_.getMessage();
                }
            }

            public com.android.aapt.Source.Builder setPosition(com.android.aapt.SourcePosition value) {
                if (this.positionBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.position_ = value;
                    this.onChanged();
                } else {
                    this.positionBuilder_.setMessage(value);
                }

                return this;
            }

            public com.android.aapt.Source.Builder setPosition(com.android.aapt.SourcePosition.Builder builderForValue) {
                if (this.positionBuilder_ == null) {
                    this.position_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.positionBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.Source.Builder mergePosition(com.android.aapt.SourcePosition value) {
                if (this.positionBuilder_ == null) {
                    if (this.position_ != null) {
                        this.position_ = com.android.aapt.SourcePosition.newBuilder(this.position_).mergeFrom(value).buildPartial();
                    } else {
                        this.position_ = value;
                    }

                    this.onChanged();
                } else {
                    this.positionBuilder_.mergeFrom(value);
                }

                return this;
            }

            public com.android.aapt.Source.Builder clearPosition() {
                if (this.positionBuilder_ == null) {
                    this.position_ = null;
                    this.onChanged();
                } else {
                    this.position_ = null;
                    this.positionBuilder_ = null;
                }

                return this;
            }

            public com.android.aapt.SourcePosition.Builder getPositionBuilder() {
                this.onChanged();
                return (com.android.aapt.SourcePosition.Builder)this.getPositionFieldBuilder().getBuilder();
            }

            public com.android.aapt.SourcePositionOrBuilder getPositionOrBuilder() {
                if (this.positionBuilder_ != null) {
                    return (com.android.aapt.SourcePositionOrBuilder)this.positionBuilder_.getMessageOrBuilder();
                } else {
                    return this.position_ == null ? com.android.aapt.SourcePosition.getDefaultInstance() : this.position_;
                }
            }

            private SingleFieldBuilderV3<com.android.aapt.SourcePosition, com.android.aapt.SourcePosition.Builder, com.android.aapt.SourcePositionOrBuilder> getPositionFieldBuilder() {
                if (this.positionBuilder_ == null) {
                    this.positionBuilder_ = new SingleFieldBuilderV3(this.getPosition(), this.getParentForChildren(), this.isClean());
                    this.position_ = null;
                }

                return this.positionBuilder_;
            }

            public final com.android.aapt.Source.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.Source.Builder)super.setUnknownFields(unknownFields);
            }

            public final com.android.aapt.Source.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.Source.Builder)super.mergeUnknownFields(unknownFields);
            }
        }
    }