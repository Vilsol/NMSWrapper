package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "EnumLogVariant")
public class NMSEnumLogVariant extends NMSWrap {
    public NMSEnumLogVariant(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEnumLogVariant(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
