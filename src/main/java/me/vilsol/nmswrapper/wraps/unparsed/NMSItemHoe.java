package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ItemHoe")
public class NMSItemHoe extends NMSItem {

    public NMSItemHoe(Object nmsObject){
        super(nmsObject);
    }

    public NMSItemHoe(NMSEnumToolMaterial enumToolMaterial){
        super("ItemHoe", new Object[]{NMSEnumToolMaterial.class}, new Object[]{enumToolMaterial});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemHoe#a(net.minecraft.server.v1_9_R1.ItemStack, net.minecraft.server.v1_9_R1.EntityHuman, net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.IBlockData)
     */
    @ReflectiveMethod(name = "a", types = {NMSItemStack.class, NMSEntityHuman.class, NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class})
    public boolean a(NMSItemStack itemStack, NMSEntityHuman entityHuman, NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack, entityHuman, world, blockPosition, iBlockData);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemHoe#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public String g(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ItemHoe#interactWith(net.minecraft.server.v1_9_R1.ItemStack, net.minecraft.server.v1_9_R1.EntityHuman, net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.EnumDirection, float, float, float)
     */
    @ReflectiveMethod(name = "interactWith", types = {NMSItemStack.class, NMSEntityHuman.class, NMSWorld.class, NMSBlockPosition.class, NMSEnumDirection.class, float.class, float.class, float.class})
    public boolean interactWith(NMSItemStack itemStack, NMSEntityHuman entityHuman, NMSWorld world, NMSBlockPosition blockPosition, NMSEnumDirection enumDirection, float f, float f1, float f2){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack, entityHuman, world, blockPosition, enumDirection, f, f1, f2);
    }

}