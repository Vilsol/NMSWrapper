package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutLogin")
public class NMSPacketPlayOutLogin extends NMSWrap {

    public NMSPacketPlayOutLogin(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutLogin(int i, NMSEnumGamemode enumGamemode, boolean b, int i1, NMSEnumDifficulty enumDifficulty, int i2, NMSWorldType worldType, boolean b1){
        super("PacketPlayOutLogin", new Object[]{int.class, NMSEnumGamemode.class, boolean.class, int.class, NMSEnumDifficulty.class, int.class, NMSWorldType.class, boolean.class}, new Object[]{i, enumGamemode, b, i1, enumDifficulty, i2, worldType, b1});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutLogin#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}