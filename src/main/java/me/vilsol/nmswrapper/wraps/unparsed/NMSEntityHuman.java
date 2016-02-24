package me.vilsol.nmswrapper.wraps.unparsed;

import com.mojang.authlib.GameProfile;
import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSItemStack;

import java.util.UUID;

@ReflectiveClass(name = "EntityHuman")
public class NMSEntityHuman extends NMSEntityLiving {

    public NMSEntityHuman(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityHuman(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    public NMSEntityHuman(NMSWorld world, GameProfile gameProfile){
        super("EntityHuman", new Object[]{NMSWorld.class, GameProfile.class}, new Object[]{world, gameProfile});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#L()
     */
    @ReflectiveMethod(name = "L", types = {})
    public int L(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#P()
     */
    @ReflectiveMethod(name = "P", types = {})
    public String P(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#X()
     */
    @ReflectiveMethod(name = "X", types = {})
    public void X(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#a(net.minecraft.server.v1_8_R3.ChestLock)
     */
    @ReflectiveMethod(name = "a", types = {NMSChestLock.class})
    public boolean a(NMSChestLock chestLock){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, chestLock);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#aA()
     */
    @ReflectiveMethod(name = "aA", types = {})
    public void aA(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#aL()
     */
    @ReflectiveMethod(name = "aL", types = {})
    public boolean aL(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#aa()
     */
    @ReflectiveMethod(name = "aa", types = {})
    public String aa(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#addScore(int)
     */
    @ReflectiveMethod(name = "addScore", types = {int.class})
    public void addScore(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#ak()
     */
    @ReflectiveMethod(name = "ak", types = {})
    public void ak(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#alwaysGivesExp()
     */
    @ReflectiveMethod(name = "alwaysGivesExp", types = {})
    public boolean alwaysGivesExp(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#am()
     */
    @ReflectiveMethod(name = "am", types = {})
    public double am(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#applyExhaustion(float)
     */
    @ReflectiveMethod(name = "applyExhaustion", types = {float.class})
    public void applyExhaustion(float f){
        NMSWrapper.getInstance().exec(nmsObject, f);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#aq()
     */
    @ReflectiveMethod(name = "aq", types = {})
    public int aq(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#attack(net.minecraft.server.v1_8_R3.Entity)
     */
    @ReflectiveMethod(name = "attack", types = {NMSEntity.class})
    public void attack(NMSEntity entity){
        NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#b(java.lang.String)
     */
    @ReflectiveMethod(name = "b", types = {String.class})
    public UUID b(String s){
        return (UUID) NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#bA()
     */
    @ReflectiveMethod(name = "bA", types = {})
    public NMSItemStack bA(){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#bD()
     */
    @ReflectiveMethod(name = "bD", types = {})
    public boolean bD(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#bF()
     */
    @ReflectiveMethod(name = "bF", types = {})
    public void bF(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#bI()
     */
    @ReflectiveMethod(name = "bI", types = {})
    public float bI(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#bS()
     */
    @ReflectiveMethod(name = "bS", types = {})
    public boolean bS(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#bU()
     */
    @ReflectiveMethod(name = "bU", types = {})
    public void bU(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#bV()
     */
    @ReflectiveMethod(name = "bV", types = {})
    public void bV(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#bY()
     */
    @ReflectiveMethod(name = "bY", types = {})
    public float bY(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#bZ()
     */
    @ReflectiveMethod(name = "bZ", types = {})
    public NMSItemStack bZ(){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#bo()
     */
    @ReflectiveMethod(name = "bo", types = {})
    public String bo(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#bp()
     */
    @ReflectiveMethod(name = "bp", types = {})
    public String bp(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#br()
     */
    @ReflectiveMethod(name = "br", types = {})
    public int br(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#c(net.minecraft.server.v1_8_R3.Entity)
     */
    @ReflectiveMethod(name = "c", types = {NMSEntity.class})
    public void c(NMSEntity entity){
        NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#ca()
     */
    @ReflectiveMethod(name = "ca", types = {})
    public void ca(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#checkMovement(double, double, double)
     */
    @ReflectiveMethod(name = "checkMovement", types = {double.class, double.class, double.class})
    public void checkMovement(double d, double d1, double d2){
        NMSWrapper.getInstance().exec(nmsObject, d, d1, d2);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#cj()
     */
    @ReflectiveMethod(name = "cj", types = {})
    public int cj(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#closeInventory()
     */
    @ReflectiveMethod(name = "closeInventory", types = {})
    public void closeInventory(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#cm()
     */
    @ReflectiveMethod(name = "cm", types = {})
    public boolean cm(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#cn()
     */
    @ReflectiveMethod(name = "cn", types = {})
    public boolean cn(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#copyTo(net.minecraft.server.v1_8_R3.EntityHuman, boolean)
     */
    @ReflectiveMethod(name = "copyTo", types = {NMSEntityHuman.class, boolean.class})
    public void copyTo(NMSEntityHuman entityHuman, boolean b){
        NMSWrapper.getInstance().exec(nmsObject, entityHuman, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#d(int, net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "d", types = {int.class, NMSItemStack.class})
    public boolean d(int i, NMSItemStack itemStack){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#damageArmor(float)
     */
    @ReflectiveMethod(name = "damageArmor", types = {float.class})
    public void damageArmor(float f){
        NMSWrapper.getInstance().exec(nmsObject, f);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#damageEntity(net.minecraft.server.v1_8_R3.DamageSource, float)
     */
    @ReflectiveMethod(name = "damageEntity", types = {NMSDamageSource.class, float.class})
    public boolean damageEntity(NMSDamageSource damageSource, float f){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, damageSource, f);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#die()
     */
    @ReflectiveMethod(name = "die", types = {})
    public void die(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#doTick()
     */
    @ReflectiveMethod(name = "doTick", types = {})
    public void doTick(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#drop(net.minecraft.server.v1_8_R3.ItemStack, boolean)
     */
    @ReflectiveMethod(name = "drop", types = {NMSItemStack.class, boolean.class})
    public NMSEntityItem drop(NMSItemStack itemStack, boolean b){
        return new NMSEntityItem(NMSWrapper.getInstance().exec(nmsObject, itemStack, b));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#e(float, float)
     */
    @ReflectiveMethod(name = "e", types = {float.class, float.class})
    public void e(float f, float f1){
        NMSWrapper.getInstance().exec(nmsObject, f, f1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#g(float, float)
     */
    @ReflectiveMethod(name = "g", types = {float.class, float.class})
    public void g(float f, float f1){
        NMSWrapper.getInstance().exec(nmsObject, f, f1);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#getAbsorptionHearts()
     */
    @ReflectiveMethod(name = "getAbsorptionHearts", types = {})
    public float getAbsorptionHearts(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#getBed()
     */
    @ReflectiveMethod(name = "getBed", types = {})
    public NMSBlockPosition getBed(){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#getBukkitEntity()
     */
    @ReflectiveMethod(name = "getBukkitEntity", types = {})
    public NMSCraftEntity getBukkitEntity(){
        return new NMSCraftEntity(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#getEnderChest()
     */
    @ReflectiveMethod(name = "getEnderChest", types = {})
    public NMSInventoryEnderChest getEnderChest(){
        return new NMSInventoryEnderChest(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#getEquipment(int)
     */
    @ReflectiveMethod(name = "getEquipment", types = {int.class})
    public NMSItemStack getEquipment(int i){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#getExpToLevel()
     */
    @ReflectiveMethod(name = "getExpToLevel", types = {})
    public int getExpToLevel(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#getExpValue(net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "getExpValue", types = {NMSEntityHuman.class})
    public int getExpValue(NMSEntityHuman entityHuman){
        return (int) NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#getFoodData()
     */
    @ReflectiveMethod(name = "getFoodData", types = {})
    public NMSFoodMetaData getFoodData(){
        return new NMSFoodMetaData(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#getHeadHeight()
     */
    @ReflectiveMethod(name = "getHeadHeight", types = {})
    public float getHeadHeight(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#getName()
     */
    @ReflectiveMethod(name = "getName", types = {})
    public String getName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#getProfile()
     */
    @ReflectiveMethod(name = "getProfile", types = {})
    public GameProfile getProfile(){
        return (GameProfile) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#getScore()
     */
    @ReflectiveMethod(name = "getScore", types = {})
    public int getScore(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#getScoreboard()
     */
    @ReflectiveMethod(name = "getScoreboard", types = {})
    public NMSScoreboard getScoreboard(){
        return new NMSScoreboard(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#getScoreboardDisplayName()
     */
    @ReflectiveMethod(name = "getScoreboardDisplayName", types = {})
    public NMSIChatBaseComponent getScoreboardDisplayName(){
        return new NMSIChatBaseComponent(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#getScoreboardTeam()
     */
    @ReflectiveMethod(name = "getScoreboardTeam", types = {})
    public NMSScoreboardTeamBase getScoreboardTeam(){
        return new NMSScoreboardTeamBase(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#getSendCommandFeedback()
     */
    @ReflectiveMethod(name = "getSendCommandFeedback", types = {})
    public boolean getSendCommandFeedback(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#giveExp(int)
     */
    @ReflectiveMethod(name = "giveExp", types = {int.class})
    public void giveExp(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public void h(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#inBlock()
     */
    @ReflectiveMethod(name = "inBlock", types = {})
    public boolean inBlock(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#initAttributes()
     */
    @ReflectiveMethod(name = "initAttributes", types = {})
    public void initAttributes(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#isBlocking()
     */
    @ReflectiveMethod(name = "isBlocking", types = {})
    public boolean isBlocking(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#isDeeplySleeping()
     */
    @ReflectiveMethod(name = "isDeeplySleeping", types = {})
    public boolean isDeeplySleeping(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#isRespawnForced()
     */
    @ReflectiveMethod(name = "isRespawnForced", types = {})
    public boolean isRespawnForced(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#isSleeping()
     */
    @ReflectiveMethod(name = "isSleeping", types = {})
    public boolean isSleeping(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#isSpectator()
     */
    @ReflectiveMethod(name = "isSpectator", types = {})
    public boolean isSpectator(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#j(boolean)
     */
    @ReflectiveMethod(name = "j", types = {boolean.class})
    public boolean j(boolean b){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#levelDown(int)
     */
    @ReflectiveMethod(name = "levelDown", types = {int.class})
    public void levelDown(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#m()
     */
    @ReflectiveMethod(name = "m", types = {})
    public void m(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#makeSound(java.lang.String, float, float)
     */
    @ReflectiveMethod(name = "makeSound", types = {String.class, float.class, float.class})
    public void makeSound(String s, float f, float f1){
        NMSWrapper.getInstance().exec(nmsObject, s, f, f1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#n(int)
     */
    @ReflectiveMethod(name = "n", types = {int.class})
    public String n(int i){
        return (String) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#openBook(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "openBook", types = {NMSItemStack.class})
    public void openBook(NMSItemStack itemStack){
        NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#openContainer(net.minecraft.server.v1_8_R3.IInventory)
     */
    @ReflectiveMethod(name = "openContainer", types = {NMSIInventory.class})
    public void openContainer(NMSIInventory iInventory){
        NMSWrapper.getInstance().exec(nmsObject, iInventory);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#openHorseInventory(net.minecraft.server.v1_8_R3.EntityHorse, net.minecraft.server.v1_8_R3.IInventory)
     */
    @ReflectiveMethod(name = "openHorseInventory", types = {NMSEntityHorse.class, NMSIInventory.class})
    public void openHorseInventory(NMSEntityHorse entityHorse, NMSIInventory iInventory){
        NMSWrapper.getInstance().exec(nmsObject, entityHorse, iInventory);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#openSign(net.minecraft.server.v1_8_R3.TileEntitySign)
     */
    @ReflectiveMethod(name = "openSign", types = {NMSTileEntitySign.class})
    public void openSign(NMSTileEntitySign tileEntitySign){
        NMSWrapper.getInstance().exec(nmsObject, tileEntitySign);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#openTileEntity(net.minecraft.server.v1_8_R3.ITileEntityContainer)
     */
    @ReflectiveMethod(name = "openTileEntity", types = {NMSITileEntityContainer.class})
    public void openTileEntity(NMSITileEntityContainer iTileEntityContainer){
        NMSWrapper.getInstance().exec(nmsObject, iTileEntityContainer);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#openTrade(net.minecraft.server.v1_8_R3.IMerchant)
     */
    @ReflectiveMethod(name = "openTrade", types = {NMSIMerchant.class})
    public void openTrade(NMSIMerchant iMerchant){
        NMSWrapper.getInstance().exec(nmsObject, iMerchant);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#q(int)
     */
    @ReflectiveMethod(name = "q", types = {int.class})
    public NMSItemStack q(int i){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#s()
     */
    @ReflectiveMethod(name = "s", types = {})
    public void s(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#s_()
     */
    @ReflectiveMethod(name = "s_", types = {})
    public boolean s_(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#setAbsorptionHearts(float)
     */
    @ReflectiveMethod(name = "setAbsorptionHearts", types = {float.class})
    public void setAbsorptionHearts(float f){
        NMSWrapper.getInstance().exec(nmsObject, f);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#setEquipment(int, net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "setEquipment", types = {int.class, NMSItemStack.class})
    public void setEquipment(int i, NMSItemStack itemStack){
        NMSWrapper.getInstance().exec(nmsObject, i, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#setRespawnPosition(net.minecraft.server.v1_8_R3.BlockPosition, boolean)
     */
    @ReflectiveMethod(name = "setRespawnPosition", types = {NMSBlockPosition.class, boolean.class})
    public void setRespawnPosition(NMSBlockPosition blockPosition, boolean b){
        NMSWrapper.getInstance().exec(nmsObject, blockPosition, b);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#setScore(int)
     */
    @ReflectiveMethod(name = "setScore", types = {int.class})
    public void setScore(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#t_()
     */
    @ReflectiveMethod(name = "t_", types = {})
    public void t_(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityHuman#u(net.minecraft.server.v1_8_R3.Entity)
     */
    @ReflectiveMethod(name = "u", types = {NMSEntity.class})
    public boolean u(NMSEntity entity){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityHuman#updateAbilities()
     */
    @ReflectiveMethod(name = "updateAbilities", types = {})
    public void updateAbilities(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}