package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "CrashReport")
public class NMSCrashReport extends NMSWrap {

    public NMSCrashReport(Object nmsObject){
        super(nmsObject);
    }

    public NMSCrashReport(String s, Throwable throwable){
        super("CrashReport", new Object[]{String.class, Throwable.class}, new Object[]{s, throwable});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.CrashReport#a(java.lang.Throwable, java.lang.String)
     */
    @ReflectiveMethod(name = "a", types = {Throwable.class, String.class})
    public NMSCrashReport a(Throwable throwable, String s){
        return new NMSCrashReport(NMSWrapper.getInstance().exec(nmsObject, throwable, s));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.CrashReport#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public Throwable b(){
        return (Throwable) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.CrashReport#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public String d(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.CrashReport#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public String e(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.CrashReport#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public NMSCrashReportSystemDetails g(){
        return new NMSCrashReportSystemDetails(NMSWrapper.getInstance().exec(nmsObject));
    }

}