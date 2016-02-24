package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PathEntity")
public class NMSPathEntity extends NMSWrap {

    public NMSPathEntity(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PathEntity#a(net.minecraft.server.v1_8_R3.PathEntity)
     */
    @ReflectiveMethod(name = "a", types = {NMSPathEntity.class})
    public boolean a(NMSPathEntity pathEntity){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, pathEntity);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PathEntity#b(net.minecraft.server.v1_8_R3.Vec3D)
     */
    @ReflectiveMethod(name = "b", types = {NMSVec3D.class})
    public boolean b(NMSVec3D vec3D){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, vec3D);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PathEntity#c(int)
     */
    @ReflectiveMethod(name = "c", types = {int.class})
    public void c(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PathEntity#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public int d(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PathEntity#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public int e(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

}