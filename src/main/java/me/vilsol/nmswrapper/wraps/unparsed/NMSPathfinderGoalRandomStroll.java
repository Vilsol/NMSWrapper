package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PathfinderGoalRandomStroll")
public class NMSPathfinderGoalRandomStroll extends NMSPathfinderGoal {

    public NMSPathfinderGoalRandomStroll(Object nmsObject){
        super(nmsObject);
    }

    public NMSPathfinderGoalRandomStroll(NMSEntityCreature entityCreature, double d){
        super("PathfinderGoalRandomStroll", new Object[]{NMSEntityCreature.class, double.class}, new Object[]{entityCreature, d});
    }

    public NMSPathfinderGoalRandomStroll(NMSEntityCreature entityCreature, double d, int i){
        super("PathfinderGoalRandomStroll", new Object[]{NMSEntityCreature.class, double.class, int.class}, new Object[]{entityCreature, d, i});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalRandomStroll#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public boolean a(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalRandomStroll#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public boolean b(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalRandomStroll#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public void c(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalRandomStroll#f()
     */
    @ReflectiveMethod(name = "f", types = {})
    public void f(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalRandomStroll#setTimeBetweenMovement(int)
     */
    @ReflectiveMethod(name = "setTimeBetweenMovement", types = {int.class})
    public void setTimeBetweenMovement(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

}