package me.vilsol.nmswrapper.wraps;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;

@ReflectiveClass(name = "NBTTagInt")
public class NMSNBTTagInt extends NMSNBTBase {

    public NMSNBTTagInt(Object nmsObject) {
        super(nmsObject);
    }

    public NMSNBTTagInt(int value) {
        super("NBTTagInt", new Object[]{int.class}, new Object[]{value});
    }

}
