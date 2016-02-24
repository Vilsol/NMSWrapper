package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "NBTTagFloat")
public class NMSNBTTagFloat extends NMSNBTNumber {

    public NMSNBTTagFloat(Object nmsObject){
        super(nmsObject);
    }

    public NMSNBTTagFloat(float f){
        super("NBTTagFloat", new Object[]{float.class}, new Object[]{f});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NBTTagFloat#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public long c(){
        return (long) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagFloat#clone()
     */
    @ReflectiveMethod(name = "clone", types = {})
    public NMSNBTBase clone(){
        return new NMSNBTBase(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NBTTagFloat#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public int d(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NBTTagFloat#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public short e(){
        return (short) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagFloat#equals(java.lang.Object)
     */
    @ReflectiveMethod(name = "equals", types = {Object.class})
    public boolean equals(Object object){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NBTTagFloat#f()
     */
    @ReflectiveMethod(name = "f", types = {})
    public byte f(){
        return (byte) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NBTTagFloat#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public double g(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagFloat#getTypeId()
     */
    @ReflectiveMethod(name = "getTypeId", types = {})
    public byte getTypeId(){
        return (byte) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NBTTagFloat#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public float h(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagFloat#hashCode()
     */
    @ReflectiveMethod(name = "hashCode", types = {})
    public int hashCode(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagFloat#toString()
     */
    @ReflectiveMethod(name = "toString", types = {})
    public String toString(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}