package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "WorldBorder")
public class NMSWorldBorder extends NMSWrap {

    public NMSWorldBorder(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldBorder#a(int)
     */
    @ReflectiveMethod(name = "a", types = {int.class})
    public void a(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldBorder#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public double b(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldBorder#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public double c(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldBorder#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public double d(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldBorder#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public double e(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldBorder#getCenterX()
     */
    @ReflectiveMethod(name = "getCenterX", types = {})
    public double getCenterX(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldBorder#getCenterZ()
     */
    @ReflectiveMethod(name = "getCenterZ", types = {})
    public double getCenterZ(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldBorder#getDamageAmount()
     */
    @ReflectiveMethod(name = "getDamageAmount", types = {})
    public double getDamageAmount(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldBorder#getDamageBuffer()
     */
    @ReflectiveMethod(name = "getDamageBuffer", types = {})
    public double getDamageBuffer(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldBorder#getSize()
     */
    @ReflectiveMethod(name = "getSize", types = {})
    public double getSize(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldBorder#getState()
     */
    @ReflectiveMethod(name = "getState", types = {})
    public NMSEnumWorldBorderState getState(){
        return new NMSEnumWorldBorderState(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldBorder#getWarningDistance()
     */
    @ReflectiveMethod(name = "getWarningDistance", types = {})
    public int getWarningDistance(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldBorder#getWarningTime()
     */
    @ReflectiveMethod(name = "getWarningTime", types = {})
    public int getWarningTime(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldBorder#i()
     */
    @ReflectiveMethod(name = "i", types = {})
    public long i(){
        return (long) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldBorder#isInBounds(int, int)
     */
    @ReflectiveMethod(name = "isInBounds", types = {int.class, int.class})
    public boolean isInBounds(int i, int i1){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i, i1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldBorder#j()
     */
    @ReflectiveMethod(name = "j", types = {})
    public double j(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldBorder#l()
     */
    @ReflectiveMethod(name = "l", types = {})
    public int l(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldBorder#setCenter(double, double)
     */
    @ReflectiveMethod(name = "setCenter", types = {double.class, double.class})
    public void setCenter(double d, double d1){
        NMSWrapper.getInstance().exec(nmsObject, d, d1);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldBorder#setDamageAmount(double)
     */
    @ReflectiveMethod(name = "setDamageAmount", types = {double.class})
    public void setDamageAmount(double d){
        NMSWrapper.getInstance().exec(nmsObject, d);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldBorder#setDamageBuffer(double)
     */
    @ReflectiveMethod(name = "setDamageBuffer", types = {double.class})
    public void setDamageBuffer(double d){
        NMSWrapper.getInstance().exec(nmsObject, d);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldBorder#setSize(double)
     */
    @ReflectiveMethod(name = "setSize", types = {double.class})
    public void setSize(double d){
        NMSWrapper.getInstance().exec(nmsObject, d);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldBorder#setWarningDistance(int)
     */
    @ReflectiveMethod(name = "setWarningDistance", types = {int.class})
    public void setWarningDistance(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldBorder#setWarningTime(int)
     */
    @ReflectiveMethod(name = "setWarningTime", types = {int.class})
    public void setWarningTime(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldBorder#transitionSizeBetween(double, double, long)
     */
    @ReflectiveMethod(name = "transitionSizeBetween", types = {double.class, double.class, long.class})
    public void transitionSizeBetween(double d, double d1, long l){
        NMSWrapper.getInstance().exec(nmsObject, d, d1, l);
    }

}