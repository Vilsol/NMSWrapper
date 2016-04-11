package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ItemBow")
public class NMSItemBow extends NMSItem {

    public NMSItemBow(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemBow#a(net.minecraft.server.v1_9_R1.ItemStack, net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.EntityHuman)
     */
    @ReflectiveMethod(name = "a", types = {NMSItemStack.class, NMSWorld.class, NMSEntityHuman.class})
    public NMSItemStack a(NMSItemStack itemStack, NMSWorld world, NMSEntityHuman entityHuman){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, itemStack, world, entityHuman));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemBow#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public int b(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemBow#d(net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "d", types = {NMSItemStack.class})
    public int d(NMSItemStack itemStack){
        return (int) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemBow#e(net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "e", types = {NMSItemStack.class})
    public NMSEnumAnimation e(NMSItemStack itemStack){
        return new NMSEnumAnimation(NMSWrapper.getInstance().exec(nmsObject, itemStack));
    }

}