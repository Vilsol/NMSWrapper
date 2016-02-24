package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "GenLayerBiome")
public class NMSGenLayerBiome extends NMSGenLayer {

    public NMSGenLayerBiome(Object nmsObject){
        super(nmsObject);
    }

    public NMSGenLayerBiome(long l, NMSGenLayer genLayer, NMSWorldType worldType, String s){
        super("GenLayerBiome", new Object[]{long.class, NMSGenLayer.class, NMSWorldType.class, String.class}, new Object[]{l, genLayer, worldType, s});
    }

}