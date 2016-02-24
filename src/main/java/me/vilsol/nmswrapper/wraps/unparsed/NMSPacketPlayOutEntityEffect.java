package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutEntityEffect")
public class NMSPacketPlayOutEntityEffect extends NMSWrap {

    public NMSPacketPlayOutEntityEffect(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutEntityEffect(int i, NMSMobEffect mobEffect){
        super("PacketPlayOutEntityEffect", new Object[]{int.class, NMSMobEffect.class}, new Object[]{i, mobEffect});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutEntityEffect#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}