package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "GenLayerDesert")
public class NMSGenLayerDesert extends NMSGenLayer {

    public NMSGenLayerDesert(Object nmsObject){
        super(nmsObject);
    }

    public NMSGenLayerDesert(long l, NMSGenLayer genLayer){
        super("GenLayerDesert", new Object[]{long.class, NMSGenLayer.class}, new Object[]{l, genLayer});
    }

}