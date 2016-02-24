package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "TileEntityContainer")
public class NMSTileEntityContainer extends NMSWrap {
    public NMSTileEntityContainer(Object nmsObject) {
        super(nmsObject);
    }

    public NMSTileEntityContainer(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
