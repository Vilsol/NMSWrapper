package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "EnumChatFormat")
public class NMSEnumChatFormat extends NMSWrap {
    public NMSEnumChatFormat(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEnumChatFormat(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
