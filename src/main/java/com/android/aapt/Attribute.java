package com.android.aapt;

import com.google.protobuf.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Attribute extends GeneratedMessageV3 implements com.android.aapt.AttributeOrBuilder {
    private static final long serialVersionUID = 0L;
    public static final int FORMAT_FLAGS_FIELD_NUMBER = 1;
    public static final int MIN_INT_FIELD_NUMBER = 2;
    public static final int MAX_INT_FIELD_NUMBER = 3;
    public static final int SYMBOL_FIELD_NUMBER = 4;
    private int formatFlags_;
    private int minInt_;
    private int maxInt_;
    private List<com.android.aapt.Attribute.Symbol> symbol_;
    private byte memoizedIsInitialized;
    private static final com.android.aapt.Attribute DEFAULT_INSTANCE = new com.android.aapt.Attribute();
    private static final Parser<com.android.aapt.Attribute> PARSER = new AbstractParser<com.android.aapt.Attribute>() {
        public com.android.aapt.Attribute parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new com.android.aapt.Attribute(input, extensionRegistry);
        }
    };

    private Attribute(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private Attribute() {
        this.memoizedIsInitialized = -1;
        this.symbol_ = Collections.emptyList();
    }

    @Override
    public Object newInstance(UnusedPrivateParameter unused) {
        return new com.android.aapt.Attribute();
    }

    @Override
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private Attribute(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new NullPointerException();
        } else {
            boolean mutable_bitField0_ = false;
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
                            this.formatFlags_ = input.readUInt32();
                            break;
                        case 16:
                            this.minInt_ = input.readInt32();
                            break;
                        case 24:
                            this.maxInt_ = input.readInt32();
                            break;
                        case 34:
                            if (!(mutable_bitField0_)) {
                                this.symbol_ = new ArrayList();
                                mutable_bitField0_ = true;
                            }

                            this.symbol_.add((com.android.aapt.Attribute.Symbol)input.readMessage(com.android.aapt.Attribute.Symbol.parser(), extensionRegistry));
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
                if (mutable_bitField0_ & true) {
                    this.symbol_ = Collections.unmodifiableList(this.symbol_);
                }

                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }

        }
    }

    public static Descriptors.Descriptor getDescriptor() {
        return Resources.internal_static_aapt_pb_Attribute_descriptor;
    }

    public FieldAccessorTable internalGetFieldAccessorTable() {
        return Resources.internal_static_aapt_pb_Attribute_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.Attribute.class, com.android.aapt.Attribute.Builder.class);
    }

    public int getFormatFlags() {
        return this.formatFlags_;
    }

    public int getMinInt() {
        return this.minInt_;
    }

    public int getMaxInt() {
        return this.maxInt_;
    }

    public List<com.android.aapt.Attribute.Symbol> getSymbolList() {
        return this.symbol_;
    }

    public List<? extends com.android.aapt.Attribute.SymbolOrBuilder> getSymbolOrBuilderList() {
        return this.symbol_;
    }

    public int getSymbolCount() {
        return this.symbol_.size();
    }

    public com.android.aapt.Attribute.Symbol getSymbol(int index) {
        return (com.android.aapt.Attribute.Symbol)this.symbol_.get(index);
    }

    public com.android.aapt.Attribute.SymbolOrBuilder getSymbolOrBuilder(int index) {
        return (com.android.aapt.Attribute.SymbolOrBuilder)this.symbol_.get(index);
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
        if (this.formatFlags_ != 0) {
            output.writeUInt32(FORMAT_FLAGS_FIELD_NUMBER, this.formatFlags_);
        }

        if (this.minInt_ != 0) {
            output.writeInt32(MIN_INT_FIELD_NUMBER, this.minInt_);
        }

        if (this.maxInt_ != 0) {
            output.writeInt32(MAX_INT_FIELD_NUMBER, this.maxInt_);
        }

        for(int i = 0; i < this.symbol_.size(); ++i) {
            output.writeMessage(SYMBOL_FIELD_NUMBER, (MessageLite)this.symbol_.get(i));
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
            if (this.formatFlags_ != 0) {
                size += CodedOutputStream.computeUInt32Size(FORMAT_FLAGS_FIELD_NUMBER, this.formatFlags_);
            }

            if (this.minInt_ != 0) {
                size += CodedOutputStream.computeInt32Size(MIN_INT_FIELD_NUMBER, this.minInt_);
            }

            if (this.maxInt_ != 0) {
                size += CodedOutputStream.computeInt32Size(MAX_INT_FIELD_NUMBER, this.maxInt_);
            }

            for(int i = 0; i < this.symbol_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(SYMBOL_FIELD_NUMBER, (MessageLite)this.symbol_.get(i));
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
        } else if (!(obj instanceof com.android.aapt.Attribute)) {
            return super.equals(obj);
        } else {
            com.android.aapt.Attribute other = (com.android.aapt.Attribute)obj;
            if (this.getFormatFlags() != other.getFormatFlags()) {
                return false;
            } else if (this.getMinInt() != other.getMinInt()) {
                return false;
            } else if (this.getMaxInt() != other.getMaxInt()) {
                return false;
            } else if (!this.getSymbolList().equals(other.getSymbolList())) {
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
            hash = 53 * hash + this.getFormatFlags();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getMinInt();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getMaxInt();
            if (this.getSymbolCount() > 0) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.getSymbolList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
        }
    }

    public static com.android.aapt.Attribute parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (com.android.aapt.Attribute)PARSER.parseFrom(data);
    }

    public static com.android.aapt.Attribute parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (com.android.aapt.Attribute)PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.android.aapt.Attribute parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (com.android.aapt.Attribute)PARSER.parseFrom(data);
    }

    public static com.android.aapt.Attribute parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (com.android.aapt.Attribute)PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.android.aapt.Attribute parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (com.android.aapt.Attribute)PARSER.parseFrom(data);
    }

    public static com.android.aapt.Attribute parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (com.android.aapt.Attribute)PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.android.aapt.Attribute parseFrom(InputStream input) throws IOException {
        return (com.android.aapt.Attribute)GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.android.aapt.Attribute parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (com.android.aapt.Attribute)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.android.aapt.Attribute parseDelimitedFrom(InputStream input) throws IOException {
        return (com.android.aapt.Attribute)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.android.aapt.Attribute parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (com.android.aapt.Attribute)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.android.aapt.Attribute parseFrom(CodedInputStream input) throws IOException {
        return (com.android.aapt.Attribute)GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.android.aapt.Attribute parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (com.android.aapt.Attribute)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public com.android.aapt.Attribute.Builder newBuilderForType() {
        return newBuilder();
    }

    public static com.android.aapt.Attribute.Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static com.android.aapt.Attribute.Builder newBuilder(com.android.aapt.Attribute prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public com.android.aapt.Attribute.Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new com.android.aapt.Attribute.Builder() : (new com.android.aapt.Attribute.Builder()).mergeFrom(this);
    }

    public com.android.aapt.Attribute.Builder newBuilderForType(BuilderParent parent) {
        com.android.aapt.Attribute.Builder builder = new com.android.aapt.Attribute.Builder(parent);
        return builder;
    }

    public static com.android.aapt.Attribute getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<com.android.aapt.Attribute> parser() {
        return PARSER;
    }

    public Parser<com.android.aapt.Attribute> getParserForType() {
        return PARSER;
    }

    public com.android.aapt.Attribute getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.Attribute.Builder> implements com.android.aapt.AttributeOrBuilder {
        private int bitField0_;
        private int formatFlags_;
        private int minInt_;
        private int maxInt_;
        private List<com.android.aapt.Attribute.Symbol> symbol_;
        private RepeatedFieldBuilderV3<com.android.aapt.Attribute.Symbol, com.android.aapt.Attribute.Symbol.Builder, com.android.aapt.Attribute.SymbolOrBuilder> symbolBuilder_;

        public static Descriptors.Descriptor getDescriptor() {
            return Resources.internal_static_aapt_pb_Attribute_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_Attribute_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.Attribute.class, com.android.aapt.Attribute.Builder.class);
        }

        private Builder() {
            this.symbol_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
        }

        private Builder(BuilderParent parent) {
            super(parent);
            this.symbol_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (com.android.aapt.Attribute.alwaysUseFieldBuilders) {
                this.getSymbolFieldBuilder();
            }

        }

        public com.android.aapt.Attribute.Builder clear() {
            super.clear();
            this.formatFlags_ = 0;
            this.minInt_ = 0;
            this.maxInt_ = 0;
            if (this.symbolBuilder_ == null) {
                this.symbol_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                this.symbolBuilder_.clear();
            }

            return this;
        }

        @Override
        public Descriptors.Descriptor getDescriptorForType() {
            return Resources.internal_static_aapt_pb_Attribute_descriptor;
        }

        public com.android.aapt.Attribute getDefaultInstanceForType() {
            return com.android.aapt.Attribute.getDefaultInstance();
        }

        public com.android.aapt.Attribute build() {
            com.android.aapt.Attribute result = this.buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            } else {
                return result;
            }
        }

        public com.android.aapt.Attribute buildPartial() {
            com.android.aapt.Attribute result = new com.android.aapt.Attribute(this);
            int from_bitField0_ = this.bitField0_;
            result.formatFlags_ = this.formatFlags_;
            result.minInt_ = this.minInt_;
            result.maxInt_ = this.maxInt_;
            if (this.symbolBuilder_ == null) {
                if ((this.bitField0_ & 1) != 0) {
                    this.symbol_ = Collections.unmodifiableList(this.symbol_);
                    this.bitField0_ &= -2;
                }

                result.symbol_ = this.symbol_;
            } else {
                result.symbol_ = this.symbolBuilder_.build();
            }

            this.onBuilt();
            return result;
        }

        public com.android.aapt.Attribute.Builder clone() {
            return (com.android.aapt.Attribute.Builder)super.clone();
        }

        public com.android.aapt.Attribute.Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (com.android.aapt.Attribute.Builder)super.setField(field, value);
        }

        public com.android.aapt.Attribute.Builder clearField(Descriptors.FieldDescriptor field) {
            return (com.android.aapt.Attribute.Builder)super.clearField(field);
        }

        public com.android.aapt.Attribute.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (com.android.aapt.Attribute.Builder)super.clearOneof(oneof);
        }

        public com.android.aapt.Attribute.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (com.android.aapt.Attribute.Builder)super.setRepeatedField(field, index, value);
        }

        public com.android.aapt.Attribute.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (com.android.aapt.Attribute.Builder)super.addRepeatedField(field, value);
        }

        public com.android.aapt.Attribute.Builder mergeFrom(Message other) {
            if (other instanceof com.android.aapt.Attribute) {
                return this.mergeFrom((com.android.aapt.Attribute)other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public com.android.aapt.Attribute.Builder mergeFrom(com.android.aapt.Attribute other) {
            if (other == com.android.aapt.Attribute.getDefaultInstance()) {
                return this;
            } else {
                if (other.getFormatFlags() != 0) {
                    this.setFormatFlags(other.getFormatFlags());
                }

                if (other.getMinInt() != 0) {
                    this.setMinInt(other.getMinInt());
                }

                if (other.getMaxInt() != 0) {
                    this.setMaxInt(other.getMaxInt());
                }

                if (this.symbolBuilder_ == null) {
                    if (!other.symbol_.isEmpty()) {
                        if (this.symbol_.isEmpty()) {
                            this.symbol_ = other.symbol_;
                            this.bitField0_ &= -2;
                        } else {
                            this.ensureSymbolIsMutable();
                            this.symbol_.addAll(other.symbol_);
                        }

                        this.onChanged();
                    }
                } else if (!other.symbol_.isEmpty()) {
                    if (this.symbolBuilder_.isEmpty()) {
                        this.symbolBuilder_.dispose();
                        this.symbolBuilder_ = null;
                        this.symbol_ = other.symbol_;
                        this.bitField0_ &= -2;
                        this.symbolBuilder_ = com.android.aapt.Attribute.alwaysUseFieldBuilders ? this.getSymbolFieldBuilder() : null;
                    } else {
                        this.symbolBuilder_.addAllMessages(other.symbol_);
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

        public com.android.aapt.Attribute.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            com.android.aapt.Attribute parsedMessage = null;

            try {
                parsedMessage = (com.android.aapt.Attribute)com.android.aapt.Attribute.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException var8) {
                parsedMessage = (com.android.aapt.Attribute)var8.getUnfinishedMessage();
                throw var8.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    this.mergeFrom(parsedMessage);
                }

            }

            return this;
        }

        public int getFormatFlags() {
            return this.formatFlags_;
        }

        public com.android.aapt.Attribute.Builder setFormatFlags(int value) {
            this.formatFlags_ = value;
            this.onChanged();
            return this;
        }

        public com.android.aapt.Attribute.Builder clearFormatFlags() {
            this.formatFlags_ = 0;
            this.onChanged();
            return this;
        }

        public int getMinInt() {
            return this.minInt_;
        }

        public com.android.aapt.Attribute.Builder setMinInt(int value) {
            this.minInt_ = value;
            this.onChanged();
            return this;
        }

        public com.android.aapt.Attribute.Builder clearMinInt() {
            this.minInt_ = 0;
            this.onChanged();
            return this;
        }

        public int getMaxInt() {
            return this.maxInt_;
        }

        public com.android.aapt.Attribute.Builder setMaxInt(int value) {
            this.maxInt_ = value;
            this.onChanged();
            return this;
        }

        public com.android.aapt.Attribute.Builder clearMaxInt() {
            this.maxInt_ = 0;
            this.onChanged();
            return this;
        }

        private void ensureSymbolIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.symbol_ = new ArrayList(this.symbol_);
                this.bitField0_ |= 1;
            }

        }

        public List<com.android.aapt.Attribute.Symbol> getSymbolList() {
            return this.symbolBuilder_ == null ? Collections.unmodifiableList(this.symbol_) : this.symbolBuilder_.getMessageList();
        }

        public int getSymbolCount() {
            return this.symbolBuilder_ == null ? this.symbol_.size() : this.symbolBuilder_.getCount();
        }

        public com.android.aapt.Attribute.Symbol getSymbol(int index) {
            return this.symbolBuilder_ == null ? (com.android.aapt.Attribute.Symbol)this.symbol_.get(index) : (com.android.aapt.Attribute.Symbol)this.symbolBuilder_.getMessage(index);
        }

        public com.android.aapt.Attribute.Builder setSymbol(int index, com.android.aapt.Attribute.Symbol value) {
            if (this.symbolBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }

                this.ensureSymbolIsMutable();
                this.symbol_.set(index, value);
                this.onChanged();
            } else {
                this.symbolBuilder_.setMessage(index, value);
            }

            return this;
        }

        public com.android.aapt.Attribute.Builder setSymbol(int index, com.android.aapt.Attribute.Symbol.Builder builderForValue) {
            if (this.symbolBuilder_ == null) {
                this.ensureSymbolIsMutable();
                this.symbol_.set(index, builderForValue.build());
                this.onChanged();
            } else {
                this.symbolBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
        }

        public com.android.aapt.Attribute.Builder addSymbol(com.android.aapt.Attribute.Symbol value) {
            if (this.symbolBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }

                this.ensureSymbolIsMutable();
                this.symbol_.add(value);
                this.onChanged();
            } else {
                this.symbolBuilder_.addMessage(value);
            }

            return this;
        }

        public com.android.aapt.Attribute.Builder addSymbol(int index, com.android.aapt.Attribute.Symbol value) {
            if (this.symbolBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }

                this.ensureSymbolIsMutable();
                this.symbol_.add(index, value);
                this.onChanged();
            } else {
                this.symbolBuilder_.addMessage(index, value);
            }

            return this;
        }

        public com.android.aapt.Attribute.Builder addSymbol(com.android.aapt.Attribute.Symbol.Builder builderForValue) {
            if (this.symbolBuilder_ == null) {
                this.ensureSymbolIsMutable();
                this.symbol_.add(builderForValue.build());
                this.onChanged();
            } else {
                this.symbolBuilder_.addMessage(builderForValue.build());
            }

            return this;
        }

        public com.android.aapt.Attribute.Builder addSymbol(int index, com.android.aapt.Attribute.Symbol.Builder builderForValue) {
            if (this.symbolBuilder_ == null) {
                this.ensureSymbolIsMutable();
                this.symbol_.add(index, builderForValue.build());
                this.onChanged();
            } else {
                this.symbolBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
        }

        public com.android.aapt.Attribute.Builder addAllSymbol(Iterable<? extends com.android.aapt.Attribute.Symbol> values) {
            if (this.symbolBuilder_ == null) {
                this.ensureSymbolIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.symbol_);
                this.onChanged();
            } else {
                this.symbolBuilder_.addAllMessages(values);
            }

            return this;
        }

        public com.android.aapt.Attribute.Builder clearSymbol() {
            if (this.symbolBuilder_ == null) {
                this.symbol_ = Collections.emptyList();
                this.bitField0_ &= -2;
                this.onChanged();
            } else {
                this.symbolBuilder_.clear();
            }

            return this;
        }

        public com.android.aapt.Attribute.Builder removeSymbol(int index) {
            if (this.symbolBuilder_ == null) {
                this.ensureSymbolIsMutable();
                this.symbol_.remove(index);
                this.onChanged();
            } else {
                this.symbolBuilder_.remove(index);
            }

            return this;
        }

        public com.android.aapt.Attribute.Symbol.Builder getSymbolBuilder(int index) {
            return (com.android.aapt.Attribute.Symbol.Builder)this.getSymbolFieldBuilder().getBuilder(index);
        }

        public com.android.aapt.Attribute.SymbolOrBuilder getSymbolOrBuilder(int index) {
            return this.symbolBuilder_ == null ? (com.android.aapt.Attribute.SymbolOrBuilder)this.symbol_.get(index) : (com.android.aapt.Attribute.SymbolOrBuilder)this.symbolBuilder_.getMessageOrBuilder(index);
        }

        public List<? extends com.android.aapt.Attribute.SymbolOrBuilder> getSymbolOrBuilderList() {
            return this.symbolBuilder_ != null ? this.symbolBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.symbol_);
        }

        public com.android.aapt.Attribute.Symbol.Builder addSymbolBuilder() {
            return (com.android.aapt.Attribute.Symbol.Builder)this.getSymbolFieldBuilder().addBuilder(com.android.aapt.Attribute.Symbol.getDefaultInstance());
        }

        public com.android.aapt.Attribute.Symbol.Builder addSymbolBuilder(int index) {
            return (com.android.aapt.Attribute.Symbol.Builder)this.getSymbolFieldBuilder().addBuilder(index, com.android.aapt.Attribute.Symbol.getDefaultInstance());
        }

        public List<com.android.aapt.Attribute.Symbol.Builder> getSymbolBuilderList() {
            return this.getSymbolFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<com.android.aapt.Attribute.Symbol, com.android.aapt.Attribute.Symbol.Builder, com.android.aapt.Attribute.SymbolOrBuilder> getSymbolFieldBuilder() {
            if (this.symbolBuilder_ == null) {
                this.symbolBuilder_ = new RepeatedFieldBuilderV3(this.symbol_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
                this.symbol_ = null;
            }

            return this.symbolBuilder_;
        }

        public final com.android.aapt.Attribute.Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (com.android.aapt.Attribute.Builder)super.setUnknownFields(unknownFields);
        }

        public final com.android.aapt.Attribute.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (com.android.aapt.Attribute.Builder)super.mergeUnknownFields(unknownFields);
        }
    }

    public static final class Symbol extends GeneratedMessageV3 implements com.android.aapt.Attribute.SymbolOrBuilder {
        private static final long serialVersionUID = 0L;
        public static final int SOURCE_FIELD_NUMBER = 1;
        private com.android.aapt.Source source_;
        public static final int COMMENT_FIELD_NUMBER = 2;
        private volatile Object comment_;
        public static final int NAME_FIELD_NUMBER = 3;
        private com.android.aapt.Reference name_;
        public static final int VALUE_FIELD_NUMBER = 4;
        private int value_;
        public static final int TYPE_FIELD_NUMBER = 5;
        private int type_;
        private byte memoizedIsInitialized;
        private static final com.android.aapt.Attribute.Symbol DEFAULT_INSTANCE = new com.android.aapt.Attribute.Symbol();
        private static final Parser<com.android.aapt.Attribute.Symbol> PARSER = new AbstractParser<com.android.aapt.Attribute.Symbol>() {
            public com.android.aapt.Attribute.Symbol parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new com.android.aapt.Attribute.Symbol(input, extensionRegistry);
            }
        };

        private Symbol(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private Symbol() {
            this.memoizedIsInitialized = -1;
            this.comment_ = "";
        }

        @Override
        public Object newInstance(UnusedPrivateParameter unused) {
            return new com.android.aapt.Attribute.Symbol();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Symbol(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            case 18:
                                java.lang.String s = input.readStringRequireUtf8();
                                this.comment_ = s;
                                break;
                            case 26:
                                com.android.aapt.Reference.Builder subBuilder2 = null;
                                if (this.name_ != null) {
                                    subBuilder2 = this.name_.toBuilder();
                                }

                                this.name_ = (com.android.aapt.Reference)input.readMessage(com.android.aapt.Reference.parser(), extensionRegistry);
                                if (subBuilder2 != null) {
                                    subBuilder2.mergeFrom(this.name_);
                                    this.name_ = subBuilder2.buildPartial();
                                }
                                break;
                            case 32:
                                this.value_ = input.readUInt32();
                                break;
                            case 40:
                                this.type_ = input.readUInt32();
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
            return Resources.internal_static_aapt_pb_Attribute_Symbol_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_Attribute_Symbol_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.Attribute.Symbol.class, com.android.aapt.Attribute.Symbol.Builder.class);
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

        public boolean hasName() {
            return this.name_ != null;
        }

        public com.android.aapt.Reference getName() {
            return this.name_ == null ? com.android.aapt.Reference.getDefaultInstance() : this.name_;
        }

        public com.android.aapt.ReferenceOrBuilder getNameOrBuilder() {
            return this.getName();
        }

        public int getValue() {
            return this.value_;
        }

        public int getType() {
            return this.type_;
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
            if (this.source_ != null) {
                output.writeMessage(1, this.getSource());
            }

            if (!this.getCommentBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 2, this.comment_);
            }

            if (this.name_ != null) {
                output.writeMessage(3, this.getName());
            }

            if (this.value_ != 0) {
                output.writeUInt32(4, this.value_);
            }

            if (this.type_ != 0) {
                output.writeUInt32(5, this.type_);
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
                if (this.source_ != null) {
                    size += CodedOutputStream.computeMessageSize(1, this.getSource());
                }

                if (!this.getCommentBytes().isEmpty()) {
                    size += GeneratedMessageV3.computeStringSize(2, this.comment_);
                }

                if (this.name_ != null) {
                    size += CodedOutputStream.computeMessageSize(3, this.getName());
                }

                if (this.value_ != 0) {
                    size += CodedOutputStream.computeUInt32Size(4, this.value_);
                }

                if (this.type_ != 0) {
                    size += CodedOutputStream.computeUInt32Size(5, this.type_);
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
            } else if (!(obj instanceof com.android.aapt.Attribute.Symbol)) {
                return super.equals(obj);
            } else {
                com.android.aapt.Attribute.Symbol other = (com.android.aapt.Attribute.Symbol)obj;
                if (this.hasSource() != other.hasSource()) {
                    return false;
                } else if (this.hasSource() && !this.getSource().equals(other.getSource())) {
                    return false;
                } else if (!this.getComment().equals(other.getComment())) {
                    return false;
                } else if (this.hasName() != other.hasName()) {
                    return false;
                } else if (this.hasName() && !this.getName().equals(other.getName())) {
                    return false;
                } else if (this.getValue() != other.getValue()) {
                    return false;
                } else if (this.getType() != other.getType()) {
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
                if (this.hasSource()) {
                    hash = 37 * hash + 1;
                    hash = 53 * hash + this.getSource().hashCode();
                }

                hash = 37 * hash + 2;
                hash = 53 * hash + this.getComment().hashCode();
                if (this.hasName()) {
                    hash = 37 * hash + 3;
                    hash = 53 * hash + this.getName().hashCode();
                }

                hash = 37 * hash + 4;
                hash = 53 * hash + this.getValue();
                hash = 37 * hash + 5;
                hash = 53 * hash + this.getType();
                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static com.android.aapt.Attribute.Symbol parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Attribute.Symbol)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Attribute.Symbol parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Attribute.Symbol)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Attribute.Symbol parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Attribute.Symbol)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Attribute.Symbol parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Attribute.Symbol)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Attribute.Symbol parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (com.android.aapt.Attribute.Symbol)PARSER.parseFrom(data);
        }

        public static com.android.aapt.Attribute.Symbol parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.Attribute.Symbol)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.Attribute.Symbol parseFrom(InputStream input) throws IOException {
            return (com.android.aapt.Attribute.Symbol)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.Attribute.Symbol parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Attribute.Symbol)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.Attribute.Symbol parseDelimitedFrom(InputStream input) throws IOException {
            return (com.android.aapt.Attribute.Symbol)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static com.android.aapt.Attribute.Symbol parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Attribute.Symbol)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.Attribute.Symbol parseFrom(CodedInputStream input) throws IOException {
            return (com.android.aapt.Attribute.Symbol)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.Attribute.Symbol parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.Attribute.Symbol)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public com.android.aapt.Attribute.Symbol.Builder newBuilderForType() {
            return newBuilder();
        }

        public static com.android.aapt.Attribute.Symbol.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static com.android.aapt.Attribute.Symbol.Builder newBuilder(com.android.aapt.Attribute.Symbol prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public com.android.aapt.Attribute.Symbol.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new com.android.aapt.Attribute.Symbol.Builder() : (new com.android.aapt.Attribute.Symbol.Builder()).mergeFrom(this);
        }

        public com.android.aapt.Attribute.Symbol.Builder newBuilderForType(BuilderParent parent) {
            com.android.aapt.Attribute.Symbol.Builder builder = new com.android.aapt.Attribute.Symbol.Builder(parent);
            return builder;
        }

        public static com.android.aapt.Attribute.Symbol getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<com.android.aapt.Attribute.Symbol> parser() {
            return PARSER;
        }

        public Parser<com.android.aapt.Attribute.Symbol> getParserForType() {
            return PARSER;
        }

        public com.android.aapt.Attribute.Symbol getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.Attribute.Symbol.Builder> implements com.android.aapt.Attribute.SymbolOrBuilder {
            private com.android.aapt.Source source_;
            private SingleFieldBuilderV3<com.android.aapt.Source, com.android.aapt.Source.Builder, com.android.aapt.SourceOrBuilder> sourceBuilder_;
            private Object comment_;
            private com.android.aapt.Reference name_;
            private SingleFieldBuilderV3<com.android.aapt.Reference, com.android.aapt.Reference.Builder, com.android.aapt.ReferenceOrBuilder> nameBuilder_;
            private int value_;
            private int type_;

            public static Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_Attribute_Symbol_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_Attribute_Symbol_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.Attribute.Symbol.class, com.android.aapt.Attribute.Symbol.Builder.class);
            }

            private Builder() {
                this.comment_ = "";
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.comment_ = "";
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.android.aapt.Attribute.Symbol.alwaysUseFieldBuilders) {
                }

            }

            public com.android.aapt.Attribute.Symbol.Builder clear() {
                super.clear();
                if (this.sourceBuilder_ == null) {
                    this.source_ = null;
                } else {
                    this.source_ = null;
                    this.sourceBuilder_ = null;
                }

                this.comment_ = "";
                if (this.nameBuilder_ == null) {
                    this.name_ = null;
                } else {
                    this.name_ = null;
                    this.nameBuilder_ = null;
                }

                this.value_ = 0;
                this.type_ = 0;
                return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Resources.internal_static_aapt_pb_Attribute_Symbol_descriptor;
            }

            public com.android.aapt.Attribute.Symbol getDefaultInstanceForType() {
                return com.android.aapt.Attribute.Symbol.getDefaultInstance();
            }

            public com.android.aapt.Attribute.Symbol build() {
                com.android.aapt.Attribute.Symbol result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public com.android.aapt.Attribute.Symbol buildPartial() {
                com.android.aapt.Attribute.Symbol result = new com.android.aapt.Attribute.Symbol(this);
                if (this.sourceBuilder_ == null) {
                    result.source_ = this.source_;
                } else {
                    result.source_ = (com.android.aapt.Source)this.sourceBuilder_.build();
                }

                result.comment_ = this.comment_;
                if (this.nameBuilder_ == null) {
                    result.name_ = this.name_;
                } else {
                    result.name_ = (com.android.aapt.Reference)this.nameBuilder_.build();
                }

                result.value_ = this.value_;
                result.type_ = this.type_;
                this.onBuilt();
                return result;
            }

            public com.android.aapt.Attribute.Symbol.Builder clone() {
                return (com.android.aapt.Attribute.Symbol.Builder)super.clone();
            }

            public com.android.aapt.Attribute.Symbol.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.Attribute.Symbol.Builder)super.setField(field, value);
            }

            public com.android.aapt.Attribute.Symbol.Builder clearField(Descriptors.FieldDescriptor field) {
                return (com.android.aapt.Attribute.Symbol.Builder)super.clearField(field);
            }

            public com.android.aapt.Attribute.Symbol.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (com.android.aapt.Attribute.Symbol.Builder)super.clearOneof(oneof);
            }

            public com.android.aapt.Attribute.Symbol.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (com.android.aapt.Attribute.Symbol.Builder)super.setRepeatedField(field, index, value);
            }

            public com.android.aapt.Attribute.Symbol.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.Attribute.Symbol.Builder)super.addRepeatedField(field, value);
            }

            public com.android.aapt.Attribute.Symbol.Builder mergeFrom(Message other) {
                if (other instanceof com.android.aapt.Attribute.Symbol) {
                    return this.mergeFrom((com.android.aapt.Attribute.Symbol)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public com.android.aapt.Attribute.Symbol.Builder mergeFrom(com.android.aapt.Attribute.Symbol other) {
                if (other == com.android.aapt.Attribute.Symbol.getDefaultInstance()) {
                    return this;
                } else {
                    if (other.hasSource()) {
                        this.mergeSource(other.getSource());
                    }

                    if (!other.getComment().isEmpty()) {
                        this.comment_ = other.comment_;
                        this.onChanged();
                    }

                    if (other.hasName()) {
                        this.mergeName(other.getName());
                    }

                    if (other.getValue() != 0) {
                        this.setValue(other.getValue());
                    }

                    if (other.getType() != 0) {
                        this.setType(other.getType());
                    }

                    this.mergeUnknownFields(other.unknownFields);
                    this.onChanged();
                    return this;
                }
            }

            public final boolean isInitialized() {
                return true;
            }

            public com.android.aapt.Attribute.Symbol.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                com.android.aapt.Attribute.Symbol parsedMessage = null;

                try {
                    parsedMessage = (com.android.aapt.Attribute.Symbol)com.android.aapt.Attribute.Symbol.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (com.android.aapt.Attribute.Symbol)var8.getUnfinishedMessage();
                    throw var8.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }

                }

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

            public com.android.aapt.Attribute.Symbol.Builder setSource(com.android.aapt.Source value) {
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

            public com.android.aapt.Attribute.Symbol.Builder setSource(com.android.aapt.Source.Builder builderForValue) {
                if (this.sourceBuilder_ == null) {
                    this.source_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.sourceBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.Attribute.Symbol.Builder mergeSource(com.android.aapt.Source value) {
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

            public com.android.aapt.Attribute.Symbol.Builder clearSource() {
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

            public com.android.aapt.Attribute.Symbol.Builder setComment(java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.comment_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public com.android.aapt.Attribute.Symbol.Builder clearComment() {
                this.comment_ = com.android.aapt.Attribute.Symbol.getDefaultInstance().getComment();
                this.onChanged();
                return this;
            }

            public com.android.aapt.Attribute.Symbol.Builder setCommentBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    com.android.aapt.Attribute.Symbol.checkByteStringIsUtf8(value);
                    this.comment_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public boolean hasName() {
                return this.nameBuilder_ != null || this.name_ != null;
            }

            public com.android.aapt.Reference getName() {
                if (this.nameBuilder_ == null) {
                    return this.name_ == null ? com.android.aapt.Reference.getDefaultInstance() : this.name_;
                } else {
                    return (com.android.aapt.Reference)this.nameBuilder_.getMessage();
                }
            }

            public com.android.aapt.Attribute.Symbol.Builder setName(com.android.aapt.Reference value) {
                if (this.nameBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.name_ = value;
                    this.onChanged();
                } else {
                    this.nameBuilder_.setMessage(value);
                }

                return this;
            }

            public com.android.aapt.Attribute.Symbol.Builder setName(com.android.aapt.Reference.Builder builderForValue) {
                if (this.nameBuilder_ == null) {
                    this.name_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.nameBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.Attribute.Symbol.Builder mergeName(com.android.aapt.Reference value) {
                if (this.nameBuilder_ == null) {
                    if (this.name_ != null) {
                        this.name_ = com.android.aapt.Reference.newBuilder(this.name_).mergeFrom(value).buildPartial();
                    } else {
                        this.name_ = value;
                    }

                    this.onChanged();
                } else {
                    this.nameBuilder_.mergeFrom(value);
                }

                return this;
            }

            public com.android.aapt.Attribute.Symbol.Builder clearName() {
                if (this.nameBuilder_ == null) {
                    this.name_ = null;
                    this.onChanged();
                } else {
                    this.name_ = null;
                    this.nameBuilder_ = null;
                }

                return this;
            }

            public com.android.aapt.Reference.Builder getNameBuilder() {
                this.onChanged();
                return (com.android.aapt.Reference.Builder)this.getNameFieldBuilder().getBuilder();
            }

            public com.android.aapt.ReferenceOrBuilder getNameOrBuilder() {
                if (this.nameBuilder_ != null) {
                    return (com.android.aapt.ReferenceOrBuilder)this.nameBuilder_.getMessageOrBuilder();
                } else {
                    return this.name_ == null ? com.android.aapt.Reference.getDefaultInstance() : this.name_;
                }
            }

            private SingleFieldBuilderV3<com.android.aapt.Reference, com.android.aapt.Reference.Builder, com.android.aapt.ReferenceOrBuilder> getNameFieldBuilder() {
                if (this.nameBuilder_ == null) {
                    this.nameBuilder_ = new SingleFieldBuilderV3(this.getName(), this.getParentForChildren(), this.isClean());
                    this.name_ = null;
                }

                return this.nameBuilder_;
            }

            public int getValue() {
                return this.value_;
            }

            public com.android.aapt.Attribute.Symbol.Builder setValue(int value) {
                this.value_ = value;
                this.onChanged();
                return this;
            }

            public com.android.aapt.Attribute.Symbol.Builder clearValue() {
                this.value_ = 0;
                this.onChanged();
                return this;
            }

            public int getType() {
                return this.type_;
            }

            public com.android.aapt.Attribute.Symbol.Builder setType(int value) {
                this.type_ = value;
                this.onChanged();
                return this;
            }

            public com.android.aapt.Attribute.Symbol.Builder clearType() {
                this.type_ = 0;
                this.onChanged();
                return this;
            }

            public final com.android.aapt.Attribute.Symbol.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.Attribute.Symbol.Builder)super.setUnknownFields(unknownFields);
            }

            public final com.android.aapt.Attribute.Symbol.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.Attribute.Symbol.Builder)super.mergeUnknownFields(unknownFields);
            }
        }
    }

    public interface SymbolOrBuilder extends MessageOrBuilder {
        boolean hasSource();

        com.android.aapt.Source getSource();

        com.android.aapt.SourceOrBuilder getSourceOrBuilder();

        java.lang.String getComment();

        ByteString getCommentBytes();

        boolean hasName();

        com.android.aapt.Reference getName();

        com.android.aapt.ReferenceOrBuilder getNameOrBuilder();

        int getValue();

        int getType();
    }

    public enum FormatFlags implements ProtocolMessageEnum {
        NONE(0x00000000),
        ANY(0x0000FFFF),
        REFERENCE(0x00000001),
        STRING(0x00000002),
        INTEGER(0x00000004),
        BOOLEAN(0x00000008),
        COLOR(0x00000010),
        FLOAT(0x00000020),
        DIMENSION(0x00000040),
        FRACTION(0x00000080),
        ENUM(0x00010000),
        FLAGS(0x00020000),
        UNRECOGNIZED(-1);

        public static final int NONE_VALUE = 0x00000000;
        public static final int ANY_VALUE = 0x0000FFFF;
        public static final int REFERENCE_VALUE = 0x00000001;
        public static final int STRING_VALUE = 0x00000002;
        public static final int INTEGER_VALUE = 0x00000004;
        public static final int BOOLEAN_VALUE = 0x00000008;
        public static final int COLOR_VALUE = 0x00000010;
        public static final int FLOAT_VALUE = 0x00000020;
        public static final int DIMENSION_VALUE = 0x00000040;
        public static final int FRACTION_VALUE = 0x00000080;
        public static final int ENUM_VALUE = 0x00010000;
        public static final int FLAGS_VALUE = 0x00020000;
        private static final Internal.EnumLiteMap<FormatFlags> internalValueMap = new Internal.EnumLiteMap<FormatFlags>() {
            public com.android.aapt.Attribute.FormatFlags findValueByNumber(int number) {
                return com.android.aapt.Attribute.FormatFlags.forNumber(number);
            }
        };
        private static final com.android.aapt.Attribute.FormatFlags[] VALUES = values();
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
        public static com.android.aapt.Attribute.FormatFlags valueOf(int value) {
            return forNumber(value);
        }

        public static com.android.aapt.Attribute.FormatFlags forNumber(int value) {
            switch(value) {
                case NONE_VALUE:
                    return NONE;
                case REFERENCE_VALUE:
                    return REFERENCE;
                case STRING_VALUE:
                    return STRING;
                case INTEGER_VALUE:
                    return INTEGER;
                case BOOLEAN_VALUE:
                    return BOOLEAN;
                case COLOR_VALUE:
                    return COLOR;
                case FLOAT_VALUE:
                    return FLOAT;
                case DIMENSION_VALUE:
                    return DIMENSION;
                case FRACTION_VALUE:
                    return FRACTION;
                case ANY_VALUE:
                    return ANY;
                case ENUM_VALUE:
                    return ENUM;
                case FLAGS_VALUE:
                    return FLAGS;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<FormatFlags> internalGetValueMap() {
            return internalValueMap;
        }

        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
        }

        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return (Descriptors.EnumDescriptor)com.android.aapt.Attribute.getDescriptor().getEnumTypes().get(0);
        }

        public static com.android.aapt.Attribute.FormatFlags valueOf(Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            } else {
                return desc.getIndex() == -1 ? UNRECOGNIZED : VALUES[desc.getIndex()];
            }
        }

        private FormatFlags(int value) {
            this.value = value;
        }
    }
}