package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketSplitter")
public class NMSPacketSplitter extends ByteToMessageDecoder {

    public NMSPacketSplitter(Object nmsObject){
        super(nmsObject);
    }

}