package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "AttributeModifiable")
public class NMSAttributeModifiable extends NMSWrap implements NMSAttributeInstance {

    public NMSAttributeModifiable(Object nmsObject){
        super(nmsObject);
    }

    public NMSAttributeModifiable(NMSAttributeMapBase attributeMapBase, NMSIAttribute iAttribute){
        super("AttributeModifiable", new Object[]{NMSAttributeMapBase.class, NMSIAttribute.class}, new Object[]{attributeMapBase, iAttribute});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.AttributeModifiable#a(net.minecraft.server.v1_8_R3.AttributeModifier)
     */
    @ReflectiveMethod(name = "a", types = {NMSAttributeModifier.class})
    public boolean a(NMSAttributeModifier attributeModifier){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, attributeModifier);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.AttributeModifiable#b(net.minecraft.server.v1_8_R3.AttributeModifier)
     */
    @ReflectiveMethod(name = "b", types = {NMSAttributeModifier.class})
    public void b(NMSAttributeModifier attributeModifier){
        NMSWrapper.getInstance().exec(nmsObject, attributeModifier);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.AttributeModifiable#c(net.minecraft.server.v1_8_R3.AttributeModifier)
     */
    @ReflectiveMethod(name = "c", types = {NMSAttributeModifier.class})
    public void c(NMSAttributeModifier attributeModifier){
        NMSWrapper.getInstance().exec(nmsObject, attributeModifier);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.AttributeModifiable#f()
     */
    @ReflectiveMethod(name = "f", types = {})
    public void f(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.AttributeModifiable#getAttribute()
     */
    @ReflectiveMethod(name = "getAttribute", types = {})
    public NMSIAttribute getAttribute(){
        return new NMSIAttribute(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.AttributeModifiable#getValue()
     */
    @ReflectiveMethod(name = "getValue", types = {})
    public double getValue(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.AttributeModifiable#setValue(double)
     */
    @ReflectiveMethod(name = "setValue", types = {double.class})
    public void setValue(double d){
        NMSWrapper.getInstance().exec(nmsObject, d);
    }

}