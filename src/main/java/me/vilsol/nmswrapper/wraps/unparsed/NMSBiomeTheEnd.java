package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BiomeTheEnd")
public class NMSBiomeTheEnd extends NMSBiomeBase {

    public NMSBiomeTheEnd(Object nmsObject){
        super(nmsObject);
    }

    public NMSBiomeTheEnd(int i){
        super("BiomeTheEnd", new Object[]{int.class}, new Object[]{i});
    }

}