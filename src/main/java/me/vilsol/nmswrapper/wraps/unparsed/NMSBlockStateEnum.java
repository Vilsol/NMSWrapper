package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockStateEnum")
public class NMSBlockStateEnum extends NMSWrap {

    public NMSBlockStateEnum(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockStateEnum#a(java.lang.Comparable)
     */
    @ReflectiveMethod(name = "a", types = {Comparable.class})
    public String a(Comparable comparable){
        return (String) NMSWrapper.getInstance().exec(nmsObject, comparable);
    }

}