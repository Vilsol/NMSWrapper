package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "CommandAbstract")
public class NMSCommandAbstract extends NMSWrap implements NMSICommand {

    public NMSCommandAbstract(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.CommandAbstract#a(net.minecraft.server.v1_8_R3.ICommand)
     */
    @ReflectiveMethod(name = "a", types = {NMSICommand.class})
    public int a(NMSICommand iCommand){
        return (int) NMSWrapper.getInstance().exec(nmsObject, iCommand);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.CommandAbstract#canUse(net.minecraft.server.v1_8_R3.ICommandListener)
     */
    @ReflectiveMethod(name = "canUse", types = {NMSICommandListener.class})
    public boolean canUse(NMSICommandListener iCommandListener){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, iCommandListener);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.CommandAbstract#compareTo(java.lang.Object)
     */
    @ReflectiveMethod(name = "compareTo", types = {Object.class})
    public int compareTo(Object object){
        return (int) NMSWrapper.getInstance().exec(nmsObject, object);
    }

}