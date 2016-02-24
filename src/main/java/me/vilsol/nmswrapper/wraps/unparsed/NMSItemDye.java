package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ItemDye")
public class NMSItemDye extends NMSItem {

    public NMSItemDye(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ItemDye#a(net.minecraft.server.v1_8_R3.ItemStack, net.minecraft.server.v1_8_R3.EntityHuman, net.minecraft.server.v1_8_R3.EntityLiving)
     */
    @ReflectiveMethod(name = "a", types = {NMSItemStack.class, NMSEntityHuman.class, NMSEntityLiving.class})
    public boolean a(NMSItemStack itemStack, NMSEntityHuman entityHuman, NMSEntityLiving entityLiving){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack, entityHuman, entityLiving);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ItemDye#e_(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "e_", types = {NMSItemStack.class})
    public String e_(NMSItemStack itemStack){
        return (String) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ItemDye#interactWith(net.minecraft.server.v1_8_R3.ItemStack, net.minecraft.server.v1_8_R3.EntityHuman, net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.EnumDirection, float, float, float)
     */
    @ReflectiveMethod(name = "interactWith", types = {NMSItemStack.class, NMSEntityHuman.class, NMSWorld.class, NMSBlockPosition.class, NMSEnumDirection.class, float.class, float.class, float.class})
    public boolean interactWith(NMSItemStack itemStack, NMSEntityHuman entityHuman, NMSWorld world, NMSBlockPosition blockPosition, NMSEnumDirection enumDirection, float f, float f1, float f2){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack, entityHuman, world, blockPosition, enumDirection, f, f1, f2);
    }

}