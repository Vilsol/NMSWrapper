package me.vilsol.nmswrapper.wraps.nbt;

import me.vilsol.nmswrapper.wraps.NMSWrap;

public abstract class NMSNBTBase extends NMSWrap {

    public NMSNBTBase(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    public NMSNBTBase(Object nmsObject) {
        super(nmsObject);
    }

}
