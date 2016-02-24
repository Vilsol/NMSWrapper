package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "EntityFlying")
public class NMSEntityFlying extends NMSWrap {
    public NMSEntityFlying(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEntityFlying(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
