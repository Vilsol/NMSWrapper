package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "NMSEnumAction")
public class NMSEnumAnimation extends NMSWrap {
    public NMSEnumAnimation(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEnumAnimation(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
