package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

@ReflectiveClass(name = "PacketEncoder")
public class NMSPacketEncoder extends NMSWrap {

    public NMSPacketEncoder(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketEncoder(NMSEnumProtocolDirection enumProtocolDirection){
        super("PacketEncoder", new Object[]{NMSEnumProtocolDirection.class}, new Object[]{enumProtocolDirection});
    }

}