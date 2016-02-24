package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityDamageSourceIndirect")
public class NMSEntityDamageSourceIndirect extends NMSEntityDamageSource {

    public NMSEntityDamageSourceIndirect(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityDamageSourceIndirect(String s, NMSEntity entity, NMSEntity entity1){
        super("EntityDamageSourceIndirect", new Object[]{String.class, NMSEntity.class, NMSEntity.class}, new Object[]{s, entity, entity1});
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityDamageSourceIndirect#getEntity()
     */
    @ReflectiveMethod(name = "getEntity", types = {})
    public NMSEntity getEntity(){
        return new NMSEntity(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityDamageSourceIndirect#getLocalizedDeathMessage(net.minecraft.server.v1_8_R3.EntityLiving)
     */
    @ReflectiveMethod(name = "getLocalizedDeathMessage", types = {NMSEntityLiving.class})
    public NMSIChatBaseComponent getLocalizedDeathMessage(NMSEntityLiving entityLiving){
        return new NMSIChatBaseComponent(NMSWrapper.getInstance().exec(nmsObject, entityLiving));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityDamageSourceIndirect#getProximateDamageSource()
     */
    @ReflectiveMethod(name = "getProximateDamageSource", types = {})
    public NMSEntity getProximateDamageSource(){
        return new NMSEntity(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityDamageSourceIndirect#i()
     */
    @ReflectiveMethod(name = "i", types = {})
    public NMSEntity i(){
        return new NMSEntity(NMSWrapper.getInstance().exec(nmsObject));
    }

}