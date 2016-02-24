package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutPlayerListHeaderFooter")
public class NMSPacketPlayOutPlayerListHeaderFooter extends NMSWrap {

    public NMSPacketPlayOutPlayerListHeaderFooter(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutPlayerListHeaderFooter(NMSIChatBaseComponent iChatBaseComponent){
        super("PacketPlayOutPlayerListHeaderFooter", new Object[]{NMSIChatBaseComponent.class}, new Object[]{iChatBaseComponent});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutPlayerListHeaderFooter#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}