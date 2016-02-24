package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "CombatTracker")
public class NMSCombatTracker extends NMSWrap {

    public NMSCombatTracker(Object nmsObject){
        super(nmsObject);
    }

    public NMSCombatTracker(NMSEntityLiving entityLiving){
        super("CombatTracker", new Object[]{NMSEntityLiving.class}, new Object[]{entityLiving});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.CombatTracker#a(net.minecraft.server.v1_8_R3.DamageSource, float, float)
     */
    @ReflectiveMethod(name = "a", types = {NMSDamageSource.class, float.class, float.class})
    public void a(NMSDamageSource damageSource, float f, float f1){
        NMSWrapper.getInstance().exec(nmsObject, damageSource, f, f1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.CombatTracker#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public NMSIChatBaseComponent b(){
        return new NMSIChatBaseComponent(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.CombatTracker#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public NMSEntityLiving c(){
        return new NMSEntityLiving(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.CombatTracker#f()
     */
    @ReflectiveMethod(name = "f", types = {})
    public int f(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.CombatTracker#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public void g(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.CombatTracker#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public NMSEntityLiving h(){
        return new NMSEntityLiving(NMSWrapper.getInstance().exec(nmsObject));
    }

}