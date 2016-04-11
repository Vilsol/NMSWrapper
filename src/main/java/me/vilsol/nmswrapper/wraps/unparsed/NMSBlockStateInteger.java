package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockStateInteger")
public class NMSBlockStateInteger extends NMSBlockState {

    public NMSBlockStateInteger(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockStateInteger#a(java.lang.Comparable)
     */
    @ReflectiveMethod(name = "a", types = {Comparable.class})
    public String a(Comparable comparable){
        return (String) NMSWrapper.getInstance().exec(nmsObject, comparable);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockStateInteger#equals(java.lang.Object)
     */
    @ReflectiveMethod(name = "equals", types = {Object.class})
    public boolean equals(Object object){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockStateInteger#hashCode()
     */
    @ReflectiveMethod(name = "hashCode", types = {})
    public int hashCode(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockStateInteger#of(java.lang.String, int, int)
     */
    @ReflectiveMethod(name = "of", types = {String.class, int.class, int.class})
    public NMSBlockStateInteger of(String s, int i, int i1){
        return new NMSBlockStateInteger(NMSWrapper.getInstance().exec(nmsObject, s, i, i1));
    }

}