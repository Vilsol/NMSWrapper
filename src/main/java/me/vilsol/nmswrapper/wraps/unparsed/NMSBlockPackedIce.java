package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockPackedIce")
public class NMSBlockPackedIce extends NMSBlock {

    public NMSBlockPackedIce(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockPackedIce#a(java.util.Random)
     */
    @ReflectiveMethod(name = "a", types = {Random.class})
    public int a(Random random){
        return (int) NMSWrapper.getInstance().exec(nmsObject, random);
    }

}