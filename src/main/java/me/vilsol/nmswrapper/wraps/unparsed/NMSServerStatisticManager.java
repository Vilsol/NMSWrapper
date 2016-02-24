package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ServerStatisticManager")
public class NMSServerStatisticManager extends NMSStatisticManager {

    public NMSServerStatisticManager(Object nmsObject){
        super(nmsObject);
    }

    public NMSServerStatisticManager(NMSMinecraftServer minecraftServer, File file){
        super("ServerStatisticManager", new Object[]{NMSMinecraftServer.class, File.class}, new Object[]{minecraftServer, file});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ServerStatisticManager#a(net.minecraft.server.v1_8_R3.EntityPlayer)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityPlayer.class})
    public void a(NMSEntityPlayer entityPlayer){
        NMSWrapper.getInstance().exec(nmsObject, entityPlayer);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ServerStatisticManager#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public void b(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ServerStatisticManager#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public void d(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ServerStatisticManager#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public boolean e(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ServerStatisticManager#setStatistic(net.minecraft.server.v1_8_R3.EntityHuman, net.minecraft.server.v1_8_R3.Statistic, int)
     */
    @ReflectiveMethod(name = "setStatistic", types = {NMSEntityHuman.class, NMSStatistic.class, int.class})
    public void setStatistic(NMSEntityHuman entityHuman, NMSStatistic statistic, int i){
        NMSWrapper.getInstance().exec(nmsObject, entityHuman, statistic, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ServerStatisticManager#updateStatistics(net.minecraft.server.v1_8_R3.EntityPlayer)
     */
    @ReflectiveMethod(name = "updateStatistics", types = {NMSEntityPlayer.class})
    public void updateStatistics(NMSEntityPlayer entityPlayer){
        NMSWrapper.getInstance().exec(nmsObject, entityPlayer);
    }

}