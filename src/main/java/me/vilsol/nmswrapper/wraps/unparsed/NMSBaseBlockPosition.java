package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BaseBlockPosition")
public class NMSBaseBlockPosition extends NMSWrap {

    public NMSBaseBlockPosition(Object nmsObject){
        super(nmsObject);
    }

    public NMSBaseBlockPosition(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    public NMSBaseBlockPosition(int i, int i1, int i2){
        super("BaseBlockPosition", new Object[]{int.class, int.class, int.class}, new Object[]{i, i1, i2});
    }

    public NMSBaseBlockPosition(double d, double d1, double d2){
        super("BaseBlockPosition", new Object[]{double.class, double.class, double.class}, new Object[]{d, d1, d2});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BaseBlockPosition#c(double, double, double)
     */
    @ReflectiveMethod(name = "c", types = {double.class, double.class, double.class})
    public double c(double d, double d1, double d2){
        return (double) NMSWrapper.getInstance().exec(nmsObject, d, d1, d2);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BaseBlockPosition#compareTo(java.lang.Object)
     */
    @ReflectiveMethod(name = "compareTo", types = {Object.class})
    public int compareTo(Object object){
        return (int) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BaseBlockPosition#d(double, double, double)
     */
    @ReflectiveMethod(name = "d", types = {double.class, double.class, double.class})
    public double d(double d, double d1, double d2){
        return (double) NMSWrapper.getInstance().exec(nmsObject, d, d1, d2);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BaseBlockPosition#equals(java.lang.Object)
     */
    @ReflectiveMethod(name = "equals", types = {Object.class})
    public boolean equals(Object object){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BaseBlockPosition#g(net.minecraft.server.v1_8_R3.BaseBlockPosition)
     */
    @ReflectiveMethod(name = "g", types = {NMSBaseBlockPosition.class})
    public int g(NMSBaseBlockPosition baseBlockPosition){
        return (int) NMSWrapper.getInstance().exec(nmsObject, baseBlockPosition);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BaseBlockPosition#getX()
     */
    @ReflectiveMethod(name = "getX", types = {})
    public int getX(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BaseBlockPosition#getY()
     */
    @ReflectiveMethod(name = "getY", types = {})
    public int getY(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BaseBlockPosition#getZ()
     */
    @ReflectiveMethod(name = "getZ", types = {})
    public int getZ(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BaseBlockPosition#hashCode()
     */
    @ReflectiveMethod(name = "hashCode", types = {})
    public int hashCode(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BaseBlockPosition#i(net.minecraft.server.v1_8_R3.BaseBlockPosition)
     */
    @ReflectiveMethod(name = "i", types = {NMSBaseBlockPosition.class})
    public double i(NMSBaseBlockPosition baseBlockPosition){
        return (double) NMSWrapper.getInstance().exec(nmsObject, baseBlockPosition);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BaseBlockPosition#toString()
     */
    @ReflectiveMethod(name = "toString", types = {})
    public String toString(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}