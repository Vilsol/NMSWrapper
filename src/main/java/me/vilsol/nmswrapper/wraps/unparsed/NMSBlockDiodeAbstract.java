package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "BlockDiodeAbstract")
public class NMSBlockDiodeAbstract extends NMSWrap {
    public NMSBlockDiodeAbstract(Object nmsObject) {
        super(nmsObject);
    }

    public NMSBlockDiodeAbstract(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
