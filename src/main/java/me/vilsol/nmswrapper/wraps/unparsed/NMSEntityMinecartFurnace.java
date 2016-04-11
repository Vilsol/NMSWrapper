package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityMinecartFurnace")
public class NMSEntityMinecartFurnace extends NMSEntityMinecartAbstract {

    public NMSEntityMinecartFurnace(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityMinecartFurnace(NMSWorld world){
        super("EntityMinecartFurnace", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    public NMSEntityMinecartFurnace(NMSWorld world, double d, double d1, double d2){
        super("EntityMinecartFurnace", new Object[]{NMSWorld.class, double.class, double.class, double.class}, new Object[]{world, d, d1, d2});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityMinecartFurnace#a(net.minecraft.server.v1_9_R1.NBTTagCompound)
     */
    @ReflectiveMethod(name = "a", types = {NMSNBTTagCompound.class})
    public void a(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityMinecartFurnace#b(net.minecraft.server.v1_9_R1.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public void b(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityMinecartFurnace#e(net.minecraft.server.v1_9_R1.EntityHuman)
     */
    @ReflectiveMethod(name = "e", types = {NMSEntityHuman.class})
    public boolean e(NMSEntityHuman entityHuman){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityMinecartFurnace#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public void h(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityMinecartFurnace#i(boolean)
     */
    @ReflectiveMethod(name = "i", types = {boolean.class})
    public void i(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityMinecartFurnace#j()
     */
    @ReflectiveMethod(name = "j", types = {})
    public boolean j(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityMinecartFurnace#m()
     */
    @ReflectiveMethod(name = "m", types = {})
    public double m(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityMinecartFurnace#o()
     */
    @ReflectiveMethod(name = "o", types = {})
    public void o(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityMinecartFurnace#s()
     */
    @ReflectiveMethod(name = "s", types = {})
    public NMSEnumMinecartType s(){
        return new NMSEnumMinecartType(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityMinecartFurnace#t_()
     */
    @ReflectiveMethod(name = "t_", types = {})
    public void t_(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityMinecartFurnace#u()
     */
    @ReflectiveMethod(name = "u", types = {})
    public NMSIBlockData u(){
        return (NMSIBlockData) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject));
    }

}