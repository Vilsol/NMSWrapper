package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWorld;

import java.util.Random;

@ReflectiveClass(name = "BiomeSavanna")
public class NMSBiomeSavanna extends NMSBiomeBase {

    public NMSBiomeSavanna(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BiomeSavanna#a(net.minecraft.server.v1_9_R1.World, java.util.Random, net.minecraft.server.v1_9_R1.BlockPosition)
     */
    @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSBlockPosition.class})
    public void a(NMSWorld world, Random random, NMSBlockPosition blockPosition){
        NMSWrapper.getInstance().exec(nmsObject, world, random, blockPosition);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BiomeSavanna#d(int)
     */
    @ReflectiveMethod(name = "d", types = {int.class})
    public NMSBiomeBase d(int i){
        return new NMSBiomeBase(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    @ReflectiveClass(name = "BiomeSavannaSub")
    public class NMSBiomeSavannaSub extends NMSBiomeBaseSub {

        public NMSBiomeSavannaSub(Object nmsObject){
            super(nmsObject);
        }

        public NMSBiomeSavannaSub(int i, NMSBiomeBase biomeBase){
            super("BiomeSavannaSub", new Object[]{int.class, NMSBiomeBase.class}, new Object[]{i, biomeBase});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.BiomeSavanna$BiomeSavannaSub#a(net.minecraft.server.v1_9_R1.World, java.util.Random, net.minecraft.server.v1_9_R1.BlockPosition)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSBlockPosition.class})
        public void a(NMSWorld world, Random random, NMSBlockPosition blockPosition){
            NMSWrapper.getInstance().exec(nmsObject, world, random, blockPosition);
        }

    }

}