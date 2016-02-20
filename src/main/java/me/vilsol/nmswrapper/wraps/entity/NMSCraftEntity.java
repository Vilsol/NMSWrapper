package me.vilsol.nmswrapper.wraps.entity;

import me.vilsol.nmswrapper.Reflection;
import me.vilsol.nmswrapper.wraps.NMSBoundingBox;
import me.vilsol.nmswrapper.wraps.NMSWrap;
import org.bukkit.entity.Entity;

public class NMSCraftEntity extends NMSWrap {

    public NMSCraftEntity(Object nmsObject) {
        super(nmsObject);
    }

    public NMSCraftEntity(Entity entity) {
        super(entity);
    }

    public NMSEntity getHandle(){
        return new NMSEntity(Reflection.executeMethod(nmsObject, "getHandle", new Object[]{}, new Object[]{}));
    }

    public NMSBoundingBox getBoundingBox(){
        return new NMSBoundingBox(Reflection.executeMethod(nmsObject, "getBoundingBox", new Object[]{}, new Object[]{}));
    }

}
