package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "MapIcon")
public class NMSMapIcon extends NMSWrap {

    public NMSMapIcon(Object nmsObject){
        super(nmsObject);
    }

    public NMSMapIcon(byte b, byte b1, byte b2, byte b3){
        super("MapIcon", new Object[]{byte.class, byte.class, byte.class, byte.class}, new Object[]{b, b1, b2, b3});
    }

    public NMSMapIcon(NMSMapIcon mapIcon){
        super("MapIcon", new Object[]{NMSMapIcon.class}, new Object[]{mapIcon});
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MapIcon#equals(java.lang.Object)
     */
    @ReflectiveMethod(name = "equals", types = {Object.class})
    public boolean equals(Object object){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MapIcon#getRotation()
     */
    @ReflectiveMethod(name = "getRotation", types = {})
    public byte getRotation(){
        return (byte) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MapIcon#getType()
     */
    @ReflectiveMethod(name = "getType", types = {})
    public byte getType(){
        return (byte) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MapIcon#getX()
     */
    @ReflectiveMethod(name = "getX", types = {})
    public byte getX(){
        return (byte) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MapIcon#getY()
     */
    @ReflectiveMethod(name = "getY", types = {})
    public byte getY(){
        return (byte) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MapIcon#hashCode()
     */
    @ReflectiveMethod(name = "hashCode", types = {})
    public int hashCode(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

}