package com.android.aapt;

import com.google.protobuf.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class EntryId extends GeneratedMessageV3 implements com.android.aapt.EntryIdOrBuilder {
    private static final long serialVersionUID = 0L;
    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    private byte memoizedIsInitialized;
    private static final com.android.aapt.EntryId DEFAULT_INSTANCE = new com.android.aapt.EntryId();
    private static final Parser<com.android.aapt.EntryId> PARSER = new AbstractParser<com.android.aapt.EntryId>() {
        public com.android.aapt.EntryId parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new com.android.aapt.EntryId(input, extensionRegistry);
        }
    };

    private EntryId(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private EntryId() {
        this.memoizedIsInitialized = -1;
    }


    private EntryId(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.id_ = input.readUInt32();
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

    @Override
    public Object newInstance(UnusedPrivateParameter unused) {
        return new com.android.aapt.EntryId();
    }

    @Override
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }
    public static Descriptors.Descriptor getDescriptor() {
        return Resources.internal_static_aapt_pb_EntryId_descriptor;
    }

    public FieldAccessorTable internalGetFieldAccessorTable() {
        return Resources.internal_static_aapt_pb_EntryId_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.EntryId.class, com.android.aapt.EntryId.Builder.class);
    }

    public int getId() {
        return this.id_;
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
        if (this.id_ != 0) {
            output.writeUInt32(ID_FIELD_NUMBER, this.id_);
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
            if (this.id_ != 0) {
                size += CodedOutputStream.computeUInt32Size(ID_FIELD_NUMBER, this.id_);
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
        } else if (!(obj instanceof com.android.aapt.EntryId)) {
            return super.equals(obj);
        } else {
            com.android.aapt.EntryId other = (com.android.aapt.EntryId)obj;
            if (this.getId() != other.getId()) {
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
            hash = 53 * hash + this.getId();
            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
        }
    }

    public static com.android.aapt.EntryId parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (com.android.aapt.EntryId)PARSER.parseFrom(data);
    }

    public static com.android.aapt.EntryId parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (com.android.aapt.EntryId)PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.android.aapt.EntryId parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (com.android.aapt.EntryId)PARSER.parseFrom(data);
    }

    public static com.android.aapt.EntryId parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (com.android.aapt.EntryId)PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.android.aapt.EntryId parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (com.android.aapt.EntryId)PARSER.parseFrom(data);
    }

    public static com.android.aapt.EntryId parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (com.android.aapt.EntryId)PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.android.aapt.EntryId parseFrom(InputStream input) throws IOException {
        return (com.android.aapt.EntryId)GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.android.aapt.EntryId parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (com.android.aapt.EntryId)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.android.aapt.EntryId parseDelimitedFrom(InputStream input) throws IOException {
        return (com.android.aapt.EntryId)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.android.aapt.EntryId parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (com.android.aapt.EntryId)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.android.aapt.EntryId parseFrom(CodedInputStream input) throws IOException {
        return (com.android.aapt.EntryId)GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.android.aapt.EntryId parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (com.android.aapt.EntryId)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public com.android.aapt.EntryId.Builder newBuilderForType() {
        return newBuilder();
    }

    public static com.android.aapt.EntryId.Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static com.android.aapt.EntryId.Builder newBuilder(com.android.aapt.EntryId prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public com.android.aapt.EntryId.Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new com.android.aapt.EntryId.Builder() : (new com.android.aapt.EntryId.Builder()).mergeFrom(this);
    }

    public com.android.aapt.EntryId.Builder newBuilderForType(BuilderParent parent) {
        com.android.aapt.EntryId.Builder builder = new com.android.aapt.EntryId.Builder(parent);
        return builder;
    }

    public static com.android.aapt.EntryId getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<com.android.aapt.EntryId> parser() {
        return PARSER;
    }

    public Parser<com.android.aapt.EntryId> getParserForType() {
        return PARSER;
    }

    public com.android.aapt.EntryId getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.EntryId.Builder> implements com.android.aapt.EntryIdOrBuilder {
        private int id_;

        public static Descriptors.Descriptor getDescriptor() {
            return Resources.internal_static_aapt_pb_EntryId_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_EntryId_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.EntryId.class, com.android.aapt.EntryId.Builder.class);
        }

        private Builder() {
            this.maybeForceBuilderInitialization();
        }

        private Builder(BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (com.android.aapt.EntryId.alwaysUseFieldBuilders) {
            }

        }

        public com.android.aapt.EntryId.Builder clear() {
            super.clear();
            this.id_ = 0;
            return this;
        }

        @Override
        public Descriptors.Descriptor getDescriptorForType() {
            return Resources.internal_static_aapt_pb_EntryId_descriptor;
        }

        public com.android.aapt.EntryId getDefaultInstanceForType() {
            return com.android.aapt.EntryId.getDefaultInstance();
        }

        public com.android.aapt.EntryId build() {
            com.android.aapt.EntryId result = this.buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            } else {
                return result;
            }
        }

        public com.android.aapt.EntryId buildPartial() {
            com.android.aapt.EntryId result = new com.android.aapt.EntryId(this);
            result.id_ = this.id_;
            this.onBuilt();
            return result;
        }

        public com.android.aapt.EntryId.Builder clone() {
            return (com.android.aapt.EntryId.Builder)super.clone();
        }

        public com.android.aapt.EntryId.Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (com.android.aapt.EntryId.Builder)super.setField(field, value);
        }

        public com.android.aapt.EntryId.Builder clearField(Descriptors.FieldDescriptor field) {
            return (com.android.aapt.EntryId.Builder)super.clearField(field);
        }

        public com.android.aapt.EntryId.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (com.android.aapt.EntryId.Builder)super.clearOneof(oneof);
        }

        public com.android.aapt.EntryId.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (com.android.aapt.EntryId.Builder)super.setRepeatedField(field, index, value);
        }

        public com.android.aapt.EntryId.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (com.android.aapt.EntryId.Builder)super.addRepeatedField(field, value);
        }

        public com.android.aapt.EntryId.Builder mergeFrom(Message other) {
            if (other instanceof com.android.aapt.EntryId) {
                return this.mergeFrom((com.android.aapt.EntryId)other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public com.android.aapt.EntryId.Builder mergeFrom(com.android.aapt.EntryId other) {
            if (other == com.android.aapt.EntryId.getDefaultInstance()) {
                return this;
            } else {
                if (other.getId() != 0) {
                    this.setId(other.getId());
                }

                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }
        }

        public final boolean isInitialized() {
            return true;
        }

        public com.android.aapt.EntryId.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            com.android.aapt.EntryId parsedMessage = null;

            try {
                parsedMessage = (com.android.aapt.EntryId)com.android.aapt.EntryId.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException var8) {
                parsedMessage = (com.android.aapt.EntryId)var8.getUnfinishedMessage();
                throw var8.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    this.mergeFrom(parsedMessage);
                }

            }

            return this;
        }

        public int getId() {
            return this.id_;
        }

        public com.android.aapt.EntryId.Builder setId(int value) {
            this.id_ = value;
            this.onChanged();
            return this;
        }

        public com.android.aapt.EntryId.Builder clearId() {
            this.id_ = 0;
            this.onChanged();
            return this;
        }

        public final com.android.aapt.EntryId.Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (com.android.aapt.EntryId.Builder)super.setUnknownFields(unknownFields);
        }

        public final com.android.aapt.EntryId.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (com.android.aapt.EntryId.Builder)super.mergeUnknownFields(unknownFields);
        }
    }
}