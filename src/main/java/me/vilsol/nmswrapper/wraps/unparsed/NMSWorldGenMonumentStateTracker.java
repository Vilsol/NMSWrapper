package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "WorldGenMonumentStateTracker")
public class NMSWorldGenMonumentStateTracker extends NMSWrap {
    public NMSWorldGenMonumentStateTracker(Object nmsObject) {
        super(nmsObject);
    }

    public NMSWorldGenMonumentStateTracker(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
