package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ControllerLook")
public class NMSControllerLook extends NMSWrap {

    public NMSControllerLook(Object nmsObject){
        super(nmsObject);
    }

    public NMSControllerLook(NMSEntityInsentient entityInsentient){
        super("ControllerLook", new Object[]{NMSEntityInsentient.class}, new Object[]{entityInsentient});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ControllerLook#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public void a(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ControllerLook#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public boolean b(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ControllerLook#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public double e(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ControllerLook#f()
     */
    @ReflectiveMethod(name = "f", types = {})
    public double f(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ControllerLook#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public double g(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

}