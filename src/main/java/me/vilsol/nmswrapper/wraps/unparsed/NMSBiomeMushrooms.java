package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BiomeMushrooms")
public class NMSBiomeMushrooms extends NMSBiomeBase {

    public NMSBiomeMushrooms(Object nmsObject){
        super(nmsObject);
    }

    public NMSBiomeMushrooms(int i){
        super("BiomeMushrooms", new Object[]{int.class}, new Object[]{i});
    }

}