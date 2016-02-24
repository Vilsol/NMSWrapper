package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntitySnowball")
public class NMSEntitySnowball extends NMSEntityProjectile {

    public NMSEntitySnowball(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntitySnowball(NMSWorld world){
        super("EntitySnowball", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    public NMSEntitySnowball(NMSWorld world, NMSEntityLiving entityLiving){
        super("EntitySnowball", new Object[]{NMSWorld.class, NMSEntityLiving.class}, new Object[]{world, entityLiving});
    }

    public NMSEntitySnowball(NMSWorld world, double d, double d1, double d2){
        super("EntitySnowball", new Object[]{NMSWorld.class, double.class, double.class, double.class}, new Object[]{world, d, d1, d2});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySnowball#a(net.minecraft.server.v1_8_R3.MovingObjectPosition)
     */
    @ReflectiveMethod(name = "a", types = {NMSMovingObjectPosition.class})
    public void a(NMSMovingObjectPosition movingObjectPosition){
        NMSWrapper.getInstance().exec(nmsObject, movingObjectPosition);
    }

}