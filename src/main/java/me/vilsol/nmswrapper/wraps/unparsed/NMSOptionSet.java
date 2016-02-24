package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "OptionSet")
public class NMSOptionSet extends NMSWrap {
    public NMSOptionSet(Object nmsObject) {
        super(nmsObject);
    }

    public NMSOptionSet(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
