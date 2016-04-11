package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockStateBoolean")
public class NMSBlockStateBoolean extends NMSBlockState {

    public NMSBlockStateBoolean(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockStateBoolean#a(java.lang.Comparable)
     */
    @ReflectiveMethod(name = "a", types = {Comparable.class})
    public String a(Comparable comparable){
        return (String) NMSWrapper.getInstance().exec(nmsObject, comparable);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockStateBoolean#of(java.lang.String)
     */
    @ReflectiveMethod(name = "of", types = {String.class})
    public NMSBlockStateBoolean of(String s){
        return new NMSBlockStateBoolean(NMSWrapper.getInstance().exec(nmsObject, s));
    }

}