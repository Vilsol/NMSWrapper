package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutScoreboardObjective")
public class NMSPacketPlayOutScoreboardObjective extends NMSWrap {

    public NMSPacketPlayOutScoreboardObjective(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutScoreboardObjective(NMSScoreboardObjective scoreboardObjective, int i){
        super("PacketPlayOutScoreboardObjective", new Object[]{NMSScoreboardObjective.class, int.class}, new Object[]{scoreboardObjective, i});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutScoreboardObjective#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}