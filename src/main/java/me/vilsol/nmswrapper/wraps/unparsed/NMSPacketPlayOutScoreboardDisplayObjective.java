package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutScoreboardDisplayObjective")
public class NMSPacketPlayOutScoreboardDisplayObjective extends NMSWrap {

    public NMSPacketPlayOutScoreboardDisplayObjective(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutScoreboardDisplayObjective(int i, NMSScoreboardObjective scoreboardObjective){
        super("PacketPlayOutScoreboardDisplayObjective", new Object[]{int.class, NMSScoreboardObjective.class}, new Object[]{i, scoreboardObjective});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutScoreboardDisplayObjective#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}