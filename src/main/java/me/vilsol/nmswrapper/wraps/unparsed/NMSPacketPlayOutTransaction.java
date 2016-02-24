package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutTransaction")
public class NMSPacketPlayOutTransaction extends NMSWrap {

    public NMSPacketPlayOutTransaction(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutTransaction(int i, short s, boolean b){
        super("PacketPlayOutTransaction", new Object[]{int.class, short.class, boolean.class}, new Object[]{i, s, b});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutTransaction#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}