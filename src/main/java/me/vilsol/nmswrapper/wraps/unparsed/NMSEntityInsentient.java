package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSItemStack;
import org.bukkit.event.entity.EntityTargetEvent;

@ReflectiveClass(name = "EntityInsentient")
public class NMSEntityInsentient extends NMSEntityLiving {

    public NMSEntityInsentient(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityInsentient(NMSWorld world){
        super("EntityInsentient", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    public NMSEntityInsentient(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#D()
     */
    @ReflectiveMethod(name = "D", types = {})
    public void D(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#E()
     */
    @ReflectiveMethod(name = "E", types = {})
    public void E(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#K()
     */
    @ReflectiveMethod(name = "K", types = {})
    public void K(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#a(net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityHuman.class})
    public boolean a(NMSEntityHuman entityHuman){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#aE()
     */
    @ReflectiveMethod(name = "aE", types = {})
    public int aE(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#b(net.minecraft.server.v1_8_R3.DifficultyDamageScaler)
     */
    @ReflectiveMethod(name = "b", types = {NMSDifficultyDamageScaler.class})
    public void b(NMSDifficultyDamageScaler difficultyDamageScaler){
        NMSWrapper.getInstance().exec(nmsObject, difficultyDamageScaler);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#bA()
     */
    @ReflectiveMethod(name = "bA", types = {})
    public NMSItemStack bA(){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#bM()
     */
    @ReflectiveMethod(name = "bM", types = {})
    public boolean bM(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#bQ()
     */
    @ReflectiveMethod(name = "bQ", types = {})
    public int bQ(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#bR()
     */
    @ReflectiveMethod(name = "bR", types = {})
    public boolean bR(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#bV()
     */
    @ReflectiveMethod(name = "bV", types = {})
    public int bV(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#bW()
     */
    @ReflectiveMethod(name = "bW", types = {})
    public boolean bW(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#bX()
     */
    @ReflectiveMethod(name = "bX", types = {})
    public void bX(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#bY()
     */
    @ReflectiveMethod(name = "bY", types = {})
    public boolean bY(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#c(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "c", types = {NMSItemStack.class})
    public int c(NMSItemStack itemStack){
        return (int) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#ca()
     */
    @ReflectiveMethod(name = "ca", types = {})
    public void ca(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#canSpawn()
     */
    @ReflectiveMethod(name = "canSpawn", types = {})
    public boolean canSpawn(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#cb()
     */
    @ReflectiveMethod(name = "cb", types = {})
    public boolean cb(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#cc()
     */
    @ReflectiveMethod(name = "cc", types = {})
    public boolean cc(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#ce()
     */
    @ReflectiveMethod(name = "ce", types = {})
    public boolean ce(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#d(int, net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "d", types = {int.class, NMSItemStack.class})
    public boolean d(int i, NMSItemStack itemStack){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#doTick()
     */
    @ReflectiveMethod(name = "doTick", types = {})
    public void doTick(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#dropDeathLoot(boolean, int)
     */
    @ReflectiveMethod(name = "dropDeathLoot", types = {boolean.class, int.class})
    public void dropDeathLoot(boolean b, int i){
        NMSWrapper.getInstance().exec(nmsObject, b, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#dropEquipment(boolean, int)
     */
    @ReflectiveMethod(name = "dropEquipment", types = {boolean.class, int.class})
    public void dropEquipment(boolean b, int i){
        NMSWrapper.getInstance().exec(nmsObject, b, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#e(net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "e", types = {NMSEntityHuman.class})
    public boolean e(NMSEntityHuman entityHuman){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#getControllerJump()
     */
    @ReflectiveMethod(name = "getControllerJump", types = {})
    public NMSControllerJump getControllerJump(){
        return new NMSControllerJump(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#getControllerLook()
     */
    @ReflectiveMethod(name = "getControllerLook", types = {})
    public NMSControllerLook getControllerLook(){
        return new NMSControllerLook(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#getControllerMove()
     */
    @ReflectiveMethod(name = "getControllerMove", types = {})
    public NMSControllerMove getControllerMove(){
        return new NMSControllerMove(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#getEntitySenses()
     */
    @ReflectiveMethod(name = "getEntitySenses", types = {})
    public NMSEntitySenses getEntitySenses(){
        return new NMSEntitySenses(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#getEquipment(int)
     */
    @ReflectiveMethod(name = "getEquipment", types = {int.class})
    public NMSItemStack getEquipment(int i){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#getExpValue(net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "getExpValue", types = {NMSEntityHuman.class})
    public int getExpValue(NMSEntityHuman entityHuman){
        return (int) NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#getGoalTarget()
     */
    @ReflectiveMethod(name = "getGoalTarget", types = {})
    public NMSEntityLiving getGoalTarget(){
        return new NMSEntityLiving(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#getLeashHolder()
     */
    @ReflectiveMethod(name = "getLeashHolder", types = {})
    public NMSEntity getLeashHolder(){
        return new NMSEntity(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#getLoot()
     */
    @ReflectiveMethod(name = "getLoot", types = {})
    public NMSItem getLoot(){
        return new NMSItem(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#getNavigation()
     */
    @ReflectiveMethod(name = "getNavigation", types = {})
    public NMSNavigationAbstract getNavigation(){
        return new NMSNavigationAbstract(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#h(float, float)
     */
    @ReflectiveMethod(name = "h", types = {float.class, float.class})
    public float h(float f, float f1){
        return (float) NMSWrapper.getInstance().exec(nmsObject, f, f1);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#initAttributes()
     */
    @ReflectiveMethod(name = "initAttributes", types = {})
    public void initAttributes(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#isPersistent()
     */
    @ReflectiveMethod(name = "isPersistent", types = {})
    public boolean isPersistent(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#isTypeNotPersistent()
     */
    @ReflectiveMethod(name = "isTypeNotPersistent", types = {})
    public boolean isTypeNotPersistent(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#j(boolean)
     */
    @ReflectiveMethod(name = "j", types = {boolean.class})
    public void j(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#k(boolean)
     */
    @ReflectiveMethod(name = "k", types = {boolean.class})
    public void k(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#m()
     */
    @ReflectiveMethod(name = "m", types = {})
    public void m(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#n(float)
     */
    @ReflectiveMethod(name = "n", types = {float.class})
    public void n(float f){
        NMSWrapper.getInstance().exec(nmsObject, f);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#prepare(net.minecraft.server.v1_8_R3.DifficultyDamageScaler, net.minecraft.server.v1_8_R3.GroupDataEntity)
     */
    @ReflectiveMethod(name = "prepare", types = {NMSDifficultyDamageScaler.class, NMSGroupDataEntity.class})
    public NMSGroupDataEntity prepare(NMSDifficultyDamageScaler difficultyDamageScaler, NMSGroupDataEntity groupDataEntity){
        return new NMSGroupDataEntity(NMSWrapper.getInstance().exec(nmsObject, difficultyDamageScaler, groupDataEntity));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#q(int)
     */
    @ReflectiveMethod(name = "q", types = {int.class})
    public NMSItemStack q(int i){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#setEquipment(int, net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "setEquipment", types = {int.class, NMSItemStack.class})
    public void setEquipment(int i, NMSItemStack itemStack){
        NMSWrapper.getInstance().exec(nmsObject, i, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#setGoalTarget(net.minecraft.server.v1_8_R3.EntityLiving, org.bukkit.event.entity.EntityTargetEvent$TargetReason, boolean)
     */
    @ReflectiveMethod(name = "setGoalTarget", types = {NMSEntityLiving.class, EntityTargetEvent.TargetReason.class, boolean.class})
    public void setGoalTarget(NMSEntityLiving entityLiving, EntityTargetEvent.TargetReason targetReason, boolean b){
        NMSWrapper.getInstance().exec(nmsObject, entityLiving, targetReason, b);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#setLeashHolder(net.minecraft.server.v1_8_R3.Entity, boolean)
     */
    @ReflectiveMethod(name = "setLeashHolder", types = {NMSEntity.class, boolean.class})
    public void setLeashHolder(NMSEntity entity, boolean b){
        NMSWrapper.getInstance().exec(nmsObject, entity, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#t_()
     */
    @ReflectiveMethod(name = "t_", types = {})
    public void t_(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#unleash(boolean, boolean)
     */
    @ReflectiveMethod(name = "unleash", types = {boolean.class, boolean.class})
    public void unleash(boolean b, boolean b1){
        NMSWrapper.getInstance().exec(nmsObject, b, b1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#v()
     */
    @ReflectiveMethod(name = "v", types = {})
    public void v(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#w()
     */
    @ReflectiveMethod(name = "w", types = {})
    public int w(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#x()
     */
    @ReflectiveMethod(name = "x", types = {})
    public void x(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#y()
     */
    @ReflectiveMethod(name = "y", types = {})
    public void y(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityInsentient#z()
     */
    @ReflectiveMethod(name = "z", types = {})
    public String z(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}