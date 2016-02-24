package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PathfinderGoalMeleeAttack")
public class NMSPathfinderGoalMeleeAttack extends NMSPathfinderGoal {

    public NMSPathfinderGoalMeleeAttack(Object nmsObject){
        super(nmsObject);
    }

    public NMSPathfinderGoalMeleeAttack(NMSEntityCreature entityCreature, double d, boolean b){
        super("PathfinderGoalMeleeAttack", new Object[]{NMSEntityCreature.class, double.class, boolean.class}, new Object[]{entityCreature, d, b});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PathfinderGoalMeleeAttack#a(net.minecraft.server.v1_8_R3.EntityLiving)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityLiving.class})
    public double a(NMSEntityLiving entityLiving){
        return (double) NMSWrapper.getInstance().exec(nmsObject, entityLiving);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PathfinderGoalMeleeAttack#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public boolean b(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PathfinderGoalMeleeAttack#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public void c(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PathfinderGoalMeleeAttack#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public void d(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PathfinderGoalMeleeAttack#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public void e(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}