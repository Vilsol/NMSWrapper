package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

import java.util.Random;

@ReflectiveClass(name = "NoiseGenerator3")
public class NMSNoiseGenerator3 extends NMSNoiseGenerator {

    public NMSNoiseGenerator3(Object nmsObject){
        super(nmsObject);
    }

    public NMSNoiseGenerator3(Random random, int i){
        super("NoiseGenerator3", new Object[]{Random.class, int.class}, new Object[]{random, i});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NoiseGenerator3#a(double, double)
     */
    @ReflectiveMethod(name = "a", types = {double.class, double.class})
    public double a(double d, double d1){
        return (double) NMSWrapper.getInstance().exec(nmsObject, d, d1);
    }

}