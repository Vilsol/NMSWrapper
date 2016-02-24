package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "EnumCommandResult")
public class NMSEnumCommandResult extends NMSWrap {
    public NMSEnumCommandResult(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEnumCommandResult(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
