

package com.google.protobuf;

import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.Descriptors.FieldDescriptor.JavaType;
import com.google.protobuf.Descriptors.FileDescriptor.Syntax;
import com.google.protobuf.GeneratedMessage.GeneratedExtension;
import com.google.protobuf.GeneratedMessageLite.SerializedForm;
import com.google.protobuf.Internal.BooleanList;
import com.google.protobuf.Internal.DoubleList;
import com.google.protobuf.Internal.EnumLite;
import com.google.protobuf.Internal.FloatList;
import com.google.protobuf.Internal.IntList;
import com.google.protobuf.Internal.LongList;
import com.google.protobuf.LazyField.LazyEntry;
import com.google.protobuf.MessageReflection.ExtensionAdapter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public abstract class GeneratedMessageV3 extends AbstractMessage implements Serializable {
    private static final long serialVersionUID = 1L;
    private static boolean forTestUseReflection = false;
    public static boolean alwaysUseFieldBuilders = false;
    public UnknownFieldSet unknownFields;

    static void setForTestUseReflection(boolean useReflection) {
        forTestUseReflection = useReflection;
    }

    public GeneratedMessageV3() {
        this.unknownFields = UnknownFieldSet.getDefaultInstance();
    }

    public GeneratedMessageV3(GeneratedMessageV3.Builder<?> builder) {
        this.unknownFields = builder.getUnknownFields();
    }

    public Parser<? extends GeneratedMessageV3> getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    static void enableAlwaysUseFieldBuildersForTesting() {
        setAlwaysUseFieldBuildersForTesting(true);
    }

    static void setAlwaysUseFieldBuildersForTesting(boolean useBuilders) {
        alwaysUseFieldBuilders = useBuilders;
    }

    public abstract GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable();

    public Descriptor getDescriptorForType() {
        return this.internalGetFieldAccessorTable().descriptor;
    }

    public void mergeFromAndMakeImmutableInternal(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        Schema schema = Protobuf.getInstance().schemaFor(this);

        try {
            schema.mergeFrom(this, CodedInputStreamReader.forCodedInput(input), extensionRegistry);
        } catch (InvalidProtocolBufferException var5) {
            throw var5.setUnfinishedMessage(this);
        } catch (IOException var6) {
            throw (new InvalidProtocolBufferException(var6)).setUnfinishedMessage(this);
        }

        schema.makeImmutable(this);
    }

    private Map<FieldDescriptor, Object> getAllFieldsMutable(boolean getBytesForString) {
        TreeMap<FieldDescriptor, Object> result = new TreeMap();
        Descriptor descriptor = this.internalGetFieldAccessorTable().descriptor;
        List<FieldDescriptor> fields = descriptor.getFields();

        for(int i = 0; i < fields.size(); ++i) {
            FieldDescriptor field = (FieldDescriptor)fields.get(i);
            OneofDescriptor oneofDescriptor = field.getContainingOneof();
            if (oneofDescriptor != null) {
                i += oneofDescriptor.getFieldCount() - 1;
                if (!this.hasOneof(oneofDescriptor)) {
                    continue;
                }

                field = this.getOneofFieldDescriptor(oneofDescriptor);
            } else {
                if (field.isRepeated()) {
                    List<?> value = (List)this.getField(field);
                    if (!value.isEmpty()) {
                        result.put(field, value);
                    }
                    continue;
                }

                if (!this.hasField(field)) {
                    continue;
                }
            }

            if (getBytesForString && field.getJavaType() == JavaType.STRING) {
                result.put(field, this.getFieldRaw(field));
            } else {
                result.put(field, this.getField(field));
            }
        }

        return result;
    }

    public boolean isInitialized() {
        Iterator var1 = this.getDescriptorForType().getFields().iterator();

        while(true) {
            while(true) {
                FieldDescriptor field;
                do {
                    if (!var1.hasNext()) {
                        return true;
                    }

                    field = (FieldDescriptor)var1.next();
                    if (field.isRequired() && !this.hasField(field)) {
                        return false;
                    }
                } while(field.getJavaType() != JavaType.MESSAGE);

                if (field.isRepeated()) {
                    List<Message> messageList = (List)this.getField(field);
                    Iterator var4 = messageList.iterator();

                    while(var4.hasNext()) {
                        Message element = (Message)var4.next();
                        if (!element.isInitialized()) {
                            return false;
                        }
                    }
                } else if (this.hasField(field) && !((Message)this.getField(field)).isInitialized()) {
                    return false;
                }
            }
        }
    }

    public Map<FieldDescriptor, Object> getAllFields() {
        return Collections.unmodifiableMap(this.getAllFieldsMutable(false));
    }

    Map<FieldDescriptor, Object> getAllFieldsRaw() {
        return Collections.unmodifiableMap(this.getAllFieldsMutable(true));
    }

    public boolean hasOneof(OneofDescriptor oneof) {
        return this.internalGetFieldAccessorTable().getOneof(oneof).has(this);
    }

    public FieldDescriptor getOneofFieldDescriptor(OneofDescriptor oneof) {
        return this.internalGetFieldAccessorTable().getOneof(oneof).get(this);
    }

    public boolean hasField(FieldDescriptor field) {
        return this.internalGetFieldAccessorTable().getField(field).has(this);
    }

    public Object getField(FieldDescriptor field) {
        return this.internalGetFieldAccessorTable().getField(field).get(this);
    }

    Object getFieldRaw(FieldDescriptor field) {
        return this.internalGetFieldAccessorTable().getField(field).getRaw(this);
    }

    public int getRepeatedFieldCount(FieldDescriptor field) {
        return this.internalGetFieldAccessorTable().getField(field).getRepeatedCount(this);
    }

    public Object getRepeatedField(FieldDescriptor field, int index) {
        return this.internalGetFieldAccessorTable().getField(field).getRepeated(this, index);
    }

    public UnknownFieldSet getUnknownFields() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    public boolean parseUnknownField(CodedInputStream input, com.google.protobuf.UnknownFieldSet.Builder unknownFields, ExtensionRegistryLite extensionRegistry, int tag) throws IOException {
        return input.shouldDiscardUnknownFields() ? input.skipField(tag) : unknownFields.mergeFieldFrom(tag, input);
    }

    public boolean parseUnknownFieldProto3(CodedInputStream input, com.google.protobuf.UnknownFieldSet.Builder unknownFields, ExtensionRegistryLite extensionRegistry, int tag) throws IOException {
        return this.parseUnknownField(input, unknownFields, extensionRegistry, tag);
    }

    public static <M extends Message> M parseWithIOException(Parser<M> parser, InputStream input) throws IOException {
        try {
            return (M)parser.parseFrom(input);
        } catch (InvalidProtocolBufferException var3) {
            throw var3.unwrapIOException();
        }
    }

    public static <M extends Message> M parseWithIOException(Parser<M> parser, InputStream input, ExtensionRegistryLite extensions) throws IOException {
        try {
            return (M)parser.parseFrom(input, extensions);
        } catch (InvalidProtocolBufferException var4) {
            throw var4.unwrapIOException();
        }
    }

    public static <M extends Message> M parseWithIOException(Parser<M> parser, CodedInputStream input) throws IOException {
        try {
            return (M)parser.parseFrom(input);
        } catch (InvalidProtocolBufferException var3) {
            throw var3.unwrapIOException();
        }
    }

    public static <M extends Message> M parseWithIOException(Parser<M> parser, CodedInputStream input, ExtensionRegistryLite extensions) throws IOException {
        try {
            return (M) parser.parseFrom(input, extensions);
        } catch (InvalidProtocolBufferException var4) {
            throw var4.unwrapIOException();
        }
    }

    public static <M extends Message> M parseDelimitedWithIOException(Parser<M> parser, InputStream input) throws IOException {
        try {
            return (M) parser.parseDelimitedFrom(input);
        } catch (InvalidProtocolBufferException var3) {
            throw var3.unwrapIOException();
        }
    }

    public static <M extends Message> M parseDelimitedWithIOException(Parser<M> parser, InputStream input, ExtensionRegistryLite extensions) throws IOException {
        try {
            return (M)parser.parseDelimitedFrom(input, extensions);
        } catch (InvalidProtocolBufferException var4) {
            throw var4.unwrapIOException();
        }
    }

    public static boolean canUseUnsafe() {
        return UnsafeUtil.hasUnsafeArrayOperations() && UnsafeUtil.hasUnsafeByteBufferOperations();
    }

    public static IntList emptyIntList() {
        return IntArrayList.emptyList();
    }

    public static IntList newIntList() {
        return new IntArrayList();
    }

    public static IntList mutableCopy(IntList list) {
        int size = list.size();
        return list.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static LongList emptyLongList() {
        return LongArrayList.emptyList();
    }

    public static LongList newLongList() {
        return new LongArrayList();
    }

    public static LongList mutableCopy(LongList list) {
        int size = list.size();
        return list.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static FloatList emptyFloatList() {
        return FloatArrayList.emptyList();
    }

    public static FloatList newFloatList() {
        return new FloatArrayList();
    }

    public static FloatList mutableCopy(FloatList list) {
        int size = list.size();
        return list.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static DoubleList emptyDoubleList() {
        return DoubleArrayList.emptyList();
    }

    public static DoubleList newDoubleList() {
        return new DoubleArrayList();
    }

    public static DoubleList mutableCopy(DoubleList list) {
        int size = list.size();
        return list.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static BooleanList emptyBooleanList() {
        return BooleanArrayList.emptyList();
    }

    public static BooleanList newBooleanList() {
        return new BooleanArrayList();
    }

    public static BooleanList mutableCopy(BooleanList list) {
        int size = list.size();
        return list.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    @Override
    public void writeTo(CodedOutputStream output) throws IOException {
        MessageReflection.writeMessageTo(this, this.getAllFieldsRaw(), output, false);
    }

    @Override
    public int getSerializedSize() {
        int size = this.memoizedSize;
        if (size != -1) {
            return size;
        } else {
            this.memoizedSize = MessageReflection.getSerializedSize(this, this.getAllFieldsRaw());
            return this.memoizedSize;
        }
    }

    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        throw new UnsupportedOperationException("This method must be overridden by the subclass.");
    }

    public void makeExtensionsImmutable() {
    }

    public abstract com.google.protobuf.Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1);

    public com.google.protobuf.Message.Builder newBuilderForType(final com.google.protobuf.AbstractMessage.BuilderParent parent) {
        return this.newBuilderForType(new GeneratedMessageV3.BuilderParent() {
            public void markDirty() {
                parent.markDirty();
            }
        });
    }

    private static Method getMethodOrDie(Class clazz, String name, Class... params) {
        try {
            return clazz.getMethod(name, params);
        } catch (NoSuchMethodException var4) {
            throw new RuntimeException("Generated message class \"" + clazz.getName() + "\" missing method \"" + name + "\".", var4);
        }
    }

    private static Object invokeOrDie(Method method, Object object, Object... params) {
        try {
            return method.invoke(object, params);
        } catch (IllegalAccessException var5) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", var5);
        } catch (InvocationTargetException var6) {
            Throwable cause = var6.getCause();
            if (cause instanceof RuntimeException) {
                throw (RuntimeException)cause;
            } else if (cause instanceof Error) {
                throw (Error)cause;
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    private static RuntimeException handleException(Throwable e) {
        if (e instanceof ClassCastException) {
            throw new IllegalArgumentException(e);
        } else if (e instanceof RuntimeException) {
            throw (RuntimeException)e;
        } else if (e instanceof Error) {
            throw (Error)e;
        } else {
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", e);
        }
    }

    public MapField internalGetMapField(int fieldNumber) {
        throw new RuntimeException("No map fields found in " + this.getClass().getName());
    }

    public Object writeReplace() throws ObjectStreamException {
        return new SerializedForm(this);
    }

    private static <MessageType extends GeneratedMessageV3.ExtendableMessage<MessageType>, T> Extension<MessageType, T> checkNotLite(ExtensionLite<MessageType, T> extension) {
        if (extension.isLite()) {
            throw new IllegalArgumentException("Expected non-lite extension.");
        } else {
            return (Extension)extension;
        }
    }

    public static int computeStringSize(int fieldNumber, Object value) {
        return value instanceof String ? CodedOutputStream.computeStringSize(fieldNumber, (String)value) : CodedOutputStream.computeBytesSize(fieldNumber, (ByteString)value);
    }

    public static int computeStringSizeNoTag(Object value) {
        return value instanceof String ? CodedOutputStream.computeStringSizeNoTag((String)value) : CodedOutputStream.computeBytesSizeNoTag((ByteString)value);
    }

    public static void writeString(CodedOutputStream output, int fieldNumber, Object value) throws IOException {
        if (value instanceof String) {
            output.writeString(fieldNumber, (String)value);
        } else {
            output.writeBytes(fieldNumber, (ByteString)value);
        }

    }

    public static void writeStringNoTag(CodedOutputStream output, Object value) throws IOException {
        if (value instanceof String) {
            output.writeStringNoTag((String)value);
        } else {
            output.writeBytesNoTag((ByteString)value);
        }

    }

    public static <V> void serializeIntegerMapTo(CodedOutputStream out, MapField<Integer, V> field, MapEntry<Integer, V> defaultEntry, int fieldNumber) throws IOException {
        Map<Integer, V> m = field.getMap();
        if (!out.isSerializationDeterministic()) {
            serializeMapTo(out, m, defaultEntry, fieldNumber);
        } else {
            int[] keys = new int[m.size()];
            int index = 0;

            int k;
            for(Iterator var7 = m.keySet().iterator(); var7.hasNext(); keys[index++] = k) {
                k = (Integer)var7.next();
            }

            Arrays.sort(keys);
            int[] var11 = keys;
            k = keys.length;

            for(int var9 = 0; var9 < k; ++var9) {
                int key = var11[var9];
                out.writeMessage(fieldNumber, defaultEntry.newBuilderForType().setKey(key).setValue(m.get(key)).build());
            }

        }
    }

    public static <V> void serializeLongMapTo(CodedOutputStream out, MapField<Long, V> field, MapEntry<Long, V> defaultEntry, int fieldNumber) throws IOException {
        Map<Long, V> m = field.getMap();
        if (!out.isSerializationDeterministic()) {
            serializeMapTo(out, m, defaultEntry, fieldNumber);
        } else {
            long[] keys = new long[m.size()];
            int index = 0;

            long k;
            for(Iterator var7 = m.keySet().iterator(); var7.hasNext(); keys[index++] = k) {
                k = (Long)var7.next();
            }

            Arrays.sort(keys);
            long[] var12 = keys;
            int var13 = keys.length;

            for(int var9 = 0; var9 < var13; ++var9) {
                long key = var12[var9];
                out.writeMessage(fieldNumber, defaultEntry.newBuilderForType().setKey(key).setValue(m.get(key)).build());
            }

        }
    }

    public static <V> void serializeStringMapTo(CodedOutputStream out, MapField<String, V> field, MapEntry<String, V> defaultEntry, int fieldNumber) throws IOException {
        Map<String, V> m = field.getMap();
        if (!out.isSerializationDeterministic()) {
            serializeMapTo(out, m, defaultEntry, fieldNumber);
        } else {
            String[] keys = new String[m.size()];
            keys = (String[])m.keySet().toArray(keys);
            Arrays.sort(keys);
            String[] var6 = keys;
            int var7 = keys.length;

            for(int var8 = 0; var8 < var7; ++var8) {
                String key = var6[var8];
                out.writeMessage(fieldNumber, defaultEntry.newBuilderForType().setKey(key).setValue(m.get(key)).build());
            }

        }
    }

    public static <V> void serializeBooleanMapTo(CodedOutputStream out, MapField<Boolean, V> field, MapEntry<Boolean, V> defaultEntry, int fieldNumber) throws IOException {
        Map<Boolean, V> m = field.getMap();
        if (!out.isSerializationDeterministic()) {
            serializeMapTo(out, m, defaultEntry, fieldNumber);
        } else {
            maybeSerializeBooleanEntryTo(out, m, defaultEntry, fieldNumber, false);
            maybeSerializeBooleanEntryTo(out, m, defaultEntry, fieldNumber, true);
        }
    }

    private static <V> void maybeSerializeBooleanEntryTo(CodedOutputStream out, Map<Boolean, V> m, MapEntry<Boolean, V> defaultEntry, int fieldNumber, boolean key) throws IOException {
        if (m.containsKey(key)) {
            out.writeMessage(fieldNumber, defaultEntry.newBuilderForType().setKey(key).setValue(m.get(key)).build());
        }

    }

    private static <K, V> void serializeMapTo(CodedOutputStream out, Map<K, V> m, MapEntry<K, V> defaultEntry, int fieldNumber) throws IOException {
        Iterator var4 = m.entrySet().iterator();

        while(var4.hasNext()) {
            Entry<K, V> entry = (Entry)var4.next();
            out.writeMessage(fieldNumber, defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build());
        }

    }

    public static final class FieldAccessorTable {
        private final Descriptor descriptor;
        private final GeneratedMessageV3.FieldAccessorTable.FieldAccessor[] fields;
        private String[] camelCaseNames;
        private final GeneratedMessageV3.FieldAccessorTable.OneofAccessor[] oneofs;
        private volatile boolean initialized;

        public FieldAccessorTable(Descriptor descriptor, String[] camelCaseNames, Class<? extends GeneratedMessageV3> messageClass, Class<? extends GeneratedMessageV3.Builder> builderClass) {
            this(descriptor, camelCaseNames);
            this.ensureFieldAccessorsInitialized(messageClass, builderClass);
        }

        public FieldAccessorTable(Descriptor descriptor, String[] camelCaseNames) {
            this.descriptor = descriptor;
            this.camelCaseNames = camelCaseNames;
            this.fields = new GeneratedMessageV3.FieldAccessorTable.FieldAccessor[descriptor.getFields().size()];
            this.oneofs = new GeneratedMessageV3.FieldAccessorTable.OneofAccessor[descriptor.getOneofs().size()];
            this.initialized = false;
        }

        public GeneratedMessageV3.FieldAccessorTable ensureFieldAccessorsInitialized(Class<? extends GeneratedMessageV3> messageClass, Class<? extends GeneratedMessageV3.Builder> builderClass) {
            if (this.initialized) {
                return this;
            } else {
                synchronized(this) {
                    if (this.initialized) {
                        return this;
                    } else {
                        int fieldsSize = this.fields.length;

                        int i;
                        for(i = 0; i < fieldsSize; ++i) {
                            FieldDescriptor field = (FieldDescriptor)this.descriptor.getFields().get(i);
                            String containingOneofCamelCaseName = null;
                            if (field.getContainingOneof() != null) {
                                containingOneofCamelCaseName = this.camelCaseNames[fieldsSize + field.getContainingOneof().getIndex()];
                            }

                            if (field.isRepeated()) {
                                if (field.getJavaType() == JavaType.MESSAGE) {
                                    if (field.isMapField()) {
                                        this.fields[i] = new GeneratedMessageV3.FieldAccessorTable.MapFieldAccessor(field, this.camelCaseNames[i], messageClass, builderClass);
                                    } else {
                                        this.fields[i] = new GeneratedMessageV3.FieldAccessorTable.RepeatedMessageFieldAccessor(field, this.camelCaseNames[i], messageClass, builderClass);
                                    }
                                } else if (field.getJavaType() == JavaType.ENUM) {
                                    this.fields[i] = new GeneratedMessageV3.FieldAccessorTable.RepeatedEnumFieldAccessor(field, this.camelCaseNames[i], messageClass, builderClass);
                                } else {
                                    this.fields[i] = new GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor(field, this.camelCaseNames[i], messageClass, builderClass);
                                }
                            } else if (field.getJavaType() == JavaType.MESSAGE) {
                                this.fields[i] = new GeneratedMessageV3.FieldAccessorTable.SingularMessageFieldAccessor(field, this.camelCaseNames[i], messageClass, builderClass, containingOneofCamelCaseName);
                            } else if (field.getJavaType() == JavaType.ENUM) {
                                this.fields[i] = new GeneratedMessageV3.FieldAccessorTable.SingularEnumFieldAccessor(field, this.camelCaseNames[i], messageClass, builderClass, containingOneofCamelCaseName);
                            } else if (field.getJavaType() == JavaType.STRING) {
                                this.fields[i] = new GeneratedMessageV3.FieldAccessorTable.SingularStringFieldAccessor(field, this.camelCaseNames[i], messageClass, builderClass, containingOneofCamelCaseName);
                            } else {
                                this.fields[i] = new GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor(field, this.camelCaseNames[i], messageClass, builderClass, containingOneofCamelCaseName);
                            }
                        }


                        for(i = 0; i < this.oneofs.length; ++i) {
                            this.oneofs[i] = new GeneratedMessageV3.FieldAccessorTable.OneofAccessor(this.descriptor, this.camelCaseNames[i + fieldsSize], messageClass, builderClass);
                        }

                        this.initialized = true;
                        this.camelCaseNames = null;
                        return this;
                    }
                }
            }
        }

        private GeneratedMessageV3.FieldAccessorTable.FieldAccessor getField(FieldDescriptor field) {
            if (field.getContainingType() != this.descriptor) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            } else if (field.isExtension()) {
                throw new IllegalArgumentException("This type does not have extensions.");
            } else {
                return this.fields[field.getIndex()];
            }
        }

        private GeneratedMessageV3.FieldAccessorTable.OneofAccessor getOneof(OneofDescriptor oneof) {
            if (oneof.getContainingType() != this.descriptor) {
                throw new IllegalArgumentException("OneofDescriptor does not match message type.");
            } else {
                return this.oneofs[oneof.getIndex()];
            }
        }

        private static boolean supportFieldPresence(FileDescriptor file) {
            return file.getSyntax() == Syntax.PROTO2;
        }

        private static final class RepeatedMessageFieldAccessor extends GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor {
            private final Method newBuilderMethod;
            private final Method getBuilderMethodBuilder;

            RepeatedMessageFieldAccessor(FieldDescriptor descriptor, String camelCaseName, Class<? extends GeneratedMessageV3> messageClass, Class<? extends GeneratedMessageV3.Builder> builderClass) {
                super(descriptor, camelCaseName, messageClass, builderClass);
                this.newBuilderMethod = GeneratedMessageV3.getMethodOrDie(this.type, "newBuilder");
                this.getBuilderMethodBuilder = GeneratedMessageV3.getMethodOrDie(builderClass, "get" + camelCaseName + "Builder", Integer.TYPE);
            }

            private Object coerceType(Object value) {
                return this.type.isInstance(value) ? value : ((com.google.protobuf.Message.Builder)GeneratedMessageV3.invokeOrDie(this.newBuilderMethod, (Object)null)).mergeFrom((Message)value).build();
            }

            public void setRepeated(GeneratedMessageV3.Builder builder, int index, Object value) {
                super.setRepeated(builder, index, this.coerceType(value));
            }

            public void addRepeated(GeneratedMessageV3.Builder builder, Object value) {
                super.addRepeated(builder, this.coerceType(value));
            }

            public com.google.protobuf.Message.Builder newBuilder() {
                return (com.google.protobuf.Message.Builder)GeneratedMessageV3.invokeOrDie(this.newBuilderMethod, (Object)null);
            }

            public com.google.protobuf.Message.Builder getRepeatedBuilder(GeneratedMessageV3.Builder builder, int index) {
                return (com.google.protobuf.Message.Builder)GeneratedMessageV3.invokeOrDie(this.getBuilderMethodBuilder, builder, index);
            }
        }

        private static final class SingularMessageFieldAccessor extends GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor {
            private final Method newBuilderMethod;
            private final Method getBuilderMethodBuilder;

            SingularMessageFieldAccessor(FieldDescriptor descriptor, String camelCaseName, Class<? extends GeneratedMessageV3> messageClass, Class<? extends GeneratedMessageV3.Builder> builderClass, String containingOneofCamelCaseName) {
                super(descriptor, camelCaseName, messageClass, builderClass, containingOneofCamelCaseName);
                this.newBuilderMethod = GeneratedMessageV3.getMethodOrDie(this.type, "newBuilder");
                this.getBuilderMethodBuilder = GeneratedMessageV3.getMethodOrDie(builderClass, "get" + camelCaseName + "Builder");
            }

            private Object coerceType(Object value) {
                return this.type.isInstance(value) ? value : ((com.google.protobuf.Message.Builder)GeneratedMessageV3.invokeOrDie(this.newBuilderMethod, (Object)null)).mergeFrom((Message)value).buildPartial();
            }

            public void set(GeneratedMessageV3.Builder builder, Object value) {
                super.set(builder, this.coerceType(value));
            }

            public com.google.protobuf.Message.Builder newBuilder() {
                return (com.google.protobuf.Message.Builder)GeneratedMessageV3.invokeOrDie(this.newBuilderMethod, (Object)null);
            }

            public com.google.protobuf.Message.Builder getBuilder(GeneratedMessageV3.Builder builder) {
                return (com.google.protobuf.Message.Builder)GeneratedMessageV3.invokeOrDie(this.getBuilderMethodBuilder, builder);
            }
        }

        private static final class SingularStringFieldAccessor extends GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor {
            private final Method getBytesMethod;
            private final Method getBytesMethodBuilder;
            private final Method setBytesMethodBuilder;

            SingularStringFieldAccessor(FieldDescriptor descriptor, String camelCaseName, Class<? extends GeneratedMessageV3> messageClass, Class<? extends GeneratedMessageV3.Builder> builderClass, String containingOneofCamelCaseName) {
                super(descriptor, camelCaseName, messageClass, builderClass, containingOneofCamelCaseName);
                this.getBytesMethod = GeneratedMessageV3.getMethodOrDie(messageClass, "get" + camelCaseName + "Bytes");
                this.getBytesMethodBuilder = GeneratedMessageV3.getMethodOrDie(builderClass, "get" + camelCaseName + "Bytes");
                this.setBytesMethodBuilder = GeneratedMessageV3.getMethodOrDie(builderClass, "set" + camelCaseName + "Bytes", ByteString.class);
            }

            public Object getRaw(GeneratedMessageV3 message) {
                return GeneratedMessageV3.invokeOrDie(this.getBytesMethod, message);
            }

            public Object getRaw(GeneratedMessageV3.Builder builder) {
                return GeneratedMessageV3.invokeOrDie(this.getBytesMethodBuilder, builder);
            }

            public void set(GeneratedMessageV3.Builder builder, Object value) {
                if (value instanceof ByteString) {
                    GeneratedMessageV3.invokeOrDie(this.setBytesMethodBuilder, builder, value);
                } else {
                    super.set(builder, value);
                }

            }
        }

        private static final class RepeatedEnumFieldAccessor extends GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor {
            private EnumDescriptor enumDescriptor;
            private final Method valueOfMethod;
            private final Method getValueDescriptorMethod;
            private boolean supportUnknownEnumValue;
            private Method getRepeatedValueMethod;
            private Method getRepeatedValueMethodBuilder;
            private Method setRepeatedValueMethod;
            private Method addRepeatedValueMethod;

            RepeatedEnumFieldAccessor(FieldDescriptor descriptor, String camelCaseName, Class<? extends GeneratedMessageV3> messageClass, Class<? extends GeneratedMessageV3.Builder> builderClass) {
                super(descriptor, camelCaseName, messageClass, builderClass);
                this.enumDescriptor = descriptor.getEnumType();
                this.valueOfMethod = GeneratedMessageV3.getMethodOrDie(this.type, "valueOf", EnumValueDescriptor.class);
                this.getValueDescriptorMethod = GeneratedMessageV3.getMethodOrDie(this.type, "getValueDescriptor");
                this.supportUnknownEnumValue = descriptor.getFile().supportsUnknownEnumValue();
                if (this.supportUnknownEnumValue) {
                    this.getRepeatedValueMethod = GeneratedMessageV3.getMethodOrDie(messageClass, "get" + camelCaseName + "Value", Integer.TYPE);
                    this.getRepeatedValueMethodBuilder = GeneratedMessageV3.getMethodOrDie(builderClass, "get" + camelCaseName + "Value", Integer.TYPE);
                    this.setRepeatedValueMethod = GeneratedMessageV3.getMethodOrDie(builderClass, "set" + camelCaseName + "Value", Integer.TYPE, Integer.TYPE);
                    this.addRepeatedValueMethod = GeneratedMessageV3.getMethodOrDie(builderClass, "add" + camelCaseName + "Value", Integer.TYPE);
                }

            }

            public Object get(GeneratedMessageV3 message) {
                List newList = new ArrayList();
                int size = this.getRepeatedCount(message);

                for(int i = 0; i < size; ++i) {
                    newList.add(this.getRepeated(message, i));
                }

                return Collections.unmodifiableList(newList);
            }

            public Object get(GeneratedMessageV3.Builder builder) {
                List newList = new ArrayList();
                int size = this.getRepeatedCount(builder);

                for(int i = 0; i < size; ++i) {
                    newList.add(this.getRepeated(builder, i));
                }

                return Collections.unmodifiableList(newList);
            }

            public Object getRepeated(GeneratedMessageV3 message, int index) {
                if (this.supportUnknownEnumValue) {
                    int value = (Integer)GeneratedMessageV3.invokeOrDie(this.getRepeatedValueMethod, message, index);
                    return this.enumDescriptor.findValueByNumberCreatingIfUnknown(value);
                } else {
                    return GeneratedMessageV3.invokeOrDie(this.getValueDescriptorMethod, super.getRepeated(message, index));
                }
            }

            public Object getRepeated(GeneratedMessageV3.Builder builder, int index) {
                if (this.supportUnknownEnumValue) {
                    int value = (Integer)GeneratedMessageV3.invokeOrDie(this.getRepeatedValueMethodBuilder, builder, index);
                    return this.enumDescriptor.findValueByNumberCreatingIfUnknown(value);
                } else {
                    return GeneratedMessageV3.invokeOrDie(this.getValueDescriptorMethod, super.getRepeated(builder, index));
                }
            }

            public void setRepeated(GeneratedMessageV3.Builder builder, int index, Object value) {
                if (this.supportUnknownEnumValue) {
                    GeneratedMessageV3.invokeOrDie(this.setRepeatedValueMethod, builder, index, ((EnumValueDescriptor)value).getNumber());
                } else {
                    super.setRepeated(builder, index, GeneratedMessageV3.invokeOrDie(this.valueOfMethod, (Object)null, value));
                }
            }

            public void addRepeated(GeneratedMessageV3.Builder builder, Object value) {
                if (this.supportUnknownEnumValue) {
                    GeneratedMessageV3.invokeOrDie(this.addRepeatedValueMethod, builder, ((EnumValueDescriptor)value).getNumber());
                } else {
                    super.addRepeated(builder, GeneratedMessageV3.invokeOrDie(this.valueOfMethod, (Object)null, value));
                }
            }
        }

        private static final class SingularEnumFieldAccessor extends GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor {
            private EnumDescriptor enumDescriptor;
            private Method valueOfMethod;
            private Method getValueDescriptorMethod;
            private boolean supportUnknownEnumValue;
            private Method getValueMethod;
            private Method getValueMethodBuilder;
            private Method setValueMethod;

            SingularEnumFieldAccessor(FieldDescriptor descriptor, String camelCaseName, Class<? extends GeneratedMessageV3> messageClass, Class<? extends GeneratedMessageV3.Builder> builderClass, String containingOneofCamelCaseName) {
                super(descriptor, camelCaseName, messageClass, builderClass, containingOneofCamelCaseName);
                this.enumDescriptor = descriptor.getEnumType();
                this.valueOfMethod = GeneratedMessageV3.getMethodOrDie(this.type, "valueOf", EnumValueDescriptor.class);
                this.getValueDescriptorMethod = GeneratedMessageV3.getMethodOrDie(this.type, "getValueDescriptor");
                this.supportUnknownEnumValue = descriptor.getFile().supportsUnknownEnumValue();
                if (this.supportUnknownEnumValue) {
                    this.getValueMethod = GeneratedMessageV3.getMethodOrDie(messageClass, "get" + camelCaseName + "Value");
                    this.getValueMethodBuilder = GeneratedMessageV3.getMethodOrDie(builderClass, "get" + camelCaseName + "Value");
                    this.setValueMethod = GeneratedMessageV3.getMethodOrDie(builderClass, "set" + camelCaseName + "Value", Integer.TYPE);
                }

            }

            public Object get(GeneratedMessageV3 message) {
                if (this.supportUnknownEnumValue) {
                    int value = (Integer)GeneratedMessageV3.invokeOrDie(this.getValueMethod, message);
                    return this.enumDescriptor.findValueByNumberCreatingIfUnknown(value);
                } else {
                    return GeneratedMessageV3.invokeOrDie(this.getValueDescriptorMethod, super.get(message));
                }
            }

            public Object get(GeneratedMessageV3.Builder builder) {
                if (this.supportUnknownEnumValue) {
                    int value = (Integer)GeneratedMessageV3.invokeOrDie(this.getValueMethodBuilder, builder);
                    return this.enumDescriptor.findValueByNumberCreatingIfUnknown(value);
                } else {
                    return GeneratedMessageV3.invokeOrDie(this.getValueDescriptorMethod, super.get(builder));
                }
            }

            public void set(GeneratedMessageV3.Builder builder, Object value) {
                if (this.supportUnknownEnumValue) {
                    GeneratedMessageV3.invokeOrDie(this.setValueMethod, builder, ((EnumValueDescriptor)value).getNumber());
                } else {
                    super.set(builder, GeneratedMessageV3.invokeOrDie(this.valueOfMethod, (Object)null, value));
                }
            }
        }

        private static class MapFieldAccessor implements GeneratedMessageV3.FieldAccessorTable.FieldAccessor {
            private final FieldDescriptor field;
            private final Message mapEntryMessageDefaultInstance;

            MapFieldAccessor(FieldDescriptor descriptor, String camelCaseName, Class<? extends GeneratedMessageV3> messageClass, Class<? extends GeneratedMessageV3.Builder> builderClass) {
                this.field = descriptor;
                Method getDefaultInstanceMethod = GeneratedMessageV3.getMethodOrDie(messageClass, "getDefaultInstance");
                MapField defaultMapField = this.getMapField((GeneratedMessageV3)GeneratedMessageV3.invokeOrDie(getDefaultInstanceMethod, (Object)null));
                this.mapEntryMessageDefaultInstance = defaultMapField.getMapEntryMessageDefaultInstance();
            }

            private MapField<?, ?> getMapField(GeneratedMessageV3 message) {
                return message.internalGetMapField(this.field.getNumber());
            }

            private MapField<?, ?> getMapField(GeneratedMessageV3.Builder builder) {
                return builder.internalGetMapField(this.field.getNumber());
            }

            private MapField<?, ?> getMutableMapField(GeneratedMessageV3.Builder builder) {
                return builder.internalGetMutableMapField(this.field.getNumber());
            }

            private Message coerceType(Message value) {
                if (value == null) {
                    return null;
                } else {
                    return this.mapEntryMessageDefaultInstance.getClass().isInstance(value) ? value : this.mapEntryMessageDefaultInstance.toBuilder().mergeFrom(value).build();
                }
            }

            public Object get(GeneratedMessageV3 message) {
                List result = new ArrayList();

                for(int i = 0; i < this.getRepeatedCount(message); ++i) {
                    result.add(this.getRepeated(message, i));
                }

                return Collections.unmodifiableList(result);
            }

            public Object get(GeneratedMessageV3.Builder builder) {
                List result = new ArrayList();

                for(int i = 0; i < this.getRepeatedCount(builder); ++i) {
                    result.add(this.getRepeated(builder, i));
                }

                return Collections.unmodifiableList(result);
            }

            public Object getRaw(GeneratedMessageV3 message) {
                return this.get(message);
            }

            public Object getRaw(GeneratedMessageV3.Builder builder) {
                return this.get(builder);
            }

            public void set(GeneratedMessageV3.Builder builder, Object value) {
                this.clear(builder);
                Iterator var3 = ((List)value).iterator();

                while(var3.hasNext()) {
                    Object entry = var3.next();
                    this.addRepeated(builder, entry);
                }

            }

            public Object getRepeated(GeneratedMessageV3 message, int index) {
                return this.getMapField(message).getList().get(index);
            }

            public Object getRepeated(GeneratedMessageV3.Builder builder, int index) {
                return this.getMapField(builder).getList().get(index);
            }

            public Object getRepeatedRaw(GeneratedMessageV3 message, int index) {
                return this.getRepeated(message, index);
            }

            public Object getRepeatedRaw(GeneratedMessageV3.Builder builder, int index) {
                return this.getRepeated(builder, index);
            }

            public void setRepeated(GeneratedMessageV3.Builder builder, int index, Object value) {
                this.getMutableMapField(builder).getMutableList().set(index, this.coerceType((Message)value));
            }

            public void addRepeated(GeneratedMessageV3.Builder builder, Object value) {
                this.getMutableMapField(builder).getMutableList().add(this.coerceType((Message)value));
            }

            public boolean has(GeneratedMessageV3 message) {
                throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
            }

            public boolean has(GeneratedMessageV3.Builder builder) {
                throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
            }

            public int getRepeatedCount(GeneratedMessageV3 message) {
                return this.getMapField(message).getList().size();
            }

            public int getRepeatedCount(GeneratedMessageV3.Builder builder) {
                return this.getMapField(builder).getList().size();
            }

            public void clear(GeneratedMessageV3.Builder builder) {
                this.getMutableMapField(builder).getMutableList().clear();
            }

            public com.google.protobuf.Message.Builder newBuilder() {
                return this.mapEntryMessageDefaultInstance.newBuilderForType();
            }

            public com.google.protobuf.Message.Builder getBuilder(GeneratedMessageV3.Builder builder) {
                throw new UnsupportedOperationException("Nested builder not supported for map fields.");
            }

            public com.google.protobuf.Message.Builder getRepeatedBuilder(GeneratedMessageV3.Builder builder, int index) {
                throw new UnsupportedOperationException("Nested builder not supported for map fields.");
            }
        }

        private static class RepeatedFieldAccessor implements GeneratedMessageV3.FieldAccessorTable.FieldAccessor {
            public final Class type;
            public final GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.MethodInvoker invoker;

            RepeatedFieldAccessor(FieldDescriptor descriptor, String camelCaseName, Class<? extends GeneratedMessageV3> messageClass, Class<? extends GeneratedMessageV3.Builder> builderClass) {
                GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.ReflectionInvoker reflectionInvoker = new GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.ReflectionInvoker(descriptor, camelCaseName, messageClass, builderClass);
                this.type = reflectionInvoker.getRepeatedMethod.getReturnType();
                this.invoker = tryGetMethodHandleInvoke(reflectionInvoker);
            }

            static GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.MethodInvoker tryGetMethodHandleInvoke(GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.ReflectionInvoker accessor) {
                if (GeneratedMessageV3.forTestUseReflection) {
                    return accessor;
                } else {
                    try {
                        return new GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.MethodHandleInvoker(accessor);
                    } catch (NoClassDefFoundError var2) {
                        return accessor;
                    } catch (IllegalAccessException var3) {
                        throw new RuntimeException(var3);
                    }
                }
            }

            public Object get(GeneratedMessageV3 message) {
                return this.invoker.get(message);
            }

            public Object get(GeneratedMessageV3.Builder builder) {
                return this.invoker.get(builder);
            }

            public Object getRaw(GeneratedMessageV3 message) {
                return this.get(message);
            }

            public Object getRaw(GeneratedMessageV3.Builder builder) {
                return this.get(builder);
            }

            public void set(GeneratedMessageV3.Builder builder, Object value) {
                this.clear(builder);
                Iterator var3 = ((List)value).iterator();

                while(var3.hasNext()) {
                    Object element = var3.next();
                    this.addRepeated(builder, element);
                }

            }

            public Object getRepeated(GeneratedMessageV3 message, int index) {
                return this.invoker.getRepeated(message, index);
            }

            public Object getRepeated(GeneratedMessageV3.Builder builder, int index) {
                return this.invoker.getRepeated(builder, index);
            }

            public Object getRepeatedRaw(GeneratedMessageV3 message, int index) {
                return this.getRepeated(message, index);
            }

            public Object getRepeatedRaw(GeneratedMessageV3.Builder builder, int index) {
                return this.getRepeated(builder, index);
            }

            public void setRepeated(GeneratedMessageV3.Builder builder, int index, Object value) {
                this.invoker.setRepeated(builder, index, value);
            }

            public void addRepeated(GeneratedMessageV3.Builder builder, Object value) {
                this.invoker.addRepeated(builder, value);
            }

            public boolean has(GeneratedMessageV3 message) {
                throw new UnsupportedOperationException("hasField() called on a repeated field.");
            }

            public boolean has(GeneratedMessageV3.Builder builder) {
                throw new UnsupportedOperationException("hasField() called on a repeated field.");
            }

            public int getRepeatedCount(GeneratedMessageV3 message) {
                return this.invoker.getRepeatedCount(message);
            }

            public int getRepeatedCount(GeneratedMessageV3.Builder builder) {
                return this.invoker.getRepeatedCount(builder);
            }

            public void clear(GeneratedMessageV3.Builder builder) {
                this.invoker.clear(builder);
            }

            public com.google.protobuf.Message.Builder newBuilder() {
                throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
            }

            public com.google.protobuf.Message.Builder getBuilder(GeneratedMessageV3.Builder builder) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }

            public com.google.protobuf.Message.Builder getRepeatedBuilder(GeneratedMessageV3.Builder builder, int index) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }

            private static final class MethodHandleInvoker implements GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.MethodInvoker {
                public final MethodHandle getMethod;
                public final MethodHandle getMethodBuilder;
                public final MethodHandle getRepeatedMethod;
                public final MethodHandle getRepeatedMethodBuilder;
                public final MethodHandle setRepeatedMethod;
                public final MethodHandle addRepeatedMethod;
                public final MethodHandle getCountMethod;
                public final MethodHandle getCountMethodBuilder;
                public final MethodHandle clearMethod;

                MethodHandleInvoker(GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.ReflectionInvoker accessor) throws IllegalAccessException {
                    Lookup lookup = MethodHandles.lookup();
                    this.getMethod = lookup.unreflect(accessor.getMethod);
                    this.getMethodBuilder = lookup.unreflect(accessor.getMethodBuilder);
                    this.getRepeatedMethod = lookup.unreflect(accessor.getRepeatedMethod);
                    this.getRepeatedMethodBuilder = lookup.unreflect(accessor.getRepeatedMethodBuilder);
                    this.setRepeatedMethod = lookup.unreflect(accessor.setRepeatedMethod);
                    this.addRepeatedMethod = lookup.unreflect(accessor.addRepeatedMethod);
                    this.getCountMethod = lookup.unreflect(accessor.getCountMethod);
                    this.getCountMethodBuilder = lookup.unreflect(accessor.getCountMethodBuilder);
                    this.clearMethod = lookup.unreflect(accessor.clearMethod);
                }

                public Object get(GeneratedMessageV3 message) {
                    try {
                        return this.getMethod.invoke(message);
                    } catch (Throwable var3) {
                        throw GeneratedMessageV3.handleException(var3);
                    }
                }

                public Object get(GeneratedMessageV3.Builder<?> builder) {
                    try {
                        return this.getMethodBuilder.invoke(builder);
                    } catch (Throwable var3) {
                        throw GeneratedMessageV3.handleException(var3);
                    }
                }

                public Object getRepeated(GeneratedMessageV3 message, int index) {
                    try {
                        return this.getRepeatedMethod.invoke(message, index);
                    } catch (Throwable var4) {
                        throw GeneratedMessageV3.handleException(var4);
                    }
                }

                public Object getRepeated(GeneratedMessageV3.Builder<?> builder, int index) {
                    try {
                        return this.getRepeatedMethodBuilder.invoke(builder, index);
                    } catch (Throwable var4) {
                        throw GeneratedMessageV3.handleException(var4);
                    }
                }

                public void setRepeated(GeneratedMessageV3.Builder<?> builder, int index, Object value) {
                    try {
                        this.setRepeatedMethod.invoke(builder, index, value);
                    } catch (Throwable var5) {
                        throw GeneratedMessageV3.handleException(var5);
                    }
                }

                public void addRepeated(GeneratedMessageV3.Builder<?> builder, Object value) {
                    try {
                        this.addRepeatedMethod.invoke(builder, value);
                    } catch (Throwable var4) {
                        throw GeneratedMessageV3.handleException(var4);
                    }
                }

                public int getRepeatedCount(GeneratedMessageV3 message) {
                    try {
                        return (int) this.getCountMethod.invoke(message);
                    } catch (Throwable var3) {
                        throw GeneratedMessageV3.handleException(var3);
                    }
                }

                public int getRepeatedCount(GeneratedMessageV3.Builder<?> builder) {
                    try {
                        return (int) this.getCountMethodBuilder.invoke(builder);
                    } catch (Throwable var3) {
                        throw GeneratedMessageV3.handleException(var3);
                    }
                }

                public void clear(GeneratedMessageV3.Builder<?> builder) {
                    try {
                        this.clearMethod.invoke(builder);
                    } catch (Throwable var3) {
                        throw GeneratedMessageV3.handleException(var3);
                    }
                }
            }

            private static final class ReflectionInvoker implements GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.MethodInvoker {
                public final Method getMethod;
                public final Method getMethodBuilder;
                public final Method getRepeatedMethod;
                public final Method getRepeatedMethodBuilder;
                public final Method setRepeatedMethod;
                public final Method addRepeatedMethod;
                public final Method getCountMethod;
                public final Method getCountMethodBuilder;
                public final Method clearMethod;

                ReflectionInvoker(FieldDescriptor descriptor, String camelCaseName, Class<? extends GeneratedMessageV3> messageClass, Class<? extends GeneratedMessageV3.Builder> builderClass) {
                    this.getMethod = GeneratedMessageV3.getMethodOrDie(messageClass, "get" + camelCaseName + "List");
                    this.getMethodBuilder = GeneratedMessageV3.getMethodOrDie(builderClass, "get" + camelCaseName + "List");
                    this.getRepeatedMethod = GeneratedMessageV3.getMethodOrDie(messageClass, "get" + camelCaseName, Integer.TYPE);
                    this.getRepeatedMethodBuilder = GeneratedMessageV3.getMethodOrDie(builderClass, "get" + camelCaseName, Integer.TYPE);
                    Class<?> type = this.getRepeatedMethod.getReturnType();
                    this.setRepeatedMethod = GeneratedMessageV3.getMethodOrDie(builderClass, "set" + camelCaseName, Integer.TYPE, type);
                    this.addRepeatedMethod = GeneratedMessageV3.getMethodOrDie(builderClass, "add" + camelCaseName, type);
                    this.getCountMethod = GeneratedMessageV3.getMethodOrDie(messageClass, "get" + camelCaseName + "Count");
                    this.getCountMethodBuilder = GeneratedMessageV3.getMethodOrDie(builderClass, "get" + camelCaseName + "Count");
                    this.clearMethod = GeneratedMessageV3.getMethodOrDie(builderClass, "clear" + camelCaseName);
                }

                public Object get(GeneratedMessageV3 message) {
                    return GeneratedMessageV3.invokeOrDie(this.getMethod, message);
                }

                public Object get(GeneratedMessageV3.Builder<?> builder) {
                    return GeneratedMessageV3.invokeOrDie(this.getMethodBuilder, builder);
                }

                public Object getRepeated(GeneratedMessageV3 message, int index) {
                    return GeneratedMessageV3.invokeOrDie(this.getRepeatedMethod, message, index);
                }

                public Object getRepeated(GeneratedMessageV3.Builder<?> builder, int index) {
                    return GeneratedMessageV3.invokeOrDie(this.getRepeatedMethodBuilder, builder, index);
                }

                public void setRepeated(GeneratedMessageV3.Builder<?> builder, int index, Object value) {
                    GeneratedMessageV3.invokeOrDie(this.setRepeatedMethod, builder, index, value);
                }

                public void addRepeated(GeneratedMessageV3.Builder<?> builder, Object value) {
                    GeneratedMessageV3.invokeOrDie(this.addRepeatedMethod, builder, value);
                }

                public int getRepeatedCount(GeneratedMessageV3 message) {
                    return (Integer)GeneratedMessageV3.invokeOrDie(this.getCountMethod, message);
                }

                public int getRepeatedCount(GeneratedMessageV3.Builder<?> builder) {
                    return (Integer)GeneratedMessageV3.invokeOrDie(this.getCountMethodBuilder, builder);
                }

                public void clear(GeneratedMessageV3.Builder<?> builder) {
                    GeneratedMessageV3.invokeOrDie(this.clearMethod, builder);
                }
            }

            interface MethodInvoker {
                Object get(GeneratedMessageV3 var1);

                Object get(GeneratedMessageV3.Builder<?> var1);

                Object getRepeated(GeneratedMessageV3 var1, int var2);

                Object getRepeated(GeneratedMessageV3.Builder<?> var1, int var2);

                void setRepeated(GeneratedMessageV3.Builder<?> var1, int var2, Object var3);

                void addRepeated(GeneratedMessageV3.Builder<?> var1, Object var2);

                int getRepeatedCount(GeneratedMessageV3 var1);

                int getRepeatedCount(GeneratedMessageV3.Builder<?> var1);

                void clear(GeneratedMessageV3.Builder<?> var1);
            }
        }

        private static class SingularFieldAccessor implements GeneratedMessageV3.FieldAccessorTable.FieldAccessor {
            public final Class<?> type;
            public final FieldDescriptor field;
            public final boolean isOneofField;
            public final boolean hasHasMethod;
            public final GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.MethodInvoker invoker;

            SingularFieldAccessor(FieldDescriptor descriptor, String camelCaseName, Class<? extends GeneratedMessageV3> messageClass, Class<? extends GeneratedMessageV3.Builder> builderClass, String containingOneofCamelCaseName) {
                this.isOneofField = descriptor.getContainingOneof() != null;
                this.hasHasMethod = GeneratedMessageV3.FieldAccessorTable.supportFieldPresence(descriptor.getFile()) || !this.isOneofField && descriptor.getJavaType() == JavaType.MESSAGE;
                GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.ReflectionInvoker reflectionInvoker = new GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.ReflectionInvoker(descriptor, camelCaseName, messageClass, builderClass, containingOneofCamelCaseName, this.isOneofField, this.hasHasMethod);
                this.field = descriptor;
                this.type = reflectionInvoker.getMethod.getReturnType();
                this.invoker = tryGetMethodHandleInvoke(reflectionInvoker);
            }

            static GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.MethodInvoker tryGetMethodHandleInvoke(GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.ReflectionInvoker accessor) {
                if (GeneratedMessageV3.forTestUseReflection) {
                    return accessor;
                } else {
                    try {
                        return new GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.MethodHandleInvoker(accessor);
                    } catch (NoClassDefFoundError var2) {
                        return accessor;
                    } catch (IllegalAccessException var3) {
                        throw new RuntimeException(var3);
                    }
                }
            }

            public Object get(GeneratedMessageV3 message) {
                return this.invoker.get(message);
            }

            public Object get(GeneratedMessageV3.Builder builder) {
                return this.invoker.get(builder);
            }

            public Object getRaw(GeneratedMessageV3 message) {
                return this.get(message);
            }

            public Object getRaw(GeneratedMessageV3.Builder builder) {
                return this.get(builder);
            }

            public void set(GeneratedMessageV3.Builder builder, Object value) {
                this.invoker.set(builder, value);
            }

            public Object getRepeated(GeneratedMessageV3 message, int index) {
                throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
            }

            public Object getRepeatedRaw(GeneratedMessageV3 message, int index) {
                throw new UnsupportedOperationException("getRepeatedFieldRaw() called on a singular field.");
            }

            public Object getRepeated(GeneratedMessageV3.Builder builder, int index) {
                throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
            }

            public Object getRepeatedRaw(GeneratedMessageV3.Builder builder, int index) {
                throw new UnsupportedOperationException("getRepeatedFieldRaw() called on a singular field.");
            }

            public void setRepeated(GeneratedMessageV3.Builder builder, int index, Object value) {
                throw new UnsupportedOperationException("setRepeatedField() called on a singular field.");
            }

            public void addRepeated(GeneratedMessageV3.Builder builder, Object value) {
                throw new UnsupportedOperationException("addRepeatedField() called on a singular field.");
            }

            public boolean has(GeneratedMessageV3 message) {
                if (!this.hasHasMethod) {
                    if (this.isOneofField) {
                        return this.invoker.getOneofFieldNumber(message) == this.field.getNumber();
                    } else {
                        return !this.get(message).equals(this.field.getDefaultValue());
                    }
                } else {
                    return this.invoker.has(message);
                }
            }

            public boolean has(GeneratedMessageV3.Builder builder) {
                if (!this.hasHasMethod) {
                    if (this.isOneofField) {
                        return this.invoker.getOneofFieldNumber(builder) == this.field.getNumber();
                    } else {
                        return !this.get(builder).equals(this.field.getDefaultValue());
                    }
                } else {
                    return this.invoker.has(builder);
                }
            }

            public int getRepeatedCount(GeneratedMessageV3 message) {
                throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
            }

            public int getRepeatedCount(GeneratedMessageV3.Builder builder) {
                throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
            }

            public void clear(GeneratedMessageV3.Builder builder) {
                this.invoker.clear(builder);
            }

            public com.google.protobuf.Message.Builder newBuilder() {
                throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
            }

            public com.google.protobuf.Message.Builder getBuilder(GeneratedMessageV3.Builder builder) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }

            public com.google.protobuf.Message.Builder getRepeatedBuilder(GeneratedMessageV3.Builder builder, int index) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }

            private static final class MethodHandleInvoker implements GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.MethodInvoker {
                public final MethodHandle getMethod;
                public final MethodHandle getMethodBuilder;
                public final MethodHandle setMethod;
                public final MethodHandle hasMethod;
                public final MethodHandle hasMethodBuilder;
                public final MethodHandle clearMethod;
                public final MethodHandle caseMethod;
                public final MethodHandle caseMethodBuilder;

                MethodHandleInvoker(GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.ReflectionInvoker accessor) throws IllegalAccessException {
                    Lookup lookup = MethodHandles.publicLookup();
                    this.getMethod = lookup.unreflect(accessor.getMethod);
                    this.getMethodBuilder = lookup.unreflect(accessor.getMethodBuilder);
                    this.setMethod = lookup.unreflect(accessor.setMethod);
                    this.hasMethod = accessor.hasMethod != null ? lookup.unreflect(accessor.hasMethod) : null;
                    this.hasMethodBuilder = accessor.hasMethodBuilder != null ? lookup.unreflect(accessor.hasMethodBuilder) : null;
                    this.clearMethod = lookup.unreflect(accessor.clearMethod);
                    this.caseMethod = accessor.caseMethod != null ? lookup.unreflect(accessor.caseMethod) : null;
                    this.caseMethodBuilder = accessor.caseMethodBuilder != null ? lookup.unreflect(accessor.caseMethodBuilder) : null;
                }

                public Object get(GeneratedMessageV3 message) {
                    try {
                        return this.getMethod.invoke(message);
                    } catch (Throwable var3) {
                        throw GeneratedMessageV3.handleException(var3);
                    }
                }

                public Object get(GeneratedMessageV3.Builder<?> builder) {
                    try {
                        return this.getMethodBuilder.invoke(builder);
                    } catch (Throwable var3) {
                        throw GeneratedMessageV3.handleException(var3);
                    }
                }

                public int getOneofFieldNumber(GeneratedMessageV3 message) {
                    try {
                        return ((InternalOneOfEnum)this.caseMethod.invoke(message)).getNumber();
                    } catch (Throwable var3) {
                        throw GeneratedMessageV3.handleException(var3);
                    }
                }

                public int getOneofFieldNumber(GeneratedMessageV3.Builder<?> builder) {
                    try {
                        return ((InternalOneOfEnum)this.caseMethodBuilder.invoke(builder)).getNumber();
                    } catch (Throwable var3) {
                        throw GeneratedMessageV3.handleException(var3);
                    }
                }

                public void set(GeneratedMessageV3.Builder<?> builder, Object value) {
                    try {
                        this.setMethod.invoke(builder, value);
                    } catch (Throwable var4) {
                        throw GeneratedMessageV3.handleException(var4);
                    }
                }

                public boolean has(GeneratedMessageV3 message) {
                    try {
                        return (boolean) this.hasMethod.invoke(message);
                    } catch (Throwable var3) {
                        throw GeneratedMessageV3.handleException(var3);
                    }
                }

                public boolean has(GeneratedMessageV3.Builder<?> builder) {
                    try {
                        return (boolean) this.hasMethodBuilder.invoke(builder);
                    } catch (Throwable var3) {
                        throw GeneratedMessageV3.handleException(var3);
                    }
                }

                public void clear(GeneratedMessageV3.Builder<?> builder) {
                    try {
                        this.clearMethod.invoke(builder);
                    } catch (Throwable var3) {
                        throw GeneratedMessageV3.handleException(var3);
                    }
                }
            }

            private static final class ReflectionInvoker implements GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.MethodInvoker {
                public final Method getMethod;
                public final Method getMethodBuilder;
                public final Method setMethod;
                public final Method hasMethod;
                public final Method hasMethodBuilder;
                public final Method clearMethod;
                public final Method caseMethod;
                public final Method caseMethodBuilder;

                ReflectionInvoker(FieldDescriptor descriptor, String camelCaseName, Class<? extends GeneratedMessageV3> messageClass, Class<? extends GeneratedMessageV3.Builder> builderClass, String containingOneofCamelCaseName, boolean isOneofField, boolean hasHasMethod) {
                    this.getMethod = GeneratedMessageV3.getMethodOrDie(messageClass, "get" + camelCaseName);
                    this.getMethodBuilder = GeneratedMessageV3.getMethodOrDie(builderClass, "get" + camelCaseName);
                    Class<?> type = this.getMethod.getReturnType();
                    this.setMethod = GeneratedMessageV3.getMethodOrDie(builderClass, "set" + camelCaseName, type);
                    this.hasMethod = hasHasMethod ? GeneratedMessageV3.getMethodOrDie(messageClass, "has" + camelCaseName) : null;
                    this.hasMethodBuilder = hasHasMethod ? GeneratedMessageV3.getMethodOrDie(builderClass, "has" + camelCaseName) : null;
                    this.clearMethod = GeneratedMessageV3.getMethodOrDie(builderClass, "clear" + camelCaseName);
                    this.caseMethod = isOneofField ? GeneratedMessageV3.getMethodOrDie(messageClass, "get" + containingOneofCamelCaseName + "Case") : null;
                    this.caseMethodBuilder = isOneofField ? GeneratedMessageV3.getMethodOrDie(builderClass, "get" + containingOneofCamelCaseName + "Case") : null;
                }

                public Object get(GeneratedMessageV3 message) {
                    return GeneratedMessageV3.invokeOrDie(this.getMethod, message);
                }

                public Object get(GeneratedMessageV3.Builder<?> builder) {
                    return GeneratedMessageV3.invokeOrDie(this.getMethodBuilder, builder);
                }

                public int getOneofFieldNumber(GeneratedMessageV3 message) {
                    return ((EnumLite)GeneratedMessageV3.invokeOrDie(this.caseMethod, message)).getNumber();
                }

                public int getOneofFieldNumber(GeneratedMessageV3.Builder<?> builder) {
                    return ((EnumLite)GeneratedMessageV3.invokeOrDie(this.caseMethodBuilder, builder)).getNumber();
                }

                public void set(GeneratedMessageV3.Builder<?> builder, Object value) {
                    GeneratedMessageV3.invokeOrDie(this.setMethod, builder, value);
                }

                public boolean has(GeneratedMessageV3 message) {
                    return (Boolean)GeneratedMessageV3.invokeOrDie(this.hasMethod, message);
                }

                public boolean has(GeneratedMessageV3.Builder<?> builder) {
                    return (Boolean)GeneratedMessageV3.invokeOrDie(this.hasMethodBuilder, builder);
                }

                public void clear(GeneratedMessageV3.Builder<?> builder) {
                    GeneratedMessageV3.invokeOrDie(this.clearMethod, builder);
                }
            }

            private interface MethodInvoker {
                Object get(GeneratedMessageV3 var1);

                Object get(GeneratedMessageV3.Builder<?> var1);

                int getOneofFieldNumber(GeneratedMessageV3 var1);

                int getOneofFieldNumber(GeneratedMessageV3.Builder<?> var1);

                void set(GeneratedMessageV3.Builder<?> var1, Object var2);

                boolean has(GeneratedMessageV3 var1);

                boolean has(GeneratedMessageV3.Builder<?> var1);

                void clear(GeneratedMessageV3.Builder<?> var1);
            }
        }

        private static class OneofAccessor {
            private final Descriptor descriptor;
            private final Method caseMethod;
            private final Method caseMethodBuilder;
            private final Method clearMethod;

            OneofAccessor(Descriptor descriptor, String camelCaseName, Class<? extends GeneratedMessageV3> messageClass, Class<? extends GeneratedMessageV3.Builder> builderClass) {
                this.descriptor = descriptor;
                this.caseMethod = GeneratedMessageV3.getMethodOrDie(messageClass, "get" + camelCaseName + "Case");
                this.caseMethodBuilder = GeneratedMessageV3.getMethodOrDie(builderClass, "get" + camelCaseName + "Case");
                this.clearMethod = GeneratedMessageV3.getMethodOrDie(builderClass, "clear" + camelCaseName);
            }

            public boolean has(GeneratedMessageV3 message) {
                return ((EnumLite)GeneratedMessageV3.invokeOrDie(this.caseMethod, message)).getNumber() != 0;
            }

            public boolean has(GeneratedMessageV3.Builder builder) {
                return ((EnumLite)GeneratedMessageV3.invokeOrDie(this.caseMethodBuilder, builder)).getNumber() != 0;
            }

            public FieldDescriptor get(GeneratedMessageV3 message) {
                int fieldNumber = ((EnumLite)GeneratedMessageV3.invokeOrDie(this.caseMethod, message)).getNumber();
                return fieldNumber > 0 ? this.descriptor.findFieldByNumber(fieldNumber) : null;
            }

            public FieldDescriptor get(GeneratedMessageV3.Builder builder) {
                int fieldNumber = ((EnumLite)GeneratedMessageV3.invokeOrDie(this.caseMethodBuilder, builder)).getNumber();
                return fieldNumber > 0 ? this.descriptor.findFieldByNumber(fieldNumber) : null;
            }

            public void clear(GeneratedMessageV3.Builder builder) {
                GeneratedMessageV3.invokeOrDie(this.clearMethod, builder);
            }
        }

        private interface FieldAccessor {
            Object get(GeneratedMessageV3 var1);

            Object get(GeneratedMessageV3.Builder var1);

            Object getRaw(GeneratedMessageV3 var1);

            Object getRaw(GeneratedMessageV3.Builder var1);

            void set(GeneratedMessageV3.Builder var1, Object var2);

            Object getRepeated(GeneratedMessageV3 var1, int var2);

            Object getRepeated(GeneratedMessageV3.Builder var1, int var2);

            Object getRepeatedRaw(GeneratedMessageV3 var1, int var2);

            Object getRepeatedRaw(GeneratedMessageV3.Builder var1, int var2);

            void setRepeated(GeneratedMessageV3.Builder var1, int var2, Object var3);

            void addRepeated(GeneratedMessageV3.Builder var1, Object var2);

            boolean has(GeneratedMessageV3 var1);

            boolean has(GeneratedMessageV3.Builder var1);

            int getRepeatedCount(GeneratedMessageV3 var1);

            int getRepeatedCount(GeneratedMessageV3.Builder var1);

            void clear(GeneratedMessageV3.Builder var1);

            com.google.protobuf.Message.Builder newBuilder();

            com.google.protobuf.Message.Builder getBuilder(GeneratedMessageV3.Builder var1);

            com.google.protobuf.Message.Builder getRepeatedBuilder(GeneratedMessageV3.Builder var1, int var2);
        }
    }

    interface ExtensionDescriptorRetriever {
        FieldDescriptor getDescriptor();
    }

    public abstract static class ExtendableBuilder<MessageType extends GeneratedMessageV3.ExtendableMessage, BuilderType extends GeneratedMessageV3.ExtendableBuilder<MessageType, BuilderType>> extends GeneratedMessageV3.Builder<BuilderType> implements GeneratedMessageV3.ExtendableMessageOrBuilder<MessageType> {
        private com.google.protobuf.FieldSet.Builder<FieldDescriptor> extensions;

        public ExtendableBuilder() {
        }

        public ExtendableBuilder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
        }

        void internalSetExtensionSet(FieldSet<FieldDescriptor> extensions) {
            this.extensions = com.google.protobuf.FieldSet.Builder.fromFieldSet(extensions);
        }

        public BuilderType clear() {
            this.extensions = null;
            return (BuilderType) super.clear();
        }

        private void ensureExtensionsIsMutable() {
            if (this.extensions == null) {
                this.extensions = FieldSet.newBuilder();
            }

        }

        private void verifyExtensionContainingType(Extension<MessageType, ?> extension) {
            if (extension.getDescriptor().getContainingType() != this.getDescriptorForType()) {
                throw new IllegalArgumentException("Extension is for type \"" + extension.getDescriptor().getContainingType().getFullName() + "\" which does not match message type \"" + this.getDescriptorForType().getFullName() + "\".");
            }
        }

        public final <Type> boolean hasExtension(ExtensionLite<MessageType, Type> extensionLite) {
            Extension<MessageType, Type> extension = GeneratedMessageV3.checkNotLite(extensionLite);
            this.verifyExtensionContainingType(extension);
            return this.extensions == null ? false : this.extensions.hasField(extension.getDescriptor());
        }

        public final <Type> int getExtensionCount(ExtensionLite<MessageType, List<Type>> extensionLite) {
            Extension<MessageType, List<Type>> extension = GeneratedMessageV3.checkNotLite(extensionLite);
            this.verifyExtensionContainingType(extension);
            FieldDescriptor descriptor = extension.getDescriptor();
            return this.extensions == null ? 0 : this.extensions.getRepeatedFieldCount(descriptor);
        }

        public final <Type> Type getExtension(ExtensionLite<MessageType, Type> extensionLite) {
            Extension<MessageType, Type> extension = GeneratedMessageV3.checkNotLite(extensionLite);
            this.verifyExtensionContainingType(extension);
            FieldDescriptor descriptor = extension.getDescriptor();
            Object value = this.extensions == null ? null : this.extensions.getField(descriptor);
            if (value == null) {
                if (descriptor.isRepeated()) {
                    return (Type) Collections.emptyList();
                } else {
                    return (Type) (descriptor.getJavaType() == JavaType.MESSAGE ? extension.getMessageDefaultInstance() : extension.fromReflectionType(descriptor.getDefaultValue()));
                }
            } else {
                return (Type) extension.fromReflectionType(value);
            }
        }

        public final <Type> Type getExtension(ExtensionLite<MessageType, List<Type>> extensionLite, int index) {
            Extension<MessageType, List<Type>> extension = GeneratedMessageV3.checkNotLite(extensionLite);
            this.verifyExtensionContainingType(extension);
            FieldDescriptor descriptor = extension.getDescriptor();
            if (this.extensions == null) {
                throw new IndexOutOfBoundsException();
            } else {
                return (Type) extension.singularFromReflectionType(this.extensions.getRepeatedField(descriptor, index));
            }
        }

        public final <Type> BuilderType setExtension(ExtensionLite<MessageType, Type> extensionLite, Type value) {
            Extension<MessageType, Type> extension = GeneratedMessageV3.checkNotLite(extensionLite);
            this.verifyExtensionContainingType(extension);
            this.ensureExtensionsIsMutable();
            FieldDescriptor descriptor = extension.getDescriptor();
            this.extensions.setField(descriptor, extension.toReflectionType(value));
            this.onChanged();
            return (BuilderType) this;
        }

        public final <Type> BuilderType setExtension(ExtensionLite<MessageType, List<Type>> extensionLite, int index, Type value) {
            Extension<MessageType, List<Type>> extension = GeneratedMessageV3.checkNotLite(extensionLite);
            this.verifyExtensionContainingType(extension);
            this.ensureExtensionsIsMutable();
            FieldDescriptor descriptor = extension.getDescriptor();
            this.extensions.setRepeatedField(descriptor, index, extension.singularToReflectionType(value));
            this.onChanged();
            return (BuilderType) this;
        }

        public final <Type> BuilderType addExtension(ExtensionLite<MessageType, List<Type>> extensionLite, Type value) {
            Extension<MessageType, List<Type>> extension = GeneratedMessageV3.checkNotLite(extensionLite);
            this.verifyExtensionContainingType(extension);
            this.ensureExtensionsIsMutable();
            FieldDescriptor descriptor = extension.getDescriptor();
            this.extensions.addRepeatedField(descriptor, extension.singularToReflectionType(value));
            this.onChanged();
            return (BuilderType) this;
        }

        public final <Type> BuilderType clearExtension(ExtensionLite<MessageType, ?> extensionLite) {
            Extension<MessageType, ?> extension = GeneratedMessageV3.checkNotLite(extensionLite);
            this.verifyExtensionContainingType(extension);
            this.ensureExtensionsIsMutable();
            this.extensions.clearField(extension.getDescriptor());
            this.onChanged();
            return (BuilderType) this;
        }

        public final <Type> boolean hasExtension(Extension<MessageType, Type> extension) {
            return this.hasExtension((ExtensionLite)extension);
        }

        public final <Type> boolean hasExtension(GeneratedExtension<MessageType, Type> extension) {
            return this.hasExtension((ExtensionLite)extension);
        }

        public final <Type> int getExtensionCount(Extension<MessageType, List<Type>> extension) {
            return this.getExtensionCount((ExtensionLite)extension);
        }

        public final <Type> int getExtensionCount(GeneratedExtension<MessageType, List<Type>> extension) {
            return this.getExtensionCount((ExtensionLite)extension);
        }

        public final <Type> Type getExtension(Extension<MessageType, Type> extension) {
            return (Type) this.getExtension((ExtensionLite)extension);
        }

        public final <Type> Type getExtension(GeneratedExtension<MessageType, Type> extension) {
            return (Type) this.getExtension((ExtensionLite)extension);
        }

        public final <Type> Type getExtension(Extension<MessageType, List<Type>> extension, int index) {
            return (Type) this.getExtension((ExtensionLite)extension, index);
        }

        public final <Type> Type getExtension(GeneratedExtension<MessageType, List<Type>> extension, int index) {
            return (Type) this.getExtension((ExtensionLite)extension, index);
        }

        public final <Type> BuilderType setExtension(Extension<MessageType, Type> extension, Type value) {
            return (BuilderType)this.setExtension((ExtensionLite)extension, value);
        }

        public <Type> BuilderType setExtension(GeneratedExtension<MessageType, Type> extension, Type value) {
            return (BuilderType)this.setExtension((ExtensionLite)extension, value);
        }

        public final <Type> BuilderType setExtension(Extension<MessageType, List<Type>> extension, int index, Type value) {
            return (BuilderType)this.setExtension((ExtensionLite)extension, index, value);
        }

        public <Type> BuilderType setExtension(GeneratedExtension<MessageType, List<Type>> extension, int index, Type value) {
            return (BuilderType) this.setExtension((ExtensionLite)extension, index, value);
        }

        public final <Type> BuilderType addExtension(Extension<MessageType, List<Type>> extension, Type value) {
            return (BuilderType)this.addExtension((ExtensionLite)extension, value);
        }

        public <Type> BuilderType addExtension(GeneratedExtension<MessageType, List<Type>> extension, Type value) {
            return (BuilderType)this.addExtension((ExtensionLite)extension, value);
        }

        public final <Type> BuilderType clearExtension(Extension<MessageType, ?> extension) {
            return (BuilderType)this.clearExtension((ExtensionLite)extension);
        }

        public <Type> BuilderType clearExtension(GeneratedExtension<MessageType, ?> extension) {
            return (BuilderType)this.clearExtension((ExtensionLite)extension);
        }

        public boolean extensionsAreInitialized() {
            return this.extensions == null ? true : this.extensions.isInitialized();
        }

        private FieldSet<FieldDescriptor> buildExtensions() {
            return this.extensions == null ? FieldSet.emptySet() : this.extensions.build();
        }

        public boolean isInitialized() {
            return super.isInitialized() && this.extensionsAreInitialized();
        }

        public Map<FieldDescriptor, Object> getAllFields() {
            Map<FieldDescriptor, Object> result = super.getAllFieldsMutable();
            if (this.extensions != null) {
                result.putAll(this.extensions.getAllFields());
            }

            return Collections.unmodifiableMap(result);
        }

        public Object getField(FieldDescriptor field) {
            if (field.isExtension()) {
                this.verifyContainingType(field);
                Object value = this.extensions == null ? null : this.extensions.getField(field);
                if (value == null) {
                    return field.getJavaType() == JavaType.MESSAGE ? DynamicMessage.getDefaultInstance(field.getMessageType()) : field.getDefaultValue();
                } else {
                    return value;
                }
            } else {
                return super.getField(field);
            }
        }

        public com.google.protobuf.Message.Builder getFieldBuilder(FieldDescriptor field) {
            if (field.isExtension()) {
                this.verifyContainingType(field);
                if (field.getJavaType() != JavaType.MESSAGE) {
                    throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
                } else {
                    this.ensureExtensionsIsMutable();
                    Object value = this.extensions.getFieldAllowBuilders(field);
                    if (value == null) {
                        com.google.protobuf.Message.Builder builder = DynamicMessage.newBuilder(field.getMessageType());
                        this.extensions.setField(field, builder);
                        this.onChanged();
                        return builder;
                    } else if (value instanceof com.google.protobuf.Message.Builder) {
                        return (com.google.protobuf.Message.Builder)value;
                    } else if (value instanceof Message) {
                        com.google.protobuf.Message.Builder builder = ((Message)value).toBuilder();
                        this.extensions.setField(field, builder);
                        this.onChanged();
                        return builder;
                    } else {
                        throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
                    }
                }
            } else {
                return super.getFieldBuilder(field);
            }
        }

        public int getRepeatedFieldCount(FieldDescriptor field) {
            if (field.isExtension()) {
                this.verifyContainingType(field);
                return this.extensions == null ? 0 : this.extensions.getRepeatedFieldCount(field);
            } else {
                return super.getRepeatedFieldCount(field);
            }
        }

        public Object getRepeatedField(FieldDescriptor field, int index) {
            if (field.isExtension()) {
                this.verifyContainingType(field);
                if (this.extensions == null) {
                    throw new IndexOutOfBoundsException();
                } else {
                    return this.extensions.getRepeatedField(field, index);
                }
            } else {
                return super.getRepeatedField(field, index);
            }
        }

        public com.google.protobuf.Message.Builder getRepeatedFieldBuilder(FieldDescriptor field, int index) {
            if (field.isExtension()) {
                this.verifyContainingType(field);
                this.ensureExtensionsIsMutable();
                if (field.getJavaType() != JavaType.MESSAGE) {
                    throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
                } else {
                    Object value = this.extensions.getRepeatedFieldAllowBuilders(field, index);
                    if (value instanceof com.google.protobuf.Message.Builder) {
                        return (com.google.protobuf.Message.Builder)value;
                    } else if (value instanceof Message) {
                        com.google.protobuf.Message.Builder builder = ((Message)value).toBuilder();
                        this.extensions.setRepeatedField(field, index, builder);
                        this.onChanged();
                        return builder;
                    } else {
                        throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
                    }
                }
            } else {
                return super.getRepeatedFieldBuilder(field, index);
            }
        }

        public boolean hasField(FieldDescriptor field) {
            if (field.isExtension()) {
                this.verifyContainingType(field);
                return this.extensions == null ? false : this.extensions.hasField(field);
            } else {
                return super.hasField(field);
            }
        }

        public BuilderType setField(FieldDescriptor field, Object value) {
            if (field.isExtension()) {
                this.verifyContainingType(field);
                this.ensureExtensionsIsMutable();
                this.extensions.setField(field, value);
                this.onChanged();
                return (BuilderType) this;
            } else {
                return (BuilderType) super.setField(field, value);
            }
        }

        public BuilderType clearField(FieldDescriptor field) {
            if (field.isExtension()) {
                this.verifyContainingType(field);
                this.ensureExtensionsIsMutable();
                this.extensions.clearField(field);
                this.onChanged();
                return (BuilderType) this;
            } else {
                return (BuilderType) super.clearField(field);
            }
        }

        public BuilderType setRepeatedField(FieldDescriptor field, int index, Object value) {
            if (field.isExtension()) {
                this.verifyContainingType(field);
                this.ensureExtensionsIsMutable();
                this.extensions.setRepeatedField(field, index, value);
                this.onChanged();
                return (BuilderType) this;
            } else {
                return (BuilderType) super.setRepeatedField(field, index, value);
            }
        }

        public BuilderType addRepeatedField(FieldDescriptor field, Object value) {
            if (field.isExtension()) {
                this.verifyContainingType(field);
                this.ensureExtensionsIsMutable();
                this.extensions.addRepeatedField(field, value);
                this.onChanged();
                return (BuilderType) this;
            } else {
                return (BuilderType) super.addRepeatedField(field, value);
            }
        }

        public com.google.protobuf.Message.Builder newBuilderForField(FieldDescriptor field) {
            return (com.google.protobuf.Message.Builder)(field.isExtension() ? DynamicMessage.newBuilder(field.getMessageType()) : super.newBuilderForField(field));
        }

        public final void mergeExtensionFields(GeneratedMessageV3.ExtendableMessage other) {
            if (other.extensions != null) {
                this.ensureExtensionsIsMutable();
                this.extensions.mergeFrom(other.extensions);
                this.onChanged();
            }

        }

        private void verifyContainingType(FieldDescriptor field) {
            if (field.getContainingType() != this.getDescriptorForType()) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
        }
    }

    public abstract static class ExtendableMessage<MessageType extends GeneratedMessageV3.ExtendableMessage> extends GeneratedMessageV3 implements GeneratedMessageV3.ExtendableMessageOrBuilder<MessageType> {
        private static final long serialVersionUID = 1L;
        private final FieldSet<FieldDescriptor> extensions;

        public ExtendableMessage() {
            this.extensions = FieldSet.newFieldSet();
        }

        public ExtendableMessage(GeneratedMessageV3.ExtendableBuilder<MessageType, ?> builder) {
            super(builder);
            this.extensions = builder.buildExtensions();
        }

        private void verifyExtensionContainingType(Extension<MessageType, ?> extension) {
            if (extension.getDescriptor().getContainingType() != this.getDescriptorForType()) {
                throw new IllegalArgumentException("Extension is for type \"" + extension.getDescriptor().getContainingType().getFullName() + "\" which does not match message type \"" + this.getDescriptorForType().getFullName() + "\".");
            }
        }

        public final <Type> boolean hasExtension(ExtensionLite<MessageType, Type> extensionLite) {
            Extension<MessageType, Type> extension = GeneratedMessageV3.checkNotLite(extensionLite);
            this.verifyExtensionContainingType(extension);
            return this.extensions.hasField(extension.getDescriptor());
        }

        public final <Type> int getExtensionCount(ExtensionLite<MessageType, List<Type>> extensionLite) {
            Extension<MessageType, List<Type>> extension = GeneratedMessageV3.checkNotLite(extensionLite);
            this.verifyExtensionContainingType(extension);
            FieldDescriptor descriptor = extension.getDescriptor();
            return this.extensions.getRepeatedFieldCount(descriptor);
        }

        public final <Type> Type getExtension(ExtensionLite<MessageType, Type> extensionLite) {
            Extension<MessageType, Type> extension = GeneratedMessageV3.checkNotLite(extensionLite);
            this.verifyExtensionContainingType(extension);
            FieldDescriptor descriptor = extension.getDescriptor();
            Object value = this.extensions.getField(descriptor);
            if (value == null) {
                if (descriptor.isRepeated()) {
                    return (Type) Collections.emptyList();
                } else {
                    return (Type)(descriptor.getJavaType() == JavaType.MESSAGE ?  extension.getMessageDefaultInstance() : extension.fromReflectionType(descriptor.getDefaultValue()));
                }
            } else {
                return (Type) extension.fromReflectionType(value);
            }
        }

        public final <Type> Type getExtension(ExtensionLite<MessageType, List<Type>> extensionLite, int index) {
            Extension<MessageType, List<Type>> extension = GeneratedMessageV3.checkNotLite(extensionLite);
            this.verifyExtensionContainingType(extension);
            FieldDescriptor descriptor = extension.getDescriptor();
            return (Type)extension.singularFromReflectionType(this.extensions.getRepeatedField(descriptor, index));
        }

        public final <Type> boolean hasExtension(Extension<MessageType, Type> extension) {
            return this.hasExtension((ExtensionLite)extension);
        }

        public final <Type> boolean hasExtension(GeneratedExtension<MessageType, Type> extension) {
            return this.hasExtension((ExtensionLite)extension);
        }

        public final <Type> int getExtensionCount(Extension<MessageType, List<Type>> extension) {
            return this.getExtensionCount((ExtensionLite)extension);
        }

        public final <Type> int getExtensionCount(GeneratedExtension<MessageType, List<Type>> extension) {
            return this.getExtensionCount((ExtensionLite)extension);
        }

        public final <Type> Type getExtension(Extension<MessageType, Type> extension) {
            return (Type) this.getExtension((ExtensionLite)extension);
        }

        public final <Type> Type getExtension(GeneratedExtension<MessageType, Type> extension) {
            return (Type) this.getExtension((ExtensionLite)extension);
        }

        public final <Type> Type getExtension(Extension<MessageType, List<Type>> extension, int index) {
            return (Type) this.getExtension((ExtensionLite)extension, index);
        }

        public final <Type> Type getExtension(GeneratedExtension<MessageType, List<Type>> extension, int index) {
            return (Type) this.getExtension((ExtensionLite)extension, index);
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.isInitialized();
        }

        public boolean isInitialized() {
            return super.isInitialized() && this.extensionsAreInitialized();
        }

        public boolean parseUnknownField(CodedInputStream input, com.google.protobuf.UnknownFieldSet.Builder unknownFields, ExtensionRegistryLite extensionRegistry, int tag) throws IOException {
            return MessageReflection.mergeFieldFrom(input, input.shouldDiscardUnknownFields() ? null : unknownFields, extensionRegistry, this.getDescriptorForType(), new ExtensionAdapter(this.extensions), tag);
        }

        public boolean parseUnknownFieldProto3(CodedInputStream input, com.google.protobuf.UnknownFieldSet.Builder unknownFields, ExtensionRegistryLite extensionRegistry, int tag) throws IOException {
            return this.parseUnknownField(input, unknownFields, extensionRegistry, tag);
        }

        public void makeExtensionsImmutable() {
            this.extensions.makeImmutable();
        }

        public GeneratedMessageV3.ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter() {
            return new GeneratedMessageV3.ExtendableMessage.ExtensionWriter(false);
        }

        public GeneratedMessageV3.ExtendableMessage<MessageType>.ExtensionWriter newMessageSetExtensionWriter() {
            return new GeneratedMessageV3.ExtendableMessage.ExtensionWriter(true);
        }

        public int extensionsSerializedSize() {
            return this.extensions.getSerializedSize();
        }

        public int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.getMessageSetSerializedSize();
        }

        public Map<FieldDescriptor, Object> getExtensionFields() {
            return this.extensions.getAllFields();
        }

        public Map<FieldDescriptor, Object> getAllFields() {
            Map<FieldDescriptor, Object> result = super.getAllFieldsMutable(false);
            result.putAll(this.getExtensionFields());
            return Collections.unmodifiableMap(result);
        }

        public Map<FieldDescriptor, Object> getAllFieldsRaw() {
            Map<FieldDescriptor, Object> result = super.getAllFieldsMutable(false);
            result.putAll(this.getExtensionFields());
            return Collections.unmodifiableMap(result);
        }

        public boolean hasField(FieldDescriptor field) {
            if (field.isExtension()) {
                this.verifyContainingType(field);
                return this.extensions.hasField(field);
            } else {
                return super.hasField(field);
            }
        }

        public Object getField(FieldDescriptor field) {
            if (field.isExtension()) {
                this.verifyContainingType(field);
                Object value = this.extensions.getField(field);
                if (value == null) {
                    if (field.isRepeated()) {
                        return Collections.emptyList();
                    } else {
                        return field.getJavaType() == JavaType.MESSAGE ? DynamicMessage.getDefaultInstance(field.getMessageType()) : field.getDefaultValue();
                    }
                } else {
                    return value;
                }
            } else {
                return super.getField(field);
            }
        }

        public int getRepeatedFieldCount(FieldDescriptor field) {
            if (field.isExtension()) {
                this.verifyContainingType(field);
                return this.extensions.getRepeatedFieldCount(field);
            } else {
                return super.getRepeatedFieldCount(field);
            }
        }

        public Object getRepeatedField(FieldDescriptor field, int index) {
            if (field.isExtension()) {
                this.verifyContainingType(field);
                return this.extensions.getRepeatedField(field, index);
            } else {
                return super.getRepeatedField(field, index);
            }
        }

        private void verifyContainingType(FieldDescriptor field) {
            if (field.getContainingType() != this.getDescriptorForType()) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
        }

        public class ExtensionWriter {
            private final Iterator<Entry<FieldDescriptor, Object>> iter;
            private Entry<FieldDescriptor, Object> next;
            private final boolean messageSetWireFormat;

            private ExtensionWriter(boolean messageSetWireFormat) {
                this.iter = ExtendableMessage.this.extensions.iterator();
                if (this.iter.hasNext()) {
                    this.next = (Entry)this.iter.next();
                }

                this.messageSetWireFormat = messageSetWireFormat;
            }

            public void writeUntil(int end, CodedOutputStream output) throws IOException {
                while(this.next != null && ((FieldDescriptor)this.next.getKey()).getNumber() < end) {
                    FieldDescriptor descriptor = (FieldDescriptor)this.next.getKey();
                    if (this.messageSetWireFormat && descriptor.getLiteJavaType() == com.google.protobuf.WireFormat.JavaType.MESSAGE && !descriptor.isRepeated()) {
                        if (this.next instanceof LazyEntry) {
                            output.writeRawMessageSetExtension(descriptor.getNumber(), ((LazyEntry)this.next).getField().toByteString());
                        } else {
                            output.writeMessageSetExtension(descriptor.getNumber(), (Message)this.next.getValue());
                        }
                    } else {
                        FieldSet.writeField(descriptor, this.next.getValue(), output);
                    }

                    if (this.iter.hasNext()) {
                        this.next = (Entry)this.iter.next();
                    } else {
                        this.next = null;
                    }
                }

            }
        }
    }

    public interface ExtendableMessageOrBuilder<MessageType extends GeneratedMessageV3.ExtendableMessage> extends MessageOrBuilder {
        Message getDefaultInstanceForType();

        <Type> boolean hasExtension(ExtensionLite<MessageType, Type> var1);

        <Type> int getExtensionCount(ExtensionLite<MessageType, List<Type>> var1);

        <Type> Type getExtension(ExtensionLite<MessageType, Type> var1);

        <Type> Type getExtension(ExtensionLite<MessageType, List<Type>> var1, int var2);

        <Type> boolean hasExtension(Extension<MessageType, Type> var1);

        <Type> boolean hasExtension(GeneratedExtension<MessageType, Type> var1);

        <Type> int getExtensionCount(Extension<MessageType, List<Type>> var1);

        <Type> int getExtensionCount(GeneratedExtension<MessageType, List<Type>> var1);

        <Type> Type getExtension(Extension<MessageType, Type> var1);

        <Type> Type getExtension(GeneratedExtension<MessageType, Type> var1);

        <Type> Type getExtension(Extension<MessageType, List<Type>> var1, int var2);

        <Type> Type getExtension(GeneratedExtension<MessageType, List<Type>> var1, int var2);
    }

    public abstract static class Builder<BuilderType extends GeneratedMessageV3.Builder<BuilderType>> extends com.google.protobuf.AbstractMessage.Builder<BuilderType> {
        private GeneratedMessageV3.BuilderParent builderParent;
        private GeneratedMessageV3.Builder<BuilderType>.BuilderParentImpl meAsParent;
        private boolean isClean;
        private UnknownFieldSet unknownFields;

        public Builder() {
            this((GeneratedMessageV3.BuilderParent)null);
        }

        public Builder(GeneratedMessageV3.BuilderParent builderParent) {
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
            this.builderParent = builderParent;
        }

        void dispose() {
            this.builderParent = null;
        }

        public void onBuilt() {
            if (this.builderParent != null) {
                this.markClean();
            }

        }

        public void markClean() {
            this.isClean = true;
        }

        public boolean isClean() {
            return this.isClean;
        }

        public BuilderType clone() {
            BuilderType builder = (BuilderType) this.getDefaultInstanceForType().newBuilderForType();
            builder.mergeFrom(this.buildPartial());
            return builder;
        }

        public BuilderType clear() {
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
            this.onChanged();
            return (BuilderType) this;
        }

        public abstract GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable();

        public Descriptor getDescriptorForType() {
            return this.internalGetFieldAccessorTable().descriptor;
        }

        public Map<FieldDescriptor, Object> getAllFields() {
            return Collections.unmodifiableMap(this.getAllFieldsMutable());
        }

        private Map<FieldDescriptor, Object> getAllFieldsMutable() {
            TreeMap<FieldDescriptor, Object> result = new TreeMap();
            Descriptor descriptor = this.internalGetFieldAccessorTable().descriptor;
            List<FieldDescriptor> fields = descriptor.getFields();

            for(int i = 0; i < fields.size(); ++i) {
                FieldDescriptor field = (FieldDescriptor)fields.get(i);
                OneofDescriptor oneofDescriptor = field.getContainingOneof();
                if (oneofDescriptor != null) {
                    i += oneofDescriptor.getFieldCount() - 1;
                    if (!this.hasOneof(oneofDescriptor)) {
                        continue;
                    }

                    field = this.getOneofFieldDescriptor(oneofDescriptor);
                } else {
                    if (field.isRepeated()) {
                        List<?> value = (List)this.getField(field);
                        if (!value.isEmpty()) {
                            result.put(field, value);
                        }
                        continue;
                    }

                    if (!this.hasField(field)) {
                        continue;
                    }
                }

                result.put(field, this.getField(field));
            }

            return result;
        }

        public com.google.protobuf.Message.Builder newBuilderForField(FieldDescriptor field) {
            return this.internalGetFieldAccessorTable().getField(field).newBuilder();
        }

        public com.google.protobuf.Message.Builder getFieldBuilder(FieldDescriptor field) {
            return this.internalGetFieldAccessorTable().getField(field).getBuilder(this);
        }

        public com.google.protobuf.Message.Builder getRepeatedFieldBuilder(FieldDescriptor field, int index) {
            return this.internalGetFieldAccessorTable().getField(field).getRepeatedBuilder(this, index);
        }

        public boolean hasOneof(OneofDescriptor oneof) {
            return this.internalGetFieldAccessorTable().getOneof(oneof).has(this);
        }

        public FieldDescriptor getOneofFieldDescriptor(OneofDescriptor oneof) {
            return this.internalGetFieldAccessorTable().getOneof(oneof).get(this);
        }

        public boolean hasField(FieldDescriptor field) {
            return this.internalGetFieldAccessorTable().getField(field).has(this);
        }

        public Object getField(FieldDescriptor field) {
            Object object = this.internalGetFieldAccessorTable().getField(field).get(this);
            return field.isRepeated() ? Collections.unmodifiableList((List)object) : object;
        }

        public BuilderType setField(FieldDescriptor field, Object value) {
            this.internalGetFieldAccessorTable().getField(field).set(this, value);
            return (BuilderType) this;
        }

        public BuilderType clearField(FieldDescriptor field) {
            this.internalGetFieldAccessorTable().getField(field).clear(this);
            return (BuilderType) this;
        }

        public BuilderType clearOneof(OneofDescriptor oneof) {
            this.internalGetFieldAccessorTable().getOneof(oneof).clear(this);
            return (BuilderType) this;
        }

        public int getRepeatedFieldCount(FieldDescriptor field) {
            return this.internalGetFieldAccessorTable().getField(field).getRepeatedCount(this);
        }

        public Object getRepeatedField(FieldDescriptor field, int index) {
            return this.internalGetFieldAccessorTable().getField(field).getRepeated(this, index);
        }

        public BuilderType setRepeatedField(FieldDescriptor field, int index, Object value) {
            this.internalGetFieldAccessorTable().getField(field).setRepeated(this, index, value);
            return (BuilderType) this;
        }

        public BuilderType addRepeatedField(FieldDescriptor field, Object value) {
            this.internalGetFieldAccessorTable().getField(field).addRepeated(this, value);
            return (BuilderType) this;
        }

        private BuilderType setUnknownFieldsInternal(UnknownFieldSet unknownFields) {
            this.unknownFields = unknownFields;
            this.onChanged();
            return (BuilderType) this;
        }

        public BuilderType setUnknownFields(UnknownFieldSet unknownFields) {
            return this.setUnknownFieldsInternal(unknownFields);
        }

        public BuilderType setUnknownFieldsProto3(UnknownFieldSet unknownFields) {
            return this.setUnknownFieldsInternal(unknownFields);
        }

        public BuilderType mergeUnknownFields(UnknownFieldSet unknownFields) {
            return this.setUnknownFields(UnknownFieldSet.newBuilder(this.unknownFields).mergeFrom(unknownFields).build());
        }

        public boolean isInitialized() {
            Iterator var1 = this.getDescriptorForType().getFields().iterator();

            while(true) {
                while(true) {
                    FieldDescriptor field;
                    do {
                        if (!var1.hasNext()) {
                            return true;
                        }

                        field = (FieldDescriptor)var1.next();
                        if (field.isRequired() && !this.hasField(field)) {
                            return false;
                        }
                    } while(field.getJavaType() != JavaType.MESSAGE);

                    if (field.isRepeated()) {
                        List<Message> messageList = (List)this.getField(field);
                        Iterator var4 = messageList.iterator();

                        while(var4.hasNext()) {
                            Message element = (Message)var4.next();
                            if (!element.isInitialized()) {
                                return false;
                            }
                        }
                    } else if (this.hasField(field) && !((Message)this.getField(field)).isInitialized()) {
                        return false;
                    }
                }
            }
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        public GeneratedMessageV3.BuilderParent getParentForChildren() {
            if (this.meAsParent == null) {
                this.meAsParent = new GeneratedMessageV3.Builder.BuilderParentImpl();
            }

            return this.meAsParent;
        }

        public final void onChanged() {
            if (this.isClean && this.builderParent != null) {
                this.builderParent.markDirty();
                this.isClean = false;
            }

        }

        public MapField internalGetMapField(int fieldNumber) {
            throw new RuntimeException("No map fields found in " + this.getClass().getName());
        }

        public MapField internalGetMutableMapField(int fieldNumber) {
            throw new RuntimeException("No map fields found in " + this.getClass().getName());
        }

        private class BuilderParentImpl implements GeneratedMessageV3.BuilderParent {
            private BuilderParentImpl() {
            }

            public void markDirty() {
                Builder.this.onChanged();
            }
        }
    }

    public interface BuilderParent extends com.google.protobuf.AbstractMessage.BuilderParent {
    }

    public static final class UnusedPrivateParameter {
        static final GeneratedMessageV3.UnusedPrivateParameter INSTANCE = new GeneratedMessageV3.UnusedPrivateParameter();

        private UnusedPrivateParameter() {
        }
    }
}
