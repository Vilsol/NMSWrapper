package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PathfinderGoalRestrictSun")
public class NMSPathfinderGoalRestrictSun extends NMSPathfinderGoal {

    public NMSPathfinderGoalRestrictSun(Object nmsObject){
        super(nmsObject);
    }

    public NMSPathfinderGoalRestrictSun(NMSEntityCreature entityCreature){
        super("PathfinderGoalRestrictSun", new Object[]{NMSEntityCreature.class}, new Object[]{entityCreature});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalRestrictSun#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public boolean a(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalRestrictSun#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public void c(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalRestrictSun#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public void d(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}