package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PathfinderGoalArrowAttack")
public class NMSPathfinderGoalArrowAttack extends NMSPathfinderGoal {

    public NMSPathfinderGoalArrowAttack(Object nmsObject){
        super(nmsObject);
    }

    public NMSPathfinderGoalArrowAttack(NMSIRangedEntity iRangedEntity, double d, int i, float f){
        super("PathfinderGoalArrowAttack", new Object[]{NMSIRangedEntity.class, double.class, int.class, float.class}, new Object[]{iRangedEntity, d, i, f});
    }

    public NMSPathfinderGoalArrowAttack(NMSIRangedEntity iRangedEntity, double d, int i, int i1, float f){
        super("PathfinderGoalArrowAttack", new Object[]{NMSIRangedEntity.class, double.class, int.class, int.class, float.class}, new Object[]{iRangedEntity, d, i, i1, f});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PathfinderGoalArrowAttack#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public boolean a(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PathfinderGoalArrowAttack#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public boolean b(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PathfinderGoalArrowAttack#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public void d(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PathfinderGoalArrowAttack#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public void e(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}