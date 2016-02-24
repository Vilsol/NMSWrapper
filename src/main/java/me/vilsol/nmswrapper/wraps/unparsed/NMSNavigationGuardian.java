package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.entity.NMSEntityInsentient;
import me.vilsol.nmswrapper.wraps.NMSWorld;

@ReflectiveClass(name = "NavigationGuardian")
public class NMSNavigationGuardian extends NMSNavigationAbstract {

    public NMSNavigationGuardian(Object nmsObject){
        super(nmsObject);
    }

    public NMSNavigationGuardian(NMSEntityInsentient entityInsentient, NMSWorld world){
        super("NavigationGuardian", new Object[]{NMSEntityInsentient.class, NMSWorld.class}, new Object[]{entityInsentient, world});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NavigationGuardian#a(net.minecraft.server.v1_8_R3.Vec3D, net.minecraft.server.v1_8_R3.Vec3D, int, int, int)
     */
    @ReflectiveMethod(name = "a", types = {NMSVec3D.class, NMSVec3D.class, int.class, int.class, int.class})
    public boolean a(NMSVec3D vec3D, NMSVec3D vec3D1, int i, int i1, int i2){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, vec3D, vec3D1, i, i1, i2);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NavigationGuardian#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public boolean b(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NavigationGuardian#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public NMSVec3D c(){
        return new NMSVec3D(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NavigationGuardian#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public void d(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NavigationGuardian#l()
     */
    @ReflectiveMethod(name = "l", types = {})
    public void l(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}