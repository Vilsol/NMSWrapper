package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntitySlime")
public class NMSEntitySlime extends NMSEntityInsentient implements NMSIMonster {

    public NMSEntitySlime(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntitySlime(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    public NMSEntitySlime(NMSWorld world){
        super("EntitySlime", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySlime#a(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "a", types = {NMSNBTTagCompound.class})
    public void a(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySlime#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public void b(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySlime#bB()
     */
    @ReflectiveMethod(name = "bB", types = {})
    public float bB(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySlime#bF()
     */
    @ReflectiveMethod(name = "bF", types = {})
    public void bF(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySlime#bQ()
     */
    @ReflectiveMethod(name = "bQ", types = {})
    public int bQ(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySlime#bR()
     */
    @ReflectiveMethod(name = "bR", types = {})
    public boolean bR(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySlime#bo()
     */
    @ReflectiveMethod(name = "bo", types = {})
    public String bo(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySlime#bp()
     */
    @ReflectiveMethod(name = "bp", types = {})
    public String bp(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySlime#cf()
     */
    @ReflectiveMethod(name = "cf", types = {})
    public NMSEntitySlime cf(){
        return new NMSEntitySlime(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySlime#cg()
     */
    @ReflectiveMethod(name = "cg", types = {})
    public int cg(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySlime#ch()
     */
    @ReflectiveMethod(name = "ch", types = {})
    public void ch(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySlime#ci()
     */
    @ReflectiveMethod(name = "ci", types = {})
    public boolean ci(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySlime#cj()
     */
    @ReflectiveMethod(name = "cj", types = {})
    public int cj(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySlime#ck()
     */
    @ReflectiveMethod(name = "ck", types = {})
    public String ck(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySlime#cl()
     */
    @ReflectiveMethod(name = "cl", types = {})
    public boolean cl(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySlime#cn()
     */
    @ReflectiveMethod(name = "cn", types = {})
    public boolean cn(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntitySlime#collide(net.minecraft.server.v1_8_R3.Entity)
     */
    @ReflectiveMethod(name = "collide", types = {NMSEntity.class})
    public void collide(NMSEntity entity){
        NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySlime#d(net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "d", types = {NMSEntityHuman.class})
    public void d(NMSEntityHuman entityHuman){
        NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntitySlime#die()
     */
    @ReflectiveMethod(name = "die", types = {})
    public void die(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySlime#e(net.minecraft.server.v1_8_R3.EntityLiving)
     */
    @ReflectiveMethod(name = "e", types = {NMSEntityLiving.class})
    public void e(NMSEntityLiving entityLiving){
        NMSWrapper.getInstance().exec(nmsObject, entityLiving);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntitySlime#getHeadHeight()
     */
    @ReflectiveMethod(name = "getHeadHeight", types = {})
    public float getHeadHeight(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntitySlime#getLoot()
     */
    @ReflectiveMethod(name = "getLoot", types = {})
    public NMSItem getLoot(){
        return new NMSItem(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntitySlime#getSize()
     */
    @ReflectiveMethod(name = "getSize", types = {})
    public int getSize(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySlime#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public void h(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySlime#i(int)
     */
    @ReflectiveMethod(name = "i", types = {int.class})
    public void i(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySlime#n()
     */
    @ReflectiveMethod(name = "n", types = {})
    public NMSEnumParticle n(){
        return new NMSEnumParticle(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntitySlime#prepare(net.minecraft.server.v1_8_R3.DifficultyDamageScaler, net.minecraft.server.v1_8_R3.GroupDataEntity)
     */
    @ReflectiveMethod(name = "prepare", types = {NMSDifficultyDamageScaler.class, NMSGroupDataEntity.class})
    public NMSGroupDataEntity prepare(NMSDifficultyDamageScaler difficultyDamageScaler, NMSGroupDataEntity groupDataEntity){
        return new NMSGroupDataEntity(NMSWrapper.getInstance().exec(nmsObject, difficultyDamageScaler, groupDataEntity));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntitySlime#setSize(int)
     */
    @ReflectiveMethod(name = "setSize", types = {int.class})
    public void setSize(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySlime#t_()
     */
    @ReflectiveMethod(name = "t_", types = {})
    public void t_(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}