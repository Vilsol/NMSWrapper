package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

@ReflectiveClass(name = "PacketPrepender")
public class NMSPacketPrepender extends NMSWrap {

    public NMSPacketPrepender(Object nmsObject){
        super(nmsObject);
    }

}