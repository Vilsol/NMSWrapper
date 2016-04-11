package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "AttributeRanged")
public class NMSAttributeRanged extends NMSAttributeBase {

    public NMSAttributeRanged(Object nmsObject){
        super(nmsObject);
    }

    public NMSAttributeRanged(NMSIAttribute iAttribute, String s, double d, double d1, double d2){
        super("AttributeRanged", new Object[]{NMSIAttribute.class, String.class, double.class, double.class, double.class}, new Object[]{iAttribute, s, d, d1, d2});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.AttributeRanged#a(double)
     */
    @ReflectiveMethod(name = "a", types = {double.class})
    public double a(double d){
        return (double) NMSWrapper.getInstance().exec(nmsObject, d);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.AttributeRanged#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public String g(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}