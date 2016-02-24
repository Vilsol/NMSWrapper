package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutUpdateTime")
public class NMSPacketPlayOutUpdateTime extends NMSWrap {

    public NMSPacketPlayOutUpdateTime(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutUpdateTime(long l, long l1, boolean b){
        super("PacketPlayOutUpdateTime", new Object[]{long.class, long.class, boolean.class}, new Object[]{l, l1, b});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutUpdateTime#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}