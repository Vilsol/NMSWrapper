package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "EnumClickAction")
public class NMSEnumClickAction extends NMSWrap {
    public NMSEnumClickAction(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEnumClickAction(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
