package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "EnumProtocolDirection")
public class NMSEnumProtocolDirection extends NMSWrap {
    public NMSEnumProtocolDirection(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEnumProtocolDirection(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
