package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityFishingHook")
public class NMSEntityFishingHook extends NMSEntity {

    public NMSEntityFishingHook(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityFishingHook(NMSWorld world){
        super("EntityFishingHook", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    public NMSEntityFishingHook(NMSWorld world, NMSEntityHuman entityHuman){
        super("EntityFishingHook", new Object[]{NMSWorld.class, NMSEntityHuman.class}, new Object[]{world, entityHuman});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityFishingHook#a(net.minecraft.server.v1_9_R1.NBTTagCompound)
     */
    @ReflectiveMethod(name = "a", types = {NMSNBTTagCompound.class})
    public void a(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityFishingHook#b(net.minecraft.server.v1_9_R1.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public void b(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityFishingHook#c(double, double, double, float, float)
     */
    @ReflectiveMethod(name = "c", types = {double.class, double.class, double.class, float.class, float.class})
    public void c(double d, double d1, double d2, float f, float f1){
        NMSWrapper.getInstance().exec(nmsObject, d, d1, d2, f, f1);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityFishingHook#die()
     */
    @ReflectiveMethod(name = "die", types = {})
    public void die(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityFishingHook#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public void h(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityFishingHook#l()
     */
    @ReflectiveMethod(name = "l", types = {})
    public int l(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityFishingHook#t_()
     */
    @ReflectiveMethod(name = "t_", types = {})
    public void t_(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}