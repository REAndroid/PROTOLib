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

public class SourcePosition extends GeneratedMessageV3 implements com.android.aapt.SourcePositionOrBuilder {
        private static final long serialVersionUID = 0L;
        public static final int LINE_NUMBER_FIELD_NUMBER = 1;
        private int lineNumber_;
        public static final int COLUMN_NUMBER_FIELD_NUMBER = 2;
        private int columnNumber_;
        private byte memoizedIsInitialized;
        private static final com.android.aapt.SourcePosition DEFAULT_INSTANCE = new com.android.aapt.SourcePosition();
        private static final Parser<com.android.aapt.SourcePosition> PARSER = new AbstractParser<com.android.aapt.SourcePosition>() {
            public com.android.aapt.SourcePosition parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new com.android.aapt.SourcePosition(input, extensionRegistry);
            }
        };

        private SourcePosition(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private SourcePosition() {
            this.memoizedIsInitialized = -1;
        }

        @Override
        public Object newInstance(UnusedPrivateParameter unused) {
            return new com.android.aapt.SourcePosition();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private SourcePosition(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                this.lineNumber_ = input.readUInt32();
                                break;
                            case 16:
                                this.columnNumber_ = input.readUInt32();
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
            return Resources.internal_static_aapt_pb_SourcePosition_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_SourcePosition_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.SourcePosition.class, com.android.aapt.SourcePosition.Builder.class);
        }

        public int getLineNumber() {
            return this.lineNumber_;
        }

        public int getColumnNumber() {
            return this.columnNumber_;
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
            if (this.lineNumber_ != 0) {
                output.writeUInt32(1, this.lineNumber_);
            }

            if (this.columnNumber_ != 0) {
                output.writeUInt32(2, this.columnNumber_);
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
                if (this.lineNumber_ != 0) {
                    size += CodedOutputStream.computeUInt32Size(1, this.lineNumber_);
                }

                if (this.columnNumber_ != 0) {
                    size += CodedOutputStream.computeUInt32Size(2, this.columnNumber_);
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
            } else if (!(obj instanceof com.android.aapt.SourcePosition)) {
                return super.equals(obj);
            } else {
                com.android.aapt.SourcePosition other = (com.android.aapt.SourcePosition)obj;
                if (this.getLineNumber() != other.getLineNumber()) {
                    return false;
                } else if (this.getColumnNumber() != other.getColumnNumber()) {
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
                hash = 53 * hash + this.getLineNumber();
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getColumnNumber();
                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static com.android.aapt.SourcePosition parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (com.android.aapt.SourcePosition)PARSER.parseFrom(data);
        }

        public static com.android.aapt.SourcePosition parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.SourcePosition)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.SourcePosition parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (com.android.aapt.SourcePosition)PARSER.parseFrom(data);
        }

        public static com.android.aapt.SourcePosition parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.SourcePosition)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.SourcePosition parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (com.android.aapt.SourcePosition)PARSER.parseFrom(data);
        }

        public static com.android.aapt.SourcePosition parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.SourcePosition)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.SourcePosition parseFrom(InputStream input) throws IOException {
            return (com.android.aapt.SourcePosition)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.SourcePosition parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.SourcePosition)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.SourcePosition parseDelimitedFrom(InputStream input) throws IOException {
            return (com.android.aapt.SourcePosition)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static com.android.aapt.SourcePosition parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.SourcePosition)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.SourcePosition parseFrom(CodedInputStream input) throws IOException {
            return (com.android.aapt.SourcePosition)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.SourcePosition parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.SourcePosition)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public com.android.aapt.SourcePosition.Builder newBuilderForType() {
            return newBuilder();
        }

        public static com.android.aapt.SourcePosition.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static com.android.aapt.SourcePosition.Builder newBuilder(com.android.aapt.SourcePosition prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public com.android.aapt.SourcePosition.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new com.android.aapt.SourcePosition.Builder() : (new com.android.aapt.SourcePosition.Builder()).mergeFrom(this);
        }

        public com.android.aapt.SourcePosition.Builder newBuilderForType(BuilderParent parent) {
            com.android.aapt.SourcePosition.Builder builder = new com.android.aapt.SourcePosition.Builder(parent);
            return builder;
        }

        public static com.android.aapt.SourcePosition getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<com.android.aapt.SourcePosition> parser() {
            return PARSER;
        }

        public Parser<com.android.aapt.SourcePosition> getParserForType() {
            return PARSER;
        }

        public com.android.aapt.SourcePosition getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.SourcePosition.Builder> implements com.android.aapt.SourcePositionOrBuilder {
            private int lineNumber_;
            private int columnNumber_;

            public static Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_SourcePosition_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_SourcePosition_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.SourcePosition.class, com.android.aapt.SourcePosition.Builder.class);
            }

            private Builder() {
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.android.aapt.SourcePosition.alwaysUseFieldBuilders) {
                }

            }

            public com.android.aapt.SourcePosition.Builder clear() {
                super.clear();
                this.lineNumber_ = 0;
                this.columnNumber_ = 0;
                return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Resources.internal_static_aapt_pb_SourcePosition_descriptor;
            }

            public com.android.aapt.SourcePosition getDefaultInstanceForType() {
                return com.android.aapt.SourcePosition.getDefaultInstance();
            }

            public com.android.aapt.SourcePosition build() {
                com.android.aapt.SourcePosition result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public com.android.aapt.SourcePosition buildPartial() {
                com.android.aapt.SourcePosition result = new com.android.aapt.SourcePosition(this);
                result.lineNumber_ = this.lineNumber_;
                result.columnNumber_ = this.columnNumber_;
                this.onBuilt();
                return result;
            }

            public com.android.aapt.SourcePosition.Builder clone() {
                return (com.android.aapt.SourcePosition.Builder)super.clone();
            }

            public com.android.aapt.SourcePosition.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.SourcePosition.Builder)super.setField(field, value);
            }

            public com.android.aapt.SourcePosition.Builder clearField(Descriptors.FieldDescriptor field) {
                return (com.android.aapt.SourcePosition.Builder)super.clearField(field);
            }

            public com.android.aapt.SourcePosition.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (com.android.aapt.SourcePosition.Builder)super.clearOneof(oneof);
            }

            public com.android.aapt.SourcePosition.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (com.android.aapt.SourcePosition.Builder)super.setRepeatedField(field, index, value);
            }

            public com.android.aapt.SourcePosition.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.SourcePosition.Builder)super.addRepeatedField(field, value);
            }

            public com.android.aapt.SourcePosition.Builder mergeFrom(Message other) {
                if (other instanceof com.android.aapt.SourcePosition) {
                    return this.mergeFrom((com.android.aapt.SourcePosition)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public com.android.aapt.SourcePosition.Builder mergeFrom(com.android.aapt.SourcePosition other) {
                if (other == com.android.aapt.SourcePosition.getDefaultInstance()) {
                    return this;
                } else {
                    if (other.getLineNumber() != 0) {
                        this.setLineNumber(other.getLineNumber());
                    }

                    if (other.getColumnNumber() != 0) {
                        this.setColumnNumber(other.getColumnNumber());
                    }

                    this.mergeUnknownFields(other.unknownFields);
                    this.onChanged();
                    return this;
                }
            }

            public final boolean isInitialized() {
                return true;
            }

            public com.android.aapt.SourcePosition.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                com.android.aapt.SourcePosition parsedMessage = null;

                try {
                    parsedMessage = (com.android.aapt.SourcePosition)com.android.aapt.SourcePosition.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (com.android.aapt.SourcePosition)var8.getUnfinishedMessage();
                    throw var8.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }

                }

                return this;
            }

            public int getLineNumber() {
                return this.lineNumber_;
            }

            public com.android.aapt.SourcePosition.Builder setLineNumber(int value) {
                this.lineNumber_ = value;
                this.onChanged();
                return this;
            }

            public com.android.aapt.SourcePosition.Builder clearLineNumber() {
                this.lineNumber_ = 0;
                this.onChanged();
                return this;
            }

            public int getColumnNumber() {
                return this.columnNumber_;
            }

            public com.android.aapt.SourcePosition.Builder setColumnNumber(int value) {
                this.columnNumber_ = value;
                this.onChanged();
                return this;
            }

            public com.android.aapt.SourcePosition.Builder clearColumnNumber() {
                this.columnNumber_ = 0;
                this.onChanged();
                return this;
            }

            public final com.android.aapt.SourcePosition.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.SourcePosition.Builder)super.setUnknownFields(unknownFields);
            }

            public final com.android.aapt.SourcePosition.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.SourcePosition.Builder)super.mergeUnknownFields(unknownFields);
            }
        }
    }