package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "ITileEntityContainer")
public class NMSITileEntityContainer extends NMSWrap {
    public NMSITileEntityContainer(Object nmsObject) {
        super(nmsObject);
    }

    public NMSITileEntityContainer(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
