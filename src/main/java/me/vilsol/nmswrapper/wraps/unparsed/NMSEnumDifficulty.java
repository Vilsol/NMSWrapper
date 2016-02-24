package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "EnumDifficulty")
public class NMSEnumDifficulty extends NMSWrap {
    public NMSEnumDifficulty(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEnumDifficulty(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
