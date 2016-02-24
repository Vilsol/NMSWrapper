package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "EnumWorldBorderState")
public class NMSEnumWorldBorderState extends NMSWrap {
    public NMSEnumWorldBorderState(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEnumWorldBorderState(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
