package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWorld;

import java.util.Random;

@ReflectiveClass(name = "BiomeTaiga")
public class NMSBiomeTaiga extends NMSBiomeBase {

    public NMSBiomeTaiga(Object nmsObject){
        super(nmsObject);
    }

    public NMSBiomeTaiga(int i, int i1){
        super("BiomeTaiga", new Object[]{int.class, int.class}, new Object[]{i, i1});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BiomeTaiga#a(net.minecraft.server.v1_9_R1.World, java.util.Random, net.minecraft.server.v1_9_R1.ChunkSnapshot, int, int, double)
     */
    @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSChunkSnapshot.class, int.class, int.class, double.class})
    public void a(NMSWorld world, Random random, NMSChunkSnapshot chunkSnapshot, int i, int i1, double d){
        NMSWrapper.getInstance().exec(nmsObject, world, random, chunkSnapshot, i, i1, d);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BiomeTaiga#b(java.util.Random)
     */
    @ReflectiveMethod(name = "b", types = {Random.class})
    public NMSWorldGenerator b(Random random){
        return new NMSWorldGenerator(NMSWrapper.getInstance().exec(nmsObject, random));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BiomeTaiga#d(int)
     */
    @ReflectiveMethod(name = "d", types = {int.class})
    public NMSBiomeBase d(int i){
        return new NMSBiomeBase(NMSWrapper.getInstance().exec(nmsObject, i));
    }

}