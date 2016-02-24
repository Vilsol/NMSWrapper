package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutSpawnEntityPainting")
public class NMSPacketPlayOutSpawnEntityPainting extends NMSWrap {

    public NMSPacketPlayOutSpawnEntityPainting(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutSpawnEntityPainting(NMSEntityPainting entityPainting){
        super("PacketPlayOutSpawnEntityPainting", new Object[]{NMSEntityPainting.class}, new Object[]{entityPainting});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutSpawnEntityPainting#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}