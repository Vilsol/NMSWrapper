package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockPumpkin")
public class NMSBlockPumpkin extends NMSBlockDirectional {

    public NMSBlockPumpkin(Object nmsObject){
        super(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockPumpkin#canPlace(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "canPlace", types = {NMSWorld.class, NMSBlockPosition.class})
    public boolean canPlace(NMSWorld world, NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, blockPosition);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockPumpkin#e(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "e", types = {NMSWorld.class, NMSBlockPosition.class})
    public boolean e(NMSWorld world, NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, blockPosition);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockPumpkin#fromLegacyData(int)
     */
    @ReflectiveMethod(name = "fromLegacyData", types = {int.class})
    public NMSIBlockData fromLegacyData(int i){
        return new NMSIBlockData(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockPumpkin#getDetectorIronGolem()
     */
    @ReflectiveMethod(name = "getDetectorIronGolem", types = {})
    public NMSShapeDetector getDetectorIronGolem(){
        return new NMSShapeDetector(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockPumpkin#getDetectorIronGolemPart()
     */
    @ReflectiveMethod(name = "getDetectorIronGolemPart", types = {})
    public NMSShapeDetector getDetectorIronGolemPart(){
        return new NMSShapeDetector(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockPumpkin#getDetectorSnowGolem()
     */
    @ReflectiveMethod(name = "getDetectorSnowGolem", types = {})
    public NMSShapeDetector getDetectorSnowGolem(){
        return new NMSShapeDetector(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockPumpkin#getDetectorSnowGolemPart()
     */
    @ReflectiveMethod(name = "getDetectorSnowGolemPart", types = {})
    public NMSShapeDetector getDetectorSnowGolemPart(){
        return new NMSShapeDetector(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockPumpkin#getPlacedState(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.EnumDirection, float, float, float, int, net.minecraft.server.v1_8_R3.EntityLiving)
     */
    @ReflectiveMethod(name = "getPlacedState", types = {NMSWorld.class, NMSBlockPosition.class, NMSEnumDirection.class, float.class, float.class, float.class, int.class, NMSEntityLiving.class})
    public NMSIBlockData getPlacedState(NMSWorld world, NMSBlockPosition blockPosition, NMSEnumDirection enumDirection, float f, float f1, float f2, int i, NMSEntityLiving entityLiving){
        return new NMSIBlockData(NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, enumDirection, f, f1, f2, i, entityLiving));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockPumpkin#getStateList()
     */
    @ReflectiveMethod(name = "getStateList", types = {})
    public NMSBlockStateList getStateList(){
        return new NMSBlockStateList(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockPumpkin#onPlace(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "onPlace", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class})
    public void onPlace(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockPumpkin#toLegacyData(net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "toLegacyData", types = {NMSIBlockData.class})
    public int toLegacyData(NMSIBlockData iBlockData){
        return (int) NMSWrapper.getInstance().exec(nmsObject, iBlockData);
    }

}