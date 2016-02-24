package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockPredicate")
public class NMSBlockPredicate extends NMSWrap {

    public NMSBlockPredicate(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockPredicate#a(net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "a", types = {NMSIBlockData.class})
    public boolean a(NMSIBlockData iBlockData){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, iBlockData);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockPredicate#apply(java.lang.Object)
     */
    @ReflectiveMethod(name = "apply", types = {Object.class})
    public boolean apply(Object object){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, object);
    }

}