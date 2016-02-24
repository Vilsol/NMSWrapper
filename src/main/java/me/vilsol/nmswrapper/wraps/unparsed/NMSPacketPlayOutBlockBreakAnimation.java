package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutBlockBreakAnimation")
public class NMSPacketPlayOutBlockBreakAnimation extends NMSWrap {

    public NMSPacketPlayOutBlockBreakAnimation(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutBlockBreakAnimation(int i, NMSBlockPosition blockPosition, int i1){
        super("PacketPlayOutBlockBreakAnimation", new Object[]{int.class, NMSBlockPosition.class, int.class}, new Object[]{i, blockPosition, i1});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutBlockBreakAnimation#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}