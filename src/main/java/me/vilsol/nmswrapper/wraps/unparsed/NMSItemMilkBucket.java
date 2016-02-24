package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ItemMilkBucket")
public class NMSItemMilkBucket extends NMSItem {

    public NMSItemMilkBucket(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ItemMilkBucket#a(net.minecraft.server.v1_8_R3.ItemStack, net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "a", types = {NMSItemStack.class, NMSWorld.class, NMSEntityHuman.class})
    public NMSItemStack a(NMSItemStack itemStack, NMSWorld world, NMSEntityHuman entityHuman){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, itemStack, world, entityHuman));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ItemMilkBucket#b(net.minecraft.server.v1_8_R3.ItemStack, net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "b", types = {NMSItemStack.class, NMSWorld.class, NMSEntityHuman.class})
    public NMSItemStack b(NMSItemStack itemStack, NMSWorld world, NMSEntityHuman entityHuman){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, itemStack, world, entityHuman));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ItemMilkBucket#d(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "d", types = {NMSItemStack.class})
    public int d(NMSItemStack itemStack){
        return (int) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ItemMilkBucket#e(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "e", types = {NMSItemStack.class})
    public NMSEnumAnimation e(NMSItemStack itemStack){
        return new NMSEnumAnimation(NMSWrapper.getInstance().exec(nmsObject, itemStack));
    }

}