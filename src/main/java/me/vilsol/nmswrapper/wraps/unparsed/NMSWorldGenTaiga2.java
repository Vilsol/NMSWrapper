package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWorld;

import java.util.Random;

@ReflectiveClass(name = "WorldGenTaiga2")
public class NMSWorldGenTaiga2 extends NMSWorldGenTreeAbstract {

    public NMSWorldGenTaiga2(Object nmsObject){
        super(nmsObject);
    }

    public NMSWorldGenTaiga2(boolean b){
        super("WorldGenTaiga2", new Object[]{boolean.class}, new Object[]{b});
    }

    /**
     * @see net.minecraft.server.v1_9_R1.WorldGenTaiga2#generate(net.minecraft.server.v1_9_R1.World, java.util.Random, net.minecraft.server.v1_9_R1.BlockPosition)
     */
    @ReflectiveMethod(name = "generate", types = {NMSWorld.class, Random.class, NMSBlockPosition.class})
    public boolean generate(NMSWorld world, Random random, NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, blockPosition);
    }

}