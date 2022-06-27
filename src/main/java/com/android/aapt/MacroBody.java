package com.android.aapt;

import com.google.protobuf.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MacroBody extends GeneratedMessageV3 implements com.android.aapt.MacroBodyOrBuilder {
        private static final long serialVersionUID = 0L;
        public static final int RAW_STRING_FIELD_NUMBER = 1;
        private volatile Object rawString_;
        public static final int STYLE_STRING_FIELD_NUMBER = 2;
        private com.android.aapt.StyleString styleString_;
        public static final int UNTRANSLATABLE_SECTIONS_FIELD_NUMBER = 3;
        private List<com.android.aapt.UntranslatableSection> untranslatableSections_;
        public static final int NAMESPACE_STACK_FIELD_NUMBER = 4;
        private List<com.android.aapt.NamespaceAlias> namespaceStack_;
        public static final int SOURCE_FIELD_NUMBER = 5;
        private com.android.aapt.SourcePosition source_;
        private byte memoizedIsInitialized;
        private static final com.android.aapt.MacroBody DEFAULT_INSTANCE = new com.android.aapt.MacroBody();
        private static final Parser<com.android.aapt.MacroBody> PARSER = new AbstractParser<com.android.aapt.MacroBody>() {
            public com.android.aapt.MacroBody parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new com.android.aapt.MacroBody(input, extensionRegistry);
            }
        };

        private MacroBody(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private MacroBody() {
            this.memoizedIsInitialized = -1;
            this.rawString_ = "";
            this.untranslatableSections_ = Collections.emptyList();
            this.namespaceStack_ = Collections.emptyList();
        }

        @Override
        public Object newInstance(UnusedPrivateParameter unused) {
            return new com.android.aapt.MacroBody();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private MacroBody(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        switch(tag) {
                            case 0:
                                done = true;
                                break;
                            case 10:
                                java.lang.String s = input.readStringRequireUtf8();
                                this.rawString_ = s;
                                break;
                            case 18:
                                com.android.aapt.StyleString.Builder subBuilder = null;
                                if (this.styleString_ != null) {
                                    subBuilder = this.styleString_.toBuilder();
                                }

                                this.styleString_ = (com.android.aapt.StyleString)input.readMessage(com.android.aapt.StyleString.parser(), extensionRegistry);
                                if (subBuilder != null) {
                                    subBuilder.mergeFrom(this.styleString_);
                                    this.styleString_ = subBuilder.buildPartial();
                                }
                                break;
                            case 26:
                                if ((mutable_bitField0_ & 1) == 0) {
                                    this.untranslatableSections_ = new ArrayList();
                                    mutable_bitField0_ |= 1;
                                }

                                this.untranslatableSections_.add((com.android.aapt.UntranslatableSection)input.readMessage(com.android.aapt.UntranslatableSection.parser(), extensionRegistry));
                                break;
                            case 34:
                                if ((mutable_bitField0_ & 2) == 0) {
                                    this.namespaceStack_ = new ArrayList();
                                    mutable_bitField0_ |= 2;
                                }

                                this.namespaceStack_.add((com.android.aapt.NamespaceAlias)input.readMessage(com.android.aapt.NamespaceAlias.parser(), extensionRegistry));
                                break;
                            case 42:
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
                } catch (InvalidProtocolBufferException var12) {
                    throw var12.setUnfinishedMessage(this);
                } catch (IOException var13) {
                    throw (new InvalidProtocolBufferException(var13)).setUnfinishedMessage(this);
                } finally {
                    if ((mutable_bitField0_ & 1) != 0) {
                        this.untranslatableSections_ = Collections.unmodifiableList(this.untranslatableSections_);
                    }

                    if ((mutable_bitField0_ & 2) != 0) {
                        this.namespaceStack_ = Collections.unmodifiableList(this.namespaceStack_);
                    }

                    this.unknownFields = unknownFields.build();
                    this.makeExtensionsImmutable();
                }

            }
        }

        public static Descriptors.Descriptor getDescriptor() {
            return Resources.internal_static_aapt_pb_MacroBody_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return Resources.internal_static_aapt_pb_MacroBody_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.MacroBody.class, com.android.aapt.MacroBody.Builder.class);
        }

        public java.lang.String getRawString() {
            Object ref = this.rawString_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String)ref;
            } else {
                ByteString bs = (ByteString)ref;
                java.lang.String s = bs.toStringUtf8();
                this.rawString_ = s;
                return s;
            }
        }

        public ByteString getRawStringBytes() {
            Object ref = this.rawString_;
            if (ref instanceof java.lang.String) {
                ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                this.rawString_ = b;
                return b;
            } else {
                return (ByteString)ref;
            }
        }

        public boolean hasStyleString() {
            return this.styleString_ != null;
        }

        public com.android.aapt.StyleString getStyleString() {
            return this.styleString_ == null ? com.android.aapt.StyleString.getDefaultInstance() : this.styleString_;
        }

        public com.android.aapt.StyleStringOrBuilder getStyleStringOrBuilder() {
            return this.getStyleString();
        }

        public List<com.android.aapt.UntranslatableSection> getUntranslatableSectionsList() {
            return this.untranslatableSections_;
        }

        public List<? extends com.android.aapt.UntranslatableSectionOrBuilder> getUntranslatableSectionsOrBuilderList() {
            return this.untranslatableSections_;
        }

        public int getUntranslatableSectionsCount() {
            return this.untranslatableSections_.size();
        }

        public com.android.aapt.UntranslatableSection getUntranslatableSections(int index) {
            return (com.android.aapt.UntranslatableSection)this.untranslatableSections_.get(index);
        }

        public com.android.aapt.UntranslatableSectionOrBuilder getUntranslatableSectionsOrBuilder(int index) {
            return (com.android.aapt.UntranslatableSectionOrBuilder)this.untranslatableSections_.get(index);
        }

        public List<com.android.aapt.NamespaceAlias> getNamespaceStackList() {
            return this.namespaceStack_;
        }

        public List<? extends com.android.aapt.NamespaceAliasOrBuilder> getNamespaceStackOrBuilderList() {
            return this.namespaceStack_;
        }

        public int getNamespaceStackCount() {
            return this.namespaceStack_.size();
        }

        public com.android.aapt.NamespaceAlias getNamespaceStack(int index) {
            return (com.android.aapt.NamespaceAlias)this.namespaceStack_.get(index);
        }

        public com.android.aapt.NamespaceAliasOrBuilder getNamespaceStackOrBuilder(int index) {
            return (com.android.aapt.NamespaceAliasOrBuilder)this.namespaceStack_.get(index);
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
            if (!this.getRawStringBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 1, this.rawString_);
            }

            if (this.styleString_ != null) {
                output.writeMessage(2, this.getStyleString());
            }

            int i;
            for(i = 0; i < this.untranslatableSections_.size(); ++i) {
                output.writeMessage(3, (MessageLite)this.untranslatableSections_.get(i));
            }

            for(i = 0; i < this.namespaceStack_.size(); ++i) {
                output.writeMessage(4, (MessageLite)this.namespaceStack_.get(i));
            }

            if (this.source_ != null) {
                output.writeMessage(5, this.getSource());
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
                if (!this.getRawStringBytes().isEmpty()) {
                    size += GeneratedMessageV3.computeStringSize(1, this.rawString_);
                }

                if (this.styleString_ != null) {
                    size += CodedOutputStream.computeMessageSize(2, this.getStyleString());
                }

                int i;
                for(i = 0; i < this.untranslatableSections_.size(); ++i) {
                    size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.untranslatableSections_.get(i));
                }

                for(i = 0; i < this.namespaceStack_.size(); ++i) {
                    size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.namespaceStack_.get(i));
                }

                if (this.source_ != null) {
                    size += CodedOutputStream.computeMessageSize(5, this.getSource());
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
            } else if (!(obj instanceof com.android.aapt.MacroBody)) {
                return super.equals(obj);
            } else {
                com.android.aapt.MacroBody other = (com.android.aapt.MacroBody)obj;
                if (!this.getRawString().equals(other.getRawString())) {
                    return false;
                } else if (this.hasStyleString() != other.hasStyleString()) {
                    return false;
                } else if (this.hasStyleString() && !this.getStyleString().equals(other.getStyleString())) {
                    return false;
                } else if (!this.getUntranslatableSectionsList().equals(other.getUntranslatableSectionsList())) {
                    return false;
                } else if (!this.getNamespaceStackList().equals(other.getNamespaceStackList())) {
                    return false;
                } else if (this.hasSource() != other.hasSource()) {
                    return false;
                } else if (this.hasSource() && !this.getSource().equals(other.getSource())) {
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
                hash = 53 * hash + this.getRawString().hashCode();
                if (this.hasStyleString()) {
                    hash = 37 * hash + 2;
                    hash = 53 * hash + this.getStyleString().hashCode();
                }

                if (this.getUntranslatableSectionsCount() > 0) {
                    hash = 37 * hash + 3;
                    hash = 53 * hash + this.getUntranslatableSectionsList().hashCode();
                }

                if (this.getNamespaceStackCount() > 0) {
                    hash = 37 * hash + 4;
                    hash = 53 * hash + this.getNamespaceStackList().hashCode();
                }

                if (this.hasSource()) {
                    hash = 37 * hash + 5;
                    hash = 53 * hash + this.getSource().hashCode();
                }

                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static com.android.aapt.MacroBody parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (com.android.aapt.MacroBody)PARSER.parseFrom(data);
        }

        public static com.android.aapt.MacroBody parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.MacroBody)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.MacroBody parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (com.android.aapt.MacroBody)PARSER.parseFrom(data);
        }

        public static com.android.aapt.MacroBody parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.MacroBody)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.MacroBody parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (com.android.aapt.MacroBody)PARSER.parseFrom(data);
        }

        public static com.android.aapt.MacroBody parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (com.android.aapt.MacroBody)PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.android.aapt.MacroBody parseFrom(InputStream input) throws IOException {
            return (com.android.aapt.MacroBody)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.MacroBody parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.MacroBody)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.MacroBody parseDelimitedFrom(InputStream input) throws IOException {
            return (com.android.aapt.MacroBody)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static com.android.aapt.MacroBody parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.MacroBody)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.android.aapt.MacroBody parseFrom(CodedInputStream input) throws IOException {
            return (com.android.aapt.MacroBody)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static com.android.aapt.MacroBody parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (com.android.aapt.MacroBody)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public com.android.aapt.MacroBody.Builder newBuilderForType() {
            return newBuilder();
        }

        public static com.android.aapt.MacroBody.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static com.android.aapt.MacroBody.Builder newBuilder(com.android.aapt.MacroBody prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public com.android.aapt.MacroBody.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new com.android.aapt.MacroBody.Builder() : (new com.android.aapt.MacroBody.Builder()).mergeFrom(this);
        }

        public com.android.aapt.MacroBody.Builder newBuilderForType(BuilderParent parent) {
            com.android.aapt.MacroBody.Builder builder = new com.android.aapt.MacroBody.Builder(parent);
            return builder;
        }

        public static com.android.aapt.MacroBody getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<com.android.aapt.MacroBody> parser() {
            return PARSER;
        }

        public Parser<com.android.aapt.MacroBody> getParserForType() {
            return PARSER;
        }

        public com.android.aapt.MacroBody getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<com.android.aapt.MacroBody.Builder> implements com.android.aapt.MacroBodyOrBuilder {
            private int bitField0_;
            private Object rawString_;
            private com.android.aapt.StyleString styleString_;
            private SingleFieldBuilderV3<com.android.aapt.StyleString, com.android.aapt.StyleString.Builder, com.android.aapt.StyleStringOrBuilder> styleStringBuilder_;
            private List<com.android.aapt.UntranslatableSection> untranslatableSections_;
            private RepeatedFieldBuilderV3<com.android.aapt.UntranslatableSection, com.android.aapt.UntranslatableSection.Builder, com.android.aapt.UntranslatableSectionOrBuilder> untranslatableSectionsBuilder_;
            private List<com.android.aapt.NamespaceAlias> namespaceStack_;
            private RepeatedFieldBuilderV3<com.android.aapt.NamespaceAlias, com.android.aapt.NamespaceAlias.Builder, com.android.aapt.NamespaceAliasOrBuilder> namespaceStackBuilder_;
            private com.android.aapt.SourcePosition source_;
            private SingleFieldBuilderV3<com.android.aapt.SourcePosition, com.android.aapt.SourcePosition.Builder, com.android.aapt.SourcePositionOrBuilder> sourceBuilder_;

            public static Descriptors.Descriptor getDescriptor() {
                return Resources.internal_static_aapt_pb_MacroBody_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return Resources.internal_static_aapt_pb_MacroBody_fieldAccessorTable.ensureFieldAccessorsInitialized(com.android.aapt.MacroBody.class, com.android.aapt.MacroBody.Builder.class);
            }

            private Builder() {
                this.rawString_ = "";
                this.untranslatableSections_ = Collections.emptyList();
                this.namespaceStack_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.rawString_ = "";
                this.untranslatableSections_ = Collections.emptyList();
                this.namespaceStack_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.android.aapt.MacroBody.alwaysUseFieldBuilders) {
                    this.getUntranslatableSectionsFieldBuilder();
                    this.getNamespaceStackFieldBuilder();
                }

            }

            public com.android.aapt.MacroBody.Builder clear() {
                super.clear();
                this.rawString_ = "";
                if (this.styleStringBuilder_ == null) {
                    this.styleString_ = null;
                } else {
                    this.styleString_ = null;
                    this.styleStringBuilder_ = null;
                }

                if (this.untranslatableSectionsBuilder_ == null) {
                    this.untranslatableSections_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    this.untranslatableSectionsBuilder_.clear();
                }

                if (this.namespaceStackBuilder_ == null) {
                    this.namespaceStack_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                } else {
                    this.namespaceStackBuilder_.clear();
                }

                if (this.sourceBuilder_ == null) {
                    this.source_ = null;
                } else {
                    this.source_ = null;
                    this.sourceBuilder_ = null;
                }

                return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Resources.internal_static_aapt_pb_MacroBody_descriptor;
            }

            public com.android.aapt.MacroBody getDefaultInstanceForType() {
                return com.android.aapt.MacroBody.getDefaultInstance();
            }

            public com.android.aapt.MacroBody build() {
                com.android.aapt.MacroBody result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public com.android.aapt.MacroBody buildPartial() {
                com.android.aapt.MacroBody result = new com.android.aapt.MacroBody(this);
                int from_bitField0_ = this.bitField0_;
                result.rawString_ = this.rawString_;
                if (this.styleStringBuilder_ == null) {
                    result.styleString_ = this.styleString_;
                } else {
                    result.styleString_ = (com.android.aapt.StyleString)this.styleStringBuilder_.build();
                }

                if (this.untranslatableSectionsBuilder_ == null) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.untranslatableSections_ = Collections.unmodifiableList(this.untranslatableSections_);
                        this.bitField0_ &= -2;
                    }

                    result.untranslatableSections_ = this.untranslatableSections_;
                } else {
                    result.untranslatableSections_ = this.untranslatableSectionsBuilder_.build();
                }

                if (this.namespaceStackBuilder_ == null) {
                    if ((this.bitField0_ & 2) != 0) {
                        this.namespaceStack_ = Collections.unmodifiableList(this.namespaceStack_);
                        this.bitField0_ &= -3;
                    }

                    result.namespaceStack_ = this.namespaceStack_;
                } else {
                    result.namespaceStack_ = this.namespaceStackBuilder_.build();
                }

                if (this.sourceBuilder_ == null) {
                    result.source_ = this.source_;
                } else {
                    result.source_ = (com.android.aapt.SourcePosition)this.sourceBuilder_.build();
                }

                this.onBuilt();
                return result;
            }

            public com.android.aapt.MacroBody.Builder clone() {
                return (com.android.aapt.MacroBody.Builder)super.clone();
            }

            public com.android.aapt.MacroBody.Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.MacroBody.Builder)super.setField(field, value);
            }

            public com.android.aapt.MacroBody.Builder clearField(Descriptors.FieldDescriptor field) {
                return (com.android.aapt.MacroBody.Builder)super.clearField(field);
            }

            public com.android.aapt.MacroBody.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (com.android.aapt.MacroBody.Builder)super.clearOneof(oneof);
            }

            public com.android.aapt.MacroBody.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (com.android.aapt.MacroBody.Builder)super.setRepeatedField(field, index, value);
            }

            public com.android.aapt.MacroBody.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (com.android.aapt.MacroBody.Builder)super.addRepeatedField(field, value);
            }

            public com.android.aapt.MacroBody.Builder mergeFrom(Message other) {
                if (other instanceof com.android.aapt.MacroBody) {
                    return this.mergeFrom((com.android.aapt.MacroBody)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public com.android.aapt.MacroBody.Builder mergeFrom(com.android.aapt.MacroBody other) {
                if (other == com.android.aapt.MacroBody.getDefaultInstance()) {
                    return this;
                } else {
                    if (!other.getRawString().isEmpty()) {
                        this.rawString_ = other.rawString_;
                        this.onChanged();
                    }

                    if (other.hasStyleString()) {
                        this.mergeStyleString(other.getStyleString());
                    }

                    if (this.untranslatableSectionsBuilder_ == null) {
                        if (!other.untranslatableSections_.isEmpty()) {
                            if (this.untranslatableSections_.isEmpty()) {
                                this.untranslatableSections_ = other.untranslatableSections_;
                                this.bitField0_ &= -2;
                            } else {
                                this.ensureUntranslatableSectionsIsMutable();
                                this.untranslatableSections_.addAll(other.untranslatableSections_);
                            }

                            this.onChanged();
                        }
                    } else if (!other.untranslatableSections_.isEmpty()) {
                        if (this.untranslatableSectionsBuilder_.isEmpty()) {
                            this.untranslatableSectionsBuilder_.dispose();
                            this.untranslatableSectionsBuilder_ = null;
                            this.untranslatableSections_ = other.untranslatableSections_;
                            this.bitField0_ &= -2;
                            this.untranslatableSectionsBuilder_ = com.android.aapt.MacroBody.alwaysUseFieldBuilders ? this.getUntranslatableSectionsFieldBuilder() : null;
                        } else {
                            this.untranslatableSectionsBuilder_.addAllMessages(other.untranslatableSections_);
                        }
                    }

                    if (this.namespaceStackBuilder_ == null) {
                        if (!other.namespaceStack_.isEmpty()) {
                            if (this.namespaceStack_.isEmpty()) {
                                this.namespaceStack_ = other.namespaceStack_;
                                this.bitField0_ &= -3;
                            } else {
                                this.ensureNamespaceStackIsMutable();
                                this.namespaceStack_.addAll(other.namespaceStack_);
                            }

                            this.onChanged();
                        }
                    } else if (!other.namespaceStack_.isEmpty()) {
                        if (this.namespaceStackBuilder_.isEmpty()) {
                            this.namespaceStackBuilder_.dispose();
                            this.namespaceStackBuilder_ = null;
                            this.namespaceStack_ = other.namespaceStack_;
                            this.bitField0_ &= -3;
                            this.namespaceStackBuilder_ = com.android.aapt.MacroBody.alwaysUseFieldBuilders ? this.getNamespaceStackFieldBuilder() : null;
                        } else {
                            this.namespaceStackBuilder_.addAllMessages(other.namespaceStack_);
                        }
                    }

                    if (other.hasSource()) {
                        this.mergeSource(other.getSource());
                    }

                    this.mergeUnknownFields(other.unknownFields);
                    this.onChanged();
                    return this;
                }
            }

            public final boolean isInitialized() {
                return true;
            }

            public com.android.aapt.MacroBody.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                com.android.aapt.MacroBody parsedMessage = null;

                try {
                    parsedMessage = (com.android.aapt.MacroBody)com.android.aapt.MacroBody.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (com.android.aapt.MacroBody)var8.getUnfinishedMessage();
                    throw var8.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }

                }

                return this;
            }

            public java.lang.String getRawString() {
                Object ref = this.rawString_;
                if (!(ref instanceof java.lang.String)) {
                    ByteString bs = (ByteString)ref;
                    java.lang.String s = bs.toStringUtf8();
                    this.rawString_ = s;
                    return s;
                } else {
                    return (java.lang.String)ref;
                }
            }

            public ByteString getRawStringBytes() {
                Object ref = this.rawString_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                    this.rawString_ = b;
                    return b;
                } else {
                    return (ByteString)ref;
                }
            }

            public com.android.aapt.MacroBody.Builder setRawString(java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.rawString_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public com.android.aapt.MacroBody.Builder clearRawString() {
                this.rawString_ = com.android.aapt.MacroBody.getDefaultInstance().getRawString();
                this.onChanged();
                return this;
            }

            public com.android.aapt.MacroBody.Builder setRawStringBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    com.android.aapt.MacroBody.checkByteStringIsUtf8(value);
                    this.rawString_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public boolean hasStyleString() {
                return this.styleStringBuilder_ != null || this.styleString_ != null;
            }

            public com.android.aapt.StyleString getStyleString() {
                if (this.styleStringBuilder_ == null) {
                    return this.styleString_ == null ? com.android.aapt.StyleString.getDefaultInstance() : this.styleString_;
                } else {
                    return (com.android.aapt.StyleString)this.styleStringBuilder_.getMessage();
                }
            }

            public com.android.aapt.MacroBody.Builder setStyleString(com.android.aapt.StyleString value) {
                if (this.styleStringBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.styleString_ = value;
                    this.onChanged();
                } else {
                    this.styleStringBuilder_.setMessage(value);
                }

                return this;
            }

            public com.android.aapt.MacroBody.Builder setStyleString(com.android.aapt.StyleString.Builder builderForValue) {
                if (this.styleStringBuilder_ == null) {
                    this.styleString_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.styleStringBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.MacroBody.Builder mergeStyleString(com.android.aapt.StyleString value) {
                if (this.styleStringBuilder_ == null) {
                    if (this.styleString_ != null) {
                        this.styleString_ = com.android.aapt.StyleString.newBuilder(this.styleString_).mergeFrom(value).buildPartial();
                    } else {
                        this.styleString_ = value;
                    }

                    this.onChanged();
                } else {
                    this.styleStringBuilder_.mergeFrom(value);
                }

                return this;
            }

            public com.android.aapt.MacroBody.Builder clearStyleString() {
                if (this.styleStringBuilder_ == null) {
                    this.styleString_ = null;
                    this.onChanged();
                } else {
                    this.styleString_ = null;
                    this.styleStringBuilder_ = null;
                }

                return this;
            }

            public com.android.aapt.StyleString.Builder getStyleStringBuilder() {
                this.onChanged();
                return (com.android.aapt.StyleString.Builder)this.getStyleStringFieldBuilder().getBuilder();
            }

            public com.android.aapt.StyleStringOrBuilder getStyleStringOrBuilder() {
                if (this.styleStringBuilder_ != null) {
                    return (com.android.aapt.StyleStringOrBuilder)this.styleStringBuilder_.getMessageOrBuilder();
                } else {
                    return this.styleString_ == null ? com.android.aapt.StyleString.getDefaultInstance() : this.styleString_;
                }
            }

            private SingleFieldBuilderV3<com.android.aapt.StyleString, com.android.aapt.StyleString.Builder, com.android.aapt.StyleStringOrBuilder> getStyleStringFieldBuilder() {
                if (this.styleStringBuilder_ == null) {
                    this.styleStringBuilder_ = new SingleFieldBuilderV3(this.getStyleString(), this.getParentForChildren(), this.isClean());
                    this.styleString_ = null;
                }

                return this.styleStringBuilder_;
            }

            private void ensureUntranslatableSectionsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.untranslatableSections_ = new ArrayList(this.untranslatableSections_);
                    this.bitField0_ |= 1;
                }

            }

            public List<com.android.aapt.UntranslatableSection> getUntranslatableSectionsList() {
                return this.untranslatableSectionsBuilder_ == null ? Collections.unmodifiableList(this.untranslatableSections_) : this.untranslatableSectionsBuilder_.getMessageList();
            }

            public int getUntranslatableSectionsCount() {
                return this.untranslatableSectionsBuilder_ == null ? this.untranslatableSections_.size() : this.untranslatableSectionsBuilder_.getCount();
            }

            public com.android.aapt.UntranslatableSection getUntranslatableSections(int index) {
                return this.untranslatableSectionsBuilder_ == null ? (com.android.aapt.UntranslatableSection)this.untranslatableSections_.get(index) : (com.android.aapt.UntranslatableSection)this.untranslatableSectionsBuilder_.getMessage(index);
            }

            public com.android.aapt.MacroBody.Builder setUntranslatableSections(int index, com.android.aapt.UntranslatableSection value) {
                if (this.untranslatableSectionsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureUntranslatableSectionsIsMutable();
                    this.untranslatableSections_.set(index, value);
                    this.onChanged();
                } else {
                    this.untranslatableSectionsBuilder_.setMessage(index, value);
                }

                return this;
            }

            public com.android.aapt.MacroBody.Builder setUntranslatableSections(int index, com.android.aapt.UntranslatableSection.Builder builderForValue) {
                if (this.untranslatableSectionsBuilder_ == null) {
                    this.ensureUntranslatableSectionsIsMutable();
                    this.untranslatableSections_.set(index, builderForValue.build());
                    this.onChanged();
                } else {
                    this.untranslatableSectionsBuilder_.setMessage(index, builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.MacroBody.Builder addUntranslatableSections(com.android.aapt.UntranslatableSection value) {
                if (this.untranslatableSectionsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureUntranslatableSectionsIsMutable();
                    this.untranslatableSections_.add(value);
                    this.onChanged();
                } else {
                    this.untranslatableSectionsBuilder_.addMessage(value);
                }

                return this;
            }

            public com.android.aapt.MacroBody.Builder addUntranslatableSections(int index, com.android.aapt.UntranslatableSection value) {
                if (this.untranslatableSectionsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureUntranslatableSectionsIsMutable();
                    this.untranslatableSections_.add(index, value);
                    this.onChanged();
                } else {
                    this.untranslatableSectionsBuilder_.addMessage(index, value);
                }

                return this;
            }

            public com.android.aapt.MacroBody.Builder addUntranslatableSections(com.android.aapt.UntranslatableSection.Builder builderForValue) {
                if (this.untranslatableSectionsBuilder_ == null) {
                    this.ensureUntranslatableSectionsIsMutable();
                    this.untranslatableSections_.add(builderForValue.build());
                    this.onChanged();
                } else {
                    this.untranslatableSectionsBuilder_.addMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.MacroBody.Builder addUntranslatableSections(int index, com.android.aapt.UntranslatableSection.Builder builderForValue) {
                if (this.untranslatableSectionsBuilder_ == null) {
                    this.ensureUntranslatableSectionsIsMutable();
                    this.untranslatableSections_.add(index, builderForValue.build());
                    this.onChanged();
                } else {
                    this.untranslatableSectionsBuilder_.addMessage(index, builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.MacroBody.Builder addAllUntranslatableSections(Iterable<? extends com.android.aapt.UntranslatableSection> values) {
                if (this.untranslatableSectionsBuilder_ == null) {
                    this.ensureUntranslatableSectionsIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.untranslatableSections_);
                    this.onChanged();
                } else {
                    this.untranslatableSectionsBuilder_.addAllMessages(values);
                }

                return this;
            }

            public com.android.aapt.MacroBody.Builder clearUntranslatableSections() {
                if (this.untranslatableSectionsBuilder_ == null) {
                    this.untranslatableSections_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    this.onChanged();
                } else {
                    this.untranslatableSectionsBuilder_.clear();
                }

                return this;
            }

            public com.android.aapt.MacroBody.Builder removeUntranslatableSections(int index) {
                if (this.untranslatableSectionsBuilder_ == null) {
                    this.ensureUntranslatableSectionsIsMutable();
                    this.untranslatableSections_.remove(index);
                    this.onChanged();
                } else {
                    this.untranslatableSectionsBuilder_.remove(index);
                }

                return this;
            }

            public com.android.aapt.UntranslatableSection.Builder getUntranslatableSectionsBuilder(int index) {
                return (com.android.aapt.UntranslatableSection.Builder)this.getUntranslatableSectionsFieldBuilder().getBuilder(index);
            }

            public com.android.aapt.UntranslatableSectionOrBuilder getUntranslatableSectionsOrBuilder(int index) {
                return this.untranslatableSectionsBuilder_ == null ? (com.android.aapt.UntranslatableSectionOrBuilder)this.untranslatableSections_.get(index) : (com.android.aapt.UntranslatableSectionOrBuilder)this.untranslatableSectionsBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends com.android.aapt.UntranslatableSectionOrBuilder> getUntranslatableSectionsOrBuilderList() {
                return this.untranslatableSectionsBuilder_ != null ? this.untranslatableSectionsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.untranslatableSections_);
            }

            public com.android.aapt.UntranslatableSection.Builder addUntranslatableSectionsBuilder() {
                return (com.android.aapt.UntranslatableSection.Builder)this.getUntranslatableSectionsFieldBuilder().addBuilder(com.android.aapt.UntranslatableSection.getDefaultInstance());
            }

            public com.android.aapt.UntranslatableSection.Builder addUntranslatableSectionsBuilder(int index) {
                return (com.android.aapt.UntranslatableSection.Builder)this.getUntranslatableSectionsFieldBuilder().addBuilder(index, com.android.aapt.UntranslatableSection.getDefaultInstance());
            }

            public List<com.android.aapt.UntranslatableSection.Builder> getUntranslatableSectionsBuilderList() {
                return this.getUntranslatableSectionsFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<com.android.aapt.UntranslatableSection, com.android.aapt.UntranslatableSection.Builder, com.android.aapt.UntranslatableSectionOrBuilder> getUntranslatableSectionsFieldBuilder() {
                if (this.untranslatableSectionsBuilder_ == null) {
                    this.untranslatableSectionsBuilder_ = new RepeatedFieldBuilderV3(this.untranslatableSections_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
                    this.untranslatableSections_ = null;
                }

                return this.untranslatableSectionsBuilder_;
            }

            private void ensureNamespaceStackIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.namespaceStack_ = new ArrayList(this.namespaceStack_);
                    this.bitField0_ |= 2;
                }

            }

            public List<com.android.aapt.NamespaceAlias> getNamespaceStackList() {
                return this.namespaceStackBuilder_ == null ? Collections.unmodifiableList(this.namespaceStack_) : this.namespaceStackBuilder_.getMessageList();
            }

            public int getNamespaceStackCount() {
                return this.namespaceStackBuilder_ == null ? this.namespaceStack_.size() : this.namespaceStackBuilder_.getCount();
            }

            public com.android.aapt.NamespaceAlias getNamespaceStack(int index) {
                return this.namespaceStackBuilder_ == null ? (com.android.aapt.NamespaceAlias)this.namespaceStack_.get(index) : (com.android.aapt.NamespaceAlias)this.namespaceStackBuilder_.getMessage(index);
            }

            public com.android.aapt.MacroBody.Builder setNamespaceStack(int index, com.android.aapt.NamespaceAlias value) {
                if (this.namespaceStackBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureNamespaceStackIsMutable();
                    this.namespaceStack_.set(index, value);
                    this.onChanged();
                } else {
                    this.namespaceStackBuilder_.setMessage(index, value);
                }

                return this;
            }

            public com.android.aapt.MacroBody.Builder setNamespaceStack(int index, com.android.aapt.NamespaceAlias.Builder builderForValue) {
                if (this.namespaceStackBuilder_ == null) {
                    this.ensureNamespaceStackIsMutable();
                    this.namespaceStack_.set(index, builderForValue.build());
                    this.onChanged();
                } else {
                    this.namespaceStackBuilder_.setMessage(index, builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.MacroBody.Builder addNamespaceStack(com.android.aapt.NamespaceAlias value) {
                if (this.namespaceStackBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureNamespaceStackIsMutable();
                    this.namespaceStack_.add(value);
                    this.onChanged();
                } else {
                    this.namespaceStackBuilder_.addMessage(value);
                }

                return this;
            }

            public com.android.aapt.MacroBody.Builder addNamespaceStack(int index, com.android.aapt.NamespaceAlias value) {
                if (this.namespaceStackBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureNamespaceStackIsMutable();
                    this.namespaceStack_.add(index, value);
                    this.onChanged();
                } else {
                    this.namespaceStackBuilder_.addMessage(index, value);
                }

                return this;
            }

            public com.android.aapt.MacroBody.Builder addNamespaceStack(com.android.aapt.NamespaceAlias.Builder builderForValue) {
                if (this.namespaceStackBuilder_ == null) {
                    this.ensureNamespaceStackIsMutable();
                    this.namespaceStack_.add(builderForValue.build());
                    this.onChanged();
                } else {
                    this.namespaceStackBuilder_.addMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.MacroBody.Builder addNamespaceStack(int index, com.android.aapt.NamespaceAlias.Builder builderForValue) {
                if (this.namespaceStackBuilder_ == null) {
                    this.ensureNamespaceStackIsMutable();
                    this.namespaceStack_.add(index, builderForValue.build());
                    this.onChanged();
                } else {
                    this.namespaceStackBuilder_.addMessage(index, builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.MacroBody.Builder addAllNamespaceStack(Iterable<? extends com.android.aapt.NamespaceAlias> values) {
                if (this.namespaceStackBuilder_ == null) {
                    this.ensureNamespaceStackIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.namespaceStack_);
                    this.onChanged();
                } else {
                    this.namespaceStackBuilder_.addAllMessages(values);
                }

                return this;
            }

            public com.android.aapt.MacroBody.Builder clearNamespaceStack() {
                if (this.namespaceStackBuilder_ == null) {
                    this.namespaceStack_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                    this.onChanged();
                } else {
                    this.namespaceStackBuilder_.clear();
                }

                return this;
            }

            public com.android.aapt.MacroBody.Builder removeNamespaceStack(int index) {
                if (this.namespaceStackBuilder_ == null) {
                    this.ensureNamespaceStackIsMutable();
                    this.namespaceStack_.remove(index);
                    this.onChanged();
                } else {
                    this.namespaceStackBuilder_.remove(index);
                }

                return this;
            }

            public com.android.aapt.NamespaceAlias.Builder getNamespaceStackBuilder(int index) {
                return (com.android.aapt.NamespaceAlias.Builder)this.getNamespaceStackFieldBuilder().getBuilder(index);
            }

            public com.android.aapt.NamespaceAliasOrBuilder getNamespaceStackOrBuilder(int index) {
                return this.namespaceStackBuilder_ == null ? (com.android.aapt.NamespaceAliasOrBuilder)this.namespaceStack_.get(index) : (com.android.aapt.NamespaceAliasOrBuilder)this.namespaceStackBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends com.android.aapt.NamespaceAliasOrBuilder> getNamespaceStackOrBuilderList() {
                return this.namespaceStackBuilder_ != null ? this.namespaceStackBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.namespaceStack_);
            }

            public com.android.aapt.NamespaceAlias.Builder addNamespaceStackBuilder() {
                return (com.android.aapt.NamespaceAlias.Builder)this.getNamespaceStackFieldBuilder().addBuilder(com.android.aapt.NamespaceAlias.getDefaultInstance());
            }

            public com.android.aapt.NamespaceAlias.Builder addNamespaceStackBuilder(int index) {
                return (com.android.aapt.NamespaceAlias.Builder)this.getNamespaceStackFieldBuilder().addBuilder(index, com.android.aapt.NamespaceAlias.getDefaultInstance());
            }

            public List<com.android.aapt.NamespaceAlias.Builder> getNamespaceStackBuilderList() {
                return this.getNamespaceStackFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<com.android.aapt.NamespaceAlias, com.android.aapt.NamespaceAlias.Builder, com.android.aapt.NamespaceAliasOrBuilder> getNamespaceStackFieldBuilder() {
                if (this.namespaceStackBuilder_ == null) {
                    this.namespaceStackBuilder_ = new RepeatedFieldBuilderV3(this.namespaceStack_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
                    this.namespaceStack_ = null;
                }

                return this.namespaceStackBuilder_;
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

            public com.android.aapt.MacroBody.Builder setSource(com.android.aapt.SourcePosition value) {
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

            public com.android.aapt.MacroBody.Builder setSource(com.android.aapt.SourcePosition.Builder builderForValue) {
                if (this.sourceBuilder_ == null) {
                    this.source_ = builderForValue.build();
                    this.onChanged();
                } else {
                    this.sourceBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            public com.android.aapt.MacroBody.Builder mergeSource(com.android.aapt.SourcePosition value) {
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

            public com.android.aapt.MacroBody.Builder clearSource() {
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

            public final com.android.aapt.MacroBody.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.MacroBody.Builder)super.setUnknownFields(unknownFields);
            }

            public final com.android.aapt.MacroBody.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (com.android.aapt.MacroBody.Builder)super.mergeUnknownFields(unknownFields);
            }
        }
    }