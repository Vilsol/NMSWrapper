package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BiomeStoneBeach")
public class NMSBiomeStoneBeach extends NMSBiomeBase {

    public NMSBiomeStoneBeach(Object nmsObject){
        super(nmsObject);
    }

    public NMSBiomeStoneBeach(int i){
        super("BiomeStoneBeach", new Object[]{int.class}, new Object[]{i});
    }

}