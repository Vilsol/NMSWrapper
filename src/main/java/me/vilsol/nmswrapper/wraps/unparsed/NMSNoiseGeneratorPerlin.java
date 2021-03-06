package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

import java.util.Random;

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
     * @see net.minecraft.server.v1_9_R1.NoiseGeneratorPerlin#a(int, double, double, double)
     */
    @ReflectiveMethod(name = "a", types = {int.class, double.class, double.class, double.class})
    public double a(int i, double d, double d1, double d2){
        return (double) NMSWrapper.getInstance().exec(nmsObject, i, d, d1, d2);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.NoiseGeneratorPerlin#b(double, double, double)
     */
    @ReflectiveMethod(name = "b", types = {double.class, double.class, double.class})
    public double b(double d, double d1, double d2){
        return (double) NMSWrapper.getInstance().exec(nmsObject, d, d1, d2);
    }

}