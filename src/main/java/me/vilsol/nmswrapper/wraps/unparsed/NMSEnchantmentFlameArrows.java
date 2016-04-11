package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EnchantmentFlameArrows")
public class NMSEnchantmentFlameArrows extends NMSEnchantment {

    public NMSEnchantmentFlameArrows(Object nmsObject){
        super(nmsObject);
    }

    public NMSEnchantmentFlameArrows(int i, NMSMinecraftKey minecraftKey, int i1){
        super("EnchantmentFlameArrows", new Object[]{int.class, NMSMinecraftKey.class, int.class}, new Object[]{i, minecraftKey, i1});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EnchantmentFlameArrows#a(int)
     */
    @ReflectiveMethod(name = "a", types = {int.class})
    public int a(int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EnchantmentFlameArrows#b(int)
     */
    @ReflectiveMethod(name = "b", types = {int.class})
    public int b(int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EnchantmentFlameArrows#getMaxLevel()
     */
    @ReflectiveMethod(name = "getMaxLevel", types = {})
    public int getMaxLevel(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

}