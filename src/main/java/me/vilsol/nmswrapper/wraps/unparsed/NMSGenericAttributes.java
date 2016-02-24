package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "GenericAttributes")
public class NMSGenericAttributes extends NMSWrap {

    public NMSGenericAttributes(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.GenericAttributes#a(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "a", types = {NMSNBTTagCompound.class})
    public NMSAttributeModifier a(NMSNBTTagCompound nBTTagCompound){
        return new NMSAttributeModifier(NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound));
    }

}