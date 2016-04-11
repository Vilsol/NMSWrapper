package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketLoginOutDisconnect")
public class NMSPacketLoginOutDisconnect extends NMSWrap {

    public NMSPacketLoginOutDisconnect(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketLoginOutDisconnect(NMSIChatBaseComponent iChatBaseComponent){
        super("PacketLoginOutDisconnect", new Object[]{NMSIChatBaseComponent.class}, new Object[]{iChatBaseComponent});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PacketLoginOutDisconnect#a(net.minecraft.server.v1_9_R1.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}