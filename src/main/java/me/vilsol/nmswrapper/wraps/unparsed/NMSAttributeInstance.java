package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "AttributeInstance")
public class NMSAttributeInstance extends NMSWrap {
    public NMSAttributeInstance(Object nmsObject) {
        super(nmsObject);
    }

    public NMSAttributeInstance(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
