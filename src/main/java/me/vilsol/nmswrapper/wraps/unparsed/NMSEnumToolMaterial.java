package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "EnumToolMaterial")
public class NMSEnumToolMaterial extends NMSWrap {
    public NMSEnumToolMaterial(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEnumToolMaterial(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
