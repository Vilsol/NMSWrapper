package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "NBTTagLong")
public class NMSNBTTagLong extends NMSNBTNumber {

    public NMSNBTTagLong(Object nmsObject){
        super(nmsObject);
    }

    public NMSNBTTagLong(long l){
        super("NBTTagLong", new Object[]{long.class}, new Object[]{l});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NBTTagLong#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public long c(){
        return (long) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagLong#clone()
     */
    @ReflectiveMethod(name = "clone", types = {})
    public NMSNBTBase clone(){
        return new NMSNBTBase(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NBTTagLong#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public int d(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NBTTagLong#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public short e(){
        return (short) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagLong#equals(java.lang.Object)
     */
    @ReflectiveMethod(name = "equals", types = {Object.class})
    public boolean equals(Object object){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NBTTagLong#f()
     */
    @ReflectiveMethod(name = "f", types = {})
    public byte f(){
        return (byte) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NBTTagLong#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public double g(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagLong#getTypeId()
     */
    @ReflectiveMethod(name = "getTypeId", types = {})
    public byte getTypeId(){
        return (byte) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NBTTagLong#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public float h(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagLong#hashCode()
     */
    @ReflectiveMethod(name = "hashCode", types = {})
    public int hashCode(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagLong#toString()
     */
    @ReflectiveMethod(name = "toString", types = {})
    public String toString(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}