package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "WorldGenHellLava")
public class NMSWorldGenHellLava extends NMSWorldGenerator {

    public NMSWorldGenHellLava(Object nmsObject){
        super(nmsObject);
    }

    public NMSWorldGenHellLava(NMSBlock block, boolean b){
        super("WorldGenHellLava", new Object[]{NMSBlock.class, boolean.class}, new Object[]{block, b});
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldGenHellLava#generate(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "generate", types = {NMSWorld.class, Random.class, NMSBlockPosition.class})
    public boolean generate(NMSWorld world, Random random, NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, blockPosition);
    }

}