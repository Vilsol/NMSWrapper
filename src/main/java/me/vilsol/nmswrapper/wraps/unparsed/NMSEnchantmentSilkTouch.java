package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EnchantmentSilkTouch")
public class NMSEnchantmentSilkTouch extends NMSEnchantment {

    public NMSEnchantmentSilkTouch(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EnchantmentSilkTouch#a(net.minecraft.server.v1_8_R3.Enchantment)
     */
    @ReflectiveMethod(name = "a", types = {NMSEnchantment.class})
    public boolean a(NMSEnchantment enchantment){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, enchantment);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EnchantmentSilkTouch#b(int)
     */
    @ReflectiveMethod(name = "b", types = {int.class})
    public int b(int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EnchantmentSilkTouch#canEnchant(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "canEnchant", types = {NMSItemStack.class})
    public boolean canEnchant(NMSItemStack itemStack){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EnchantmentSilkTouch#getMaxLevel()
     */
    @ReflectiveMethod(name = "getMaxLevel", types = {})
    public int getMaxLevel(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

}