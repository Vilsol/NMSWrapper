package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "EnumHoverAction")
public class NMSEnumHoverAction extends NMSWrap {
    public NMSEnumHoverAction(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEnumHoverAction(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
