package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWorld;

import java.util.Random;

@ReflectiveClass(name = "WorldGenPackedIce1")
public class NMSWorldGenPackedIce1 extends NMSWorldGenerator {

    public NMSWorldGenPackedIce1(Object nmsObject){
        super(nmsObject);
    }

    public NMSWorldGenPackedIce1(int i){
        super("WorldGenPackedIce1", new Object[]{int.class}, new Object[]{i});
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldGenPackedIce1#generate(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "generate", types = {NMSWorld.class, Random.class, NMSBlockPosition.class})
    public boolean generate(NMSWorld world, Random random, NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, blockPosition);
    }

}