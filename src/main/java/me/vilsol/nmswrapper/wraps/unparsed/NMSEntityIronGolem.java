package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityIronGolem")
public class NMSEntityIronGolem extends NMSEntityGolem {

    public NMSEntityIronGolem(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityIronGolem(NMSWorld world){
        super("EntityIronGolem", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityIronGolem#E()
     */
    @ReflectiveMethod(name = "E", types = {})
    public void E(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityIronGolem#a(net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.Block)
     */
    @ReflectiveMethod(name = "a", types = {NMSBlockPosition.class, NMSBlock.class})
    public void a(NMSBlockPosition blockPosition, NMSBlock block){
        NMSWrapper.getInstance().exec(nmsObject, blockPosition, block);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityIronGolem#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public void b(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityIronGolem#bo()
     */
    @ReflectiveMethod(name = "bo", types = {})
    public String bo(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityIronGolem#bp()
     */
    @ReflectiveMethod(name = "bp", types = {})
    public String bp(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityIronGolem#cm()
     */
    @ReflectiveMethod(name = "cm", types = {})
    public int cm(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityIronGolem#die(net.minecraft.server.v1_8_R3.DamageSource)
     */
    @ReflectiveMethod(name = "die", types = {NMSDamageSource.class})
    public void die(NMSDamageSource damageSource){
        NMSWrapper.getInstance().exec(nmsObject, damageSource);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityIronGolem#dropDeathLoot(boolean, int)
     */
    @ReflectiveMethod(name = "dropDeathLoot", types = {boolean.class, int.class})
    public void dropDeathLoot(boolean b, int i){
        NMSWrapper.getInstance().exec(nmsObject, b, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityIronGolem#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public void h(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityIronGolem#initAttributes()
     */
    @ReflectiveMethod(name = "initAttributes", types = {})
    public void initAttributes(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityIronGolem#isPlayerCreated()
     */
    @ReflectiveMethod(name = "isPlayerCreated", types = {})
    public boolean isPlayerCreated(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityIronGolem#j(int)
     */
    @ReflectiveMethod(name = "j", types = {int.class})
    public int j(int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityIronGolem#m()
     */
    @ReflectiveMethod(name = "m", types = {})
    public void m(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityIronGolem#n()
     */
    @ReflectiveMethod(name = "n", types = {})
    public NMSVillage n(){
        return new NMSVillage(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityIronGolem#r(net.minecraft.server.v1_8_R3.Entity)
     */
    @ReflectiveMethod(name = "r", types = {NMSEntity.class})
    public boolean r(NMSEntity entity){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityIronGolem#s(net.minecraft.server.v1_8_R3.Entity)
     */
    @ReflectiveMethod(name = "s", types = {NMSEntity.class})
    public void s(NMSEntity entity){
        NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityIronGolem#setPlayerCreated(boolean)
     */
    @ReflectiveMethod(name = "setPlayerCreated", types = {boolean.class})
    public void setPlayerCreated(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

}