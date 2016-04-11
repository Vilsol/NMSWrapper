package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWrap;

import java.util.UUID;

@ReflectiveClass(name = "AttributeModifier")
public class NMSAttributeModifier extends NMSWrap {

    public NMSAttributeModifier(Object nmsObject){
        super(nmsObject);
    }

    public NMSAttributeModifier(String s, double d, int i){
        super("AttributeModifier", new Object[]{String.class, double.class, int.class}, new Object[]{s, d, i});
    }

    public NMSAttributeModifier(UUID uUID, String s, double d, int i){
        super("AttributeModifier", new Object[]{UUID.class, String.class, double.class, int.class}, new Object[]{uUID, s, d, i});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.AttributeModifier#a(boolean)
     */
    @ReflectiveMethod(name = "a", types = {boolean.class})
    public NMSAttributeModifier a(boolean b){
        return new NMSAttributeModifier(NMSWrapper.getInstance().exec(nmsObject, b));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.AttributeModifier#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public String b(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.AttributeModifier#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public int c(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.AttributeModifier#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public double d(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.AttributeModifier#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public boolean e(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.AttributeModifier#equals(java.lang.Object)
     */
    @ReflectiveMethod(name = "equals", types = {Object.class})
    public boolean equals(Object object){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.AttributeModifier#hashCode()
     */
    @ReflectiveMethod(name = "hashCode", types = {})
    public int hashCode(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.AttributeModifier#toString()
     */
    @ReflectiveMethod(name = "toString", types = {})
    public String toString(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}