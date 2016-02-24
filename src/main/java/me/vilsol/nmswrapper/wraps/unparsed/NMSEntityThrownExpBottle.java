package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityThrownExpBottle")
public class NMSEntityThrownExpBottle extends NMSEntityProjectile {

    public NMSEntityThrownExpBottle(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityThrownExpBottle(NMSWorld world){
        super("EntityThrownExpBottle", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    public NMSEntityThrownExpBottle(NMSWorld world, NMSEntityLiving entityLiving){
        super("EntityThrownExpBottle", new Object[]{NMSWorld.class, NMSEntityLiving.class}, new Object[]{world, entityLiving});
    }

    public NMSEntityThrownExpBottle(NMSWorld world, double d, double d1, double d2){
        super("EntityThrownExpBottle", new Object[]{NMSWorld.class, double.class, double.class, double.class}, new Object[]{world, d, d1, d2});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityThrownExpBottle#a(net.minecraft.server.v1_8_R3.MovingObjectPosition)
     */
    @ReflectiveMethod(name = "a", types = {NMSMovingObjectPosition.class})
    public void a(NMSMovingObjectPosition movingObjectPosition){
        NMSWrapper.getInstance().exec(nmsObject, movingObjectPosition);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityThrownExpBottle#j()
     */
    @ReflectiveMethod(name = "j", types = {})
    public float j(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityThrownExpBottle#l()
     */
    @ReflectiveMethod(name = "l", types = {})
    public float l(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityThrownExpBottle#m()
     */
    @ReflectiveMethod(name = "m", types = {})
    public float m(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

}