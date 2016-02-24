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
     * @see net.minecraft.server.v1_8_R3.RegistrySimple#a(Object, Object)
     */
    @ReflectiveMethod(name = "a", types = {Object.class, Object.class})
    public void a(Object k, Object v){
        NMSWrapper.getInstance().exec(nmsObject, k, v);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.RegistrySimple#d(Object)
     */
    @ReflectiveMethod(name = "d", types = {Object.class})
    public boolean d(Object k){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, k);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.RegistrySimple#get(Object)
     */
    @ReflectiveMethod(name = "get", types = {Object.class})
    public Object get(Object k){
        return NMSWrapper.getInstance().exec(nmsObject, k);
    }

}