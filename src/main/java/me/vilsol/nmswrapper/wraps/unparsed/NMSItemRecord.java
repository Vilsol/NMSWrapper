package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ItemRecord")
public class NMSItemRecord extends NMSItem {

    public NMSItemRecord(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemRecord#g(net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "g", types = {NMSItemStack.class})
    public NMSEnumItemRarity g(NMSItemStack itemStack){
        return new NMSEnumItemRarity(NMSWrapper.getInstance().exec(nmsObject, itemStack));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ItemRecord#interactWith(net.minecraft.server.v1_9_R1.ItemStack, net.minecraft.server.v1_9_R1.EntityHuman, net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.EnumDirection, float, float, float)
     */
    @ReflectiveMethod(name = "interactWith", types = {NMSItemStack.class, NMSEntityHuman.class, NMSWorld.class, NMSBlockPosition.class, NMSEnumDirection.class, float.class, float.class, float.class})
    public boolean interactWith(NMSItemStack itemStack, NMSEntityHuman entityHuman, NMSWorld world, NMSBlockPosition blockPosition, NMSEnumDirection enumDirection, float f, float f1, float f2){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack, entityHuman, world, blockPosition, enumDirection, f, f1, f2);
    }

}