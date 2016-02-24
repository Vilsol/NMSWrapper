package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "CommandBanIp")
public class NMSCommandBanIp extends NMSCommandAbstract {

    public NMSCommandBanIp(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.CommandBanIp#a(net.minecraft.server.v1_8_R3.ICommandListener, java.lang.String, java.lang.String)
     */
    @ReflectiveMethod(name = "a", types = {NMSICommandListener.class, String.class, String.class})
    public void a(NMSICommandListener iCommandListener, String s, String s1){
        NMSWrapper.getInstance().exec(nmsObject, iCommandListener, s, s1);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.CommandBanIp#canUse(net.minecraft.server.v1_8_R3.ICommandListener)
     */
    @ReflectiveMethod(name = "canUse", types = {NMSICommandListener.class})
    public boolean canUse(NMSICommandListener iCommandListener){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, iCommandListener);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.CommandBanIp#getCommand()
     */
    @ReflectiveMethod(name = "getCommand", types = {})
    public String getCommand(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.CommandBanIp#getUsage(net.minecraft.server.v1_8_R3.ICommandListener)
     */
    @ReflectiveMethod(name = "getUsage", types = {NMSICommandListener.class})
    public String getUsage(NMSICommandListener iCommandListener){
        return (String) NMSWrapper.getInstance().exec(nmsObject, iCommandListener);
    }

}