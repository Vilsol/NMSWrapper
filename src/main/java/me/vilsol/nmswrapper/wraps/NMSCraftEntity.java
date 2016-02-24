package me.vilsol.nmswrapper.wraps;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import org.bukkit.entity.Entity;

@ReflectiveClass(name = "entity.CraftEntity", craft = true)
public class NMSCraftEntity extends NMSWrap {

    public NMSCraftEntity(Object nmsObject) {
        super(nmsObject);
    }

    public NMSCraftEntity(Entity entity) {
        super(entity);
    }

    @ReflectiveMethod(name = "getHandle")
    public NMSEntity getHandle(){
        return new NMSEntity(NMSWrapper.getInstance().exec(nmsObject));
    }

}
