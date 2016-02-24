package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWrap;

@ReflectiveClass(name = "StatisticList")
public class NMSStatisticList extends NMSWrap {

    public NMSStatisticList(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.StatisticList#a(net.minecraft.server.v1_8_R3.EntityTypes$MonsterEggInfo)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityTypes.NMSMonsterEggInfo.class})
    public NMSStatistic a(NMSEntityTypes.NMSMonsterEggInfo monsterEggInfo){
        return new NMSStatistic(NMSWrapper.getInstance().exec(nmsObject, monsterEggInfo));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.StatisticList#b(net.minecraft.server.v1_8_R3.EntityTypes$MonsterEggInfo)
     */
    @ReflectiveMethod(name = "b", types = {NMSEntityTypes.NMSMonsterEggInfo.class})
    public NMSStatistic b(NMSEntityTypes.NMSMonsterEggInfo monsterEggInfo){
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