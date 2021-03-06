package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ReportedException")
public class NMSReportedException extends NMSWrap {

    public NMSReportedException(Object nmsObject){
        super(nmsObject);
    }

    public NMSReportedException(NMSCrashReport crashReport){
        super("ReportedException", new Object[]{NMSCrashReport.class}, new Object[]{crashReport});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ReportedException#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public NMSCrashReport a(){
        return new NMSCrashReport(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ReportedException#getCause()
     */
    @ReflectiveMethod(name = "getCause", types = {})
    public Throwable getCause(){
        return (Throwable) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ReportedException#getMessage()
     */
    @ReflectiveMethod(name = "getMessage", types = {})
    public String getMessage(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}