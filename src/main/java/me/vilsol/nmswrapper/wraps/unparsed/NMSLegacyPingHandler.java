package me.vilsol.nmswrapper.wraps.unparsed;

import io.netty.channel.ChannelInboundHandlerAdapter;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;

@ReflectiveClass(name = "LegacyPingHandler")
public class NMSLegacyPingHandler extends ChannelInboundHandlerAdapter {

    public NMSLegacyPingHandler(Object nmsObject){
        super(nmsObject);
    }

    public NMSLegacyPingHandler(NMSServerConnection serverConnection){
        super("LegacyPingHandler", new Object[]{NMSServerConnection.class}, new Object[]{serverConnection});
    }

}