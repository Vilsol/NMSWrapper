package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "CommandDispatcher")
public class NMSCommandDispatcher extends NMSCommandHandler implements NMSICommandDispatcher {

    public NMSCommandDispatcher(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.CommandDispatcher#a(net.minecraft.server.v1_8_R3.ICommandListener, net.minecraft.server.v1_8_R3.ICommand, int, java.lang.String, java.lang.Object...)
     */
    @ReflectiveMethod(name = "a", types = {NMSICommandListener.class, NMSICommand.class, int.class, String.class, Object[].class})
    public void a(NMSICommandListener iCommandListener, NMSICommand iCommand, int i, String s, Object[] array){
        NMSWrapper.getInstance().exec(nmsObject, iCommandListener, iCommand, i, s, array);
    }

}