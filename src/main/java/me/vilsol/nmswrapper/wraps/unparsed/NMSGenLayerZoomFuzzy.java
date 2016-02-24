package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "GenLayerZoomFuzzy")
public class NMSGenLayerZoomFuzzy extends NMSGenLayerZoom {

    public NMSGenLayerZoomFuzzy(Object nmsObject){
        super(nmsObject);
    }

    public NMSGenLayerZoomFuzzy(long l, NMSGenLayer genLayer){
        super("GenLayerZoomFuzzy", new Object[]{long.class, NMSGenLayer.class}, new Object[]{l, genLayer});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.GenLayerZoomFuzzy#b(int, int, int, int)
     */
    @ReflectiveMethod(name = "b", types = {int.class, int.class, int.class, int.class})
    public int b(int i, int i1, int i2, int i3){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i, i1, i2, i3);
    }

}