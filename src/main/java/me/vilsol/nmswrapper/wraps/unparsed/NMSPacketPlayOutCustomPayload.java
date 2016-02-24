package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutCustomPayload")
public class NMSPacketPlayOutCustomPayload extends NMSWrap {

    public NMSPacketPlayOutCustomPayload(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutCustomPayload(String s, NMSPacketDataSerializer packetDataSerializer){
        super("PacketPlayOutCustomPayload", new Object[]{String.class, NMSPacketDataSerializer.class}, new Object[]{s, packetDataSerializer});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutCustomPayload#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}