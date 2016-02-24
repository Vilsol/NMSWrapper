package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "NoiseGeneratorPerlin")
public class NMSNoiseGeneratorPerlin extends NMSNoiseGenerator {

    public NMSNoiseGeneratorPerlin(Object nmsObject){
        super(nmsObject);
    }

    public NMSNoiseGeneratorPerlin(Random random){
        super("NoiseGeneratorPerlin", new Object[]{Random.class}, new Object[]{random});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NoiseGeneratorPerlin#a(int, double, double, double)
     */
    @ReflectiveMethod(name = "a", types = {int.class, double.class, double.class, double.class})
    public double a(int i, double d, double d1, double d2){
        return (double) NMSWrapper.getInstance().exec(nmsObject, i, d, d1, d2);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NoiseGeneratorPerlin#b(double, double, double)
     */
    @ReflectiveMethod(name = "b", types = {double.class, double.class, double.class})
    public double b(double d, double d1, double d2){
        return (double) NMSWrapper.getInstance().exec(nmsObject, d, d1, d2);
    }

}