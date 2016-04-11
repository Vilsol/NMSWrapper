package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ChatHoverable")
public class NMSChatHoverable extends NMSWrap {

    public NMSChatHoverable(Object nmsObject){
        super(nmsObject);
    }

    public NMSChatHoverable(NMSEnumHoverAction enumHoverAction, NMSIChatBaseComponent iChatBaseComponent){
        super("ChatHoverable", new Object[]{NMSEnumHoverAction.class, NMSIChatBaseComponent.class}, new Object[]{enumHoverAction, iChatBaseComponent});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ChatHoverable#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public NMSEnumHoverAction a(){
        return new NMSEnumHoverAction(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ChatHoverable#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public NMSIChatBaseComponent b(){
        return (NMSIChatBaseComponent) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChatHoverable#equals(java.lang.Object)
     */
    @ReflectiveMethod(name = "equals", types = {Object.class})
    public boolean equals(Object object){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChatHoverable#hashCode()
     */
    @ReflectiveMethod(name = "hashCode", types = {})
    public int hashCode(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChatHoverable#toString()
     */
    @ReflectiveMethod(name = "toString", types = {})
    public String toString(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}