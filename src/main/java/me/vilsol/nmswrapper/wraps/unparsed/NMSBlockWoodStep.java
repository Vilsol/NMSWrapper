package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockWoodStep")
public class NMSBlockWoodStep extends NMSBlockWoodenStep {

    public NMSBlockWoodStep(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockWoodStep#l()
     */
    @ReflectiveMethod(name = "l", types = {})
    public boolean l(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}