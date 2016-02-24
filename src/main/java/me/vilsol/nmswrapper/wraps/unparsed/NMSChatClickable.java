package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ChatClickable")
public class NMSChatClickable extends NMSWrap {

    public NMSChatClickable(Object nmsObject){
        super(nmsObject);
    }

    public NMSChatClickable(NMSEnumClickAction enumClickAction, String s){
        super("ChatClickable", new Object[]{NMSEnumClickAction.class, String.class}, new Object[]{enumClickAction, s});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ChatClickable#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public NMSEnumClickAction a(){
        return new NMSEnumClickAction(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ChatClickable#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public String b(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ChatClickable#equals(java.lang.Object)
     */
    @ReflectiveMethod(name = "equals", types = {Object.class})
    public boolean equals(Object object){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ChatClickable#hashCode()
     */
    @ReflectiveMethod(name = "hashCode", types = {})
    public int hashCode(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ChatClickable#toString()
     */
    @ReflectiveMethod(name = "toString", types = {})
    public String toString(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}