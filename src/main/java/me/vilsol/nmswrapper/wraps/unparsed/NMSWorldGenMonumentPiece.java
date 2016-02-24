package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "WorldGenMonumentPiece")
public class NMSWorldGenMonumentPiece extends NMSWrap {
    public NMSWorldGenMonumentPiece(Object nmsObject) {
        super(nmsObject);
    }

    public NMSWorldGenMonumentPiece(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
