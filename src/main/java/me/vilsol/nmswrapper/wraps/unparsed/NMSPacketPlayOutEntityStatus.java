package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutEntityStatus")
public class NMSPacketPlayOutEntityStatus extends NMSWrap {

    public NMSPacketPlayOutEntityStatus(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutEntityStatus(NMSEntity entity, byte b){
        super("PacketPlayOutEntityStatus", new Object[]{NMSEntity.class, byte.class}, new Object[]{entity, b});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutEntityStatus#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}