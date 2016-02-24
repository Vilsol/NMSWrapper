package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

@ReflectiveClass(name = "LegacyPingHandler")
public class NMSLegacyPingHandler extends NMSWrap {

    public NMSLegacyPingHandler(Object nmsObject){
        super(nmsObject);
    }

    public NMSLegacyPingHandler(NMSServerConnection serverConnection){
        super("LegacyPingHandler", new Object[]{NMSServerConnection.class}, new Object[]{serverConnection});
    }

}