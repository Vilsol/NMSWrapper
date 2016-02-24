package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BiomeRiver")
public class NMSBiomeRiver extends NMSBiomeBase {

    public NMSBiomeRiver(Object nmsObject){
        super(nmsObject);
    }

    public NMSBiomeRiver(int i){
        super("BiomeRiver", new Object[]{int.class}, new Object[]{i});
    }

}