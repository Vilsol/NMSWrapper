package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "AttributeMapServer")
public class NMSAttributeMapServer extends NMSAttributeMapBase {

    public NMSAttributeMapServer(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.AttributeMapServer#a(net.minecraft.server.v1_8_R3.IAttribute)
     */
    @ReflectiveMethod(name = "a", types = {NMSIAttribute.class})
    public NMSAttributeInstance a(NMSIAttribute iAttribute){
        return new NMSAttributeInstance(NMSWrapper.getInstance().exec(nmsObject, iAttribute));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.AttributeMapServer#b(net.minecraft.server.v1_8_R3.IAttribute)
     */
    @ReflectiveMethod(name = "b", types = {NMSIAttribute.class})
    public NMSAttributeInstance b(NMSIAttribute iAttribute){
        return new NMSAttributeInstance(NMSWrapper.getInstance().exec(nmsObject, iAttribute));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.AttributeMapServer#c(net.minecraft.server.v1_8_R3.IAttribute)
     */
    @ReflectiveMethod(name = "c", types = {NMSIAttribute.class})
    public NMSAttributeInstance c(NMSIAttribute iAttribute){
        return new NMSAttributeInstance(NMSWrapper.getInstance().exec(nmsObject, iAttribute));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.AttributeMapServer#e(net.minecraft.server.v1_8_R3.IAttribute)
     */
    @ReflectiveMethod(name = "e", types = {NMSIAttribute.class})
    public NMSAttributeModifiable e(NMSIAttribute iAttribute){
        return new NMSAttributeModifiable(NMSWrapper.getInstance().exec(nmsObject, iAttribute));
    }

}