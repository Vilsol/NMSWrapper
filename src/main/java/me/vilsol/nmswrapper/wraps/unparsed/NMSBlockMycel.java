package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockMycel")
public class NMSBlockMycel extends NMSBlock {

    public NMSBlockMycel(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockMycel#b(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData, java.util.Random)
     */
    @ReflectiveMethod(name = "b", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class, Random.class})
    public void b(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, Random random){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData, random);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockMycel#getDropType(net.minecraft.server.v1_8_R3.IBlockData, java.util.Random, int)
     */
    @ReflectiveMethod(name = "getDropType", types = {NMSIBlockData.class, Random.class, int.class})
    public NMSItem getDropType(NMSIBlockData iBlockData, Random random, int i){
        return new NMSItem(NMSWrapper.getInstance().exec(nmsObject, iBlockData, random, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockMycel#getStateList()
     */
    @ReflectiveMethod(name = "getStateList", types = {})
    public NMSBlockStateList getStateList(){
        return new NMSBlockStateList(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockMycel#toLegacyData(net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "toLegacyData", types = {NMSIBlockData.class})
    public int toLegacyData(NMSIBlockData iBlockData){
        return (int) NMSWrapper.getInstance().exec(nmsObject, iBlockData);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockMycel#updateState(net.minecraft.server.v1_8_R3.IBlockData, net.minecraft.server.v1_8_R3.IBlockAccess, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "updateState", types = {NMSIBlockData.class, NMSIBlockAccess.class, NMSBlockPosition.class})
    public NMSIBlockData updateState(NMSIBlockData iBlockData, NMSIBlockAccess iBlockAccess, NMSBlockPosition blockPosition){
        return new NMSIBlockData(NMSWrapper.getInstance().exec(nmsObject, iBlockData, iBlockAccess, blockPosition));
    }

}