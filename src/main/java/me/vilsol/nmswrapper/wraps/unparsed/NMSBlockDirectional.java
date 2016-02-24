package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;

@ReflectiveClass(name = "BlockDirectional")
public class NMSBlockDirectional extends NMSBlock {

    public NMSBlockDirectional(Object nmsObject){
        super(nmsObject);
    }

    public NMSBlockDirectional(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}