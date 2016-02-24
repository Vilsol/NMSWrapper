package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EnchantmentLure")
public class NMSEnchantmentLure extends NMSEnchantment {

    public NMSEnchantmentLure(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EnchantmentLure#a(int)
     */
    @ReflectiveMethod(name = "a", types = {int.class})
    public int a(int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EnchantmentLure#b(int)
     */
    @ReflectiveMethod(name = "b", types = {int.class})
    public int b(int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EnchantmentLure#getMaxLevel()
     */
    @ReflectiveMethod(name = "getMaxLevel", types = {})
    public int getMaxLevel(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

}