package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWorld;
import me.vilsol.nmswrapper.wraps.NMSWrap;

import java.util.Random;

@ReflectiveClass(name = "BlockPortal")
public class NMSBlockPortal extends NMSBlockHalfTransparent {

    public NMSBlockPortal(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockPortal#a(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.IBlockData, net.minecraft.server.v1_9_R1.Entity)
     */
    @ReflectiveMethod(name = "a", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class, NMSEntity.class})
    public void a(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, NMSEntity entity){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData, entity);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockPortal#b(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.IBlockData, java.util.Random)
     */
    @ReflectiveMethod(name = "b", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class, Random.class})
    public void b(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, Random random){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData, random);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockPortal#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public boolean d(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockPortal#doPhysics(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.IBlockData, net.minecraft.server.v1_9_R1.Block)
     */
    @ReflectiveMethod(name = "doPhysics", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class, NMSBlock.class})
    public void doPhysics(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, NMSBlock block){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData, block);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockPortal#e(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition)
     */
    @ReflectiveMethod(name = "e", types = {NMSWorld.class, NMSBlockPosition.class})
    public boolean e(NMSWorld world, NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, blockPosition);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockPortal#f(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition)
     */
    @ReflectiveMethod(name = "f", types = {NMSWorld.class, NMSBlockPosition.class})
    public NMSShapeDetector.NMSShapeDetectorCollection f(NMSWorld world, NMSBlockPosition blockPosition){
        return new NMSShapeDetector.NMSShapeDetectorCollection(NMSWrapper.getInstance().exec(nmsObject, world, blockPosition));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockPortal#fromLegacyData(int)
     */
    @ReflectiveMethod(name = "fromLegacyData", types = {int.class})
    public NMSIBlockData fromLegacyData(int i){
        return (NMSIBlockData) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockPortal#getStateList()
     */
    @ReflectiveMethod(name = "getStateList", types = {})
    public NMSBlockStateList getStateList(){
        return new NMSBlockStateList(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockPortal#toLegacyData(net.minecraft.server.v1_9_R1.IBlockData)
     */
    @ReflectiveMethod(name = "toLegacyData", types = {NMSIBlockData.class})
    public int toLegacyData(NMSIBlockData iBlockData){
        return (int) NMSWrapper.getInstance().exec(nmsObject, iBlockData);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockPortal#updateShape(net.minecraft.server.v1_9_R1.IBlockAccess, net.minecraft.server.v1_9_R1.BlockPosition)
     */
    @ReflectiveMethod(name = "updateShape", types = {NMSIBlockAccess.class, NMSBlockPosition.class})
    public void updateShape(NMSIBlockAccess iBlockAccess, NMSBlockPosition blockPosition){
        NMSWrapper.getInstance().exec(nmsObject, iBlockAccess, blockPosition);
    }

    @ReflectiveClass(name = "Shape")
    public class NMSShape extends NMSWrap {

        public NMSShape(Object nmsObject){
            super(nmsObject);
        }

        public NMSShape(NMSWorld world, NMSBlockPosition blockPosition, NMSEnumAxis enumAxis){
            super("Shape", new Object[]{NMSWorld.class, NMSBlockPosition.class, NMSEnumAxis.class}, new Object[]{world, blockPosition, enumAxis});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.BlockPortal$Shape#a(net.minecraft.server.v1_9_R1.Block)
         */
        @ReflectiveMethod(name = "a", types = {NMSBlock.class})
        public boolean a(NMSBlock block){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, block);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.BlockPortal$Shape#b()
         */
        @ReflectiveMethod(name = "b", types = {})
        public int b(){
            return (int) NMSWrapper.getInstance().exec(nmsObject);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.BlockPortal$Shape#c()
         */
        @ReflectiveMethod(name = "c", types = {})
        public int c(){
            return (int) NMSWrapper.getInstance().exec(nmsObject);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.BlockPortal$Shape#d()
         */
        @ReflectiveMethod(name = "d", types = {})
        public boolean d(){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.BlockPortal$Shape#e()
         */
        @ReflectiveMethod(name = "e", types = {})
        public boolean e(){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject);
        }

    }

}