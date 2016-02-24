package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "CraftPlayer")
public class NMSCraftPlayer extends NMSWrap {
    public NMSCraftPlayer(Object nmsObject) {
        super(nmsObject);
    }

    public NMSCraftPlayer(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
