package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutServerDifficulty")
public class NMSPacketPlayOutServerDifficulty extends NMSWrap {

    public NMSPacketPlayOutServerDifficulty(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutServerDifficulty(NMSEnumDifficulty enumDifficulty, boolean b){
        super("PacketPlayOutServerDifficulty", new Object[]{NMSEnumDifficulty.class, boolean.class}, new Object[]{enumDifficulty, b});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutServerDifficulty#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}