package me.vilsol.nmswrapper.wraps.entity;

import me.vilsol.nmswrapper.Reflection;
import me.vilsol.nmswrapper.wraps.NMSItemStack;
import me.vilsol.nmswrapper.wraps.NMSWrap;
import org.bukkit.entity.Entity;

public class NMSEntity extends NMSWrap {

    public NMSEntity(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEntity(Entity entity) {
        super(Reflection.executeMethod(entity, "getHandle", new Object[]{}, new Object[]{}));
    }

    public void setEquipment(int slot, NMSItemStack item){
        Reflection.executeMethod(nmsObject, "setEquipment", new Object[]{int.class, "ItemStack"}, new Object[]{slot, item});
    }

}
