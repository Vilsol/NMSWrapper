package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutAnimation")
public class NMSPacketPlayOutAnimation extends NMSWrap {

    public NMSPacketPlayOutAnimation(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutAnimation(NMSEntity entity, int i){
        super("PacketPlayOutAnimation", new Object[]{NMSEntity.class, int.class}, new Object[]{entity, i});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutAnimation#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}