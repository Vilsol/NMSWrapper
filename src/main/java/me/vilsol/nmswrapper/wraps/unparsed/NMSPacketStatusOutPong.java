package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketStatusOutPong")
public class NMSPacketStatusOutPong extends NMSWrap {

    public NMSPacketStatusOutPong(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketStatusOutPong(long l){
        super("PacketStatusOutPong", new Object[]{long.class}, new Object[]{l});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PacketStatusOutPong#a(net.minecraft.server.v1_9_R1.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}