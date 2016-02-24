package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "GenLayerDeepOcean")
public class NMSGenLayerDeepOcean extends NMSGenLayer {

    public NMSGenLayerDeepOcean(Object nmsObject){
        super(nmsObject);
    }

    public NMSGenLayerDeepOcean(long l, NMSGenLayer genLayer){
        super("GenLayerDeepOcean", new Object[]{long.class, NMSGenLayer.class}, new Object[]{l, genLayer});
    }

}