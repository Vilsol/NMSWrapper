package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PathfinderGoalRandomLookaround")
public class NMSPathfinderGoalRandomLookaround extends NMSPathfinderGoal {

    public NMSPathfinderGoalRandomLookaround(Object nmsObject){
        super(nmsObject);
    }

    public NMSPathfinderGoalRandomLookaround(NMSEntityInsentient entityInsentient){
        super("PathfinderGoalRandomLookaround", new Object[]{NMSEntityInsentient.class}, new Object[]{entityInsentient});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PathfinderGoalRandomLookaround#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public boolean a(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PathfinderGoalRandomLookaround#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public boolean b(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PathfinderGoalRandomLookaround#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public void c(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PathfinderGoalRandomLookaround#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public void e(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}