package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockDataAbstract")
public class NMSBlockDataAbstract extends NMSWrap implements NMSIBlockData {

    public NMSBlockDataAbstract(Object nmsObject){
        super(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockDataAbstract#toString()
     */
    @ReflectiveMethod(name = "toString", types = {})
    public String toString(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}