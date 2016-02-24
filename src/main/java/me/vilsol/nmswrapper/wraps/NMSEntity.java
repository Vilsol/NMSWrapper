package me.vilsol.nmswrapper.wraps;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.Reflection;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import org.bukkit.entity.Entity;

@ReflectiveClass(name = "Entity")
public class NMSEntity extends NMSWrap {

    public NMSEntity(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEntity(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    public NMSEntity(Entity entity) {
        super(Reflection.executeMethod(entity, "getHandle", new Object[]{}, new Object[]{}));
    }

    @ReflectiveMethod(name = "setEquipment", types = {int.class, NMSItemStack.class})
    public void setEquipment(int slot, NMSItemStack item){
        NMSWrapper.getInstance().exec(nmsObject, slot, item);
    }

    @ReflectiveMethod(name = "getBoundingBox")
    public NMSBoundingBox getBoundingBox(){
        return new NMSBoundingBox(NMSWrapper.getInstance().exec(nmsObject));
    }

}
