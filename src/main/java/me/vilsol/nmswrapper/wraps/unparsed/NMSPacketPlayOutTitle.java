package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutTitle")
public class NMSPacketPlayOutTitle extends NMSWrap {

    public NMSPacketPlayOutTitle(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutTitle(NMSEnumTitleAction enumTitleAction, NMSIChatBaseComponent iChatBaseComponent){
        super("PacketPlayOutTitle", new Object[]{NMSEnumTitleAction.class, NMSIChatBaseComponent.class}, new Object[]{enumTitleAction, iChatBaseComponent});
    }

    public NMSPacketPlayOutTitle(int i, int i1, int i2){
        super("PacketPlayOutTitle", new Object[]{int.class, int.class, int.class}, new Object[]{i, i1, i2});
    }

    public NMSPacketPlayOutTitle(NMSEnumTitleAction enumTitleAction, NMSIChatBaseComponent iChatBaseComponent, int i, int i1, int i2){
        super("PacketPlayOutTitle", new Object[]{NMSEnumTitleAction.class, NMSIChatBaseComponent.class, int.class, int.class, int.class}, new Object[]{enumTitleAction, iChatBaseComponent, i, i1, i2});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutTitle#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}