package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "CraftEntity")
public class NMSCraftEntity extends NMSWrap {
    public NMSCraftEntity(Object nmsObject) {
        super(nmsObject);
    }

    public NMSCraftEntity(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
