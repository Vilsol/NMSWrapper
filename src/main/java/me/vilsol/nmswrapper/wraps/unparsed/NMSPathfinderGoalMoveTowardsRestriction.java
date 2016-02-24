package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PathfinderGoalMoveTowardsRestriction")
public class NMSPathfinderGoalMoveTowardsRestriction extends NMSPathfinderGoal {

    public NMSPathfinderGoalMoveTowardsRestriction(Object nmsObject){
        super(nmsObject);
    }

    public NMSPathfinderGoalMoveTowardsRestriction(NMSEntityCreature entityCreature, double d){
        super("PathfinderGoalMoveTowardsRestriction", new Object[]{NMSEntityCreature.class, double.class}, new Object[]{entityCreature, d});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PathfinderGoalMoveTowardsRestriction#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public boolean a(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PathfinderGoalMoveTowardsRestriction#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public boolean b(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PathfinderGoalMoveTowardsRestriction#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public void c(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}