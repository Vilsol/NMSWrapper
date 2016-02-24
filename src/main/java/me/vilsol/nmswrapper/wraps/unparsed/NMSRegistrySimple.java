package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "RegistrySimple")
public class NMSRegistrySimple extends NMSWrap {

    public NMSRegistrySimple(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.RegistrySimple#a(K, V)
     */
    @ReflectiveMethod(name = "a", types = {K.class, V.class})
    public void a(K k, V v){
        NMSWrapper.getInstance().exec(nmsObject, k, v);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.RegistrySimple#d(K)
     */
    @ReflectiveMethod(name = "d", types = {K.class})
    public boolean d(K k){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, k);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.RegistrySimple#get(K)
     */
    @ReflectiveMethod(name = "get", types = {K.class})
    public V get(K k){
        return new V(NMSWrapper.getInstance().exec(nmsObject, k));
    }

}