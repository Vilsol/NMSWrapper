package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

import java.util.Random;

@ReflectiveClass(name = "WorldGenFlowers")
public class NMSWorldGenFlowers extends NMSWorldGenerator {

    public NMSWorldGenFlowers(Object nmsObject){
        super(nmsObject);
    }

    public NMSWorldGenFlowers(NMSBlockFlowers blockFlowers, NMSEnumFlowerVarient enumFlowerVarient){
        super("WorldGenFlowers", new Object[]{NMSBlockFlowers.class, NMSEnumFlowerVarient.class}, new Object[]{blockFlowers, enumFlowerVarient});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.WorldGenFlowers#a(net.minecraft.server.v1_9_R1.BlockFlowers, net.minecraft.server.v1_9_R1.BlockFlowers$EnumFlowerVarient)
     */
    @ReflectiveMethod(name = "a", types = {NMSBlockFlowers.class, NMSEnumFlowerVarient.class})
    public void a(NMSBlockFlowers blockFlowers, NMSEnumFlowerVarient enumFlowerVarient){
        NMSWrapper.getInstance().exec(nmsObject, blockFlowers, enumFlowerVarient);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.WorldGenFlowers#generate(net.minecraft.server.v1_9_R1.World, java.util.Random, net.minecraft.server.v1_9_R1.BlockPosition)
     */
    @ReflectiveMethod(name = "generate", types = {NMSWorld.class, Random.class, NMSBlockPosition.class})
    public boolean generate(NMSWorld world, Random random, NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, blockPosition);
    }

}