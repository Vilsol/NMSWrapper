package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "CrashReportSystemDetails")
public class NMSCrashReportSystemDetails extends NMSWrap {

    public NMSCrashReportSystemDetails(Object nmsObject){
        super(nmsObject);
    }

    public NMSCrashReportSystemDetails(NMSCrashReport crashReport, String s){
        super("CrashReportSystemDetails", new Object[]{NMSCrashReport.class, String.class}, new Object[]{crashReport, s});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.CrashReportSystemDetails#a(net.minecraft.server.v1_9_R1.CrashReportSystemDetails, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.IBlockData)
     */
    @ReflectiveMethod(name = "a", types = {NMSCrashReportSystemDetails.class, NMSBlockPosition.class, NMSIBlockData.class})
    public void a(NMSCrashReportSystemDetails crashReportSystemDetails, NMSBlockPosition blockPosition, NMSIBlockData iBlockData){
        NMSWrapper.getInstance().exec(nmsObject, crashReportSystemDetails, blockPosition, iBlockData);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.CrashReportSystemDetails#b(int)
     */
    @ReflectiveMethod(name = "b", types = {int.class})
    public void b(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

}