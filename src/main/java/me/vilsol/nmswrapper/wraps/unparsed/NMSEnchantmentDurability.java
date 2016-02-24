package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EnchantmentDurability")
public class NMSEnchantmentDurability extends NMSEnchantment {

    public NMSEnchantmentDurability(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EnchantmentDurability#a(net.minecraft.server.v1_8_R3.ItemStack, int, java.util.Random)
     */
    @ReflectiveMethod(name = "a", types = {NMSItemStack.class, int.class, Random.class})
    public boolean a(NMSItemStack itemStack, int i, Random random){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack, i, random);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EnchantmentDurability#b(int)
     */
    @ReflectiveMethod(name = "b", types = {int.class})
    public int b(int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EnchantmentDurability#canEnchant(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "canEnchant", types = {NMSItemStack.class})
    public boolean canEnchant(NMSItemStack itemStack){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EnchantmentDurability#getMaxLevel()
     */
    @ReflectiveMethod(name = "getMaxLevel", types = {})
    public int getMaxLevel(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

}