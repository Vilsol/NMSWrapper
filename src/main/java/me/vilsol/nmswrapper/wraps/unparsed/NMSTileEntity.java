package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "TileEntity")
public class NMSTileEntity extends NMSWrap {

    public NMSTileEntity(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.TileEntity#D()
     */
    @ReflectiveMethod(name = "D", types = {})
    public void D(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.TileEntity#E()
     */
    @ReflectiveMethod(name = "E", types = {})
    public void E(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.TileEntity#F()
     */
    @ReflectiveMethod(name = "F", types = {})
    public boolean F(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.TileEntity#a(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "a", types = {NMSBlockPosition.class})
    public void a(NMSBlockPosition blockPosition){
        NMSWrapper.getInstance().exec(nmsObject, blockPosition);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.TileEntity#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public void b(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.TileEntity#c(int, int)
     */
    @ReflectiveMethod(name = "c", types = {int.class, int.class})
    public boolean c(int i, int i1){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i, i1);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntity#getOwner()
     */
    @ReflectiveMethod(name = "getOwner", types = {})
    public InventoryHolder getOwner(){
        return new InventoryHolder(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntity#getPosition()
     */
    @ReflectiveMethod(name = "getPosition", types = {})
    public NMSBlockPosition getPosition(){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntity#getUpdatePacket()
     */
    @ReflectiveMethod(name = "getUpdatePacket", types = {})
    public NMSPacket getUpdatePacket(){
        return new NMSPacket(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntity#getWorld()
     */
    @ReflectiveMethod(name = "getWorld", types = {})
    public NMSWorld getWorld(){
        return new NMSWorld(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.TileEntity#t()
     */
    @ReflectiveMethod(name = "t", types = {})
    public boolean t(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.TileEntity#u()
     */
    @ReflectiveMethod(name = "u", types = {})
    public int u(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntity#update()
     */
    @ReflectiveMethod(name = "update", types = {})
    public void update(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.TileEntity#w()
     */
    @ReflectiveMethod(name = "w", types = {})
    public NMSBlock w(){
        return new NMSBlock(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.TileEntity#x()
     */
    @ReflectiveMethod(name = "x", types = {})
    public boolean x(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.TileEntity#y()
     */
    @ReflectiveMethod(name = "y", types = {})
    public void y(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}