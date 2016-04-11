package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "StructurePiece")
public class NMSStructurePiece extends NMSWrap {

    public NMSStructurePiece(Object nmsObject){
        super(nmsObject);
    }

    public NMSStructurePiece(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.StructurePiece#a(int, int, int)
     */
    @ReflectiveMethod(name = "a", types = {int.class, int.class, int.class})
    public void a(int i, int i1, int i2){
        NMSWrapper.getInstance().exec(nmsObject, i, i1, i2);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.StructurePiece#b(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.IBlockData, int, int, int, net.minecraft.server.v1_9_R1.StructureBoundingBox)
     */
    @ReflectiveMethod(name = "b", types = {NMSWorld.class, NMSIBlockData.class, int.class, int.class, int.class, NMSStructureBoundingBox.class})
    public void b(NMSWorld world, NMSIBlockData iBlockData, int i, int i1, int i2, NMSStructureBoundingBox structureBoundingBox){
        NMSWrapper.getInstance().exec(nmsObject, world, iBlockData, i, i1, i2, structureBoundingBox);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.StructurePiece#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public NMSStructureBoundingBox c(){
        return new NMSStructureBoundingBox(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.StructurePiece#d(int)
     */
    @ReflectiveMethod(name = "d", types = {int.class})
    public int d(int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    @ReflectiveClass(name = "StructurePieceBlockSelector")
    public class NMSStructurePieceBlockSelector extends NMSWrap {

        public NMSStructurePieceBlockSelector(Object nmsObject){
            super(nmsObject);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.StructurePiece$StructurePieceBlockSelector#a()
         */
        @ReflectiveMethod(name = "a", types = {})
        public NMSIBlockData a(){
            return (NMSIBlockData) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject));
        }

    }

}