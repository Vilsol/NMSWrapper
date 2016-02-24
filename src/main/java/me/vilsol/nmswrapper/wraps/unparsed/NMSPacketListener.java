package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "PacketListener")
public class NMSPacketListener extends NMSWrap {
    public NMSPacketListener(Object nmsObject) {
        super(nmsObject);
    }

    public NMSPacketListener(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
