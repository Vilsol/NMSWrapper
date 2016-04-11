package me.vilsol.nmswrapper.wraps.unparsed;

import com.mojang.authlib.GameProfile;
import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSNBTTagCompound;
import me.vilsol.nmswrapper.wraps.NMSWrap;
import org.bukkit.Location;
import org.bukkit.event.player.PlayerTeleportEvent;

import java.util.UUID;

@ReflectiveClass(name = "PlayerList")
public class NMSPlayerList extends NMSWrap {

    public NMSPlayerList(Object nmsObject){
        super(nmsObject);
    }

    public NMSPlayerList(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    public NMSPlayerList(NMSMinecraftServer minecraftServer){
        super("PlayerList", new Object[]{NMSMinecraftServer.class}, new Object[]{minecraftServer});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PlayerList#a(java.util.UUID)
     */
    @ReflectiveMethod(name = "a", types = {UUID.class})
    public NMSEntityPlayer a(UUID uUID){
        return new NMSEntityPlayer(NMSWrapper.getInstance().exec(nmsObject, uUID));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.PlayerList#addOp(com.mojang.authlib.GameProfile)
     */
    @ReflectiveMethod(name = "addOp", types = {GameProfile.class})
    public void addOp(GameProfile gameProfile){
        NMSWrapper.getInstance().exec(nmsObject, gameProfile);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.PlayerList#addWhitelist(com.mojang.authlib.GameProfile)
     */
    @ReflectiveMethod(name = "addWhitelist", types = {GameProfile.class})
    public void addWhitelist(GameProfile gameProfile){
        NMSWrapper.getInstance().exec(nmsObject, gameProfile);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.PlayerList#attemptLogin(net.minecraft.server.v1_9_R1.LoginListener, com.mojang.authlib.GameProfile, java.lang.String)
     */
    @ReflectiveMethod(name = "attemptLogin", types = {NMSLoginListener.class, GameProfile.class, String.class})
    public NMSEntityPlayer attemptLogin(NMSLoginListener loginListener, GameProfile gameProfile, String s){
        return new NMSEntityPlayer(NMSWrapper.getInstance().exec(nmsObject, loginListener, gameProfile, s));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PlayerList#b(net.minecraft.server.v1_9_R1.EntityPlayer, net.minecraft.server.v1_9_R1.WorldServer)
     */
    @ReflectiveMethod(name = "b", types = {NMSEntityPlayer.class, NMSWorldServer.class})
    public void b(NMSEntityPlayer entityPlayer, NMSWorldServer worldServer){
        NMSWrapper.getInstance().exec(nmsObject, entityPlayer, worldServer);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.PlayerList#calculateTarget(org.bukkit.Location, net.minecraft.server.v1_9_R1.World)
     */
    @ReflectiveMethod(name = "calculateTarget", types = {Location.class, NMSWorld.class})
    public Location calculateTarget(Location location, NMSWorld world){
        return (Location) NMSWrapper.getInstance().exec(nmsObject, location, world);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.PlayerList#changeDimension(net.minecraft.server.v1_9_R1.EntityPlayer, int, org.bukkit.event.player.PlayerTeleportEvent$TeleportCause)
     */
    @ReflectiveMethod(name = "changeDimension", types = {NMSEntityPlayer.class, int.class, PlayerTeleportEvent.TeleportCause.class})
    public void changeDimension(NMSEntityPlayer entityPlayer, int i, PlayerTeleportEvent.TeleportCause teleportCause){
        NMSWrapper.getInstance().exec(nmsObject, entityPlayer, i, teleportCause);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.PlayerList#changeWorld(net.minecraft.server.v1_9_R1.Entity, int, net.minecraft.server.v1_9_R1.WorldServer, net.minecraft.server.v1_9_R1.WorldServer)
     */
    @ReflectiveMethod(name = "changeWorld", types = {NMSEntity.class, int.class, NMSWorldServer.class, NMSWorldServer.class})
    public void changeWorld(NMSEntity entity, int i, NMSWorldServer worldServer, NMSWorldServer worldServer1){
        NMSWrapper.getInstance().exec(nmsObject, entity, i, worldServer, worldServer1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PlayerList#d(net.minecraft.server.v1_9_R1.EntityPlayer)
     */
    @ReflectiveMethod(name = "d", types = {NMSEntityPlayer.class})
    public void d(NMSEntityPlayer entityPlayer){
        NMSWrapper.getInstance().exec(nmsObject, entityPlayer);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.PlayerList#disconnect(net.minecraft.server.v1_9_R1.EntityPlayer)
     */
    @ReflectiveMethod(name = "disconnect", types = {NMSEntityPlayer.class})
    public String disconnect(NMSEntityPlayer entityPlayer){
        return (String) NMSWrapper.getInstance().exec(nmsObject, entityPlayer);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PlayerList#f(com.mojang.authlib.GameProfile)
     */
    @ReflectiveMethod(name = "f", types = {GameProfile.class})
    public boolean f(GameProfile gameProfile){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, gameProfile);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.PlayerList#getHasWhitelist()
     */
    @ReflectiveMethod(name = "getHasWhitelist", types = {})
    public boolean getHasWhitelist(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.PlayerList#getIPBans()
     */
    @ReflectiveMethod(name = "getIPBans", types = {})
    public NMSIpBanList getIPBans(){
        return new NMSIpBanList(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.PlayerList#getMaxPlayers()
     */
    @ReflectiveMethod(name = "getMaxPlayers", types = {})
    public int getMaxPlayers(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.PlayerList#getOPs()
     */
    @ReflectiveMethod(name = "getOPs", types = {})
    public NMSOpList getOPs(){
        return new NMSOpList(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.PlayerList#getPlayer(java.lang.String)
     */
    @ReflectiveMethod(name = "getPlayer", types = {String.class})
    public NMSEntityPlayer getPlayer(String s){
        return new NMSEntityPlayer(NMSWrapper.getInstance().exec(nmsObject, s));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.PlayerList#getPlayerCount()
     */
    @ReflectiveMethod(name = "getPlayerCount", types = {})
    public int getPlayerCount(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.PlayerList#getProfileBans()
     */
    @ReflectiveMethod(name = "getProfileBans", types = {})
    public NMSGameProfileBanList getProfileBans(){
        return new NMSGameProfileBanList(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.PlayerList#getServer()
     */
    @ReflectiveMethod(name = "getServer", types = {})
    public NMSMinecraftServer getServer(){
        return new NMSMinecraftServer(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.PlayerList#getWhitelist()
     */
    @ReflectiveMethod(name = "getWhitelist", types = {})
    public NMSWhiteList getWhitelist(){
        return new NMSWhiteList(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.PlayerList#isOp(com.mojang.authlib.GameProfile)
     */
    @ReflectiveMethod(name = "isOp", types = {GameProfile.class})
    public boolean isOp(GameProfile gameProfile){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, gameProfile);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.PlayerList#isWhitelisted(com.mojang.authlib.GameProfile)
     */
    @ReflectiveMethod(name = "isWhitelisted", types = {GameProfile.class})
    public boolean isWhitelisted(GameProfile gameProfile){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, gameProfile);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.PlayerList#moveToWorld(net.minecraft.server.v1_9_R1.EntityPlayer, int, boolean, org.bukkit.Location, boolean)
     */
    @ReflectiveMethod(name = "moveToWorld", types = {NMSEntityPlayer.class, int.class, boolean.class, Location.class, boolean.class})
    public NMSEntityPlayer moveToWorld(NMSEntityPlayer entityPlayer, int i, boolean b, Location location, boolean b1){
        return new NMSEntityPlayer(NMSWrapper.getInstance().exec(nmsObject, entityPlayer, i, b, location, b1));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.PlayerList#onPlayerJoin(net.minecraft.server.v1_9_R1.EntityPlayer, java.lang.String)
     */
    @ReflectiveMethod(name = "onPlayerJoin", types = {NMSEntityPlayer.class, String.class})
    public void onPlayerJoin(NMSEntityPlayer entityPlayer, String s){
        NMSWrapper.getInstance().exec(nmsObject, entityPlayer, s);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.PlayerList#processLogin(com.mojang.authlib.GameProfile, net.minecraft.server.v1_9_R1.EntityPlayer)
     */
    @ReflectiveMethod(name = "processLogin", types = {GameProfile.class, NMSEntityPlayer.class})
    public NMSEntityPlayer processLogin(GameProfile gameProfile, NMSEntityPlayer entityPlayer){
        return new NMSEntityPlayer(NMSWrapper.getInstance().exec(nmsObject, gameProfile, entityPlayer));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.PlayerList#reloadWhitelist()
     */
    @ReflectiveMethod(name = "reloadWhitelist", types = {})
    public void reloadWhitelist(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.PlayerList#removeOp(com.mojang.authlib.GameProfile)
     */
    @ReflectiveMethod(name = "removeOp", types = {GameProfile.class})
    public void removeOp(GameProfile gameProfile){
        NMSWrapper.getInstance().exec(nmsObject, gameProfile);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.PlayerList#removeWhitelist(com.mojang.authlib.GameProfile)
     */
    @ReflectiveMethod(name = "removeWhitelist", types = {GameProfile.class})
    public void removeWhitelist(GameProfile gameProfile){
        NMSWrapper.getInstance().exec(nmsObject, gameProfile);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.PlayerList#repositionEntity(net.minecraft.server.v1_9_R1.Entity, org.bukkit.Location, boolean)
     */
    @ReflectiveMethod(name = "repositionEntity", types = {NMSEntity.class, Location.class, boolean.class})
    public void repositionEntity(NMSEntity entity, Location location, boolean b){
        NMSWrapper.getInstance().exec(nmsObject, entity, location, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PlayerList#s()
     */
    @ReflectiveMethod(name = "s", types = {})
    public int s(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.PlayerList#savePlayerFile(net.minecraft.server.v1_9_R1.EntityPlayer)
     */
    @ReflectiveMethod(name = "savePlayerFile", types = {NMSEntityPlayer.class})
    public void savePlayerFile(NMSEntityPlayer entityPlayer){
        NMSWrapper.getInstance().exec(nmsObject, entityPlayer);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.PlayerList#savePlayers()
     */
    @ReflectiveMethod(name = "savePlayers", types = {})
    public void savePlayers(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.PlayerList#sendAll(net.minecraft.server.v1_9_R1.Packet, net.minecraft.server.v1_9_R1.World)
     */
    @ReflectiveMethod(name = "sendAll", types = {NMSPacket.class, NMSWorld.class})
    public void sendAll(NMSPacket packet, NMSWorld world){
        NMSWrapper.getInstance().exec(nmsObject, packet, world);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.PlayerList#sendMessage(net.minecraft.server.v1_9_R1.IChatBaseComponent)
     */
    @ReflectiveMethod(name = "sendMessage", types = {NMSIChatBaseComponent.class})
    public void sendMessage(NMSIChatBaseComponent iChatBaseComponent){
        NMSWrapper.getInstance().exec(nmsObject, iChatBaseComponent);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.PlayerList#sendPacketNearby(net.minecraft.server.v1_9_R1.EntityHuman, double, double, double, double, int, net.minecraft.server.v1_9_R1.Packet)
     */
    @ReflectiveMethod(name = "sendPacketNearby", types = {NMSEntityHuman.class, double.class, double.class, double.class, double.class, int.class, NMSPacket.class})
    public void sendPacketNearby(NMSEntityHuman entityHuman, double d, double d1, double d2, double d3, int i, NMSPacket packet){
        NMSWrapper.getInstance().exec(nmsObject, entityHuman, d, d1, d2, d3, i, packet);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.PlayerList#sendScoreboard(net.minecraft.server.v1_9_R1.ScoreboardServer, net.minecraft.server.v1_9_R1.EntityPlayer)
     */
    @ReflectiveMethod(name = "sendScoreboard", types = {NMSScoreboardServer.class, NMSEntityPlayer.class})
    public void sendScoreboard(NMSScoreboardServer scoreboardServer, NMSEntityPlayer entityPlayer){
        NMSWrapper.getInstance().exec(nmsObject, scoreboardServer, entityPlayer);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.PlayerList#setHasWhitelist(boolean)
     */
    @ReflectiveMethod(name = "setHasWhitelist", types = {boolean.class})
    public void setHasWhitelist(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PlayerList#t()
     */
    @ReflectiveMethod(name = "t", types = {})
    public NMSNBTTagCompound t(){
        return new NMSNBTTagCompound(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.PlayerList#tick()
     */
    @ReflectiveMethod(name = "tick", types = {})
    public void tick(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PlayerList#u()
     */
    @ReflectiveMethod(name = "u", types = {})
    public void u(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.PlayerList#updateClient(net.minecraft.server.v1_9_R1.EntityPlayer)
     */
    @ReflectiveMethod(name = "updateClient", types = {NMSEntityPlayer.class})
    public void updateClient(NMSEntityPlayer entityPlayer){
        NMSWrapper.getInstance().exec(nmsObject, entityPlayer);
    }

}