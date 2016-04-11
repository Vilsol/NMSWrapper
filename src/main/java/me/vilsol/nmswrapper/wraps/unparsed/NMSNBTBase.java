package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "NBTBase")
public class NMSNBTBase extends NMSWrap {

    public NMSNBTBase(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.NBTBase#a_()
     */
    @ReflectiveMethod(name = "a_", types = {})
    public String a_(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.NBTBase#clone()
     */
    @ReflectiveMethod(name = "clone", types = {})
    public NMSNBTBase clone(){
        return new NMSNBTBase(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.NBTBase#createTag(byte)
     */
    @ReflectiveMethod(name = "createTag", types = {byte.class})
    public NMSNBTBase createTag(byte b){
        return new NMSNBTBase(NMSWrapper.getInstance().exec(nmsObject, b));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.NBTBase#equals(java.lang.Object)
     */
    @ReflectiveMethod(name = "equals", types = {Object.class})
    public boolean equals(Object object){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.NBTBase#getTypeId()
     */
    @ReflectiveMethod(name = "getTypeId", types = {})
    public byte getTypeId(){
        return (byte) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.NBTBase#hashCode()
     */
    @ReflectiveMethod(name = "hashCode", types = {})
    public int hashCode(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.NBTBase#isEmpty()
     */
    @ReflectiveMethod(name = "isEmpty", types = {})
    public boolean isEmpty(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.NBTBase#toString()
     */
    @ReflectiveMethod(name = "toString", types = {})
    public String toString(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    @ReflectiveClass(name = "NBTNumber")
    public class NMSNBTNumber extends NMSNBTBase {

        public NMSNBTNumber(Object nmsObject){
            super(nmsObject);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.NBTBase$NBTNumber#c()
         */
        @ReflectiveMethod(name = "c", types = {})
        public long c(){
            return (long) NMSWrapper.getInstance().exec(nmsObject);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.NBTBase$NBTNumber#d()
         */
        @ReflectiveMethod(name = "d", types = {})
        public int d(){
            return (int) NMSWrapper.getInstance().exec(nmsObject);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.NBTBase$NBTNumber#e()
         */
        @ReflectiveMethod(name = "e", types = {})
        public short e(){
            return (short) NMSWrapper.getInstance().exec(nmsObject);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.NBTBase$NBTNumber#f()
         */
        @ReflectiveMethod(name = "f", types = {})
        public byte f(){
            return (byte) NMSWrapper.getInstance().exec(nmsObject);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.NBTBase$NBTNumber#g()
         */
        @ReflectiveMethod(name = "g", types = {})
        public double g(){
            return (double) NMSWrapper.getInstance().exec(nmsObject);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.NBTBase$NBTNumber#h()
         */
        @ReflectiveMethod(name = "h", types = {})
        public float h(){
            return (float) NMSWrapper.getInstance().exec(nmsObject);
        }

    }

}