package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "Statistic")
public class NMSStatistic extends NMSWrap {

    public NMSStatistic(Object nmsObject){
        super(nmsObject);
    }

    public NMSStatistic(String s, NMSIChatBaseComponent iChatBaseComponent, NMSCounter counter){
        super("Statistic", new Object[]{String.class, NMSIChatBaseComponent.class, NMSCounter.class}, new Object[]{s, iChatBaseComponent, counter});
    }

    public NMSStatistic(String s, NMSIChatBaseComponent iChatBaseComponent){
        super("Statistic", new Object[]{String.class, NMSIChatBaseComponent.class}, new Object[]{s, iChatBaseComponent});
    }

    public NMSStatistic(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Statistic#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public boolean d(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Statistic#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public NMSIChatBaseComponent e(){
        return (NMSIChatBaseComponent) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Statistic#equals(java.lang.Object)
     */
    @ReflectiveMethod(name = "equals", types = {Object.class})
    public boolean equals(Object object){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Statistic#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public NMSStatistic h(){
        return new NMSStatistic(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Statistic#hashCode()
     */
    @ReflectiveMethod(name = "hashCode", types = {})
    public int hashCode(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Statistic#i()
     */
    @ReflectiveMethod(name = "i", types = {})
    public NMSStatistic i(){
        return new NMSStatistic(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Statistic#j()
     */
    @ReflectiveMethod(name = "j", types = {})
    public NMSIChatBaseComponent j(){
        return (NMSIChatBaseComponent) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Statistic#k()
     */
    @ReflectiveMethod(name = "k", types = {})
    public NMSIScoreboardCriteria k(){
        return (NMSIScoreboardCriteria) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Statistic#toString()
     */
    @ReflectiveMethod(name = "toString", types = {})
    public String toString(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}