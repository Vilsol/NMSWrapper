package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ShapeDetector")
public class NMSShapeDetector extends NMSWrap {

    public NMSShapeDetector(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ShapeDetector#a(net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.EnumDirection, net.minecraft.server.v1_8_R3.EnumDirection, int, int, int)
     */
    @ReflectiveMethod(name = "a", types = {NMSBlockPosition.class, NMSEnumDirection.class, NMSEnumDirection.class, int.class, int.class, int.class})
    public NMSBlockPosition a(NMSBlockPosition blockPosition, NMSEnumDirection enumDirection, NMSEnumDirection enumDirection1, int i, int i1, int i2){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject, blockPosition, enumDirection, enumDirection1, i, i1, i2));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ShapeDetector#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public int b(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ShapeDetector#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public int c(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    @ReflectiveClass(name = "ShapeDetectorCollection")
    public class NMSShapeDetectorCollection extends NMSWrap {

        public NMSShapeDetectorCollection(Object nmsObject){
            super(nmsObject);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.ShapeDetector$ShapeDetectorCollection#a(int, int, int)
         */
        @ReflectiveMethod(name = "a", types = {int.class, int.class, int.class})
        public NMSShapeDetectorBlock a(int i, int i1, int i2){
            return new NMSShapeDetectorBlock(NMSWrapper.getInstance().exec(nmsObject, i, i1, i2));
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.ShapeDetector$ShapeDetectorCollection#b()
         */
        @ReflectiveMethod(name = "b", types = {})
        public NMSEnumDirection b(){
            return new NMSEnumDirection(NMSWrapper.getInstance().exec(nmsObject));
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.ShapeDetector$ShapeDetectorCollection#c()
         */
        @ReflectiveMethod(name = "c", types = {})
        public NMSEnumDirection c(){
            return new NMSEnumDirection(NMSWrapper.getInstance().exec(nmsObject));
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.ShapeDetector$ShapeDetectorCollection#d()
         */
        @ReflectiveMethod(name = "d", types = {})
        public int d(){
            return (int) NMSWrapper.getInstance().exec(nmsObject);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.ShapeDetector$ShapeDetectorCollection#e()
         */
        @ReflectiveMethod(name = "e", types = {})
        public int e(){
            return (int) NMSWrapper.getInstance().exec(nmsObject);
        }

        /**
         * @see net.minecraft.server.v1_8_R3.ShapeDetector$ShapeDetectorCollection#toString()
         */
        @ReflectiveMethod(name = "toString", types = {})
        public String toString(){
            return (String) NMSWrapper.getInstance().exec(nmsObject);
        }

    }

}