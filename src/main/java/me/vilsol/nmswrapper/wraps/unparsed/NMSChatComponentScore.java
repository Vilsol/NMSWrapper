package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

@ReflectiveClass(name = "ChatComponentScore")
public class NMSChatComponentScore extends NMSChatBaseComponent {

    public NMSChatComponentScore(Object nmsObject){
        super(nmsObject);
    }

    public NMSChatComponentScore(String s, String s1){
        super("ChatComponentScore", new Object[]{String.class, String.class}, new Object[]{s, s1});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ChatComponentScore#b(java.lang.String)
     */
    @ReflectiveMethod(name = "b", types = {String.class})
    public void b(String s){
        NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChatComponentScore#equals(java.lang.Object)
     */
    @ReflectiveMethod(name = "equals", types = {Object.class})
    public boolean equals(Object object){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ChatComponentScore#f()
     */
    @ReflectiveMethod(name = "f", types = {})
    public NMSIChatBaseComponent f(){
        return (NMSIChatBaseComponent) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ChatComponentScore#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public String g(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChatComponentScore#getText()
     */
    @ReflectiveMethod(name = "getText", types = {})
    public String getText(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ChatComponentScore#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public String h(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ChatComponentScore#i()
     */
    @ReflectiveMethod(name = "i", types = {})
    public NMSChatComponentScore i(){
        return new NMSChatComponentScore(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChatComponentScore#toString()
     */
    @ReflectiveMethod(name = "toString", types = {})
    public String toString(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}