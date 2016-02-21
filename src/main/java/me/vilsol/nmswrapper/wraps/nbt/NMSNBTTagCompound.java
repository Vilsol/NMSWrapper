package me.vilsol.nmswrapper.wraps.nbt;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

@ReflectiveClass(name = "NBTTagCompound")
public class NMSNBTTagCompound extends NMSNBTBase {

    public NMSNBTTagCompound() {
        super("NBTTagCompound", new Object[]{}, new Object[]{});
    }

    public NMSNBTTagCompound(Object nmsObject) {
        super(nmsObject);
    }

    @ReflectiveMethod(name = "hasKey", types = {String.class})
    public Boolean hasKey(String name) {
        return (Boolean) NMSWrapper.getInstance().exec(nmsObject, name);
    }

    @ReflectiveMethod(name = "hasKeyOfType", types = {String.class, int.class})
    public Boolean hasKeyOfType(String name, int type) {
        return (Boolean) NMSWrapper.getInstance().exec(nmsObject, name, type);
    }

    @ReflectiveMethod(name = "get", types = {String.class})
    public NMSNBTBase get(String name) {
        NMSNBTBase tag = null;
        Object nmsObject = NMSWrapper.getInstance().exec(this.nmsObject, name);

        if(nmsObject == null){
            return null;
        }

        // TODO Create Relevant NMSObjects
        switch (nmsObject.getClass().getSimpleName()){
            case "NBTTagByte":
                break;
            case "NBTTagByteArray":
                break;
            case "NBTTagCompound":
                tag = new NMSNBTTagCompound(nmsObject);
                break;
            case "NBTTagDouble":
                break;
            case "NBTTagEnd":
                break;
            case "NBTTagFloat":
                break;
            case "NMSNBTTagInt":
                tag = new NMSNBTTagInt(nmsObject);
                break;
            case "NBTTagIntArray":
                break;
            case "NBTTagList":
                tag = new NMSNBTTagList(nmsObject);
                break;
            case "NBTTagLong":
                break;
            case "NBTTagShort":
                break;
            case "NBTTagString":
                break;
        }
        return tag;
    }

    @ReflectiveMethod(name = "getByte", types = {String.class})
    public byte getByte(String name) {
        return (byte) NMSWrapper.getInstance().exec(nmsObject, name);
    }

    @ReflectiveMethod(name = "getShort", types = {String.class})
    public short getShort(String name) {
        return (short) NMSWrapper.getInstance().exec(nmsObject, name);
    }

    @ReflectiveMethod(name = "getInt", types = {String.class})
    public int getInt(String name) {
        return (int) NMSWrapper.getInstance().exec(nmsObject, name);
    }

    @ReflectiveMethod(name = "getLong", types = {String.class})
    public long getLong(String name) {
        return (long) NMSWrapper.getInstance().exec(nmsObject, name);
    }

    @ReflectiveMethod(name = "getFloat", types = {String.class})
    public float getFloat(String name) {
        return (float) NMSWrapper.getInstance().exec(nmsObject, name);
    }

    @ReflectiveMethod(name = "getDouble", types = {String.class})
    public double getDouble(String name) {
        return (double) NMSWrapper.getInstance().exec(nmsObject, name);
    }

    @ReflectiveMethod(name = "getString", types = {String.class})
    public String getString(String name) {
        return (String) NMSWrapper.getInstance().exec(nmsObject, name);
    }

    @ReflectiveMethod(name = "getByteArray", types = {String.class})
    public byte[] getByteArray(String name) {
        return (byte[]) NMSWrapper.getInstance().exec(nmsObject, name);
    }

    @ReflectiveMethod(name = "getIntArray", types = {String.class})
    public int[] getIntArray(String name) {
        return (int[]) NMSWrapper.getInstance().exec(nmsObject, name);
    }

    @ReflectiveMethod(name = "getCompound", types = {String.class})
    public NMSNBTTagCompound getCompound(String name) {
        return new NMSNBTTagCompound(NMSWrapper.getInstance().exec(nmsObject, name));
    }

    @ReflectiveMethod(name = "getList", types = {String.class, int.class})
    public NMSNBTTagList getList(String name, int thing) {
        return new NMSNBTTagList(NMSWrapper.getInstance().exec(nmsObject, name, thing));
    }

    @ReflectiveMethod(name = "getBoolean", types = {String.class})
    public boolean getBoolean(String name) {
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, name);
    }

    @ReflectiveMethod(name = "set", types = {String.class, NMSNBTBase.class})
    public void set(String key, NMSNBTBase value) {
        NMSWrapper.getInstance().exec(nmsObject, key, value);
    }

    @ReflectiveMethod(name = "setByte", types = {String.class, byte.class})
    public void setByte(String key, byte value) {
        NMSWrapper.getInstance().exec(nmsObject, key, value);
    }

    @ReflectiveMethod(name = "setShort", types = {String.class, short.class})
    public void setShort(String key, short value) {
        NMSWrapper.getInstance().exec(nmsObject, key, value);
    }

    @ReflectiveMethod(name = "setInt", types = {String.class, int.class})
    public void setInt(String key, int value) {
        NMSWrapper.getInstance().exec(nmsObject, key, value);
    }

    @ReflectiveMethod(name = "setLong", types = {String.class, long.class})
    public void setLong(String key, long value) {
        NMSWrapper.getInstance().exec(nmsObject, key, value);
    }

    @ReflectiveMethod(name = "setFloat", types = {String.class, float.class})
    public void setFloat(String key, float value) {
        NMSWrapper.getInstance().exec(nmsObject, key, value);
    }

    @ReflectiveMethod(name = "setDouble", types = {String.class, double.class})
    public void setDouble(String key, double value) {
        NMSWrapper.getInstance().exec(nmsObject, key, value);
    }

    @ReflectiveMethod(name = "setString", types = {String.class, String.class})
    public void setString(String key, String value) {
        NMSWrapper.getInstance().exec(nmsObject, key, value);
    }

    @ReflectiveMethod(name = "setByteArray", types = {String.class, byte[].class})
    public void setByteArray(String key, byte[] value) {
        NMSWrapper.getInstance().exec(nmsObject, key, value);
    }

    @ReflectiveMethod(name = "setIntArray", types = {String.class, int[].class})
    public void setIntArray(String key, int[] value) {
        NMSWrapper.getInstance().exec(nmsObject, key, value);
    }

    @ReflectiveMethod(name = "setBoolean", types = {String.class, boolean.class})
    public void setBoolean(String key, boolean value) {
        NMSWrapper.getInstance().exec(nmsObject, key, value);
    }

    @ReflectiveMethod(name = "remove", types = {String.class})
    public void remove(String name) {
        NMSWrapper.getInstance().exec(nmsObject, name);
    }


}
