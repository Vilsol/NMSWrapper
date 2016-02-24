package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "TileEntityMobSpawner")
public class NMSTileEntityMobSpawner extends NMSTileEntity implements NMSIUpdatePlayerListBox {

    public NMSTileEntityMobSpawner(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.TileEntityMobSpawner#F()
     */
    @ReflectiveMethod(name = "F", types = {})
    public boolean F(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.TileEntityMobSpawner#a(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "a", types = {NMSNBTTagCompound.class})
    public void a(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.TileEntityMobSpawner#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public void b(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.TileEntityMobSpawner#c(int, int)
     */
    @ReflectiveMethod(name = "c", types = {int.class, int.class})
    public boolean c(int i, int i1){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i, i1);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityMobSpawner#getSpawner()
     */
    @ReflectiveMethod(name = "getSpawner", types = {})
    public NMSMobSpawnerAbstract getSpawner(){
        return new NMSMobSpawnerAbstract(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityMobSpawner#getUpdatePacket()
     */
    @ReflectiveMethod(name = "getUpdatePacket", types = {})
    public NMSPacket getUpdatePacket(){
        return new NMSPacket(NMSWrapper.getInstance().exec(nmsObject));
    }

}