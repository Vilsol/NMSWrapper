package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "Tuple")
public class NMSTuple extends NMSWrap {

    public NMSTuple(Object nmsObject){
        super(nmsObject);
    }

    public NMSTuple(A a, B b){
        super("Tuple", new Object[]{A.class, B.class}, new Object[]{a, b});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Tuple#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public A a(){
        return new A(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Tuple#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public B b(){
        return new B(NMSWrapper.getInstance().exec(nmsObject));
    }

}