package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "IPlayerFileData")
public class NMSIPlayerFileData extends NMSWrap {
    public NMSIPlayerFileData(Object nmsObject) {
        super(nmsObject);
    }

    public NMSIPlayerFileData(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
