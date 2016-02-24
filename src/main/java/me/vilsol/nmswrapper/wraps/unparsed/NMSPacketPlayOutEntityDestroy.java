package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutEntityDestroy")
public class NMSPacketPlayOutEntityDestroy extends NMSWrap {

    public NMSPacketPlayOutEntityDestroy(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutEntityDestroy(int[] array){
        super("PacketPlayOutEntityDestroy", new Object[]{int[].class}, new Object[]{array});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutEntityDestroy#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}