package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWorld;

import java.util.Random;

@ReflectiveClass(name = "WorldGenMinable")
public class NMSWorldGenMinable extends NMSWorldGenerator {

    public NMSWorldGenMinable(Object nmsObject){
        super(nmsObject);
    }

    public NMSWorldGenMinable(NMSIBlockData iBlockData, int i){
        super("WorldGenMinable", new Object[]{NMSIBlockData.class, int.class}, new Object[]{iBlockData, i});
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldGenMinable#generate(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "generate", types = {NMSWorld.class, Random.class, NMSBlockPosition.class})
    public boolean generate(NMSWorld world, Random random, NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, blockPosition);
    }

}