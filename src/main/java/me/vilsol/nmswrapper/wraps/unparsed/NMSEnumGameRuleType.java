package me.vilsol.nmswrapper.wraps.unparsed;


import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "EnumGameRuleType")
public class NMSEnumGameRuleType extends NMSWrap {
    public NMSEnumGameRuleType(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEnumGameRuleType(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
