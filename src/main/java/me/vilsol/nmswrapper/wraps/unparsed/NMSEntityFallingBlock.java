package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityFallingBlock")
public class NMSEntityFallingBlock extends NMSEntity {

    public NMSEntityFallingBlock(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityFallingBlock(NMSWorld world){
        super("EntityFallingBlock", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    public NMSEntityFallingBlock(NMSWorld world, double d, double d1, double d2, NMSIBlockData iBlockData){
        super("EntityFallingBlock", new Object[]{NMSWorld.class, double.class, double.class, double.class, NMSIBlockData.class}, new Object[]{world, d, d1, d2, iBlockData});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityFallingBlock#a(boolean)
     */
    @ReflectiveMethod(name = "a", types = {boolean.class})
    public void a(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityFallingBlock#ad()
     */
    @ReflectiveMethod(name = "ad", types = {})
    public boolean ad(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityFallingBlock#appendEntityCrashDetails(net.minecraft.server.v1_8_R3.CrashReportSystemDetails)
     */
    @ReflectiveMethod(name = "appendEntityCrashDetails", types = {NMSCrashReportSystemDetails.class})
    public void appendEntityCrashDetails(NMSCrashReportSystemDetails crashReportSystemDetails){
        NMSWrapper.getInstance().exec(nmsObject, crashReportSystemDetails);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityFallingBlock#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public void b(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityFallingBlock#e(float, float)
     */
    @ReflectiveMethod(name = "e", types = {float.class, float.class})
    public void e(float f, float f1){
        NMSWrapper.getInstance().exec(nmsObject, f, f1);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityFallingBlock#getBlock()
     */
    @ReflectiveMethod(name = "getBlock", types = {})
    public NMSIBlockData getBlock(){
        return (NMSIBlockData) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityFallingBlock#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public void h(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityFallingBlock#s_()
     */
    @ReflectiveMethod(name = "s_", types = {})
    public boolean s_(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityFallingBlock#t_()
     */
    @ReflectiveMethod(name = "t_", types = {})
    public void t_(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}