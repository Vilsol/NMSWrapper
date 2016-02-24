package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "EnumGenLayerSpecial")
public class NMSEnumGenLayerSpecial extends NMSWrap {
    public NMSEnumGenLayerSpecial(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEnumGenLayerSpecial(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
