package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayInTabComplete")
public class NMSPacketPlayInTabComplete extends NMSWrap {

    public NMSPacketPlayInTabComplete(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayInTabComplete(String s){
        super("PacketPlayInTabComplete", new Object[]{String.class}, new Object[]{s});
    }

    public NMSPacketPlayInTabComplete(String s, NMSBlockPosition blockPosition){
        super("PacketPlayInTabComplete", new Object[]{String.class, NMSBlockPosition.class}, new Object[]{s, blockPosition});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayInTabComplete#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayInTabComplete#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public NMSBlockPosition b(){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject));
    }

}