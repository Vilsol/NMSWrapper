package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "EntityAgeable")
public class NMSEntityAgeable extends NMSWrap {
    public NMSEntityAgeable(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEntityAgeable(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
