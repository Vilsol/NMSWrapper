package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutRespawn")
public class NMSPacketPlayOutRespawn extends NMSWrap {

    public NMSPacketPlayOutRespawn(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutRespawn(int i, NMSEnumDifficulty enumDifficulty, NMSWorldType worldType, NMSEnumGamemode enumGamemode){
        super("PacketPlayOutRespawn", new Object[]{int.class, NMSEnumDifficulty.class, NMSWorldType.class, NMSEnumGamemode.class}, new Object[]{i, enumDifficulty, worldType, enumGamemode});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutRespawn#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}