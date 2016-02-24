package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "BiomeBase")
public abstract class NMSBiomeBase extends NMSWrap {

    public NMSBiomeBase(Object nmsObject) {
        super(nmsObject);
    }

    public NMSBiomeBase(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

}
