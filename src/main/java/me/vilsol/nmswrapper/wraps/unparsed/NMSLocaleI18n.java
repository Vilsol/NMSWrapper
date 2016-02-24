package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "LocaleI18n")
public class NMSLocaleI18n extends NMSWrap {

    public NMSLocaleI18n(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.LocaleI18n#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public long a(){
        return (long) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.LocaleI18n#b(java.lang.String)
     */
    @ReflectiveMethod(name = "b", types = {String.class})
    public String b(String s){
        return (String) NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.LocaleI18n#c(java.lang.String)
     */
    @ReflectiveMethod(name = "c", types = {String.class})
    public boolean c(String s){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.LocaleI18n#get(java.lang.String)
     */
    @ReflectiveMethod(name = "get", types = {String.class})
    public String get(String s){
        return (String) NMSWrapper.getInstance().exec(nmsObject, s);
    }

}