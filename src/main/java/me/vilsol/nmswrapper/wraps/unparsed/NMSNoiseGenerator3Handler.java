package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "NoiseGenerator3Handler")
public class NMSNoiseGenerator3Handler extends NMSWrap {

    public NMSNoiseGenerator3Handler(Object nmsObject){
        super(nmsObject);
    }

    public NMSNoiseGenerator3Handler(Random random){
        super("NoiseGenerator3Handler", new Object[]{Random.class}, new Object[]{random});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NoiseGenerator3Handler#a(double, double)
     */
    @ReflectiveMethod(name = "a", types = {double.class, double.class})
    public double a(double d, double d1){
        return (double) NMSWrapper.getInstance().exec(nmsObject, d, d1);
    }

}