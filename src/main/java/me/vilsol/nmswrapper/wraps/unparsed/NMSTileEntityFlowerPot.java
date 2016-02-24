package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "TileEntityFlowerPot")
public class NMSTileEntityFlowerPot extends NMSTileEntity {

    public NMSTileEntityFlowerPot(Object nmsObject){
        super(nmsObject);
    }

    public NMSTileEntityFlowerPot(NMSItem item, int i){
        super("TileEntityFlowerPot", new Object[]{NMSItem.class, int.class}, new Object[]{item, i});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.TileEntityFlowerPot#a(net.minecraft.server.v1_8_R3.Item, int)
     */
    @ReflectiveMethod(name = "a", types = {NMSItem.class, int.class})
    public void a(NMSItem item, int i){
        NMSWrapper.getInstance().exec(nmsObject, item, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.TileEntityFlowerPot#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public NMSItem b(){
        return new NMSItem(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.TileEntityFlowerPot#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public int c(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityFlowerPot#getUpdatePacket()
     */
    @ReflectiveMethod(name = "getUpdatePacket", types = {})
    public NMSPacket getUpdatePacket(){
        return new NMSPacket(NMSWrapper.getInstance().exec(nmsObject));
    }

}