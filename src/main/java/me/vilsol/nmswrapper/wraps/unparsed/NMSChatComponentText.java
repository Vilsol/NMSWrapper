package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ChatComponentText")
public class NMSChatComponentText extends NMSChatBaseComponent {

    public NMSChatComponentText(Object nmsObject){
        super(nmsObject);
    }

    public NMSChatComponentText(String s){
        super("ChatComponentText", new Object[]{String.class}, new Object[]{s});
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ChatComponentText#equals(java.lang.Object)
     */
    @ReflectiveMethod(name = "equals", types = {Object.class})
    public boolean equals(Object object){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ChatComponentText#f()
     */
    @ReflectiveMethod(name = "f", types = {})
    public NMSIChatBaseComponent f(){
        return new NMSIChatBaseComponent(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ChatComponentText#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public String g(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ChatComponentText#getText()
     */
    @ReflectiveMethod(name = "getText", types = {})
    public String getText(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ChatComponentText#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public NMSChatComponentText h(){
        return new NMSChatComponentText(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ChatComponentText#toString()
     */
    @ReflectiveMethod(name = "toString", types = {})
    public String toString(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}