package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockStateDirection")
public class NMSBlockStateDirection extends NMSBlockStateEnum {

    public NMSBlockStateDirection(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockStateDirection#of(java.lang.String)
     */
    @ReflectiveMethod(name = "of", types = {String.class})
    public NMSBlockStateDirection of(String s){
        return new NMSBlockStateDirection(NMSWrapper.getInstance().exec(nmsObject, s));
    }

}