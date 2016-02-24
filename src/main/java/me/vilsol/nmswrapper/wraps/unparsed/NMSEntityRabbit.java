package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityRabbit")
public class NMSEntityRabbit extends NMSEntityAnimal {

    public NMSEntityRabbit(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityRabbit(NMSWorld world){
        super("EntityRabbit", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityRabbit#E()
     */
    @ReflectiveMethod(name = "E", types = {})
    public void E(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityRabbit#Y()
     */
    @ReflectiveMethod(name = "Y", types = {})
    public void Y(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityRabbit#a(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "a", types = {NMSNBTTagCompound.class})
    public void a(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityRabbit#b(net.minecraft.server.v1_8_R3.EntityAgeable)
     */
    @ReflectiveMethod(name = "b", types = {NMSEntityAgeable.class})
    public NMSEntityRabbit b(NMSEntityAgeable entityAgeable){
        return new NMSEntityRabbit(NMSWrapper.getInstance().exec(nmsObject, entityAgeable));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityRabbit#bE()
     */
    @ReflectiveMethod(name = "bE", types = {})
    public float bE(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityRabbit#bo()
     */
    @ReflectiveMethod(name = "bo", types = {})
    public String bo(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityRabbit#bp()
     */
    @ReflectiveMethod(name = "bp", types = {})
    public String bp(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityRabbit#br()
     */
    @ReflectiveMethod(name = "br", types = {})
    public int br(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityRabbit#cl()
     */
    @ReflectiveMethod(name = "cl", types = {})
    public boolean cl(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityRabbit#cm()
     */
    @ReflectiveMethod(name = "cm", types = {})
    public String cm(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityRabbit#co()
     */
    @ReflectiveMethod(name = "co", types = {})
    public int co(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityRabbit#cp()
     */
    @ReflectiveMethod(name = "cp", types = {})
    public void cp(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityRabbit#createChild(net.minecraft.server.v1_8_R3.EntityAgeable)
     */
    @ReflectiveMethod(name = "createChild", types = {NMSEntityAgeable.class})
    public NMSEntityAgeable createChild(NMSEntityAgeable entityAgeable){
        return new NMSEntityAgeable(NMSWrapper.getInstance().exec(nmsObject, entityAgeable));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityRabbit#d(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "d", types = {NMSItemStack.class})
    public boolean d(NMSItemStack itemStack){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityRabbit#damageEntity(net.minecraft.server.v1_8_R3.DamageSource, float)
     */
    @ReflectiveMethod(name = "damageEntity", types = {NMSDamageSource.class, float.class})
    public boolean damageEntity(NMSDamageSource damageSource, float f){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, damageSource, f);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityRabbit#dropDeathLoot(boolean, int)
     */
    @ReflectiveMethod(name = "dropDeathLoot", types = {boolean.class, int.class})
    public void dropDeathLoot(boolean b, int i){
        NMSWrapper.getInstance().exec(nmsObject, b, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityRabbit#getRabbitType()
     */
    @ReflectiveMethod(name = "getRabbitType", types = {})
    public int getRabbitType(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityRabbit#getRareDrop()
     */
    @ReflectiveMethod(name = "getRareDrop", types = {})
    public void getRareDrop(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityRabbit#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public void h(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityRabbit#initAttributes()
     */
    @ReflectiveMethod(name = "initAttributes", types = {})
    public void initAttributes(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityRabbit#initializePathFinderGoals()
     */
    @ReflectiveMethod(name = "initializePathFinderGoals", types = {})
    public void initializePathFinderGoals(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityRabbit#m()
     */
    @ReflectiveMethod(name = "m", types = {})
    public void m(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityRabbit#prepare(net.minecraft.server.v1_8_R3.DifficultyDamageScaler, net.minecraft.server.v1_8_R3.GroupDataEntity)
     */
    @ReflectiveMethod(name = "prepare", types = {NMSDifficultyDamageScaler.class, NMSGroupDataEntity.class})
    public NMSGroupDataEntity prepare(NMSDifficultyDamageScaler difficultyDamageScaler, NMSGroupDataEntity groupDataEntity){
        return new NMSGroupDataEntity(NMSWrapper.getInstance().exec(nmsObject, difficultyDamageScaler, groupDataEntity));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityRabbit#r(net.minecraft.server.v1_8_R3.Entity)
     */
    @ReflectiveMethod(name = "r", types = {NMSEntity.class})
    public boolean r(NMSEntity entity){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityRabbit#setRabbitType(int)
     */
    @ReflectiveMethod(name = "setRabbitType", types = {int.class})
    public void setRabbitType(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityRabbit#z()
     */
    @ReflectiveMethod(name = "z", types = {})
    public String z(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    @ReflectiveClass(name = "ControllerJumpRabbit")
    public class NMSControllerJumpRabbit extends NMSControllerJump {

        public NMSControllerJumpRabbit(Object nmsObject){
            super(nmsObject);
        }

        public NMSControllerJumpRabbit(NMSEntityRabbit entityRabbit, NMSEntityRabbit entityRabbit1){
            super("ControllerJumpRabbit", new Object[]{NMSEntityRabbit.class, NMSEntityRabbit.class}, new Object[]{entityRabbit, entityRabbit1});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.EntityRabbit$ControllerJumpRabbit#a(boolean)
         */
        @ReflectiveMethod(name = "a", types = {boolean.class})
        public void a(boolean b){
            NMSWrapper.getInstance().exec(nmsObject, b);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.EntityRabbit$ControllerJumpRabbit#b()
         */
        @ReflectiveMethod(name = "b", types = {})
        public void b(){
            NMSWrapper.getInstance().exec(nmsObject);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.EntityRabbit$ControllerJumpRabbit#c()
         */
        @ReflectiveMethod(name = "c", types = {})
        public boolean c(){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.EntityRabbit$ControllerJumpRabbit#d()
         */
        @ReflectiveMethod(name = "d", types = {})
        public boolean d(){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject);
        }

    }

    @ReflectiveClass(name = "GroupDataRabbit")
    public class NMSGroupDataRabbit extends NMSWrap implements NMSGroupDataEntity {

        public NMSGroupDataRabbit(Object nmsObject){
            super(nmsObject);
        }

        public NMSGroupDataRabbit(int i){
            super("GroupDataRabbit", new Object[]{int.class}, new Object[]{i});
        }

    }

}