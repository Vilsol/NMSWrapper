package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSNBTTagCompound;
import me.vilsol.nmswrapper.wraps.NMSWorld;
import me.vilsol.nmswrapper.wraps.NMSWrap;

import java.util.Random;

@ReflectiveClass(name = "WorldGenStrongholdPieces")
public class NMSWorldGenStrongholdPieces extends NMSWrap {

    public NMSWorldGenStrongholdPieces(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldGenStrongholdPieces#a(java.lang.Class)
     */
    @ReflectiveMethod(name = "a", types = {Class.class})
    public Class a(Class c){
        return (Class) NMSWrapper.getInstance().exec(nmsObject, c);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldGenStrongholdPieces#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public void b(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldGenStrongholdPieces#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public NMSWorldGenStrongholdStones c(){
        return new NMSWorldGenStrongholdStones(NMSWrapper.getInstance().exec(nmsObject));
    }

    @ReflectiveClass(name = "WorldGenStrongholdStairsStraight")
    public class NMSWorldGenStrongholdStairsStraight extends NMSWorldGenStrongholdPiece {

        public NMSWorldGenStrongholdStairsStraight(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenStrongholdStairsStraight(int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenStrongholdStairsStraight", new Object[]{int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenStrongholdPieces$WorldGenStrongholdStairsStraight#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

    }

    @ReflectiveClass(name = "WorldGenStrongholdCrossing")
    public class NMSWorldGenStrongholdCrossing extends NMSWorldGenStrongholdPiece {

        public NMSWorldGenStrongholdCrossing(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenStrongholdCrossing(int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenStrongholdCrossing", new Object[]{int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenStrongholdPieces$WorldGenStrongholdCrossing#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenStrongholdPieces$WorldGenStrongholdCrossing#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
         */
        @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
        public void b(NMSNBTTagCompound nBTTagCompound){
            NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
        }

    }

    @ReflectiveClass(name = "WorldGenStrongholdPrison")
    public class NMSWorldGenStrongholdPrison extends NMSWorldGenStrongholdPiece {

        public NMSWorldGenStrongholdPrison(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenStrongholdPrison(int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenStrongholdPrison", new Object[]{int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenStrongholdPieces$WorldGenStrongholdPrison#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

    }

    @ReflectiveClass(name = "WorldGenStrongholdRightTurn")
    public class NMSWorldGenStrongholdRightTurn extends NMSWorldGenStrongholdLeftTurn {

        public NMSWorldGenStrongholdRightTurn(Object nmsObject){
            super(nmsObject);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenStrongholdPieces$WorldGenStrongholdRightTurn#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

    }

    @ReflectiveClass(name = "WorldGenStrongholdStairs")
    public class NMSWorldGenStrongholdStairs extends NMSWorldGenStrongholdPiece {

        public NMSWorldGenStrongholdStairs(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenStrongholdStairs(int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenStrongholdStairs", new Object[]{int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenStrongholdPieces$WorldGenStrongholdStairs#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenStrongholdPieces$WorldGenStrongholdStairs#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
         */
        @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
        public void b(NMSNBTTagCompound nBTTagCompound){
            NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
        }

    }

    @ReflectiveClass(name = "WorldGenStrongholdCorridor")
    public class NMSWorldGenStrongholdCorridor extends NMSWorldGenStrongholdPiece {

        public NMSWorldGenStrongholdCorridor(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenStrongholdCorridor(int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenStrongholdCorridor", new Object[]{int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenStrongholdPieces$WorldGenStrongholdCorridor#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenStrongholdPieces$WorldGenStrongholdCorridor#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
         */
        @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
        public void b(NMSNBTTagCompound nBTTagCompound){
            NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
        }

    }

    @ReflectiveClass(name = "WorldGenStrongholdLibrary")
    public class NMSWorldGenStrongholdLibrary extends NMSWorldGenStrongholdPiece {

        public NMSWorldGenStrongholdLibrary(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenStrongholdLibrary(int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenStrongholdLibrary", new Object[]{int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenStrongholdPieces$WorldGenStrongholdLibrary#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenStrongholdPieces$WorldGenStrongholdLibrary#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
         */
        @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
        public void b(NMSNBTTagCompound nBTTagCompound){
            NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
        }

    }

    @ReflectiveClass(name = "WorldGenStrongholdChestCorridor")
    public class NMSWorldGenStrongholdChestCorridor extends NMSWorldGenStrongholdPiece {

        public NMSWorldGenStrongholdChestCorridor(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenStrongholdChestCorridor(int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenStrongholdChestCorridor", new Object[]{int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenStrongholdPieces$WorldGenStrongholdChestCorridor#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenStrongholdPieces$WorldGenStrongholdChestCorridor#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
         */
        @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
        public void b(NMSNBTTagCompound nBTTagCompound){
            NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
        }

    }

    @ReflectiveClass(name = "WorldGenStrongholdPortalRoom")
    public class NMSWorldGenStrongholdPortalRoom extends NMSWorldGenStrongholdPiece {

        public NMSWorldGenStrongholdPortalRoom(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenStrongholdPortalRoom(int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenStrongholdPortalRoom", new Object[]{int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenStrongholdPieces$WorldGenStrongholdPortalRoom#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenStrongholdPieces$WorldGenStrongholdPortalRoom#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
         */
        @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
        public void b(NMSNBTTagCompound nBTTagCompound){
            NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
        }

    }

    @ReflectiveClass(name = "WorldGenStrongholdRoomCrossing")
    public class NMSWorldGenStrongholdRoomCrossing extends NMSWorldGenStrongholdPiece {

        public NMSWorldGenStrongholdRoomCrossing(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenStrongholdRoomCrossing(int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenStrongholdRoomCrossing", new Object[]{int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenStrongholdPieces$WorldGenStrongholdRoomCrossing#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenStrongholdPieces$WorldGenStrongholdRoomCrossing#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
         */
        @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
        public void b(NMSNBTTagCompound nBTTagCompound){
            NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
        }

    }

    @ReflectiveClass(name = "WorldGenStrongholdStairs2")
    public class NMSWorldGenStrongholdStairs2 extends NMSWorldGenStrongholdPiece {

        public NMSWorldGenStrongholdStairs2(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenStrongholdStairs2(String nmsName, Object[] paramTypes, Object[] params) {
            super(nmsName, paramTypes, params);
        }

        public NMSWorldGenStrongholdStairs2(int i, Random random, int i1, int i2){
            super("WorldGenStrongholdStairs2", new Object[]{int.class, Random.class, int.class, int.class}, new Object[]{i, random, i1, i2});
        }

        public NMSWorldGenStrongholdStairs2(int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenStrongholdStairs2", new Object[]{int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenStrongholdPieces$WorldGenStrongholdStairs2#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenStrongholdPieces$WorldGenStrongholdStairs2#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
         */
        @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
        public void b(NMSNBTTagCompound nBTTagCompound){
            NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
        }

    }

    @ReflectiveClass(name = "WorldGenStrongholdStart")
    public class NMSWorldGenStrongholdStart extends NMSWorldGenStrongholdStairs2 {

        public NMSWorldGenStrongholdStart(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenStrongholdStart(int i, Random random, int i1, int i2){
            super("WorldGenStrongholdStart", new Object[]{int.class, Random.class, int.class, int.class}, new Object[]{i, random, i1, i2});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenStrongholdPieces$WorldGenStrongholdStart#a()
         */
        @ReflectiveMethod(name = "a", types = {})
        public NMSBlockPosition a(){
            return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject));
        }

    }

    @ReflectiveClass(name = "WorldGenStrongholdLeftTurn")
    public class NMSWorldGenStrongholdLeftTurn extends NMSWorldGenStrongholdPiece {

        public NMSWorldGenStrongholdLeftTurn(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenStrongholdLeftTurn(int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenStrongholdLeftTurn", new Object[]{int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenStrongholdPieces$WorldGenStrongholdLeftTurn#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

    }

}