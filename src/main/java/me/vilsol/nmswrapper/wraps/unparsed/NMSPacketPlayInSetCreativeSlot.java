package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayInSetCreativeSlot")
public class NMSPacketPlayInSetCreativeSlot extends NMSWrap {

    public NMSPacketPlayInSetCreativeSlot(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayInSetCreativeSlot#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketPlayInSetCreativeSlot#getItemStack()
     */
    @ReflectiveMethod(name = "getItemStack", types = {})
    public NMSItemStack getItemStack(){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject));
    }

}