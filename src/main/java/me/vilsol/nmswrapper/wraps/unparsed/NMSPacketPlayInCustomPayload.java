package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "PacketPlayInCustomPayload")
public class NMSPacketPlayInCustomPayload extends NMSWrap {
    public NMSPacketPlayInCustomPayload(Object nmsObject) {
        super(nmsObject);
    }

    public NMSPacketPlayInCustomPayload(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
