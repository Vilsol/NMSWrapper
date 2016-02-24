package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSEntityLiving;

// TODO Implement
@ReflectiveClass(name = "EntityHuman")
public abstract class NMSEntityHuman extends NMSEntityLiving {

    public NMSEntityHuman(Object nmsObject) {
        super(nmsObject);
    }

}
