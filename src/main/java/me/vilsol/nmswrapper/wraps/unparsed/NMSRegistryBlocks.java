package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "RegistryBlocks")
public class NMSRegistryBlocks extends NMSWrap {

    public NMSRegistryBlocks(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.RegistryBlocks#a(int)
     */
    @ReflectiveMethod(name = "a", types = {int.class})
    public Object a(int i){
        return NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.RegistryBlocks#get(Object)
     */
    @ReflectiveMethod(name = "get", types = {Object.class})
    public Object get(Object k){
        return NMSWrapper.getInstance().exec(nmsObject, k);
    }

}