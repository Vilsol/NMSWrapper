package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "EntityTameableAnimal")
public class NMSEntityTameableAnimal extends NMSWrap {
    public NMSEntityTameableAnimal(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEntityTameableAnimal(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
