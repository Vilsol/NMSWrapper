package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockStatePredicate")
public class NMSBlockStatePredicate extends NMSWrap {

    public NMSBlockStatePredicate(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockStatePredicate#a(net.minecraft.server.v1_9_R1.IBlockData)
     */
    @ReflectiveMethod(name = "a", types = {NMSIBlockData.class})
    public boolean a(NMSIBlockData iBlockData){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, iBlockData);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockStatePredicate#apply(java.lang.Object)
     */
    @ReflectiveMethod(name = "apply", types = {Object.class})
    public boolean apply(Object object){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, object);
    }

}