package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "HandshakeListener")
public class NMSHandshakeListener extends NMSWrap implements NMSPacketHandshakingInListener {

    public NMSHandshakeListener(Object nmsObject){
        super(nmsObject);
    }

    public NMSHandshakeListener(NMSMinecraftServer minecraftServer, NMSNetworkManager networkManager){
        super("HandshakeListener", new Object[]{NMSMinecraftServer.class, NMSNetworkManager.class}, new Object[]{minecraftServer, networkManager});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.HandshakeListener#a(net.minecraft.server.v1_8_R3.IChatBaseComponent)
     */
    @ReflectiveMethod(name = "a", types = {NMSIChatBaseComponent.class})
    public void a(NMSIChatBaseComponent iChatBaseComponent){
        NMSWrapper.getInstance().exec(nmsObject, iChatBaseComponent);
    }

}