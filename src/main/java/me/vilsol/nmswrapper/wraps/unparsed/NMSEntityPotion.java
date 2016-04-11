package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityPotion")
public class NMSEntityPotion extends NMSEntityProjectile {

    public NMSEntityPotion(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityPotion(NMSWorld world){
        super("EntityPotion", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    public NMSEntityPotion(NMSWorld world, NMSEntityLiving entityLiving, int i){
        super("EntityPotion", new Object[]{NMSWorld.class, NMSEntityLiving.class, int.class}, new Object[]{world, entityLiving, i});
    }

    public NMSEntityPotion(NMSWorld world, NMSEntityLiving entityLiving, NMSItemStack itemStack){
        super("EntityPotion", new Object[]{NMSWorld.class, NMSEntityLiving.class, NMSItemStack.class}, new Object[]{world, entityLiving, itemStack});
    }

    public NMSEntityPotion(NMSWorld world, double d, double d1, double d2, NMSItemStack itemStack){
        super("EntityPotion", new Object[]{NMSWorld.class, double.class, double.class, double.class, NMSItemStack.class}, new Object[]{world, d, d1, d2, itemStack});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityPotion#a(net.minecraft.server.v1_9_R1.NBTTagCompound)
     */
    @ReflectiveMethod(name = "a", types = {NMSNBTTagCompound.class})
    public void a(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityPotion#b(net.minecraft.server.v1_9_R1.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public void b(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPotion#getPotionValue()
     */
    @ReflectiveMethod(name = "getPotionValue", types = {})
    public int getPotionValue(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityPotion#j()
     */
    @ReflectiveMethod(name = "j", types = {})
    public float j(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityPotion#l()
     */
    @ReflectiveMethod(name = "l", types = {})
    public float l(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityPotion#m()
     */
    @ReflectiveMethod(name = "m", types = {})
    public float m(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPotion#setPotionValue(int)
     */
    @ReflectiveMethod(name = "setPotionValue", types = {int.class})
    public void setPotionValue(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

}