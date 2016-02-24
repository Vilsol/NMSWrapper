package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "GenLayerCleaner")
public class NMSGenLayerCleaner extends NMSGenLayer {

    public NMSGenLayerCleaner(Object nmsObject){
        super(nmsObject);
    }

    public NMSGenLayerCleaner(long l, NMSGenLayer genLayer){
        super("GenLayerCleaner", new Object[]{long.class, NMSGenLayer.class}, new Object[]{l, genLayer});
    }

}