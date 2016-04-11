package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityFireball")
public class NMSEntityFireball extends NMSEntity {

    public NMSEntityFireball(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityFireball(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    public NMSEntityFireball(NMSWorld world){
        super("EntityFireball", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    public NMSEntityFireball(NMSWorld world, double d, double d1, double d2, double d3, double d4, double d5){
        super("EntityFireball", new Object[]{NMSWorld.class, double.class, double.class, double.class, double.class, double.class, double.class}, new Object[]{world, d, d1, d2, d3, d4, d5});
    }

    public NMSEntityFireball(NMSWorld world, NMSEntityLiving entityLiving, double d, double d1, double d2){
        super("EntityFireball", new Object[]{NMSWorld.class, NMSEntityLiving.class, double.class, double.class, double.class}, new Object[]{world, entityLiving, d, d1, d2});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityFireball#a(net.minecraft.server.v1_9_R1.NBTTagCompound)
     */
    @ReflectiveMethod(name = "a", types = {NMSNBTTagCompound.class})
    public void a(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityFireball#ad()
     */
    @ReflectiveMethod(name = "ad", types = {})
    public boolean ad(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityFireball#ao()
     */
    @ReflectiveMethod(name = "ao", types = {})
    public float ao(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityFireball#b(net.minecraft.server.v1_9_R1.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public void b(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityFireball#c(float)
     */
    @ReflectiveMethod(name = "c", types = {float.class})
    public float c(float f){
        return (float) NMSWrapper.getInstance().exec(nmsObject, f);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityFireball#damageEntity(net.minecraft.server.v1_9_R1.DamageSource, float)
     */
    @ReflectiveMethod(name = "damageEntity", types = {NMSDamageSource.class, float.class})
    public boolean damageEntity(NMSDamageSource damageSource, float f){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, damageSource, f);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityFireball#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public void h(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityFireball#j()
     */
    @ReflectiveMethod(name = "j", types = {})
    public float j(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityFireball#setDirection(double, double, double)
     */
    @ReflectiveMethod(name = "setDirection", types = {double.class, double.class, double.class})
    public void setDirection(double d, double d1, double d2){
        NMSWrapper.getInstance().exec(nmsObject, d, d1, d2);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityFireball#t_()
     */
    @ReflectiveMethod(name = "t_", types = {})
    public void t_(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}