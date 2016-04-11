package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWorld;

import java.util.Random;

@ReflectiveClass(name = "WorldGenLargeFeature")
public class NMSWorldGenLargeFeature extends NMSStructureGenerator {

    public NMSWorldGenLargeFeature(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.WorldGenLargeFeature#a(net.minecraft.server.v1_9_R1.BlockPosition)
     */
    @ReflectiveMethod(name = "a", types = {NMSBlockPosition.class})
    public boolean a(NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, blockPosition);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.WorldGenLargeFeature#b(int, int)
     */
    @ReflectiveMethod(name = "b", types = {int.class, int.class})
    public NMSStructureStart b(int i, int i1){
        return new NMSStructureStart(NMSWrapper.getInstance().exec(nmsObject, i, i1));
    }

    @ReflectiveClass(name = "WorldGenLargeFeatureStart")
    public class NMSWorldGenLargeFeatureStart extends NMSStructureStart {

        public NMSWorldGenLargeFeatureStart(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenLargeFeatureStart(NMSWorld world, Random random, int i, int i1){
            super("WorldGenLargeFeatureStart", new Object[]{NMSWorld.class, Random.class, int.class, int.class}, new Object[]{world, random, i, i1});
        }

    }

}