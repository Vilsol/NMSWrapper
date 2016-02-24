package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityPainting")
public class NMSEntityPainting extends NMSEntityHanging {

    public NMSEntityPainting(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityPainting(NMSWorld world){
        super("EntityPainting", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    public NMSEntityPainting(NMSWorld world, NMSBlockPosition blockPosition, NMSEnumDirection enumDirection){
        super("EntityPainting", new Object[]{NMSWorld.class, NMSBlockPosition.class, NMSEnumDirection.class}, new Object[]{world, blockPosition, enumDirection});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityPainting#a(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "a", types = {NMSNBTTagCompound.class})
    public void a(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityPainting#b(net.minecraft.server.v1_8_R3.Entity)
     */
    @ReflectiveMethod(name = "b", types = {NMSEntity.class})
    public void b(NMSEntity entity){
        NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityPainting#l()
     */
    @ReflectiveMethod(name = "l", types = {})
    public int l(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityPainting#m()
     */
    @ReflectiveMethod(name = "m", types = {})
    public int m(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityPainting#setPositionRotation(double, double, double, float, float)
     */
    @ReflectiveMethod(name = "setPositionRotation", types = {double.class, double.class, double.class, float.class, float.class})
    public void setPositionRotation(double d, double d1, double d2, float f, float f1){
        NMSWrapper.getInstance().exec(nmsObject, d, d1, d2, f, f1);
    }

}