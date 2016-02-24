package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "ICrafting")
public class NMSICrafting extends NMSWrap {
    public NMSICrafting(Object nmsObject) {
        super(nmsObject);
    }

    public NMSICrafting(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
