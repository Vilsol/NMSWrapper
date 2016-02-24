package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutNamedSoundEffect")
public class NMSPacketPlayOutNamedSoundEffect extends NMSWrap {

    public NMSPacketPlayOutNamedSoundEffect(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutNamedSoundEffect(String s, double d, double d1, double d2, float f, float f1){
        super("PacketPlayOutNamedSoundEffect", new Object[]{String.class, double.class, double.class, double.class, float.class, float.class}, new Object[]{s, d, d1, d2, f, f1});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutNamedSoundEffect#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}