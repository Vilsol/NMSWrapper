package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "EntityHanging")
public class NMSEntityHanging extends NMSWrap {
    public NMSEntityHanging(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEntityHanging(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
