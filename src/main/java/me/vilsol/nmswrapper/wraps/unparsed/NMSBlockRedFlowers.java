package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockRedFlowers")
public class NMSBlockRedFlowers extends NMSBlockFlowers {

    public NMSBlockRedFlowers(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockRedFlowers#l()
     */
    @ReflectiveMethod(name = "l", types = {})
    public NMSEnumFlowerType l(){
        return new NMSEnumFlowerType(NMSWrapper.getInstance().exec(nmsObject));
    }

}