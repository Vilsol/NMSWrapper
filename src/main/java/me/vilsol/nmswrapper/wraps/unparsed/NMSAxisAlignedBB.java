package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "AxisAlignedBB")
public class NMSAxisAlignedBB extends NMSWrap {

    public NMSAxisAlignedBB(Object nmsObject){
        super(nmsObject);
    }

    public NMSAxisAlignedBB(double d, double d1, double d2, double d3, double d4, double d5){
        super("AxisAlignedBB", new Object[]{double.class, double.class, double.class, double.class, double.class, double.class}, new Object[]{d, d1, d2, d3, d4, d5});
    }

    public NMSAxisAlignedBB(NMSBlockPosition blockPosition, NMSBlockPosition blockPosition1){
        super("AxisAlignedBB", new Object[]{NMSBlockPosition.class, NMSBlockPosition.class}, new Object[]{blockPosition, blockPosition1});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.AxisAlignedBB#a(net.minecraft.server.v1_9_R1.Vec3D, net.minecraft.server.v1_9_R1.Vec3D)
     */
    @ReflectiveMethod(name = "a", types = {NMSVec3D.class, NMSVec3D.class})
    public NMSMovingObjectPosition a(NMSVec3D vec3D, NMSVec3D vec3D1){
        return new NMSMovingObjectPosition(NMSWrapper.getInstance().exec(nmsObject, vec3D, vec3D1));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.AxisAlignedBB#b(net.minecraft.server.v1_9_R1.AxisAlignedBB)
     */
    @ReflectiveMethod(name = "b", types = {NMSAxisAlignedBB.class})
    public boolean b(NMSAxisAlignedBB axisAlignedBB){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, axisAlignedBB);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.AxisAlignedBB#c(net.minecraft.server.v1_9_R1.AxisAlignedBB, double)
     */
    @ReflectiveMethod(name = "c", types = {NMSAxisAlignedBB.class, double.class})
    public double c(NMSAxisAlignedBB axisAlignedBB, double d){
        return (double) NMSWrapper.getInstance().exec(nmsObject, axisAlignedBB, d);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.AxisAlignedBB#grow(double, double, double)
     */
    @ReflectiveMethod(name = "grow", types = {double.class, double.class, double.class})
    public NMSAxisAlignedBB grow(double d, double d1, double d2){
        return new NMSAxisAlignedBB(NMSWrapper.getInstance().exec(nmsObject, d, d1, d2));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.AxisAlignedBB#shrink(double, double, double)
     */
    @ReflectiveMethod(name = "shrink", types = {double.class, double.class, double.class})
    public NMSAxisAlignedBB shrink(double d, double d1, double d2){
        return new NMSAxisAlignedBB(NMSWrapper.getInstance().exec(nmsObject, d, d1, d2));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.AxisAlignedBB#toString()
     */
    @ReflectiveMethod(name = "toString", types = {})
    public String toString(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}