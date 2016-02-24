package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "CommandPublish")
public class NMSCommandPublish extends NMSCommandAbstract {

    public NMSCommandPublish(Object nmsObject){
        super(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.CommandPublish#getCommand()
     */
    @ReflectiveMethod(name = "getCommand", types = {})
    public String getCommand(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.CommandPublish#getUsage(net.minecraft.server.v1_8_R3.ICommandListener)
     */
    @ReflectiveMethod(name = "getUsage", types = {NMSICommandListener.class})
    public String getUsage(NMSICommandListener iCommandListener){
        return (String) NMSWrapper.getInstance().exec(nmsObject, iCommandListener);
    }

}