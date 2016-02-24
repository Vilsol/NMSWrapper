package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "EnumTallFlowerVariants")
public class NMSEnumTallFlowerVariants extends NMSWrap {
    public NMSEnumTallFlowerVariants(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEnumTallFlowerVariants(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
