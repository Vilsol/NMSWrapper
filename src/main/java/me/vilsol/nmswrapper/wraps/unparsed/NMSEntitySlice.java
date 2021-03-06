package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntitySlice")
public class NMSEntitySlice extends NMSWrap {

    public NMSEntitySlice(Object nmsObject){
        super(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntitySlice#add(Object)
     */
    @ReflectiveMethod(name = "add", types = {Object.class})
    public boolean add(Object t){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, t);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntitySlice#contains(java.lang.Object)
     */
    @ReflectiveMethod(name = "contains", types = {Object.class})
    public boolean contains(Object object){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntitySlice#remove(java.lang.Object)
     */
    @ReflectiveMethod(name = "remove", types = {Object.class})
    public boolean remove(Object object){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntitySlice#size()
     */
    @ReflectiveMethod(name = "size", types = {})
    public int size(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

}