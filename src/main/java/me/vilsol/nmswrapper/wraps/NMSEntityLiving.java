package me.vilsol.nmswrapper.wraps;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;

@ReflectiveClass(name = "EntityLiving")
public class NMSEntityLiving extends NMSEntity {

    public NMSEntityLiving(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEntityLiving(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
