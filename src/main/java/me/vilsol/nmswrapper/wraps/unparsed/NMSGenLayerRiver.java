package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "GenLayerRiver")
public class NMSGenLayerRiver extends NMSGenLayer {

    public NMSGenLayerRiver(Object nmsObject){
        super(nmsObject);
    }

    public NMSGenLayerRiver(long l, NMSGenLayer genLayer){
        super("GenLayerRiver", new Object[]{long.class, NMSGenLayer.class}, new Object[]{l, genLayer});
    }

}