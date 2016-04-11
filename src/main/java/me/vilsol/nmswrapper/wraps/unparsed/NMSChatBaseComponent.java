package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ChatBaseComponent")
public class NMSChatBaseComponent extends NMSWrap implements NMSIChatBaseComponent {

    public NMSChatBaseComponent(Object nmsObject){
        super(nmsObject);
    }

    public NMSChatBaseComponent(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ChatBaseComponent#a(java.lang.String)
     */
    @ReflectiveMethod(name = "a", types = {String.class})
    public NMSIChatBaseComponent a(String s){
        return (NMSIChatBaseComponent) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject, s));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChatBaseComponent#addSibling(net.minecraft.server.v1_9_R1.IChatBaseComponent)
     */
    @ReflectiveMethod(name = "addSibling", types = {NMSIChatBaseComponent.class})
    public NMSIChatBaseComponent addSibling(NMSIChatBaseComponent iChatBaseComponent){
        return (NMSIChatBaseComponent) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject, iChatBaseComponent));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ChatBaseComponent#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public String c(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChatBaseComponent#equals(java.lang.Object)
     */
    @ReflectiveMethod(name = "equals", types = {Object.class})
    public boolean equals(Object object){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChatBaseComponent#getChatModifier()
     */
    @ReflectiveMethod(name = "getChatModifier", types = {})
    public NMSChatModifier getChatModifier(){
        return new NMSChatModifier(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChatBaseComponent#hashCode()
     */
    @ReflectiveMethod(name = "hashCode", types = {})
    public int hashCode(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChatBaseComponent#setChatModifier(net.minecraft.server.v1_9_R1.ChatModifier)
     */
    @ReflectiveMethod(name = "setChatModifier", types = {NMSChatModifier.class})
    public NMSIChatBaseComponent setChatModifier(NMSChatModifier chatModifier){
        return (NMSIChatBaseComponent) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject, chatModifier));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChatBaseComponent#toString()
     */
    @ReflectiveMethod(name = "toString", types = {})
    public String toString(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}