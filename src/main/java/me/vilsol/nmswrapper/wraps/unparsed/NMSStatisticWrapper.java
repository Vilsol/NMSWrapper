package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "StatisticWrapper")
public class NMSStatisticWrapper extends NMSWrap {

    public NMSStatisticWrapper(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.StatisticWrapper#a(net.minecraft.server.v1_8_R3.IJsonStatistic)
     */
    @ReflectiveMethod(name = "a", types = {NMSIJsonStatistic.class})
    public void a(NMSIJsonStatistic iJsonStatistic){
        NMSWrapper.getInstance().exec(nmsObject, iJsonStatistic);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.StatisticWrapper#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public T b(){
        return new T(NMSWrapper.getInstance().exec(nmsObject));
    }

}