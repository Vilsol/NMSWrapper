package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PathfinderGoalLookAtTradingPlayer")
public class NMSPathfinderGoalLookAtTradingPlayer extends NMSPathfinderGoalLookAtPlayer {

    public NMSPathfinderGoalLookAtTradingPlayer(Object nmsObject){
        super(nmsObject);
    }

    public NMSPathfinderGoalLookAtTradingPlayer(NMSEntityVillager entityVillager){
        super("PathfinderGoalLookAtTradingPlayer", new Object[]{NMSEntityVillager.class}, new Object[]{entityVillager});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalLookAtTradingPlayer#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public boolean a(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}