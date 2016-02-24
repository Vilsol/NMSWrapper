package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "TileEntity")
public abstract class NMSTileEntity extends NMSWrap {

    public NMSTileEntity(Object nmsObject) {
        super(nmsObject);
    }

    public NMSTileEntity(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

}
