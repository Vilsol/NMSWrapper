package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "CommandWorldBorder")
public class NMSCommandWorldBorder extends NMSCommandAbstract {

    public NMSCommandWorldBorder(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.CommandWorldBorder#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public int a(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.CommandWorldBorder#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public NMSWorldBorder d(){
        return new NMSWorldBorder(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.CommandWorldBorder#getCommand()
     */
    @ReflectiveMethod(name = "getCommand", types = {})
    public String getCommand(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.CommandWorldBorder#getUsage(net.minecraft.server.v1_9_R1.ICommandListener)
     */
    @ReflectiveMethod(name = "getUsage", types = {NMSICommandListener.class})
    public String getUsage(NMSICommandListener iCommandListener){
        return (String) NMSWrapper.getInstance().exec(nmsObject, iCommandListener);
    }

}