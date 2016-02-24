package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockPistonExtension")
public class NMSBlockPistonExtension extends NMSBlock {

    public NMSBlockPistonExtension(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockPistonExtension#a(java.util.Random)
     */
    @ReflectiveMethod(name = "a", types = {Random.class})
    public int a(Random random){
        return (int) NMSWrapper.getInstance().exec(nmsObject, random);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockPistonExtension#b(int)
     */
    @ReflectiveMethod(name = "b", types = {int.class})
    public NMSEnumDirection b(int i){
        return new NMSEnumDirection(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockPistonExtension#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public boolean c(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockPistonExtension#canPlace(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.EnumDirection)
     */
    @ReflectiveMethod(name = "canPlace", types = {NMSWorld.class, NMSBlockPosition.class, NMSEnumDirection.class})
    public boolean canPlace(NMSWorld world, NMSBlockPosition blockPosition, NMSEnumDirection enumDirection){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, enumDirection);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockPistonExtension#d(net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "d", types = {NMSIBlockData.class})
    public void d(NMSIBlockData iBlockData){
        NMSWrapper.getInstance().exec(nmsObject, iBlockData);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockPistonExtension#doPhysics(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData, net.minecraft.server.v1_8_R3.Block)
     */
    @ReflectiveMethod(name = "doPhysics", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class, NMSBlock.class})
    public void doPhysics(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, NMSBlock block){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData, block);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockPistonExtension#fromLegacyData(int)
     */
    @ReflectiveMethod(name = "fromLegacyData", types = {int.class})
    public NMSIBlockData fromLegacyData(int i){
        return new NMSIBlockData(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockPistonExtension#getStateList()
     */
    @ReflectiveMethod(name = "getStateList", types = {})
    public NMSBlockStateList getStateList(){
        return new NMSBlockStateList(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockPistonExtension#remove(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "remove", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class})
    public void remove(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockPistonExtension#toLegacyData(net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "toLegacyData", types = {NMSIBlockData.class})
    public int toLegacyData(NMSIBlockData iBlockData){
        return (int) NMSWrapper.getInstance().exec(nmsObject, iBlockData);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockPistonExtension#updateShape(net.minecraft.server.v1_8_R3.IBlockAccess, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "updateShape", types = {NMSIBlockAccess.class, NMSBlockPosition.class})
    public void updateShape(NMSIBlockAccess iBlockAccess, NMSBlockPosition blockPosition){
        NMSWrapper.getInstance().exec(nmsObject, iBlockAccess, blockPosition);
    }

}