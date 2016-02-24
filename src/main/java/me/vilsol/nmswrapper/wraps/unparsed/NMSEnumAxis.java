package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "EnumAxis")
public class NMSEnumAxis extends NMSWrap {
    public NMSEnumAxis(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEnumAxis(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
