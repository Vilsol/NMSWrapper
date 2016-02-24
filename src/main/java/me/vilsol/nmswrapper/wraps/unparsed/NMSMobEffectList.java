package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWrap;

@ReflectiveClass(name = "MobEffectList")
public class NMSMobEffectList extends NMSWrap {

    public NMSMobEffectList(Object nmsObject){
        super(nmsObject);
    }

    public NMSMobEffectList(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MobEffectList#a(int, net.minecraft.server.v1_8_R3.AttributeModifier)
     */
    @ReflectiveMethod(name = "a", types = {int.class, NMSAttributeModifier.class})
    public double a(int i, NMSAttributeModifier attributeModifier){
        return (double) NMSWrapper.getInstance().exec(nmsObject, i, attributeModifier);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MobEffectList#applyInstantEffect(net.minecraft.server.v1_8_R3.Entity, net.minecraft.server.v1_8_R3.Entity, net.minecraft.server.v1_8_R3.EntityLiving, int, double)
     */
    @ReflectiveMethod(name = "applyInstantEffect", types = {NMSEntity.class, NMSEntity.class, NMSEntityLiving.class, int.class, double.class})
    public void applyInstantEffect(NMSEntity entity, NMSEntity entity1, NMSEntityLiving entityLiving, int i, double d){
        NMSWrapper.getInstance().exec(nmsObject, entity, entity1, entityLiving, i, d);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MobEffectList#b(net.minecraft.server.v1_8_R3.EntityLiving, net.minecraft.server.v1_8_R3.AttributeMapBase, int)
     */
    @ReflectiveMethod(name = "b", types = {NMSEntityLiving.class, NMSAttributeMapBase.class, int.class})
    public void b(NMSEntityLiving entityLiving, NMSAttributeMapBase attributeMapBase, int i){
        NMSWrapper.getInstance().exec(nmsObject, entityLiving, attributeMapBase, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MobEffectList#c(java.lang.String)
     */
    @ReflectiveMethod(name = "c", types = {String.class})
    public NMSMobEffectList c(String s){
        return new NMSMobEffectList(NMSWrapper.getInstance().exec(nmsObject, s));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MobEffectList#getDurationModifier()
     */
    @ReflectiveMethod(name = "getDurationModifier", types = {})
    public double getDurationModifier(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MobEffectList#getId()
     */
    @ReflectiveMethod(name = "getId", types = {})
    public int getId(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MobEffectList#isInstant()
     */
    @ReflectiveMethod(name = "isInstant", types = {})
    public boolean isInstant(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MobEffectList#j()
     */
    @ReflectiveMethod(name = "j", types = {})
    public boolean j(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MobEffectList#k()
     */
    @ReflectiveMethod(name = "k", types = {})
    public int k(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MobEffectList#tick(net.minecraft.server.v1_8_R3.EntityLiving, int)
     */
    @ReflectiveMethod(name = "tick", types = {NMSEntityLiving.class, int.class})
    public void tick(NMSEntityLiving entityLiving, int i){
        NMSWrapper.getInstance().exec(nmsObject, entityLiving, i);
    }

}