package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "EnumMonsterType")
public class NMSEnumMonsterType extends NMSWrap {
    public NMSEnumMonsterType(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEnumMonsterType(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
