package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

@ReflectiveClass(name = "AttributeMapServer")
public class NMSAttributeMapServer extends NMSAttributeMapBase {

    public NMSAttributeMapServer(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.AttributeMapServer#a(net.minecraft.server.v1_9_R1.IAttribute)
     */
    @ReflectiveMethod(name = "a", types = {NMSIAttribute.class})
    public NMSAttributeInstance a(NMSIAttribute iAttribute){
        return (NMSAttributeInstance) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject, iAttribute));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.AttributeMapServer#b(net.minecraft.server.v1_9_R1.IAttribute)
     */
    @ReflectiveMethod(name = "b", types = {NMSIAttribute.class})
    public NMSAttributeInstance b(NMSIAttribute iAttribute){
        return (NMSAttributeInstance) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject, iAttribute));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.AttributeMapServer#c(net.minecraft.server.v1_9_R1.IAttribute)
     */
    @ReflectiveMethod(name = "c", types = {NMSIAttribute.class})
    public NMSAttributeInstance c(NMSIAttribute iAttribute){
        return (NMSAttributeInstance) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject, iAttribute));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.AttributeMapServer#e(net.minecraft.server.v1_9_R1.IAttribute)
     */
    @ReflectiveMethod(name = "e", types = {NMSIAttribute.class})
    public NMSAttributeModifiable e(NMSIAttribute iAttribute){
        return new NMSAttributeModifiable(NMSWrapper.getInstance().exec(nmsObject, iAttribute));
    }

}