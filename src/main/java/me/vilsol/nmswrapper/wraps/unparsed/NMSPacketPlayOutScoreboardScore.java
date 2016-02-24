package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutScoreboardScore")
public class NMSPacketPlayOutScoreboardScore extends NMSWrap {

    public NMSPacketPlayOutScoreboardScore(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutScoreboardScore(NMSScoreboardScore scoreboardScore){
        super("PacketPlayOutScoreboardScore", new Object[]{NMSScoreboardScore.class}, new Object[]{scoreboardScore});
    }

    public NMSPacketPlayOutScoreboardScore(String s){
        super("PacketPlayOutScoreboardScore", new Object[]{String.class}, new Object[]{s});
    }

    public NMSPacketPlayOutScoreboardScore(String s, NMSScoreboardObjective scoreboardObjective){
        super("PacketPlayOutScoreboardScore", new Object[]{String.class, NMSScoreboardObjective.class}, new Object[]{s, scoreboardObjective});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutScoreboardScore#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}