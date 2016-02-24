package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "Vec3D")
public class NMSVec3D extends NMSWrap {

    public NMSVec3D(Object nmsObject){
        super(nmsObject);
    }

    public NMSVec3D(double d, double d1, double d2){
        super("Vec3D", new Object[]{double.class, double.class, double.class}, new Object[]{d, d1, d2});
    }

    public NMSVec3D(NMSBaseBlockPosition baseBlockPosition){
        super("Vec3D", new Object[]{NMSBaseBlockPosition.class}, new Object[]{baseBlockPosition});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Vec3D#a(float)
     */
    @ReflectiveMethod(name = "a", types = {float.class})
    public NMSVec3D a(float f){
        return new NMSVec3D(NMSWrapper.getInstance().exec(nmsObject, f));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Vec3D#add(double, double, double)
     */
    @ReflectiveMethod(name = "add", types = {double.class, double.class, double.class})
    public NMSVec3D add(double d, double d1, double d2){
        return new NMSVec3D(NMSWrapper.getInstance().exec(nmsObject, d, d1, d2));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Vec3D#b(float)
     */
    @ReflectiveMethod(name = "b", types = {float.class})
    public NMSVec3D b(float f){
        return new NMSVec3D(NMSWrapper.getInstance().exec(nmsObject, f));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Vec3D#c(net.minecraft.server.v1_8_R3.Vec3D, double)
     */
    @ReflectiveMethod(name = "c", types = {NMSVec3D.class, double.class})
    public NMSVec3D c(NMSVec3D vec3D, double d){
        return new NMSVec3D(NMSWrapper.getInstance().exec(nmsObject, vec3D, d));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Vec3D#d(net.minecraft.server.v1_8_R3.Vec3D)
     */
    @ReflectiveMethod(name = "d", types = {NMSVec3D.class})
    public NMSVec3D d(NMSVec3D vec3D){
        return new NMSVec3D(NMSWrapper.getInstance().exec(nmsObject, vec3D));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Vec3D#distanceSquared(net.minecraft.server.v1_8_R3.Vec3D)
     */
    @ReflectiveMethod(name = "distanceSquared", types = {NMSVec3D.class})
    public double distanceSquared(NMSVec3D vec3D){
        return (double) NMSWrapper.getInstance().exec(nmsObject, vec3D);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Vec3D#e(net.minecraft.server.v1_8_R3.Vec3D)
     */
    @ReflectiveMethod(name = "e", types = {NMSVec3D.class})
    public NMSVec3D e(NMSVec3D vec3D){
        return new NMSVec3D(NMSWrapper.getInstance().exec(nmsObject, vec3D));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Vec3D#toString()
     */
    @ReflectiveMethod(name = "toString", types = {})
    public String toString(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}