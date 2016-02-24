package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "StatisticManager")
public class NMSStatisticManager extends NMSWrap {

    public NMSStatisticManager(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.StatisticManager#a(net.minecraft.server.v1_8_R3.Statistic, T)
     */
    @ReflectiveMethod(name = "a", types = {NMSStatistic.class, Object.class})
    public Object a(NMSStatistic statistic, Object t){
        return NMSWrapper.getInstance().exec(nmsObject, statistic, t);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.StatisticManager#b(net.minecraft.server.v1_8_R3.Statistic)
     */
    @ReflectiveMethod(name = "b", types = {NMSStatistic.class})
    public Object b(NMSStatistic statistic){
        return NMSWrapper.getInstance().exec(nmsObject, statistic);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.StatisticManager#getStatisticValue(net.minecraft.server.v1_8_R3.Statistic)
     */
    @ReflectiveMethod(name = "getStatisticValue", types = {NMSStatistic.class})
    public int getStatisticValue(NMSStatistic statistic){
        return (int) NMSWrapper.getInstance().exec(nmsObject, statistic);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.StatisticManager#hasAchievement(net.minecraft.server.v1_8_R3.Achievement)
     */
    @ReflectiveMethod(name = "hasAchievement", types = {NMSAchievement.class})
    public boolean hasAchievement(NMSAchievement achievement){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, achievement);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.StatisticManager#setStatistic(net.minecraft.server.v1_8_R3.EntityHuman, net.minecraft.server.v1_8_R3.Statistic, int)
     */
    @ReflectiveMethod(name = "setStatistic", types = {NMSEntityHuman.class, NMSStatistic.class, int.class})
    public void setStatistic(NMSEntityHuman entityHuman, NMSStatistic statistic, int i){
        NMSWrapper.getInstance().exec(nmsObject, entityHuman, statistic, i);
    }

}