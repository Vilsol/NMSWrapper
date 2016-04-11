package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSItemStack;
import org.bukkit.event.entity.EntityRegainHealthEvent;

import java.util.Random;

@ReflectiveClass(name = "EntityLiving")
public class NMSEntityLiving extends NMSEntity {

    public NMSEntityLiving(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityLiving(NMSWorld world){
        super("EntityLiving", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    public NMSEntityLiving(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#B()
     */
    @ReflectiveMethod(name = "B", types = {})
    public void B(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#G()
     */
    @ReflectiveMethod(name = "G", types = {})
    public void G(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#K()
     */
    @ReflectiveMethod(name = "K", types = {})
    public void K(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#O()
     */
    @ReflectiveMethod(name = "O", types = {})
    public void O(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#a(net.minecraft.server.v1_9_R1.ScoreboardTeamBase)
     */
    @ReflectiveMethod(name = "a", types = {NMSScoreboardTeamBase.class})
    public boolean a(NMSScoreboardTeamBase scoreboardTeamBase){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, scoreboardTeamBase);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#aY()
     */
    @ReflectiveMethod(name = "aY", types = {})
    public boolean aY(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#aZ()
     */
    @ReflectiveMethod(name = "aZ", types = {})
    public void aZ(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#ac()
     */
    @ReflectiveMethod(name = "ac", types = {})
    public void ac(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#ad()
     */
    @ReflectiveMethod(name = "ad", types = {})
    public boolean ad(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#addEffect(net.minecraft.server.v1_9_R1.MobEffect)
     */
    @ReflectiveMethod(name = "addEffect", types = {NMSMobEffect.class})
    public void addEffect(NMSMobEffect mobEffect){
        NMSWrapper.getInstance().exec(nmsObject, mobEffect);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#ae()
     */
    @ReflectiveMethod(name = "ae", types = {})
    public boolean ae(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#ak()
     */
    @ReflectiveMethod(name = "ak", types = {})
    public void ak(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#alwaysGivesExp()
     */
    @ReflectiveMethod(name = "alwaysGivesExp", types = {})
    public boolean alwaysGivesExp(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#ap()
     */
    @ReflectiveMethod(name = "ap", types = {})
    public NMSVec3D ap(){
        return new NMSVec3D(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#applyArmorModifier(net.minecraft.server.v1_9_R1.DamageSource, float)
     */
    @ReflectiveMethod(name = "applyArmorModifier", types = {NMSDamageSource.class, float.class})
    public float applyArmorModifier(NMSDamageSource damageSource, float f){
        return (float) NMSWrapper.getInstance().exec(nmsObject, damageSource, f);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#applyMagicModifier(net.minecraft.server.v1_9_R1.DamageSource, float)
     */
    @ReflectiveMethod(name = "applyMagicModifier", types = {NMSDamageSource.class, float.class})
    public float applyMagicModifier(NMSDamageSource damageSource, float f){
        return (float) NMSWrapper.getInstance().exec(nmsObject, damageSource, f);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#b(net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "b", types = {NMSItemStack.class})
    public void b(NMSItemStack itemStack){
        NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#bA()
     */
    @ReflectiveMethod(name = "bA", types = {})
    public NMSItemStack bA(){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#bB()
     */
    @ReflectiveMethod(name = "bB", types = {})
    public float bB(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#bC()
     */
    @ReflectiveMethod(name = "bC", types = {})
    public float bC(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#bD()
     */
    @ReflectiveMethod(name = "bD", types = {})
    public boolean bD(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#bE()
     */
    @ReflectiveMethod(name = "bE", types = {})
    public float bE(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#bF()
     */
    @ReflectiveMethod(name = "bF", types = {})
    public void bF(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#bG()
     */
    @ReflectiveMethod(name = "bG", types = {})
    public void bG(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#bH()
     */
    @ReflectiveMethod(name = "bH", types = {})
    public void bH(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#bI()
     */
    @ReflectiveMethod(name = "bI", types = {})
    public float bI(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#bL()
     */
    @ReflectiveMethod(name = "bL", types = {})
    public void bL(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#bM()
     */
    @ReflectiveMethod(name = "bM", types = {})
    public boolean bM(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#bP()
     */
    @ReflectiveMethod(name = "bP", types = {})
    public void bP(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#ba()
     */
    @ReflectiveMethod(name = "ba", types = {})
    public boolean ba(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#bc()
     */
    @ReflectiveMethod(name = "bc", types = {})
    public Random bc(){
        return (Random) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#be()
     */
    @ReflectiveMethod(name = "be", types = {})
    public int be(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#bf()
     */
    @ReflectiveMethod(name = "bf", types = {})
    public NMSEntityLiving bf(){
        return new NMSEntityLiving(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#bg()
     */
    @ReflectiveMethod(name = "bg", types = {})
    public int bg(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#bh()
     */
    @ReflectiveMethod(name = "bh", types = {})
    public int bh(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#bi()
     */
    @ReflectiveMethod(name = "bi", types = {})
    public void bi(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#bj()
     */
    @ReflectiveMethod(name = "bj", types = {})
    public void bj(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#bm()
     */
    @ReflectiveMethod(name = "bm", types = {})
    public boolean bm(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#bo()
     */
    @ReflectiveMethod(name = "bo", types = {})
    public String bo(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#bp()
     */
    @ReflectiveMethod(name = "bp", types = {})
    public String bp(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#br()
     */
    @ReflectiveMethod(name = "br", types = {})
    public int br(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#bs()
     */
    @ReflectiveMethod(name = "bs", types = {})
    public NMSCombatTracker bs(){
        return new NMSCombatTracker(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#bt()
     */
    @ReflectiveMethod(name = "bt", types = {})
    public NMSEntityLiving bt(){
        return new NMSEntityLiving(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#bv()
     */
    @ReflectiveMethod(name = "bv", types = {})
    public int bv(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#bw()
     */
    @ReflectiveMethod(name = "bw", types = {})
    public void bw(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#bx()
     */
    @ReflectiveMethod(name = "bx", types = {})
    public void bx(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#c(net.minecraft.server.v1_9_R1.EntityLiving)
     */
    @ReflectiveMethod(name = "c", types = {NMSEntityLiving.class})
    public boolean c(NMSEntityLiving entityLiving){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityLiving);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#d(float)
     */
    @ReflectiveMethod(name = "d", types = {float.class})
    public NMSVec3D d(float f){
        return new NMSVec3D(NMSWrapper.getInstance().exec(nmsObject, f));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#damageArmor(float)
     */
    @ReflectiveMethod(name = "damageArmor", types = {float.class})
    public void damageArmor(float f){
        NMSWrapper.getInstance().exec(nmsObject, f);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#damageEntity(net.minecraft.server.v1_9_R1.DamageSource, float)
     */
    @ReflectiveMethod(name = "damageEntity", types = {NMSDamageSource.class, float.class})
    public boolean damageEntity(NMSDamageSource damageSource, float f){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, damageSource, f);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#die(net.minecraft.server.v1_9_R1.DamageSource)
     */
    @ReflectiveMethod(name = "die", types = {NMSDamageSource.class})
    public void die(NMSDamageSource damageSource){
        NMSWrapper.getInstance().exec(nmsObject, damageSource);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#doTick()
     */
    @ReflectiveMethod(name = "doTick", types = {})
    public void doTick(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#dropDeathLoot(boolean, int)
     */
    @ReflectiveMethod(name = "dropDeathLoot", types = {boolean.class, int.class})
    public void dropDeathLoot(boolean b, int i){
        NMSWrapper.getInstance().exec(nmsObject, b, i);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#dropEquipment(boolean, int)
     */
    @ReflectiveMethod(name = "dropEquipment", types = {boolean.class, int.class})
    public void dropEquipment(boolean b, int i){
        NMSWrapper.getInstance().exec(nmsObject, b, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#e(float, float)
     */
    @ReflectiveMethod(name = "e", types = {float.class, float.class})
    public void e(float f, float f1){
        NMSWrapper.getInstance().exec(nmsObject, f, f1);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#enterCombat()
     */
    @ReflectiveMethod(name = "enterCombat", types = {})
    public void enterCombat(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#exitCombat()
     */
    @ReflectiveMethod(name = "exitCombat", types = {})
    public void exitCombat(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#f(float)
     */
    @ReflectiveMethod(name = "f", types = {float.class})
    public void f(float f){
        NMSWrapper.getInstance().exec(nmsObject, f);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#g(float)
     */
    @ReflectiveMethod(name = "g", types = {float.class})
    public void g(float f){
        NMSWrapper.getInstance().exec(nmsObject, f);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#getAbsorptionHearts()
     */
    @ReflectiveMethod(name = "getAbsorptionHearts", types = {})
    public float getAbsorptionHearts(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#getAttributeInstance(net.minecraft.server.v1_9_R1.IAttribute)
     */
    @ReflectiveMethod(name = "getAttributeInstance", types = {NMSIAttribute.class})
    public NMSAttributeInstance getAttributeInstance(NMSIAttribute iAttribute){
        return (NMSAttributeInstance) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject, iAttribute));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#getAttributeMap()
     */
    @ReflectiveMethod(name = "getAttributeMap", types = {})
    public NMSAttributeMapBase getAttributeMap(){
        return new NMSAttributeMapBase(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#getEffect(net.minecraft.server.v1_9_R1.MobEffectList)
     */
    @ReflectiveMethod(name = "getEffect", types = {NMSMobEffectList.class})
    public NMSMobEffect getEffect(NMSMobEffectList mobEffectList){
        return new NMSMobEffect(NMSWrapper.getInstance().exec(nmsObject, mobEffectList));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#getEquipment(int)
     */
    @ReflectiveMethod(name = "getEquipment", types = {int.class})
    public NMSItemStack getEquipment(int i){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#getExpReward()
     */
    @ReflectiveMethod(name = "getExpReward", types = {})
    public int getExpReward(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#getExpValue(net.minecraft.server.v1_9_R1.EntityHuman)
     */
    @ReflectiveMethod(name = "getExpValue", types = {NMSEntityHuman.class})
    public int getExpValue(NMSEntityHuman entityHuman){
        return (int) NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#getHeadRotation()
     */
    @ReflectiveMethod(name = "getHeadRotation", types = {})
    public float getHeadRotation(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#getHealth()
     */
    @ReflectiveMethod(name = "getHealth", types = {})
    public float getHealth(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#getLastDamager()
     */
    @ReflectiveMethod(name = "getLastDamager", types = {})
    public NMSEntityLiving getLastDamager(){
        return new NMSEntityLiving(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#getMaxHealth()
     */
    @ReflectiveMethod(name = "getMaxHealth", types = {})
    public float getMaxHealth(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#getMonsterType()
     */
    @ReflectiveMethod(name = "getMonsterType", types = {})
    public NMSEnumMonsterType getMonsterType(){
        return new NMSEnumMonsterType(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#getRareDrop()
     */
    @ReflectiveMethod(name = "getRareDrop", types = {})
    public void getRareDrop(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#getScoreboardTeam()
     */
    @ReflectiveMethod(name = "getScoreboardTeam", types = {})
    public NMSScoreboardTeamBase getScoreboardTeam(){
        return new NMSScoreboardTeamBase(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#h(float, float)
     */
    @ReflectiveMethod(name = "h", types = {float.class, float.class})
    public float h(float f, float f1){
        return (float) NMSWrapper.getInstance().exec(nmsObject, f, f1);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#hasEffect(net.minecraft.server.v1_9_R1.MobEffectList)
     */
    @ReflectiveMethod(name = "hasEffect", types = {NMSMobEffectList.class})
    public boolean hasEffect(NMSMobEffectList mobEffectList){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, mobEffectList);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#hasLineOfSight(net.minecraft.server.v1_9_R1.Entity)
     */
    @ReflectiveMethod(name = "hasLineOfSight", types = {NMSEntity.class})
    public boolean hasLineOfSight(NMSEntity entity){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#heal(float, org.bukkit.event.entity.EntityRegainHealthEvent$RegainReason)
     */
    @ReflectiveMethod(name = "heal", types = {float.class, EntityRegainHealthEvent.RegainReason.class})
    public void heal(float f, EntityRegainHealthEvent.RegainReason regainReason){
        NMSWrapper.getInstance().exec(nmsObject, f, regainReason);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#i(boolean)
     */
    @ReflectiveMethod(name = "i", types = {boolean.class})
    public void i(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#inactiveTick()
     */
    @ReflectiveMethod(name = "inactiveTick", types = {})
    public void inactiveTick(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#initAttributes()
     */
    @ReflectiveMethod(name = "initAttributes", types = {})
    public void initAttributes(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#isAlive()
     */
    @ReflectiveMethod(name = "isAlive", types = {})
    public boolean isAlive(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#isBaby()
     */
    @ReflectiveMethod(name = "isBaby", types = {})
    public boolean isBaby(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#isSleeping()
     */
    @ReflectiveMethod(name = "isSleeping", types = {})
    public boolean isSleeping(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#j(int)
     */
    @ReflectiveMethod(name = "j", types = {int.class})
    public int j(int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#k(float)
     */
    @ReflectiveMethod(name = "k", types = {float.class})
    public void k(float f){
        NMSWrapper.getInstance().exec(nmsObject, f);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#k_()
     */
    @ReflectiveMethod(name = "k_", types = {})
    public boolean k_(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#m()
     */
    @ReflectiveMethod(name = "m", types = {})
    public void m(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#mount(net.minecraft.server.v1_9_R1.Entity)
     */
    @ReflectiveMethod(name = "mount", types = {NMSEntity.class})
    public void mount(NMSEntity entity){
        NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#n(int)
     */
    @ReflectiveMethod(name = "n", types = {int.class})
    public String n(int i){
        return (String) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#o(int)
     */
    @ReflectiveMethod(name = "o", types = {int.class})
    public void o(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#p(net.minecraft.server.v1_9_R1.Entity)
     */
    @ReflectiveMethod(name = "p", types = {NMSEntity.class})
    public void p(NMSEntity entity){
        NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#q(net.minecraft.server.v1_9_R1.Entity)
     */
    @ReflectiveMethod(name = "q", types = {NMSEntity.class})
    public void q(NMSEntity entity){
        NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#r(net.minecraft.server.v1_9_R1.Entity)
     */
    @ReflectiveMethod(name = "r", types = {NMSEntity.class})
    public boolean r(NMSEntity entity){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#receive(net.minecraft.server.v1_9_R1.Entity, int)
     */
    @ReflectiveMethod(name = "receive", types = {NMSEntity.class, int.class})
    public void receive(NMSEntity entity, int i){
        NMSWrapper.getInstance().exec(nmsObject, entity, i);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#removeAllEffects()
     */
    @ReflectiveMethod(name = "removeAllEffects", types = {})
    public void removeAllEffects(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#removeEffect(int)
     */
    @ReflectiveMethod(name = "removeEffect", types = {int.class})
    public void removeEffect(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#s(net.minecraft.server.v1_9_R1.Entity)
     */
    @ReflectiveMethod(name = "s", types = {NMSEntity.class})
    public void s(NMSEntity entity){
        NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#setAbsorptionHearts(float)
     */
    @ReflectiveMethod(name = "setAbsorptionHearts", types = {float.class})
    public void setAbsorptionHearts(float f){
        NMSWrapper.getInstance().exec(nmsObject, f);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#setEquipment(int, net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "setEquipment", types = {int.class, NMSItemStack.class})
    public void setEquipment(int i, NMSItemStack itemStack){
        NMSWrapper.getInstance().exec(nmsObject, i, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#setHealth(float)
     */
    @ReflectiveMethod(name = "setHealth", types = {float.class})
    public void setHealth(float f){
        NMSWrapper.getInstance().exec(nmsObject, f);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLiving#setSprinting(boolean)
     */
    @ReflectiveMethod(name = "setSprinting", types = {boolean.class})
    public void setSprinting(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLiving#t_()
     */
    @ReflectiveMethod(name = "t_", types = {})
    public void t_(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}