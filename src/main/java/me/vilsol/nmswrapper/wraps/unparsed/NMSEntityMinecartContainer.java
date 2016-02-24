package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "EntityMinecartContainer")
public class NMSEntityMinecartContainer extends NMSWrap {
    public NMSEntityMinecartContainer(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    public NMSEntityMinecartContainer(Object nmsObject) {
        super(nmsObject);
    }
}
