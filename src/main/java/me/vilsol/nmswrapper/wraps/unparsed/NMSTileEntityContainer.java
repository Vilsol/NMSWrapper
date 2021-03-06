package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "TileEntityContainer")
public class NMSTileEntityContainer extends NMSTileEntity implements NMSITileInventory {

    public NMSTileEntityContainer(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.TileEntityContainer#a(net.minecraft.server.v1_9_R1.ChestLock)
     */
    @ReflectiveMethod(name = "a", types = {NMSChestLock.class})
    public void a(NMSChestLock chestLock){
        NMSWrapper.getInstance().exec(nmsObject, chestLock);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.TileEntityContainer#b(net.minecraft.server.v1_9_R1.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public void b(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.TileEntityContainer#getScoreboardDisplayName()
     */
    @ReflectiveMethod(name = "getScoreboardDisplayName", types = {})
    public NMSIChatBaseComponent getScoreboardDisplayName(){
        return (NMSIChatBaseComponent) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.TileEntityContainer#i()
     */
    @ReflectiveMethod(name = "i", types = {})
    public NMSChestLock i(){
        return new NMSChestLock(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.TileEntityContainer#r_()
     */
    @ReflectiveMethod(name = "r_", types = {})
    public boolean r_(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}