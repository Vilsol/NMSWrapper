package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "LongHashMap")
public class NMSLongHashMap extends NMSWrap {

    public NMSLongHashMap(Object nmsObject){
        super(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.LongHashMap#contains(long)
     */
    @ReflectiveMethod(name = "contains", types = {long.class})
    public boolean contains(long l){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, l);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.LongHashMap#count()
     */
    @ReflectiveMethod(name = "count", types = {})
    public int count(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.LongHashMap#f(long)
     */
    @ReflectiveMethod(name = "f", types = {long.class})
    public int f(long l){
        return (int) NMSWrapper.getInstance().exec(nmsObject, l);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.LongHashMap#getEntry(long)
     */
    @ReflectiveMethod(name = "getEntry", types = {long.class})
    public Object getEntry(long l){
        return NMSWrapper.getInstance().exec(nmsObject, l);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.LongHashMap#put(long, Object)
     */
    @ReflectiveMethod(name = "put", types = {long.class, Object.class})
    public void put(long l, Object v){
        NMSWrapper.getInstance().exec(nmsObject, l, v);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.LongHashMap#remove(long)
     */
    @ReflectiveMethod(name = "remove", types = {long.class})
    public Object remove(long l){
        return NMSWrapper.getInstance().exec(nmsObject, l);
    }

}