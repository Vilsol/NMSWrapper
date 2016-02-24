package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockState")
public class NMSBlockState extends NMSWrap {

    public NMSBlockState(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockState#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public String a(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockState#equals(java.lang.Object)
     */
    @ReflectiveMethod(name = "equals", types = {Object.class})
    public boolean equals(Object object){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockState#hashCode()
     */
    @ReflectiveMethod(name = "hashCode", types = {})
    public int hashCode(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockState#toString()
     */
    @ReflectiveMethod(name = "toString", types = {})
    public String toString(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}