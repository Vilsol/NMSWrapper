package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "EnumArmorMaterial")
public class NMSEnumArmorMaterial extends NMSWrap {
    public NMSEnumArmorMaterial(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEnumArmorMaterial(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
