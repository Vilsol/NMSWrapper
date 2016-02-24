package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "GenLayerZoomVoronoi")
public class NMSGenLayerZoomVoronoi extends NMSGenLayer {

    public NMSGenLayerZoomVoronoi(Object nmsObject){
        super(nmsObject);
    }

    public NMSGenLayerZoomVoronoi(long l, NMSGenLayer genLayer){
        super("GenLayerZoomVoronoi", new Object[]{long.class, NMSGenLayer.class}, new Object[]{l, genLayer});
    }

}