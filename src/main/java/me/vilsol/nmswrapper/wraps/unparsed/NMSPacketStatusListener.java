package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketStatusListener")
public class NMSPacketStatusListener extends NMSWrap implements NMSPacketStatusInListener {

    public NMSPacketStatusListener(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketStatusListener(NMSMinecraftServer minecraftServer, NMSNetworkManager networkManager){
        super("PacketStatusListener", new Object[]{NMSMinecraftServer.class, NMSNetworkManager.class}, new Object[]{minecraftServer, networkManager});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketStatusListener#a(net.minecraft.server.v1_8_R3.PacketStatusInPing)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketStatusInPing.class})
    public void a(NMSPacketStatusInPing packetStatusInPing){
        NMSWrapper.getInstance().exec(nmsObject, packetStatusInPing);
    }

}