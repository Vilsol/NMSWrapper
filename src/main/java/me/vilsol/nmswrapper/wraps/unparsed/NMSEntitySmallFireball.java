package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntitySmallFireball")
public class NMSEntitySmallFireball extends NMSEntityFireball {

    public NMSEntitySmallFireball(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntitySmallFireball(NMSWorld world){
        super("EntitySmallFireball", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    public NMSEntitySmallFireball(NMSWorld world, NMSEntityLiving entityLiving, double d, double d1, double d2){
        super("EntitySmallFireball", new Object[]{NMSWorld.class, NMSEntityLiving.class, double.class, double.class, double.class}, new Object[]{world, entityLiving, d, d1, d2});
    }

    public NMSEntitySmallFireball(NMSWorld world, double d, double d1, double d2, double d3, double d4, double d5){
        super("EntitySmallFireball", new Object[]{NMSWorld.class, double.class, double.class, double.class, double.class, double.class, double.class}, new Object[]{world, d, d1, d2, d3, d4, d5});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntitySmallFireball#a(net.minecraft.server.v1_9_R1.MovingObjectPosition)
     */
    @ReflectiveMethod(name = "a", types = {NMSMovingObjectPosition.class})
    public void a(NMSMovingObjectPosition movingObjectPosition){
        NMSWrapper.getInstance().exec(nmsObject, movingObjectPosition);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntitySmallFireball#ad()
     */
    @ReflectiveMethod(name = "ad", types = {})
    public boolean ad(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntitySmallFireball#damageEntity(net.minecraft.server.v1_9_R1.DamageSource, float)
     */
    @ReflectiveMethod(name = "damageEntity", types = {NMSDamageSource.class, float.class})
    public boolean damageEntity(NMSDamageSource damageSource, float f){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, damageSource, f);
    }

}