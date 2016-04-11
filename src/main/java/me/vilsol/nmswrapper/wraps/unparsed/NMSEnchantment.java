package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "Enchantment")
public class NMSEnchantment extends NMSWrap {

    public NMSEnchantment(Object nmsObject){
        super(nmsObject);
    }

    public NMSEnchantment(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Enchantment#a(net.minecraft.server.v1_9_R1.EntityLiving, net.minecraft.server.v1_9_R1.Entity, int)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityLiving.class, NMSEntity.class, int.class})
    public void a(NMSEntityLiving entityLiving, NMSEntity entity, int i){
        NMSWrapper.getInstance().exec(nmsObject, entityLiving, entity, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Enchantment#b(net.minecraft.server.v1_9_R1.EntityLiving, net.minecraft.server.v1_9_R1.Entity, int)
     */
    @ReflectiveMethod(name = "b", types = {NMSEntityLiving.class, NMSEntity.class, int.class})
    public void b(NMSEntityLiving entityLiving, NMSEntity entity, int i){
        NMSWrapper.getInstance().exec(nmsObject, entityLiving, entity, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Enchantment#c(java.lang.String)
     */
    @ReflectiveMethod(name = "c", types = {String.class})
    public NMSEnchantment c(String s){
        return new NMSEnchantment(NMSWrapper.getInstance().exec(nmsObject, s));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Enchantment#canEnchant(net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "canEnchant", types = {NMSItemStack.class})
    public boolean canEnchant(NMSItemStack itemStack){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Enchantment#d(int)
     */
    @ReflectiveMethod(name = "d", types = {int.class})
    public String d(int i){
        return (String) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Enchantment#getById(int)
     */
    @ReflectiveMethod(name = "getById", types = {int.class})
    public NMSEnchantment getById(int i){
        return new NMSEnchantment(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Enchantment#getByName(java.lang.String)
     */
    @ReflectiveMethod(name = "getByName", types = {String.class})
    public NMSEnchantment getByName(String s){
        return new NMSEnchantment(NMSWrapper.getInstance().exec(nmsObject, s));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Enchantment#getMaxLevel()
     */
    @ReflectiveMethod(name = "getMaxLevel", types = {})
    public int getMaxLevel(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Enchantment#getRandomWeight()
     */
    @ReflectiveMethod(name = "getRandomWeight", types = {})
    public int getRandomWeight(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Enchantment#getStartLevel()
     */
    @ReflectiveMethod(name = "getStartLevel", types = {})
    public int getStartLevel(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

}