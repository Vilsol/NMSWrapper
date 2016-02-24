package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockStep")
public class NMSBlockStep extends NMSBlockDoubleStepAbstract {

    public NMSBlockStep(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockStep#l()
     */
    @ReflectiveMethod(name = "l", types = {})
    public boolean l(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}