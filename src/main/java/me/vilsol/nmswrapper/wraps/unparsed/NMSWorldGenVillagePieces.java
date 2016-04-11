package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWorld;
import me.vilsol.nmswrapper.wraps.NMSWrap;
import me.vilsol.nmswrapper.wraps.NMSNBTTagCompound;

import java.util.Random;

@ReflectiveClass(name = "WorldGenVillagePieces")
public class NMSWorldGenVillagePieces extends NMSWrap {

    public NMSWorldGenVillagePieces(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.WorldGenVillagePieces#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public void a(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    @ReflectiveClass(name = "WorldGenVillageFarm2")
    public class NMSWorldGenVillageFarm2 extends NMSWorldGenVillagePiece {

        public NMSWorldGenVillageFarm2(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenVillageFarm2(NMSWorldGenVillageStartPiece worldGenVillageStartPiece, int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenVillageFarm2", new Object[]{NMSWorldGenVillageStartPiece.class, int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{worldGenVillageStartPiece, i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.WorldGenVillagePieces$WorldGenVillageFarm2#a(net.minecraft.server.v1_9_R1.World, java.util.Random, net.minecraft.server.v1_9_R1.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.WorldGenVillagePieces$WorldGenVillageFarm2#b(net.minecraft.server.v1_9_R1.NBTTagCompound)
         */
        @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
        public void b(NMSNBTTagCompound nBTTagCompound){
            NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
        }

    }

    @ReflectiveClass(name = "WorldGenVillageLight")
    public class NMSWorldGenVillageLight extends NMSWorldGenVillagePiece {

        public NMSWorldGenVillageLight(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenVillageLight(NMSWorldGenVillageStartPiece worldGenVillageStartPiece, int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenVillageLight", new Object[]{NMSWorldGenVillageStartPiece.class, int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{worldGenVillageStartPiece, i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.WorldGenVillagePieces$WorldGenVillageLight#a(net.minecraft.server.v1_9_R1.World, java.util.Random, net.minecraft.server.v1_9_R1.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

    }

    @ReflectiveClass(name = "WorldGenVillageHut")
    public class NMSWorldGenVillageHut extends NMSWorldGenVillagePiece {

        public NMSWorldGenVillageHut(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenVillageHut(NMSWorldGenVillageStartPiece worldGenVillageStartPiece, int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenVillageHut", new Object[]{NMSWorldGenVillageStartPiece.class, int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{worldGenVillageStartPiece, i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.WorldGenVillagePieces$WorldGenVillageHut#a(net.minecraft.server.v1_9_R1.World, java.util.Random, net.minecraft.server.v1_9_R1.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.WorldGenVillagePieces$WorldGenVillageHut#b(net.minecraft.server.v1_9_R1.NBTTagCompound)
         */
        @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
        public void b(NMSNBTTagCompound nBTTagCompound){
            NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
        }

    }

    @ReflectiveClass(name = "WorldGenVillageLibrary")
    public class NMSWorldGenVillageLibrary extends NMSWorldGenVillagePiece {

        public NMSWorldGenVillageLibrary(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenVillageLibrary(NMSWorldGenVillageStartPiece worldGenVillageStartPiece, int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenVillageLibrary", new Object[]{NMSWorldGenVillageStartPiece.class, int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{worldGenVillageStartPiece, i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.WorldGenVillagePieces$WorldGenVillageLibrary#a(net.minecraft.server.v1_9_R1.World, java.util.Random, net.minecraft.server.v1_9_R1.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.WorldGenVillagePieces$WorldGenVillageLibrary#c(int, int)
         */
        @ReflectiveMethod(name = "c", types = {int.class, int.class})
        public int c(int i, int i1){
            return (int) NMSWrapper.getInstance().exec(nmsObject, i, i1);
        }

    }

    @ReflectiveClass(name = "WorldGenVillagePieceWeight")
    public class NMSWorldGenVillagePieceWeight extends NMSWrap {

        public NMSWorldGenVillagePieceWeight(Object nmsObject){
            super(nmsObject);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.WorldGenVillagePieces$WorldGenVillagePieceWeight#a()
         */
        @ReflectiveMethod(name = "a", types = {})
        public boolean a(){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject);
        }

    }

    @ReflectiveClass(name = "WorldGenVillageRoad")
    public class NMSWorldGenVillageRoad extends NMSWorldGenVillageRoadPiece {

        public NMSWorldGenVillageRoad(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenVillageRoad(NMSWorldGenVillageStartPiece worldGenVillageStartPiece, int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenVillageRoad", new Object[]{NMSWorldGenVillageStartPiece.class, int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{worldGenVillageStartPiece, i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.WorldGenVillagePieces$WorldGenVillageRoad#a(net.minecraft.server.v1_9_R1.World, java.util.Random, net.minecraft.server.v1_9_R1.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.WorldGenVillagePieces$WorldGenVillageRoad#b(net.minecraft.server.v1_9_R1.NBTTagCompound)
         */
        @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
        public void b(NMSNBTTagCompound nBTTagCompound){
            NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
        }

    }

    @ReflectiveClass(name = "WorldGenVillageHouse2")
    public class NMSWorldGenVillageHouse2 extends NMSWorldGenVillagePiece {

        public NMSWorldGenVillageHouse2(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenVillageHouse2(NMSWorldGenVillageStartPiece worldGenVillageStartPiece, int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenVillageHouse2", new Object[]{NMSWorldGenVillageStartPiece.class, int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{worldGenVillageStartPiece, i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.WorldGenVillagePieces$WorldGenVillageHouse2#a(net.minecraft.server.v1_9_R1.World, java.util.Random, net.minecraft.server.v1_9_R1.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

    }

    @ReflectiveClass(name = "WorldGenVillageButcher")
    public class NMSWorldGenVillageButcher extends NMSWorldGenVillagePiece {

        public NMSWorldGenVillageButcher(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenVillageButcher(NMSWorldGenVillageStartPiece worldGenVillageStartPiece, int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenVillageButcher", new Object[]{NMSWorldGenVillageStartPiece.class, int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{worldGenVillageStartPiece, i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.WorldGenVillagePieces$WorldGenVillageButcher#a(net.minecraft.server.v1_9_R1.World, java.util.Random, net.minecraft.server.v1_9_R1.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.WorldGenVillagePieces$WorldGenVillageButcher#c(int, int)
         */
        @ReflectiveMethod(name = "c", types = {int.class, int.class})
        public int c(int i, int i1){
            return (int) NMSWrapper.getInstance().exec(nmsObject, i, i1);
        }

    }

    @ReflectiveClass(name = "WorldGenVillageTemple")
    public class NMSWorldGenVillageTemple extends NMSWorldGenVillagePiece {

        public NMSWorldGenVillageTemple(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenVillageTemple(NMSWorldGenVillageStartPiece worldGenVillageStartPiece, int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenVillageTemple", new Object[]{NMSWorldGenVillageStartPiece.class, int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{worldGenVillageStartPiece, i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.WorldGenVillagePieces$WorldGenVillageTemple#a(net.minecraft.server.v1_9_R1.World, java.util.Random, net.minecraft.server.v1_9_R1.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.WorldGenVillagePieces$WorldGenVillageTemple#c(int, int)
         */
        @ReflectiveMethod(name = "c", types = {int.class, int.class})
        public int c(int i, int i1){
            return (int) NMSWrapper.getInstance().exec(nmsObject, i, i1);
        }

    }

    @ReflectiveClass(name = "WorldGenVillageBlacksmith")
    public class NMSWorldGenVillageBlacksmith extends NMSWorldGenVillagePiece {

        public NMSWorldGenVillageBlacksmith(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenVillageBlacksmith(NMSWorldGenVillageStartPiece worldGenVillageStartPiece, int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenVillageBlacksmith", new Object[]{NMSWorldGenVillageStartPiece.class, int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{worldGenVillageStartPiece, i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.WorldGenVillagePieces$WorldGenVillageBlacksmith#a(net.minecraft.server.v1_9_R1.World, java.util.Random, net.minecraft.server.v1_9_R1.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.WorldGenVillagePieces$WorldGenVillageBlacksmith#b(net.minecraft.server.v1_9_R1.NBTTagCompound)
         */
        @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
        public void b(NMSNBTTagCompound nBTTagCompound){
            NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.WorldGenVillagePieces$WorldGenVillageBlacksmith#c(int, int)
         */
        @ReflectiveMethod(name = "c", types = {int.class, int.class})
        public int c(int i, int i1){
            return (int) NMSWrapper.getInstance().exec(nmsObject, i, i1);
        }

    }

    @ReflectiveClass(name = "WorldGenVillageStartPiece")
    public class NMSWorldGenVillageStartPiece extends NMSWorldGenVillageWell {

        public NMSWorldGenVillageStartPiece(Object nmsObject){
            super(nmsObject);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.WorldGenVillagePieces$WorldGenVillageStartPiece#e()
         */
        @ReflectiveMethod(name = "e", types = {})
        public NMSWorldChunkManager e(){
            return new NMSWorldChunkManager(NMSWrapper.getInstance().exec(nmsObject));
        }

    }

    @ReflectiveClass(name = "WorldGenVillageFarm")
    public class NMSWorldGenVillageFarm extends NMSWorldGenVillagePiece {

        public NMSWorldGenVillageFarm(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenVillageFarm(NMSWorldGenVillageStartPiece worldGenVillageStartPiece, int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenVillageFarm", new Object[]{NMSWorldGenVillageStartPiece.class, int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{worldGenVillageStartPiece, i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.WorldGenVillagePieces$WorldGenVillageFarm#a(net.minecraft.server.v1_9_R1.World, java.util.Random, net.minecraft.server.v1_9_R1.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.WorldGenVillagePieces$WorldGenVillageFarm#b(net.minecraft.server.v1_9_R1.NBTTagCompound)
         */
        @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
        public void b(NMSNBTTagCompound nBTTagCompound){
            NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
        }

    }

    @ReflectiveClass(name = "WorldGenVillageHouse")
    public class NMSWorldGenVillageHouse extends NMSWorldGenVillagePiece {

        public NMSWorldGenVillageHouse(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenVillageHouse(NMSWorldGenVillageStartPiece worldGenVillageStartPiece, int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenVillageHouse", new Object[]{NMSWorldGenVillageStartPiece.class, int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{worldGenVillageStartPiece, i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.WorldGenVillagePieces$WorldGenVillageHouse#a(net.minecraft.server.v1_9_R1.World, java.util.Random, net.minecraft.server.v1_9_R1.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.WorldGenVillagePieces$WorldGenVillageHouse#b(net.minecraft.server.v1_9_R1.NBTTagCompound)
         */
        @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
        public void b(NMSNBTTagCompound nBTTagCompound){
            NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
        }

    }

    @ReflectiveClass(name = "WorldGenVillageWell")
    public class NMSWorldGenVillageWell extends NMSWorldGenVillagePiece {

        public NMSWorldGenVillageWell(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenVillageWell(NMSWorldGenVillageStartPiece worldGenVillageStartPiece, int i, Random random, int i1, int i2){
            super("WorldGenVillageWell", new Object[]{NMSWorldGenVillageStartPiece.class, int.class, Random.class, int.class, int.class}, new Object[]{worldGenVillageStartPiece, i, random, i1, i2});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.WorldGenVillagePieces$WorldGenVillageWell#a(net.minecraft.server.v1_9_R1.World, java.util.Random, net.minecraft.server.v1_9_R1.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

    }

}