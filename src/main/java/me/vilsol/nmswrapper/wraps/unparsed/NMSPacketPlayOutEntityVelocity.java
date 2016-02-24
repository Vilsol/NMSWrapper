package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutEntityVelocity")
public class NMSPacketPlayOutEntityVelocity extends NMSWrap {

    public NMSPacketPlayOutEntityVelocity(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutEntityVelocity(NMSEntity entity){
        super("PacketPlayOutEntityVelocity", new Object[]{NMSEntity.class}, new Object[]{entity});
    }

    public NMSPacketPlayOutEntityVelocity(int i, double d, double d1, double d2){
        super("PacketPlayOutEntityVelocity", new Object[]{int.class, double.class, double.class, double.class}, new Object[]{i, d, d1, d2});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutEntityVelocity#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}