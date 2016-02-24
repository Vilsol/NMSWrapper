package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutKeepAlive")
public class NMSPacketPlayOutKeepAlive extends NMSWrap {

    public NMSPacketPlayOutKeepAlive(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutKeepAlive(int i){
        super("PacketPlayOutKeepAlive", new Object[]{int.class}, new Object[]{i});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutKeepAlive#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}