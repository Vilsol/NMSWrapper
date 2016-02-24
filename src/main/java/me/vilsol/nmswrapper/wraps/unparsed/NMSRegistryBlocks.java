package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "RegistryBlocks")
public class NMSRegistryBlocks extends NMSWrap {

    public NMSRegistryBlocks(Object nmsObject){
        super(nmsObject);
    }

    public NMSRegistryBlocks(K k){
        super("RegistryBlocks", new Object[]{K.class}, new Object[]{k});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.RegistryBlocks#a(int)
     */
    @ReflectiveMethod(name = "a", types = {int.class})
    public V a(int i){
        return new V(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.RegistryBlocks#get(K)
     */
    @ReflectiveMethod(name = "get", types = {K.class})
    public V get(K k){
        return new V(NMSWrapper.getInstance().exec(nmsObject, k));
    }

}