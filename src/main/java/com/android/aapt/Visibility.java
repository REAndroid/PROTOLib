package com.android.aapt;

import com.google.protobuf.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class Visibility extends GeneratedMessageV3 implements com.android.aapt.VisibilityOrBuilder {
        private static final long serialVersionUID = 0L;
        public static final int LEVEL_FIELD_NUMBER = 1;
        private int level_;
        public static final int SOURCE_FIELD_NUMBER = 2;
        private com.android.aapt.Source source_;
        public static final int COMMENT_FIELD_NUMBER = 3;
        private volatile Object comment_;
        public static final int STAGED_API_FIELD_NUMBER = 4;
        private boolean stagedApi_;
        private byte memoizedIsInitialized;
        private static final com.android.aapt.Visibility DEFAULT_INSTANCE = new com.android.aapt.Visibility();
        private static final Parser<com.android.aapt.Visibility> PARSER = new AbstractParser<com.android.aapt.Visibility>() {
            public com.android.aapt.Visibility parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new com.android.aapt.Visibility(input, extensionRegistry);
            }
        };

        private Visibility(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private Visibility() {
            this.memoizedIsInitialized = -1;
            this.level_ = 0;
            this.comment_ = "";
        }

        @Override
        public Object newInstance(UnusedPrivateParameter unused) {
            return new com.android.aapt.Visibility();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Visibility(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                int rawValue = input.readEnum();
                                this.level_ = rawValue;
                                break;
                            case 18:
                                com.android.aapt.Source.Builder subBuilder = null;
                                if (this.source_ != null) {
                                    subBuilder = this.source_.toBuilder();
                                }

                                this.source_ = (com.android.aapt.Source)input.readMessage(com.android.aapt.Source.parser(), extensionRegistry);
                                if (subBuilder != null) {
                                    subBuilder.mergeFrom(this.source_);
                                    this.source_ = subBuilder.buildPartial();
                                }
                                break;
                            case 26:
                                java.lang.String s = input.readStringRequireUtf8();
                                this.comment_ = s;
                                break;
                            case 32:
                                this.stagedApi_ = input.readBool();
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
            return Resources.internal_static_aapt_pb_Visibility_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_Visibility_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.Visibility.class, com.android.aapt.Visibility.Builder.class);
        }

        public int getLevelValue() {
            return this.level_;
        }

        public com.android.aapt.Visibility.Level getLevel() {
            com.android.aapt.Visibility.Level result = com.android.aapt.Visibility.Level.valueOf(this.level_);
            return result == null ? com.android.aapt.Visibility.Level.UNRECOGNIZED : result;
        }

        public boolean hasSource() {
            return this.source_ != null;
        }

        public com.android.aapt.Source getSource() {
            return this.source_ == null ? com.android.aapt.Source.getDefaultInstance() : this.source_;
        }

        public com.android.aapt.SourceOrBuilder getSourceOrBuilder() {
            return this.getSource();
        }

        @Override
        public java.lang.String getComment() {
            Object ref = this.comment_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String)ref;
            } else {
                ByteString bs = (ByteString)ref;
                java.lang.String s = bs.toStringUtf8();
                this.comment_ = s;
                return s;
            }
        }

        public ByteString getCommentBytes() {
            Object ref = this.comment_;
            if (ref instanceof java.lang.String) {
                ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                this.comment_ = b;
                return b;
            } else {
                return (ByteString)ref;
            }
        }

        public boolean getStagedApi() {
            return this.stagedApi_;
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
            if (this.level_ != com.android.aapt.Visibility.Level.UNKNOWN.getNumber()) {
                output.writeEnum(1, this.level_);
            }

            if (this.source_ != null) {
                output.writeMessage(2, this.getSource());
            }

            if (!this.getCommentBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 3, this.comment_);
            }

            if (this.stagedApi_) {
                output.writeBool(4, this.stagedApi_);
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
                if (this.level_ != com.android.aapt.Visibility.Level.UNKNOWN.getNumber()) {
                    size += CodedOutputStream.computeEnumSize(1, this.level_);
                }

                if (this.source_ != null) {
                    size += CodedOutputStream.computeMessageSize(2, this.getSource());
                }

                if (!this.getCommentBytes().isEmpty()) {
                    size += GeneratedMessageV3.computeStringSize(3, this.comment_);
                }

                if (this.stagedApi_) {
                    size += CodedOutputStream.computeBoolSize(4, this.stagedApi_);
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
            } else if (!(obj instanceof com.android.aapt.Visibility)) {
                return super.equals(obj);
            } else {
                com.android.aapt.Visibility other = (com.android.aapt.Visibility)obj;
                if (this.level_ != other.level_) {
                    return false;
                } else if (this.hasSource() != other.hasSource()) {
                    return false;
                } else if (this.hasSource() && !this.getSource().equals(other.getSource())) {
                    return false;
                } else if (!this.getComment().equals(other.getComment())) {
                    return false;
                } else if (this.getStagedApi() != other.getStagedApi()) {
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
                hash = 53 * hash + this.level_;
                if (this.hasSource()) {
                    hash = 37 * hash + 2;
                    hash = 53 * hash + this.getSource().hashCode();
                }

                hash = 37 * hash + 3;
                hash = 53 * hash + this.getComment().hashCode();
                hash = 37 * hash + 4;
                hash = 53 * hash + Internal.hashBoolean(this.getStagedApi());
                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static com.android.aapt.Visibility parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Visibility)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Visibility parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Visibility)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Visibility parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Visibility)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Visibility parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Visibility)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Visibility parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Visibility)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Visibility parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Visibility)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Visibility parseFrom(InputStream input) throws IOException {
            return (com.android.aapt.Visibility)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.Visibility parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Visibility)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.Visibility parseDelimitedFrom(InputStream input) throws IOException {
            return (com.android.aapt.Visibility)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static com.android.aapt.Visibility parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Visibility)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.Visibility parseFrom(CodedInputStream input) throws IOException {
            return (com.android.aapt.Visibility)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.Visibility parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Visibility)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public com.android.aapt.Visibility.Builder newBuilderForType() {
            return newBuilder();
        }

        public static com.android.aapt.Visibility.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static com.android.aapt.Visibility.Builder newBuilder(com.android.aapt.Visibility prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public com.android.aapt.Visibility.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new com.android.aapt.Visibility.Builder() : (new com.android.aapt.Visibility.Builder()).mergeFrom(this);
        }

        public com.android.aapt.Visibility.Builder newBuilderForType(BuilderParent parent) {
            com.android.aapt.Visibility.Builder builder = new com.android.aapt.Visibility.Builder(parent);
            return builder;
        }

        public static com.android.aapt.Visibility getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<com.android.aapt.Visibility> parser() {
            return PARSER;
        }

        public Parser<com.android.aapt.Visibility> getParserForType() {
            return PARSER;
        }

        public com.android.aapt.Visibility getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.Visibility.Builder> implements com.android.aapt.VisibilityOrBuilder {
            private int level_;
            private com.android.aapt.Source source_;
            private SingleFieldBuilderV3<com.android.aapt.Source, com.android.aapt.Source.Builder, com.android.aapt.SourceOrBuilder> sourceBuilder_;
            private Object comment_;
            private boolean stagedApi_;

            public static Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_Visibility_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_Visibility_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.Visibility.class, com.android.aapt.Visibility.Builder.class);
            }

            private Builder() {
                this.level_ = 0;
                this.comment_ = "";
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.level_ = 0;
                this.comment_ = "";
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.android.aapt.Visibility.alwaysUseFieldBuilders) {
                }

            }

            public com.android.aapt.Visibility.Builder clear() {
                super.clear();
                this.level_ = 0;
                if (this.sourceBuilder_ == null) {
                    this.source_ = null;
                } else {
                    this.source_ = null;
                    this.sourceBuilder_ = null;
                }

                this.comment_ = "";
                this.stagedApi_ = false;
                return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Resources.internal_static_aapt_pb_Visibility_descriptor;
            }

            public com.android.aapt.Visibility getDefaultInstanceForType() {
                return com.android.aapt.Visibility.getDefaultInstance();
            }

            public com.android.aapt.Visibility build() {
                com.android.aapt.Visibility result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public com.android.aapt.Visibility buildPartial() {
                com.android.aapt.Visibility result = new com.android.aapt.Visibility(this);
                result.level_ = this.level_;
                if (this.sourceBuilder_ == null) {
                    result.source_ = this.source_;
                } else {
                    result.source_ = (com.android.aapt.Source)this.sourceBuilder_.build();
                }

                result.comment_ = this.comment_;
                result.stagedApi_ = this.stagedApi_;
                this.onBuilt();
                return result;
            }

            public com.android.aapt.Visibility.Builder clone() {
                return (com.android.aapt.Visibility.Builder)super.clone();
            }

            public com.android.aapt.Visibility.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.Visibility.Builder)super.setField(field, value);
            }

            public com.android.aapt.Visibility.Builder clearField(Descriptors.FieldDescriptor field) {
                return (com.android.aapt.Visibility.Builder)super.clearField(field);
            }

            public com.android.aapt.Visibility.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (com.android.aapt.Visibility.Builder)super.clearOneof(oneof);
            }

            public com.android.aapt.Visibility.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (com.android.aapt.Visibility.Builder)super.setRepeatedField(field, index, value);
            }

            public com.android.aapt.Visibility.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.Visibility.Builder)super.addRepeatedField(field, value);
            }

            public com.android.aapt.Visibility.Builder mergeFrom(Message other) {
                if (other instanceof com.android.aapt.Visibility) {
                    return this.mergeFrom((com.android.aapt.Visibility)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public com.android.aapt.Visibility.Builder mergeFrom(com.android.aapt.Visibility other) {
                if (other == com.android.aapt.Visibility.getDefaultInstance()) {
                    return this;
                } else {
                    if (other.level_ != 0) {
                        this.setLevelValue(other.getLevelValue());
                    }

                    if (other.hasSource()) {
                        this.mergeSource(other.getSource());
                    }

                    if (!other.getComment().isEmpty()) {
                        this.comment_ = other.comment_;
                        this.onChanged();
                    }

                    if (other.getStagedApi()) {
                        this.setStagedApi(other.getStagedApi());
                    }

                    this.mergeUnknownFields(other.unknownFields);
                    this.onChanged();
                    return this;
                }
            }

            public final boolean isInitialized() {
                return true;
            }

            public com.android.aapt.Visibility.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                com.android.aapt.Visibility parsedMessage = null;

                try {
                    parsedMessage = (com.android.aapt.Visibility)com.android.aapt.Visibility.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (com.android.aapt.Visibility)var8.getUnfinishedMessage();
                    throw var8.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }

                }

                return this;
            }

            public int getLevelValue() {
                return this.level_;
            }

            public com.android.aapt.Visibility.Builder setLevelValue(int value) {
                this.level_ = value;
                this.onChanged();
                return this;
            }

            public com.android.aapt.Visibility.Level getLevel() {
                com.android.aapt.Visibility.Level result = com.android.aapt.Visibility.Level.valueOf(this.level_);
                return result == null ? com.android.aapt.Visibility.Level.UNRECOGNIZED : result;
            }

            public com.android.aapt.Visibility.Builder setLevel(com.android.aapt.Visibility.Level value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.level_ = value.getNumber();
                    this.onChanged();
                    return this;
                }
            }

            public com.android.aapt.Visibility.Builder clearLevel() {
                this.level_ = 0;
                this.onChanged();
                return this;
            }

            public boolean hasSource() {
                return this.sourceBuilder_ != null || this.source_ != null;
            }

            public com.android.aapt.Source getSource() {
                if (this.sourceBuilder_ == null) {
                    return this.source_ == null ? com.android.aapt.Source.getDefaultInstance() : this.source_;
                } else {
                    return (com.android.aapt.Source)this.sourceBuilder_.getMessage();
                }
            }

            public com.android.aapt.Visibility.Builder setSource(com.android.aapt.Source value) {
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

            public com.android.aapt.Visibility.Builder setSource(com.android.aapt.Source.Builder builderForValue) {
                if (this.sourceBuilder_ == null) {
                    this.source_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.sourceBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.Visibility.Builder mergeSource(com.android.aapt.Source value) {
                if (this.sourceBuilder_ == null) {
                    if (this.source_ != null) {
                        this.source_ = com.android.aapt.Source.newBuilder(this.source_).mergeFrom(value).buildPartial();
                    } else {
                        this.source_ = value;
                    }

                    this.onChanged();
                } else {
                    this.sourceBuilder_.mergeFrom(value);
                }

                return this;
            }

            public com.android.aapt.Visibility.Builder clearSource() {
                if (this.sourceBuilder_ == null) {
                    this.source_ = null;
                    this.onChanged();
                } else {
                    this.source_ = null;
                    this.sourceBuilder_ = null;
                }

                return this;
            }

            public com.android.aapt.Source.Builder getSourceBuilder() {
                this.onChanged();
                return (com.android.aapt.Source.Builder)this.getSourceFieldBuilder().getBuilder();
            }

            public com.android.aapt.SourceOrBuilder getSourceOrBuilder() {
                if (this.sourceBuilder_ != null) {
                    return (com.android.aapt.SourceOrBuilder)this.sourceBuilder_.getMessageOrBuilder();
                } else {
                    return this.source_ == null ? com.android.aapt.Source.getDefaultInstance() : this.source_;
                }
            }

            private SingleFieldBuilderV3<com.android.aapt.Source, com.android.aapt.Source.Builder, com.android.aapt.SourceOrBuilder> getSourceFieldBuilder() {
                if (this.sourceBuilder_ == null) {
                    this.sourceBuilder_ = new SingleFieldBuilderV3(this.getSource(), this.getParentForChildren(), this.isClean());
                    this.source_ = null;
                }

                return this.sourceBuilder_;
            }

            @Override
            public java.lang.String getComment() {
                Object ref = this.comment_;
                if (!(ref instanceof java.lang.String)) {
                    ByteString bs = (ByteString)ref;
                    java.lang.String s = bs.toStringUtf8();
                    this.comment_ = s;
                    return s;
                } else {
                    return (java.lang.String)ref;
                }
            }

            public ByteString getCommentBytes() {
                Object ref = this.comment_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                    this.comment_ = b;
                    return b;
                } else {
                    return (ByteString)ref;
                }
            }

            public com.android.aapt.Visibility.Builder setComment(java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.comment_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public com.android.aapt.Visibility.Builder clearComment() {
                this.comment_ = com.android.aapt.Visibility.getDefaultInstance().getComment();
                this.onChanged();
                return this;
            }

            public com.android.aapt.Visibility.Builder setCommentBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    com.android.aapt.Visibility.checkByteStringIsUtf8(value);
                    this.comment_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public boolean getStagedApi() {
                return this.stagedApi_;
            }

            public com.android.aapt.Visibility.Builder setStagedApi(boolean value) {
                this.stagedApi_ = value;
                this.onChanged();
                return this;
            }

            public com.android.aapt.Visibility.Builder clearStagedApi() {
                this.stagedApi_ = false;
                this.onChanged();
                return this;
            }

            public final com.android.aapt.Visibility.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.Visibility.Builder)super.setUnknownFields(unknownFields);
            }

            public final com.android.aapt.Visibility.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.Visibility.Builder)super.mergeUnknownFields(unknownFields);
            }
        }

        public static enum Level implements ProtocolMessageEnum {
            UNKNOWN(0),
            PRIVATE(1),
            PUBLIC(2),
            UNRECOGNIZED(-1);

            public static final int UNKNOWN_VALUE = 0;
            public static final int PRIVATE_VALUE = 1;
            public static final int PUBLIC_VALUE = 2;
            private static final Internal.EnumLiteMap<Level> internalValueMap = new Internal.EnumLiteMap<Level>() {
                public com.android.aapt.Visibility.Level findValueByNumber(int number) {
                    return com.android.aapt.Visibility.Level.forNumber(number);
                }
            };
            private static final com.android.aapt.Visibility.Level[] VALUES = values();
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
            public static com.android.aapt.Visibility.Level valueOf(int value) {
                return forNumber(value);
            }

            public static com.android.aapt.Visibility.Level forNumber(int value) {
                switch(value) {
                    case 0:
                        return UNKNOWN;
                    case 1:
                        return PRIVATE;
                    case 2:
                        return PUBLIC;
                    default:
                        return null;
                }
            }

            public static Internal.EnumLiteMap<Level> internalGetValueMap() {
                return internalValueMap;
            }

            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
            }

            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return (Descriptors.EnumDescriptor)com.android.aapt.Visibility.getDescriptor().getEnumTypes().get(0);
            }

            public static com.android.aapt.Visibility.Level valueOf(Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                } else {
                    return desc.getIndex() == -1 ? UNRECOGNIZED : VALUES[desc.getIndex()];
                }
            }

            private Level(int value) {
                this.value = value;
            }
        }
    }