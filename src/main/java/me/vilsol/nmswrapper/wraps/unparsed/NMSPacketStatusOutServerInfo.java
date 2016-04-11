package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketStatusOutServerInfo")
public class NMSPacketStatusOutServerInfo extends NMSWrap {

    public NMSPacketStatusOutServerInfo(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketStatusOutServerInfo(NMSServerPing serverPing){
        super("PacketStatusOutServerInfo", new Object[]{NMSServerPing.class}, new Object[]{serverPing});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PacketStatusOutServerInfo#a(net.minecraft.server.v1_9_R1.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}