package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityProjectile")
public class NMSEntityProjectile extends NMSEntity implements NMSIProjectile {

    public NMSEntityProjectile(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityProjectile(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityProjectile#a(net.minecraft.server.v1_9_R1.NBTTagCompound)
     */
    @ReflectiveMethod(name = "a", types = {NMSNBTTagCompound.class})
    public void a(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityProjectile#b(net.minecraft.server.v1_9_R1.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public void b(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityProjectile#getShooter()
     */
    @ReflectiveMethod(name = "getShooter", types = {})
    public NMSEntityLiving getShooter(){
        return new NMSEntityLiving(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityProjectile#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public void h(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityProjectile#j()
     */
    @ReflectiveMethod(name = "j", types = {})
    public float j(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityProjectile#l()
     */
    @ReflectiveMethod(name = "l", types = {})
    public float l(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityProjectile#m()
     */
    @ReflectiveMethod(name = "m", types = {})
    public float m(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityProjectile#shoot(double, double, double, float, float)
     */
    @ReflectiveMethod(name = "shoot", types = {double.class, double.class, double.class, float.class, float.class})
    public void shoot(double d, double d1, double d2, float f, float f1){
        NMSWrapper.getInstance().exec(nmsObject, d, d1, d2, f, f1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityProjectile#t_()
     */
    @ReflectiveMethod(name = "t_", types = {})
    public void t_(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}