package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketDecoder")
public class NMSPacketDecoder extends ByteToMessageDecoder {

    public NMSPacketDecoder(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketDecoder(NMSEnumProtocolDirection enumProtocolDirection){
        super("PacketDecoder", new Object[]{NMSEnumProtocolDirection.class}, new Object[]{enumProtocolDirection});
    }

}