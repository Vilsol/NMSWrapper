package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "TileEntityCommand")
public class NMSTileEntityCommand extends NMSTileEntity {

    public NMSTileEntityCommand(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.TileEntityCommand#F()
     */
    @ReflectiveMethod(name = "F", types = {})
    public boolean F(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.TileEntityCommand#a(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "a", types = {NMSNBTTagCompound.class})
    public void a(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.TileEntityCommand#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public void b(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.TileEntityCommand#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public NMSCommandObjectiveExecutor c(){
        return new NMSCommandObjectiveExecutor(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityCommand#getCommandBlock()
     */
    @ReflectiveMethod(name = "getCommandBlock", types = {})
    public NMSCommandBlockListenerAbstract getCommandBlock(){
        return new NMSCommandBlockListenerAbstract(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityCommand#getUpdatePacket()
     */
    @ReflectiveMethod(name = "getUpdatePacket", types = {})
    public NMSPacket getUpdatePacket(){
        return new NMSPacket(NMSWrapper.getInstance().exec(nmsObject));
    }

}