package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PathfinderAbstract")
public class NMSPathfinderAbstract extends NMSWrap {

    public NMSPathfinderAbstract(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PathfinderAbstract#a(net.minecraft.server.v1_8_R3.Entity, double, double, double)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntity.class, double.class, double.class, double.class})
    public NMSPathPoint a(NMSEntity entity, double d, double d1, double d2){
        return new NMSPathPoint(NMSWrapper.getInstance().exec(nmsObject, entity, d, d1, d2));
    }

}