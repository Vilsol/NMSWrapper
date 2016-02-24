package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutGameStateChange")
public class NMSPacketPlayOutGameStateChange extends NMSWrap {

    public NMSPacketPlayOutGameStateChange(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutGameStateChange(int i, float f){
        super("PacketPlayOutGameStateChange", new Object[]{int.class, float.class}, new Object[]{i, f});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutGameStateChange#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}