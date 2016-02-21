package me.vilsol.nmswrapper.wraps.nbt;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;

@ReflectiveClass(name = "NBTTagList")
public class NMSNBTTagList extends NMSNBTBase {

    public NMSNBTTagList(Object nmsObject) {
        super(nmsObject);
    }

    public NMSNBTTagList() {
        super("NBTTagList", new Object[]{}, new Object[]{});
    }

}
