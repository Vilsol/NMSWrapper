package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "GenLayerRegionHills")
public class NMSGenLayerRegionHills extends NMSGenLayer {

    public NMSGenLayerRegionHills(Object nmsObject){
        super(nmsObject);
    }

    public NMSGenLayerRegionHills(long l, NMSGenLayer genLayer, NMSGenLayer genLayer1){
        super("GenLayerRegionHills", new Object[]{long.class, NMSGenLayer.class, NMSGenLayer.class}, new Object[]{l, genLayer, genLayer1});
    }

}