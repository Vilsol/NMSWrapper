package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "IntHashMap")
public class NMSIntHashMap extends NMSWrap {

    public NMSIntHashMap(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.IntHashMap#a(int, V)
     */
    @ReflectiveMethod(name = "a", types = {int.class, V.class})
    public void a(int i, V v){
        NMSWrapper.getInstance().exec(nmsObject, i, v);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.IntHashMap#b(int)
     */
    @ReflectiveMethod(name = "b", types = {int.class})
    public boolean b(int i){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.IntHashMap#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public void c(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.IntHashMap#d(int)
     */
    @ReflectiveMethod(name = "d", types = {int.class})
    public V d(int i){
        return new V(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.IntHashMap#f(int)
     */
    @ReflectiveMethod(name = "f", types = {int.class})
    public int f(int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.IntHashMap#get(int)
     */
    @ReflectiveMethod(name = "get", types = {int.class})
    public V get(int i){
        return new V(NMSWrapper.getInstance().exec(nmsObject, i));
    }

}