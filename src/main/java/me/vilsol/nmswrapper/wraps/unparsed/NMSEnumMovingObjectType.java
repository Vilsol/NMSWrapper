package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "EnumMovingObjectType")
public class NMSEnumMovingObjectType extends NMSWrap {
    public NMSEnumMovingObjectType(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEnumMovingObjectType(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
