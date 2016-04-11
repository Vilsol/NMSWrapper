package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "WorldChunkManagerHell")
public class NMSWorldChunkManagerHell extends NMSWorldChunkManager {

    public NMSWorldChunkManagerHell(Object nmsObject){
        super(nmsObject);
    }

    public NMSWorldChunkManagerHell(NMSBiomeBase biomeBase, float f){
        super("WorldChunkManagerHell", new Object[]{NMSBiomeBase.class, float.class}, new Object[]{biomeBase, f});
    }

    /**
     * @see net.minecraft.server.v1_9_R1.WorldChunkManagerHell#getBiome(net.minecraft.server.v1_9_R1.BlockPosition)
     */
    @ReflectiveMethod(name = "getBiome", types = {NMSBlockPosition.class})
    public NMSBiomeBase getBiome(NMSBlockPosition blockPosition){
        return new NMSBiomeBase(NMSWrapper.getInstance().exec(nmsObject, blockPosition));
    }

}