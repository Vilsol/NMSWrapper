package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

import java.util.Random;

@ReflectiveClass(name = "WorldGenAcaciaTree")
public class NMSWorldGenAcaciaTree extends NMSWorldGenTreeAbstract {

    public NMSWorldGenAcaciaTree(Object nmsObject){
        super(nmsObject);
    }

    public NMSWorldGenAcaciaTree(boolean b){
        super("WorldGenAcaciaTree", new Object[]{boolean.class}, new Object[]{b});
    }

    /**
     * @see net.minecraft.server.v1_9_R1.WorldGenAcaciaTree#generate(net.minecraft.server.v1_9_R1.World, java.util.Random, net.minecraft.server.v1_9_R1.BlockPosition)
     */
    @ReflectiveMethod(name = "generate", types = {NMSWorld.class, Random.class, NMSBlockPosition.class})
    public boolean generate(NMSWorld world, Random random, NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, blockPosition);
    }

}