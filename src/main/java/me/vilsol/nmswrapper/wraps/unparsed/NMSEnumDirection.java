package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "EnumDirection")
public class NMSEnumDirection extends NMSWrap {
    public NMSEnumDirection(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEnumDirection(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
