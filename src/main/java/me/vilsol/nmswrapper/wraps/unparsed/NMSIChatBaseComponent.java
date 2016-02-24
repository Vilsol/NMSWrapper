package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "ChatBaseComponent")
public class NMSIChatBaseComponent extends NMSWrap {

    public NMSIChatBaseComponent(Object nmsObject) {
        super(nmsObject);
    }

    public NMSIChatBaseComponent(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

}
