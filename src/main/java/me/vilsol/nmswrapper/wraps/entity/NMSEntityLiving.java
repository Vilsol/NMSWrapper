package me.vilsol.nmswrapper.wraps.entity;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;

@ReflectiveClass(name = "EntityLiving")
public class NMSEntityLiving extends NMSEntity {

    public NMSEntityLiving(Object nmsObject) {
        super(nmsObject);
    }

}
