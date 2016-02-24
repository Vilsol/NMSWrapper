package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutCamera")
public class NMSPacketPlayOutCamera extends NMSWrap {

    public NMSPacketPlayOutCamera(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutCamera(NMSEntity entity){
        super("PacketPlayOutCamera", new Object[]{NMSEntity.class}, new Object[]{entity});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutCamera#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}