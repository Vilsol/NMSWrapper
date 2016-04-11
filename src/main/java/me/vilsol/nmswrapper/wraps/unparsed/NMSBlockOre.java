package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWorld;

import java.util.Random;

@ReflectiveClass(name = "BlockOre")
public class NMSBlockOre extends NMSBlock {

    public NMSBlockOre(Object nmsObject){
        super(nmsObject);
    }

    public NMSBlockOre(NMSMaterialMapColor materialMapColor){
        super("BlockOre", new Object[]{NMSMaterialMapColor.class}, new Object[]{materialMapColor});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockOre#a(java.util.Random)
     */
    @ReflectiveMethod(name = "a", types = {Random.class})
    public int a(Random random){
        return (int) NMSWrapper.getInstance().exec(nmsObject, random);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockOre#dropNaturally(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.IBlockData, float, int)
     */
    @ReflectiveMethod(name = "dropNaturally", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class, float.class, int.class})
    public void dropNaturally(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, float f, int i){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData, f, i);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockOre#getDropCount(int, java.util.Random)
     */
    @ReflectiveMethod(name = "getDropCount", types = {int.class, Random.class})
    public int getDropCount(int i, Random random){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i, random);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockOre#getDropData(net.minecraft.server.v1_9_R1.IBlockData)
     */
    @ReflectiveMethod(name = "getDropData", types = {NMSIBlockData.class})
    public int getDropData(NMSIBlockData iBlockData){
        return (int) NMSWrapper.getInstance().exec(nmsObject, iBlockData);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockOre#getDropType(net.minecraft.server.v1_9_R1.IBlockData, java.util.Random, int)
     */
    @ReflectiveMethod(name = "getDropType", types = {NMSIBlockData.class, Random.class, int.class})
    public NMSItem getDropType(NMSIBlockData iBlockData, Random random, int i){
        return new NMSItem(NMSWrapper.getInstance().exec(nmsObject, iBlockData, random, i));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockOre#getExpDrop(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.IBlockData, int)
     */
    @ReflectiveMethod(name = "getExpDrop", types = {NMSWorld.class, NMSIBlockData.class, int.class})
    public int getExpDrop(NMSWorld world, NMSIBlockData iBlockData, int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, world, iBlockData, i);
    }

}