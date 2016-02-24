package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "LayerIsland")
public class NMSLayerIsland extends NMSGenLayer {

    public NMSLayerIsland(Object nmsObject){
        super(nmsObject);
    }

    public NMSLayerIsland(long l){
        super("LayerIsland", new Object[]{long.class}, new Object[]{l});
    }

}