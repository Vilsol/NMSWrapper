package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockWaterLily")
public class NMSBlockWaterLily extends NMSBlockPlant {

    public NMSBlockWaterLily(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockWaterLily#a(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "a", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class})
    public NMSAxisAlignedBB a(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData){
        return new NMSAxisAlignedBB(NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockWaterLily#c(net.minecraft.server.v1_8_R3.Block)
     */
    @ReflectiveMethod(name = "c", types = {NMSBlock.class})
    public boolean c(NMSBlock block){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, block);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockWaterLily#f(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "f", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class})
    public boolean f(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockWaterLily#toLegacyData(net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "toLegacyData", types = {NMSIBlockData.class})
    public int toLegacyData(NMSIBlockData iBlockData){
        return (int) NMSWrapper.getInstance().exec(nmsObject, iBlockData);
    }

}