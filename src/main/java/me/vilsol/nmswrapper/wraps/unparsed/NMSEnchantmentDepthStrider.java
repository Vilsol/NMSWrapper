package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EnchantmentDepthStrider")
public class NMSEnchantmentDepthStrider extends NMSEnchantment {

    public NMSEnchantmentDepthStrider(Object nmsObject){
        super(nmsObject);
    }

    public NMSEnchantmentDepthStrider(int i, NMSMinecraftKey minecraftKey, int i1){
        super("EnchantmentDepthStrider", new Object[]{int.class, NMSMinecraftKey.class, int.class}, new Object[]{i, minecraftKey, i1});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EnchantmentDepthStrider#a(int)
     */
    @ReflectiveMethod(name = "a", types = {int.class})
    public int a(int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EnchantmentDepthStrider#b(int)
     */
    @ReflectiveMethod(name = "b", types = {int.class})
    public int b(int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EnchantmentDepthStrider#getMaxLevel()
     */
    @ReflectiveMethod(name = "getMaxLevel", types = {})
    public int getMaxLevel(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

}