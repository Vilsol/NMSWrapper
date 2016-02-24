package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutSpawnEntityLiving")
public class NMSPacketPlayOutSpawnEntityLiving extends NMSWrap {

    public NMSPacketPlayOutSpawnEntityLiving(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutSpawnEntityLiving(NMSEntityLiving entityLiving){
        super("PacketPlayOutSpawnEntityLiving", new Object[]{NMSEntityLiving.class}, new Object[]{entityLiving});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutSpawnEntityLiving#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}