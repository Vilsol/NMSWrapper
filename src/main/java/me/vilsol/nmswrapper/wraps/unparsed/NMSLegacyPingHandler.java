package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "LegacyPingHandler")
public class NMSLegacyPingHandler extends ChannelInboundHandlerAdapter {

    public NMSLegacyPingHandler(Object nmsObject){
        super(nmsObject);
    }

    public NMSLegacyPingHandler(NMSServerConnection serverConnection){
        super("LegacyPingHandler", new Object[]{NMSServerConnection.class}, new Object[]{serverConnection});
    }

}