package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "MethodProfiler")
public class NMSMethodProfiler extends NMSWrap {

    public NMSMethodProfiler(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.MethodProfiler#a(java.lang.String)
     */
    @ReflectiveMethod(name = "a", types = {String.class})
    public void a(String s){
        NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.MethodProfiler#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public void b(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.MethodProfiler#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public String c(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}