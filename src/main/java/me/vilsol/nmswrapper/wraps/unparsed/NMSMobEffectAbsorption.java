package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

@ReflectiveClass(name = "MobEffectAbsorption")
public class NMSMobEffectAbsorption extends NMSMobEffectList {

    public NMSMobEffectAbsorption(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.MobEffectAbsorption#a(net.minecraft.server.v1_9_R1.EntityLiving, net.minecraft.server.v1_9_R1.AttributeMapBase, int)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityLiving.class, NMSAttributeMapBase.class, int.class})
    public void a(NMSEntityLiving entityLiving, NMSAttributeMapBase attributeMapBase, int i){
        NMSWrapper.getInstance().exec(nmsObject, entityLiving, attributeMapBase, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.MobEffectAbsorption#b(net.minecraft.server.v1_9_R1.EntityLiving, net.minecraft.server.v1_9_R1.AttributeMapBase, int)
     */
    @ReflectiveMethod(name = "b", types = {NMSEntityLiving.class, NMSAttributeMapBase.class, int.class})
    public void b(NMSEntityLiving entityLiving, NMSAttributeMapBase attributeMapBase, int i){
        NMSWrapper.getInstance().exec(nmsObject, entityLiving, attributeMapBase, i);
    }

}