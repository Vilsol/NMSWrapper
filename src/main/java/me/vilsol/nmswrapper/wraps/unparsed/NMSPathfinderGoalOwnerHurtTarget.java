package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PathfinderGoalOwnerHurtTarget")
public class NMSPathfinderGoalOwnerHurtTarget extends NMSPathfinderGoalTarget {

    public NMSPathfinderGoalOwnerHurtTarget(Object nmsObject){
        super(nmsObject);
    }

    public NMSPathfinderGoalOwnerHurtTarget(NMSEntityTameableAnimal entityTameableAnimal){
        super("PathfinderGoalOwnerHurtTarget", new Object[]{NMSEntityTameableAnimal.class}, new Object[]{entityTameableAnimal});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PathfinderGoalOwnerHurtTarget#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public boolean a(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PathfinderGoalOwnerHurtTarget#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public void c(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}