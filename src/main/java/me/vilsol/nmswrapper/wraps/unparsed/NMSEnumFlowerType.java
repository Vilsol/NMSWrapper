package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "EnumFlowerType")
public class NMSEnumFlowerType extends NMSWrap {
    public NMSEnumFlowerType(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEnumFlowerType(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
