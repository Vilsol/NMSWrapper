package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "EnumFlowerVarient")
public class NMSEnumFlowerVarient extends NMSWrap {
    public NMSEnumFlowerVarient(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEnumFlowerVarient(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
