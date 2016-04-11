package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "NavigationAbstract")
public class NMSNavigationAbstract extends NMSWrap {

    public NMSNavigationAbstract(Object nmsObject){
        super(nmsObject);
    }

    public NMSNavigationAbstract(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    public NMSNavigationAbstract(NMSEntityInsentient entityInsentient, NMSWorld world){
        super("NavigationAbstract", new Object[]{NMSEntityInsentient.class, NMSWorld.class}, new Object[]{entityInsentient, world});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.NavigationAbstract#a(net.minecraft.server.v1_9_R1.Vec3D, net.minecraft.server.v1_9_R1.Vec3D, int, int, int)
     */
    @ReflectiveMethod(name = "a", types = {NMSVec3D.class, NMSVec3D.class, int.class, int.class, int.class})
    public boolean a(NMSVec3D vec3D, NMSVec3D vec3D1, int i, int i1, int i2){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, vec3D, vec3D1, i, i1, i2);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.NavigationAbstract#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public boolean b(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.NavigationAbstract#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public NMSVec3D c(){
        return new NMSVec3D(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.NavigationAbstract#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public void d(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.NavigationAbstract#i()
     */
    @ReflectiveMethod(name = "i", types = {})
    public float i(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.NavigationAbstract#j()
     */
    @ReflectiveMethod(name = "j", types = {})
    public NMSPathEntity j(){
        return new NMSPathEntity(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.NavigationAbstract#k()
     */
    @ReflectiveMethod(name = "k", types = {})
    public void k(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.NavigationAbstract#l()
     */
    @ReflectiveMethod(name = "l", types = {})
    public void l(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.NavigationAbstract#m()
     */
    @ReflectiveMethod(name = "m", types = {})
    public boolean m(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.NavigationAbstract#n()
     */
    @ReflectiveMethod(name = "n", types = {})
    public void n(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.NavigationAbstract#o()
     */
    @ReflectiveMethod(name = "o", types = {})
    public boolean o(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}