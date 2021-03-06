package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWrap;

@ReflectiveClass(name = "DamageSource")
public class NMSDamageSource extends NMSWrap {

    public NMSDamageSource(Object nmsObject){
        super(nmsObject);
    }

    public NMSDamageSource(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.DamageSource#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public boolean a(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.DamageSource#arrow(net.minecraft.server.v1_9_R1.EntityArrow, net.minecraft.server.v1_9_R1.Entity)
     */
    @ReflectiveMethod(name = "arrow", types = {NMSEntityArrow.class, NMSEntity.class})
    public NMSDamageSource arrow(NMSEntityArrow entityArrow, NMSEntity entity){
        return new NMSDamageSource(NMSWrapper.getInstance().exec(nmsObject, entityArrow, entity));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.DamageSource#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public NMSDamageSource b(){
        return new NMSDamageSource(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.DamageSource#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public NMSDamageSource d(){
        return new NMSDamageSource(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.DamageSource#explosion(net.minecraft.server.v1_9_R1.Explosion)
     */
    @ReflectiveMethod(name = "explosion", types = {NMSExplosion.class})
    public NMSDamageSource explosion(NMSExplosion explosion){
        return new NMSDamageSource(NMSWrapper.getInstance().exec(nmsObject, explosion));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.DamageSource#fireball(net.minecraft.server.v1_9_R1.EntityFireball, net.minecraft.server.v1_9_R1.Entity)
     */
    @ReflectiveMethod(name = "fireball", types = {NMSEntityFireball.class, NMSEntity.class})
    public NMSDamageSource fireball(NMSEntityFireball entityFireball, NMSEntity entity){
        return new NMSDamageSource(NMSWrapper.getInstance().exec(nmsObject, entityFireball, entity));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.DamageSource#getEntity()
     */
    @ReflectiveMethod(name = "getEntity", types = {})
    public NMSEntity getEntity(){
        return new NMSEntity(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.DamageSource#getExhaustionCost()
     */
    @ReflectiveMethod(name = "getExhaustionCost", types = {})
    public float getExhaustionCost(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.DamageSource#getLocalizedDeathMessage(net.minecraft.server.v1_9_R1.EntityLiving)
     */
    @ReflectiveMethod(name = "getLocalizedDeathMessage", types = {NMSEntityLiving.class})
    public NMSIChatBaseComponent getLocalizedDeathMessage(NMSEntityLiving entityLiving){
        return (NMSIChatBaseComponent) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject, entityLiving));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.DamageSource#i()
     */
    @ReflectiveMethod(name = "i", types = {})
    public NMSEntity i(){
        return new NMSEntity(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.DamageSource#ignoresArmor()
     */
    @ReflectiveMethod(name = "ignoresArmor", types = {})
    public boolean ignoresArmor(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.DamageSource#ignoresInvulnerability()
     */
    @ReflectiveMethod(name = "ignoresInvulnerability", types = {})
    public boolean ignoresInvulnerability(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.DamageSource#isExplosion()
     */
    @ReflectiveMethod(name = "isExplosion", types = {})
    public boolean isExplosion(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.DamageSource#isMagic()
     */
    @ReflectiveMethod(name = "isMagic", types = {})
    public boolean isMagic(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.DamageSource#isStarvation()
     */
    @ReflectiveMethod(name = "isStarvation", types = {})
    public boolean isStarvation(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.DamageSource#l()
     */
    @ReflectiveMethod(name = "l", types = {})
    public NMSDamageSource l(){
        return new NMSDamageSource(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.DamageSource#m()
     */
    @ReflectiveMethod(name = "m", types = {})
    public NMSDamageSource m(){
        return new NMSDamageSource(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.DamageSource#mobAttack(net.minecraft.server.v1_9_R1.EntityLiving)
     */
    @ReflectiveMethod(name = "mobAttack", types = {NMSEntityLiving.class})
    public NMSDamageSource mobAttack(NMSEntityLiving entityLiving){
        return new NMSDamageSource(NMSWrapper.getInstance().exec(nmsObject, entityLiving));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.DamageSource#o()
     */
    @ReflectiveMethod(name = "o", types = {})
    public boolean o(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.DamageSource#p()
     */
    @ReflectiveMethod(name = "p", types = {})
    public String p(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.DamageSource#playerAttack(net.minecraft.server.v1_9_R1.EntityHuman)
     */
    @ReflectiveMethod(name = "playerAttack", types = {NMSEntityHuman.class})
    public NMSDamageSource playerAttack(NMSEntityHuman entityHuman){
        return new NMSDamageSource(NMSWrapper.getInstance().exec(nmsObject, entityHuman));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.DamageSource#projectile(net.minecraft.server.v1_9_R1.Entity, net.minecraft.server.v1_9_R1.Entity)
     */
    @ReflectiveMethod(name = "projectile", types = {NMSEntity.class, NMSEntity.class})
    public NMSDamageSource projectile(NMSEntity entity, NMSEntity entity1){
        return new NMSDamageSource(NMSWrapper.getInstance().exec(nmsObject, entity, entity1));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.DamageSource#q()
     */
    @ReflectiveMethod(name = "q", types = {})
    public NMSDamageSource q(){
        return new NMSDamageSource(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.DamageSource#r()
     */
    @ReflectiveMethod(name = "r", types = {})
    public boolean r(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.DamageSource#setExplosion()
     */
    @ReflectiveMethod(name = "setExplosion", types = {})
    public NMSDamageSource setExplosion(){
        return new NMSDamageSource(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.DamageSource#setIgnoreArmor()
     */
    @ReflectiveMethod(name = "setIgnoreArmor", types = {})
    public NMSDamageSource setIgnoreArmor(){
        return new NMSDamageSource(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.DamageSource#setMagic()
     */
    @ReflectiveMethod(name = "setMagic", types = {})
    public NMSDamageSource setMagic(){
        return new NMSDamageSource(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.DamageSource#u()
     */
    @ReflectiveMethod(name = "u", types = {})
    public boolean u(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}