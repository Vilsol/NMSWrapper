package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutChat")
public class NMSPacketPlayOutChat extends NMSWrap {

    public NMSPacketPlayOutChat(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutChat(NMSIChatBaseComponent iChatBaseComponent){
        super("PacketPlayOutChat", new Object[]{NMSIChatBaseComponent.class}, new Object[]{iChatBaseComponent});
    }

    public NMSPacketPlayOutChat(NMSIChatBaseComponent iChatBaseComponent, byte b){
        super("PacketPlayOutChat", new Object[]{NMSIChatBaseComponent.class, byte.class}, new Object[]{iChatBaseComponent, b});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutChat#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutChat#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public boolean b(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}