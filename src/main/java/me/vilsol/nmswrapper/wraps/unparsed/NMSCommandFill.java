package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "CommandFill")
public class NMSCommandFill extends NMSCommandAbstract {

    public NMSCommandFill(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.CommandFill#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public int a(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.CommandFill#getCommand()
     */
    @ReflectiveMethod(name = "getCommand", types = {})
    public String getCommand(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.CommandFill#getUsage(net.minecraft.server.v1_8_R3.ICommandListener)
     */
    @ReflectiveMethod(name = "getUsage", types = {NMSICommandListener.class})
    public String getUsage(NMSICommandListener iCommandListener){
        return (String) NMSWrapper.getInstance().exec(nmsObject, iCommandListener);
    }

}