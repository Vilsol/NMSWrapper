package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityWitherSkull")
public class NMSEntityWitherSkull extends NMSEntityFireball {

    public NMSEntityWitherSkull(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityWitherSkull(NMSWorld world){
        super("EntityWitherSkull", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    public NMSEntityWitherSkull(NMSWorld world, NMSEntityLiving entityLiving, double d, double d1, double d2){
        super("EntityWitherSkull", new Object[]{NMSWorld.class, NMSEntityLiving.class, double.class, double.class, double.class}, new Object[]{world, entityLiving, d, d1, d2});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityWitherSkull#a(net.minecraft.server.v1_9_R1.MovingObjectPosition)
     */
    @ReflectiveMethod(name = "a", types = {NMSMovingObjectPosition.class})
    public void a(NMSMovingObjectPosition movingObjectPosition){
        NMSWrapper.getInstance().exec(nmsObject, movingObjectPosition);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityWitherSkull#ad()
     */
    @ReflectiveMethod(name = "ad", types = {})
    public boolean ad(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityWitherSkull#damageEntity(net.minecraft.server.v1_9_R1.DamageSource, float)
     */
    @ReflectiveMethod(name = "damageEntity", types = {NMSDamageSource.class, float.class})
    public boolean damageEntity(NMSDamageSource damageSource, float f){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, damageSource, f);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityWitherSkull#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public void h(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityWitherSkull#isBurning()
     */
    @ReflectiveMethod(name = "isBurning", types = {})
    public boolean isBurning(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityWitherSkull#isCharged()
     */
    @ReflectiveMethod(name = "isCharged", types = {})
    public boolean isCharged(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityWitherSkull#j()
     */
    @ReflectiveMethod(name = "j", types = {})
    public float j(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityWitherSkull#setCharged(boolean)
     */
    @ReflectiveMethod(name = "setCharged", types = {boolean.class})
    public void setCharged(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

}