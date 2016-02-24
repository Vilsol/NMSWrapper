package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "PlayerList")
public class NMSPlayerList extends NMSWrap {
    public NMSPlayerList(Object nmsObject) {
        super(nmsObject);
    }

    public NMSPlayerList(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
