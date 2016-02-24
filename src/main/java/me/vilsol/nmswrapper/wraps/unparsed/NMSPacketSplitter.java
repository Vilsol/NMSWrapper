package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

@ReflectiveClass(name = "PacketSplitter")
public class NMSPacketSplitter extends NMSWrap {

    public NMSPacketSplitter(Object nmsObject){
        super(nmsObject);
    }

}