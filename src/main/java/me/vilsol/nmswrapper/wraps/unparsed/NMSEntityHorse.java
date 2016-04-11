package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSItemStack;
import me.vilsol.nmswrapper.wraps.NMSWorld;
import me.vilsol.nmswrapper.wraps.NMSWrap;
import me.vilsol.nmswrapper.wraps.NMSNBTTagCompound;

@ReflectiveClass(name = "EntityHorse")
public class NMSEntityHorse extends NMSEntityAnimal implements NMSIInventoryListener {

    public NMSEntityHorse(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityHorse(NMSWorld world){
        super("EntityHorse", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#a(net.minecraft.server.v1_9_R1.Item)
     */
    @ReflectiveMethod(name = "a", types = {NMSItem.class})
    public boolean a(NMSItem item){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, item);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#ae()
     */
    @ReflectiveMethod(name = "ae", types = {})
    public boolean ae(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#al()
     */
    @ReflectiveMethod(name = "al", types = {})
    public void al(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#b(net.minecraft.server.v1_9_R1.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public void b(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#bB()
     */
    @ReflectiveMethod(name = "bB", types = {})
    public float bB(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#bD()
     */
    @ReflectiveMethod(name = "bD", types = {})
    public boolean bD(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#bR()
     */
    @ReflectiveMethod(name = "bR", types = {})
    public boolean bR(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#bV()
     */
    @ReflectiveMethod(name = "bV", types = {})
    public int bV(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#bo()
     */
    @ReflectiveMethod(name = "bo", types = {})
    public String bo(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#bp()
     */
    @ReflectiveMethod(name = "bp", types = {})
    public String bp(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#br()
     */
    @ReflectiveMethod(name = "br", types = {})
    public int br(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#cA()
     */
    @ReflectiveMethod(name = "cA", types = {})
    public boolean cA(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#cB()
     */
    @ReflectiveMethod(name = "cB", types = {})
    public boolean cB(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#cD()
     */
    @ReflectiveMethod(name = "cD", types = {})
    public boolean cD(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#cE()
     */
    @ReflectiveMethod(name = "cE", types = {})
    public void cE(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#cG()
     */
    @ReflectiveMethod(name = "cG", types = {})
    public boolean cG(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#cH()
     */
    @ReflectiveMethod(name = "cH", types = {})
    public String cH(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#cO()
     */
    @ReflectiveMethod(name = "cO", types = {})
    public boolean cO(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#cP()
     */
    @ReflectiveMethod(name = "cP", types = {})
    public boolean cP(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#cR()
     */
    @ReflectiveMethod(name = "cR", types = {})
    public boolean cR(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#cS()
     */
    @ReflectiveMethod(name = "cS", types = {})
    public boolean cS(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#cW()
     */
    @ReflectiveMethod(name = "cW", types = {})
    public void cW(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#cb()
     */
    @ReflectiveMethod(name = "cb", types = {})
    public boolean cb(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#cn()
     */
    @ReflectiveMethod(name = "cn", types = {})
    public boolean cn(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#cp()
     */
    @ReflectiveMethod(name = "cp", types = {})
    public boolean cp(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityHorse#createChild(net.minecraft.server.v1_9_R1.EntityAgeable)
     */
    @ReflectiveMethod(name = "createChild", types = {NMSEntityAgeable.class})
    public NMSEntityAgeable createChild(NMSEntityAgeable entityAgeable){
        return new NMSEntityAgeable(NMSWrapper.getInstance().exec(nmsObject, entityAgeable));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#cu()
     */
    @ReflectiveMethod(name = "cu", types = {})
    public float cu(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#cv()
     */
    @ReflectiveMethod(name = "cv", types = {})
    public boolean cv(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#cx()
     */
    @ReflectiveMethod(name = "cx", types = {})
    public int cx(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#cy()
     */
    @ReflectiveMethod(name = "cy", types = {})
    public boolean cy(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#cz()
     */
    @ReflectiveMethod(name = "cz", types = {})
    public boolean cz(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#d(int, net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "d", types = {int.class, NMSItemStack.class})
    public boolean d(int i, NMSItemStack itemStack){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityHorse#damageEntity(net.minecraft.server.v1_9_R1.DamageSource, float)
     */
    @ReflectiveMethod(name = "damageEntity", types = {NMSDamageSource.class, float.class})
    public boolean damageEntity(NMSDamageSource damageSource, float f){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, damageSource, f);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityHorse#die(net.minecraft.server.v1_9_R1.DamageSource)
     */
    @ReflectiveMethod(name = "die", types = {NMSDamageSource.class})
    public void die(NMSDamageSource damageSource){
        NMSWrapper.getInstance().exec(nmsObject, damageSource);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityHorse#dropChest()
     */
    @ReflectiveMethod(name = "dropChest", types = {})
    public void dropChest(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityHorse#dropDeathLoot(boolean, int)
     */
    @ReflectiveMethod(name = "dropDeathLoot", types = {boolean.class, int.class})
    public void dropDeathLoot(boolean b, int i){
        NMSWrapper.getInstance().exec(nmsObject, b, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#e(float, float)
     */
    @ReflectiveMethod(name = "e", types = {float.class, float.class})
    public void e(float f, float f1){
        NMSWrapper.getInstance().exec(nmsObject, f, f1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#f(boolean)
     */
    @ReflectiveMethod(name = "f", types = {boolean.class})
    public void f(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#g(float, float)
     */
    @ReflectiveMethod(name = "g", types = {float.class, float.class})
    public void g(float f, float f1){
        NMSWrapper.getInstance().exec(nmsObject, f, f1);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityHorse#getHeadHeight()
     */
    @ReflectiveMethod(name = "getHeadHeight", types = {})
    public float getHeadHeight(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityHorse#getJumpStrength()
     */
    @ReflectiveMethod(name = "getJumpStrength", types = {})
    public double getJumpStrength(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityHorse#getLoot()
     */
    @ReflectiveMethod(name = "getLoot", types = {})
    public NMSItem getLoot(){
        return new NMSItem(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityHorse#getMaxDomestication()
     */
    @ReflectiveMethod(name = "getMaxDomestication", types = {})
    public int getMaxDomestication(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityHorse#getName()
     */
    @ReflectiveMethod(name = "getName", types = {})
    public String getName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityHorse#getOwnerUUID()
     */
    @ReflectiveMethod(name = "getOwnerUUID", types = {})
    public String getOwnerUUID(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityHorse#getTemper()
     */
    @ReflectiveMethod(name = "getTemper", types = {})
    public int getTemper(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityHorse#getType()
     */
    @ReflectiveMethod(name = "getType", types = {})
    public int getType(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityHorse#getVariant()
     */
    @ReflectiveMethod(name = "getVariant", types = {})
    public int getVariant(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#h(net.minecraft.server.v1_9_R1.EntityHuman)
     */
    @ReflectiveMethod(name = "h", types = {NMSEntityHuman.class})
    public boolean h(NMSEntityHuman entityHuman){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityHorse#hasChest()
     */
    @ReflectiveMethod(name = "hasChest", types = {})
    public boolean hasChest(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityHorse#initAttributes()
     */
    @ReflectiveMethod(name = "initAttributes", types = {})
    public void initAttributes(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityHorse#isTame()
     */
    @ReflectiveMethod(name = "isTame", types = {})
    public boolean isTame(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#k_()
     */
    @ReflectiveMethod(name = "k_", types = {})
    public boolean k_(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityHorse#loadChest()
     */
    @ReflectiveMethod(name = "loadChest", types = {})
    public void loadChest(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#m()
     */
    @ReflectiveMethod(name = "m", types = {})
    public void m(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityHorse#mate(net.minecraft.server.v1_9_R1.EntityAnimal)
     */
    @ReflectiveMethod(name = "mate", types = {NMSEntityAnimal.class})
    public boolean mate(NMSEntityAnimal entityAnimal){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityAnimal);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#n(boolean)
     */
    @ReflectiveMethod(name = "n", types = {boolean.class})
    public void n(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#o(float)
     */
    @ReflectiveMethod(name = "o", types = {float.class})
    public void o(float f){
        NMSWrapper.getInstance().exec(nmsObject, f);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#p(boolean)
     */
    @ReflectiveMethod(name = "p", types = {boolean.class})
    public void p(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityHorse#prepare(net.minecraft.server.v1_9_R1.DifficultyDamageScaler, net.minecraft.server.v1_9_R1.GroupDataEntity)
     */
    @ReflectiveMethod(name = "prepare", types = {NMSDifficultyDamageScaler.class, NMSGroupDataEntity.class})
    public NMSGroupDataEntity prepare(NMSDifficultyDamageScaler difficultyDamageScaler, NMSGroupDataEntity groupDataEntity){
        return (NMSGroupDataEntity) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject, difficultyDamageScaler, groupDataEntity));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#q(boolean)
     */
    @ReflectiveMethod(name = "q", types = {boolean.class})
    public void q(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#r(boolean)
     */
    @ReflectiveMethod(name = "r", types = {boolean.class})
    public void r(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#s(boolean)
     */
    @ReflectiveMethod(name = "s", types = {boolean.class})
    public void s(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityHorse#setHasChest(boolean)
     */
    @ReflectiveMethod(name = "setHasChest", types = {boolean.class})
    public void setHasChest(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityHorse#setOwnerUUID(java.lang.String)
     */
    @ReflectiveMethod(name = "setOwnerUUID", types = {String.class})
    public void setOwnerUUID(String s){
        NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityHorse#setTame(boolean)
     */
    @ReflectiveMethod(name = "setTame", types = {boolean.class})
    public void setTame(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityHorse#setTemper(int)
     */
    @ReflectiveMethod(name = "setTemper", types = {int.class})
    public void setTemper(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityHorse#setType(int)
     */
    @ReflectiveMethod(name = "setType", types = {int.class})
    public void setType(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityHorse#setVariant(int)
     */
    @ReflectiveMethod(name = "setVariant", types = {int.class})
    public void setVariant(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#t_()
     */
    @ReflectiveMethod(name = "t_", types = {})
    public void t_(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#u(int)
     */
    @ReflectiveMethod(name = "u", types = {int.class})
    public int u(int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#v(int)
     */
    @ReflectiveMethod(name = "v", types = {int.class})
    public void v(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#w()
     */
    @ReflectiveMethod(name = "w", types = {})
    public int w(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityHorse#z()
     */
    @ReflectiveMethod(name = "z", types = {})
    public String z(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    @ReflectiveClass(name = "GroupDataHorse")
    public class NMSGroupDataHorse extends NMSWrap implements NMSGroupDataEntity {

        public NMSGroupDataHorse(Object nmsObject){
            super(nmsObject);
        }

        public NMSGroupDataHorse(int i, int i1){
            super("GroupDataHorse", new Object[]{int.class, int.class}, new Object[]{i, i1});
        }

    }

}