package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWorld;

import java.util.Random;

@ReflectiveClass(name = "BlockFlowing")
public class NMSBlockFlowing extends NMSBlockFluids {

    public NMSBlockFlowing(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockFlowing#a(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, int)
     */
    @ReflectiveMethod(name = "a", types = {NMSWorld.class, NMSBlockPosition.class, int.class})
    public int a(NMSWorld world, NMSBlockPosition blockPosition, int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockFlowing#b(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData, java.util.Random)
     */
    @ReflectiveMethod(name = "b", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class, Random.class})
    public void b(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, Random random){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData, random);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockFlowing#onPlace(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "onPlace", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class})
    public void onPlace(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData);
    }

}