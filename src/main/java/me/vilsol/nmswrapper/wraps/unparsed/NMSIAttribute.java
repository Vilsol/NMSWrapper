package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "NMSIAttribute")
public class NMSIAttribute extends NMSWrap {
    public NMSIAttribute(Object nmsObject) {
        super(nmsObject);
    }

    public NMSIAttribute(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
