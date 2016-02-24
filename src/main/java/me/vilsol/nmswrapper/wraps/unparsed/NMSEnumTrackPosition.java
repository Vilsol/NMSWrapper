package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "EnumTrackPosition")
public class NMSEnumTrackPosition extends NMSWrap {
    public NMSEnumTrackPosition(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEnumTrackPosition(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
