package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "IBlockAccess")
public class NMSIBlockAccess extends NMSWrap {

    public NMSIBlockAccess(Object nmsObject) {
        super(nmsObject);
    }

    public NMSIBlockAccess(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

}
