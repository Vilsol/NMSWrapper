package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSItemStack;
import me.vilsol.nmswrapper.wraps.NMSNBTTagCompound;
import me.vilsol.nmswrapper.wraps.NMSWrap;
import org.bukkit.Location;

import java.util.UUID;

@ReflectiveClass(name = "Entity")
public class NMSEntity extends NMSWrap implements NMSICommandListener {

    public NMSEntity(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntity(NMSWorld world){
        super("Entity", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    public NMSEntity(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Entity#K()
     */
    @ReflectiveMethod(name = "K", types = {})
    public void K(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Entity#P()
     */
    @ReflectiveMethod(name = "P", types = {})
    public String P(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Entity#U()
     */
    @ReflectiveMethod(name = "U", types = {})
    public boolean U(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Entity#V()
     */
    @ReflectiveMethod(name = "V", types = {})
    public boolean V(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Entity#Y()
     */
    @ReflectiveMethod(name = "Y", types = {})
    public void Y(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Entity#a(net.minecraft.server.v1_9_R1.EntityLiving, net.minecraft.server.v1_9_R1.Entity)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityLiving.class, NMSEntity.class})
    public void a(NMSEntityLiving entityLiving, NMSEntity entity){
        NMSWrapper.getInstance().exec(nmsObject, entityLiving, entity);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Entity#aA()
     */
    @ReflectiveMethod(name = "aA", types = {})
    public void aA(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Entity#aE()
     */
    @ReflectiveMethod(name = "aE", types = {})
    public int aE(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Entity#aG()
     */
    @ReflectiveMethod(name = "aG", types = {})
    public NMSVec3D aG(){
        return new NMSVec3D(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Entity#aQ()
     */
    @ReflectiveMethod(name = "aQ", types = {})
    public NMSChatHoverable aQ(){
        return new NMSChatHoverable(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Entity#aT()
     */
    @ReflectiveMethod(name = "aT", types = {})
    public boolean aT(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Entity#aW()
     */
    @ReflectiveMethod(name = "aW", types = {})
    public boolean aW(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Entity#aa()
     */
    @ReflectiveMethod(name = "aa", types = {})
    public String aa(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Entity#ab()
     */
    @ReflectiveMethod(name = "ab", types = {})
    public boolean ab(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Entity#ad()
     */
    @ReflectiveMethod(name = "ad", types = {})
    public boolean ad(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Entity#af()
     */
    @ReflectiveMethod(name = "af", types = {})
    public boolean af(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Entity#ah()
     */
    @ReflectiveMethod(name = "ah", types = {})
    public void ah(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Entity#ak()
     */
    @ReflectiveMethod(name = "ak", types = {})
    public void ak(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Entity#al()
     */
    @ReflectiveMethod(name = "al", types = {})
    public void al(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Entity#am()
     */
    @ReflectiveMethod(name = "am", types = {})
    public double am(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Entity#an()
     */
    @ReflectiveMethod(name = "an", types = {})
    public double an(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Entity#ao()
     */
    @ReflectiveMethod(name = "ao", types = {})
    public float ao(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#appendEntityCrashDetails(net.minecraft.server.v1_9_R1.CrashReportSystemDetails)
     */
    @ReflectiveMethod(name = "appendEntityCrashDetails", types = {NMSCrashReportSystemDetails.class})
    public void appendEntityCrashDetails(NMSCrashReportSystemDetails crashReportSystemDetails){
        NMSWrapper.getInstance().exec(nmsObject, crashReportSystemDetails);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#burn(float)
     */
    @ReflectiveMethod(name = "burn", types = {float.class})
    public void burn(float f){
        NMSWrapper.getInstance().exec(nmsObject, f);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#burnFromLava()
     */
    @ReflectiveMethod(name = "burnFromLava", types = {})
    public void burnFromLava(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Entity#c(int)
     */
    @ReflectiveMethod(name = "c", types = {int.class})
    public void c(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#checkBlockCollisions()
     */
    @ReflectiveMethod(name = "checkBlockCollisions", types = {})
    public void checkBlockCollisions(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#collide(net.minecraft.server.v1_9_R1.Entity)
     */
    @ReflectiveMethod(name = "collide", types = {NMSEntity.class})
    public void collide(NMSEntity entity){
        NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Entity#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public NMSVec3D d(){
        return new NMSVec3D(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#damageEntity(net.minecraft.server.v1_9_R1.DamageSource, float)
     */
    @ReflectiveMethod(name = "damageEntity", types = {NMSDamageSource.class, float.class})
    public boolean damageEntity(NMSDamageSource damageSource, float f){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, damageSource, f);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#die()
     */
    @ReflectiveMethod(name = "die", types = {})
    public void die(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#enderTeleportTo(double, double, double)
     */
    @ReflectiveMethod(name = "enderTeleportTo", types = {double.class, double.class, double.class})
    public void enderTeleportTo(double d, double d1, double d2){
        NMSWrapper.getInstance().exec(nmsObject, d, d1, d2);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#equals(java.lang.Object)
     */
    @ReflectiveMethod(name = "equals", types = {Object.class})
    public boolean equals(Object object){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#extinguish()
     */
    @ReflectiveMethod(name = "extinguish", types = {})
    public void extinguish(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Entity#f()
     */
    @ReflectiveMethod(name = "f", types = {})
    public NMSEntity f(){
        return new NMSEntity(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#getAirTicks()
     */
    @ReflectiveMethod(name = "getAirTicks", types = {})
    public int getAirTicks(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#getBoundingBox()
     */
    @ReflectiveMethod(name = "getBoundingBox", types = {})
    public NMSAxisAlignedBB getBoundingBox(){
        return new NMSAxisAlignedBB(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#getBukkitEntity()
     */
    @ReflectiveMethod(name = "getBukkitEntity", types = {})
    public NMSCraftEntity getBukkitEntity(){
        return new NMSCraftEntity(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#getChunkCoordinates()
     */
    @ReflectiveMethod(name = "getChunkCoordinates", types = {})
    public NMSBlockPosition getChunkCoordinates(){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#getCustomName()
     */
    @ReflectiveMethod(name = "getCustomName", types = {})
    public String getCustomName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#getCustomNameVisible()
     */
    @ReflectiveMethod(name = "getCustomNameVisible", types = {})
    public boolean getCustomNameVisible(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#getDataWatcher()
     */
    @ReflectiveMethod(name = "getDataWatcher", types = {})
    public NMSDataWatcher getDataWatcher(){
        return new NMSDataWatcher(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#getDirection()
     */
    @ReflectiveMethod(name = "getDirection", types = {})
    public NMSEnumDirection getDirection(){
        return new NMSEnumDirection(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#getHeadHeight()
     */
    @ReflectiveMethod(name = "getHeadHeight", types = {})
    public float getHeadHeight(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#getHeadRotation()
     */
    @ReflectiveMethod(name = "getHeadRotation", types = {})
    public float getHeadRotation(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#getId()
     */
    @ReflectiveMethod(name = "getId", types = {})
    public int getId(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#getNBTTag()
     */
    @ReflectiveMethod(name = "getNBTTag", types = {})
    public NMSNBTTagCompound getNBTTag(){
        return new NMSNBTTagCompound(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#getName()
     */
    @ReflectiveMethod(name = "getName", types = {})
    public String getName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#getScoreboardDisplayName()
     */
    @ReflectiveMethod(name = "getScoreboardDisplayName", types = {})
    public NMSIChatBaseComponent getScoreboardDisplayName(){
        return (NMSIChatBaseComponent) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#getSendCommandFeedback()
     */
    @ReflectiveMethod(name = "getSendCommandFeedback", types = {})
    public boolean getSendCommandFeedback(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#getUniqueID()
     */
    @ReflectiveMethod(name = "getUniqueID", types = {})
    public UUID getUniqueID(){
        return (UUID) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#getWorld()
     */
    @ReflectiveMethod(name = "getWorld", types = {})
    public NMSWorld getWorld(){
        return new NMSWorld(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Entity#h(boolean)
     */
    @ReflectiveMethod(name = "h", types = {boolean.class})
    public void h(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#hasCustomName()
     */
    @ReflectiveMethod(name = "hasCustomName", types = {})
    public boolean hasCustomName(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#hashCode()
     */
    @ReflectiveMethod(name = "hashCode", types = {})
    public int hashCode(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#inBlock()
     */
    @ReflectiveMethod(name = "inBlock", types = {})
    public boolean inBlock(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#inactiveTick()
     */
    @ReflectiveMethod(name = "inactiveTick", types = {})
    public void inactiveTick(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#isAlive()
     */
    @ReflectiveMethod(name = "isAlive", types = {})
    public boolean isAlive(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#isBurning()
     */
    @ReflectiveMethod(name = "isBurning", types = {})
    public boolean isBurning(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#isFireProof()
     */
    @ReflectiveMethod(name = "isFireProof", types = {})
    public boolean isFireProof(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#isInvisible()
     */
    @ReflectiveMethod(name = "isInvisible", types = {})
    public boolean isInvisible(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#isInvulnerable(net.minecraft.server.v1_9_R1.DamageSource)
     */
    @ReflectiveMethod(name = "isInvulnerable", types = {NMSDamageSource.class})
    public boolean isInvulnerable(NMSDamageSource damageSource){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, damageSource);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#isLevelAtLeast(net.minecraft.server.v1_9_R1.NBTTagCompound, int)
     */
    @ReflectiveMethod(name = "isLevelAtLeast", types = {NMSNBTTagCompound.class, int.class})
    public boolean isLevelAtLeast(NMSNBTTagCompound nBTTagCompound, int i){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound, i);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#isSneaking()
     */
    @ReflectiveMethod(name = "isSneaking", types = {})
    public boolean isSneaking(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#isSprinting()
     */
    @ReflectiveMethod(name = "isSprinting", types = {})
    public boolean isSprinting(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Entity#j(double, double, double)
     */
    @ReflectiveMethod(name = "j", types = {double.class, double.class, double.class})
    public boolean j(double d, double d1, double d2){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, d, d1, d2);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Entity#k(net.minecraft.server.v1_9_R1.Entity)
     */
    @ReflectiveMethod(name = "k", types = {NMSEntity.class})
    public boolean k(NMSEntity entity){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Entity#l(net.minecraft.server.v1_9_R1.Entity)
     */
    @ReflectiveMethod(name = "l", types = {NMSEntity.class})
    public boolean l(NMSEntity entity){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#move(double, double, double)
     */
    @ReflectiveMethod(name = "move", types = {double.class, double.class, double.class})
    public void move(double d, double d1, double d2){
        NMSWrapper.getInstance().exec(nmsObject, d, d1, d2);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Entity#n(net.minecraft.server.v1_9_R1.Entity)
     */
    @ReflectiveMethod(name = "n", types = {NMSEntity.class})
    public void n(NMSEntity entity){
        NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Entity#o(net.minecraft.server.v1_9_R1.Entity)
     */
    @ReflectiveMethod(name = "o", types = {NMSEntity.class})
    public void o(NMSEntity entity){
        NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#onLightningStrike(net.minecraft.server.v1_9_R1.EntityLightning)
     */
    @ReflectiveMethod(name = "onLightningStrike", types = {NMSEntityLightning.class})
    public void onLightningStrike(NMSEntityLightning entityLightning){
        NMSWrapper.getInstance().exec(nmsObject, entityLightning);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#sendMessage(net.minecraft.server.v1_9_R1.IChatBaseComponent)
     */
    @ReflectiveMethod(name = "sendMessage", types = {NMSIChatBaseComponent.class})
    public void sendMessage(NMSIChatBaseComponent iChatBaseComponent){
        NMSWrapper.getInstance().exec(nmsObject, iChatBaseComponent);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#setAirTicks(int)
     */
    @ReflectiveMethod(name = "setAirTicks", types = {int.class})
    public void setAirTicks(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#setCustomName(java.lang.String)
     */
    @ReflectiveMethod(name = "setCustomName", types = {String.class})
    public void setCustomName(String s){
        NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#setCustomNameVisible(boolean)
     */
    @ReflectiveMethod(name = "setCustomNameVisible", types = {boolean.class})
    public void setCustomNameVisible(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#setEquipment(int, net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "setEquipment", types = {int.class, NMSItemStack.class})
    public void setEquipment(int i, NMSItemStack itemStack){
        NMSWrapper.getInstance().exec(nmsObject, i, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#setInvisible(boolean)
     */
    @ReflectiveMethod(name = "setInvisible", types = {boolean.class})
    public void setInvisible(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#setLocation(double, double, double, float, float)
     */
    @ReflectiveMethod(name = "setLocation", types = {double.class, double.class, double.class, float.class, float.class})
    public void setLocation(double d, double d1, double d2, float f, float f1){
        NMSWrapper.getInstance().exec(nmsObject, d, d1, d2, f, f1);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#setOnFire(int)
     */
    @ReflectiveMethod(name = "setOnFire", types = {int.class})
    public void setOnFire(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#setPosition(double, double, double)
     */
    @ReflectiveMethod(name = "setPosition", types = {double.class, double.class, double.class})
    public void setPosition(double d, double d1, double d2){
        NMSWrapper.getInstance().exec(nmsObject, d, d1, d2);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#setPositionRotation(double, double, double, float, float)
     */
    @ReflectiveMethod(name = "setPositionRotation", types = {double.class, double.class, double.class, float.class, float.class})
    public void setPositionRotation(double d, double d1, double d2, float f, float f1){
        NMSWrapper.getInstance().exec(nmsObject, d, d1, d2, f, f1);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#setSize(float, float)
     */
    @ReflectiveMethod(name = "setSize", types = {float.class, float.class})
    public void setSize(float f, float f1){
        NMSWrapper.getInstance().exec(nmsObject, f, f1);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#setSneaking(boolean)
     */
    @ReflectiveMethod(name = "setSneaking", types = {boolean.class})
    public void setSneaking(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#setSprinting(boolean)
     */
    @ReflectiveMethod(name = "setSprinting", types = {boolean.class})
    public void setSprinting(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#setYawPitch(float, float)
     */
    @ReflectiveMethod(name = "setYawPitch", types = {float.class, float.class})
    public void setYawPitch(float f, float f1){
        NMSWrapper.getInstance().exec(nmsObject, f, f1);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#spawnIn(net.minecraft.server.v1_9_R1.World)
     */
    @ReflectiveMethod(name = "spawnIn", types = {NMSWorld.class})
    public void spawnIn(NMSWorld world){
        NMSWrapper.getInstance().exec(nmsObject, world);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#teleportTo(org.bukkit.Location, boolean)
     */
    @ReflectiveMethod(name = "teleportTo", types = {Location.class, boolean.class})
    public void teleportTo(Location location, boolean b){
        NMSWrapper.getInstance().exec(nmsObject, location, b);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Entity#toString()
     */
    @ReflectiveMethod(name = "toString", types = {})
    public String toString(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}