package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "Enchantment")
public class NMSEnchantment extends NMSWrap {
    public NMSEnchantment(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEnchantment(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
