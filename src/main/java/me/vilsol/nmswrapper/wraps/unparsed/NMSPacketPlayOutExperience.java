package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutExperience")
public class NMSPacketPlayOutExperience extends NMSWrap {

    public NMSPacketPlayOutExperience(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutExperience(float f, int i, int i1){
        super("PacketPlayOutExperience", new Object[]{float.class, int.class, int.class}, new Object[]{f, i, i1});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutExperience#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}