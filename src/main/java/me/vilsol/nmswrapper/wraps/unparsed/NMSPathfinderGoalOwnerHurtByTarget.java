package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PathfinderGoalOwnerHurtByTarget")
public class NMSPathfinderGoalOwnerHurtByTarget extends NMSPathfinderGoalTarget {

    public NMSPathfinderGoalOwnerHurtByTarget(Object nmsObject){
        super(nmsObject);
    }

    public NMSPathfinderGoalOwnerHurtByTarget(NMSEntityTameableAnimal entityTameableAnimal){
        super("PathfinderGoalOwnerHurtByTarget", new Object[]{NMSEntityTameableAnimal.class}, new Object[]{entityTameableAnimal});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalOwnerHurtByTarget#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public boolean a(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalOwnerHurtByTarget#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public void c(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}