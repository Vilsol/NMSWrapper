package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWorld;

import java.util.Random;

@ReflectiveClass(name = "BiomeSwamp")
public class NMSBiomeSwamp extends NMSBiomeBase {

    public NMSBiomeSwamp(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BiomeSwamp#a(net.minecraft.server.v1_9_R1.World, java.util.Random, net.minecraft.server.v1_9_R1.ChunkSnapshot, int, int, double)
     */
    @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSChunkSnapshot.class, int.class, int.class, double.class})
    public void a(NMSWorld world, Random random, NMSChunkSnapshot chunkSnapshot, int i, int i1, double d){
        NMSWrapper.getInstance().exec(nmsObject, world, random, chunkSnapshot, i, i1, d);
    }

}