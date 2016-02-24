package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

import java.util.Random;

@ReflectiveClass(name = "BlockBanner")
public class NMSBlockBanner extends NMSBlockContainer {

    public NMSBlockBanner(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockBanner#a(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.EntityHuman, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData, net.minecraft.server.v1_8_R3.TileEntity)
     */
    @ReflectiveMethod(name = "a", types = {NMSWorld.class, NMSEntityHuman.class, NMSBlockPosition.class, NMSIBlockData.class, NMSTileEntity.class})
    public void a(NMSWorld world, NMSEntityHuman entityHuman, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, NMSTileEntity tileEntity){
        NMSWrapper.getInstance().exec(nmsObject, world, entityHuman, blockPosition, iBlockData, tileEntity);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockBanner#b(net.minecraft.server.v1_8_R3.IBlockAccess, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "b", types = {NMSIBlockAccess.class, NMSBlockPosition.class})
    public boolean b(NMSIBlockAccess iBlockAccess, NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, iBlockAccess, blockPosition);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockBanner#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public boolean c(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockBanner#canPlace(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "canPlace", types = {NMSWorld.class, NMSBlockPosition.class})
    public boolean canPlace(NMSWorld world, NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, blockPosition);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockBanner#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public boolean d(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockBanner#dropNaturally(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData, float, int)
     */
    @ReflectiveMethod(name = "dropNaturally", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class, float.class, int.class})
    public void dropNaturally(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, float f, int i){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData, f, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockBanner#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public boolean g(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockBanner#getDropType(net.minecraft.server.v1_8_R3.IBlockData, java.util.Random, int)
     */
    @ReflectiveMethod(name = "getDropType", types = {NMSIBlockData.class, Random.class, int.class})
    public NMSItem getDropType(NMSIBlockData iBlockData, Random random, int i){
        return new NMSItem(NMSWrapper.getInstance().exec(nmsObject, iBlockData, random, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockBanner#getName()
     */
    @ReflectiveMethod(name = "getName", types = {})
    public String getName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    @ReflectiveClass(name = "BlockStandingBanner")
    public class NMSBlockStandingBanner extends NMSBlockBanner {

        public NMSBlockStandingBanner(Object nmsObject){
            super(nmsObject);
        }

        /**
         * @see net.minecraft.server.v1_8_R3.BlockBanner$BlockStandingBanner#doPhysics(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData, net.minecraft.server.v1_8_R3.Block)
         */
        @ReflectiveMethod(name = "doPhysics", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class, NMSBlock.class})
        public void doPhysics(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, NMSBlock block){
            NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData, block);
        }

        /**
         * @see net.minecraft.server.v1_8_R3.BlockBanner$BlockStandingBanner#fromLegacyData(int)
         */
        @ReflectiveMethod(name = "fromLegacyData", types = {int.class})
        public NMSIBlockData fromLegacyData(int i){
            return (NMSIBlockData) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject, i));
        }

        /**
         * @see net.minecraft.server.v1_8_R3.BlockBanner$BlockStandingBanner#getStateList()
         */
        @ReflectiveMethod(name = "getStateList", types = {})
        public NMSBlockStateList getStateList(){
            return new NMSBlockStateList(NMSWrapper.getInstance().exec(nmsObject));
        }

        /**
         * @see net.minecraft.server.v1_8_R3.BlockBanner$BlockStandingBanner#toLegacyData(net.minecraft.server.v1_8_R3.IBlockData)
         */
        @ReflectiveMethod(name = "toLegacyData", types = {NMSIBlockData.class})
        public int toLegacyData(NMSIBlockData iBlockData){
            return (int) NMSWrapper.getInstance().exec(nmsObject, iBlockData);
        }

    }

    @ReflectiveClass(name = "BlockWallBanner")
    public class NMSBlockWallBanner extends NMSBlockBanner {

        public NMSBlockWallBanner(Object nmsObject){
            super(nmsObject);
        }

        /**
         * @see net.minecraft.server.v1_8_R3.BlockBanner$BlockWallBanner#doPhysics(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData, net.minecraft.server.v1_8_R3.Block)
         */
        @ReflectiveMethod(name = "doPhysics", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class, NMSBlock.class})
        public void doPhysics(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, NMSBlock block){
            NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData, block);
        }

        /**
         * @see net.minecraft.server.v1_8_R3.BlockBanner$BlockWallBanner#fromLegacyData(int)
         */
        @ReflectiveMethod(name = "fromLegacyData", types = {int.class})
        public NMSIBlockData fromLegacyData(int i){
            return (NMSIBlockData) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject, i));
        }

        /**
         * @see net.minecraft.server.v1_8_R3.BlockBanner$BlockWallBanner#getStateList()
         */
        @ReflectiveMethod(name = "getStateList", types = {})
        public NMSBlockStateList getStateList(){
            return new NMSBlockStateList(NMSWrapper.getInstance().exec(nmsObject));
        }

        /**
         * @see net.minecraft.server.v1_8_R3.BlockBanner$BlockWallBanner#toLegacyData(net.minecraft.server.v1_8_R3.IBlockData)
         */
        @ReflectiveMethod(name = "toLegacyData", types = {NMSIBlockData.class})
        public int toLegacyData(NMSIBlockData iBlockData){
            return (int) NMSWrapper.getInstance().exec(nmsObject, iBlockData);
        }

        /**
         * @see net.minecraft.server.v1_8_R3.BlockBanner$BlockWallBanner#updateShape(net.minecraft.server.v1_8_R3.IBlockAccess, net.minecraft.server.v1_8_R3.BlockPosition)
         */
        @ReflectiveMethod(name = "updateShape", types = {NMSIBlockAccess.class, NMSBlockPosition.class})
        public void updateShape(NMSIBlockAccess iBlockAccess, NMSBlockPosition blockPosition){
            NMSWrapper.getInstance().exec(nmsObject, iBlockAccess, blockPosition);
        }

    }

}