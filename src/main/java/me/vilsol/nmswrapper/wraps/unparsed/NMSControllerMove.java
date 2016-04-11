package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ControllerMove")
public class NMSControllerMove extends NMSWrap {

    public NMSControllerMove(Object nmsObject){
        super(nmsObject);
    }

    public NMSControllerMove(NMSEntityInsentient entityInsentient){
        super("ControllerMove", new Object[]{NMSEntityInsentient.class}, new Object[]{entityInsentient});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ControllerMove#a(float, float, float)
     */
    @ReflectiveMethod(name = "a", types = {float.class, float.class, float.class})
    public float a(float f, float f1, float f2){
        return (float) NMSWrapper.getInstance().exec(nmsObject, f, f1, f2);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ControllerMove#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public double b(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ControllerMove#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public void c(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ControllerMove#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public double d(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ControllerMove#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public double e(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ControllerMove#f()
     */
    @ReflectiveMethod(name = "f", types = {})
    public double f(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

}