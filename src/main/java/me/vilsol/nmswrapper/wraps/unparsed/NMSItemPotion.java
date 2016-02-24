package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ItemPotion")
public class NMSItemPotion extends NMSItem {

    public NMSItemPotion(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ItemPotion#a(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "a", types = {NMSItemStack.class})
    public String a(NMSItemStack itemStack){
        return (String) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ItemPotion#b(net.minecraft.server.v1_8_R3.ItemStack, net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "b", types = {NMSItemStack.class, NMSWorld.class, NMSEntityHuman.class})
    public NMSItemStack b(NMSItemStack itemStack, NMSWorld world, NMSEntityHuman entityHuman){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, itemStack, world, entityHuman));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ItemPotion#d(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "d", types = {NMSItemStack.class})
    public int d(NMSItemStack itemStack){
        return (int) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ItemPotion#e(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "e", types = {NMSItemStack.class})
    public NMSEnumAnimation e(NMSItemStack itemStack){
        return new NMSEnumAnimation(NMSWrapper.getInstance().exec(nmsObject, itemStack));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ItemPotion#f(int)
     */
    @ReflectiveMethod(name = "f", types = {int.class})
    public boolean f(int i){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i);
    }

}