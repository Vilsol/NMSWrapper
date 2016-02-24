package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayInClientCommand")
public class NMSPacketPlayInClientCommand extends NMSWrap {

    public NMSPacketPlayInClientCommand(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayInClientCommand(NMSEnumClientCommand enumClientCommand){
        super("PacketPlayInClientCommand", new Object[]{NMSEnumClientCommand.class}, new Object[]{enumClientCommand});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayInClientCommand#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}