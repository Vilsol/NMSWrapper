package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

@ReflectiveClass(name = "PacketDecoder")
public class NMSPacketDecoder extends NMSWrap {

    public NMSPacketDecoder(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketDecoder(NMSEnumProtocolDirection enumProtocolDirection){
        super("PacketDecoder", new Object[]{NMSEnumProtocolDirection.class}, new Object[]{enumProtocolDirection});
    }

}