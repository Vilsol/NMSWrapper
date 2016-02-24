package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "CommandHandler")
public class NMSCommandHandler extends NMSWrap implements NMSICommandHandler {

    public NMSCommandHandler(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.CommandHandler#a(net.minecraft.server.v1_8_R3.ICommand)
     */
    @ReflectiveMethod(name = "a", types = {NMSICommand.class})
    public NMSICommand a(NMSICommand iCommand){
        return (NMSICommand) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject, iCommand));
    }

}