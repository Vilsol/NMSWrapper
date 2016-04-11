package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "WorldType")
public class NMSWorldType extends NMSWrap {

    public NMSWorldType(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.WorldType#a(int)
     */
    @ReflectiveMethod(name = "a", types = {int.class})
    public NMSWorldType a(int i){
        return new NMSWorldType(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.WorldType#f()
     */
    @ReflectiveMethod(name = "f", types = {})
    public boolean f(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.WorldType#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public int g(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.WorldType#getType(java.lang.String)
     */
    @ReflectiveMethod(name = "getType", types = {String.class})
    public NMSWorldType getType(String s){
        return new NMSWorldType(NMSWrapper.getInstance().exec(nmsObject, s));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.WorldType#getVersion()
     */
    @ReflectiveMethod(name = "getVersion", types = {})
    public int getVersion(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.WorldType#name()
     */
    @ReflectiveMethod(name = "name", types = {})
    public String name(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}