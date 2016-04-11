package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "Vector3f")
public class NMSVector3f extends NMSWrap {

    public NMSVector3f(Object nmsObject){
        super(nmsObject);
    }

    public NMSVector3f(float f, float f1, float f2){
        super("Vector3f", new Object[]{float.class, float.class, float.class}, new Object[]{f, f1, f2});
    }

    public NMSVector3f(NMSNBTTagList nBTTagList){
        super("Vector3f", new Object[]{NMSNBTTagList.class}, new Object[]{nBTTagList});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Vector3f#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public NMSNBTTagList a(){
        return new NMSNBTTagList(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Vector3f#equals(java.lang.Object)
     */
    @ReflectiveMethod(name = "equals", types = {Object.class})
    public boolean equals(Object object){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Vector3f#getX()
     */
    @ReflectiveMethod(name = "getX", types = {})
    public float getX(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Vector3f#getY()
     */
    @ReflectiveMethod(name = "getY", types = {})
    public float getY(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Vector3f#getZ()
     */
    @ReflectiveMethod(name = "getZ", types = {})
    public float getZ(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

}