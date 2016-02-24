package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "WorldGenerator")
public class NMSWorldGenerator extends NMSWrap {
    public NMSWorldGenerator(Object nmsObject) {
        super(nmsObject);
    }

    public NMSWorldGenerator(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
