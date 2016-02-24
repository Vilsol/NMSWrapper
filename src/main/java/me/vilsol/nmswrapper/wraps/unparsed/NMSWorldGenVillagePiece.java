package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "WorldGenVillagePiece")
public class NMSWorldGenVillagePiece extends NMSWrap {
    public NMSWorldGenVillagePiece(Object nmsObject) {
        super(nmsObject);
    }

    public NMSWorldGenVillagePiece(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
