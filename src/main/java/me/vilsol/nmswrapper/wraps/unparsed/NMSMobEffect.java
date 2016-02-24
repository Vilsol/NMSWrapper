package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "MobEffect")
public class NMSMobEffect extends NMSWrap {

    public NMSMobEffect(Object nmsObject){
        super(nmsObject);
    }

    public NMSMobEffect(int i, int i1){
        super("MobEffect", new Object[]{int.class, int.class}, new Object[]{i, i1});
    }

    public NMSMobEffect(int i, int i1, int i2){
        super("MobEffect", new Object[]{int.class, int.class, int.class}, new Object[]{i, i1, i2});
    }

    public NMSMobEffect(int i, int i1, int i2, boolean b, boolean b1){
        super("MobEffect", new Object[]{int.class, int.class, int.class, boolean.class, boolean.class}, new Object[]{i, i1, i2, b, b1});
    }

    public NMSMobEffect(NMSMobEffect mobEffect){
        super("MobEffect", new Object[]{NMSMobEffect.class}, new Object[]{mobEffect});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MobEffect#a(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "a", types = {NMSNBTTagCompound.class})
    public NMSNBTTagCompound a(NMSNBTTagCompound nBTTagCompound){
        return new NMSNBTTagCompound(NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MobEffect#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public NMSMobEffect b(NMSNBTTagCompound nBTTagCompound){
        return new NMSMobEffect(NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MobEffect#equals(java.lang.Object)
     */
    @ReflectiveMethod(name = "equals", types = {Object.class})
    public boolean equals(Object object){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MobEffect#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public String g(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MobEffect#getAmplifier()
     */
    @ReflectiveMethod(name = "getAmplifier", types = {})
    public int getAmplifier(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MobEffect#getDuration()
     */
    @ReflectiveMethod(name = "getDuration", types = {})
    public int getDuration(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MobEffect#getEffectId()
     */
    @ReflectiveMethod(name = "getEffectId", types = {})
    public int getEffectId(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MobEffect#hashCode()
     */
    @ReflectiveMethod(name = "hashCode", types = {})
    public int hashCode(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MobEffect#isAmbient()
     */
    @ReflectiveMethod(name = "isAmbient", types = {})
    public boolean isAmbient(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MobEffect#isShowParticles()
     */
    @ReflectiveMethod(name = "isShowParticles", types = {})
    public boolean isShowParticles(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MobEffect#setSplash(boolean)
     */
    @ReflectiveMethod(name = "setSplash", types = {boolean.class})
    public void setSplash(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MobEffect#tick(net.minecraft.server.v1_8_R3.EntityLiving)
     */
    @ReflectiveMethod(name = "tick", types = {NMSEntityLiving.class})
    public boolean tick(NMSEntityLiving entityLiving){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityLiving);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MobEffect#toString()
     */
    @ReflectiveMethod(name = "toString", types = {})
    public String toString(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}