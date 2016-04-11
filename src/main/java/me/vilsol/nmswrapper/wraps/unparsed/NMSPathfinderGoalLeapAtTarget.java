package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PathfinderGoalLeapAtTarget")
public class NMSPathfinderGoalLeapAtTarget extends NMSPathfinderGoal {

    public NMSPathfinderGoalLeapAtTarget(Object nmsObject){
        super(nmsObject);
    }

    public NMSPathfinderGoalLeapAtTarget(NMSEntityInsentient entityInsentient, float f){
        super("PathfinderGoalLeapAtTarget", new Object[]{NMSEntityInsentient.class, float.class}, new Object[]{entityInsentient, f});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalLeapAtTarget#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public boolean a(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalLeapAtTarget#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public boolean b(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalLeapAtTarget#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public void c(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}