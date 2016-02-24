package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockFence")
public class NMSBlockFence extends NMSBlock {

    public NMSBlockFence(Object nmsObject){
        super(nmsObject);
    }

    public NMSBlockFence(NMSMaterial material){
        super("BlockFence", new Object[]{NMSMaterial.class}, new Object[]{material});
    }

    public NMSBlockFence(NMSMaterial material, NMSMaterialMapColor materialMapColor){
        super("BlockFence", new Object[]{NMSMaterial.class, NMSMaterialMapColor.class}, new Object[]{material, materialMapColor});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockFence#b(net.minecraft.server.v1_8_R3.IBlockAccess, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "b", types = {NMSIBlockAccess.class, NMSBlockPosition.class})
    public boolean b(NMSIBlockAccess iBlockAccess, NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, iBlockAccess, blockPosition);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockFence#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public boolean c(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockFence#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public boolean d(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockFence#e(net.minecraft.server.v1_8_R3.IBlockAccess, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "e", types = {NMSIBlockAccess.class, NMSBlockPosition.class})
    public boolean e(NMSIBlockAccess iBlockAccess, NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, iBlockAccess, blockPosition);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockFence#getStateList()
     */
    @ReflectiveMethod(name = "getStateList", types = {})
    public NMSBlockStateList getStateList(){
        return new NMSBlockStateList(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockFence#interact(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData, net.minecraft.server.v1_8_R3.EntityHuman, net.minecraft.server.v1_8_R3.EnumDirection, float, float, float)
     */
    @ReflectiveMethod(name = "interact", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class, NMSEntityHuman.class, NMSEnumDirection.class, float.class, float.class, float.class})
    public boolean interact(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, NMSEntityHuman entityHuman, NMSEnumDirection enumDirection, float f, float f1, float f2){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData, entityHuman, enumDirection, f, f1, f2);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockFence#toLegacyData(net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "toLegacyData", types = {NMSIBlockData.class})
    public int toLegacyData(NMSIBlockData iBlockData){
        return (int) NMSWrapper.getInstance().exec(nmsObject, iBlockData);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockFence#updateShape(net.minecraft.server.v1_8_R3.IBlockAccess, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "updateShape", types = {NMSIBlockAccess.class, NMSBlockPosition.class})
    public void updateShape(NMSIBlockAccess iBlockAccess, NMSBlockPosition blockPosition){
        NMSWrapper.getInstance().exec(nmsObject, iBlockAccess, blockPosition);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockFence#updateState(net.minecraft.server.v1_8_R3.IBlockData, net.minecraft.server.v1_8_R3.IBlockAccess, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "updateState", types = {NMSIBlockData.class, NMSIBlockAccess.class, NMSBlockPosition.class})
    public NMSIBlockData updateState(NMSIBlockData iBlockData, NMSIBlockAccess iBlockAccess, NMSBlockPosition blockPosition){
        return new NMSIBlockData(NMSWrapper.getInstance().exec(nmsObject, iBlockData, iBlockAccess, blockPosition));
    }

}