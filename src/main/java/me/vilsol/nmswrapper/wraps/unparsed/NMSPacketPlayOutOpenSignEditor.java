package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutOpenSignEditor")
public class NMSPacketPlayOutOpenSignEditor extends NMSWrap {

    public NMSPacketPlayOutOpenSignEditor(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutOpenSignEditor(NMSBlockPosition blockPosition){
        super("PacketPlayOutOpenSignEditor", new Object[]{NMSBlockPosition.class}, new Object[]{blockPosition});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutOpenSignEditor#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}