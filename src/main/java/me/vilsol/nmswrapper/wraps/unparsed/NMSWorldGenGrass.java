package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

import java.util.Random;

@ReflectiveClass(name = "WorldGenGrass")
public class NMSWorldGenGrass extends NMSWorldGenerator {

    public NMSWorldGenGrass(Object nmsObject){
        super(nmsObject);
    }

    public NMSWorldGenGrass(NMSEnumTallGrassType enumTallGrassType){
        super("WorldGenGrass", new Object[]{NMSEnumTallGrassType.class}, new Object[]{enumTallGrassType});
    }

    /**
     * @see net.minecraft.server.v1_9_R1.WorldGenGrass#generate(net.minecraft.server.v1_9_R1.World, java.util.Random, net.minecraft.server.v1_9_R1.BlockPosition)
     */
    @ReflectiveMethod(name = "generate", types = {NMSWorld.class, Random.class, NMSBlockPosition.class})
    public boolean generate(NMSWorld world, Random random, NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, blockPosition);
    }

}