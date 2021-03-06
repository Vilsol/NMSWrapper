package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSNBTTagCompound;
import me.vilsol.nmswrapper.wraps.NMSWrap;
import org.bukkit.inventory.InventoryHolder;

@ReflectiveClass(name = "TileEntity")
public class NMSTileEntity extends NMSWrap {

    public NMSTileEntity(Object nmsObject){
        super(nmsObject);
    }

    public NMSTileEntity(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.TileEntity#D()
     */
    @ReflectiveMethod(name = "D", types = {})
    public void D(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.TileEntity#E()
     */
    @ReflectiveMethod(name = "E", types = {})
    public void E(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.TileEntity#F()
     */
    @ReflectiveMethod(name = "F", types = {})
    public boolean F(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.TileEntity#a(net.minecraft.server.v1_9_R1.BlockPosition)
     */
    @ReflectiveMethod(name = "a", types = {NMSBlockPosition.class})
    public void a(NMSBlockPosition blockPosition){
        NMSWrapper.getInstance().exec(nmsObject, blockPosition);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.TileEntity#b(net.minecraft.server.v1_9_R1.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public void b(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.TileEntity#c(int, int)
     */
    @ReflectiveMethod(name = "c", types = {int.class, int.class})
    public boolean c(int i, int i1){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i, i1);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.TileEntity#getOwner()
     */
    @ReflectiveMethod(name = "getOwner", types = {})
    public InventoryHolder getOwner(){
        return (InventoryHolder) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.TileEntity#getPosition()
     */
    @ReflectiveMethod(name = "getPosition", types = {})
    public NMSBlockPosition getPosition(){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.TileEntity#getUpdatePacket()
     */
    @ReflectiveMethod(name = "getUpdatePacket", types = {})
    public NMSPacket getUpdatePacket(){
        return new NMSPacket(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.TileEntity#getWorld()
     */
    @ReflectiveMethod(name = "getWorld", types = {})
    public NMSWorld getWorld(){
        return new NMSWorld(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.TileEntity#t()
     */
    @ReflectiveMethod(name = "t", types = {})
    public boolean t(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.TileEntity#u()
     */
    @ReflectiveMethod(name = "u", types = {})
    public int u(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.TileEntity#update()
     */
    @ReflectiveMethod(name = "update", types = {})
    public void update(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.TileEntity#w()
     */
    @ReflectiveMethod(name = "w", types = {})
    public NMSBlock w(){
        return new NMSBlock(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.TileEntity#x()
     */
    @ReflectiveMethod(name = "x", types = {})
    public boolean x(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.TileEntity#y()
     */
    @ReflectiveMethod(name = "y", types = {})
    public void y(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}