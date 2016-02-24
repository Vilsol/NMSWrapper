package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "CommandPardonIP")
public class NMSCommandPardonIP extends NMSCommandAbstract {

    public NMSCommandPardonIP(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.CommandPardonIP#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public int a(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.CommandPardonIP#canUse(net.minecraft.server.v1_8_R3.ICommandListener)
     */
    @ReflectiveMethod(name = "canUse", types = {NMSICommandListener.class})
    public boolean canUse(NMSICommandListener iCommandListener){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, iCommandListener);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.CommandPardonIP#getCommand()
     */
    @ReflectiveMethod(name = "getCommand", types = {})
    public String getCommand(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.CommandPardonIP#getUsage(net.minecraft.server.v1_8_R3.ICommandListener)
     */
    @ReflectiveMethod(name = "getUsage", types = {NMSICommandListener.class})
    public String getUsage(NMSICommandListener iCommandListener){
        return (String) NMSWrapper.getInstance().exec(nmsObject, iCommandListener);
    }

}