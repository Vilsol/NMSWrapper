package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "MobEffectAttackDamage")
public class NMSMobEffectAttackDamage extends NMSMobEffectList {

    public NMSMobEffectAttackDamage(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.MobEffectAttackDamage#a(int, net.minecraft.server.v1_9_R1.AttributeModifier)
     */
    @ReflectiveMethod(name = "a", types = {int.class, NMSAttributeModifier.class})
    public double a(int i, NMSAttributeModifier attributeModifier){
        return (double) NMSWrapper.getInstance().exec(nmsObject, i, attributeModifier);
    }

}