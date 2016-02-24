package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutCollect")
public class NMSPacketPlayOutCollect extends NMSWrap {

    public NMSPacketPlayOutCollect(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutCollect(int i, int i1){
        super("PacketPlayOutCollect", new Object[]{int.class, int.class}, new Object[]{i, i1});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutCollect#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}