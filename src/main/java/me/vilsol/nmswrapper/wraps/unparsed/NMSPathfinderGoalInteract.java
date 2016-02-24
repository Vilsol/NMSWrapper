package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;

@ReflectiveClass(name = "PathfinderGoalInteract")
public class NMSPathfinderGoalInteract extends NMSPathfinderGoalLookAtPlayer {

    public NMSPathfinderGoalInteract(Object nmsObject){
        super(nmsObject);
    }

    public NMSPathfinderGoalInteract(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}