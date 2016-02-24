package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "RegistryDefault")
public class NMSRegistryDefault extends NMSWrap {

    public NMSRegistryDefault(Object nmsObject){
        super(nmsObject);
    }

    public NMSRegistryDefault(V v){
        super("RegistryDefault", new Object[]{V.class}, new Object[]{v});
    }

    /**
     * @see net.minecraft.server.v1_8_R3.RegistryDefault#get(K)
     */
    @ReflectiveMethod(name = "get", types = {K.class})
    public V get(K k){
        return new V(NMSWrapper.getInstance().exec(nmsObject, k));
    }

}