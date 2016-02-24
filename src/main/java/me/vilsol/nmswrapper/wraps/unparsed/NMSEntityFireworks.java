package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityFireworks")
public class NMSEntityFireworks extends NMSEntity {

    public NMSEntityFireworks(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityFireworks(NMSWorld world){
        super("EntityFireworks", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    public NMSEntityFireworks(NMSWorld world, double d, double d1, double d2, NMSItemStack itemStack){
        super("EntityFireworks", new Object[]{NMSWorld.class, double.class, double.class, double.class, NMSItemStack.class}, new Object[]{world, d, d1, d2, itemStack});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityFireworks#a(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "a", types = {NMSNBTTagCompound.class})
    public void a(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityFireworks#aD()
     */
    @ReflectiveMethod(name = "aD", types = {})
    public boolean aD(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityFireworks#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public void b(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityFireworks#c(float)
     */
    @ReflectiveMethod(name = "c", types = {float.class})
    public float c(float f){
        return (float) NMSWrapper.getInstance().exec(nmsObject, f);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityFireworks#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public void h(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityFireworks#inactiveTick()
     */
    @ReflectiveMethod(name = "inactiveTick", types = {})
    public void inactiveTick(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityFireworks#t_()
     */
    @ReflectiveMethod(name = "t_", types = {})
    public void t_(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}