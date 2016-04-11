package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PathfinderGoalMoveTowardsTarget")
public class NMSPathfinderGoalMoveTowardsTarget extends NMSPathfinderGoal {

    public NMSPathfinderGoalMoveTowardsTarget(Object nmsObject){
        super(nmsObject);
    }

    public NMSPathfinderGoalMoveTowardsTarget(NMSEntityCreature entityCreature, double d, float f){
        super("PathfinderGoalMoveTowardsTarget", new Object[]{NMSEntityCreature.class, double.class, float.class}, new Object[]{entityCreature, d, f});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalMoveTowardsTarget#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public boolean a(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalMoveTowardsTarget#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public boolean b(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalMoveTowardsTarget#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public void c(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalMoveTowardsTarget#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public void d(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}