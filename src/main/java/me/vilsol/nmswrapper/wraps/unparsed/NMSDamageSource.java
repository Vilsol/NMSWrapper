package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWrap;
import me.vilsol.nmswrapper.wraps.NMSEntity;
import me.vilsol.nmswrapper.wraps.NMSEntityLiving;

@ReflectiveClass(name = "DamageSource")
public class NMSDamageSource extends NMSWrap {

    public NMSDamageSource(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.DamageSource#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public boolean a(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.DamageSource#arrow(net.minecraft.server.v1_8_R3.EntityArrow, net.minecraft.server.v1_8_R3.Entity)
     */
    @ReflectiveMethod(name = "arrow", types = {NMSEntityArrow.class, NMSEntity.class})
    public NMSDamageSource arrow(NMSEntityArrow entityArrow, NMSEntity entity){
        return new NMSDamageSource(NMSWrapper.getInstance().exec(nmsObject, entityArrow, entity));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.DamageSource#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public NMSDamageSource b(){
        return new NMSDamageSource(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.DamageSource#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public NMSDamageSource d(){
        return new NMSDamageSource(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.DamageSource#explosion(net.minecraft.server.v1_8_R3.Explosion)
     */
    @ReflectiveMethod(name = "explosion", types = {NMSExplosion.class})
    public NMSDamageSource explosion(NMSExplosion explosion){
        return new NMSDamageSource(NMSWrapper.getInstance().exec(nmsObject, explosion));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.DamageSource#fireball(net.minecraft.server.v1_8_R3.EntityFireball, net.minecraft.server.v1_8_R3.Entity)
     */
    @ReflectiveMethod(name = "fireball", types = {NMSEntityFireball.class, NMSEntity.class})
    public NMSDamageSource fireball(NMSEntityFireball entityFireball, NMSEntity entity){
        return new NMSDamageSource(NMSWrapper.getInstance().exec(nmsObject, entityFireball, entity));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.DamageSource#getEntity()
     */
    @ReflectiveMethod(name = "getEntity", types = {})
    public NMSEntity getEntity(){
        return new NMSEntity(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.DamageSource#getExhaustionCost()
     */
    @ReflectiveMethod(name = "getExhaustionCost", types = {})
    public float getExhaustionCost(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.DamageSource#getLocalizedDeathMessage(net.minecraft.server.v1_8_R3.EntityLiving)
     */
    @ReflectiveMethod(name = "getLocalizedDeathMessage", types = {NMSEntityLiving.class})
    public NMSIChatBaseComponent getLocalizedDeathMessage(NMSEntityLiving entityLiving){
        return new NMSIChatBaseComponent(NMSWrapper.getInstance().exec(nmsObject, entityLiving));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.DamageSource#i()
     */
    @ReflectiveMethod(name = "i", types = {})
    public NMSEntity i(){
        return new NMSEntity(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.DamageSource#ignoresArmor()
     */
    @ReflectiveMethod(name = "ignoresArmor", types = {})
    public boolean ignoresArmor(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.DamageSource#ignoresInvulnerability()
     */
    @ReflectiveMethod(name = "ignoresInvulnerability", types = {})
    public boolean ignoresInvulnerability(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.DamageSource#isExplosion()
     */
    @ReflectiveMethod(name = "isExplosion", types = {})
    public boolean isExplosion(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.DamageSource#isMagic()
     */
    @ReflectiveMethod(name = "isMagic", types = {})
    public boolean isMagic(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.DamageSource#isStarvation()
     */
    @ReflectiveMethod(name = "isStarvation", types = {})
    public boolean isStarvation(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.DamageSource#l()
     */
    @ReflectiveMethod(name = "l", types = {})
    public NMSDamageSource l(){
        return new NMSDamageSource(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.DamageSource#m()
     */
    @ReflectiveMethod(name = "m", types = {})
    public NMSDamageSource m(){
        return new NMSDamageSource(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.DamageSource#mobAttack(net.minecraft.server.v1_8_R3.EntityLiving)
     */
    @ReflectiveMethod(name = "mobAttack", types = {NMSEntityLiving.class})
    public NMSDamageSource mobAttack(NMSEntityLiving entityLiving){
        return new NMSDamageSource(NMSWrapper.getInstance().exec(nmsObject, entityLiving));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.DamageSource#o()
     */
    @ReflectiveMethod(name = "o", types = {})
    public boolean o(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.DamageSource#p()
     */
    @ReflectiveMethod(name = "p", types = {})
    public String p(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.DamageSource#playerAttack(net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "playerAttack", types = {NMSEntityHuman.class})
    public NMSDamageSource playerAttack(NMSEntityHuman entityHuman){
        return new NMSDamageSource(NMSWrapper.getInstance().exec(nmsObject, entityHuman));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.DamageSource#projectile(net.minecraft.server.v1_8_R3.Entity, net.minecraft.server.v1_8_R3.Entity)
     */
    @ReflectiveMethod(name = "projectile", types = {NMSEntity.class, NMSEntity.class})
    public NMSDamageSource projectile(NMSEntity entity, NMSEntity entity1){
        return new NMSDamageSource(NMSWrapper.getInstance().exec(nmsObject, entity, entity1));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.DamageSource#q()
     */
    @ReflectiveMethod(name = "q", types = {})
    public NMSDamageSource q(){
        return new NMSDamageSource(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.DamageSource#r()
     */
    @ReflectiveMethod(name = "r", types = {})
    public boolean r(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.DamageSource#setExplosion()
     */
    @ReflectiveMethod(name = "setExplosion", types = {})
    public NMSDamageSource setExplosion(){
        return new NMSDamageSource(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.DamageSource#setIgnoreArmor()
     */
    @ReflectiveMethod(name = "setIgnoreArmor", types = {})
    public NMSDamageSource setIgnoreArmor(){
        return new NMSDamageSource(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.DamageSource#setMagic()
     */
    @ReflectiveMethod(name = "setMagic", types = {})
    public NMSDamageSource setMagic(){
        return new NMSDamageSource(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.DamageSource#u()
     */
    @ReflectiveMethod(name = "u", types = {})
    public boolean u(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}