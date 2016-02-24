package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "NMSIProgressUpdate")
public class NMSIProgressUpdate extends NMSWrap {
    public NMSIProgressUpdate(Object nmsObject) {
        super(nmsObject);
    }

    public NMSIProgressUpdate(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
