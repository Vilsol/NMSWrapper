package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PathfinderGoalMoveThroughVillage")
public class NMSPathfinderGoalMoveThroughVillage extends NMSPathfinderGoal {

    public NMSPathfinderGoalMoveThroughVillage(Object nmsObject){
        super(nmsObject);
    }

    public NMSPathfinderGoalMoveThroughVillage(NMSEntityCreature entityCreature, double d, boolean b){
        super("PathfinderGoalMoveThroughVillage", new Object[]{NMSEntityCreature.class, double.class, boolean.class}, new Object[]{entityCreature, d, b});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalMoveThroughVillage#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public boolean a(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalMoveThroughVillage#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public boolean b(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalMoveThroughVillage#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public void c(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalMoveThroughVillage#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public void d(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}