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
     * @see net.minecraft.server.v1_9_R1.AttributeMapBase#a(net.minecraft.server.v1_9_R1.AttributeInstance)
     */
    @ReflectiveMethod(name = "a", types = {NMSAttributeInstance.class})
    public void a(NMSAttributeInstance attributeInstance){
        NMSWrapper.getInstance().exec(nmsObject, attributeInstance);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.AttributeMapBase#b(net.minecraft.server.v1_9_R1.IAttribute)
     */
    @ReflectiveMethod(name = "b", types = {NMSIAttribute.class})
    public NMSAttributeInstance b(NMSIAttribute iAttribute){
        return (NMSAttributeInstance) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject, iAttribute));
    }

}