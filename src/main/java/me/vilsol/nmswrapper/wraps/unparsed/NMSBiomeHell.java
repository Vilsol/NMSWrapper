package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BiomeHell")
public class NMSBiomeHell extends NMSBiomeBase {

    public NMSBiomeHell(Object nmsObject){
        super(nmsObject);
    }

    public NMSBiomeHell(int i){
        super("BiomeHell", new Object[]{int.class}, new Object[]{i});
    }

}