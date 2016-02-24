package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "AttributeMapBase")
public class NMSAttributeMapBase extends NMSWrap {

    public NMSAttributeMapBase(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.AttributeMapBase#a(net.minecraft.server.v1_8_R3.AttributeInstance)
     */
    @ReflectiveMethod(name = "a", types = {NMSAttributeInstance.class})
    public void a(NMSAttributeInstance attributeInstance){
        NMSWrapper.getInstance().exec(nmsObject, attributeInstance);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.AttributeMapBase#b(net.minecraft.server.v1_8_R3.IAttribute)
     */
    @ReflectiveMethod(name = "b", types = {NMSIAttribute.class})
    public NMSAttributeInstance b(NMSIAttribute iAttribute){
        return new NMSAttributeInstance(NMSWrapper.getInstance().exec(nmsObject, iAttribute));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.AttributeMapBase#c(net.minecraft.server.v1_8_R3.IAttribute)
     */
    @ReflectiveMethod(name = "c", types = {NMSIAttribute.class})
    public NMSAttributeInstance c(NMSIAttribute iAttribute){
        return new NMSAttributeInstance(NMSWrapper.getInstance().exec(nmsObject, iAttribute));
    }

}