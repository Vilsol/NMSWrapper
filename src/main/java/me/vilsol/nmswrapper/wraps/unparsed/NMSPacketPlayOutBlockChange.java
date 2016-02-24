package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutBlockChange")
public class NMSPacketPlayOutBlockChange extends NMSWrap {

    public NMSPacketPlayOutBlockChange(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutBlockChange(NMSWorld world, NMSBlockPosition blockPosition){
        super("PacketPlayOutBlockChange", new Object[]{NMSWorld.class, NMSBlockPosition.class}, new Object[]{world, blockPosition});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutBlockChange#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}