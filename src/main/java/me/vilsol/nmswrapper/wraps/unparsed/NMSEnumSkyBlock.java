package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "EnumSkyBlock")
public class NMSEnumSkyBlock extends NMSWrap {
    public NMSEnumSkyBlock(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEnumSkyBlock(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
