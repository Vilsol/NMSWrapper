package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "CommandObjectiveExecutor")
public class NMSCommandObjectiveExecutor extends NMSWrap {

    public NMSCommandObjectiveExecutor(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.CommandObjectiveExecutor#a(net.minecraft.server.v1_8_R3.CommandObjectiveExecutor)
     */
    @ReflectiveMethod(name = "a", types = {NMSCommandObjectiveExecutor.class})
    public void a(NMSCommandObjectiveExecutor commandObjectiveExecutor){
        NMSWrapper.getInstance().exec(nmsObject, commandObjectiveExecutor);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.CommandObjectiveExecutor#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public void b(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

}