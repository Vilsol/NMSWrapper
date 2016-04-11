package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "LocaleLanguage")
public class NMSLocaleLanguage extends NMSWrap {

    public NMSLocaleLanguage(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.LocaleLanguage#a(java.lang.String, java.lang.Object...)
     */
    @ReflectiveMethod(name = "a", types = {String.class, Object[].class})
    public String a(String s, Object[] array){
        return (String) NMSWrapper.getInstance().exec(nmsObject, s, array);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.LocaleLanguage#b(java.lang.String)
     */
    @ReflectiveMethod(name = "b", types = {String.class})
    public boolean b(String s){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.LocaleLanguage#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public long c(){
        return (long) NMSWrapper.getInstance().exec(nmsObject);
    }

}