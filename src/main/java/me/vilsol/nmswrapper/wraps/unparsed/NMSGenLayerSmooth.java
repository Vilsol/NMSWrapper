package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "GenLayerSmooth")
public class NMSGenLayerSmooth extends NMSGenLayer {

    public NMSGenLayerSmooth(Object nmsObject){
        super(nmsObject);
    }

    public NMSGenLayerSmooth(long l, NMSGenLayer genLayer){
        super("GenLayerSmooth", new Object[]{long.class, NMSGenLayer.class}, new Object[]{l, genLayer});
    }

}