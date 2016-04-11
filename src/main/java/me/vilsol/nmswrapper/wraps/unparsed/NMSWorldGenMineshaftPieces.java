package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSNBTTagCompound;
import me.vilsol.nmswrapper.wraps.NMSWorld;
import me.vilsol.nmswrapper.wraps.NMSWrap;

import java.util.List;
import java.util.Random;

@ReflectiveClass(name = "WorldGenMineshaftPieces")
public class NMSWorldGenMineshaftPieces extends NMSWrap {

    public NMSWorldGenMineshaftPieces(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.WorldGenMineshaftPieces#a(net.minecraft.server.v1_9_R1.StructurePiece, java.util.List, java.util.Random, int, int, int, net.minecraft.server.v1_9_R1.EnumDirection, int)
     */
    @ReflectiveMethod(name = "a", types = {NMSStructurePiece.class, List.class, Random.class, int.class, int.class, int.class, NMSEnumDirection.class, int.class})
    public NMSStructurePiece a(NMSStructurePiece structurePiece, List list, Random random, int i, int i1, int i2, NMSEnumDirection enumDirection, int i3){
        return new NMSStructurePiece(NMSWrapper.getInstance().exec(nmsObject, structurePiece, list, random, i, i1, i2, enumDirection, i3));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.WorldGenMineshaftPieces#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public List b(){
        return (List) NMSWrapper.getInstance().exec(nmsObject);
    }

    @ReflectiveClass(name = "WorldGenMineshaftCorridor")
    public class NMSWorldGenMineshaftCorridor extends NMSStructurePiece {

        public NMSWorldGenMineshaftCorridor(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenMineshaftCorridor(int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenMineshaftCorridor", new Object[]{int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.WorldGenMineshaftPieces$WorldGenMineshaftCorridor#a(net.minecraft.server.v1_9_R1.World, java.util.Random, net.minecraft.server.v1_9_R1.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.WorldGenMineshaftPieces$WorldGenMineshaftCorridor#b(net.minecraft.server.v1_9_R1.NBTTagCompound)
         */
        @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
        public void b(NMSNBTTagCompound nBTTagCompound){
            NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
        }

    }

    @ReflectiveClass(name = "WorldGenMineshaftCross")
    public class NMSWorldGenMineshaftCross extends NMSStructurePiece {

        public NMSWorldGenMineshaftCross(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenMineshaftCross(int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenMineshaftCross", new Object[]{int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.WorldGenMineshaftPieces$WorldGenMineshaftCross#a(net.minecraft.server.v1_9_R1.World, java.util.Random, net.minecraft.server.v1_9_R1.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.WorldGenMineshaftPieces$WorldGenMineshaftCross#b(net.minecraft.server.v1_9_R1.NBTTagCompound)
         */
        @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
        public void b(NMSNBTTagCompound nBTTagCompound){
            NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
        }

    }

    @ReflectiveClass(name = "WorldGenMineshaftRoom")
    public class NMSWorldGenMineshaftRoom extends NMSStructurePiece {

        public NMSWorldGenMineshaftRoom(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenMineshaftRoom(int i, Random random, int i1, int i2){
            super("WorldGenMineshaftRoom", new Object[]{int.class, Random.class, int.class, int.class}, new Object[]{i, random, i1, i2});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.WorldGenMineshaftPieces$WorldGenMineshaftRoom#a(net.minecraft.server.v1_9_R1.NBTTagCompound)
         */
        @ReflectiveMethod(name = "a", types = {NMSNBTTagCompound.class})
        public void a(NMSNBTTagCompound nBTTagCompound){
            NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.WorldGenMineshaftPieces$WorldGenMineshaftRoom#b(net.minecraft.server.v1_9_R1.NBTTagCompound)
         */
        @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
        public void b(NMSNBTTagCompound nBTTagCompound){
            NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
        }

    }

    @ReflectiveClass(name = "WorldGenMineshaftStairs")
    public class NMSWorldGenMineshaftStairs extends NMSStructurePiece {

        public NMSWorldGenMineshaftStairs(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenMineshaftStairs(int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenMineshaftStairs", new Object[]{int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.WorldGenMineshaftPieces$WorldGenMineshaftStairs#a(net.minecraft.server.v1_9_R1.World, java.util.Random, net.minecraft.server.v1_9_R1.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.WorldGenMineshaftPieces$WorldGenMineshaftStairs#b(net.minecraft.server.v1_9_R1.NBTTagCompound)
         */
        @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
        public void b(NMSNBTTagCompound nBTTagCompound){
            NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
        }

    }

}