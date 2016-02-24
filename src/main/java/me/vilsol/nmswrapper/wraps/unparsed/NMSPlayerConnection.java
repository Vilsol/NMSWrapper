package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSMinecraftServer;
import me.vilsol.nmswrapper.wraps.NMSWrap;
import org.bukkit.Location;

import java.util.Set;

@ReflectiveClass(name = "PlayerConnection")
public class NMSPlayerConnection extends NMSWrap implements NMSIUpdatePlayerListBox {

    public NMSPlayerConnection(Object nmsObject){
        super(nmsObject);
    }

    public NMSPlayerConnection(NMSMinecraftServer minecraftServer, NMSNetworkManager networkManager, NMSEntityPlayer entityPlayer){
        super("PlayerConnection", new Object[]{NMSMinecraftServer.class, NMSNetworkManager.class, NMSEntityPlayer.class}, new Object[]{minecraftServer, networkManager, entityPlayer});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PlayerConnection#a(net.minecraft.server.v1_8_R3.PacketPlayInCustomPayload)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketPlayInCustomPayload.class})
    public void a(NMSPacketPlayInCustomPayload packetPlayInCustomPayload){
        NMSWrapper.getInstance().exec(nmsObject, packetPlayInCustomPayload);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PlayerConnection#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public void c(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerConnection#chat(java.lang.String, boolean)
     */
    @ReflectiveMethod(name = "chat", types = {String.class, boolean.class})
    public void chat(String s, boolean b){
        NMSWrapper.getInstance().exec(nmsObject, s, b);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerConnection#disconnect(java.lang.String)
     */
    @ReflectiveMethod(name = "disconnect", types = {String.class})
    public void disconnect(String s){
        NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerConnection#getPlayer()
     */
    @ReflectiveMethod(name = "getPlayer", types = {})
    public NMSCraftPlayer getPlayer(){
        return new NMSCraftPlayer(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerConnection#isDisconnected()
     */
    @ReflectiveMethod(name = "isDisconnected", types = {})
    public boolean isDisconnected(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerConnection#sendPacket(net.minecraft.server.v1_8_R3.Packet)
     */
    @ReflectiveMethod(name = "sendPacket", types = {NMSPacket.class})
    public void sendPacket(NMSPacket packet){
        NMSWrapper.getInstance().exec(nmsObject, packet);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerConnection#teleport(org.bukkit.Location, java.util.Set)
     */
    @ReflectiveMethod(name = "teleport", types = {Location.class, Set.class})
    public void teleport(Location location, Set set){
        NMSWrapper.getInstance().exec(nmsObject, location, set);
    }

}