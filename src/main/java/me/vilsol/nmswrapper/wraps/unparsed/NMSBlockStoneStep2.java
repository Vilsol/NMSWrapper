package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockStoneStep2")
public class NMSBlockStoneStep2 extends NMSBlockDoubleStoneStepAbstract {

    public NMSBlockStoneStep2(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockStoneStep2#l()
     */
    @ReflectiveMethod(name = "l", types = {})
    public boolean l(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}