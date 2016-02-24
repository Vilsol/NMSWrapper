package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSNBTTagCompound;
import me.vilsol.nmswrapper.wraps.NMSWorld;
import me.vilsol.nmswrapper.wraps.NMSWrap;

import java.util.Random;

@ReflectiveClass(name = "WorldGenNetherPieces")
public class NMSWorldGenNetherPieces extends NMSWrap {

    public NMSWorldGenNetherPieces(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldGenNetherPieces#a(net.minecraft.server.v1_8_R3.WorldGenNetherPieces$WorldGenNetherPieceWeight, java.util.List, java.util.Random, int, int, int, net.minecraft.server.v1_8_R3.EnumDirection, int)
     */
    @ReflectiveMethod(name = "a", types = {NMSWorldGenNetherPieceWeight.class, List.class, Random.class, int.class, int.class, int.class, NMSEnumDirection.class, int.class})
    public NMSWorldGenNetherPiece a(NMSWorldGenNetherPieceWeight worldGenNetherPieceWeight, List list, Random random, int i, int i1, int i2, NMSEnumDirection enumDirection, int i3){
        return new NMSWorldGenNetherPiece(NMSWrapper.getInstance().exec(nmsObject, worldGenNetherPieceWeight, list, random, i, i1, i2, enumDirection, i3));
    }

    @ReflectiveClass(name = "WorldGenNetherPiece8")
    public class NMSWorldGenNetherPiece8 extends NMSWorldGenNetherPiece {

        public NMSWorldGenNetherPiece8(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenNetherPiece8(int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenNetherPiece8", new Object[]{int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenNetherPieces$WorldGenNetherPiece8#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenNetherPieces$WorldGenNetherPiece8#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
         */
        @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
        public void b(NMSNBTTagCompound nBTTagCompound){
            NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
        }

    }

    @ReflectiveClass(name = "WorldGenNetherPiece9")
    public class NMSWorldGenNetherPiece9 extends NMSWorldGenNetherPiece {

        public NMSWorldGenNetherPiece9(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenNetherPiece9(int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenNetherPiece9", new Object[]{int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenNetherPieces$WorldGenNetherPiece9#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

    }

    @ReflectiveClass(name = "WorldGenNetherPiece2")
    public class NMSWorldGenNetherPiece2 extends NMSWorldGenNetherPiece {

        public NMSWorldGenNetherPiece2(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenNetherPiece2(int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenNetherPiece2", new Object[]{int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenNetherPieces$WorldGenNetherPiece2#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenNetherPieces$WorldGenNetherPiece2#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
         */
        @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
        public void b(NMSNBTTagCompound nBTTagCompound){
            NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
        }

    }

    @ReflectiveClass(name = "WorldGenNetherPiece3")
    public class NMSWorldGenNetherPiece3 extends NMSWorldGenNetherPiece {

        public NMSWorldGenNetherPiece3(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenNetherPiece3(int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenNetherPiece3", new Object[]{int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenNetherPieces$WorldGenNetherPiece3#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

    }

    @ReflectiveClass(name = "WorldGenNetherPiece1")
    public class NMSWorldGenNetherPiece1 extends NMSWorldGenNetherPiece {

        public NMSWorldGenNetherPiece1(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenNetherPiece1(int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenNetherPiece1", new Object[]{int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenNetherPieces$WorldGenNetherPiece1#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

    }

    @ReflectiveClass(name = "WorldGenNetherPiece6")
    public class NMSWorldGenNetherPiece6 extends NMSWorldGenNetherPiece {

        public NMSWorldGenNetherPiece6(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenNetherPiece6(int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenNetherPiece6", new Object[]{int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenNetherPieces$WorldGenNetherPiece6#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

    }

    @ReflectiveClass(name = "WorldGenNetherPiece7")
    public class NMSWorldGenNetherPiece7 extends NMSWorldGenNetherPiece {

        public NMSWorldGenNetherPiece7(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenNetherPiece7(int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenNetherPiece7", new Object[]{int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenNetherPieces$WorldGenNetherPiece7#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

    }

    @ReflectiveClass(name = "WorldGenNetherPiece4")
    public class NMSWorldGenNetherPiece4 extends NMSWorldGenNetherPiece {

        public NMSWorldGenNetherPiece4(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenNetherPiece4(int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenNetherPiece4", new Object[]{int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenNetherPieces$WorldGenNetherPiece4#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

    }

    @ReflectiveClass(name = "WorldGenNetherPiece5")
    public class NMSWorldGenNetherPiece5 extends NMSWorldGenNetherPiece {

        public NMSWorldGenNetherPiece5(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenNetherPiece5(int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenNetherPiece5", new Object[]{int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenNetherPieces$WorldGenNetherPiece5#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

    }

    @ReflectiveClass(name = "WorldGenNetherPiece10")
    public class NMSWorldGenNetherPiece10 extends NMSWorldGenNetherPiece {

        public NMSWorldGenNetherPiece10(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenNetherPiece10(int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenNetherPiece10", new Object[]{int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenNetherPieces$WorldGenNetherPiece10#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenNetherPieces$WorldGenNetherPiece10#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
         */
        @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
        public void b(NMSNBTTagCompound nBTTagCompound){
            NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
        }

    }

    @ReflectiveClass(name = "WorldGenNetherPiece11")
    public class NMSWorldGenNetherPiece11 extends NMSWorldGenNetherPiece {

        public NMSWorldGenNetherPiece11(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenNetherPiece11(int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenNetherPiece11", new Object[]{int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenNetherPieces$WorldGenNetherPiece11#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

    }

    @ReflectiveClass(name = "WorldGenNetherPiece12")
    public class NMSWorldGenNetherPiece12 extends NMSWorldGenNetherPiece {

        public NMSWorldGenNetherPiece12(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenNetherPiece12(int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenNetherPiece12", new Object[]{int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenNetherPieces$WorldGenNetherPiece12#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenNetherPieces$WorldGenNetherPiece12#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
         */
        @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
        public void b(NMSNBTTagCompound nBTTagCompound){
            NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
        }

    }

    @ReflectiveClass(name = "WorldGenNetherPiece13")
    public class NMSWorldGenNetherPiece13 extends NMSWorldGenNetherPiece {

        public NMSWorldGenNetherPiece13(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenNetherPiece13(int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenNetherPiece13", new Object[]{int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenNetherPieces$WorldGenNetherPiece13#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

    }

    @ReflectiveClass(name = "WorldGenNetherPiece14")
    public class NMSWorldGenNetherPiece14 extends NMSWorldGenNetherPiece {

        public NMSWorldGenNetherPiece14(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenNetherPiece14(int i, Random random, NMSStructureBoundingBox structureBoundingBox, NMSEnumDirection enumDirection){
            super("WorldGenNetherPiece14", new Object[]{int.class, Random.class, NMSStructureBoundingBox.class, NMSEnumDirection.class}, new Object[]{i, random, structureBoundingBox, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenNetherPieces$WorldGenNetherPiece14#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

    }

    @ReflectiveClass(name = "WorldGenNetherPiece15")
    public class NMSWorldGenNetherPiece15 extends NMSWorldGenNetherPiece1 {

        public NMSWorldGenNetherPiece15(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenNetherPiece15(Random random, int i, int i1){
            super("WorldGenNetherPiece15", new Object[]{Random.class, int.class, int.class}, new Object[]{random, i, i1});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenNetherPieces$WorldGenNetherPiece15#a(net.minecraft.server.v1_8_R3.NBTTagCompound)
         */
        @ReflectiveMethod(name = "a", types = {NMSNBTTagCompound.class})
        public void a(NMSNBTTagCompound nBTTagCompound){
            NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenNetherPieces$WorldGenNetherPiece15#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
         */
        @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
        public void b(NMSNBTTagCompound nBTTagCompound){
            NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
        }

    }

}