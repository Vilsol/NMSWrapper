package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityVillager")
public class NMSEntityVillager extends NMSEntityAgeable implements NMSNPC {

    public NMSEntityVillager(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityVillager(NMSWorld world){
        super("EntityVillager", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    public NMSEntityVillager(NMSWorld world, int i){
        super("EntityVillager", new Object[]{NMSWorld.class, int.class}, new Object[]{world, i});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityVillager#E()
     */
    @ReflectiveMethod(name = "E", types = {})
    public void E(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityVillager#a(net.minecraft.server.v1_8_R3.EntityItem)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityItem.class})
    public void a(NMSEntityItem entityItem){
        NMSWrapper.getInstance().exec(nmsObject, entityItem);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityVillager#a_(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "a_", types = {NMSItemStack.class})
    public void a_(NMSItemStack itemStack){
        NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityVillager#b(net.minecraft.server.v1_8_R3.EntityAgeable)
     */
    @ReflectiveMethod(name = "b", types = {NMSEntityAgeable.class})
    public NMSEntityVillager b(NMSEntityAgeable entityAgeable){
        return new NMSEntityVillager(NMSWrapper.getInstance().exec(nmsObject, entityAgeable));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityVillager#bo()
     */
    @ReflectiveMethod(name = "bo", types = {})
    public String bo(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityVillager#bp()
     */
    @ReflectiveMethod(name = "bp", types = {})
    public String bp(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityVillager#cb()
     */
    @ReflectiveMethod(name = "cb", types = {})
    public boolean cb(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityVillager#cm()
     */
    @ReflectiveMethod(name = "cm", types = {})
    public boolean cm(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityVillager#cn()
     */
    @ReflectiveMethod(name = "cn", types = {})
    public boolean cn(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityVillager#co()
     */
    @ReflectiveMethod(name = "co", types = {})
    public boolean co(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityVillager#cp()
     */
    @ReflectiveMethod(name = "cp", types = {})
    public void cp(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityVillager#cq()
     */
    @ReflectiveMethod(name = "cq", types = {})
    public NMSInventorySubcontainer cq(){
        return new NMSInventorySubcontainer(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityVillager#cr()
     */
    @ReflectiveMethod(name = "cr", types = {})
    public boolean cr(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityVillager#createChild(net.minecraft.server.v1_8_R3.EntityAgeable)
     */
    @ReflectiveMethod(name = "createChild", types = {NMSEntityAgeable.class})
    public NMSEntityAgeable createChild(NMSEntityAgeable entityAgeable){
        return new NMSEntityAgeable(NMSWrapper.getInstance().exec(nmsObject, entityAgeable));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityVillager#cs()
     */
    @ReflectiveMethod(name = "cs", types = {})
    public boolean cs(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityVillager#ct()
     */
    @ReflectiveMethod(name = "ct", types = {})
    public boolean ct(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityVillager#cu()
     */
    @ReflectiveMethod(name = "cu", types = {})
    public boolean cu(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityVillager#d(int, net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "d", types = {int.class, NMSItemStack.class})
    public boolean d(int i, NMSItemStack itemStack){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityVillager#die(net.minecraft.server.v1_8_R3.DamageSource)
     */
    @ReflectiveMethod(name = "die", types = {NMSDamageSource.class})
    public void die(NMSDamageSource damageSource){
        NMSWrapper.getInstance().exec(nmsObject, damageSource);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityVillager#getHeadHeight()
     */
    @ReflectiveMethod(name = "getHeadHeight", types = {})
    public float getHeadHeight(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityVillager#getOffers(net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "getOffers", types = {NMSEntityHuman.class})
    public NMSMerchantRecipeList getOffers(NMSEntityHuman entityHuman){
        return new NMSMerchantRecipeList(NMSWrapper.getInstance().exec(nmsObject, entityHuman));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityVillager#getProfession()
     */
    @ReflectiveMethod(name = "getProfession", types = {})
    public int getProfession(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityVillager#getScoreboardDisplayName()
     */
    @ReflectiveMethod(name = "getScoreboardDisplayName", types = {})
    public NMSIChatBaseComponent getScoreboardDisplayName(){
        return (NMSIChatBaseComponent) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityVillager#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public void h(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityVillager#initAttributes()
     */
    @ReflectiveMethod(name = "initAttributes", types = {})
    public void initAttributes(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityVillager#isTypeNotPersistent()
     */
    @ReflectiveMethod(name = "isTypeNotPersistent", types = {})
    public boolean isTypeNotPersistent(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityVillager#l(boolean)
     */
    @ReflectiveMethod(name = "l", types = {boolean.class})
    public void l(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityVillager#m(boolean)
     */
    @ReflectiveMethod(name = "m", types = {boolean.class})
    public void m(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityVillager#n(boolean)
     */
    @ReflectiveMethod(name = "n", types = {boolean.class})
    public boolean n(boolean b){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityVillager#o(boolean)
     */
    @ReflectiveMethod(name = "o", types = {boolean.class})
    public void o(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityVillager#onLightningStrike(net.minecraft.server.v1_8_R3.EntityLightning)
     */
    @ReflectiveMethod(name = "onLightningStrike", types = {NMSEntityLightning.class})
    public void onLightningStrike(NMSEntityLightning entityLightning){
        NMSWrapper.getInstance().exec(nmsObject, entityLightning);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityVillager#prepare(net.minecraft.server.v1_8_R3.DifficultyDamageScaler, net.minecraft.server.v1_8_R3.GroupDataEntity)
     */
    @ReflectiveMethod(name = "prepare", types = {NMSDifficultyDamageScaler.class, NMSGroupDataEntity.class})
    public NMSGroupDataEntity prepare(NMSDifficultyDamageScaler difficultyDamageScaler, NMSGroupDataEntity groupDataEntity){
        return (NMSGroupDataEntity) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject, difficultyDamageScaler, groupDataEntity));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityVillager#setProfession(int)
     */
    @ReflectiveMethod(name = "setProfession", types = {int.class})
    public void setProfession(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityVillager#v_()
     */
    @ReflectiveMethod(name = "v_", types = {})
    public NMSEntityHuman v_(){
        return new NMSEntityHuman(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityVillager#z()
     */
    @ReflectiveMethod(name = "z", types = {})
    public String z(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}