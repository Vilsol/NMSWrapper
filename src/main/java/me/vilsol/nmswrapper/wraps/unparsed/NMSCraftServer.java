package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "CraftServer")
public class NMSCraftServer extends NMSWrap{
    public NMSCraftServer(Object nmsObject) {
        super(nmsObject);
    }

    public NMSCraftServer(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
