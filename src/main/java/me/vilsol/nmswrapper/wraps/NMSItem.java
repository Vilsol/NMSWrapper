package me.vilsol.nmswrapper.wraps;

import me.vilsol.nmswrapper.reflections.Reflection;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;

@ReflectiveClass(name = "Item")
public class NMSItem extends NMSWrap {

    public NMSItem(Object nmsObject) {
        super(nmsObject);
    }

    public NMSItem(int id) {
        super(Reflection.staticReflection("Item", "getById", new Object[]{int.class}, new Object[]{id}));
    }

}
