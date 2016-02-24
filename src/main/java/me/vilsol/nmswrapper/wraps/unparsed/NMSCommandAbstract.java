package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "CommandAbstract")
public class NMSCommandAbstract extends NMSWrap {

    public NMSCommandAbstract(Object nmsObject) {
        super(nmsObject);
    }

    public NMSCommandAbstract(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

}
