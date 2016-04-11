package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "InventoryUtils")
public class NMSInventoryUtils extends NMSWrap {

    public NMSInventoryUtils(Object nmsObject){
        super(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.InventoryUtils#dropEntity(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.Entity, net.minecraft.server.v1_9_R1.IInventory)
     */
    @ReflectiveMethod(name = "dropEntity", types = {NMSWorld.class, NMSEntity.class, NMSIInventory.class})
    public void dropEntity(NMSWorld world, NMSEntity entity, NMSIInventory iInventory){
        NMSWrapper.getInstance().exec(nmsObject, world, entity, iInventory);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.InventoryUtils#dropInventory(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.IInventory)
     */
    @ReflectiveMethod(name = "dropInventory", types = {NMSWorld.class, NMSBlockPosition.class, NMSIInventory.class})
    public void dropInventory(NMSWorld world, NMSBlockPosition blockPosition, NMSIInventory iInventory){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iInventory);
    }

}