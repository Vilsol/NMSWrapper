package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.nbt.NMSNBTBase;

@ReflectiveClass(name = "NBTTagCompound")
public class NMSNBTTagCompound extends NMSNBTBase {

    public NMSNBTTagCompound(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NBTTagCompound#a(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "a", types = {NMSNBTTagCompound.class})
    public void a(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NBTTagCompound#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public Map b(NMSNBTTagCompound nBTTagCompound){
        return new Map(NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagCompound#clone()
     */
    @ReflectiveMethod(name = "clone", types = {})
    public NMSNBTBase clone(){
        return new NMSNBTBase(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagCompound#equals(java.lang.Object)
     */
    @ReflectiveMethod(name = "equals", types = {Object.class})
    public boolean equals(Object object){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagCompound#get(java.lang.String)
     */
    @ReflectiveMethod(name = "get", types = {String.class})
    public NMSNBTBase get(String s){
        return new NMSNBTBase(NMSWrapper.getInstance().exec(nmsObject, s));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagCompound#getBoolean(java.lang.String)
     */
    @ReflectiveMethod(name = "getBoolean", types = {String.class})
    public boolean getBoolean(String s){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagCompound#getByte(java.lang.String)
     */
    @ReflectiveMethod(name = "getByte", types = {String.class})
    public byte getByte(String s){
        return (byte) NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagCompound#getCompound(java.lang.String)
     */
    @ReflectiveMethod(name = "getCompound", types = {String.class})
    public NMSNBTTagCompound getCompound(String s){
        return new NMSNBTTagCompound(NMSWrapper.getInstance().exec(nmsObject, s));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagCompound#getDouble(java.lang.String)
     */
    @ReflectiveMethod(name = "getDouble", types = {String.class})
    public double getDouble(String s){
        return (double) NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagCompound#getFloat(java.lang.String)
     */
    @ReflectiveMethod(name = "getFloat", types = {String.class})
    public float getFloat(String s){
        return (float) NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagCompound#getInt(java.lang.String)
     */
    @ReflectiveMethod(name = "getInt", types = {String.class})
    public int getInt(String s){
        return (int) NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagCompound#getList(java.lang.String, int)
     */
    @ReflectiveMethod(name = "getList", types = {String.class, int.class})
    public NMSNBTTagList getList(String s, int i){
        return new NMSNBTTagList(NMSWrapper.getInstance().exec(nmsObject, s, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagCompound#getLong(java.lang.String)
     */
    @ReflectiveMethod(name = "getLong", types = {String.class})
    public long getLong(String s){
        return (long) NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagCompound#getShort(java.lang.String)
     */
    @ReflectiveMethod(name = "getShort", types = {String.class})
    public short getShort(String s){
        return (short) NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagCompound#getString(java.lang.String)
     */
    @ReflectiveMethod(name = "getString", types = {String.class})
    public String getString(String s){
        return (String) NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagCompound#getTypeId()
     */
    @ReflectiveMethod(name = "getTypeId", types = {})
    public byte getTypeId(){
        return (byte) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagCompound#hasKey(java.lang.String)
     */
    @ReflectiveMethod(name = "hasKey", types = {String.class})
    public boolean hasKey(String s){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagCompound#hasKeyOfType(java.lang.String, int)
     */
    @ReflectiveMethod(name = "hasKeyOfType", types = {String.class, int.class})
    public boolean hasKeyOfType(String s, int i){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, s, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagCompound#hashCode()
     */
    @ReflectiveMethod(name = "hashCode", types = {})
    public int hashCode(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagCompound#isEmpty()
     */
    @ReflectiveMethod(name = "isEmpty", types = {})
    public boolean isEmpty(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagCompound#remove(java.lang.String)
     */
    @ReflectiveMethod(name = "remove", types = {String.class})
    public void remove(String s){
        NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagCompound#set(java.lang.String, net.minecraft.server.v1_8_R3.NBTBase)
     */
    @ReflectiveMethod(name = "set", types = {String.class, NMSNBTBase.class})
    public void set(String s, NMSNBTBase nBTBase){
        NMSWrapper.getInstance().exec(nmsObject, s, nBTBase);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagCompound#setBoolean(java.lang.String, boolean)
     */
    @ReflectiveMethod(name = "setBoolean", types = {String.class, boolean.class})
    public void setBoolean(String s, boolean b){
        NMSWrapper.getInstance().exec(nmsObject, s, b);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagCompound#setByte(java.lang.String, byte)
     */
    @ReflectiveMethod(name = "setByte", types = {String.class, byte.class})
    public void setByte(String s, byte b){
        NMSWrapper.getInstance().exec(nmsObject, s, b);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagCompound#setDouble(java.lang.String, double)
     */
    @ReflectiveMethod(name = "setDouble", types = {String.class, double.class})
    public void setDouble(String s, double d){
        NMSWrapper.getInstance().exec(nmsObject, s, d);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagCompound#setFloat(java.lang.String, float)
     */
    @ReflectiveMethod(name = "setFloat", types = {String.class, float.class})
    public void setFloat(String s, float f){
        NMSWrapper.getInstance().exec(nmsObject, s, f);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagCompound#setInt(java.lang.String, int)
     */
    @ReflectiveMethod(name = "setInt", types = {String.class, int.class})
    public void setInt(String s, int i){
        NMSWrapper.getInstance().exec(nmsObject, s, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagCompound#setLong(java.lang.String, long)
     */
    @ReflectiveMethod(name = "setLong", types = {String.class, long.class})
    public void setLong(String s, long l){
        NMSWrapper.getInstance().exec(nmsObject, s, l);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagCompound#setShort(java.lang.String, short)
     */
    @ReflectiveMethod(name = "setShort", types = {String.class, short.class})
    public void setShort(String s, short s1){
        NMSWrapper.getInstance().exec(nmsObject, s, s1);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagCompound#setString(java.lang.String, java.lang.String)
     */
    @ReflectiveMethod(name = "setString", types = {String.class, String.class})
    public void setString(String s, String s1){
        NMSWrapper.getInstance().exec(nmsObject, s, s1);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagCompound#toString()
     */
    @ReflectiveMethod(name = "toString", types = {})
    public String toString(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}