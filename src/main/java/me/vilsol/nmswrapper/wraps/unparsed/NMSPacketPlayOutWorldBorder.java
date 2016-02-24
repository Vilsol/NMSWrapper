package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutWorldBorder")
public class NMSPacketPlayOutWorldBorder extends NMSWrap {

    public NMSPacketPlayOutWorldBorder(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutWorldBorder(NMSWorldBorder worldBorder, NMSEnumWorldBorderAction enumWorldBorderAction){
        super("PacketPlayOutWorldBorder", new Object[]{NMSWorldBorder.class, NMSEnumWorldBorderAction.class}, new Object[]{worldBorder, enumWorldBorderAction});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutWorldBorder#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}