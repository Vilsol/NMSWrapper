package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

import java.util.Random;

@ReflectiveClass(name = "WorldGenGroundBush")
public class NMSWorldGenGroundBush extends NMSWorldGenTrees {

    public NMSWorldGenGroundBush(Object nmsObject){
        super(nmsObject);
    }

    public NMSWorldGenGroundBush(NMSIBlockData iBlockData, NMSIBlockData iBlockData1){
        super("WorldGenGroundBush", new Object[]{NMSIBlockData.class, NMSIBlockData.class}, new Object[]{iBlockData, iBlockData1});
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldGenGroundBush#generate(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "generate", types = {NMSWorld.class, Random.class, NMSBlockPosition.class})
    public boolean generate(NMSWorld world, Random random, NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, blockPosition);
    }

}