package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutEntityTeleport")
public class NMSPacketPlayOutEntityTeleport extends NMSWrap {

    public NMSPacketPlayOutEntityTeleport(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutEntityTeleport(NMSEntity entity){
        super("PacketPlayOutEntityTeleport", new Object[]{NMSEntity.class}, new Object[]{entity});
    }

    public NMSPacketPlayOutEntityTeleport(int i, int i1, int i2, int i3, byte b, byte b1, boolean b2){
        super("PacketPlayOutEntityTeleport", new Object[]{int.class, int.class, int.class, int.class, byte.class, byte.class, boolean.class}, new Object[]{i, i1, i2, i3, b, b1, b2});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutEntityTeleport#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}