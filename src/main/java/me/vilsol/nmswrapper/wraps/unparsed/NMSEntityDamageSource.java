package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityDamageSource")
public class NMSEntityDamageSource extends NMSDamageSource {

    public NMSEntityDamageSource(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityDamageSource(String s, NMSEntity entity){
        super("EntityDamageSource", new Object[]{String.class, NMSEntity.class}, new Object[]{s, entity});
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityDamageSource#getEntity()
     */
    @ReflectiveMethod(name = "getEntity", types = {})
    public NMSEntity getEntity(){
        return new NMSEntity(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityDamageSource#getLocalizedDeathMessage(net.minecraft.server.v1_8_R3.EntityLiving)
     */
    @ReflectiveMethod(name = "getLocalizedDeathMessage", types = {NMSEntityLiving.class})
    public NMSIChatBaseComponent getLocalizedDeathMessage(NMSEntityLiving entityLiving){
        return new NMSIChatBaseComponent(NMSWrapper.getInstance().exec(nmsObject, entityLiving));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityDamageSource#r()
     */
    @ReflectiveMethod(name = "r", types = {})
    public boolean r(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityDamageSource#v()
     */
    @ReflectiveMethod(name = "v", types = {})
    public NMSEntityDamageSource v(){
        return new NMSEntityDamageSource(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityDamageSource#w()
     */
    @ReflectiveMethod(name = "w", types = {})
    public boolean w(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}