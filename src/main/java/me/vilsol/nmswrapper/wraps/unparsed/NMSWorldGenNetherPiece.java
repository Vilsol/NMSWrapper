package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "WorldGenNetherPiece")
public class NMSWorldGenNetherPiece extends NMSWrap {
    public NMSWorldGenNetherPiece(Object nmsObject) {
        super(nmsObject);
    }

    public NMSWorldGenNetherPiece(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
