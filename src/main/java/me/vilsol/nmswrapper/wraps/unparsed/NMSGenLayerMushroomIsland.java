package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "GenLayerMushroomIsland")
public class NMSGenLayerMushroomIsland extends NMSGenLayer {

    public NMSGenLayerMushroomIsland(Object nmsObject){
        super(nmsObject);
    }

    public NMSGenLayerMushroomIsland(long l, NMSGenLayer genLayer){
        super("GenLayerMushroomIsland", new Object[]{long.class, NMSGenLayer.class}, new Object[]{l, genLayer});
    }

}