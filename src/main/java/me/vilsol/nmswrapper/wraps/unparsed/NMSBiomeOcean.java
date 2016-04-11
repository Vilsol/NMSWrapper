package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWorld;

import java.util.Random;

@ReflectiveClass(name = "BiomeOcean")
public class NMSBiomeOcean extends NMSBiomeBase {

    public NMSBiomeOcean(Object nmsObject){
        super(nmsObject);
    }

    public NMSBiomeOcean(int i){
        super("BiomeOcean", new Object[]{int.class}, new Object[]{i});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BiomeOcean#a(net.minecraft.server.v1_9_R1.World, java.util.Random, net.minecraft.server.v1_9_R1.ChunkSnapshot, int, int, double)
     */
    @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSChunkSnapshot.class, int.class, int.class, double.class})
    public void a(NMSWorld world, Random random, NMSChunkSnapshot chunkSnapshot, int i, int i1, double d){
        NMSWrapper.getInstance().exec(nmsObject, world, random, chunkSnapshot, i, i1, d);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BiomeOcean#m()
     */
    @ReflectiveMethod(name = "m", types = {})
    public NMSEnumTemperature m(){
        return new NMSEnumTemperature(NMSWrapper.getInstance().exec(nmsObject));
    }

}