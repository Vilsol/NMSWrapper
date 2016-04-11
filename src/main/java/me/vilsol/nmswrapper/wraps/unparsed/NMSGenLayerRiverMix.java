package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "GenLayerRiverMix")
public class NMSGenLayerRiverMix extends NMSGenLayer {

    public NMSGenLayerRiverMix(Object nmsObject){
        super(nmsObject);
    }

    public NMSGenLayerRiverMix(long l, NMSGenLayer genLayer, NMSGenLayer genLayer1){
        super("GenLayerRiverMix", new Object[]{long.class, NMSGenLayer.class, NMSGenLayer.class}, new Object[]{l, genLayer, genLayer1});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.GenLayerRiverMix#a(long)
     */
    @ReflectiveMethod(name = "a", types = {long.class})
    public void a(long l){
        NMSWrapper.getInstance().exec(nmsObject, l);
    }

}