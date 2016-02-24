package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "WorldGenScatteredPiece")
public class NMSWorldGenScatteredPiece extends NMSWrap {
    public NMSWorldGenScatteredPiece(Object nmsObject) {
        super(nmsObject);
    }

    public NMSWorldGenScatteredPiece(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
