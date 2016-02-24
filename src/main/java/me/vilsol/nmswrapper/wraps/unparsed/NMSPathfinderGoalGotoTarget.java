package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "PathFinderGoalGotoTarget")
public class NMSPathfinderGoalGotoTarget extends NMSWrap {
    public NMSPathfinderGoalGotoTarget(Object nmsObject) {
        super(nmsObject);
    }

    public NMSPathfinderGoalGotoTarget(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }
}
