package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PathfinderGoalSelector")
public class NMSPathfinderGoalSelector extends NMSWrap {

    public NMSPathfinderGoalSelector(Object nmsObject){
        super(nmsObject);
    }

    public NMSPathfinderGoalSelector(NMSMethodProfiler methodProfiler){
        super("PathfinderGoalSelector", new Object[]{NMSMethodProfiler.class}, new Object[]{methodProfiler});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalSelector#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public void a(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}