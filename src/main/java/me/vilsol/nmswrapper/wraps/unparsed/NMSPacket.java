package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "NMSPacket")
public class NMSPacket extends NMSWrap {
    public NMSPacket(Object nmsObject) {
        super(nmsObject);
    }

    public NMSPacket(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
