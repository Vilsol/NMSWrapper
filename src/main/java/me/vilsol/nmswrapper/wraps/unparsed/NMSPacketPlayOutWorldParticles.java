package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutWorldParticles")
public class NMSPacketPlayOutWorldParticles extends NMSWrap {

    public NMSPacketPlayOutWorldParticles(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutWorldParticles(NMSEnumParticle enumParticle, boolean b, float f, float f1, float f2, float f3, float f4, float f5, float f6, int i, int[] array){
        super("PacketPlayOutWorldParticles", new Object[]{NMSEnumParticle.class, boolean.class, float.class, float.class, float.class, float.class, float.class, float.class, float.class, int.class, int[].class}, new Object[]{enumParticle, b, f, f1, f2, f3, f4, f5, f6, i, array});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutWorldParticles#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}