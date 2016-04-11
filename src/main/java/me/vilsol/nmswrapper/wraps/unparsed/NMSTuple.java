package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "Tuple")
public class NMSTuple extends NMSWrap {

    public NMSTuple(Object nmsObject){
        super(nmsObject);
    }

    public NMSTuple(Object a, Object b){
        super("Tuple", new Object[]{Object.class, Object.class}, new Object[]{a, b});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Tuple#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public Object a(){
        return NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Tuple#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public Object b(){
        return NMSWrapper.getInstance().exec(nmsObject);
    }

}