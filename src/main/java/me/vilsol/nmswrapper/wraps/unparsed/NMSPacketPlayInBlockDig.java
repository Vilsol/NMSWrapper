package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayInBlockDig")
public class NMSPacketPlayInBlockDig extends NMSWrap {

    public NMSPacketPlayInBlockDig(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayInBlockDig#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayInBlockDig#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public NMSEnumDirection b(){
        return new NMSEnumDirection(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayInBlockDig#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public NMSEnumPlayerDigType c(){
        return new NMSEnumPlayerDigType(NMSWrapper.getInstance().exec(nmsObject));
    }

}