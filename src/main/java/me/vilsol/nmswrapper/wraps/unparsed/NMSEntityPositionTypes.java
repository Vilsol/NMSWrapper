package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityPositionTypes")
public class NMSEntityPositionTypes extends NMSWrap {

    public NMSEntityPositionTypes(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityPositionTypes#a(java.lang.Class)
     */
    @ReflectiveMethod(name = "a", types = {Class.class})
    public NMSEnumEntityPositionType a(Class c){
        return new NMSEnumEntityPositionType(NMSWrapper.getInstance().exec(nmsObject, c));
    }

}