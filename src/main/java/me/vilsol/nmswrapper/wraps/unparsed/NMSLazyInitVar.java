package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "LazyInitVar")
public class NMSLazyInitVar extends NMSWrap {

    public NMSLazyInitVar(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.LazyInitVar#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public T c(){
        return new T(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.LazyInitVar#init()
     */
    @ReflectiveMethod(name = "init", types = {})
    public T init(){
        return new T(NMSWrapper.getInstance().exec(nmsObject));
    }

}