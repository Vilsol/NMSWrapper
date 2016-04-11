package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSEntityInsentient;
import me.vilsol.nmswrapper.wraps.NMSWorld;

@ReflectiveClass(name = "Navigation")
public class NMSNavigation extends NMSNavigationAbstract {

    public NMSNavigation(Object nmsObject){
        super(nmsObject);
    }

    public NMSNavigation(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    public NMSNavigation(NMSEntityInsentient entityInsentient, NMSWorld world){
        super("Navigation", new Object[]{NMSEntityInsentient.class, NMSWorld.class}, new Object[]{entityInsentient, world});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Navigation#a(boolean)
     */
    @ReflectiveMethod(name = "a", types = {boolean.class})
    public void a(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Navigation#b(boolean)
     */
    @ReflectiveMethod(name = "b", types = {boolean.class})
    public void b(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Navigation#c(boolean)
     */
    @ReflectiveMethod(name = "c", types = {boolean.class})
    public void c(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Navigation#d(boolean)
     */
    @ReflectiveMethod(name = "d", types = {boolean.class})
    public void d(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Navigation#e(boolean)
     */
    @ReflectiveMethod(name = "e", types = {boolean.class})
    public void e(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Navigation#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public boolean g(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Navigation#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public boolean h(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}