package me.vilsol.nmswrapper.wraps.nbt;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

@ReflectiveClass(name = "NBTBase")
public abstract class NMSNBTBase extends NMSWrap {

    public NMSNBTBase(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    public NMSNBTBase(Object nmsObject) {
        super(nmsObject);
    }

}
