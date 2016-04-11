package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWrap;

import java.util.Random;

@ReflectiveClass(name = "BiomeBase")
public class NMSBiomeBase extends NMSWrap {

    public NMSBiomeBase(Object nmsObject){
        super(nmsObject);
    }

    public NMSBiomeBase(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BiomeBase#a(net.minecraft.server.v1_9_R1.BiomeBase)
     */
    @ReflectiveMethod(name = "a", types = {NMSBiomeBase.class})
    public boolean a(NMSBiomeBase biomeBase){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, biomeBase);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BiomeBase#b(net.minecraft.server.v1_9_R1.World, java.util.Random, net.minecraft.server.v1_9_R1.ChunkSnapshot, int, int, double)
     */
    @ReflectiveMethod(name = "b", types = {NMSWorld.class, Random.class, NMSChunkSnapshot.class, int.class, int.class, double.class})
    public void b(NMSWorld world, Random random, NMSChunkSnapshot chunkSnapshot, int i, int i1, double d){
        NMSWrapper.getInstance().exec(nmsObject, world, random, chunkSnapshot, i, i1, d);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BiomeBase#c(int)
     */
    @ReflectiveMethod(name = "c", types = {int.class})
    public NMSBiomeBase c(int i){
        return new NMSBiomeBase(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BiomeBase#d(int)
     */
    @ReflectiveMethod(name = "d", types = {int.class})
    public NMSBiomeBase d(int i){
        return new NMSBiomeBase(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BiomeBase#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public boolean e(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BiomeBase#f()
     */
    @ReflectiveMethod(name = "f", types = {})
    public boolean f(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BiomeBase#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public float g(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BiomeBase#getBiome(int, net.minecraft.server.v1_9_R1.BiomeBase)
     */
    @ReflectiveMethod(name = "getBiome", types = {int.class, NMSBiomeBase.class})
    public NMSBiomeBase getBiome(int i, NMSBiomeBase biomeBase){
        return new NMSBiomeBase(NMSWrapper.getInstance().exec(nmsObject, i, biomeBase));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BiomeBase#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public int h(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BiomeBase#j()
     */
    @ReflectiveMethod(name = "j", types = {})
    public boolean j(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BiomeBase#k()
     */
    @ReflectiveMethod(name = "k", types = {})
    public NMSBiomeBase k(){
        return new NMSBiomeBase(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BiomeBase#m()
     */
    @ReflectiveMethod(name = "m", types = {})
    public NMSEnumTemperature m(){
        return new NMSEnumTemperature(NMSWrapper.getInstance().exec(nmsObject));
    }

}