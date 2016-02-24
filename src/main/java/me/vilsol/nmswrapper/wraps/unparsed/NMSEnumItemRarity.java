package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "EnumItemRarity")
public class NMSEnumItemRarity extends NMSWrap {
    public NMSEnumItemRarity(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEnumItemRarity(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
