package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketEncoder")
public class NMSPacketEncoder extends MessageToByteEncoder {

    public NMSPacketEncoder(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketEncoder(NMSEnumProtocolDirection enumProtocolDirection){
        super("PacketEncoder", new Object[]{NMSEnumProtocolDirection.class}, new Object[]{enumProtocolDirection});
    }

}