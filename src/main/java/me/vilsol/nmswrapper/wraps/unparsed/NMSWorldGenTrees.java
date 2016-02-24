package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

import java.util.Random;

@ReflectiveClass(name = "WorldGenTrees")
public class NMSWorldGenTrees extends NMSWorldGenTreeAbstract {

    public NMSWorldGenTrees(Object nmsObject){
        super(nmsObject);
    }

    public NMSWorldGenTrees(boolean b){
        super("WorldGenTrees", new Object[]{boolean.class}, new Object[]{b});
    }

    public NMSWorldGenTrees(boolean b, int i, NMSIBlockData iBlockData, NMSIBlockData iBlockData1, boolean b1){
        super("WorldGenTrees", new Object[]{boolean.class, int.class, NMSIBlockData.class, NMSIBlockData.class, boolean.class}, new Object[]{b, i, iBlockData, iBlockData1, b1});
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldGenTrees#generate(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "generate", types = {NMSWorld.class, Random.class, NMSBlockPosition.class})
    public boolean generate(NMSWorld world, Random random, NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, blockPosition);
    }

}