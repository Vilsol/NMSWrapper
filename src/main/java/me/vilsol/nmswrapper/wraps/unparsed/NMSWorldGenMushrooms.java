package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

import java.util.Random;

@ReflectiveClass(name = "WorldGenMushrooms")
public class NMSWorldGenMushrooms extends NMSWorldGenerator {

    public NMSWorldGenMushrooms(Object nmsObject){
        super(nmsObject);
    }

    public NMSWorldGenMushrooms(NMSBlockPlant blockPlant){
        super("WorldGenMushrooms", new Object[]{NMSBlockPlant.class}, new Object[]{blockPlant});
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldGenMushrooms#generate(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "generate", types = {NMSWorld.class, Random.class, NMSBlockPosition.class})
    public boolean generate(NMSWorld world, Random random, NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, blockPosition);
    }

}