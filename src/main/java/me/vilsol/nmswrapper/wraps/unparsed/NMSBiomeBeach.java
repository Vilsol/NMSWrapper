package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BiomeBeach")
public class NMSBiomeBeach extends NMSBiomeBase {

    public NMSBiomeBeach(Object nmsObject){
        super(nmsObject);
    }

    public NMSBiomeBeach(int i){
        super("BiomeBeach", new Object[]{int.class}, new Object[]{i});
    }

}