package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "GenLayerIsland")
public class NMSGenLayerIsland extends NMSGenLayer {

    public NMSGenLayerIsland(Object nmsObject){
        super(nmsObject);
    }

    public NMSGenLayerIsland(long l, NMSGenLayer genLayer){
        super("GenLayerIsland", new Object[]{long.class, NMSGenLayer.class}, new Object[]{l, genLayer});
    }

}