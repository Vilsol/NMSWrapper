package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "WorldGenStrongholdPiece")
public class NMSWorldGenStrongholdPiece extends NMSWrap {
    public NMSWorldGenStrongholdPiece(Object nmsObject) {
        super(nmsObject);
    }

    public NMSWorldGenStrongholdPiece(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
