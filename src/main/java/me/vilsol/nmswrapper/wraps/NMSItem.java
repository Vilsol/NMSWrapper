package me.vilsol.nmswrapper.wraps;

import me.vilsol.nmswrapper.Reflection;

public class NMSItem extends NMSWrap {

    public NMSItem(Object nmsObject) {
        super(nmsObject);
    }

    public NMSItem(int id) {
        super(Reflection.staticReflection("Item", "getById", new Object[]{int.class}, new Object[]{id}));
    }

    @Override
    public String toString() {
        return "NMSItem{} " + super.toString();
    }

}
