package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketDataSerializer")
public class NMSPacketDataSerializer extends ByteBuf {

    public NMSPacketDataSerializer(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketDataSerializer(ByteBuf byteBuf){
        super("PacketDataSerializer", new Object[]{ByteBuf.class}, new Object[]{byteBuf});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#a(java.lang.String)
     */
    @ReflectiveMethod(name = "a", types = {String.class})
    public NMSPacketDataSerializer a(String s){
        return new NMSPacketDataSerializer(NMSWrapper.getInstance().exec(nmsObject, s));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#alloc()
     */
    @ReflectiveMethod(name = "alloc", types = {})
    public ByteBufAllocator alloc(){
        return new ByteBufAllocator(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#arrayOffset()
     */
    @ReflectiveMethod(name = "arrayOffset", types = {})
    public int arrayOffset(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#b(long)
     */
    @ReflectiveMethod(name = "b", types = {long.class})
    public void b(long l){
        NMSWrapper.getInstance().exec(nmsObject, l);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#bytesBefore(int, int, byte)
     */
    @ReflectiveMethod(name = "bytesBefore", types = {int.class, int.class, byte.class})
    public int bytesBefore(int i, int i1, byte b){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i, i1, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#c(int)
     */
    @ReflectiveMethod(name = "c", types = {int.class})
    public String c(int i){
        return (String) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#capacity(int)
     */
    @ReflectiveMethod(name = "capacity", types = {int.class})
    public ByteBuf capacity(int i){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#clear()
     */
    @ReflectiveMethod(name = "clear", types = {})
    public ByteBuf clear(){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#compareTo(io.netty.buffer.ByteBuf)
     */
    @ReflectiveMethod(name = "compareTo", types = {ByteBuf.class})
    public int compareTo(ByteBuf byteBuf){
        return (int) NMSWrapper.getInstance().exec(nmsObject, byteBuf);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#copy(int, int)
     */
    @ReflectiveMethod(name = "copy", types = {int.class, int.class})
    public ByteBuf copy(int i, int i1){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject, i, i1));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#discardReadBytes()
     */
    @ReflectiveMethod(name = "discardReadBytes", types = {})
    public ByteBuf discardReadBytes(){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#discardSomeReadBytes()
     */
    @ReflectiveMethod(name = "discardSomeReadBytes", types = {})
    public ByteBuf discardSomeReadBytes(){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#duplicate()
     */
    @ReflectiveMethod(name = "duplicate", types = {})
    public ByteBuf duplicate(){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public int e(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#ensureWritable(int, boolean)
     */
    @ReflectiveMethod(name = "ensureWritable", types = {int.class, boolean.class})
    public int ensureWritable(int i, boolean b){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i, b);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#equals(java.lang.Object)
     */
    @ReflectiveMethod(name = "equals", types = {Object.class})
    public boolean equals(Object object){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#f()
     */
    @ReflectiveMethod(name = "f", types = {})
    public long f(){
        return (long) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#forEachByte(int, int, io.netty.buffer.ByteBufProcessor)
     */
    @ReflectiveMethod(name = "forEachByte", types = {int.class, int.class, ByteBufProcessor.class})
    public int forEachByte(int i, int i1, ByteBufProcessor byteBufProcessor){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i, i1, byteBufProcessor);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#forEachByteDesc(int, int, io.netty.buffer.ByteBufProcessor)
     */
    @ReflectiveMethod(name = "forEachByteDesc", types = {int.class, int.class, ByteBufProcessor.class})
    public int forEachByteDesc(int i, int i1, ByteBufProcessor byteBufProcessor){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i, i1, byteBufProcessor);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public UUID g(){
        return new UUID(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#getBoolean(int)
     */
    @ReflectiveMethod(name = "getBoolean", types = {int.class})
    public boolean getBoolean(int i){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#getByte(int)
     */
    @ReflectiveMethod(name = "getByte", types = {int.class})
    public byte getByte(int i){
        return (byte) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#getBytes(int, java.nio.ByteBuffer)
     */
    @ReflectiveMethod(name = "getBytes", types = {int.class, ByteBuffer.class})
    public ByteBuf getBytes(int i, ByteBuffer byteBuffer){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject, i, byteBuffer));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#getChar(int)
     */
    @ReflectiveMethod(name = "getChar", types = {int.class})
    public char getChar(int i){
        return (char) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#getDouble(int)
     */
    @ReflectiveMethod(name = "getDouble", types = {int.class})
    public double getDouble(int i){
        return (double) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#getFloat(int)
     */
    @ReflectiveMethod(name = "getFloat", types = {int.class})
    public float getFloat(int i){
        return (float) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#getInt(int)
     */
    @ReflectiveMethod(name = "getInt", types = {int.class})
    public int getInt(int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#getLong(int)
     */
    @ReflectiveMethod(name = "getLong", types = {int.class})
    public long getLong(int i){
        return (long) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#getMedium(int)
     */
    @ReflectiveMethod(name = "getMedium", types = {int.class})
    public int getMedium(int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#getShort(int)
     */
    @ReflectiveMethod(name = "getShort", types = {int.class})
    public short getShort(int i){
        return (short) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#getUnsignedByte(int)
     */
    @ReflectiveMethod(name = "getUnsignedByte", types = {int.class})
    public short getUnsignedByte(int i){
        return (short) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#getUnsignedInt(int)
     */
    @ReflectiveMethod(name = "getUnsignedInt", types = {int.class})
    public long getUnsignedInt(int i){
        return (long) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#getUnsignedMedium(int)
     */
    @ReflectiveMethod(name = "getUnsignedMedium", types = {int.class})
    public int getUnsignedMedium(int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#getUnsignedShort(int)
     */
    @ReflectiveMethod(name = "getUnsignedShort", types = {int.class})
    public int getUnsignedShort(int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#hasArray()
     */
    @ReflectiveMethod(name = "hasArray", types = {})
    public boolean hasArray(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#hasMemoryAddress()
     */
    @ReflectiveMethod(name = "hasMemoryAddress", types = {})
    public boolean hasMemoryAddress(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#hashCode()
     */
    @ReflectiveMethod(name = "hashCode", types = {})
    public int hashCode(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#indexOf(int, int, byte)
     */
    @ReflectiveMethod(name = "indexOf", types = {int.class, int.class, byte.class})
    public int indexOf(int i, int i1, byte b){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i, i1, b);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#internalNioBuffer(int, int)
     */
    @ReflectiveMethod(name = "internalNioBuffer", types = {int.class, int.class})
    public ByteBuffer internalNioBuffer(int i, int i1){
        return new ByteBuffer(NMSWrapper.getInstance().exec(nmsObject, i, i1));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#isDirect()
     */
    @ReflectiveMethod(name = "isDirect", types = {})
    public boolean isDirect(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#isReadable(int)
     */
    @ReflectiveMethod(name = "isReadable", types = {int.class})
    public boolean isReadable(int i){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#isWritable(int)
     */
    @ReflectiveMethod(name = "isWritable", types = {int.class})
    public boolean isWritable(int i){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#markReaderIndex()
     */
    @ReflectiveMethod(name = "markReaderIndex", types = {})
    public ByteBuf markReaderIndex(){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#markWriterIndex()
     */
    @ReflectiveMethod(name = "markWriterIndex", types = {})
    public ByteBuf markWriterIndex(){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#maxCapacity()
     */
    @ReflectiveMethod(name = "maxCapacity", types = {})
    public int maxCapacity(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#maxWritableBytes()
     */
    @ReflectiveMethod(name = "maxWritableBytes", types = {})
    public int maxWritableBytes(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#memoryAddress()
     */
    @ReflectiveMethod(name = "memoryAddress", types = {})
    public long memoryAddress(){
        return (long) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#nioBuffer(int, int)
     */
    @ReflectiveMethod(name = "nioBuffer", types = {int.class, int.class})
    public ByteBuffer nioBuffer(int i, int i1){
        return new ByteBuffer(NMSWrapper.getInstance().exec(nmsObject, i, i1));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#nioBufferCount()
     */
    @ReflectiveMethod(name = "nioBufferCount", types = {})
    public int nioBufferCount(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#order(java.nio.ByteOrder)
     */
    @ReflectiveMethod(name = "order", types = {ByteOrder.class})
    public ByteBuf order(ByteOrder byteOrder){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject, byteOrder));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#readBoolean()
     */
    @ReflectiveMethod(name = "readBoolean", types = {})
    public boolean readBoolean(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#readByte()
     */
    @ReflectiveMethod(name = "readByte", types = {})
    public byte readByte(){
        return (byte) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#readBytes(java.nio.ByteBuffer)
     */
    @ReflectiveMethod(name = "readBytes", types = {ByteBuffer.class})
    public ByteBuf readBytes(ByteBuffer byteBuffer){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject, byteBuffer));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#readChar()
     */
    @ReflectiveMethod(name = "readChar", types = {})
    public char readChar(){
        return (char) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#readDouble()
     */
    @ReflectiveMethod(name = "readDouble", types = {})
    public double readDouble(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#readFloat()
     */
    @ReflectiveMethod(name = "readFloat", types = {})
    public float readFloat(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#readInt()
     */
    @ReflectiveMethod(name = "readInt", types = {})
    public int readInt(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#readLong()
     */
    @ReflectiveMethod(name = "readLong", types = {})
    public long readLong(){
        return (long) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#readMedium()
     */
    @ReflectiveMethod(name = "readMedium", types = {})
    public int readMedium(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#readShort()
     */
    @ReflectiveMethod(name = "readShort", types = {})
    public short readShort(){
        return (short) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#readSlice(int)
     */
    @ReflectiveMethod(name = "readSlice", types = {int.class})
    public ByteBuf readSlice(int i){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#readUnsignedByte()
     */
    @ReflectiveMethod(name = "readUnsignedByte", types = {})
    public short readUnsignedByte(){
        return (short) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#readUnsignedInt()
     */
    @ReflectiveMethod(name = "readUnsignedInt", types = {})
    public long readUnsignedInt(){
        return (long) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#readUnsignedMedium()
     */
    @ReflectiveMethod(name = "readUnsignedMedium", types = {})
    public int readUnsignedMedium(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#readUnsignedShort()
     */
    @ReflectiveMethod(name = "readUnsignedShort", types = {})
    public int readUnsignedShort(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#readableBytes()
     */
    @ReflectiveMethod(name = "readableBytes", types = {})
    public int readableBytes(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#readerIndex(int)
     */
    @ReflectiveMethod(name = "readerIndex", types = {int.class})
    public ByteBuf readerIndex(int i){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#refCnt()
     */
    @ReflectiveMethod(name = "refCnt", types = {})
    public int refCnt(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#release(int)
     */
    @ReflectiveMethod(name = "release", types = {int.class})
    public boolean release(int i){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#resetReaderIndex()
     */
    @ReflectiveMethod(name = "resetReaderIndex", types = {})
    public ByteBuf resetReaderIndex(){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#resetWriterIndex()
     */
    @ReflectiveMethod(name = "resetWriterIndex", types = {})
    public ByteBuf resetWriterIndex(){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#retain()
     */
    @ReflectiveMethod(name = "retain", types = {})
    public ByteBuf retain(){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#setBoolean(int, boolean)
     */
    @ReflectiveMethod(name = "setBoolean", types = {int.class, boolean.class})
    public ByteBuf setBoolean(int i, boolean b){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject, i, b));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#setByte(int, int)
     */
    @ReflectiveMethod(name = "setByte", types = {int.class, int.class})
    public ByteBuf setByte(int i, int i1){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject, i, i1));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#setBytes(int, java.nio.ByteBuffer)
     */
    @ReflectiveMethod(name = "setBytes", types = {int.class, ByteBuffer.class})
    public ByteBuf setBytes(int i, ByteBuffer byteBuffer){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject, i, byteBuffer));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#setChar(int, int)
     */
    @ReflectiveMethod(name = "setChar", types = {int.class, int.class})
    public ByteBuf setChar(int i, int i1){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject, i, i1));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#setDouble(int, double)
     */
    @ReflectiveMethod(name = "setDouble", types = {int.class, double.class})
    public ByteBuf setDouble(int i, double d){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject, i, d));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#setFloat(int, float)
     */
    @ReflectiveMethod(name = "setFloat", types = {int.class, float.class})
    public ByteBuf setFloat(int i, float f){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject, i, f));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#setIndex(int, int)
     */
    @ReflectiveMethod(name = "setIndex", types = {int.class, int.class})
    public ByteBuf setIndex(int i, int i1){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject, i, i1));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#setInt(int, int)
     */
    @ReflectiveMethod(name = "setInt", types = {int.class, int.class})
    public ByteBuf setInt(int i, int i1){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject, i, i1));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#setLong(int, long)
     */
    @ReflectiveMethod(name = "setLong", types = {int.class, long.class})
    public ByteBuf setLong(int i, long l){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject, i, l));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#setMedium(int, int)
     */
    @ReflectiveMethod(name = "setMedium", types = {int.class, int.class})
    public ByteBuf setMedium(int i, int i1){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject, i, i1));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#setShort(int, int)
     */
    @ReflectiveMethod(name = "setShort", types = {int.class, int.class})
    public ByteBuf setShort(int i, int i1){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject, i, i1));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#setZero(int, int)
     */
    @ReflectiveMethod(name = "setZero", types = {int.class, int.class})
    public ByteBuf setZero(int i, int i1){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject, i, i1));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#skipBytes(int)
     */
    @ReflectiveMethod(name = "skipBytes", types = {int.class})
    public ByteBuf skipBytes(int i){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#slice(int, int)
     */
    @ReflectiveMethod(name = "slice", types = {int.class, int.class})
    public ByteBuf slice(int i, int i1){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject, i, i1));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#toString()
     */
    @ReflectiveMethod(name = "toString", types = {})
    public String toString(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#unwrap()
     */
    @ReflectiveMethod(name = "unwrap", types = {})
    public ByteBuf unwrap(){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#writableBytes()
     */
    @ReflectiveMethod(name = "writableBytes", types = {})
    public int writableBytes(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#writeBoolean(boolean)
     */
    @ReflectiveMethod(name = "writeBoolean", types = {boolean.class})
    public ByteBuf writeBoolean(boolean b){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject, b));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#writeByte(int)
     */
    @ReflectiveMethod(name = "writeByte", types = {int.class})
    public ByteBuf writeByte(int i){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#writeBytes(java.nio.ByteBuffer)
     */
    @ReflectiveMethod(name = "writeBytes", types = {ByteBuffer.class})
    public ByteBuf writeBytes(ByteBuffer byteBuffer){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject, byteBuffer));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#writeChar(int)
     */
    @ReflectiveMethod(name = "writeChar", types = {int.class})
    public ByteBuf writeChar(int i){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#writeDouble(double)
     */
    @ReflectiveMethod(name = "writeDouble", types = {double.class})
    public ByteBuf writeDouble(double d){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject, d));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#writeFloat(float)
     */
    @ReflectiveMethod(name = "writeFloat", types = {float.class})
    public ByteBuf writeFloat(float f){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject, f));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#writeInt(int)
     */
    @ReflectiveMethod(name = "writeInt", types = {int.class})
    public ByteBuf writeInt(int i){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#writeLong(long)
     */
    @ReflectiveMethod(name = "writeLong", types = {long.class})
    public ByteBuf writeLong(long l){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject, l));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#writeMedium(int)
     */
    @ReflectiveMethod(name = "writeMedium", types = {int.class})
    public ByteBuf writeMedium(int i){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#writeShort(int)
     */
    @ReflectiveMethod(name = "writeShort", types = {int.class})
    public ByteBuf writeShort(int i){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#writeZero(int)
     */
    @ReflectiveMethod(name = "writeZero", types = {int.class})
    public ByteBuf writeZero(int i){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketDataSerializer#writerIndex(int)
     */
    @ReflectiveMethod(name = "writerIndex", types = {int.class})
    public ByteBuf writerIndex(int i){
        return new ByteBuf(NMSWrapper.getInstance().exec(nmsObject, i));
    }

}