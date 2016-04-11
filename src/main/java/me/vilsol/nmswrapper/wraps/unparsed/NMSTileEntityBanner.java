package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "TileEntityBanner")
public class NMSTileEntityBanner extends NMSTileEntity {

    public NMSTileEntityBanner(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.TileEntityBanner#a(net.minecraft.server.v1_9_R1.NBTTagCompound)
     */
    @ReflectiveMethod(name = "a", types = {NMSNBTTagCompound.class})
    public void a(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.TileEntityBanner#b(net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "b", types = {NMSItemStack.class})
    public int b(NMSItemStack itemStack){
        return (int) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.TileEntityBanner#c(net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "c", types = {NMSItemStack.class})
    public int c(NMSItemStack itemStack){
        return (int) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.TileEntityBanner#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public NMSNBTTagList d(){
        return new NMSNBTTagList(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.TileEntityBanner#e(net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "e", types = {NMSItemStack.class})
    public void e(NMSItemStack itemStack){
        NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.TileEntityBanner#getUpdatePacket()
     */
    @ReflectiveMethod(name = "getUpdatePacket", types = {})
    public NMSPacket getUpdatePacket(){
        return new NMSPacket(NMSWrapper.getInstance().exec(nmsObject));
    }

}