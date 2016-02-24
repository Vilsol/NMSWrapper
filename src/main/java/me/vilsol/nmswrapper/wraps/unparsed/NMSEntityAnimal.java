package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "IBlockData")
public abstract class NMSEntityAnimal extends NMSWrap {

    public NMSEntityAnimal(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEntityAnimal(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

}
