package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "MobEffectAbsorption")
public class NMSMobEffectAbsorption extends NMSMobEffectList {

    public NMSMobEffectAbsorption(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MobEffectAbsorption#a(net.minecraft.server.v1_8_R3.EntityLiving, net.minecraft.server.v1_8_R3.AttributeMapBase, int)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityLiving.class, NMSAttributeMapBase.class, int.class})
    public void a(NMSEntityLiving entityLiving, NMSAttributeMapBase attributeMapBase, int i){
        NMSWrapper.getInstance().exec(nmsObject, entityLiving, attributeMapBase, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MobEffectAbsorption#b(net.minecraft.server.v1_8_R3.EntityLiving, net.minecraft.server.v1_8_R3.AttributeMapBase, int)
     */
    @ReflectiveMethod(name = "b", types = {NMSEntityLiving.class, NMSAttributeMapBase.class, int.class})
    public void b(NMSEntityLiving entityLiving, NMSAttributeMapBase attributeMapBase, int i){
        NMSWrapper.getInstance().exec(nmsObject, entityLiving, attributeMapBase, i);
    }

}