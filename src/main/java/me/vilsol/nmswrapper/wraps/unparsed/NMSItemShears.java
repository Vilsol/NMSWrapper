package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ItemShears")
public class NMSItemShears extends NMSItem {

    public NMSItemShears(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ItemShears#a(net.minecraft.server.v1_8_R3.ItemStack, net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.Block, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.EntityLiving)
     */
    @ReflectiveMethod(name = "a", types = {NMSItemStack.class, NMSWorld.class, NMSBlock.class, NMSBlockPosition.class, NMSEntityLiving.class})
    public boolean a(NMSItemStack itemStack, NMSWorld world, NMSBlock block, NMSBlockPosition blockPosition, NMSEntityLiving entityLiving){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack, world, block, blockPosition, entityLiving);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ItemShears#canDestroySpecialBlock(net.minecraft.server.v1_8_R3.Block)
     */
    @ReflectiveMethod(name = "canDestroySpecialBlock", types = {NMSBlock.class})
    public boolean canDestroySpecialBlock(NMSBlock block){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, block);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ItemShears#getDestroySpeed(net.minecraft.server.v1_8_R3.ItemStack, net.minecraft.server.v1_8_R3.Block)
     */
    @ReflectiveMethod(name = "getDestroySpeed", types = {NMSItemStack.class, NMSBlock.class})
    public float getDestroySpeed(NMSItemStack itemStack, NMSBlock block){
        return (float) NMSWrapper.getInstance().exec(nmsObject, itemStack, block);
    }

}