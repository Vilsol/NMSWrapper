package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityTNTPrimed")
public class NMSEntityTNTPrimed extends NMSEntity {

    public NMSEntityTNTPrimed(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityTNTPrimed(NMSWorld world){
        super("EntityTNTPrimed", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    public NMSEntityTNTPrimed(NMSWorld world, double d, double d1, double d2, NMSEntityLiving entityLiving){
        super("EntityTNTPrimed", new Object[]{NMSWorld.class, double.class, double.class, double.class, NMSEntityLiving.class}, new Object[]{world, d, d1, d2, entityLiving});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityTNTPrimed#a(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "a", types = {NMSNBTTagCompound.class})
    public void a(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityTNTPrimed#ad()
     */
    @ReflectiveMethod(name = "ad", types = {})
    public boolean ad(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityTNTPrimed#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public void b(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityTNTPrimed#getHeadHeight()
     */
    @ReflectiveMethod(name = "getHeadHeight", types = {})
    public float getHeadHeight(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityTNTPrimed#getSource()
     */
    @ReflectiveMethod(name = "getSource", types = {})
    public NMSEntityLiving getSource(){
        return new NMSEntityLiving(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityTNTPrimed#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public void h(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityTNTPrimed#s_()
     */
    @ReflectiveMethod(name = "s_", types = {})
    public boolean s_(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityTNTPrimed#t_()
     */
    @ReflectiveMethod(name = "t_", types = {})
    public void t_(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}