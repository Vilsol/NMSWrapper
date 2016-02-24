package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

@ReflectiveClass(name = "NoiseGenerator")
public class NMSNoiseGenerator extends NMSWrap {

    public NMSNoiseGenerator(Object nmsObject){
        super(nmsObject);
    }

    public NMSNoiseGenerator(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}