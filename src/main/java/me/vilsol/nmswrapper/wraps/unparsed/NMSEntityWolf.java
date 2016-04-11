package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSItemStack;
import me.vilsol.nmswrapper.wraps.NMSWorld;
import org.bukkit.event.entity.EntityTargetEvent;

@ReflectiveClass(name = "EntityWolf")
public class NMSEntityWolf extends NMSEntityTameableAnimal {

    public NMSEntityWolf(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityWolf(NMSWorld world){
        super("EntityWolf", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityWolf#E()
     */
    @ReflectiveMethod(name = "E", types = {})
    public void E(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityWolf#a(net.minecraft.server.v1_9_R1.EntityLiving, net.minecraft.server.v1_9_R1.EntityLiving)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityLiving.class, NMSEntityLiving.class})
    public boolean a(NMSEntityLiving entityLiving, NMSEntityLiving entityLiving1){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityLiving, entityLiving1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityWolf#b(net.minecraft.server.v1_9_R1.EntityAgeable)
     */
    @ReflectiveMethod(name = "b", types = {NMSEntityAgeable.class})
    public NMSEntityWolf b(NMSEntityAgeable entityAgeable){
        return new NMSEntityWolf(NMSWrapper.getInstance().exec(nmsObject, entityAgeable));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityWolf#bB()
     */
    @ReflectiveMethod(name = "bB", types = {})
    public float bB(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityWolf#bQ()
     */
    @ReflectiveMethod(name = "bQ", types = {})
    public int bQ(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityWolf#bV()
     */
    @ReflectiveMethod(name = "bV", types = {})
    public int bV(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityWolf#bo()
     */
    @ReflectiveMethod(name = "bo", types = {})
    public String bo(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityWolf#bp()
     */
    @ReflectiveMethod(name = "bp", types = {})
    public String bp(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityWolf#cb()
     */
    @ReflectiveMethod(name = "cb", types = {})
    public boolean cb(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityWolf#createChild(net.minecraft.server.v1_9_R1.EntityAgeable)
     */
    @ReflectiveMethod(name = "createChild", types = {NMSEntityAgeable.class})
    public NMSEntityAgeable createChild(NMSEntityAgeable entityAgeable){
        return new NMSEntityAgeable(NMSWrapper.getInstance().exec(nmsObject, entityAgeable));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityWolf#cx()
     */
    @ReflectiveMethod(name = "cx", types = {})
    public boolean cx(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityWolf#d(net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "d", types = {NMSItemStack.class})
    public boolean d(NMSItemStack itemStack){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityWolf#damageEntity(net.minecraft.server.v1_9_R1.DamageSource, float)
     */
    @ReflectiveMethod(name = "damageEntity", types = {NMSDamageSource.class, float.class})
    public boolean damageEntity(NMSDamageSource damageSource, float f){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, damageSource, f);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityWolf#getCollarColor()
     */
    @ReflectiveMethod(name = "getCollarColor", types = {})
    public NMSEnumColor getCollarColor(){
        return new NMSEnumColor(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityWolf#getHeadHeight()
     */
    @ReflectiveMethod(name = "getHeadHeight", types = {})
    public float getHeadHeight(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityWolf#getLoot()
     */
    @ReflectiveMethod(name = "getLoot", types = {})
    public NMSItem getLoot(){
        return new NMSItem(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityWolf#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public void h(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityWolf#initAttributes()
     */
    @ReflectiveMethod(name = "initAttributes", types = {})
    public void initAttributes(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityWolf#isAngry()
     */
    @ReflectiveMethod(name = "isAngry", types = {})
    public boolean isAngry(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityWolf#isTypeNotPersistent()
     */
    @ReflectiveMethod(name = "isTypeNotPersistent", types = {})
    public boolean isTypeNotPersistent(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityWolf#m()
     */
    @ReflectiveMethod(name = "m", types = {})
    public void m(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityWolf#mate(net.minecraft.server.v1_9_R1.EntityAnimal)
     */
    @ReflectiveMethod(name = "mate", types = {NMSEntityAnimal.class})
    public boolean mate(NMSEntityAnimal entityAnimal){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityAnimal);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityWolf#p(boolean)
     */
    @ReflectiveMethod(name = "p", types = {boolean.class})
    public void p(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityWolf#r(net.minecraft.server.v1_9_R1.Entity)
     */
    @ReflectiveMethod(name = "r", types = {NMSEntity.class})
    public boolean r(NMSEntity entity){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityWolf#setAngry(boolean)
     */
    @ReflectiveMethod(name = "setAngry", types = {boolean.class})
    public void setAngry(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityWolf#setCollarColor(net.minecraft.server.v1_9_R1.EnumColor)
     */
    @ReflectiveMethod(name = "setCollarColor", types = {NMSEnumColor.class})
    public void setCollarColor(NMSEnumColor enumColor){
        NMSWrapper.getInstance().exec(nmsObject, enumColor);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityWolf#setGoalTarget(net.minecraft.server.v1_9_R1.EntityLiving, org.bukkit.event.entity.EntityTargetEvent$TargetReason, boolean)
     */
    @ReflectiveMethod(name = "setGoalTarget", types = {NMSEntityLiving.class, EntityTargetEvent.TargetReason.class, boolean.class})
    public void setGoalTarget(NMSEntityLiving entityLiving, EntityTargetEvent.TargetReason targetReason, boolean b){
        NMSWrapper.getInstance().exec(nmsObject, entityLiving, targetReason, b);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityWolf#setTamed(boolean)
     */
    @ReflectiveMethod(name = "setTamed", types = {boolean.class})
    public void setTamed(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityWolf#t_()
     */
    @ReflectiveMethod(name = "t_", types = {})
    public void t_(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityWolf#z()
     */
    @ReflectiveMethod(name = "z", types = {})
    public String z(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}