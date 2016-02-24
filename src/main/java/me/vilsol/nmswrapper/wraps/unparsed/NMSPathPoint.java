package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PathPoint")
public class NMSPathPoint extends NMSWrap {

    public NMSPathPoint(Object nmsObject){
        super(nmsObject);
    }

    public NMSPathPoint(int i, int i1, int i2){
        super("PathPoint", new Object[]{int.class, int.class, int.class}, new Object[]{i, i1, i2});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PathPoint#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public boolean a(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PathPoint#b(net.minecraft.server.v1_8_R3.PathPoint)
     */
    @ReflectiveMethod(name = "b", types = {NMSPathPoint.class})
    public float b(NMSPathPoint pathPoint){
        return (float) NMSWrapper.getInstance().exec(nmsObject, pathPoint);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PathPoint#equals(java.lang.Object)
     */
    @ReflectiveMethod(name = "equals", types = {Object.class})
    public boolean equals(Object object){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PathPoint#hashCode()
     */
    @ReflectiveMethod(name = "hashCode", types = {})
    public int hashCode(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PathPoint#toString()
     */
    @ReflectiveMethod(name = "toString", types = {})
    public String toString(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}