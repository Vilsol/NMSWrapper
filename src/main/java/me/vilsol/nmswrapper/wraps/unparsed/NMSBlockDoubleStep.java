package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockDoubleStep")
public class NMSBlockDoubleStep extends NMSBlockDoubleStepAbstract {

    public NMSBlockDoubleStep(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockDoubleStep#l()
     */
    @ReflectiveMethod(name = "l", types = {})
    public boolean l(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}