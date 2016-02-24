package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ItemDoor")
public class NMSItemDoor extends NMSItem {

    public NMSItemDoor(Object nmsObject){
        super(nmsObject);
    }

    public NMSItemDoor(NMSBlock block){
        super("ItemDoor", new Object[]{NMSBlock.class}, new Object[]{block});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ItemDoor#a(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.EnumDirection, net.minecraft.server.v1_8_R3.Block)
     */
    @ReflectiveMethod(name = "a", types = {NMSWorld.class, NMSBlockPosition.class, NMSEnumDirection.class, NMSBlock.class})
    public void a(NMSWorld world, NMSBlockPosition blockPosition, NMSEnumDirection enumDirection, NMSBlock block){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, enumDirection, block);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ItemDoor#interactWith(net.minecraft.server.v1_8_R3.ItemStack, net.minecraft.server.v1_8_R3.EntityHuman, net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.EnumDirection, float, float, float)
     */
    @ReflectiveMethod(name = "interactWith", types = {NMSItemStack.class, NMSEntityHuman.class, NMSWorld.class, NMSBlockPosition.class, NMSEnumDirection.class, float.class, float.class, float.class})
    public boolean interactWith(NMSItemStack itemStack, NMSEntityHuman entityHuman, NMSWorld world, NMSBlockPosition blockPosition, NMSEnumDirection enumDirection, float f, float f1, float f2){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack, entityHuman, world, blockPosition, enumDirection, f, f1, f2);
    }

}