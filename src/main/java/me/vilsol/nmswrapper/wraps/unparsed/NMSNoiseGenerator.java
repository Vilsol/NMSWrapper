package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "NoiseGenerator")
public class NMSNoiseGenerator extends NMSWrap {

    public NMSNoiseGenerator(Object nmsObject){
        super(nmsObject);
    }

}