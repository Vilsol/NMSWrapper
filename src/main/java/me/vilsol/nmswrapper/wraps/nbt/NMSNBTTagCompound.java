package me.vilsol.nmswrapper.wraps.nbt;

import me.vilsol.nmswrapper.Reflection;

public class NMSNBTTagCompound extends NMSNBTBase {

    public NMSNBTTagCompound() {
        super("NBTTagCompound", new Object[]{}, new Object[]{});
    }

    public NMSNBTTagCompound(Object nmsObject) {
        super(nmsObject);
    }

    public Boolean hasKey(String name) {
        return (Boolean) Reflection.doMethod(nmsObject, "hasKey", new Object[]{String.class}, new Object[]{name});
    }

    public Boolean hasKeyOfType(String name, int type) {
        return (Boolean) Reflection.doMethod(nmsObject, "hasKeyOfType", new Object[]{String.class, int.class}, new Object[]{name, type});
    }

    public NMSNBTBase get(String name) {
        NMSNBTBase tag = null;
        Object nmsObject = Reflection.doMethod(this.nmsObject, "getByte", new Object[]{String.class}, new Object[]{name});

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

    public byte getByte(String name) {
        return (byte) Reflection.doMethod(nmsObject, "getByte", new Object[]{String.class}, new Object[]{name});
    }

    public short getShort(String name) {
        return (short) Reflection.doMethod(nmsObject, "getShort", new Object[]{String.class}, new Object[]{name});
    }

    public int getInt(String name) {
        return (int) Reflection.doMethod(nmsObject, "getInt", new Object[]{String.class}, new Object[]{name});
    }

    public long getLong(String name) {
        return (long) Reflection.doMethod(nmsObject, "getLong", new Object[]{String.class}, new Object[]{name});
    }

    public float getFloat(String name) {
        return (float) Reflection.doMethod(nmsObject, "getFloat", new Object[]{String.class}, new Object[]{name});
    }

    public double getDouble(String name) {
        return (double) Reflection.doMethod(nmsObject, "getDouble", new Object[]{String.class}, new Object[]{name});
    }

    public String getString(String name) {
        return (String) Reflection.doMethod(nmsObject, "getString", new Object[]{String.class}, new Object[]{name});
    }

    public byte[] getByteArray(String name) {
        return (byte[]) Reflection.doMethod(nmsObject, "getByteArray", new Object[]{String.class}, new Object[]{name});
    }

    public int[] getIntArray(String name) {
        return (int[]) Reflection.doMethod(nmsObject, "getIntArray", new Object[]{String.class}, new Object[]{name});
    }

    public NMSNBTTagCompound getCompound(String name) {
        return new NMSNBTTagCompound(Reflection.doMethod(nmsObject, "getCompound", new Object[]{String.class}, new Object[]{name}));
    }

    public NMSNBTTagList getList(String name, int thing) {
        return new NMSNBTTagList(Reflection.doMethod(nmsObject, "getList", new Object[]{String.class}, new Object[]{name}));
    }

    public boolean getBoolean(String name) {
        return (boolean) Reflection.doMethod(nmsObject, "getBoolean", new Object[]{String.class}, new Object[]{name});
    }

    public void set(String key, NMSNBTBase value) {
        Reflection.doMethod(nmsObject, "set", new Object[]{String.class, "NBTBase"}, new Object[]{key, value});
    }

    public void setByte(String key, byte value) {
        Reflection.doMethod(nmsObject, "setByte", new Object[]{String.class, byte.class}, new Object[]{key, value});
    }

    public void setShort(String key, short value) {
        Reflection.doMethod(nmsObject, "setShort", new Object[]{String.class, short.class}, new Object[]{key, value});
    }

    public void setInt(String key, int value) {
        Reflection.doMethod(nmsObject, "setInt", new Object[]{String.class, int.class}, new Object[]{key, value});
    }

    public void setLong(String key, long value) {
        Reflection.doMethod(nmsObject, "setLong", new Object[]{String.class, long.class}, new Object[]{key, value});
    }

    public void setFloat(String key, float value) {
        Reflection.doMethod(nmsObject, "setFloat", new Object[]{String.class, float.class}, new Object[]{key, value});
    }

    public void setDouble(String key, double value) {
        Reflection.doMethod(nmsObject, "setDouble", new Object[]{String.class, double.class}, new Object[]{key, value});
    }

    public void setString(String key, String value) {
        Reflection.doMethod(nmsObject, "setString(", new Object[]{String.class, String.class}, new Object[]{key, value});
    }

    public void setByteArray(String key, byte[] value) {
        Reflection.doMethod(nmsObject, "setByteArray", new Object[]{String.class, byte[].class}, new Object[]{key, value});
    }

    public void setIntArray(String key, int[] value) {
        Reflection.doMethod(nmsObject, "setIntArray", new Object[]{String.class, int[].class}, new Object[]{key, value});
    }

    public void setBoolean(String key, boolean value) {
        Reflection.doMethod(nmsObject, "setBoolean", new Object[]{String.class, boolean.class}, new Object[]{key, value});
    }

    public void remove(String name) {
        Reflection.doMethod(nmsObject, "remove", new Object[]{String.class}, new Object[]{name});
    }


}
