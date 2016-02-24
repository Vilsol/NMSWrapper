package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "WorldGenLakes")
public class NMSWorldGenLakes extends NMSWorldGenerator {

    public NMSWorldGenLakes(Object nmsObject){
        super(nmsObject);
    }

    public NMSWorldGenLakes(NMSBlock block){
        super("WorldGenLakes", new Object[]{NMSBlock.class}, new Object[]{block});
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldGenLakes#generate(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "generate", types = {NMSWorld.class, Random.class, NMSBlockPosition.class})
    public boolean generate(NMSWorld world, Random random, NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, blockPosition);
    }

}