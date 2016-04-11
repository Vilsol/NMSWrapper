package me.vilsol.nmswrapper.wraps.unparsed;


import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWrap;

import java.net.SocketAddress;

@ReflectiveClass(name = "NetworkManager")
public class NMSNetworkManager extends NMSWrap {

    public NMSNetworkManager(Object nmsObject){
        super(nmsObject);
    }

    public NMSNetworkManager(NMSEnumProtocolDirection enumProtocolDirection){
        super("NetworkManager", new Object[]{NMSEnumProtocolDirection.class}, new Object[]{enumProtocolDirection});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.NetworkManager#a(int)
     */
    @ReflectiveMethod(name = "a", types = {int.class})
    public void a(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.NetworkManager#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public boolean c(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.NetworkManager#close(net.minecraft.server.v1_9_R1.IChatBaseComponent)
     */
    @ReflectiveMethod(name = "close", types = {NMSIChatBaseComponent.class})
    public void close(NMSIChatBaseComponent iChatBaseComponent){
        NMSWrapper.getInstance().exec(nmsObject, iChatBaseComponent);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.NetworkManager#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public boolean g(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.NetworkManager#getPacketListener()
     */
    @ReflectiveMethod(name = "getPacketListener", types = {})
    public NMSPacketListener getPacketListener(){
        return new NMSPacketListener(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.NetworkManager#getRawAddress()
     */
    @ReflectiveMethod(name = "getRawAddress", types = {})
    public SocketAddress getRawAddress(){
        return (SocketAddress) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.NetworkManager#getSocketAddress()
     */
    @ReflectiveMethod(name = "getSocketAddress", types = {})
    public SocketAddress getSocketAddress(){
        return (SocketAddress) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.NetworkManager#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public boolean h(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.NetworkManager#handle(net.minecraft.server.v1_9_R1.Packet)
     */
    @ReflectiveMethod(name = "handle", types = {NMSPacket.class})
    public void handle(NMSPacket packet){
        NMSWrapper.getInstance().exec(nmsObject, packet);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.NetworkManager#j()
     */
    @ReflectiveMethod(name = "j", types = {})
    public NMSIChatBaseComponent j(){
        return (NMSIChatBaseComponent) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.NetworkManager#k()
     */
    @ReflectiveMethod(name = "k", types = {})
    public void k(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.NetworkManager#l()
     */
    @ReflectiveMethod(name = "l", types = {})
    public void l(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}