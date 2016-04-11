package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PathfinderWater")
public class NMSPathfinderWater extends NMSPathfinderAbstract {

    public NMSPathfinderWater(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderWater#a(net.minecraft.server.v1_9_R1.Entity, double, double, double)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntity.class, double.class, double.class, double.class})
    public NMSPathPoint a(NMSEntity entity, double d, double d1, double d2){
        return new NMSPathPoint(NMSWrapper.getInstance().exec(nmsObject, entity, d, d1, d2));
    }

}