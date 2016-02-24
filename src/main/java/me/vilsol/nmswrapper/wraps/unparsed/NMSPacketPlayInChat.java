package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayInChat")
public class NMSPacketPlayInChat extends NMSWrap {

    public NMSPacketPlayInChat(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayInChat(String s){
        super("PacketPlayInChat", new Object[]{String.class}, new Object[]{s});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayInChat#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}