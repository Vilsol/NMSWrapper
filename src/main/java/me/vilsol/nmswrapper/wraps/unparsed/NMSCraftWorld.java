package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "CraftWorld")
public class NMSCraftWorld extends NMSWrap {
    public NMSCraftWorld(Object nmsObject) {
        super(nmsObject);
    }

    public NMSCraftWorld(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
