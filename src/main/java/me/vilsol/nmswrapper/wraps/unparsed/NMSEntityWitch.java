package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityWitch")
public class NMSEntityWitch extends NMSEntityMonster implements NMSIRangedEntity {

    public NMSEntityWitch(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityWitch(NMSWorld world){
        super("EntityWitch", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityWitch#a(net.minecraft.server.v1_8_R3.EntityLiving, float)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityLiving.class, float.class})
    public void a(NMSEntityLiving entityLiving, float f){
        NMSWrapper.getInstance().exec(nmsObject, entityLiving, f);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityWitch#applyMagicModifier(net.minecraft.server.v1_8_R3.DamageSource, float)
     */
    @ReflectiveMethod(name = "applyMagicModifier", types = {NMSDamageSource.class, float.class})
    public float applyMagicModifier(NMSDamageSource damageSource, float f){
        return (float) NMSWrapper.getInstance().exec(nmsObject, damageSource, f);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityWitch#bo()
     */
    @ReflectiveMethod(name = "bo", types = {})
    public String bo(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityWitch#bp()
     */
    @ReflectiveMethod(name = "bp", types = {})
    public String bp(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityWitch#dropDeathLoot(boolean, int)
     */
    @ReflectiveMethod(name = "dropDeathLoot", types = {boolean.class, int.class})
    public void dropDeathLoot(boolean b, int i){
        NMSWrapper.getInstance().exec(nmsObject, b, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityWitch#getHeadHeight()
     */
    @ReflectiveMethod(name = "getHeadHeight", types = {})
    public float getHeadHeight(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityWitch#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public void h(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityWitch#initAttributes()
     */
    @ReflectiveMethod(name = "initAttributes", types = {})
    public void initAttributes(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityWitch#m()
     */
    @ReflectiveMethod(name = "m", types = {})
    public void m(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityWitch#n()
     */
    @ReflectiveMethod(name = "n", types = {})
    public boolean n(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityWitch#z()
     */
    @ReflectiveMethod(name = "z", types = {})
    public String z(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}