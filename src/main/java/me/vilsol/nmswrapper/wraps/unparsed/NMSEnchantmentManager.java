package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSItemStack;
import me.vilsol.nmswrapper.wraps.NMSWrap;

import java.util.Random;

@ReflectiveClass(name = "EnchantmentManager")
public class NMSEnchantmentManager extends NMSWrap {

    public NMSEnchantmentManager(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EnchantmentManager#a(java.util.Random, net.minecraft.server.v1_9_R1.ItemStack, int)
     */
    @ReflectiveMethod(name = "a", types = {Random.class, NMSItemStack.class, int.class})
    public NMSItemStack a(Random random, NMSItemStack itemStack, int i){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, random, itemStack, i));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EnchantmentManager#b(net.minecraft.server.v1_9_R1.Entity)
     */
    @ReflectiveMethod(name = "b", types = {NMSEntity.class})
    public int b(NMSEntity entity){
        return (int) NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EnchantmentManager#g(net.minecraft.server.v1_9_R1.EntityLiving)
     */
    @ReflectiveMethod(name = "g", types = {NMSEntityLiving.class})
    public int g(NMSEntityLiving entityLiving){
        return (int) NMSWrapper.getInstance().exec(nmsObject, entityLiving);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EnchantmentManager#getBonusBlockLootEnchantmentLevel(net.minecraft.server.v1_9_R1.EntityLiving)
     */
    @ReflectiveMethod(name = "getBonusBlockLootEnchantmentLevel", types = {NMSEntityLiving.class})
    public int getBonusBlockLootEnchantmentLevel(NMSEntityLiving entityLiving){
        return (int) NMSWrapper.getInstance().exec(nmsObject, entityLiving);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EnchantmentManager#getBonusMonsterLootEnchantmentLevel(net.minecraft.server.v1_9_R1.EntityLiving)
     */
    @ReflectiveMethod(name = "getBonusMonsterLootEnchantmentLevel", types = {NMSEntityLiving.class})
    public int getBonusMonsterLootEnchantmentLevel(NMSEntityLiving entityLiving){
        return (int) NMSWrapper.getInstance().exec(nmsObject, entityLiving);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EnchantmentManager#getDigSpeedEnchantmentLevel(net.minecraft.server.v1_9_R1.EntityLiving)
     */
    @ReflectiveMethod(name = "getDigSpeedEnchantmentLevel", types = {NMSEntityLiving.class})
    public int getDigSpeedEnchantmentLevel(NMSEntityLiving entityLiving){
        return (int) NMSWrapper.getInstance().exec(nmsObject, entityLiving);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EnchantmentManager#getEnchantmentLevel(int, net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "getEnchantmentLevel", types = {int.class, NMSItemStack.class})
    public int getEnchantmentLevel(int i, NMSItemStack itemStack){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EnchantmentManager#getFireAspectEnchantmentLevel(net.minecraft.server.v1_9_R1.EntityLiving)
     */
    @ReflectiveMethod(name = "getFireAspectEnchantmentLevel", types = {NMSEntityLiving.class})
    public int getFireAspectEnchantmentLevel(NMSEntityLiving entityLiving){
        return (int) NMSWrapper.getInstance().exec(nmsObject, entityLiving);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EnchantmentManager#getOxygenEnchantmentLevel(net.minecraft.server.v1_9_R1.Entity)
     */
    @ReflectiveMethod(name = "getOxygenEnchantmentLevel", types = {NMSEntity.class})
    public int getOxygenEnchantmentLevel(NMSEntity entity){
        return (int) NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EnchantmentManager#h(net.minecraft.server.v1_9_R1.EntityLiving)
     */
    @ReflectiveMethod(name = "h", types = {NMSEntityLiving.class})
    public int h(NMSEntityLiving entityLiving){
        return (int) NMSWrapper.getInstance().exec(nmsObject, entityLiving);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EnchantmentManager#hasSilkTouchEnchantment(net.minecraft.server.v1_9_R1.EntityLiving)
     */
    @ReflectiveMethod(name = "hasSilkTouchEnchantment", types = {NMSEntityLiving.class})
    public boolean hasSilkTouchEnchantment(NMSEntityLiving entityLiving){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityLiving);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EnchantmentManager#j(net.minecraft.server.v1_9_R1.EntityLiving)
     */
    @ReflectiveMethod(name = "j", types = {NMSEntityLiving.class})
    public boolean j(NMSEntityLiving entityLiving){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityLiving);
    }

}