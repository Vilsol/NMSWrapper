package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "GenLayerMushroomShore")
public class NMSGenLayerMushroomShore extends NMSGenLayer {

    public NMSGenLayerMushroomShore(Object nmsObject){
        super(nmsObject);
    }

    public NMSGenLayerMushroomShore(long l, NMSGenLayer genLayer){
        super("GenLayerMushroomShore", new Object[]{long.class, NMSGenLayer.class}, new Object[]{l, genLayer});
    }

}