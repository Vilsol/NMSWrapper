package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "WorldSettings")
public class NMSWorldSettings extends NMSWrap {
    public NMSWorldSettings(Object nmsObject) {
        super(nmsObject);
    }

    public NMSWorldSettings(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
