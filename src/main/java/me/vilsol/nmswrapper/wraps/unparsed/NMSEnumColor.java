package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "EnumColor")
public class NMSEnumColor extends NMSWrap {
    public NMSEnumColor(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEnumColor(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
