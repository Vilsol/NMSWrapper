package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "WorldGenMonumentPieces")
public class NMSWorldGenMonumentPieces extends NMSWrap {

    public NMSWorldGenMonumentPieces(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldGenMonumentPieces#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public void a(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    @ReflectiveClass(name = "WorldGenMonumentPiece8")
    public class NMSWorldGenMonumentPiece8 extends NMSWorldGenMonumentPiece {

        public NMSWorldGenMonumentPiece8(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenMonumentPiece8(NMSEnumDirection enumDirection, NMSStructureBoundingBox structureBoundingBox, int i){
            super("WorldGenMonumentPiece8", new Object[]{NMSEnumDirection.class, NMSStructureBoundingBox.class, int.class}, new Object[]{enumDirection, structureBoundingBox, i});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenMonumentPieces$WorldGenMonumentPiece8#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

    }

    @ReflectiveClass(name = "WorldGenMonumentPieceSimpleT")
    public class NMSWorldGenMonumentPieceSimpleT extends NMSWorldGenMonumentPiece {

        public NMSWorldGenMonumentPieceSimpleT(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenMonumentPieceSimpleT(NMSEnumDirection enumDirection, NMSWorldGenMonumentStateTracker worldGenMonumentStateTracker, Random random){
            super("WorldGenMonumentPieceSimpleT", new Object[]{NMSEnumDirection.class, NMSWorldGenMonumentStateTracker.class, Random.class}, new Object[]{enumDirection, worldGenMonumentStateTracker, random});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenMonumentPieces$WorldGenMonumentPieceSimpleT#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

    }

    @ReflectiveClass(name = "WorldGenMonumentPiece1")
    public class NMSWorldGenMonumentPiece1 extends NMSWorldGenMonumentPiece {

        public NMSWorldGenMonumentPiece1(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenMonumentPiece1(Random random, int i, int i1, NMSEnumDirection enumDirection){
            super("WorldGenMonumentPiece1", new Object[]{Random.class, int.class, int.class, NMSEnumDirection.class}, new Object[]{random, i, i1, enumDirection});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenMonumentPieces$WorldGenMonumentPiece1#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

    }

    @ReflectiveClass(name = "WorldGenMonumentPiece2")
    public class NMSWorldGenMonumentPiece2 extends NMSWorldGenMonumentPiece {

        public NMSWorldGenMonumentPiece2(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenMonumentPiece2(NMSEnumDirection enumDirection, NMSWorldGenMonumentStateTracker worldGenMonumentStateTracker, Random random){
            super("WorldGenMonumentPiece2", new Object[]{NMSEnumDirection.class, NMSWorldGenMonumentStateTracker.class, Random.class}, new Object[]{enumDirection, worldGenMonumentStateTracker, random});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenMonumentPieces$WorldGenMonumentPiece2#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

    }

    @ReflectiveClass(name = "WorldGenMonumentPiece3")
    public class NMSWorldGenMonumentPiece3 extends NMSWorldGenMonumentPiece {

        public NMSWorldGenMonumentPiece3(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenMonumentPiece3(NMSEnumDirection enumDirection, NMSWorldGenMonumentStateTracker worldGenMonumentStateTracker, Random random){
            super("WorldGenMonumentPiece3", new Object[]{NMSEnumDirection.class, NMSWorldGenMonumentStateTracker.class, Random.class}, new Object[]{enumDirection, worldGenMonumentStateTracker, random});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenMonumentPieces$WorldGenMonumentPiece3#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

    }

    @ReflectiveClass(name = "WorldGenMonumentPiece4")
    public class NMSWorldGenMonumentPiece4 extends NMSWorldGenMonumentPiece {

        public NMSWorldGenMonumentPiece4(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenMonumentPiece4(NMSEnumDirection enumDirection, NMSWorldGenMonumentStateTracker worldGenMonumentStateTracker, Random random){
            super("WorldGenMonumentPiece4", new Object[]{NMSEnumDirection.class, NMSWorldGenMonumentStateTracker.class, Random.class}, new Object[]{enumDirection, worldGenMonumentStateTracker, random});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenMonumentPieces$WorldGenMonumentPiece4#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

    }

    @ReflectiveClass(name = "WorldGenMonumentPiece5")
    public class NMSWorldGenMonumentPiece5 extends NMSWorldGenMonumentPiece {

        public NMSWorldGenMonumentPiece5(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenMonumentPiece5(NMSEnumDirection enumDirection, NMSWorldGenMonumentStateTracker worldGenMonumentStateTracker, Random random){
            super("WorldGenMonumentPiece5", new Object[]{NMSEnumDirection.class, NMSWorldGenMonumentStateTracker.class, Random.class}, new Object[]{enumDirection, worldGenMonumentStateTracker, random});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenMonumentPieces$WorldGenMonumentPiece5#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

    }

    @ReflectiveClass(name = "WorldGenMonumentPiece6")
    public class NMSWorldGenMonumentPiece6 extends NMSWorldGenMonumentPiece {

        public NMSWorldGenMonumentPiece6(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenMonumentPiece6(NMSEnumDirection enumDirection, NMSWorldGenMonumentStateTracker worldGenMonumentStateTracker, Random random){
            super("WorldGenMonumentPiece6", new Object[]{NMSEnumDirection.class, NMSWorldGenMonumentStateTracker.class, Random.class}, new Object[]{enumDirection, worldGenMonumentStateTracker, random});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenMonumentPieces$WorldGenMonumentPiece6#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

    }

    @ReflectiveClass(name = "WorldGenMonumentPieceSimple")
    public class NMSWorldGenMonumentPieceSimple extends NMSWorldGenMonumentPiece {

        public NMSWorldGenMonumentPieceSimple(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenMonumentPieceSimple(NMSEnumDirection enumDirection, NMSWorldGenMonumentStateTracker worldGenMonumentStateTracker, Random random){
            super("WorldGenMonumentPieceSimple", new Object[]{NMSEnumDirection.class, NMSWorldGenMonumentStateTracker.class, Random.class}, new Object[]{enumDirection, worldGenMonumentStateTracker, random});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenMonumentPieces$WorldGenMonumentPieceSimple#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

    }

    @ReflectiveClass(name = "WorldGenMonumentPieceEntry")
    public class NMSWorldGenMonumentPieceEntry extends NMSWorldGenMonumentPiece {

        public NMSWorldGenMonumentPieceEntry(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenMonumentPieceEntry(NMSEnumDirection enumDirection, NMSWorldGenMonumentStateTracker worldGenMonumentStateTracker){
            super("WorldGenMonumentPieceEntry", new Object[]{NMSEnumDirection.class, NMSWorldGenMonumentStateTracker.class}, new Object[]{enumDirection, worldGenMonumentStateTracker});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenMonumentPieces$WorldGenMonumentPieceEntry#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

    }

    @ReflectiveClass(name = "WorldGenMonumentPiece7")
    public class NMSWorldGenMonumentPiece7 extends NMSWorldGenMonumentPiece {

        public NMSWorldGenMonumentPiece7(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenMonumentPiece7(NMSEnumDirection enumDirection, NMSWorldGenMonumentStateTracker worldGenMonumentStateTracker, Random random){
            super("WorldGenMonumentPiece7", new Object[]{NMSEnumDirection.class, NMSWorldGenMonumentStateTracker.class, Random.class}, new Object[]{enumDirection, worldGenMonumentStateTracker, random});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenMonumentPieces$WorldGenMonumentPiece7#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

    }

    @ReflectiveClass(name = "WorldGenMonumentPiecePenthouse")
    public class NMSWorldGenMonumentPiecePenthouse extends NMSWorldGenMonumentPiece {

        public NMSWorldGenMonumentPiecePenthouse(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenMonumentPiecePenthouse(NMSEnumDirection enumDirection, NMSStructureBoundingBox structureBoundingBox){
            super("WorldGenMonumentPiecePenthouse", new Object[]{NMSEnumDirection.class, NMSStructureBoundingBox.class}, new Object[]{enumDirection, structureBoundingBox});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenMonumentPieces$WorldGenMonumentPiecePenthouse#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.StructureBoundingBox)
         */
        @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSStructureBoundingBox.class})
        public boolean a(NMSWorld world, Random random, NMSStructureBoundingBox structureBoundingBox){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, structureBoundingBox);
        }

    }

}