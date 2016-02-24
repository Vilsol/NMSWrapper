package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockYellowFlowers")
public class NMSBlockYellowFlowers extends NMSBlockFlowers {

    public NMSBlockYellowFlowers(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockYellowFlowers#l()
     */
    @ReflectiveMethod(name = "l", types = {})
    public NMSEnumFlowerType l(){
        return new NMSEnumFlowerType(NMSWrapper.getInstance().exec(nmsObject));
    }

}