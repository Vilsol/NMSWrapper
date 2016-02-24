package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutOpenWindow")
public class NMSPacketPlayOutOpenWindow extends NMSWrap {

    public NMSPacketPlayOutOpenWindow(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutOpenWindow(int i, String s, NMSIChatBaseComponent iChatBaseComponent){
        super("PacketPlayOutOpenWindow", new Object[]{int.class, String.class, NMSIChatBaseComponent.class}, new Object[]{i, s, iChatBaseComponent});
    }

    public NMSPacketPlayOutOpenWindow(int i, String s, NMSIChatBaseComponent iChatBaseComponent, int i1){
        super("PacketPlayOutOpenWindow", new Object[]{int.class, String.class, NMSIChatBaseComponent.class, int.class}, new Object[]{i, s, iChatBaseComponent, i1});
    }

    public NMSPacketPlayOutOpenWindow(int i, String s, NMSIChatBaseComponent iChatBaseComponent, int i1, int i2){
        super("PacketPlayOutOpenWindow", new Object[]{int.class, String.class, NMSIChatBaseComponent.class, int.class, int.class}, new Object[]{i, s, iChatBaseComponent, i1, i2});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutOpenWindow#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}