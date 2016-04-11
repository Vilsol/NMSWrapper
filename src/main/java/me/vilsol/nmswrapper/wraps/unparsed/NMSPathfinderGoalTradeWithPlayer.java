package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PathfinderGoalTradeWithPlayer")
public class NMSPathfinderGoalTradeWithPlayer extends NMSPathfinderGoal {

    public NMSPathfinderGoalTradeWithPlayer(Object nmsObject){
        super(nmsObject);
    }

    public NMSPathfinderGoalTradeWithPlayer(NMSEntityVillager entityVillager){
        super("PathfinderGoalTradeWithPlayer", new Object[]{NMSEntityVillager.class}, new Object[]{entityVillager});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalTradeWithPlayer#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public boolean a(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalTradeWithPlayer#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public void c(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalTradeWithPlayer#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public void d(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}