package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "WorldGenVillageRoadPiece")
public class NMSWorldGenVillageRoadPiece extends NMSWrap {
    public NMSWorldGenVillageRoadPiece(Object nmsObject) {
        super(nmsObject);
    }

    public NMSWorldGenVillageRoadPiece(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
