package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "CommandGamemodeDefault")
public class NMSCommandGamemodeDefault extends NMSCommandGamemode {

    public NMSCommandGamemodeDefault(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.CommandGamemodeDefault#a(net.minecraft.server.v1_9_R1.WorldSettings$EnumGamemode)
     */
    @ReflectiveMethod(name = "a", types = {NMSEnumGamemode.class})
    public void a(NMSEnumGamemode enumGamemode){
        NMSWrapper.getInstance().exec(nmsObject, enumGamemode);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.CommandGamemodeDefault#getCommand()
     */
    @ReflectiveMethod(name = "getCommand", types = {})
    public String getCommand(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.CommandGamemodeDefault#getUsage(net.minecraft.server.v1_9_R1.ICommandListener)
     */
    @ReflectiveMethod(name = "getUsage", types = {NMSICommandListener.class})
    public String getUsage(NMSICommandListener iCommandListener){
        return (String) NMSWrapper.getInstance().exec(nmsObject, iCommandListener);
    }

}