package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "RegistryID")
public class NMSRegistryID extends NMSWrap {

    public NMSRegistryID(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.RegistryID#a(int)
     */
    @ReflectiveMethod(name = "a", types = {int.class})
    public T a(int i){
        return new T(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.RegistryID#b(T)
     */
    @ReflectiveMethod(name = "b", types = {T.class})
    public int b(T t){
        return (int) NMSWrapper.getInstance().exec(nmsObject, t);
    }

}