package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "BlockDirectional")
public class NMSBlockDirectional extends NMSWrap {
    public NMSBlockDirectional(Object nmsObject) {
        super(nmsObject);
    }

    public NMSBlockDirectional(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
