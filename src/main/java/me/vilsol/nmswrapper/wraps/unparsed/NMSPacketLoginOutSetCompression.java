package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketLoginOutSetCompression")
public class NMSPacketLoginOutSetCompression extends NMSWrap {

    public NMSPacketLoginOutSetCompression(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketLoginOutSetCompression(int i){
        super("PacketLoginOutSetCompression", new Object[]{int.class}, new Object[]{i});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PacketLoginOutSetCompression#a(net.minecraft.server.v1_9_R1.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}