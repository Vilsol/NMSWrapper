package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

@ReflectiveClass(name = "PathfinderGoalTarget")
public class NMSPathfinderGoalTarget extends NMSPathfinderGoal {

    public NMSPathfinderGoalTarget(Object nmsObject){
        super(nmsObject);
    }

    public NMSPathfinderGoalTarget(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    public NMSPathfinderGoalTarget(NMSEntityCreature entityCreature, boolean b){
        super("PathfinderGoalTarget", new Object[]{NMSEntityCreature.class, boolean.class}, new Object[]{entityCreature, b});
    }

    public NMSPathfinderGoalTarget(NMSEntityCreature entityCreature, boolean b, boolean b1){
        super("PathfinderGoalTarget", new Object[]{NMSEntityCreature.class, boolean.class, boolean.class}, new Object[]{entityCreature, b, b1});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalTarget#a(net.minecraft.server.v1_9_R1.EntityLiving, boolean)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityLiving.class, boolean.class})
    public boolean a(NMSEntityLiving entityLiving, boolean b){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityLiving, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalTarget#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public boolean b(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalTarget#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public void c(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalTarget#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public void d(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalTarget#f()
     */
    @ReflectiveMethod(name = "f", types = {})
    public double f(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

}