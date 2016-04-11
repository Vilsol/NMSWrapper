package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWrap;

import java.util.Random;
import java.util.UUID;

@ReflectiveClass(name = "MathHelper")
public class NMSMathHelper extends NMSWrap {

    public NMSMathHelper(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.MathHelper#a(java.util.Random)
     */
    @ReflectiveMethod(name = "a", types = {Random.class})
    public UUID a(Random random){
        return (UUID) NMSWrapper.getInstance().exec(nmsObject, random);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.MathHelper#b(double, double)
     */
    @ReflectiveMethod(name = "b", types = {double.class, double.class})
    public double b(double d, double d1){
        return (double) NMSWrapper.getInstance().exec(nmsObject, d, d1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.MathHelper#c(double, double, double)
     */
    @ReflectiveMethod(name = "c", types = {double.class, double.class, double.class})
    public double c(double d, double d1, double d2){
        return (double) NMSWrapper.getInstance().exec(nmsObject, d, d1, d2);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.MathHelper#clamp(int, int, int)
     */
    @ReflectiveMethod(name = "clamp", types = {int.class, int.class, int.class})
    public int clamp(int i, int i1, int i2){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i, i1, i2);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.MathHelper#cos(float)
     */
    @ReflectiveMethod(name = "cos", types = {float.class})
    public float cos(float f){
        return (float) NMSWrapper.getInstance().exec(nmsObject, f);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.MathHelper#d(double)
     */
    @ReflectiveMethod(name = "d", types = {double.class})
    public long d(double d){
        return (long) NMSWrapper.getInstance().exec(nmsObject, d);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.MathHelper#e(float)
     */
    @ReflectiveMethod(name = "e", types = {float.class})
    public float e(float f){
        return (float) NMSWrapper.getInstance().exec(nmsObject, f);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.MathHelper#f(double)
     */
    @ReflectiveMethod(name = "f", types = {double.class})
    public int f(double d){
        return (int) NMSWrapper.getInstance().exec(nmsObject, d);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.MathHelper#floor(double)
     */
    @ReflectiveMethod(name = "floor", types = {double.class})
    public int floor(double d){
        return (int) NMSWrapper.getInstance().exec(nmsObject, d);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.MathHelper#g(double)
     */
    @ReflectiveMethod(name = "g", types = {double.class})
    public double g(double d){
        return (double) NMSWrapper.getInstance().exec(nmsObject, d);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.MathHelper#i(double)
     */
    @ReflectiveMethod(name = "i", types = {double.class})
    public double i(double d){
        return (double) NMSWrapper.getInstance().exec(nmsObject, d);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.MathHelper#nextInt(java.util.Random, int, int)
     */
    @ReflectiveMethod(name = "nextInt", types = {Random.class, int.class, int.class})
    public int nextInt(Random random, int i, int i1){
        return (int) NMSWrapper.getInstance().exec(nmsObject, random, i, i1);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.MathHelper#sin(float)
     */
    @ReflectiveMethod(name = "sin", types = {float.class})
    public float sin(float f){
        return (float) NMSWrapper.getInstance().exec(nmsObject, f);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.MathHelper#sqrt(double)
     */
    @ReflectiveMethod(name = "sqrt", types = {double.class})
    public float sqrt(double d){
        return (float) NMSWrapper.getInstance().exec(nmsObject, d);
    }

}