package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSItemStack;
import me.vilsol.nmswrapper.wraps.NMSWorld;

import java.util.Random;

@ReflectiveClass(name = "BlockRedstoneOre")
public class NMSBlockRedstoneOre extends NMSBlock {

    public NMSBlockRedstoneOre(Object nmsObject){
        super(nmsObject);
    }

    public NMSBlockRedstoneOre(boolean b){
        super("BlockRedstoneOre", new Object[]{boolean.class}, new Object[]{b});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockRedstoneOre#a(java.util.Random)
     */
    @ReflectiveMethod(name = "a", types = {Random.class})
    public int a(Random random){
        return (int) NMSWrapper.getInstance().exec(nmsObject, random);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockRedstoneOre#attack(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "attack", types = {NMSWorld.class, NMSBlockPosition.class, NMSEntityHuman.class})
    public void attack(NMSWorld world, NMSBlockPosition blockPosition, NMSEntityHuman entityHuman){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, entityHuman);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockRedstoneOre#b(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData, java.util.Random)
     */
    @ReflectiveMethod(name = "b", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class, Random.class})
    public void b(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, Random random){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData, random);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockRedstoneOre#dropNaturally(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData, float, int)
     */
    @ReflectiveMethod(name = "dropNaturally", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class, float.class, int.class})
    public void dropNaturally(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, float f, int i){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData, f, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockRedstoneOre#getDropCount(int, java.util.Random)
     */
    @ReflectiveMethod(name = "getDropCount", types = {int.class, Random.class})
    public int getDropCount(int i, Random random){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i, random);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockRedstoneOre#getDropType(net.minecraft.server.v1_8_R3.IBlockData, java.util.Random, int)
     */
    @ReflectiveMethod(name = "getDropType", types = {NMSIBlockData.class, Random.class, int.class})
    public NMSItem getDropType(NMSIBlockData iBlockData, Random random, int i){
        return new NMSItem(NMSWrapper.getInstance().exec(nmsObject, iBlockData, random, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockRedstoneOre#getExpDrop(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.IBlockData, int)
     */
    @ReflectiveMethod(name = "getExpDrop", types = {NMSWorld.class, NMSIBlockData.class, int.class})
    public int getExpDrop(NMSWorld world, NMSIBlockData iBlockData, int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, world, iBlockData, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockRedstoneOre#i(net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "i", types = {NMSIBlockData.class})
    public NMSItemStack i(NMSIBlockData iBlockData){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, iBlockData));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockRedstoneOre#interact(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData, net.minecraft.server.v1_8_R3.EntityHuman, net.minecraft.server.v1_8_R3.EnumDirection, float, float, float)
     */
    @ReflectiveMethod(name = "interact", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class, NMSEntityHuman.class, NMSEnumDirection.class, float.class, float.class, float.class})
    public boolean interact(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, NMSEntityHuman entityHuman, NMSEnumDirection enumDirection, float f, float f1, float f2){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData, entityHuman, enumDirection, f, f1, f2);
    }

}