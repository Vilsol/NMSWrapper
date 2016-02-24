package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutWindowData")
public class NMSPacketPlayOutWindowData extends NMSWrap {

    public NMSPacketPlayOutWindowData(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutWindowData(int i, int i1, int i2){
        super("PacketPlayOutWindowData", new Object[]{int.class, int.class, int.class}, new Object[]{i, i1, i2});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutWindowData#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}