package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "WorldGenAcaciaTree")
public class NMSWorldGenAcaciaTree extends NMSWorldGenTreeAbstract {

    public NMSWorldGenAcaciaTree(Object nmsObject){
        super(nmsObject);
    }

    public NMSWorldGenAcaciaTree(boolean b){
        super("WorldGenAcaciaTree", new Object[]{boolean.class}, new Object[]{b});
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldGenAcaciaTree#generate(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "generate", types = {NMSWorld.class, Random.class, NMSBlockPosition.class})
    public boolean generate(NMSWorld world, Random random, NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, blockPosition);
    }

}