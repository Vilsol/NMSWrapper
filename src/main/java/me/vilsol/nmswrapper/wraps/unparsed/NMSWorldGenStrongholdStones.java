package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "WorldGenStrngholdStones")
public class NMSWorldGenStrongholdStones extends NMSWrap {
    public NMSWorldGenStrongholdStones(Object nmsObject) {
        super(nmsObject);
    }

    public NMSWorldGenStrongholdStones(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
