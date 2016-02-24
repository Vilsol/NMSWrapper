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
    public V a(int i){
        return new V(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.RegistryMaterials#b(V)
     */
    @ReflectiveMethod(name = "b", types = {V.class})
    public int b(V v){
        return (int) NMSWrapper.getInstance().exec(nmsObject, v);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.RegistryMaterials#c(V)
     */
    @ReflectiveMethod(name = "c", types = {V.class})
    public K c(V v){
        return new K(NMSWrapper.getInstance().exec(nmsObject, v));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.RegistryMaterials#d(K)
     */
    @ReflectiveMethod(name = "d", types = {K.class})
    public boolean d(K k){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, k);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.RegistryMaterials#get(K)
     */
    @ReflectiveMethod(name = "get", types = {K.class})
    public V get(K k){
        return new V(NMSWrapper.getInstance().exec(nmsObject, k));
    }

}