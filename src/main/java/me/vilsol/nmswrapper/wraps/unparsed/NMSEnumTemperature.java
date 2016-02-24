package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "EnumTemperature")
public class NMSEnumTemperature extends NMSWrap {
    public NMSEnumTemperature(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEnumTemperature(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
