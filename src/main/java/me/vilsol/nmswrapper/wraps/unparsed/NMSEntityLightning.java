package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityLightning")
public class NMSEntityLightning extends NMSEntityWeather {

    public NMSEntityLightning(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityLightning(NMSWorld world, double d, double d1, double d2){
        super("EntityLightning", new Object[]{NMSWorld.class, double.class, double.class, double.class}, new Object[]{world, d, d1, d2});
    }

    public NMSEntityLightning(NMSWorld world, double d, double d1, double d2, boolean b){
        super("EntityLightning", new Object[]{NMSWorld.class, double.class, double.class, double.class, boolean.class}, new Object[]{world, d, d1, d2, b});
    }

    public NMSEntityLightning(NMSWorld world, double d, double d1, double d2, boolean b, boolean b1){
        super("EntityLightning", new Object[]{NMSWorld.class, double.class, double.class, double.class, boolean.class, boolean.class}, new Object[]{world, d, d1, d2, b, b1});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLightning#a(net.minecraft.server.v1_9_R1.NBTTagCompound)
     */
    @ReflectiveMethod(name = "a", types = {NMSNBTTagCompound.class})
    public void a(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLightning#b(net.minecraft.server.v1_9_R1.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public void b(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLightning#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public void h(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLightning#t_()
     */
    @ReflectiveMethod(name = "t_", types = {})
    public void t_(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}