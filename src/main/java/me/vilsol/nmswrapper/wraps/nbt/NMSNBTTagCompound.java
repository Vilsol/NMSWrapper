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
        return (Boolean) Reflection.executeMethod(nmsObject, "hasKey", new Object[]{String.class}, new Object[]{name});
    }

    public Boolean hasKeyOfType(String name, int type) {
        return (Boolean) Reflection.executeMethod(nmsObject, "hasKeyOfType", new Object[]{String.class, int.class}, new Object[]{name, type});
    }

    public NMSNBTBase get(String name) {
        NMSNBTBase tag = null;
        Object nmsObject = Reflection.executeMethod(this.nmsObject, "getByte", new Object[]{String.class}, new Object[]{name});

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
        return (byte) Reflection.executeMethod(nmsObject, "getByte", new Object[]{String.class}, new Object[]{name});
    }

    public short getShort(String name) {
        return (short) Reflection.executeMethod(nmsObject, "getShort", new Object[]{String.class}, new Object[]{name});
    }

    public int getInt(String name) {
        return (int) Reflection.executeMethod(nmsObject, "getInt", new Object[]{String.class}, new Object[]{name});
    }

    public long getLong(String name) {
        return (long) Reflection.executeMethod(nmsObject, "getLong", new Object[]{String.class}, new Object[]{name});
    }

    public float getFloat(String name) {
        return (float) Reflection.executeMethod(nmsObject, "getFloat", new Object[]{String.class}, new Object[]{name});
    }

    public double getDouble(String name) {
        return (double) Reflection.executeMethod(nmsObject, "getDouble", new Object[]{String.class}, new Object[]{name});
    }

    public String getString(String name) {
        return (String) Reflection.executeMethod(nmsObject, "getString", new Object[]{String.class}, new Object[]{name});
    }

    public byte[] getByteArray(String name) {
        return (byte[]) Reflection.executeMethod(nmsObject, "getByteArray", new Object[]{String.class}, new Object[]{name});
    }

    public int[] getIntArray(String name) {
        return (int[]) Reflection.executeMethod(nmsObject, "getIntArray", new Object[]{String.class}, new Object[]{name});
    }

    public NMSNBTTagCompound getCompound(String name) {
        return new NMSNBTTagCompound(Reflection.executeMethod(nmsObject, "getCompound", new Object[]{String.class}, new Object[]{name}));
    }

    public NMSNBTTagList getList(String name, int thing) {
        return new NMSNBTTagList(Reflection.executeMethod(nmsObject, "getList", new Object[]{String.class}, new Object[]{name}));
    }

    public boolean getBoolean(String name) {
        return (boolean) Reflection.executeMethod(nmsObject, "getBoolean", new Object[]{String.class}, new Object[]{name});
    }

    public void set(String key, NMSNBTBase value) {
        Reflection.executeMethod(nmsObject, "set", new Object[]{String.class, "NBTBase"}, new Object[]{key, value});
    }

    public void setByte(String key, byte value) {
        Reflection.executeMethod(nmsObject, "setByte", new Object[]{String.class, byte.class}, new Object[]{key, value});
    }

    public void setShort(String key, short value) {
        Reflection.executeMethod(nmsObject, "setShort", new Object[]{String.class, short.class}, new Object[]{key, value});
    }

    public void setInt(String key, int value) {
        Reflection.executeMethod(nmsObject, "setInt", new Object[]{String.class, int.class}, new Object[]{key, value});
    }

    public void setLong(String key, long value) {
        Reflection.executeMethod(nmsObject, "setLong", new Object[]{String.class, long.class}, new Object[]{key, value});
    }

    public void setFloat(String key, float value) {
        Reflection.executeMethod(nmsObject, "setFloat", new Object[]{String.class, float.class}, new Object[]{key, value});
    }

    public void setDouble(String key, double value) {
        Reflection.executeMethod(nmsObject, "setDouble", new Object[]{String.class, double.class}, new Object[]{key, value});
    }

    public void setString(String key, String value) {
        Reflection.executeMethod(nmsObject, "setString(", new Object[]{String.class, String.class}, new Object[]{key, value});
    }

    public void setByteArray(String key, byte[] value) {
        Reflection.executeMethod(nmsObject, "setByteArray", new Object[]{String.class, byte[].class}, new Object[]{key, value});
    }

    public void setIntArray(String key, int[] value) {
        Reflection.executeMethod(nmsObject, "setIntArray", new Object[]{String.class, int[].class}, new Object[]{key, value});
    }

    public void setBoolean(String key, boolean value) {
        Reflection.executeMethod(nmsObject, "setBoolean", new Object[]{String.class, boolean.class}, new Object[]{key, value});
    }

    public void remove(String name) {
        Reflection.executeMethod(nmsObject, "remove", new Object[]{String.class}, new Object[]{name});
    }


}
