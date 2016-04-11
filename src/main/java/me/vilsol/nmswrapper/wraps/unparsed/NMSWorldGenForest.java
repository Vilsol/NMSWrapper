package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWorld;

import java.util.Random;

@ReflectiveClass(name = "WorldGenForest")
public class NMSWorldGenForest extends NMSWorldGenTreeAbstract {

    public NMSWorldGenForest(Object nmsObject){
        super(nmsObject);
    }

    public NMSWorldGenForest(boolean b, boolean b1){
        super("WorldGenForest", new Object[]{boolean.class, boolean.class}, new Object[]{b, b1});
    }

    /**
     * @see net.minecraft.server.v1_9_R1.WorldGenForest#generate(net.minecraft.server.v1_9_R1.World, java.util.Random, net.minecraft.server.v1_9_R1.BlockPosition)
     */
    @ReflectiveMethod(name = "generate", types = {NMSWorld.class, Random.class, NMSBlockPosition.class})
    public boolean generate(NMSWorld world, Random random, NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, blockPosition);
    }

}