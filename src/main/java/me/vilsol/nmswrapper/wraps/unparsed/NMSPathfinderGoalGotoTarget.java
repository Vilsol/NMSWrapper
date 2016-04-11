package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

@ReflectiveClass(name = "PathfinderGoalGotoTarget")
public class NMSPathfinderGoalGotoTarget extends NMSPathfinderGoal {

    public NMSPathfinderGoalGotoTarget(Object nmsObject){
        super(nmsObject);
    }

    public NMSPathfinderGoalGotoTarget(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    public NMSPathfinderGoalGotoTarget(NMSEntityCreature entityCreature, double d, int i){
        super("PathfinderGoalGotoTarget", new Object[]{NMSEntityCreature.class, double.class, int.class}, new Object[]{entityCreature, d, i});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalGotoTarget#a(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition)
     */
    @ReflectiveMethod(name = "a", types = {NMSWorld.class, NMSBlockPosition.class})
    public boolean a(NMSWorld world, NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, blockPosition);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalGotoTarget#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public boolean b(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalGotoTarget#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public void c(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalGotoTarget#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public void d(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalGotoTarget#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public void e(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalGotoTarget#f()
     */
    @ReflectiveMethod(name = "f", types = {})
    public boolean f(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}