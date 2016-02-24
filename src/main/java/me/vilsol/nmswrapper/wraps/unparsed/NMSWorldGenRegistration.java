package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSNBTTagCompound;
import me.vilsol.nmswrapper.wraps.NMSWorld;
import me.vilsol.nmswrapper.wraps.NMSWrap;

import java.util.Random;

@ReflectiveClass(name = "WorldGenRegistration")
public class NMSWorldGenRegistration extends NMSWrap {

    public NMSWorldGenRegistration(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldGenRegistration#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public void a(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    @ReflectiveClass(name = "WorldGenPyramidPiece")
    public class NMSWorldGenPyramidPiece extends NMSWorldGenScatteredPiece {

        public NMSWorldGenPyramidPiece(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenPyramidPiece(Random random, int i, int i1){
            super("WorldGenPyramidPiece", new Object[]{Random.class, int.class, int.class}, new Object[]{random, i, i1});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenRegistration$WorldGenPyramidPiece#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenRegistration$WorldGenPyramidPiece#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
         */
        @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
        public void b(NMSNBTTagCompound nBTTagCompound){
            NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
        }

    }

    @ReflectiveClass(name = "WorldGenJungleTemple")
    public class NMSWorldGenJungleTemple extends NMSWorldGenScatteredPiece {

        public NMSWorldGenJungleTemple(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenJungleTemple(Random random, int i, int i1){
            super("WorldGenJungleTemple", new Object[]{Random.class, int.class, int.class}, new Object[]{random, i, i1});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenRegistration$WorldGenJungleTemple#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenRegistration$WorldGenJungleTemple#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
         */
        @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
        public void b(NMSNBTTagCompound nBTTagCompound){
            NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
        }

    }

    @ReflectiveClass(name = "WorldGenWitchHut")
    public class NMSWorldGenWitchHut extends NMSWorldGenScatteredPiece {

        public NMSWorldGenWitchHut(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenWitchHut(Random random, int i, int i1){
            super("WorldGenWitchHut", new Object[]{Random.class, int.class, int.class}, new Object[]{random, i, i1});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenRegistration$WorldGenWitchHut#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenRegistration$WorldGenWitchHut#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
         */
        @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
        public void b(NMSNBTTagCompound nBTTagCompound){
            NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
        }

    }

}