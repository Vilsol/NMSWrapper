package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "AttributeBase")
public class NMSAttributeBase extends NMSWrap implements NMSIAttribute {

    public NMSAttributeBase(Object nmsObject){
        super(nmsObject);
    }

    public NMSAttributeBase(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.AttributeBase#a(boolean)
     */
    @ReflectiveMethod(name = "a", types = {boolean.class})
    public NMSAttributeBase a(boolean b){
        return new NMSAttributeBase(NMSWrapper.getInstance().exec(nmsObject, b));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.AttributeBase#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public double b(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.AttributeBase#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public boolean c(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.AttributeBase#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public NMSIAttribute d(){
        return (NMSIAttribute) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.AttributeBase#equals(java.lang.Object)
     */
    @ReflectiveMethod(name = "equals", types = {Object.class})
    public boolean equals(Object object){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.AttributeBase#getName()
     */
    @ReflectiveMethod(name = "getName", types = {})
    public String getName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.AttributeBase#hashCode()
     */
    @ReflectiveMethod(name = "hashCode", types = {})
    public int hashCode(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

}