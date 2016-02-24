package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ChatMessage")
public class NMSChatMessage extends NMSChatBaseComponent {

    public NMSChatMessage(Object nmsObject){
        super(nmsObject);
    }

    public NMSChatMessage(String s, Object[] array){
        super("ChatMessage", new Object[]{String.class, Object[].class}, new Object[]{s, array});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ChatMessage#b(java.lang.String)
     */
    @ReflectiveMethod(name = "b", types = {String.class})
    public void b(String s){
        NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ChatMessage#equals(java.lang.Object)
     */
    @ReflectiveMethod(name = "equals", types = {Object.class})
    public boolean equals(Object object){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ChatMessage#f()
     */
    @ReflectiveMethod(name = "f", types = {})
    public NMSIChatBaseComponent f(){
        return new NMSIChatBaseComponent(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ChatMessage#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public void g(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ChatMessage#getText()
     */
    @ReflectiveMethod(name = "getText", types = {})
    public String getText(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ChatMessage#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public NMSChatMessage h(){
        return new NMSChatMessage(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ChatMessage#hashCode()
     */
    @ReflectiveMethod(name = "hashCode", types = {})
    public int hashCode(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ChatMessage#i()
     */
    @ReflectiveMethod(name = "i", types = {})
    public String i(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ChatMessage#setChatModifier(net.minecraft.server.v1_8_R3.ChatModifier)
     */
    @ReflectiveMethod(name = "setChatModifier", types = {NMSChatModifier.class})
    public NMSIChatBaseComponent setChatModifier(NMSChatModifier chatModifier){
        return new NMSIChatBaseComponent(NMSWrapper.getInstance().exec(nmsObject, chatModifier));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ChatMessage#toString()
     */
    @ReflectiveMethod(name = "toString", types = {})
    public String toString(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}