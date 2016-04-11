package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "CommandGamerule")
public class NMSCommandGamerule extends NMSCommandAbstract {

    public NMSCommandGamerule(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.CommandGamerule#a(net.minecraft.server.v1_9_R1.GameRules, java.lang.String)
     */
    @ReflectiveMethod(name = "a", types = {NMSGameRules.class, String.class})
    public void a(NMSGameRules gameRules, String s){
        NMSWrapper.getInstance().exec(nmsObject, gameRules, s);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.CommandGamerule#compareTo(java.lang.Object)
     */
    @ReflectiveMethod(name = "compareTo", types = {Object.class})
    public int compareTo(Object object){
        return (int) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.CommandGamerule#getCommand()
     */
    @ReflectiveMethod(name = "getCommand", types = {})
    public String getCommand(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.CommandGamerule#getUsage(net.minecraft.server.v1_9_R1.ICommandListener)
     */
    @ReflectiveMethod(name = "getUsage", types = {NMSICommandListener.class})
    public String getUsage(NMSICommandListener iCommandListener){
        return (String) NMSWrapper.getInstance().exec(nmsObject, iCommandListener);
    }

}