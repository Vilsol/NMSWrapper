package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

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
     * @see net.minecraft.server.v1_8_R3.WorldGenFlowers#a(net.minecraft.server.v1_8_R3.BlockFlowers, net.minecraft.server.v1_8_R3.BlockFlowers$EnumFlowerVarient)
     */
    @ReflectiveMethod(name = "a", types = {NMSBlockFlowers.class, NMSEnumFlowerVarient.class})
    public void a(NMSBlockFlowers blockFlowers, NMSEnumFlowerVarient enumFlowerVarient){
        NMSWrapper.getInstance().exec(nmsObject, blockFlowers, enumFlowerVarient);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldGenFlowers#generate(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "generate", types = {NMSWorld.class, Random.class, NMSBlockPosition.class})
    public boolean generate(NMSWorld world, Random random, NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, blockPosition);
    }

}