package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "NBTTagEnd")
public class NMSNBTTagEnd extends NMSNBTBase {

    public NMSNBTTagEnd(Object nmsObject){
        super(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagEnd#clone()
     */
    @ReflectiveMethod(name = "clone", types = {})
    public NMSNBTBase clone(){
        return new NMSNBTBase(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagEnd#getTypeId()
     */
    @ReflectiveMethod(name = "getTypeId", types = {})
    public byte getTypeId(){
        return (byte) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NBTTagEnd#toString()
     */
    @ReflectiveMethod(name = "toString", types = {})
    public String toString(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}