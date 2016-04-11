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
     * @see net.minecraft.server.v1_9_R1.LazyInitVar#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public Object c(){
        return NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.LazyInitVar#init()
     */
    @ReflectiveMethod(name = "init", types = {})
    public Object init(){
        return NMSWrapper.getInstance().exec(nmsObject);
    }

}