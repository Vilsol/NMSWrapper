package me.vilsol.nmswrapper.wraps.unparsed;


import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "PathfinderGoal")
public class NMSPathfinderGoal extends NMSWrap {

    public NMSPathfinderGoal(Object nmsObject) {
        super(nmsObject);
    }

    public NMSPathfinderGoal(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

}
