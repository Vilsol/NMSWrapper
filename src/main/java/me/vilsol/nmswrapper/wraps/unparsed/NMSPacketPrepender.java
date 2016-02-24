package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPrepender")
public class NMSPacketPrepender extends MessageToByteEncoder {

    public NMSPacketPrepender(Object nmsObject){
        super(nmsObject);
    }

}