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

public class ConfigValue extends GeneratedMessageV3 implements com.android.aapt.ConfigValueOrBuilder {
        private static final long serialVersionUID = 0L;
        public static final int CONFIG_FIELD_NUMBER = 1;
        private Configuration config_;
        public static final int VALUE_FIELD_NUMBER = 2;
        private com.android.aapt.Value value_;
        private byte memoizedIsInitialized;
        private static final com.android.aapt.ConfigValue DEFAULT_INSTANCE = new com.android.aapt.ConfigValue();
        private static final Parser<com.android.aapt.ConfigValue> PARSER = new AbstractParser<com.android.aapt.ConfigValue>() {
            public com.android.aapt.ConfigValue parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new com.android.aapt.ConfigValue(input, extensionRegistry);
            }
        };

        private ConfigValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private ConfigValue() {
            this.memoizedIsInitialized = -1;
        }

        @Override
        public Object newInstance(UnusedPrivateParameter unused) {
            return new com.android.aapt.ConfigValue();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ConfigValue(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                com.android.aapt.ConfigurationOuterClass.Configuration.Builder subBuilder = null;
                                if (this.config_ != null) {
                                    subBuilder = this.config_.toBuilder();
                                }

                                this.config_ = (Configuration)input.readMessage(Configuration.parser(), extensionRegistry);
                                if (subBuilder != null) {
                                    subBuilder.mergeFrom(this.config_);
                                    this.config_ = subBuilder.buildPartial();
                                }
                                break;
                            case 18:
                                com.android.aapt.Value.Builder subBuilder2 = null;
                                if (this.value_ != null) {
                                    subBuilder2 = this.value_.toBuilder();
                                }

                                this.value_ = (com.android.aapt.Value)input.readMessage(com.android.aapt.Value.parser(), extensionRegistry);
                                if (subBuilder2 != null) {
                                    subBuilder2.mergeFrom(this.value_);
                                    this.value_ = subBuilder2.buildPartial();
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
            return Resources.internal_static_aapt_pb_ConfigValue_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_ConfigValue_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.ConfigValue.class, com.android.aapt.ConfigValue.Builder.class);
        }

        public boolean hasConfig() {
            return this.config_ != null;
        }

        public Configuration getConfig() {
            return this.config_ == null ? Configuration.getDefaultInstance() : this.config_;
        }

        public ConfigurationOrBuilder getConfigOrBuilder() {
            return this.getConfig();
        }

        public boolean hasValue() {
            return this.value_ != null;
        }

        public com.android.aapt.Value getValue() {
            return this.value_ == null ? com.android.aapt.Value.getDefaultInstance() : this.value_;
        }

        public com.android.aapt.ValueOrBuilder getValueOrBuilder() {
            return this.getValue();
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
            if (this.config_ != null) {
                output.writeMessage(1, this.getConfig());
            }

            if (this.value_ != null) {
                output.writeMessage(2, this.getValue());
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
                if (this.config_ != null) {
                    size += CodedOutputStream.computeMessageSize(1, this.getConfig());
                }

                if (this.value_ != null) {
                    size += CodedOutputStream.computeMessageSize(2, this.getValue());
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
            } else if (!(obj instanceof com.android.aapt.ConfigValue)) {
                return super.equals(obj);
            } else {
                com.android.aapt.ConfigValue other = (com.android.aapt.ConfigValue)obj;
                if (this.hasConfig() != other.hasConfig()) {
                    return false;
                } else if (this.hasConfig() && !this.getConfig().equals(other.getConfig())) {
                    return false;
                } else if (this.hasValue() != other.hasValue()) {
                    return false;
                } else if (this.hasValue() && !this.getValue().equals(other.getValue())) {
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
                if (this.hasConfig()) {
                    hash = 37 * hash + 1;
                    hash = 53 * hash + this.getConfig().hashCode();
                }

                if (this.hasValue()) {
                    hash = 37 * hash + 2;
                    hash = 53 * hash + this.getValue().hashCode();
                }

                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static com.android.aapt.ConfigValue parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (com.android.aapt.ConfigValue)PARSER.parseFrom(data);
        }

        public static com.android.aapt.ConfigValue parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.ConfigValue)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.ConfigValue parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (com.android.aapt.ConfigValue)PARSER.parseFrom(data);
        }

        public static com.android.aapt.ConfigValue parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.ConfigValue)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.ConfigValue parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (com.android.aapt.ConfigValue)PARSER.parseFrom(data);
        }

        public static com.android.aapt.ConfigValue parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.ConfigValue)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.ConfigValue parseFrom(InputStream input) throws IOException {
            return (com.android.aapt.ConfigValue)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.ConfigValue parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.ConfigValue)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.ConfigValue parseDelimitedFrom(InputStream input) throws IOException {
            return (com.android.aapt.ConfigValue)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static com.android.aapt.ConfigValue parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.ConfigValue)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.ConfigValue parseFrom(CodedInputStream input) throws IOException {
            return (com.android.aapt.ConfigValue)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.ConfigValue parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.ConfigValue)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public com.android.aapt.ConfigValue.Builder newBuilderForType() {
            return newBuilder();
        }

        public static com.android.aapt.ConfigValue.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static com.android.aapt.ConfigValue.Builder newBuilder(com.android.aapt.ConfigValue prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public com.android.aapt.ConfigValue.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new com.android.aapt.ConfigValue.Builder() : (new com.android.aapt.ConfigValue.Builder()).mergeFrom(this);
        }

        public com.android.aapt.ConfigValue.Builder newBuilderForType(BuilderParent parent) {
            com.android.aapt.ConfigValue.Builder builder = new com.android.aapt.ConfigValue.Builder(parent);
            return builder;
        }

        public static com.android.aapt.ConfigValue getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<com.android.aapt.ConfigValue> parser() {
            return PARSER;
        }

        public Parser<com.android.aapt.ConfigValue> getParserForType() {
            return PARSER;
        }

        public com.android.aapt.ConfigValue getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.ConfigValue.Builder> implements com.android.aapt.ConfigValueOrBuilder {
            private Configuration config_;
            private SingleFieldBuilderV3<Configuration, com.android.aapt.ConfigurationOuterClass.Configuration.Builder, ConfigurationOrBuilder> configBuilder_;
            private com.android.aapt.Value value_;
            private SingleFieldBuilderV3<com.android.aapt.Value, com.android.aapt.Value.Builder, com.android.aapt.ValueOrBuilder> valueBuilder_;

            public static Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_ConfigValue_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_ConfigValue_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.ConfigValue.class, com.android.aapt.ConfigValue.Builder.class);
            }

            private Builder() {
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.android.aapt.ConfigValue.alwaysUseFieldBuilders) {
                }

            }

            public com.android.aapt.ConfigValue.Builder clear() {
                super.clear();
                if (this.configBuilder_ == null) {
                    this.config_ = null;
                } else {
                    this.config_ = null;
                    this.configBuilder_ = null;
                }

                if (this.valueBuilder_ == null) {
                    this.value_ = null;
                } else {
                    this.value_ = null;
                    this.valueBuilder_ = null;
                }

                return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Resources.internal_static_aapt_pb_ConfigValue_descriptor;
            }

            public com.android.aapt.ConfigValue getDefaultInstanceForType() {
                return com.android.aapt.ConfigValue.getDefaultInstance();
            }

            public com.android.aapt.ConfigValue build() {
                com.android.aapt.ConfigValue result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public com.android.aapt.ConfigValue buildPartial() {
                com.android.aapt.ConfigValue result = new com.android.aapt.ConfigValue(this);
                if (this.configBuilder_ == null) {
                    result.config_ = this.config_;
                } else {
                    result.config_ = (Configuration)this.configBuilder_.build();
                }

                if (this.valueBuilder_ == null) {
                    result.value_ = this.value_;
                } else {
                    result.value_ = (com.android.aapt.Value)this.valueBuilder_.build();
                }

                this.onBuilt();
                return result;
            }

            public com.android.aapt.ConfigValue.Builder clone() {
                return (com.android.aapt.ConfigValue.Builder)super.clone();
            }

            public com.android.aapt.ConfigValue.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.ConfigValue.Builder)super.setField(field, value);
            }

            public com.android.aapt.ConfigValue.Builder clearField(Descriptors.FieldDescriptor field) {
                return (com.android.aapt.ConfigValue.Builder)super.clearField(field);
            }

            public com.android.aapt.ConfigValue.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (com.android.aapt.ConfigValue.Builder)super.clearOneof(oneof);
            }

            public com.android.aapt.ConfigValue.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (com.android.aapt.ConfigValue.Builder)super.setRepeatedField(field, index, value);
            }

            public com.android.aapt.ConfigValue.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.ConfigValue.Builder)super.addRepeatedField(field, value);
            }

            public com.android.aapt.ConfigValue.Builder mergeFrom(Message other) {
                if (other instanceof com.android.aapt.ConfigValue) {
                    return this.mergeFrom((com.android.aapt.ConfigValue)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public com.android.aapt.ConfigValue.Builder mergeFrom(com.android.aapt.ConfigValue other) {
                if (other == com.android.aapt.ConfigValue.getDefaultInstance()) {
                    return this;
                } else {
                    if (other.hasConfig()) {
                        this.mergeConfig(other.getConfig());
                    }

                    if (other.hasValue()) {
                        this.mergeValue(other.getValue());
                    }

                    this.mergeUnknownFields(other.unknownFields);
                    this.onChanged();
                    return this;
                }
            }

            public final boolean isInitialized() {
                return true;
            }

            public com.android.aapt.ConfigValue.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                com.android.aapt.ConfigValue parsedMessage = null;

                try {
                    parsedMessage = (com.android.aapt.ConfigValue)com.android.aapt.ConfigValue.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (com.android.aapt.ConfigValue)var8.getUnfinishedMessage();
                    throw var8.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }

                }

                return this;
            }

            public boolean hasConfig() {
                return this.configBuilder_ != null || this.config_ != null;
            }

            public Configuration getConfig() {
                if (this.configBuilder_ == null) {
                    return this.config_ == null ? Configuration.getDefaultInstance() : this.config_;
                } else {
                    return (Configuration)this.configBuilder_.getMessage();
                }
            }

            public com.android.aapt.ConfigValue.Builder setConfig(Configuration value) {
                if (this.configBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.config_ = value;
                    this.onChanged();
                } else {
                    this.configBuilder_.setMessage(value);
                }

                return this;
            }

            public com.android.aapt.ConfigValue.Builder setConfig(com.android.aapt.ConfigurationOuterClass.Configuration.Builder builderForValue) {
                if (this.configBuilder_ == null) {
                    this.config_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.configBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.ConfigValue.Builder mergeConfig(Configuration value) {
                if (this.configBuilder_ == null) {
                    if (this.config_ != null) {
                        this.config_ = Configuration.newBuilder(this.config_).mergeFrom(value).buildPartial();
                    } else {
                        this.config_ = value;
                    }

                    this.onChanged();
                } else {
                    this.configBuilder_.mergeFrom(value);
                }

                return this;
            }

            public com.android.aapt.ConfigValue.Builder clearConfig() {
                if (this.configBuilder_ == null) {
                    this.config_ = null;
                    this.onChanged();
                } else {
                    this.config_ = null;
                    this.configBuilder_ = null;
                }

                return this;
            }

            public com.android.aapt.ConfigurationOuterClass.Configuration.Builder getConfigBuilder() {
                this.onChanged();
                return (com.android.aapt.ConfigurationOuterClass.Configuration.Builder)this.getConfigFieldBuilder().getBuilder();
            }

            public ConfigurationOrBuilder getConfigOrBuilder() {
                if (this.configBuilder_ != null) {
                    return (ConfigurationOrBuilder)this.configBuilder_.getMessageOrBuilder();
                } else {
                    return this.config_ == null ? Configuration.getDefaultInstance() : this.config_;
                }
            }

            private SingleFieldBuilderV3<Configuration, com.android.aapt.ConfigurationOuterClass.Configuration.Builder, ConfigurationOrBuilder> getConfigFieldBuilder() {
                if (this.configBuilder_ == null) {
                    this.configBuilder_ = new SingleFieldBuilderV3(this.getConfig(), this.getParentForChildren(), this.isClean());
                    this.config_ = null;
                }

                return this.configBuilder_;
            }

            public boolean hasValue() {
                return this.valueBuilder_ != null || this.value_ != null;
            }

            public com.android.aapt.Value getValue() {
                if (this.valueBuilder_ == null) {
                    return this.value_ == null ? com.android.aapt.Value.getDefaultInstance() : this.value_;
                } else {
                    return (com.android.aapt.Value)this.valueBuilder_.getMessage();
                }
            }

            public com.android.aapt.ConfigValue.Builder setValue(com.android.aapt.Value value) {
                if (this.valueBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.value_ = value;
                    this.onChanged();
                } else {
                    this.valueBuilder_.setMessage(value);
                }

                return this;
            }

            public com.android.aapt.ConfigValue.Builder setValue(com.android.aapt.Value.Builder builderForValue) {
                if (this.valueBuilder_ == null) {
                    this.value_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.valueBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.ConfigValue.Builder mergeValue(com.android.aapt.Value value) {
                if (this.valueBuilder_ == null) {
                    if (this.value_ != null) {
                        this.value_ = com.android.aapt.Value.newBuilder(this.value_).mergeFrom(value).buildPartial();
                    } else {
                        this.value_ = value;
                    }

                    this.onChanged();
                } else {
                    this.valueBuilder_.mergeFrom(value);
                }

                return this;
            }

            public com.android.aapt.ConfigValue.Builder clearValue() {
                if (this.valueBuilder_ == null) {
                    this.value_ = null;
                    this.onChanged();
                } else {
                    this.value_ = null;
                    this.valueBuilder_ = null;
                }

                return this;
            }

            public com.android.aapt.Value.Builder getValueBuilder() {
                this.onChanged();
                return (com.android.aapt.Value.Builder)this.getValueFieldBuilder().getBuilder();
            }

            public com.android.aapt.ValueOrBuilder getValueOrBuilder() {
                if (this.valueBuilder_ != null) {
                    return (com.android.aapt.ValueOrBuilder)this.valueBuilder_.getMessageOrBuilder();
                } else {
                    return this.value_ == null ? com.android.aapt.Value.getDefaultInstance() : this.value_;
                }
            }

            private SingleFieldBuilderV3<com.android.aapt.Value, com.android.aapt.Value.Builder, com.android.aapt.ValueOrBuilder> getValueFieldBuilder() {
                if (this.valueBuilder_ == null) {
                    this.valueBuilder_ = new SingleFieldBuilderV3(this.getValue(), this.getParentForChildren(), this.isClean());
                    this.value_ = null;
                }

                return this.valueBuilder_;
            }

            public final com.android.aapt.ConfigValue.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.ConfigValue.Builder)super.setUnknownFields(unknownFields);
            }

            public final com.android.aapt.ConfigValue.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.ConfigValue.Builder)super.mergeUnknownFields(unknownFields);
            }
        }
    }