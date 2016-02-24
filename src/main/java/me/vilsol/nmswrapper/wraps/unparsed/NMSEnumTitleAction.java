package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "EnumTitleAction")
public class NMSEnumTitleAction extends NMSWrap {
    public NMSEnumTitleAction(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEnumTitleAction(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
