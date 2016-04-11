package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "CommandTime")
public class NMSCommandTime extends NMSCommandAbstract {

    public NMSCommandTime(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.CommandTime#a(net.minecraft.server.v1_9_R1.ICommandListener, int)
     */
    @ReflectiveMethod(name = "a", types = {NMSICommandListener.class, int.class})
    public void a(NMSICommandListener iCommandListener, int i){
        NMSWrapper.getInstance().exec(nmsObject, iCommandListener, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.CommandTime#b(net.minecraft.server.v1_9_R1.ICommandListener, int)
     */
    @ReflectiveMethod(name = "b", types = {NMSICommandListener.class, int.class})
    public void b(NMSICommandListener iCommandListener, int i){
        NMSWrapper.getInstance().exec(nmsObject, iCommandListener, i);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.CommandTime#getCommand()
     */
    @ReflectiveMethod(name = "getCommand", types = {})
    public String getCommand(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.CommandTime#getUsage(net.minecraft.server.v1_9_R1.ICommandListener)
     */
    @ReflectiveMethod(name = "getUsage", types = {NMSICommandListener.class})
    public String getUsage(NMSICommandListener iCommandListener){
        return (String) NMSWrapper.getInstance().exec(nmsObject, iCommandListener);
    }

}