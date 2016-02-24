package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "EnumNameTagVisibility")
public class NMSEnumNameTagVisibility extends NMSWrap {
    public NMSEnumNameTagVisibility(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEnumNameTagVisibility(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
