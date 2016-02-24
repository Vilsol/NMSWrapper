package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EnchantmentProtection")
public class NMSEnchantmentProtection extends NMSEnchantment {

    public NMSEnchantmentProtection(Object nmsObject){
        super(nmsObject);
    }

    public NMSEnchantmentProtection(int i, NMSMinecraftKey minecraftKey, int i1, int i2){
        super("EnchantmentProtection", new Object[]{int.class, NMSMinecraftKey.class, int.class, int.class}, new Object[]{i, minecraftKey, i1, i2});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EnchantmentProtection#a(net.minecraft.server.v1_8_R3.Entity, double)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntity.class, double.class})
    public double a(NMSEntity entity, double d){
        return (double) NMSWrapper.getInstance().exec(nmsObject, entity, d);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EnchantmentProtection#b(int)
     */
    @ReflectiveMethod(name = "b", types = {int.class})
    public int b(int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EnchantmentProtection#getMaxLevel()
     */
    @ReflectiveMethod(name = "getMaxLevel", types = {})
    public int getMaxLevel(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

}