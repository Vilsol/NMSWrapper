package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PathfinderGoalHurtByTarget")
public class NMSPathfinderGoalHurtByTarget extends NMSPathfinderGoalTarget {

    public NMSPathfinderGoalHurtByTarget(Object nmsObject){
        super(nmsObject);
    }

    public NMSPathfinderGoalHurtByTarget(NMSEntityCreature entityCreature, boolean b, Class[] array){
        super("PathfinderGoalHurtByTarget", new Object[]{NMSEntityCreature.class, boolean.class, Class[].class}, new Object[]{entityCreature, b, array});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalHurtByTarget#a(net.minecraft.server.v1_9_R1.EntityCreature, net.minecraft.server.v1_9_R1.EntityLiving)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityCreature.class, NMSEntityLiving.class})
    public void a(NMSEntityCreature entityCreature, NMSEntityLiving entityLiving){
        NMSWrapper.getInstance().exec(nmsObject, entityCreature, entityLiving);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalHurtByTarget#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public void c(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}