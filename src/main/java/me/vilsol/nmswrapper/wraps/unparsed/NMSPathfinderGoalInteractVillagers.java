package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PathfinderGoalInteractVillagers")
public class NMSPathfinderGoalInteractVillagers extends NMSPathfinderGoalInteract {

    public NMSPathfinderGoalInteractVillagers(Object nmsObject){
        super(nmsObject);
    }

    public NMSPathfinderGoalInteractVillagers(NMSEntityVillager entityVillager){
        super("PathfinderGoalInteractVillagers", new Object[]{NMSEntityVillager.class}, new Object[]{entityVillager});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalInteractVillagers#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public void c(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalInteractVillagers#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public void e(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}