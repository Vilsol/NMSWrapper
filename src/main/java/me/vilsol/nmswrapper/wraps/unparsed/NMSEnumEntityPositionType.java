package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "EnumEntityPositionType")
public class NMSEnumEntityPositionType extends NMSWrap {
    public NMSEnumEntityPositionType(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEnumEntityPositionType(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
