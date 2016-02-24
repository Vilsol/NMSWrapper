package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityMinecartCommandBlock")
public class NMSEntityMinecartCommandBlock extends NMSEntityMinecartAbstract {

    public NMSEntityMinecartCommandBlock(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityMinecartCommandBlock(NMSWorld world){
        super("EntityMinecartCommandBlock", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    public NMSEntityMinecartCommandBlock(NMSWorld world, double d, double d1, double d2){
        super("EntityMinecartCommandBlock", new Object[]{NMSWorld.class, double.class, double.class, double.class}, new Object[]{world, d, d1, d2});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartCommandBlock#a(int, int, int, boolean)
     */
    @ReflectiveMethod(name = "a", types = {int.class, int.class, int.class, boolean.class})
    public void a(int i, int i1, int i2, boolean b){
        NMSWrapper.getInstance().exec(nmsObject, i, i1, i2, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartCommandBlock#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public void b(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartCommandBlock#e(net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "e", types = {NMSEntityHuman.class})
    public boolean e(NMSEntityHuman entityHuman){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityMinecartCommandBlock#getCommandBlock()
     */
    @ReflectiveMethod(name = "getCommandBlock", types = {})
    public NMSCommandBlockListenerAbstract getCommandBlock(){
        return new NMSCommandBlockListenerAbstract(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartCommandBlock#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public void h(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartCommandBlock#i(int)
     */
    @ReflectiveMethod(name = "i", types = {int.class})
    public void i(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartCommandBlock#s()
     */
    @ReflectiveMethod(name = "s", types = {})
    public NMSEnumMinecartType s(){
        return new NMSEnumMinecartType(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartCommandBlock#u()
     */
    @ReflectiveMethod(name = "u", types = {})
    public NMSIBlockData u(){
        return new NMSIBlockData(NMSWrapper.getInstance().exec(nmsObject));
    }

}