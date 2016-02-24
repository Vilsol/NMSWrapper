package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "WorldGenForest")
public class NMSWorldGenForest extends NMSWorldGenTreeAbstract {

    public NMSWorldGenForest(Object nmsObject){
        super(nmsObject);
    }

    public NMSWorldGenForest(boolean b, boolean b1){
        super("WorldGenForest", new Object[]{boolean.class, boolean.class}, new Object[]{b, b1});
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldGenForest#generate(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "generate", types = {NMSWorld.class, Random.class, NMSBlockPosition.class})
    public boolean generate(NMSWorld world, Random random, NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, blockPosition);
    }

}