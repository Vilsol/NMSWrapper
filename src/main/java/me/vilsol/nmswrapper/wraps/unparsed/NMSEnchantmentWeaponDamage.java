package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EnchantmentWeaponDamage")
public class NMSEnchantmentWeaponDamage extends NMSEnchantment {

    public NMSEnchantmentWeaponDamage(Object nmsObject){
        super(nmsObject);
    }

    public NMSEnchantmentWeaponDamage(int i, NMSMinecraftKey minecraftKey, int i1, int i2){
        super("EnchantmentWeaponDamage", new Object[]{int.class, NMSMinecraftKey.class, int.class, int.class}, new Object[]{i, minecraftKey, i1, i2});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EnchantmentWeaponDamage#a(net.minecraft.server.v1_9_R1.EntityLiving, net.minecraft.server.v1_9_R1.Entity, int)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityLiving.class, NMSEntity.class, int.class})
    public void a(NMSEntityLiving entityLiving, NMSEntity entity, int i){
        NMSWrapper.getInstance().exec(nmsObject, entityLiving, entity, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EnchantmentWeaponDamage#b(int)
     */
    @ReflectiveMethod(name = "b", types = {int.class})
    public int b(int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EnchantmentWeaponDamage#canEnchant(net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "canEnchant", types = {NMSItemStack.class})
    public boolean canEnchant(NMSItemStack itemStack){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EnchantmentWeaponDamage#getMaxLevel()
     */
    @ReflectiveMethod(name = "getMaxLevel", types = {})
    public int getMaxLevel(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

}