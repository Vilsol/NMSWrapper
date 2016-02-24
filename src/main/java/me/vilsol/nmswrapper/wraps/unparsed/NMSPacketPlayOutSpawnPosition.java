package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutSpawnPosition")
public class NMSPacketPlayOutSpawnPosition extends NMSWrap {

    public NMSPacketPlayOutSpawnPosition(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutSpawnPosition(NMSBlockPosition blockPosition){
        super("PacketPlayOutSpawnPosition", new Object[]{NMSBlockPosition.class}, new Object[]{blockPosition});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutSpawnPosition#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}