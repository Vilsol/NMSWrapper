package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "StatisticList")
public class NMSStatisticList extends NMSWrap {

    public NMSStatisticList(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.StatisticList#a(net.minecraft.server.v1_8_R3.EntityTypes$MonsterEggInfo)
     */
    @ReflectiveMethod(name = "a", types = {NMSMonsterEggInfo.class})
    public NMSStatistic a(NMSMonsterEggInfo monsterEggInfo){
        return new NMSStatistic(NMSWrapper.getInstance().exec(nmsObject, monsterEggInfo));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.StatisticList#b(net.minecraft.server.v1_8_R3.EntityTypes$MonsterEggInfo)
     */
    @ReflectiveMethod(name = "b", types = {NMSMonsterEggInfo.class})
    public NMSStatistic b(NMSMonsterEggInfo monsterEggInfo){
        return new NMSStatistic(NMSWrapper.getInstance().exec(nmsObject, monsterEggInfo));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.StatisticList#getStatistic(java.lang.String)
     */
    @ReflectiveMethod(name = "getStatistic", types = {String.class})
    public NMSStatistic getStatistic(String s){
        return new NMSStatistic(NMSWrapper.getInstance().exec(nmsObject, s));
    }

}