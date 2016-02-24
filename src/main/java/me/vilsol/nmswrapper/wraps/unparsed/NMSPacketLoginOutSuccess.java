package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketLoginOutSuccess")
public class NMSPacketLoginOutSuccess extends NMSWrap {

    public NMSPacketLoginOutSuccess(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketLoginOutSuccess(GameProfile gameProfile){
        super("PacketLoginOutSuccess", new Object[]{GameProfile.class}, new Object[]{gameProfile});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketLoginOutSuccess#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}