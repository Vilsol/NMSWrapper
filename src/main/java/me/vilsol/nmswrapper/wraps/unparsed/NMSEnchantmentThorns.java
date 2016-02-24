package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EnchantmentThorns")
public class NMSEnchantmentThorns extends NMSEnchantment {

    public NMSEnchantmentThorns(Object nmsObject){
        super(nmsObject);
    }

    public NMSEnchantmentThorns(int i, NMSMinecraftKey minecraftKey, int i1){
        super("EnchantmentThorns", new Object[]{int.class, NMSMinecraftKey.class, int.class}, new Object[]{i, minecraftKey, i1});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EnchantmentThorns#a(int, java.util.Random)
     */
    @ReflectiveMethod(name = "a", types = {int.class, Random.class})
    public boolean a(int i, Random random){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i, random);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EnchantmentThorns#b(int, java.util.Random)
     */
    @ReflectiveMethod(name = "b", types = {int.class, Random.class})
    public int b(int i, Random random){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i, random);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EnchantmentThorns#canEnchant(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "canEnchant", types = {NMSItemStack.class})
    public boolean canEnchant(NMSItemStack itemStack){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EnchantmentThorns#getMaxLevel()
     */
    @ReflectiveMethod(name = "getMaxLevel", types = {})
    public int getMaxLevel(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

}