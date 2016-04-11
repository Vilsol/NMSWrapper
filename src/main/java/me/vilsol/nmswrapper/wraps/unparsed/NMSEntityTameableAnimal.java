package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityTameableAnimal")
public class NMSEntityTameableAnimal extends NMSEntityAnimal implements NMSEntityOwnable {

    public NMSEntityTameableAnimal(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityTameableAnimal(NMSWorld world){
        super("EntityTameableAnimal", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    public NMSEntityTameableAnimal(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityTameableAnimal#a(net.minecraft.server.v1_9_R1.EntityLiving, net.minecraft.server.v1_9_R1.EntityLiving)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityLiving.class, NMSEntityLiving.class})
    public boolean a(NMSEntityLiving entityLiving, NMSEntityLiving entityLiving1){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityLiving, entityLiving1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityTameableAnimal#b(net.minecraft.server.v1_9_R1.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public void b(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityTameableAnimal#c(net.minecraft.server.v1_9_R1.EntityLiving)
     */
    @ReflectiveMethod(name = "c", types = {NMSEntityLiving.class})
    public boolean c(NMSEntityLiving entityLiving){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityLiving);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityTameableAnimal#cm()
     */
    @ReflectiveMethod(name = "cm", types = {})
    public void cm(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityTameableAnimal#die(net.minecraft.server.v1_9_R1.DamageSource)
     */
    @ReflectiveMethod(name = "die", types = {NMSDamageSource.class})
    public void die(NMSDamageSource damageSource){
        NMSWrapper.getInstance().exec(nmsObject, damageSource);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityTameableAnimal#e(net.minecraft.server.v1_9_R1.EntityLiving)
     */
    @ReflectiveMethod(name = "e", types = {NMSEntityLiving.class})
    public boolean e(NMSEntityLiving entityLiving){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityLiving);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityTameableAnimal#getGoalSit()
     */
    @ReflectiveMethod(name = "getGoalSit", types = {})
    public NMSPathfinderGoalSit getGoalSit(){
        return new NMSPathfinderGoalSit(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityTameableAnimal#getOwner()
     */
    @ReflectiveMethod(name = "getOwner", types = {})
    public NMSEntity getOwner(){
        return new NMSEntity(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityTameableAnimal#getOwnerUUID()
     */
    @ReflectiveMethod(name = "getOwnerUUID", types = {})
    public String getOwnerUUID(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityTameableAnimal#getScoreboardTeam()
     */
    @ReflectiveMethod(name = "getScoreboardTeam", types = {})
    public NMSScoreboardTeamBase getScoreboardTeam(){
        return new NMSScoreboardTeamBase(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityTameableAnimal#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public void h(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityTameableAnimal#isSitting()
     */
    @ReflectiveMethod(name = "isSitting", types = {})
    public boolean isSitting(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityTameableAnimal#isTamed()
     */
    @ReflectiveMethod(name = "isTamed", types = {})
    public boolean isTamed(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityTameableAnimal#l(boolean)
     */
    @ReflectiveMethod(name = "l", types = {boolean.class})
    public void l(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityTameableAnimal#setOwnerUUID(java.lang.String)
     */
    @ReflectiveMethod(name = "setOwnerUUID", types = {String.class})
    public void setOwnerUUID(String s){
        NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityTameableAnimal#setSitting(boolean)
     */
    @ReflectiveMethod(name = "setSitting", types = {boolean.class})
    public void setSitting(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityTameableAnimal#setTamed(boolean)
     */
    @ReflectiveMethod(name = "setTamed", types = {boolean.class})
    public void setTamed(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

}