package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityEgg")
public class NMSEntityEgg extends NMSEntityProjectile {

    public NMSEntityEgg(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityEgg(NMSWorld world){
        super("EntityEgg", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    public NMSEntityEgg(NMSWorld world, NMSEntityLiving entityLiving){
        super("EntityEgg", new Object[]{NMSWorld.class, NMSEntityLiving.class}, new Object[]{world, entityLiving});
    }

    public NMSEntityEgg(NMSWorld world, double d, double d1, double d2){
        super("EntityEgg", new Object[]{NMSWorld.class, double.class, double.class, double.class}, new Object[]{world, d, d1, d2});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityEgg#a(net.minecraft.server.v1_8_R3.MovingObjectPosition)
     */
    @ReflectiveMethod(name = "a", types = {NMSMovingObjectPosition.class})
    public void a(NMSMovingObjectPosition movingObjectPosition){
        NMSWrapper.getInstance().exec(nmsObject, movingObjectPosition);
    }

}