package me.vilsol.nmswrapper.wraps.unparsed;

import com.mojang.authlib.GameProfile;
import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSItemStack;
import me.vilsol.nmswrapper.wraps.NMSWorld;
import org.bukkit.WeatherType;

@ReflectiveClass(name = "EntityPlayer")
public class NMSEntityPlayer extends NMSEntityHuman implements NMSICrafting {

    public NMSEntityPlayer(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityPlayer(NMSMinecraftServer minecraftServer, NMSWorldServer worldServer, GameProfile gameProfile, NMSPlayerInteractManager playerInteractManager){
        super("EntityPlayer", new Object[]{NMSMinecraftServer.class, NMSWorldServer.class, GameProfile.class, NMSPlayerInteractManager.class}, new Object[]{minecraftServer, worldServer, gameProfile, playerInteractManager});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#B()
     */
    @ReflectiveMethod(name = "B", types = {})
    public void B(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#C()
     */
    @ReflectiveMethod(name = "C", types = {})
    public NMSEntity C(){
        return new NMSEntity(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#D()
     */
    @ReflectiveMethod(name = "D", types = {})
    public long D(){
        return (long) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#ad()
     */
    @ReflectiveMethod(name = "ad", types = {})
    public boolean ad(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#ae()
     */
    @ReflectiveMethod(name = "ae", types = {})
    public boolean ae(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#attack(net.minecraft.server.v1_9_R1.Entity)
     */
    @ReflectiveMethod(name = "attack", types = {NMSEntity.class})
    public void attack(NMSEntity entity){
        NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#b(net.minecraft.server.v1_9_R1.Entity)
     */
    @ReflectiveMethod(name = "b", types = {NMSEntity.class})
    public void b(NMSEntity entity){
        NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#broadcastCarriedItem()
     */
    @ReflectiveMethod(name = "broadcastCarriedItem", types = {})
    public void broadcastCarriedItem(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#c(net.minecraft.server.v1_9_R1.Entity)
     */
    @ReflectiveMethod(name = "c", types = {NMSEntity.class})
    public void c(NMSEntity entity){
        NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#closeInventory()
     */
    @ReflectiveMethod(name = "closeInventory", types = {})
    public void closeInventory(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#copyTo(net.minecraft.server.v1_9_R1.EntityHuman, boolean)
     */
    @ReflectiveMethod(name = "copyTo", types = {NMSEntityHuman.class, boolean.class})
    public void copyTo(NMSEntityHuman entityHuman, boolean b){
        NMSWrapper.getInstance().exec(nmsObject, entityHuman, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#d(net.minecraft.server.v1_9_R1.Entity)
     */
    @ReflectiveMethod(name = "d", types = {NMSEntity.class})
    public void d(NMSEntity entity){
        NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#damageEntity(net.minecraft.server.v1_9_R1.DamageSource, float)
     */
    @ReflectiveMethod(name = "damageEntity", types = {NMSDamageSource.class, float.class})
    public boolean damageEntity(NMSDamageSource damageSource, float f){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, damageSource, f);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#die(net.minecraft.server.v1_9_R1.DamageSource)
     */
    @ReflectiveMethod(name = "die", types = {NMSDamageSource.class})
    public void die(NMSDamageSource damageSource){
        NMSWrapper.getInstance().exec(nmsObject, damageSource);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#enderTeleportTo(double, double, double)
     */
    @ReflectiveMethod(name = "enderTeleportTo", types = {double.class, double.class, double.class})
    public void enderTeleportTo(double d, double d1, double d2){
        NMSWrapper.getInstance().exec(nmsObject, d, d1, d2);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#enterCombat()
     */
    @ReflectiveMethod(name = "enterCombat", types = {})
    public void enterCombat(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#exitCombat()
     */
    @ReflectiveMethod(name = "exitCombat", types = {})
    public void exitCombat(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#getChatFlags()
     */
    @ReflectiveMethod(name = "getChatFlags", types = {})
    public NMSEnumChatVisibility getChatFlags(){
        return new NMSEnumChatVisibility(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#getChunkCoordinates()
     */
    @ReflectiveMethod(name = "getChunkCoordinates", types = {})
    public NMSBlockPosition getChunkCoordinates(){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#getPlayerListName()
     */
    @ReflectiveMethod(name = "getPlayerListName", types = {})
    public NMSIChatBaseComponent getPlayerListName(){
        return (NMSIChatBaseComponent) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#getPlayerTime()
     */
    @ReflectiveMethod(name = "getPlayerTime", types = {})
    public long getPlayerTime(){
        return (long) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#getPlayerWeather()
     */
    @ReflectiveMethod(name = "getPlayerWeather", types = {})
    public WeatherType getPlayerWeather(){
        return (WeatherType) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#getStatisticManager()
     */
    @ReflectiveMethod(name = "getStatisticManager", types = {})
    public NMSServerStatisticManager getStatisticManager(){
        return new NMSServerStatisticManager(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#i_()
     */
    @ReflectiveMethod(name = "i_", types = {})
    public void i_(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#isSpectator()
     */
    @ReflectiveMethod(name = "isSpectator", types = {})
    public boolean isSpectator(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#l()
     */
    @ReflectiveMethod(name = "l", types = {})
    public void l(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#levelDown(int)
     */
    @ReflectiveMethod(name = "levelDown", types = {int.class})
    public void levelDown(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#mount(net.minecraft.server.v1_9_R1.Entity)
     */
    @ReflectiveMethod(name = "mount", types = {NMSEntity.class})
    public void mount(NMSEntity entity){
        NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#nextContainerCounter()
     */
    @ReflectiveMethod(name = "nextContainerCounter", types = {})
    public int nextContainerCounter(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#openBook(net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "openBook", types = {NMSItemStack.class})
    public void openBook(NMSItemStack itemStack){
        NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#openContainer(net.minecraft.server.v1_9_R1.IInventory)
     */
    @ReflectiveMethod(name = "openContainer", types = {NMSIInventory.class})
    public void openContainer(NMSIInventory iInventory){
        NMSWrapper.getInstance().exec(nmsObject, iInventory);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#openHorseInventory(net.minecraft.server.v1_9_R1.EntityHorse, net.minecraft.server.v1_9_R1.IInventory)
     */
    @ReflectiveMethod(name = "openHorseInventory", types = {NMSEntityHorse.class, NMSIInventory.class})
    public void openHorseInventory(NMSEntityHorse entityHorse, NMSIInventory iInventory){
        NMSWrapper.getInstance().exec(nmsObject, entityHorse, iInventory);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#openSign(net.minecraft.server.v1_9_R1.TileEntitySign)
     */
    @ReflectiveMethod(name = "openSign", types = {NMSTileEntitySign.class})
    public void openSign(NMSTileEntitySign tileEntitySign){
        NMSWrapper.getInstance().exec(nmsObject, tileEntitySign);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#openTileEntity(net.minecraft.server.v1_9_R1.ITileEntityContainer)
     */
    @ReflectiveMethod(name = "openTileEntity", types = {NMSITileEntityContainer.class})
    public void openTileEntity(NMSITileEntityContainer iTileEntityContainer){
        NMSWrapper.getInstance().exec(nmsObject, iTileEntityContainer);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#openTrade(net.minecraft.server.v1_9_R1.IMerchant)
     */
    @ReflectiveMethod(name = "openTrade", types = {NMSIMerchant.class})
    public void openTrade(NMSIMerchant iMerchant){
        NMSWrapper.getInstance().exec(nmsObject, iMerchant);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#p()
     */
    @ReflectiveMethod(name = "p", types = {})
    public void p(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#q()
     */
    @ReflectiveMethod(name = "q", types = {})
    public void q(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#receive(net.minecraft.server.v1_9_R1.Entity, int)
     */
    @ReflectiveMethod(name = "receive", types = {NMSEntity.class, int.class})
    public void receive(NMSEntity entity, int i){
        NMSWrapper.getInstance().exec(nmsObject, entity, i);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#reset()
     */
    @ReflectiveMethod(name = "reset", types = {})
    public void reset(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#resetIdleTimer()
     */
    @ReflectiveMethod(name = "resetIdleTimer", types = {})
    public void resetIdleTimer(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#resetPlayerWeather()
     */
    @ReflectiveMethod(name = "resetPlayerWeather", types = {})
    public void resetPlayerWeather(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#s()
     */
    @ReflectiveMethod(name = "s", types = {})
    public void s(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#sendMessage(net.minecraft.server.v1_9_R1.IChatBaseComponent)
     */
    @ReflectiveMethod(name = "sendMessage", types = {NMSIChatBaseComponent.class})
    public void sendMessage(NMSIChatBaseComponent iChatBaseComponent){
        NMSWrapper.getInstance().exec(nmsObject, iChatBaseComponent);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#setContainerData(net.minecraft.server.v1_9_R1.Container, net.minecraft.server.v1_9_R1.IInventory)
     */
    @ReflectiveMethod(name = "setContainerData", types = {NMSContainer.class, NMSIInventory.class})
    public void setContainerData(NMSContainer container, NMSIInventory iInventory){
        NMSWrapper.getInstance().exec(nmsObject, container, iInventory);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#setPlayerWeather(org.bukkit.WeatherType, boolean)
     */
    @ReflectiveMethod(name = "setPlayerWeather", types = {WeatherType.class, boolean.class})
    public void setPlayerWeather(WeatherType weatherType, boolean b){
        NMSWrapper.getInstance().exec(nmsObject, weatherType, b);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#setResourcePack(java.lang.String, java.lang.String)
     */
    @ReflectiveMethod(name = "setResourcePack", types = {String.class, String.class})
    public void setResourcePack(String s, String s1){
        NMSWrapper.getInstance().exec(nmsObject, s, s1);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#setSpectatorTarget(net.minecraft.server.v1_9_R1.Entity)
     */
    @ReflectiveMethod(name = "setSpectatorTarget", types = {NMSEntity.class})
    public void setSpectatorTarget(NMSEntity entity){
        NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#spawnIn(net.minecraft.server.v1_9_R1.World)
     */
    @ReflectiveMethod(name = "spawnIn", types = {NMSWorld.class})
    public void spawnIn(NMSWorld world){
        NMSWrapper.getInstance().exec(nmsObject, world);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#syncInventory()
     */
    @ReflectiveMethod(name = "syncInventory", types = {})
    public void syncInventory(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#t_()
     */
    @ReflectiveMethod(name = "t_", types = {})
    public void t_(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#tickWeather()
     */
    @ReflectiveMethod(name = "tickWeather", types = {})
    public void tickWeather(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#toString()
     */
    @ReflectiveMethod(name = "toString", types = {})
    public String toString(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#triggerHealthUpdate()
     */
    @ReflectiveMethod(name = "triggerHealthUpdate", types = {})
    public void triggerHealthUpdate(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#u()
     */
    @ReflectiveMethod(name = "u", types = {})
    public NMSWorldServer u(){
        return new NMSWorldServer(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#updateAbilities()
     */
    @ReflectiveMethod(name = "updateAbilities", types = {})
    public void updateAbilities(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#updateInventory(net.minecraft.server.v1_9_R1.Container)
     */
    @ReflectiveMethod(name = "updateInventory", types = {NMSContainer.class})
    public void updateInventory(NMSContainer container){
        NMSWrapper.getInstance().exec(nmsObject, container);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#updateWeather(float, float, float, float)
     */
    @ReflectiveMethod(name = "updateWeather", types = {float.class, float.class, float.class, float.class})
    public void updateWeather(float f, float f1, float f2, float f3){
        NMSWrapper.getInstance().exec(nmsObject, f, f1, f2, f3);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityPlayer#w()
     */
    @ReflectiveMethod(name = "w", types = {})
    public String w(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}