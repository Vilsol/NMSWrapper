package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "GroupDataEntity")
public class NMSGroupDataEntity extends NMSWrap {
    public NMSGroupDataEntity(Object nmsObject) {
        super(nmsObject);
    }

    public NMSGroupDataEntity(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
