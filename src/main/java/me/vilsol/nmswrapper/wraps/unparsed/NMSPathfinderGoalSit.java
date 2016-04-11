package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PathfinderGoalSit")
public class NMSPathfinderGoalSit extends NMSPathfinderGoal {

    public NMSPathfinderGoalSit(Object nmsObject){
        super(nmsObject);
    }

    public NMSPathfinderGoalSit(NMSEntityTameableAnimal entityTameableAnimal){
        super("PathfinderGoalSit", new Object[]{NMSEntityTameableAnimal.class}, new Object[]{entityTameableAnimal});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalSit#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public boolean a(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalSit#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public void c(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalSit#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public void d(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalSit#setSitting(boolean)
     */
    @ReflectiveMethod(name = "setSitting", types = {boolean.class})
    public void setSitting(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

}