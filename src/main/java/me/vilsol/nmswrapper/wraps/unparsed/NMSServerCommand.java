package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ServerCommand")
public class NMSServerCommand extends NMSWrap {

    public NMSServerCommand(Object nmsObject){
        super(nmsObject);
    }

    public NMSServerCommand(String s, NMSICommandListener iCommandListener){
        super("ServerCommand", new Object[]{String.class, NMSICommandListener.class}, new Object[]{s, iCommandListener});
    }

}