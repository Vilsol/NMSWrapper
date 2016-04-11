package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

@ReflectiveClass(name = "ChatComponentSelector")
public class NMSChatComponentSelector extends NMSChatBaseComponent {

    public NMSChatComponentSelector(Object nmsObject){
        super(nmsObject);
    }

    public NMSChatComponentSelector(String s){
        super("ChatComponentSelector", new Object[]{String.class}, new Object[]{s});
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChatComponentSelector#equals(java.lang.Object)
     */
    @ReflectiveMethod(name = "equals", types = {Object.class})
    public boolean equals(Object object){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ChatComponentSelector#f()
     */
    @ReflectiveMethod(name = "f", types = {})
    public NMSIChatBaseComponent f(){
        return (NMSIChatBaseComponent) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ChatComponentSelector#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public String g(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChatComponentSelector#getText()
     */
    @ReflectiveMethod(name = "getText", types = {})
    public String getText(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ChatComponentSelector#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public NMSChatComponentSelector h(){
        return new NMSChatComponentSelector(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChatComponentSelector#toString()
     */
    @ReflectiveMethod(name = "toString", types = {})
    public String toString(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}