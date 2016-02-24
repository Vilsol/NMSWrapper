package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

@ReflectiveClass(name = "GenLayerZoom")
public class NMSGenLayerZoom extends NMSGenLayer {

    public NMSGenLayerZoom(Object nmsObject){
        super(nmsObject);
    }

    public NMSGenLayerZoom(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    public NMSGenLayerZoom(long l, NMSGenLayer genLayer){
        super("GenLayerZoom", new Object[]{long.class, NMSGenLayer.class}, new Object[]{l, genLayer});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.GenLayerZoom#b(long, net.minecraft.server.v1_8_R3.GenLayer, int)
     */
    @ReflectiveMethod(name = "b", types = {long.class, NMSGenLayer.class, int.class})
    public NMSGenLayer b(long l, NMSGenLayer genLayer, int i){
        return new NMSGenLayer(NMSWrapper.getInstance().exec(nmsObject, l, genLayer, i));
    }

}