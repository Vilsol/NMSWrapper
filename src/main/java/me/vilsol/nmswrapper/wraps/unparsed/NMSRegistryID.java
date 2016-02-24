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
    public Object a(int i){
        return NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.RegistryID#b(Object)
     */
    @ReflectiveMethod(name = "b", types = {Object.class})
    public int b(Object t){
        return (int) NMSWrapper.getInstance().exec(nmsObject, t);
    }

}