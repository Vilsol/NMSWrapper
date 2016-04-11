package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "WorldGenFlatInfo")
public class NMSWorldGenFlatInfo extends NMSWrap {

    public NMSWorldGenFlatInfo(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.WorldGenFlatInfo#a(java.lang.String)
     */
    @ReflectiveMethod(name = "a", types = {String.class})
    public NMSWorldGenFlatInfo a(String s){
        return new NMSWorldGenFlatInfo(NMSWrapper.getInstance().exec(nmsObject, s));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.WorldGenFlatInfo#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public void d(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.WorldGenFlatInfo#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public NMSWorldGenFlatInfo e(){
        return new NMSWorldGenFlatInfo(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.WorldGenFlatInfo#toString()
     */
    @ReflectiveMethod(name = "toString", types = {})
    public String toString(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}