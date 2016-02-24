package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutSpawnEntityExperienceOrb")
public class NMSPacketPlayOutSpawnEntityExperienceOrb extends NMSWrap {

    public NMSPacketPlayOutSpawnEntityExperienceOrb(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutSpawnEntityExperienceOrb(NMSEntityExperienceOrb entityExperienceOrb){
        super("PacketPlayOutSpawnEntityExperienceOrb", new Object[]{NMSEntityExperienceOrb.class}, new Object[]{entityExperienceOrb});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutSpawnEntityExperienceOrb#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}