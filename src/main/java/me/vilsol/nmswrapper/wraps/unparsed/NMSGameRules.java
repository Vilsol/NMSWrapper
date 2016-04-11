package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "GameRules")
public class NMSGameRules extends NMSWrap {

    public NMSGameRules(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.GameRules#a(java.lang.String, net.minecraft.server.v1_9_R1.GameRules$EnumGameRuleType)
     */
    @ReflectiveMethod(name = "a", types = {String.class, NMSEnumGameRuleType.class})
    public boolean a(String s, NMSEnumGameRuleType enumGameRuleType){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, s, enumGameRuleType);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.GameRules#c(java.lang.String)
     */
    @ReflectiveMethod(name = "c", types = {String.class})
    public int c(String s){
        return (int) NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.GameRules#contains(java.lang.String)
     */
    @ReflectiveMethod(name = "contains", types = {String.class})
    public boolean contains(String s){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.GameRules#get(java.lang.String)
     */
    @ReflectiveMethod(name = "get", types = {String.class})
    public String get(String s){
        return (String) NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.GameRules#getBoolean(java.lang.String)
     */
    @ReflectiveMethod(name = "getBoolean", types = {String.class})
    public boolean getBoolean(String s){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.GameRules#set(java.lang.String, java.lang.String)
     */
    @ReflectiveMethod(name = "set", types = {String.class, String.class})
    public void set(String s, String s1){
        NMSWrapper.getInstance().exec(nmsObject, s, s1);
    }

}