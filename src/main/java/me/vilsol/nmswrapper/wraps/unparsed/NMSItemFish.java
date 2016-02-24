package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ItemFish")
public class NMSItemFish extends NMSItemFood {

    public NMSItemFish(Object nmsObject){
        super(nmsObject);
    }

    public NMSItemFish(boolean b){
        super("ItemFish", new Object[]{boolean.class}, new Object[]{b});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ItemFish#c(net.minecraft.server.v1_8_R3.ItemStack, net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "c", types = {NMSItemStack.class, NMSWorld.class, NMSEntityHuman.class})
    public void c(NMSItemStack itemStack, NMSWorld world, NMSEntityHuman entityHuman){
        NMSWrapper.getInstance().exec(nmsObject, itemStack, world, entityHuman);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ItemFish#e_(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "e_", types = {NMSItemStack.class})
    public String e_(NMSItemStack itemStack){
        return (String) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ItemFish#getNutrition(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "getNutrition", types = {NMSItemStack.class})
    public int getNutrition(NMSItemStack itemStack){
        return (int) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ItemFish#getSaturationModifier(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "getSaturationModifier", types = {NMSItemStack.class})
    public float getSaturationModifier(NMSItemStack itemStack){
        return (float) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ItemFish#j(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "j", types = {NMSItemStack.class})
    public String j(NMSItemStack itemStack){
        return (String) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

}