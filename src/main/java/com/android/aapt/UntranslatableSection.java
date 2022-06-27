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

public class UntranslatableSection extends GeneratedMessageV3 implements com.android.aapt.UntranslatableSectionOrBuilder {
        private static final long serialVersionUID = 0L;
        public static final int START_INDEX_FIELD_NUMBER = 1;
        private long startIndex_;
        public static final int END_INDEX_FIELD_NUMBER = 2;
        private long endIndex_;
        private byte memoizedIsInitialized;
        private static final com.android.aapt.UntranslatableSection DEFAULT_INSTANCE = new com.android.aapt.UntranslatableSection();
        private static final Parser<com.android.aapt.UntranslatableSection> PARSER = new AbstractParser<com.android.aapt.UntranslatableSection>() {
            public com.android.aapt.UntranslatableSection parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new com.android.aapt.UntranslatableSection(input, extensionRegistry);
            }
        };

        private UntranslatableSection(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private UntranslatableSection() {
            this.memoizedIsInitialized = -1;
        }

        @Override
        public Object newInstance(UnusedPrivateParameter unused) {
            return new com.android.aapt.UntranslatableSection();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private UntranslatableSection(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                this.startIndex_ = input.readUInt64();
                                break;
                            case 16:
                                this.endIndex_ = input.readUInt64();
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
            return Resources.internal_static_aapt_pb_UntranslatableSection_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_UntranslatableSection_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.UntranslatableSection.class, com.android.aapt.UntranslatableSection.Builder.class);
        }

        public long getStartIndex() {
            return this.startIndex_;
        }

        public long getEndIndex() {
            return this.endIndex_;
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
            if (this.startIndex_ != 0L) {
                output.writeUInt64(1, this.startIndex_);
            }

            if (this.endIndex_ != 0L) {
                output.writeUInt64(2, this.endIndex_);
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
                if (this.startIndex_ != 0L) {
                    size += CodedOutputStream.computeUInt64Size(1, this.startIndex_);
                }

                if (this.endIndex_ != 0L) {
                    size += CodedOutputStream.computeUInt64Size(2, this.endIndex_);
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
            } else if (!(obj instanceof com.android.aapt.UntranslatableSection)) {
                return super.equals(obj);
            } else {
                com.android.aapt.UntranslatableSection other = (com.android.aapt.UntranslatableSection)obj;
                if (this.getStartIndex() != other.getStartIndex()) {
                    return false;
                } else if (this.getEndIndex() != other.getEndIndex()) {
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
                hash = 53 * hash + Internal.hashLong(this.getStartIndex());
                hash = 37 * hash + 2;
                hash = 53 * hash + Internal.hashLong(this.getEndIndex());
                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static com.android.aapt.UntranslatableSection parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (com.android.aapt.UntranslatableSection)PARSER.parseFrom(data);
        }

        public static com.android.aapt.UntranslatableSection parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.UntranslatableSection)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.UntranslatableSection parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (com.android.aapt.UntranslatableSection)PARSER.parseFrom(data);
        }

        public static com.android.aapt.UntranslatableSection parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.UntranslatableSection)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.UntranslatableSection parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (com.android.aapt.UntranslatableSection)PARSER.parseFrom(data);
        }

        public static com.android.aapt.UntranslatableSection parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.UntranslatableSection)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.UntranslatableSection parseFrom(InputStream input) throws IOException {
            return (com.android.aapt.UntranslatableSection)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.UntranslatableSection parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.UntranslatableSection)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.UntranslatableSection parseDelimitedFrom(InputStream input) throws IOException {
            return (com.android.aapt.UntranslatableSection)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static com.android.aapt.UntranslatableSection parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.UntranslatableSection)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.UntranslatableSection parseFrom(CodedInputStream input) throws IOException {
            return (com.android.aapt.UntranslatableSection)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.UntranslatableSection parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.UntranslatableSection)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public com.android.aapt.UntranslatableSection.Builder newBuilderForType() {
            return newBuilder();
        }

        public static com.android.aapt.UntranslatableSection.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static com.android.aapt.UntranslatableSection.Builder newBuilder(com.android.aapt.UntranslatableSection prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public com.android.aapt.UntranslatableSection.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new com.android.aapt.UntranslatableSection.Builder() : (new com.android.aapt.UntranslatableSection.Builder()).mergeFrom(this);
        }

        public com.android.aapt.UntranslatableSection.Builder newBuilderForType(BuilderParent parent) {
            com.android.aapt.UntranslatableSection.Builder builder = new com.android.aapt.UntranslatableSection.Builder(parent);
            return builder;
        }

        public static com.android.aapt.UntranslatableSection getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<com.android.aapt.UntranslatableSection> parser() {
            return PARSER;
        }

        public Parser<com.android.aapt.UntranslatableSection> getParserForType() {
            return PARSER;
        }

        public com.android.aapt.UntranslatableSection getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.UntranslatableSection.Builder> implements com.android.aapt.UntranslatableSectionOrBuilder {
            private long startIndex_;
            private long endIndex_;

            public static Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_UntranslatableSection_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_UntranslatableSection_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.UntranslatableSection.class, com.android.aapt.UntranslatableSection.Builder.class);
            }

            private Builder() {
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.android.aapt.UntranslatableSection.alwaysUseFieldBuilders) {
                }

            }

            public com.android.aapt.UntranslatableSection.Builder clear() {
                super.clear();
                this.startIndex_ = 0L;
                this.endIndex_ = 0L;
                return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Resources.internal_static_aapt_pb_UntranslatableSection_descriptor;
            }

            public com.android.aapt.UntranslatableSection getDefaultInstanceForType() {
                return com.android.aapt.UntranslatableSection.getDefaultInstance();
            }

            public com.android.aapt.UntranslatableSection build() {
                com.android.aapt.UntranslatableSection result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public com.android.aapt.UntranslatableSection buildPartial() {
                com.android.aapt.UntranslatableSection result = new com.android.aapt.UntranslatableSection(this);
                result.startIndex_ = this.startIndex_;
                result.endIndex_ = this.endIndex_;
                this.onBuilt();
                return result;
            }

            public com.android.aapt.UntranslatableSection.Builder clone() {
                return (com.android.aapt.UntranslatableSection.Builder)super.clone();
            }

            public com.android.aapt.UntranslatableSection.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.UntranslatableSection.Builder)super.setField(field, value);
            }

            public com.android.aapt.UntranslatableSection.Builder clearField(Descriptors.FieldDescriptor field) {
                return (com.android.aapt.UntranslatableSection.Builder)super.clearField(field);
            }

            public com.android.aapt.UntranslatableSection.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (com.android.aapt.UntranslatableSection.Builder)super.clearOneof(oneof);
            }

            public com.android.aapt.UntranslatableSection.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (com.android.aapt.UntranslatableSection.Builder)super.setRepeatedField(field, index, value);
            }

            public com.android.aapt.UntranslatableSection.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.UntranslatableSection.Builder)super.addRepeatedField(field, value);
            }

            public com.android.aapt.UntranslatableSection.Builder mergeFrom(Message other) {
                if (other instanceof com.android.aapt.UntranslatableSection) {
                    return this.mergeFrom((com.android.aapt.UntranslatableSection)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public com.android.aapt.UntranslatableSection.Builder mergeFrom(com.android.aapt.UntranslatableSection other) {
                if (other == com.android.aapt.UntranslatableSection.getDefaultInstance()) {
                    return this;
                } else {
                    if (other.getStartIndex() != 0L) {
                        this.setStartIndex(other.getStartIndex());
                    }

                    if (other.getEndIndex() != 0L) {
                        this.setEndIndex(other.getEndIndex());
                    }

                    this.mergeUnknownFields(other.unknownFields);
                    this.onChanged();
                    return this;
                }
            }

            public final boolean isInitialized() {
                return true;
            }

            public com.android.aapt.UntranslatableSection.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                com.android.aapt.UntranslatableSection parsedMessage = null;

                try {
                    parsedMessage = (com.android.aapt.UntranslatableSection)com.android.aapt.UntranslatableSection.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (com.android.aapt.UntranslatableSection)var8.getUnfinishedMessage();
                    throw var8.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }

                }

                return this;
            }

            public long getStartIndex() {
                return this.startIndex_;
            }

            public com.android.aapt.UntranslatableSection.Builder setStartIndex(long value) {
                this.startIndex_ = value;
                this.onChanged();
                return this;
            }

            public com.android.aapt.UntranslatableSection.Builder clearStartIndex() {
                this.startIndex_ = 0L;
                this.onChanged();
                return this;
            }

            public long getEndIndex() {
                return this.endIndex_;
            }

            public com.android.aapt.UntranslatableSection.Builder setEndIndex(long value) {
                this.endIndex_ = value;
                this.onChanged();
                return this;
            }

            public com.android.aapt.UntranslatableSection.Builder clearEndIndex() {
                this.endIndex_ = 0L;
                this.onChanged();
                return this;
            }

            public final com.android.aapt.UntranslatableSection.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.UntranslatableSection.Builder)super.setUnknownFields(unknownFields);
            }

            public final com.android.aapt.UntranslatableSection.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.UntranslatableSection.Builder)super.mergeUnknownFields(unknownFields);
            }
        }
    }