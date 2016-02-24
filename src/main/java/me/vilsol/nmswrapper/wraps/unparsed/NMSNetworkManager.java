package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "NetworkManager")
public class NMSNetworkManager extends SimpleChannelInboundHandler {

    public NMSNetworkManager(Object nmsObject){
        super(nmsObject);
    }

    public NMSNetworkManager(NMSEnumProtocolDirection enumProtocolDirection){
        super("NetworkManager", new Object[]{NMSEnumProtocolDirection.class}, new Object[]{enumProtocolDirection});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NetworkManager#a(int)
     */
    @ReflectiveMethod(name = "a", types = {int.class})
    public void a(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NetworkManager#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public boolean c(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NetworkManager#close(net.minecraft.server.v1_8_R3.IChatBaseComponent)
     */
    @ReflectiveMethod(name = "close", types = {NMSIChatBaseComponent.class})
    public void close(NMSIChatBaseComponent iChatBaseComponent){
        NMSWrapper.getInstance().exec(nmsObject, iChatBaseComponent);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NetworkManager#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public boolean g(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NetworkManager#getPacketListener()
     */
    @ReflectiveMethod(name = "getPacketListener", types = {})
    public NMSPacketListener getPacketListener(){
        return new NMSPacketListener(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NetworkManager#getRawAddress()
     */
    @ReflectiveMethod(name = "getRawAddress", types = {})
    public SocketAddress getRawAddress(){
        return new SocketAddress(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NetworkManager#getSocketAddress()
     */
    @ReflectiveMethod(name = "getSocketAddress", types = {})
    public SocketAddress getSocketAddress(){
        return new SocketAddress(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NetworkManager#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public boolean h(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NetworkManager#handle(net.minecraft.server.v1_8_R3.Packet)
     */
    @ReflectiveMethod(name = "handle", types = {NMSPacket.class})
    public void handle(NMSPacket packet){
        NMSWrapper.getInstance().exec(nmsObject, packet);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NetworkManager#j()
     */
    @ReflectiveMethod(name = "j", types = {})
    public NMSIChatBaseComponent j(){
        return new NMSIChatBaseComponent(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NetworkManager#k()
     */
    @ReflectiveMethod(name = "k", types = {})
    public void k(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NetworkManager#l()
     */
    @ReflectiveMethod(name = "l", types = {})
    public void l(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}