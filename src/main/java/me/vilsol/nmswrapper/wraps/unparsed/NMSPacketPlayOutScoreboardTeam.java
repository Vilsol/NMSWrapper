package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutScoreboardTeam")
public class NMSPacketPlayOutScoreboardTeam extends NMSWrap {

    public NMSPacketPlayOutScoreboardTeam(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutScoreboardTeam(NMSScoreboardTeam scoreboardTeam, int i){
        super("PacketPlayOutScoreboardTeam", new Object[]{NMSScoreboardTeam.class, int.class}, new Object[]{scoreboardTeam, i});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutScoreboardTeam#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}