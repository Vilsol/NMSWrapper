package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWrap;

import java.net.URL;
import java.util.Map;

@ReflectiveClass(name = "MojangStatisticsGenerator")
public class NMSMojangStatisticsGenerator extends NMSWrap {

    public NMSMojangStatisticsGenerator(Object nmsObject){
        super(nmsObject);
    }

    public NMSMojangStatisticsGenerator(String s, NMSIMojangStatistics iMojangStatistics, long l){
        super("MojangStatisticsGenerator", new Object[]{String.class, NMSIMojangStatistics.class, long.class}, new Object[]{s, iMojangStatistics, l});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.MojangStatisticsGenerator#a(net.minecraft.server.v1_9_R1.MojangStatisticsGenerator)
     */
    @ReflectiveMethod(name = "a", types = {NMSMojangStatisticsGenerator.class})
    public NMSIMojangStatistics a(NMSMojangStatisticsGenerator mojangStatisticsGenerator){
        return (NMSIMojangStatistics) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject, mojangStatisticsGenerator));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.MojangStatisticsGenerator#b(net.minecraft.server.v1_9_R1.MojangStatisticsGenerator)
     */
    @ReflectiveMethod(name = "b", types = {NMSMojangStatisticsGenerator.class})
    public Object b(NMSMojangStatisticsGenerator mojangStatisticsGenerator){
        return NMSWrapper.getInstance().exec(nmsObject, mojangStatisticsGenerator);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.MojangStatisticsGenerator#c(net.minecraft.server.v1_9_R1.MojangStatisticsGenerator)
     */
    @ReflectiveMethod(name = "c", types = {NMSMojangStatisticsGenerator.class})
    public Map c(NMSMojangStatisticsGenerator mojangStatisticsGenerator){
        return (Map) NMSWrapper.getInstance().exec(nmsObject, mojangStatisticsGenerator);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.MojangStatisticsGenerator#d(net.minecraft.server.v1_9_R1.MojangStatisticsGenerator)
     */
    @ReflectiveMethod(name = "d", types = {NMSMojangStatisticsGenerator.class})
    public int d(NMSMojangStatisticsGenerator mojangStatisticsGenerator){
        return (int) NMSWrapper.getInstance().exec(nmsObject, mojangStatisticsGenerator);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.MojangStatisticsGenerator#e(net.minecraft.server.v1_9_R1.MojangStatisticsGenerator)
     */
    @ReflectiveMethod(name = "e", types = {NMSMojangStatisticsGenerator.class})
    public Map e(NMSMojangStatisticsGenerator mojangStatisticsGenerator){
        return (Map) NMSWrapper.getInstance().exec(nmsObject, mojangStatisticsGenerator);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.MojangStatisticsGenerator#f(net.minecraft.server.v1_9_R1.MojangStatisticsGenerator)
     */
    @ReflectiveMethod(name = "f", types = {NMSMojangStatisticsGenerator.class})
    public int f(NMSMojangStatisticsGenerator mojangStatisticsGenerator){
        return (int) NMSWrapper.getInstance().exec(nmsObject, mojangStatisticsGenerator);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.MojangStatisticsGenerator#g(net.minecraft.server.v1_9_R1.MojangStatisticsGenerator)
     */
    @ReflectiveMethod(name = "g", types = {NMSMojangStatisticsGenerator.class})
    public String g(NMSMojangStatisticsGenerator mojangStatisticsGenerator){
        return (String) NMSWrapper.getInstance().exec(nmsObject, mojangStatisticsGenerator);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.MojangStatisticsGenerator#h(net.minecraft.server.v1_9_R1.MojangStatisticsGenerator)
     */
    @ReflectiveMethod(name = "h", types = {NMSMojangStatisticsGenerator.class})
    public URL h(NMSMojangStatisticsGenerator mojangStatisticsGenerator){
        return (URL) NMSWrapper.getInstance().exec(nmsObject, mojangStatisticsGenerator);
    }

}