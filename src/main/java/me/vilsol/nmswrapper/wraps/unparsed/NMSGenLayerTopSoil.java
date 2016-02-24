package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "GenLayerTopSoil")
public class NMSGenLayerTopSoil extends NMSGenLayer {

    public NMSGenLayerTopSoil(Object nmsObject){
        super(nmsObject);
    }

    public NMSGenLayerTopSoil(long l, NMSGenLayer genLayer){
        super("GenLayerTopSoil", new Object[]{long.class, NMSGenLayer.class}, new Object[]{l, genLayer});
    }

}