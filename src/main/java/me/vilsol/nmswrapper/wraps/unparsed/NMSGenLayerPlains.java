package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "GenLayerPlains")
public class NMSGenLayerPlains extends NMSGenLayer {

    public NMSGenLayerPlains(Object nmsObject){
        super(nmsObject);
    }

    public NMSGenLayerPlains(long l, NMSGenLayer genLayer){
        super("GenLayerPlains", new Object[]{long.class, NMSGenLayer.class}, new Object[]{l, genLayer});
    }

}