package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "NoiseGeneratorOctaves")
public class NMSNoiseGeneratorOctaves extends NMSNoiseGenerator {

    public NMSNoiseGeneratorOctaves(Object nmsObject){
        super(nmsObject);
    }

    public NMSNoiseGeneratorOctaves(Random random, int i){
        super("NoiseGeneratorOctaves", new Object[]{Random.class, int.class}, new Object[]{random, i});
    }

}