package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutNamedEntitySpawn")
public class NMSPacketPlayOutNamedEntitySpawn extends NMSWrap {

    public NMSPacketPlayOutNamedEntitySpawn(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutNamedEntitySpawn(NMSEntityHuman entityHuman){
        super("PacketPlayOutNamedEntitySpawn", new Object[]{NMSEntityHuman.class}, new Object[]{entityHuman});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutNamedEntitySpawn#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}