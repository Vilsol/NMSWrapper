package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntitySilverfish")
public class NMSEntitySilverfish extends NMSEntityMonster {

    public NMSEntitySilverfish(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntitySilverfish(NMSWorld world){
        super("EntitySilverfish", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySilverfish#a(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "a", types = {NMSBlockPosition.class})
    public float a(NMSBlockPosition blockPosition){
        return (float) NMSWrapper.getInstance().exec(nmsObject, blockPosition);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySilverfish#am()
     */
    @ReflectiveMethod(name = "am", types = {})
    public double am(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySilverfish#bR()
     */
    @ReflectiveMethod(name = "bR", types = {})
    public boolean bR(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySilverfish#bo()
     */
    @ReflectiveMethod(name = "bo", types = {})
    public String bo(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySilverfish#bp()
     */
    @ReflectiveMethod(name = "bp", types = {})
    public String bp(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntitySilverfish#damageEntity(net.minecraft.server.v1_8_R3.DamageSource, float)
     */
    @ReflectiveMethod(name = "damageEntity", types = {NMSDamageSource.class, float.class})
    public boolean damageEntity(NMSDamageSource damageSource, float f){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, damageSource, f);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntitySilverfish#getHeadHeight()
     */
    @ReflectiveMethod(name = "getHeadHeight", types = {})
    public float getHeadHeight(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntitySilverfish#getLoot()
     */
    @ReflectiveMethod(name = "getLoot", types = {})
    public NMSItem getLoot(){
        return new NMSItem(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntitySilverfish#getMonsterType()
     */
    @ReflectiveMethod(name = "getMonsterType", types = {})
    public NMSEnumMonsterType getMonsterType(){
        return new NMSEnumMonsterType(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntitySilverfish#initAttributes()
     */
    @ReflectiveMethod(name = "initAttributes", types = {})
    public void initAttributes(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySilverfish#n_()
     */
    @ReflectiveMethod(name = "n_", types = {})
    public boolean n_(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySilverfish#s_()
     */
    @ReflectiveMethod(name = "s_", types = {})
    public boolean s_(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySilverfish#t_()
     */
    @ReflectiveMethod(name = "t_", types = {})
    public void t_(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySilverfish#z()
     */
    @ReflectiveMethod(name = "z", types = {})
    public String z(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}