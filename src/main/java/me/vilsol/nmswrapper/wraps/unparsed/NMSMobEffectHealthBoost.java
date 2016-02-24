package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSEntityLiving;

@ReflectiveClass(name = "MobEffectHealthBoost")
public class NMSMobEffectHealthBoost extends NMSMobEffectList {

    public NMSMobEffectHealthBoost(Object nmsObject){
        super(nmsObject);
    }

    public NMSMobEffectHealthBoost(int i, NMSMinecraftKey minecraftKey, boolean b, int i1){
        super("MobEffectHealthBoost", new Object[]{int.class, NMSMinecraftKey.class, boolean.class, int.class}, new Object[]{i, minecraftKey, b, i1});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MobEffectHealthBoost#a(net.minecraft.server.v1_8_R3.EntityLiving, net.minecraft.server.v1_8_R3.AttributeMapBase, int)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityLiving.class, NMSAttributeMapBase.class, int.class})
    public void a(NMSEntityLiving entityLiving, NMSAttributeMapBase attributeMapBase, int i){
        NMSWrapper.getInstance().exec(nmsObject, entityLiving, attributeMapBase, i);
    }

}