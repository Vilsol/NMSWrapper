package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutResourcePackSend")
public class NMSPacketPlayOutResourcePackSend extends NMSWrap {

    public NMSPacketPlayOutResourcePackSend(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutResourcePackSend(String s, String s1){
        super("PacketPlayOutResourcePackSend", new Object[]{String.class, String.class}, new Object[]{s, s1});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutResourcePackSend#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}