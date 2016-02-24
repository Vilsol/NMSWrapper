package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutUpdateHealth")
public class NMSPacketPlayOutUpdateHealth extends NMSWrap {

    public NMSPacketPlayOutUpdateHealth(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutUpdateHealth(float f, int i, float f1){
        super("PacketPlayOutUpdateHealth", new Object[]{float.class, int.class, float.class}, new Object[]{f, i, f1});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutUpdateHealth#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}