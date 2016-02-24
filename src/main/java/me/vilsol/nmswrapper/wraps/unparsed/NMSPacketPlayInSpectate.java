package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayInSpectate")
public class NMSPacketPlayInSpectate extends NMSWrap {

    public NMSPacketPlayInSpectate(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayInSpectate(UUID uUID){
        super("PacketPlayInSpectate", new Object[]{UUID.class}, new Object[]{uUID});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayInSpectate#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}