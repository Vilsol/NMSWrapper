package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "DemoPlayerInteractManager")
public class NMSDemoPlayerInteractManager extends NMSPlayerInteractManager {

    public NMSDemoPlayerInteractManager(Object nmsObject){
        super(nmsObject);
    }

    public NMSDemoPlayerInteractManager(NMSWorld world){
        super("DemoPlayerInteractManager", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.DemoPlayerInteractManager#a(net.minecraft.server.v1_9_R1.BlockPosition)
     */
    @ReflectiveMethod(name = "a", types = {NMSBlockPosition.class})
    public void a(NMSBlockPosition blockPosition){
        NMSWrapper.getInstance().exec(nmsObject, blockPosition);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.DemoPlayerInteractManager#breakBlock(net.minecraft.server.v1_9_R1.BlockPosition)
     */
    @ReflectiveMethod(name = "breakBlock", types = {NMSBlockPosition.class})
    public boolean breakBlock(NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, blockPosition);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.DemoPlayerInteractManager#interact(net.minecraft.server.v1_9_R1.EntityHuman, net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.ItemStack, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.EnumDirection, float, float, float)
     */
    @ReflectiveMethod(name = "interact", types = {NMSEntityHuman.class, NMSWorld.class, NMSItemStack.class, NMSBlockPosition.class, NMSEnumDirection.class, float.class, float.class, float.class})
    public boolean interact(NMSEntityHuman entityHuman, NMSWorld world, NMSItemStack itemStack, NMSBlockPosition blockPosition, NMSEnumDirection enumDirection, float f, float f1, float f2){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityHuman, world, itemStack, blockPosition, enumDirection, f, f1, f2);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.DemoPlayerInteractManager#useItem(net.minecraft.server.v1_9_R1.EntityHuman, net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "useItem", types = {NMSEntityHuman.class, NMSWorld.class, NMSItemStack.class})
    public boolean useItem(NMSEntityHuman entityHuman, NMSWorld world, NMSItemStack itemStack){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityHuman, world, itemStack);
    }

}