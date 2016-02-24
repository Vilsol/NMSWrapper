package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutHeldItemSlot")
public class NMSPacketPlayOutHeldItemSlot extends NMSWrap {

    public NMSPacketPlayOutHeldItemSlot(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutHeldItemSlot(int i){
        super("PacketPlayOutHeldItemSlot", new Object[]{int.class}, new Object[]{i});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutHeldItemSlot#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}