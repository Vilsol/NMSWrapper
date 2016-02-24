package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityHanging")
public class NMSEntityHanging extends NMSEntity {

    public NMSEntityHanging(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityHanging(NMSWorld world){
        super("EntityHanging", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    public NMSEntityHanging(NMSWorld world, NMSBlockPosition blockPosition){
        super("EntityHanging", new Object[]{NMSWorld.class, NMSBlockPosition.class}, new Object[]{world, blockPosition});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHanging#a(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "a", types = {NMSNBTTagCompound.class})
    public void a(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHanging#ad()
     */
    @ReflectiveMethod(name = "ad", types = {})
    public boolean ad(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHanging#af()
     */
    @ReflectiveMethod(name = "af", types = {})
    public boolean af(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHanging#b(net.minecraft.server.v1_8_R3.Entity)
     */
    @ReflectiveMethod(name = "b", types = {NMSEntity.class})
    public void b(NMSEntity entity){
        NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHanging#calculateBoundingBox(net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.EnumDirection, int, int)
     */
    @ReflectiveMethod(name = "calculateBoundingBox", types = {NMSBlockPosition.class, NMSEnumDirection.class, int.class, int.class})
    public NMSAxisAlignedBB calculateBoundingBox(NMSBlockPosition blockPosition, NMSEnumDirection enumDirection, int i, int i1){
        return new NMSAxisAlignedBB(NMSWrapper.getInstance().exec(nmsObject, blockPosition, enumDirection, i, i1));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHanging#damageEntity(net.minecraft.server.v1_8_R3.DamageSource, float)
     */
    @ReflectiveMethod(name = "damageEntity", types = {NMSDamageSource.class, float.class})
    public boolean damageEntity(NMSDamageSource damageSource, float f){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, damageSource, f);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHanging#g(double, double, double)
     */
    @ReflectiveMethod(name = "g", types = {double.class, double.class, double.class})
    public void g(double d, double d1, double d2){
        NMSWrapper.getInstance().exec(nmsObject, d, d1, d2);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHanging#getBlockPosition()
     */
    @ReflectiveMethod(name = "getBlockPosition", types = {})
    public NMSBlockPosition getBlockPosition(){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHanging#getDirection()
     */
    @ReflectiveMethod(name = "getDirection", types = {})
    public NMSEnumDirection getDirection(){
        return new NMSEnumDirection(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHanging#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public void h(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHanging#l()
     */
    @ReflectiveMethod(name = "l", types = {})
    public int l(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHanging#m()
     */
    @ReflectiveMethod(name = "m", types = {})
    public int m(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHanging#move(double, double, double)
     */
    @ReflectiveMethod(name = "move", types = {double.class, double.class, double.class})
    public void move(double d, double d1, double d2){
        NMSWrapper.getInstance().exec(nmsObject, d, d1, d2);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHanging#setDirection(net.minecraft.server.v1_8_R3.EnumDirection)
     */
    @ReflectiveMethod(name = "setDirection", types = {NMSEnumDirection.class})
    public void setDirection(NMSEnumDirection enumDirection){
        NMSWrapper.getInstance().exec(nmsObject, enumDirection);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHanging#setPosition(double, double, double)
     */
    @ReflectiveMethod(name = "setPosition", types = {double.class, double.class, double.class})
    public void setPosition(double d, double d1, double d2){
        NMSWrapper.getInstance().exec(nmsObject, d, d1, d2);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHanging#survives()
     */
    @ReflectiveMethod(name = "survives", types = {})
    public boolean survives(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHanging#t_()
     */
    @ReflectiveMethod(name = "t_", types = {})
    public void t_(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}