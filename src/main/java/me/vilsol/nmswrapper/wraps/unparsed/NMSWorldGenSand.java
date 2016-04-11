package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

import java.util.Random;

@ReflectiveClass(name = "WorldGenSand")
public class NMSWorldGenSand extends NMSWorldGenerator {

    public NMSWorldGenSand(Object nmsObject){
        super(nmsObject);
    }

    public NMSWorldGenSand(NMSBlock block, int i){
        super("WorldGenSand", new Object[]{NMSBlock.class, int.class}, new Object[]{block, i});
    }

    /**
     * @see net.minecraft.server.v1_9_R1.WorldGenSand#generate(net.minecraft.server.v1_9_R1.World, java.util.Random, net.minecraft.server.v1_9_R1.BlockPosition)
     */
    @ReflectiveMethod(name = "generate", types = {NMSWorld.class, Random.class, NMSBlockPosition.class})
    public boolean generate(NMSWorld world, Random random, NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, blockPosition);
    }

}