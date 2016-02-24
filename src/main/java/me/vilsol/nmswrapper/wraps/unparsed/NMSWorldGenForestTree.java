package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "WorldGenForestTree")
public class NMSWorldGenForestTree extends NMSWorldGenTreeAbstract {

    public NMSWorldGenForestTree(Object nmsObject){
        super(nmsObject);
    }

    public NMSWorldGenForestTree(boolean b){
        super("WorldGenForestTree", new Object[]{boolean.class}, new Object[]{b});
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldGenForestTree#generate(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "generate", types = {NMSWorld.class, Random.class, NMSBlockPosition.class})
    public boolean generate(NMSWorld world, Random random, NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, blockPosition);
    }

}