package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ControllerJump")
public class NMSControllerJump extends NMSWrap {

    public NMSControllerJump(Object nmsObject){
        super(nmsObject);
    }

    public NMSControllerJump(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    public NMSControllerJump(NMSEntityInsentient entityInsentient){
        super("ControllerJump", new Object[]{NMSEntityInsentient.class}, new Object[]{entityInsentient});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ControllerJump#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public void a(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ControllerJump#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public void b(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}