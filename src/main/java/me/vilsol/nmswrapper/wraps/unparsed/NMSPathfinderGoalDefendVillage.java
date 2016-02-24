package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PathfinderGoalDefendVillage")
public class NMSPathfinderGoalDefendVillage extends NMSPathfinderGoalTarget {

    public NMSPathfinderGoalDefendVillage(Object nmsObject){
        super(nmsObject);
    }

    public NMSPathfinderGoalDefendVillage(NMSEntityIronGolem entityIronGolem){
        super("PathfinderGoalDefendVillage", new Object[]{NMSEntityIronGolem.class}, new Object[]{entityIronGolem});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PathfinderGoalDefendVillage#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public boolean a(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PathfinderGoalDefendVillage#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public void c(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}