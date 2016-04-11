package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

import java.util.Random;

@ReflectiveClass(name = "BiomeMesa")
public class NMSBiomeMesa extends NMSBiomeBase {

    public NMSBiomeMesa(Object nmsObject){
        super(nmsObject);
    }

    public NMSBiomeMesa(int i, boolean b, boolean b1){
        super("BiomeMesa", new Object[]{int.class, boolean.class, boolean.class}, new Object[]{i, b, b1});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BiomeMesa#a(net.minecraft.server.v1_9_R1.World, java.util.Random, net.minecraft.server.v1_9_R1.ChunkSnapshot, int, int, double)
     */
    @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSChunkSnapshot.class, int.class, int.class, double.class})
    public void a(NMSWorld world, Random random, NMSChunkSnapshot chunkSnapshot, int i, int i1, double d){
        NMSWrapper.getInstance().exec(nmsObject, world, random, chunkSnapshot, i, i1, d);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BiomeMesa#d(int)
     */
    @ReflectiveMethod(name = "d", types = {int.class})
    public NMSBiomeBase d(int i){
        return new NMSBiomeBase(NMSWrapper.getInstance().exec(nmsObject, i));
    }

}