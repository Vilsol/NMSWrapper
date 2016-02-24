package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "EnumScoreboardHealthDisplay")
public class NMSEnumScoreboardHealthDisplay extends NMSWrap {
    public NMSEnumScoreboardHealthDisplay(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEnumScoreboardHealthDisplay(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
