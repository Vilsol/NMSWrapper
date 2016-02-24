package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "GenLayerSpecial")
public class NMSGenLayerSpecial extends NMSGenLayer {

    public NMSGenLayerSpecial(Object nmsObject){
        super(nmsObject);
    }

    public NMSGenLayerSpecial(long l, NMSGenLayer genLayer, NMSEnumGenLayerSpecial enumGenLayerSpecial){
        super("GenLayerSpecial", new Object[]{long.class, NMSGenLayer.class, NMSEnumGenLayerSpecial.class}, new Object[]{l, genLayer, enumGenLayerSpecial});
    }

}