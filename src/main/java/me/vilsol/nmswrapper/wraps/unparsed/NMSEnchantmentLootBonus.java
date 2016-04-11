package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EnchantmentLootBonus")
public class NMSEnchantmentLootBonus extends NMSEnchantment {

    public NMSEnchantmentLootBonus(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EnchantmentLootBonus#a(net.minecraft.server.v1_9_R1.Enchantment)
     */
    @ReflectiveMethod(name = "a", types = {NMSEnchantment.class})
    public boolean a(NMSEnchantment enchantment){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, enchantment);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EnchantmentLootBonus#b(int)
     */
    @ReflectiveMethod(name = "b", types = {int.class})
    public int b(int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EnchantmentLootBonus#getMaxLevel()
     */
    @ReflectiveMethod(name = "getMaxLevel", types = {})
    public int getMaxLevel(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

}