package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutWorldEvent")
public class NMSPacketPlayOutWorldEvent extends NMSWrap {

    public NMSPacketPlayOutWorldEvent(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutWorldEvent(int i, NMSBlockPosition blockPosition, int i1, boolean b){
        super("PacketPlayOutWorldEvent", new Object[]{int.class, NMSBlockPosition.class, int.class, boolean.class}, new Object[]{i, blockPosition, i1, b});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutWorldEvent#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}