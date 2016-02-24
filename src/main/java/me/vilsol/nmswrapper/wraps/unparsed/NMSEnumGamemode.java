package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "EnumGamemode")
public class NMSEnumGamemode extends NMSWrap {
    public NMSEnumGamemode(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEnumGamemode(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
