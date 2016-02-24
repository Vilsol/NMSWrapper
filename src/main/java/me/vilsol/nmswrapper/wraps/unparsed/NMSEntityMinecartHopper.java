package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityMinecartHopper")
public class NMSEntityMinecartHopper extends NMSEntityMinecartContainer implements NMSIHopper {

    public NMSEntityMinecartHopper(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityMinecartHopper(NMSWorld world){
        super("EntityMinecartHopper", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    public NMSEntityMinecartHopper(NMSWorld world, double d, double d1, double d2){
        super("EntityMinecartHopper", new Object[]{NMSWorld.class, double.class, double.class, double.class}, new Object[]{world, d, d1, d2});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartHopper#A()
     */
    @ReflectiveMethod(name = "A", types = {})
    public double A(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartHopper#B()
     */
    @ReflectiveMethod(name = "B", types = {})
    public double B(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartHopper#C()
     */
    @ReflectiveMethod(name = "C", types = {})
    public double C(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartHopper#D()
     */
    @ReflectiveMethod(name = "D", types = {})
    public boolean D(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartHopper#E()
     */
    @ReflectiveMethod(name = "E", types = {})
    public boolean E(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartHopper#a(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "a", types = {NMSNBTTagCompound.class})
    public void a(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartHopper#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public void b(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityMinecartHopper#createContainer(net.minecraft.server.v1_8_R3.PlayerInventory, net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "createContainer", types = {NMSPlayerInventory.class, NMSEntityHuman.class})
    public NMSContainer createContainer(NMSPlayerInventory playerInventory, NMSEntityHuman entityHuman){
        return new NMSContainer(NMSWrapper.getInstance().exec(nmsObject, playerInventory, entityHuman));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartHopper#e(net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "e", types = {NMSEntityHuman.class})
    public boolean e(NMSEntityHuman entityHuman){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityMinecartHopper#getContainerName()
     */
    @ReflectiveMethod(name = "getContainerName", types = {})
    public String getContainerName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityMinecartHopper#getSize()
     */
    @ReflectiveMethod(name = "getSize", types = {})
    public int getSize(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityMinecartHopper#getWorld()
     */
    @ReflectiveMethod(name = "getWorld", types = {})
    public NMSWorld getWorld(){
        return new NMSWorld(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartHopper#i(boolean)
     */
    @ReflectiveMethod(name = "i", types = {boolean.class})
    public void i(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartHopper#m(int)
     */
    @ReflectiveMethod(name = "m", types = {int.class})
    public void m(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartHopper#s()
     */
    @ReflectiveMethod(name = "s", types = {})
    public NMSEnumMinecartType s(){
        return new NMSEnumMinecartType(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartHopper#t_()
     */
    @ReflectiveMethod(name = "t_", types = {})
    public void t_(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartHopper#u()
     */
    @ReflectiveMethod(name = "u", types = {})
    public NMSIBlockData u(){
        return new NMSIBlockData(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartHopper#w()
     */
    @ReflectiveMethod(name = "w", types = {})
    public int w(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartHopper#y()
     */
    @ReflectiveMethod(name = "y", types = {})
    public boolean y(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}