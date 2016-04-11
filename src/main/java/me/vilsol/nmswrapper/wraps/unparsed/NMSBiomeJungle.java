package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWorld;

import java.util.Random;

@ReflectiveClass(name = "BiomeJungle")
public class NMSBiomeJungle extends NMSBiomeBase {

    public NMSBiomeJungle(Object nmsObject){
        super(nmsObject);
    }

    public NMSBiomeJungle(int i, boolean b){
        super("BiomeJungle", new Object[]{int.class, boolean.class}, new Object[]{i, b});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BiomeJungle#a(net.minecraft.server.v1_9_R1.World, java.util.Random, net.minecraft.server.v1_9_R1.BlockPosition)
     */
    @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSBlockPosition.class})
    public void a(NMSWorld world, Random random, NMSBlockPosition blockPosition){
        NMSWrapper.getInstance().exec(nmsObject, world, random, blockPosition);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BiomeJungle#b(java.util.Random)
     */
    @ReflectiveMethod(name = "b", types = {Random.class})
    public NMSWorldGenerator b(Random random){
        return new NMSWorldGenerator(NMSWrapper.getInstance().exec(nmsObject, random));
    }

}