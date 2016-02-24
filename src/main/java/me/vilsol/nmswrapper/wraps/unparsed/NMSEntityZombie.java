package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityZombie")
public class NMSEntityZombie extends NMSEntityMonster {

    public NMSEntityZombie(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityZombie(NMSWorld world){
        super("EntityZombie", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityZombie#a(float)
     */
    @ReflectiveMethod(name = "a", types = {float.class})
    public void a(float f){
        NMSWrapper.getInstance().exec(nmsObject, f);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityZombie#am()
     */
    @ReflectiveMethod(name = "am", types = {})
    public double am(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityZombie#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public void b(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityZombie#bo()
     */
    @ReflectiveMethod(name = "bo", types = {})
    public String bo(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityZombie#bp()
     */
    @ReflectiveMethod(name = "bp", types = {})
    public String bp(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityZombie#br()
     */
    @ReflectiveMethod(name = "br", types = {})
    public int br(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityZombie#cn()
     */
    @ReflectiveMethod(name = "cn", types = {})
    public boolean cn(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityZombie#cp()
     */
    @ReflectiveMethod(name = "cp", types = {})
    public boolean cp(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityZombie#cq()
     */
    @ReflectiveMethod(name = "cq", types = {})
    public void cq(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityZombie#cr()
     */
    @ReflectiveMethod(name = "cr", types = {})
    public int cr(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityZombie#damageEntity(net.minecraft.server.v1_8_R3.DamageSource, float)
     */
    @ReflectiveMethod(name = "damageEntity", types = {NMSDamageSource.class, float.class})
    public boolean damageEntity(NMSDamageSource damageSource, float f){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, damageSource, f);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityZombie#die(net.minecraft.server.v1_8_R3.DamageSource)
     */
    @ReflectiveMethod(name = "die", types = {NMSDamageSource.class})
    public void die(NMSDamageSource damageSource){
        NMSWrapper.getInstance().exec(nmsObject, damageSource);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityZombie#getExpValue(net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "getExpValue", types = {NMSEntityHuman.class})
    public int getExpValue(NMSEntityHuman entityHuman){
        return (int) NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityZombie#getHeadHeight()
     */
    @ReflectiveMethod(name = "getHeadHeight", types = {})
    public float getHeadHeight(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityZombie#getLoot()
     */
    @ReflectiveMethod(name = "getLoot", types = {})
    public NMSItem getLoot(){
        return new NMSItem(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityZombie#getMonsterType()
     */
    @ReflectiveMethod(name = "getMonsterType", types = {})
    public NMSEnumMonsterType getMonsterType(){
        return new NMSEnumMonsterType(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityZombie#getRareDrop()
     */
    @ReflectiveMethod(name = "getRareDrop", types = {})
    public void getRareDrop(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityZombie#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public void h(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityZombie#initAttributes()
     */
    @ReflectiveMethod(name = "initAttributes", types = {})
    public void initAttributes(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityZombie#isBaby()
     */
    @ReflectiveMethod(name = "isBaby", types = {})
    public boolean isBaby(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityZombie#isTypeNotPersistent()
     */
    @ReflectiveMethod(name = "isTypeNotPersistent", types = {})
    public boolean isTypeNotPersistent(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityZombie#isVillager()
     */
    @ReflectiveMethod(name = "isVillager", types = {})
    public boolean isVillager(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityZombie#m()
     */
    @ReflectiveMethod(name = "m", types = {})
    public void m(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityZombie#n(boolean)
     */
    @ReflectiveMethod(name = "n", types = {boolean.class})
    public void n(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityZombie#prepare(net.minecraft.server.v1_8_R3.DifficultyDamageScaler, net.minecraft.server.v1_8_R3.GroupDataEntity)
     */
    @ReflectiveMethod(name = "prepare", types = {NMSDifficultyDamageScaler.class, NMSGroupDataEntity.class})
    public NMSGroupDataEntity prepare(NMSDifficultyDamageScaler difficultyDamageScaler, NMSGroupDataEntity groupDataEntity){
        return new NMSGroupDataEntity(NMSWrapper.getInstance().exec(nmsObject, difficultyDamageScaler, groupDataEntity));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityZombie#r(net.minecraft.server.v1_8_R3.Entity)
     */
    @ReflectiveMethod(name = "r", types = {NMSEntity.class})
    public boolean r(NMSEntity entity){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityZombie#setBaby(boolean)
     */
    @ReflectiveMethod(name = "setBaby", types = {boolean.class})
    public void setBaby(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityZombie#setSize(float, float)
     */
    @ReflectiveMethod(name = "setSize", types = {float.class, float.class})
    public void setSize(float f, float f1){
        NMSWrapper.getInstance().exec(nmsObject, f, f1);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityZombie#setVillager(boolean)
     */
    @ReflectiveMethod(name = "setVillager", types = {boolean.class})
    public void setVillager(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityZombie#t_()
     */
    @ReflectiveMethod(name = "t_", types = {})
    public void t_(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityZombie#z()
     */
    @ReflectiveMethod(name = "z", types = {})
    public String z(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}