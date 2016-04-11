package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "RegistryDefault")
public class NMSRegistryDefault extends NMSWrap {

    public NMSRegistryDefault(Object nmsObject){
        super(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.RegistryDefault#get(Object)
     */
    @ReflectiveMethod(name = "get", types = {Object.class})
    public Object get(Object k){
        return NMSWrapper.getInstance().exec(nmsObject, k);
    }

}