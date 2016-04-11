package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

@ReflectiveClass(name = "ServerStatisticManager")
public class NMSServerStatisticManager extends NMSStatisticManager {

    public NMSServerStatisticManager(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ServerStatisticManager#a(net.minecraft.server.v1_9_R1.EntityPlayer)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityPlayer.class})
    public void a(NMSEntityPlayer entityPlayer){
        NMSWrapper.getInstance().exec(nmsObject, entityPlayer);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ServerStatisticManager#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public void b(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ServerStatisticManager#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public void d(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ServerStatisticManager#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public boolean e(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ServerStatisticManager#setStatistic(net.minecraft.server.v1_9_R1.EntityHuman, net.minecraft.server.v1_9_R1.Statistic, int)
     */
    @ReflectiveMethod(name = "setStatistic", types = {NMSEntityHuman.class, NMSStatistic.class, int.class})
    public void setStatistic(NMSEntityHuman entityHuman, NMSStatistic statistic, int i){
        NMSWrapper.getInstance().exec(nmsObject, entityHuman, statistic, i);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ServerStatisticManager#updateStatistics(net.minecraft.server.v1_9_R1.EntityPlayer)
     */
    @ReflectiveMethod(name = "updateStatistics", types = {NMSEntityPlayer.class})
    public void updateStatistics(NMSEntityPlayer entityPlayer){
        NMSWrapper.getInstance().exec(nmsObject, entityPlayer);
    }

}