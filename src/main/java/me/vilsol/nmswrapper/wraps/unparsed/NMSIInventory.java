package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "IInventory")
public class NMSIInventory extends NMSWrap {
    public NMSIInventory(Object nmsObject) {
        super(nmsObject);
    }

    public NMSIInventory(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
