package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

import java.util.Random;

@ReflectiveClass(name = "WorldGenTallPlant")
public class NMSWorldGenTallPlant extends NMSWorldGenerator {

    public NMSWorldGenTallPlant(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.WorldGenTallPlant#a(net.minecraft.server.v1_9_R1.BlockTallPlant$EnumTallFlowerVariants)
     */
    @ReflectiveMethod(name = "a", types = {NMSEnumTallFlowerVariants.class})
    public void a(NMSEnumTallFlowerVariants enumTallFlowerVariants){
        NMSWrapper.getInstance().exec(nmsObject, enumTallFlowerVariants);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.WorldGenTallPlant#generate(net.minecraft.server.v1_9_R1.World, java.util.Random, net.minecraft.server.v1_9_R1.BlockPosition)
     */
    @ReflectiveMethod(name = "generate", types = {NMSWorld.class, Random.class, NMSBlockPosition.class})
    public boolean generate(NMSWorld world, Random random, NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, blockPosition);
    }

}