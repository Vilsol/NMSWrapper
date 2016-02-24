package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "CraftHumanEntity")
public class NMSCraftHumanEntity extends NMSWrap {
    public NMSCraftHumanEntity(Object nmsObject) {
        super(nmsObject);
    }

    public NMSCraftHumanEntity(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
