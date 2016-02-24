package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "GenLayerIcePlains")
public class NMSGenLayerIcePlains extends NMSGenLayer {

    public NMSGenLayerIcePlains(Object nmsObject){
        super(nmsObject);
    }

    public NMSGenLayerIcePlains(long l, NMSGenLayer genLayer){
        super("GenLayerIcePlains", new Object[]{long.class, NMSGenLayer.class}, new Object[]{l, genLayer});
    }

}