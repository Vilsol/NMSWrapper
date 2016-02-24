package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "NBTTagList")
public class NMSNBTTagList extends NMSNBTBase {

    public NMSNBTTagList(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NBTTagList#a(int)
     */
    @ReflectiveMethod(name = "a", types = {int.class})
    public NMSNBTBase a(int i){
        return new NMSNBTBase(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagList#add(net.minecraft.server.v1_8_R3.NBTBase)
     */
    @ReflectiveMethod(name = "add", types = {NMSNBTBase.class})
    public void add(NMSNBTBase nBTBase){
        NMSWrapper.getInstance().exec(nmsObject, nBTBase);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagList#clone()
     */
    @ReflectiveMethod(name = "clone", types = {})
    public NMSNBTBase clone(){
        return new NMSNBTBase(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NBTTagList#d(int)
     */
    @ReflectiveMethod(name = "d", types = {int.class})
    public double d(int i){
        return (double) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NBTTagList#e(int)
     */
    @ReflectiveMethod(name = "e", types = {int.class})
    public float e(int i){
        return (float) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagList#equals(java.lang.Object)
     */
    @ReflectiveMethod(name = "equals", types = {Object.class})
    public boolean equals(Object object){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NBTTagList#f()
     */
    @ReflectiveMethod(name = "f", types = {})
    public int f(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NBTTagList#g(int)
     */
    @ReflectiveMethod(name = "g", types = {int.class})
    public NMSNBTBase g(int i){
        return new NMSNBTBase(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagList#get(int)
     */
    @ReflectiveMethod(name = "get", types = {int.class})
    public NMSNBTTagCompound get(int i){
        return new NMSNBTTagCompound(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagList#getString(int)
     */
    @ReflectiveMethod(name = "getString", types = {int.class})
    public String getString(int i){
        return (String) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagList#getTypeId()
     */
    @ReflectiveMethod(name = "getTypeId", types = {})
    public byte getTypeId(){
        return (byte) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagList#hashCode()
     */
    @ReflectiveMethod(name = "hashCode", types = {})
    public int hashCode(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagList#isEmpty()
     */
    @ReflectiveMethod(name = "isEmpty", types = {})
    public boolean isEmpty(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagList#size()
     */
    @ReflectiveMethod(name = "size", types = {})
    public int size(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagList#toString()
     */
    @ReflectiveMethod(name = "toString", types = {})
    public String toString(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}