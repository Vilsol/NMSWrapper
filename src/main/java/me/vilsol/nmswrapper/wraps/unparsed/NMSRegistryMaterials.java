package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "RegistryMaterials")
public class NMSRegistryMaterials extends NMSWrap {

    public NMSRegistryMaterials(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.RegistryMaterials#a(int)
     */
    @ReflectiveMethod(name = "a", types = {int.class})
    public Object a(int i){
        return NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.RegistryMaterials#b(Object)
     */
    @ReflectiveMethod(name = "b", types = {Object.class})
    public int b(Object v){
        return (int) NMSWrapper.getInstance().exec(nmsObject, v);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.RegistryMaterials#c(Object)
     */
    @ReflectiveMethod(name = "c", types = {Object.class})
    public Object c(Object v){
        return NMSWrapper.getInstance().exec(nmsObject, v);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.RegistryMaterials#d(Object)
     */
    @ReflectiveMethod(name = "d", types = {Object.class})
    public boolean d(Object k){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, k);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.RegistryMaterials#get(Object)
     */
    @ReflectiveMethod(name = "get", types = {Object.class})
    public Object get(Object k){
        return NMSWrapper.getInstance().exec(nmsObject, k);
    }

}