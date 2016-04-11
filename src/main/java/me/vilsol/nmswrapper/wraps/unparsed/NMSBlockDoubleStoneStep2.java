package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockDoubleStoneStep2")
public class NMSBlockDoubleStoneStep2 extends NMSBlockDoubleStoneStepAbstract {

    public NMSBlockDoubleStoneStep2(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockDoubleStoneStep2#l()
     */
    @ReflectiveMethod(name = "l", types = {})
    public boolean l(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}